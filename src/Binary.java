
public abstract class Binary extends Operator {

	protected Expression left;
	protected Expression right;
	
	public Binary(Expression left, Expression right) {
		this.left = left;
		this.right = right;
	}
}
