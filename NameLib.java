import java.util.*;
public class NameLib{
	HashMap<String,String> names = new HashMap<String,String>();
	
	public NameLib(){
		
	}
	
	public void addName(String id, String name){
		names.put(id,name);
	}
	
	public String getName(String id){
		return names.get(id);
	}
	
	
}