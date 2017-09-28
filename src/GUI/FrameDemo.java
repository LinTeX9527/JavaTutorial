package GUI;

import java.awt.event.*;
import java.awt.*;

public class FrameDemo {

	public static void main(String[] args) {
		// 创建窗体对象
		Frame frame = new Frame("窗体关闭案例");
		
		// 设置窗体属性
		frame.setBounds(400, 200, 400, 300);
		
		// 设置布局为流式布局
		frame.setLayout(new FlowLayout());
		
		// 创建文本框
		final TextField tf = new TextField(20);
		
		// 创建按钮对象
		String btnTitle = "点击我啊";
		Button button = new Button(btnTitle);
		
		// 创建文本域
		final TextArea ta = new TextArea(10, 40);
		
		// 把按钮添加到窗体
		frame.add(tf);
		frame.add(button);
		frame.add(ta);
		
		
		frame.addWindowListener(new WindowListener() {
			
			@Override
			public void windowOpened(WindowEvent e) {
				
			}
			
			@Override
			public void windowIconified(WindowEvent e) {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void windowDeiconified(WindowEvent e) {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void windowDeactivated(WindowEvent e) {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void windowClosing(WindowEvent e) {
				// 当窗体关闭的时候退出程序
				System.exit(0);
			}
			
			@Override
			public void windowClosed(WindowEvent e) {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void windowActivated(WindowEvent e) {
				// TODO Auto-generated method stub
				
			}
		});
		
		button.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// 获取文本框的值
				String tf_str = tf.getText().trim();
				
				// 清空数据
				tf.setText("");
				
				ta.append(tf_str + "\r\n");
				
				// 获取光标
				tf.requestFocus();
			}
		});
		
		// 设置窗体可见
		frame.setVisible(true);
		
	}

}
