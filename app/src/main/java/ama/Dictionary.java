public class Dictionary {
	public String name;
	public Dictionary(String name){
		this.name = name;
		}
    public String getName(String name){
    	return name;
    	}

    	public boolean isEmpty(){
    		return true;
     }
    public String getTraduction (String ele){
    	if(ele.equals("contre")){
    		return "against";
    	}else{
    		return "pour";
    	}
    }
} 
