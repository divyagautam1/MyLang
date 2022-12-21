
public class FunctionDeclaration extends Statement {
	
	public String id;
	public FormalParameter params;
	public Statement stm;
	
	

	public FunctionDeclaration(String id, FormalParameter params, Statement stm) {
		super();
		this.id = id;
		this.params = params;
		this.stm = stm;
	}



	@Override
	public ValEnv evaluate(Env env) {
		env.addFunction(this);
		
		if(next != null) {
			ValEnv ve = next.evaluate(env);
			return new ValEnv(ve.val, ve.env);
		}
		
		return new ValEnv(env);
	}
	
	public String toString() {
		String func = "func " + id + "(" + params + ")\n{\n" + stm + "\n}\n";
		if(next != null) {
			func += next;
		}
		return func;
	}

}
