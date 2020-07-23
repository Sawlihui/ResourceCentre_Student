import java.util.ArrayList;

public class Stringstack {
    private ArrayList<String> myList = new ArrayList<String>();
	public boolean isEmpty() {
		// TODO Auto-generated method stub
		return myList.isEmpty();
	}
	public void push(String s) {
		// TODO Auto-generated method stub
		if(s!=null) {
		myList.add(s);
		}
	}
	public void clear() {
		// TODO Auto-generated method stub
		myList.clear();
		
	}

}
