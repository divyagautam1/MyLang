
public class FunctionCallExpression extends Expression implements FunctionCall{

	public String id;
	public Parameter parameters;
	public Object returnVal;
	
	
	
	public FunctionCallExpression(String id, Parameter p) {
		super();
		this.id = id;
		this.parameters = p;
	}



	@Override
	public ValEnv evaluate(Env env) {
		FunctionDeclaration funcCall = env.getFunction(id);
		
		if(funcCall == null) {
			try {
				throw new Exception("Function Declaration not found" + id);
			}
			catch(Exception e) {
				e.printStackTrace();
			}
		}
		
		Env functionEnv = new Env(env); //new env
		
		FormalParameter fp = funcCall.params;
		Parameter p = parameters;
		
		while(fp != null) {
			ValEnv ve = p.exp.evaluate(env);
			functionEnv.addNew(fp.i, ve.val);
			fp = fp.next;
			p = p.nextParam;
		}
		
		Env.callStack.push(this);
		funcCall.stm.evaluate(functionEnv);
		Env.callStack.pop();
		
		return new ValEnv(returnVal, env);
		
	}


	@Override
	public void setReturnValue(Object exp) {
		returnVal = exp;
	}
}
