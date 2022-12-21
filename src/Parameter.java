
public class Parameter {
	public Expression exp;
	public Parameter nextParam;
	
	public Parameter(Expression exp) {
		this.exp = exp;
	}
	
	public String toString() {
		String p = exp.toString();
		
		if(p != null) {
			p += "," + nextParam;
		}
		
		return p;
	}
}
