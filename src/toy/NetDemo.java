package toy;

import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.net.InetAddress;
import java.net.Socket;
import java.net.URL;
import java.net.URLConnection;
import java.net.UnknownHostException;
import java.util.Date;

public class NetDemo {
    
    public static void exer02(String str) throws UnknownHostException, IOException {
        int c;
        Socket s = new Socket("internic.net", 80);
        InputStream in = s.getInputStream();
        OutputStream out = s.getOutputStream();
        str = (str.length() == 0 ? "osborne.com" : str) + "\n";
        byte buf[] = str.getBytes();
        out.write(buf);
        while ((c = in.read()) != -1) {
        System.out.print((char) c);
        }
        s.close();
    }
    
    public static void exer01() {
        InetAddress Address;
        try {
            Address = InetAddress.getLocalHost();
            System.out.println(Address);
            Address = InetAddress.getByName("baidu.com");
            System.out.println(Address); 
        } catch (UnknownHostException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }
    
    public static void exer03() throws IOException {
        int c;
        URL hp = new URL("http://www.baidu.com");
        URLConnection hpCon = hp.openConnection();
        System.out.println("Date: " + new Date(hpCon.getDate()));
        System.out.println("Content-Type: " + hpCon.getContentType());
        System.out.println("Expires: " + hpCon.getExpiration());
        System.out.println("Last-Modified: " +
        new Date(hpCon.getLastModified()));
        int len = hpCon.getContentLength();
        System.out.println("Content-Length: " + len);
        if (len > 0) {
        System.out.println("=== Content ===");
        InputStream input = hpCon.getInputStream();
        InputStreamReader rin = new InputStreamReader(input, "utf-8");
        int i = len;
        while (((c = rin.read()) != -1) && (--i > 0)) {
        System.out.print((char)c);
        }
        rin.close();
        } else {
        System.out.println("No Content Available");
        }
    }

    public static void main(String[] args) throws Exception {
/* exer02      
 *  try {
            exer02("Whois Server Version 1.3");
        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }*/
        exer03();
    }

}
