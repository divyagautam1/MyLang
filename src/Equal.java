
public class Equal extends Binary {

	public Equal(Expression l, Expression r) {
		super(l, r);
	}

	@Override
	public ValEnv evaluate(Env env) {
		ValEnv ve1 =  left.evaluate(env);
		ValEnv ve2 =  right.evaluate(env);

		return new ValEnv(ve1.val == ve2.val, env);
	}
	
	public String toString() {
		return "(" + left + "==" + right + ")";
	}

}
