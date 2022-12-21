
public class Not extends Unary {
	
	public Not(Expression p) {
		param = p;
	}

	@Override
	public ValEnv evaluate(Env env) {
		ValEnv ve =  param.evaluate(env);
		Boolean l = (Boolean) ve.val;
		return new ValEnv((! l), env);
	}
	
	public String toString() {
		return "!(" + param + ")";
	}

}
