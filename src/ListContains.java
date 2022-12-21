
public class ListContains extends ListExp {
	Expression exp;

	public ListContains(Expression exp) {
		super();
		this.exp = exp;
	}
	
	public ValEnv evaluate(Env env) {
		
		boolean bool = list.contains(exp);
		return new ValEnv(bool, env);
	}

}
