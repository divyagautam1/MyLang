
public class IntLiteral extends Expression {
	
	public int val;
	
	public IntLiteral(int val) {
		this.val = val;
	}

	@Override
	public ValEnv evaluate(Env env) {
		
		return new ValEnv(val, env);
	}
	
	public String toString() {
		return "" + val;
	}

}
