
public class simpleActions {
	private int num, num2;
	
	simpleActions(int num, int num2){
		this.num = num;
		this.num2 = num2;
	}
	
	public int add(int num, int num2){
		int result = num + num2;
		return result;
	}
	
	public int subtract(int num, int num2){
		int result = num - num2;
		return result;
	}
	
	public int multiply(int num, int num2){
		int result = num * num2;
		return result;
	}
	
	public int divide(int num, int num2){
		int result = num / num2;
		return result;
	}
}
