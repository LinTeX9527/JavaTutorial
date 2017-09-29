package test;

/**
 * 相当于 C 语言中的函数实现，这是一种实现方法，也可以有其他的实现方法
 * @author LinTeX9527
 *
 */
public class Dog implements AnimalAction {

	@Override
	public void eat() {
		System.out.println("dog eat...");
	}

	@Override
	public void run() {
		System.out.println("dog run with 4 legs...");
	}

	@Override
	public void sleep() {
		System.out.println("dog sleep zzz...");
	}

}
