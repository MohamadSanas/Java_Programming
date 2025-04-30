package challange06_1;

public class Counter {
	public static int count;
	public int instanceNum;
	
	Counter(){
		count+=1;
		instanceNum+=3;
		
	}
	
	void display() {
		System.out.println(count+" "+instanceNum);
		//System.out.println(instanceNum);
	}

}
