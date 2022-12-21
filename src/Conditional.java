
public class Conditional extends Statement {
	
	public Expression cond;
	public Statement thenStm;
	public Statement elseStm;
	
	

	public Conditional(Expression cond, Statement thenStm, Statement elseStm) {
		super();
		this.cond = cond;
		this.thenStm = thenStm;
		this.elseStm = elseStm;
	}



	@Override
	public ValEnv evaluate(Env env) {
		ValEnv ve = cond.evaluate(env);
		
		Boolean i_f = (Boolean) ve.val;
		
		Env newEnv;
		
		if(i_f) {
			newEnv = new Env(env);
			thenStm.evaluate(newEnv);
		}
		else {
			newEnv = new Env(env);
			elseStm.evaluate(newEnv);
		}
		
		if(next != null) {
			next.evaluate(env);
		}
		
		return new ValEnv(null, env);
	}
	
	public String toString()
	{
		String str = "if" + "(" + cond + ")\n" + thenStm + "else\n" + elseStm;
		
		if (next != null)
			str += next;
		return str;
	}

}
