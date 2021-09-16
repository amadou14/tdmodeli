
package ama;
public class Dictionary {
	public String name;

	public Dictionary(String name){
		this.name = name;
		}


	public String getName(){

		return name;

	}
	public  boolean isEmpty(){
		if( this.getName()== null){
			return  true ;
		}else{
			return false;
		}

	}
}


