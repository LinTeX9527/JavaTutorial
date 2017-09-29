package test;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * 测试Java中日志的使用  java.util.logging
 * 
 * 参阅：
 * http://blog.csdn.net/luoweifu/article/details/46495045
 * 
 * 严重--logger.severe()---level 1000
 * 警告--logger.warning()--level 900
 * 信息（默认级别）--logger.info()-- 800
 * 配置--logger.config()---level 700
 * 良好--logger.fine() ----level 500
 * 姣好--logger.finer()----level 400
 * 最好--logger.finest()---level 300
 * 
 * @author LinTeX9527
 *
 */
public class LogTest {

	static String strClassName = LogTest.class.getSimpleName();
	// 初始化 logger，而且logger必须有一个名字
	static Logger logger = Logger.getLogger(strClassName);
	
	public static double division(int v1, int v2) {
		
		double result = 0;
		try {
			result = v1 / v2;
		} catch (ArithmeticException e) {
			
			logger.severe("severe");
			logger.warning("warning");
			logger.info("info");
			logger.config("config");
			logger.fine("fine");
			logger.fine("finer");
			logger.finest("finest");
			
			e.printStackTrace();
		}
		return result;
	}
	
	public static void main(String[] args) {
		
		// 设置日志级别，在 WANRING 以下的被忽略掉。
		logger.setLevel(Level.WARNING);
		
		System.out.println(division(5, 0));
	}

}
