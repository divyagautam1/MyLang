
public class WhileLoop extends Statement {

	Expression cond;
	Statement stm;



	public WhileLoop(Expression cond, Statement stm) {
		super();
		this.cond = cond;
		this.stm = stm;
	}



	@Override
	public ValEnv evaluate(Env env) {
		
		ValEnv ve = cond.evaluate(env);
		Boolean b = (Boolean) ve.val;

		while(b) {
			Env newEnv = new Env(env);
			stm.evaluate(newEnv);
			ValEnv ve2 = cond.evaluate(newEnv);
			b = (Boolean) ve2.val;
		}
		
		if(next != null) {
			next.evaluate(env);
			return new ValEnv(env);
		}

		return new ValEnv(env);
	}
	
	public String toString()
	{
		String str = "while" + "(" + cond + ")\n{\n" + stm + "}";
		
		if (next != null)
			str += next;
		return str;
	}

}
