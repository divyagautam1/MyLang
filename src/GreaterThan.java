
public class GreaterThan extends Binary {

	public GreaterThan(Expression a, Expression b) {
		super(a, b);
	}

	@Override
	public ValEnv evaluate(Env env) {
		ValEnv ve1 =  left.evaluate(env);
		ValEnv ve2 = right.evaluate(env);
		
		int a = (Integer) ve1.val;
		int b = (Integer) ve2.val;
		return new ValEnv(a > b, env);
	}
	
	public String toString() {
		return "(" + left + ">" + "right" + ")";
	}

}
