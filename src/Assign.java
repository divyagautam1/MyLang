
public class Assign extends Statement {
	
	String id;
	Expression exp;

	
	
	public Assign(String id, Expression exp) {
		this.id = id;
		this.exp = exp;
	}

	@Override
	public ValEnv evaluate(Env env) {
		ValEnv ve = exp.evaluate(env);
		
		ve.env.assign(id, ve.val);
		
		return new ValEnv(null, env);
	}
	
	public String toString() {
		String str = id + ":=" + exp + ";\n";
		
		if(next != null) {
			str += next;
		}
		return str;
	}
}
