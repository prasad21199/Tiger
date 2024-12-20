package basics;

public class Demo {
public void demo() {
	try {
		demoA();
	} catch (InterruptedException e) {
	}
}
public void demoA() throws InterruptedException {
	Thread.sleep(2000);
}
public static void main(String[] args) {
	Demo a=new Demo();
	a.demo();
}
}
