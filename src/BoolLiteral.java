
public class BoolLiteral extends Expression {
	
	public boolean value;

	public BoolLiteral(boolean value) {
		this.value = value;
	}

	@Override
	public ValEnv evaluate(Env env) {
		return new ValEnv(value, env);
	}
	
	public String toString() {
		return "" + value;
	}
}
