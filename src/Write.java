
public class Write extends Statement {

	Expression exp;
	
	public Write(Expression i) {
		this.exp = i;
	}
	
	@Override
	public ValEnv evaluate(Env env) {
		System.out.println(exp.evaluate(env).val);
		return new ValEnv(env);
	}

}
