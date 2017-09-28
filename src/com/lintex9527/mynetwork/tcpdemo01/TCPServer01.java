package com.lintex9527.mynetwork.tcpdemo01;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintStream;
import java.net.ServerSocket;
import java.net.Socket;

public class TCPServer01 {

	public static void main(String[] args) {
		ServerSocket server;
		try {
			server = new ServerSocket(NetDemoConstant.PORT);
			server.setReuseAddress(true);
			Socket client = null;
			boolean flag = true;
			
			while(flag){
				//等待客户端连接
				client = server.accept();
				System.out.println("新的客户端连接成功！" + client.getInetAddress().toString());
				
				// 为每一个客户端开启一个线程
				new Thread(new ServerThread(client)).start();
				
			}// end of while(flag)
			
		} catch (IOException e) {
			e.printStackTrace();
		}
	} // end of main()

}

/**
 * 该类为多线程类，用于服务器端
 * @author LinTeX9527
 *
 */
class ServerThread implements Runnable{

	private Socket client = null;
	
	/**
	 * 构造函数，传递一个已经连接的客户端Socket
	 * @param client 一个已经连接的客户端Socket
	 */
	public ServerThread(Socket client) {
		this.client = client;
	}
	
	/**
	 * 在这里处理客户端请求
	 */
	@Override
	public void run() {
		System.out.println("后台线程开始执行");
		try {
			// 1. 获取Socket的输入流，用来向客户端发送数据
			PrintStream writer = new PrintStream(client.getOutputStream());
			
			// 2. 获取Socket的输入流，用来接收客户端发送过来的数据
			BufferedReader reader = new BufferedReader(new InputStreamReader(client.getInputStream()));
			boolean flag = true;
			while(flag){
				// 接收从客户端发来的数据
				String str = reader.readLine();
				System.out.println("收到客户端消息：" + str);
				if (str == null || "".equals(str)){
					flag = false;
				} else {
					if (NetDemoConstant.BYEBYE.equals(str)){
						flag = false;
					} else {
						writer.println("echo : " + str);
					}
				}
			} // end of while(flag)
			
			writer.close();
			client.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	} // end of run()
	
}
