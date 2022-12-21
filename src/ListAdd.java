
public class ListAdd extends Statement {
	
	Expression exp;
	ListExp list = new ListExp();
	public ListAdd(Expression exp) { 
		super();
		this.exp = exp;
	}
	
	 public ValEnv evaluate(Env env) {		 
		 list.addExp(exp);
		return new ValEnv(0, env);
	}
}
