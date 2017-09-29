package test;

/**
 * 接口的使用方法：
 * 1、定义一个接口，例如这里的 AnimalAction；
 * 2、自定义类具实现这个接口，例如这里 Dog, Cat 采用两种不同的方法来实现这个类；
 * 3、调用接口，直接定义接口对象，但是采用具体类的实现，例如：
 * 		AnimalAction a = new Dog();
 * 		AnimalAction b = new Cat();
 * 这里的 a,b 都是接口类型，但是因为 Dog, Cat 都是实现了接口 AnimalAction的类，所以都可以这么用。
 * 
 * @author LinTeX9527
 *
 */
public class InterfaceTest {

	public static void main(String[] args) {

		testcase01();
	}
	
	
	public static void testcase01() {
		
		// 函数调用的地方，a, b 采用相同的调用方法，但是实现却不同。
		AnimalAction a = new Dog();
		a.eat();
		a.run();
		
		AnimalAction b = new Cat();
		b.eat();
		b.run();
	}

}
