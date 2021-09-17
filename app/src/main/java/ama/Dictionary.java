
package ama;

import java.util.HashMap;
import java.util.List;

public class Dictionary {

	public String name;
	private HashMap<String, List<String>> translations = new HashMap<>();


	public Dictionary(String name){
		this.name = name;
		}


	public String getName(){

		return name;

	}
	public List<String> getTranslation(String elem){
		return this.translations.get(elem);
	}
	public List<String> addTranslation(String firstElem, List<String>ele_lis){
		return this.translations.put(firstElem,ele_lis);
	}



	public boolean isEmpty(){
		if(this.translations.size() == 0){
			return true;
		}

		return false;
	}

	public void addTranslationNew(String ele1, String ele2) {
	}
}


