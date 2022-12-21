
public class FormalParameter {
	public String i;
	public FormalParameter next;

	public FormalParameter(String image) {
		this.i = image;
	}
	
	public String toString() {
		String a = i.toString();
		
		if(next != null) {
			a += "," + next;
		}
		
		return a;
	}

}

