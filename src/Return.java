
public class Return extends Statement {
	
	private Expression exp;
	
	

	public Return(Expression exp) {
		this.exp = exp;
	}



	@Override
	public ValEnv evaluate(Env env) {
		FunctionCall f = Env.callStack.peek();
		ValEnv ve = exp.evaluate(env);
		f.setReturnValue(ve.val);
		return new ValEnv(null);
	}
	 
	public String toString() {
		
		String str = "return " + exp;
		
		if(next != null) {
			str += next;
		}
		
		return str;
	}

}
