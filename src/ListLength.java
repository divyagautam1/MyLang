import java.util.ArrayList;

public class ListLength extends ListExp {
	
	Expression lst;
	
	public ListLength(Expression lst) {
		super();
		this.lst = lst;
	}
	

	@Override
	public ValEnv evaluate(Env env) {
		
		ArrayList<Object> nlist = new ArrayList<Object>();
		
		if(nlist.isEmpty()) {
			return new ValEnv(0, env);
		}
				
		for(Expression curExp : list) {
			ValEnv ve = curExp.evaluate(env);
			Integer i = (Integer) ve.val;
			nlist.add(i);
			 
		}
		
		return new ValEnv(5, env);
	}
}
