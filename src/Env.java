import java.util.HashMap;
import java.util.Stack;

public class Env {
	
	HashMap<String, Object> data = new HashMap<>();
	HashMap<String, FunctionDeclaration> functions = new HashMap<>();

	public static Stack<FunctionCall> callStack = new Stack<>();	
	
	Env parent;
	
	public Env() {
		
	}
	
	public Env(Env parent) {
		this.parent = parent;
	}
	
	public Object value(String id) {
		if(parent == null) {
			return data.get(id);
		}
		
		if(data.containsKey(id)) {
			return data.get(id);
		}
		
		return parent.value(id);
	}
	
	public void addNew(String id, Object l) {
		if(data.containsKey(id)) {
			return;
		}
		
		data.put(id, l);
	}
	
	public void assign(String id, Object l) {
		if(data.containsKey(id)) {
			data.put(id, l);
			return;
		}
		
		if(parent != null) {
			parent.assign(id, l);
			return;
		}
		
		return;
	}
	
	public void addFunction (FunctionDeclaration funcDec) {
		if(functions.containsKey(funcDec.id)) {
			return;
		}
		
		functions.put(funcDec.id, funcDec);
	}
	
	public FunctionDeclaration getFunction(String idf) {
		if(parent == null) {
			return functions.get(idf);
		}
		
		if(data.containsKey(idf)) {
			return functions.get(idf);
		}
		
		return parent.getFunction(idf);
	}
}
