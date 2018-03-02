package ast;

public class WhileStmt extends Node {
	String op;
	
	public WhileStmt(int p, String op) {
		super(p);
		this.op=op;
	}
	
	@Override
	public String toString() {
		return "DeclRefExpr [op=\" + op + \"]";
	}
	public String codeGen(Code c) {
		System.out.println("IfStmt -codegen");
		String reg = c.getRegister();
		c.code += "ldr "+reg;
		return reg;
       
	}

	public Variable eval(Context c) {
		//	System.out.println("Binaryoperator -eval");
		Variable right = null;
		
	        if (childern.size()!=2)
	        	System.out.println("need to operands for "+op);
	        Variable condition=childern.get(0).eval(c);
	        
	        while(true) {
	        	if(condition.val == 0) {
	        		 right = childern.get(1).eval(c);
	        		 break;
	        	}
	        	//return right;
	        }
			return right;
	}
	
}
