
public class Declaration extends Statement {
	
	String id;
	Expression value;
	
	public Declaration(String image, Expression val) {
		super();
		this.id = image;
		this.value = val;
	}

	@Override
	public ValEnv evaluate(Env env) {
		ValEnv ve = value.evaluate(env);
		ve.env.addNew(id, ve.val);

		if(next != null) {
			next.evaluate(env);
			return new ValEnv(null, env);
		}
		return new ValEnv(null, env);
	}
	
	public String toString() {
		String dec = "variable " + id + ":= " + value + ";\n";
		
		if(next != null) {
			dec += next;
		}
		return dec;
	}

}
