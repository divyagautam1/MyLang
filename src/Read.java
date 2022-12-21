import java.util.Scanner;

public class Read extends Expression {
	
	public static Scanner in = new Scanner(System.in);
	int i;
	
	
	@Override
	public ValEnv evaluate(Env env) {
		String nextLine = in.nextLine();
		try {
			this.i = Integer.parseInt(nextLine);
		}
		catch(NumberFormatException e) {
			System.err.print("read expects type <integer>, given: " + nextLine + "\n");
			System.exit(13);
		}
		return new ValEnv(i, env);
	}
}
