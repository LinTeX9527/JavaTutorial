package ch17;

/**
 * 对象在被垃圾回收器回收之前可以调用这个固定的方法： finalize()
 * 这个方法是由系统自动调用的，不需要我们调用。
 * 
 * protected void finalize()
 * 这个方法是和构造器相对的。它可以保证对象可以完整、安全的清除。
 * */
public class FinalizeDemo {

	public static void main(String[] args) {
		System.out.println("主函数");
	}
	
	protected void finalize() {
		System.out.println("安全清除"); // 不会显示的。
	}

}
