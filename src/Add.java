
public class Add extends Binary {

	public Add(Expression a, Expression b) {
		super(a, b);
	}

	@Override
	public ValEnv evaluate(Env env) {
		ValEnv ve1  =  left.evaluate(env);
		ValEnv ve2 =  right.evaluate(env);
		Integer i = (Integer) ve1.val;
		Integer j = (Integer) ve2.val;
		
		return new ValEnv(i + j, env);
	}
	
	public String toString() {
		return "(" + left + "+" + right + ")";
	}

}
