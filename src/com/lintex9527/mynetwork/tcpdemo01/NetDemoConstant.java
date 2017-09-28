package com.lintex9527.mynetwork.tcpdemo01;

public class NetDemoConstant {

	//  ---------------------------  服务器端设置    ------------------------------------
	// 主机IP地址
	public static final String HOST = "192.168.1.100";
	//public static final String HOST = "127.0.0.1";
	
	// 主机端口号
	public static final int PORT = 8989;
	
	
	// -----------------------------  客户端设置    -------------------------------------
	// 从服务器端读取消息的超时时间，以毫秒为单位，设置为10秒钟
	public static final int TIMEOUT_READ_SERVER = 10 * 1000;
	// 客户端发送 bye 则终止聊天，客户端关闭
	public static final String BYEBYE = "bye";
}
