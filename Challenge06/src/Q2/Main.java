package Q2;


class Counter{
	static int count;
	int instatnceNum;
	
	Counter(){
		count+=1;
		instatnceNum+=1;
	}
	
	void disp() {
		System.out.println(count);
		//it will increase how many object you create.because, it is shared variable for all obj
		System.out.println(instatnceNum);
		//instanceNum =1 . because this variable not shared for all obj
	}
}

public class Main {

	public static void main(String[] args) {
		
		Counter c1=new Counter();
		c1.disp();
		
		Counter c2=new Counter(); 
		c2.disp();
		c1.disp();
		
		

	}

}
