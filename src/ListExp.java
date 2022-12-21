import java.util.ArrayList;

public class ListExp extends Expression {
	protected ArrayList<Expression> list; 
	
	public ListExp() {
		super();
		list = new ArrayList<>();
	}
	
	public void addExp(Expression exp) {
		list.add(exp);
	}
	
	@Override
	public ValEnv evaluate(Env env) {
		
		ArrayList<Object> nlist = new ArrayList<Object>();
			
		if(list.isEmpty()) {
			return new ValEnv(nlist, env);
		}
				
		for(Expression curExp : list) {
			ValEnv ve = curExp.evaluate(env);
			Integer i = (Integer) ve.val;
			nlist.add(i);
			 
		}
		
		return new ValEnv(nlist, env);
	}
}
