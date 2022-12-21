
public class EmptyStm extends Statement {

	@Override
	public ValEnv evaluate(Env env) {
		if(next != null) {
			//next.evaluate(env);
			return new ValEnv(next.evaluate(env).val, env);
		}
		return new ValEnv(null, env);
	}
	
	public String toString() {
		String em = "n;\n";
		
		if(next != null) {
			em += next;
		}
		
		return em;
	}

}
