package ch01;

/**
 * Java 中的枚举数据类型
 * */
class FreshJuice {
	private String name = null;
	
	// 定义枚举数据类型
	// 定一个一个枚举类型的变量
	enum FreshJuiceSize {SMALL, MEDIUM, LARGE};
	private FreshJuiceSize size;
	
	public FreshJuice(String name) {
		super();
		this.name = name;
	}

	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public FreshJuiceSize getSize() {
		return size;
	}

	public void setSize(FreshJuiceSize size) {
		this.size = size;
	}
	
	
}

public class FreshJuiceTest {

	public static void main(String[] args) {
		FreshJuice juice = new FreshJuice("🍎"); // 利用构造函数定一个对象
		System.out.println("name: " + juice.getName());
		// 利用set方法设定 size 成员变量
		juice.setSize(FreshJuice.FreshJuiceSize.MEDIUM); // 类名.枚举数据类型名.枚举数值
		System.out.println("Size: " + juice.getSize());
		System.out.println(juice.getSize());
	}

}
