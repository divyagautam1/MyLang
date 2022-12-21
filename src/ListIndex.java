
public class ListIndex extends ListExp{

	Expression idxNum;

	public ListIndex(Expression idxNum) {
		super();
		this.idxNum = idxNum;
	}

	@Override
	public ValEnv evaluate(Env env) {
		//FunctionCall f = Env.callStack.peek();
		ValEnv ve = idxNum.evaluate(env);
		Expression num = null;
	//	ValEnv ve = idxNum.evaluate(env);
		Integer idx = (Integer) ve.val;
		
		
		for(idx = 0; idx < list.size(); idx++) {
			 num = list.get(idx);
		}

		return new ValEnv(num, env);
	}
}
