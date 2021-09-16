import java.util.ArrayList;
import java.util.HashMap;


public class Dictionary {
	public String name;
    Map<String,list<String>>translations = new HashMap<>();
	public Dictionary(String name){
		this.name = name;
		}
    public String getName(String name){
    	return name;
    	}

    public  List<String> getTranslation(String ele){
        return this.translations.get(ele)
    	
    }
    public void addTranslation(String firstEle,List<String>ele_list){
        return this.translations.put(firstEle,ele_list);
    }

    public  boolean isEmpty(){
        if(this.translations.size() == 0){
            return true;
        }
        return false;

    }
} 
