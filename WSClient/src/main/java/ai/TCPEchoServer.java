package ai;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.net.SocketAddress;

public class TCPEchoServer {
    private static final int BUFSIZE=102400;
      
    public static void main(String [] args) throws IOException, InterruptedException{

        int servPort=8088;
          
        //1.创建一个ServerSocket实例并制定本地端口。此套接字的功能是侦听该制定端口收到的连接。  
        ServerSocket servSock=new ServerSocket(servPort);
          
        int recvMsgSize;  
          
        byte [] receiveBuf=new byte[BUFSIZE];  
          
        //2.重复执行  
        while(true){  
            //a.调用ServerSocket的accept()方法以获取下一个客户端连接。  
            //基于新建立的客户端连接，创建一个Socket实例，并由accept()方法返回  
            Socket clntSock=servSock.accept();
            SocketAddress clientAddress=clntSock.getRemoteSocketAddress();
            //System.out.println("Handling client at "+clientAddress);
              
            //b,使用所返回的Socket实例的InputStream和OutputStream与客户端进行通信  
            InputStream in=clntSock.getInputStream();
            OutputStream out=clntSock.getOutputStream();
            int size = 0;
            System.out.println("========================");
            while((recvMsgSize=in.read(receiveBuf))!=-1){  
                size += recvMsgSize;
                out.write(receiveBuf, 0, recvMsgSize);
            }

            byte [] realContent = new byte[size];
            System.arraycopy(receiveBuf,0,realContent,0,size);
            System.out.println(new String(realContent));


            //c，通信完成后，使用Socket的close()方法关闭该客户端套接字链接  
            clntSock.close();  
        }  
    }  
} 