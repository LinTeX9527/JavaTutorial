package ch01;

/**
 * 类单实例的实现方法：
 * 用类的方法（例如 getInstance()）返回一个实例（(例如 single)），
 * 那么这个类的方法必须是 public static 修饰的。 
 * 而这个类实例，则必须是 static 修饰的。
 * */
class SingletonABC{
	// 这里的类单实例必须是 static 类型的。
	private static SingletonABC single = new SingletonABC();
	
	private static String state = null;
	
	// 必须要有这个无参数的私有的构造函数
	private SingletonABC(){}
	
	
	public static SingletonABC getInstance(){
		return single;
	}
	
	protected static void demoMethod(){
		System.out.println("demoMethod for singleton");
	}


	public static String getState() {
		return state;
	}


	public static void setState(String state) {
		SingletonABC.state = state;
	}
	
	
}

public class SingletonTest {

	public static void main(String[] args) {
		SingletonABC tmp = SingletonABC.getInstance(); //
		tmp.demoMethod();
		tmp.setState("haha");
		System.out.println(tmp.getState());
		
		SingletonABC tmp2 = SingletonABC.getInstance();
		tmp2.demoMethod();
		tmp2.setState("yohoo");
		System.out.println(tmp2.getState());
		
		if (tmp.equals(tmp2)){
			System.out.println("只有一个单实例");
		} else {
			System.out.println("有2个实例");
		}
	}

}
