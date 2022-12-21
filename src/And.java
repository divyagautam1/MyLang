
public class And extends Binary {

	public And(Expression a, Expression b) {
		super(a, b);
	}

	@Override
	public ValEnv evaluate(Env env) {
		ValEnv ve1 =  left.evaluate(env);
		ValEnv ve2 = right.evaluate(env);
		
		Boolean a = (Boolean) ve1.val;
		Boolean b = (Boolean) ve2.val;
		return new ValEnv(a == true && b == true, env);
	}
	
	public String toString() {
		return "(" + left + "&&" + right + ")";
	}

}
