
public class NotEqual extends Binary {

	public NotEqual(Expression a, Expression b) {
		super(a, b);
	}

	@Override
	public ValEnv evaluate(Env env) {
		ValEnv ve1 =  left.evaluate(env);
		ValEnv ve2 =  right.evaluate(env);
		
		int a = (int) ve1.val;
		int b = (int) ve2.val;
		return new ValEnv(a != b, env);
	}
	
	public String toString() {
		return "(" + left + "!=" + right + ")";
	}

}
