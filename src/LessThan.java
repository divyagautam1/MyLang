
public class LessThan extends Binary {

	public LessThan(Expression a, Expression b) {
		super(a, b);
	}

	@Override
	public ValEnv evaluate(Env env) {
		ValEnv ve1 = left.evaluate(env);
		ValEnv ve2 = right.evaluate(env);
		
		Integer a = (Integer) ve1.val;
		Integer b = (Integer) ve2.val;
		
		return new ValEnv(a < b, env);
	}
	
	public String toString() {
		return "(" + left + "<" + right + ")";
	}

}
