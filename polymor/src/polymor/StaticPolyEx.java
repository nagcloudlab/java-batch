package polymor;



class Actor{
	public void act(int a) {
		System.out.println("Hero Acting..");
	}
	public void act(int a,int b) {
		System.out.println("Villain Acting..");
	}
}

public class StaticPolyEx {
	
	public static void main(String[] args) {
		
		Actor actor=new Actor();
		actor.act(12);
		actor.act(12,12);
		
		System.out.println(1);
		System.out.println(1.1);
		System.out.println("string");
		System.out.println(true);
		
		String s="hsbc";
		System.out.println(s.substring(1));
		System.out.println(s.substring(1,2));
		
	}

}
