package cn.tedu.api.net;
//代表Socket的服务器端--利用ServerSocket
//负责:
//1.读取客户端发来的数据--inputStream
//给客户端 写出数据 OutputStream

import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;

public class Server {
    public static void main(String[] args) {
        //创建对象ServerSocket触发含参构造(int port)
        //触发含参构造--参数是端口:0~65535
        ServerSocket ss;
        try {
            ss = new ServerSocket(8888);
            System.out.println("服务器已经开启~~");
            //2接收客户端发来的连接请求,建立连接
            Socket s = ss.accept();
            System.out.println("服务器接受到了一个请求");
            //3.读取客户端发来的数据
            InputStream in = s.getInputStream();
            for (int i = 0; i < 5; i++) {
                int d = in.read();
                char c = (char) d;
                System.out.print(c);
            }


            OutputStream out = s.getOutputStream();
            Scanner scanner = new Scanner(System.in);
            String str = scanner.nextLine();
            out.write(str.getBytes());
            out.flush();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
