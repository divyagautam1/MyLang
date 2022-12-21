
public class StrLiteral extends Expression {
	
	String str;
	
	public StrLiteral(String str) {
		this.str = str;
	}

	@Override
	public ValEnv evaluate(Env env) {
		return new ValEnv(str, env);
	}
	
	public String toString() {
		return str;
	}
}
