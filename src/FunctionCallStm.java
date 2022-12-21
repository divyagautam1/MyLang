
public class FunctionCallStm extends Statement implements FunctionCall {

	private FunctionCallExpression fce;
	
	public FunctionCallStm(String id, Parameter p) {
		fce = new FunctionCallExpression(id, p);
	}

	@Override
	public ValEnv evaluate(Env env) {
		
		ValEnv ve = fce.evaluate(env);
		
		if(next != null) {	
			next.evaluate(env);
		}
		
		return new ValEnv(ve.val, ve.env);
	}

	@Override
	public void setReturnValue(Object exp) {		
	}
	
	public String toString() {
		return fce.id + "(" + fce.parameters + ")\n";
	}

}
