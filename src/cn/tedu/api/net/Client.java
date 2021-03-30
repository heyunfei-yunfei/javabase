package cn.tedu.api.net;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;
import java.util.Scanner;

public class Client {
    public static void main(String[] args) {
        Socket socket;
        try {
            //调用有参构造(ip地址,端口号)
            socket = new Socket("176.111.1.143",8888);
            System.out.println("与服务器连接成功");
            //2.给服务器写出hello
            OutputStream out = socket.getOutputStream();
            //问题:字节流不能写出字符串"hello"
                Scanner scanner = new Scanner(System.in);
                String str = scanner.nextLine();
                out.write(str.getBytes());
                //out.close();//flush+close
                out.flush();//只管刷新数据

            InputStream in = socket.getInputStream();
            //read方法默认返回int类型的值,必须强转编程char类型
            for (int i = 0; i < 5; i++) {
                char data=(char)in.read();
                System.out.print(data);
            }

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
