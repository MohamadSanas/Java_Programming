package Static;

public class Main {
	public static int volume=0;
	
	public int level=0;
	
	void increaseVol() {
		volume+=5;
		level+=2;
	}

	public static void main(String[] args) {
		Main obj1 = new Main();
		obj1.increaseVol();
		System.out.println(volume+" "+obj1.level);
		
		Main obj2 = new Main();
		obj2.increaseVol();
		System.out.println(volume+" "+obj2.level);
	}

}
