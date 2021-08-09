package com.itheima.test05;

import java.io.*;
import java.net.Socket;

public class ClientDmeo {
    public static void main(String[] args) throws Exception {
        //创建客户端对象
        Socket socket = new Socket("127.0.0.1", 8889);
        //创建客户端的IO流
        OutputStream outputStream = socket.getOutputStream();
        //转换流
        BufferedOutputStream bufferedOutputStream = new BufferedOutputStream(outputStream);
        //创建一个流，读取文件中的内容然后再写入客户端的Io流
        BufferedInputStream bufferedInputStream = new BufferedInputStream(new FileInputStream("ipModule01\\aa.txt"));
        byte[] bytes = new byte[1024];
        int len;
        while ((len = bufferedInputStream.read(bytes)) != -1) {
            bufferedOutputStream.write(bytes, 0, len);
//            System.out.println(new String(bytes,0,len));
        }
        bufferedOutputStream.flush();
        socket.shutdownOutput();//给服务器一个结束标记
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(socket.getInputStream()));
        String line;
        while ((line = bufferedReader.readLine()) != null) {
            System.out.println(line);
        }
        bufferedInputStream.close();
        outputStream.close();
        socket.close();
    }
}
