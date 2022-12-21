
public class UnaryExp extends Expression {
	Expression operand1;
	
	public UnaryExp(Expression operand1) {
		super();
		this.operand1 = operand1;	
	}

	@Override
	public ValEnv evaluate(Env env) {
		ValEnv ve =  operand1.evaluate(env);
		IntLiteral i1 = (IntLiteral) ve.val;
		int i = i1.val;
		
		return new ValEnv(-(i), env);
	}
}
