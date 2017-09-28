package com.lintex9527.mynetwork.tcpdemo01;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintStream;
import java.net.Socket;

/**
 * TCP 客户端
 * 主动连接服务器，发送消息给服务器，输入 "bye" 则主动断开连接。
 * @author LinTeX9527
 */
public class TCPClient01 {

	public static void main(String[] args) {
		
		printHelp();
		
		try {
			// 1、创建 socket 主动连接服务器
			Socket client = new Socket(NetDemoConstant.HOST, NetDemoConstant.PORT);
			
			// 2、socket 设置，如果超时没有socket input stream 输入则 抛出 java.net.SocketTimeoutException 
			client.setSoTimeout(NetDemoConstant.TIMEOUT_READ_SERVER);
			
			if (client.isClosed()){
				System.out.println("连接服务器失败，关闭，退出。");
				client.close();
				return;
			}
			// 获取键盘输入
			BufferedReader input_keyboard = new BufferedReader(new InputStreamReader(System.in));
			
			// 3、获取Socket的输出流，发送数据到服务器端
			PrintStream writer = new PrintStream(client.getOutputStream());
			
			// 4、 获取Socket的输入流，用来接收从服务器发送过来的消息
			BufferedReader reader = new BufferedReader(new InputStreamReader(client.getInputStream()));
			
			boolean flag = true;
			
			while(flag){
				// 获取键盘输入
				System.out.print("输入信息：");
				String str = input_keyboard.readLine();
				
				System.out.println(String.format("your input is [%s]", str));
				
				if (str == null){
					System.out.println("服务器发送给我们的消息为空，退出。");
					flag = false;
					break;
				}
				// 发送数据到服务器端
				writer.println(str);
				writer.flush();
				
				// 检测是否要断开连接
				if (NetDemoConstant.BYEBYE.equals(str)){
					flag = false;
				} else {
					// 从服务器接收消息
					String echo = reader.readLine();
					if (echo == null){
						System.out.println("接收到服务器消息: null");
						flag = false;
						break;
					} else {
						System.out.println("接收到服务器消息:" + echo);
					}
				}
			} // end while(flag)
			
			// 关闭输入、输出流
			System.out.println("关闭退出。。。");
			input_keyboard.close();
			reader.close();
			if (client != null){
				client.close();
			}
		} catch (IOException e) {
			e.printStackTrace();
		} // end of try..catch...
		
	} // end of main()

	
	private static void printHelp() {
		String help = "--- TCP 客户端 \n"
					+ "--- 先运行服务器再运行客户端\n"
					+ "--- 输入'" + NetDemoConstant.BYEBYE + "' 结束聊天\n";
		System.out.println(help);
	}
}
