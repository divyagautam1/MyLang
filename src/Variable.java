
public class Variable extends Expression {
	
	String id;
	

	public Variable(String id) {
		this.id = id;
	}

	@Override
	public ValEnv evaluate(Env env) {
		return new ValEnv(env.value(id), env);
	}

	public String toString() {
		return ""+ id;
	}
}
