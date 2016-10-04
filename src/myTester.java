
public class myTester extends Tester implements iTester {

	public int width;
	public int height = 6;
	
	public int weight = 7;
	
	public myTester() {
		// TODO Auto-generated constructor stub
	}
	
	
	public void runThisTest(){
		System.out.println("this should depend on object creation type");
	}
	
	public int lspTest(int width)
	{
		if(weight>5){
		int result = width*height;
		return result;
		}
		else{
			int result = 1;
		return result;
		}
	};
	
	
	public void connectionTest (){
		System.out.println("the connection is working");
	}

}
