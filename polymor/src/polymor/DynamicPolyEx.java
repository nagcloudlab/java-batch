package polymor;

abstract class LT{
	abstract void work();
}
class H extends LT{
	@Override
	void work() {
		System.out.println("H-work()");
	}
}
class A extends LT{
	@Override
	void work() {
		System.out.println("A-work()");
	}
}

class God{
	public void manageLT(LT lt) {
		lt.work();
	}
}

public class DynamicPolyEx {
	
	public static void main(String[] args) {
		
		God god=new God();
		god.manageLT(new H());
		god.manageLT(new A());
	}

}
