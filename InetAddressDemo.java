import java.net.*;
import java.io.*;
   public class InetAddressDemo {
      public static void main(String[] args) {
       DataInputStream din=new DataInputStream(System.in);
     //BufferedReader din = new BufferedReader(new InputStreamReader(System.in));
      String ip_name;
       try {
                 System.out.println("Enter Host Name or IP Address");
                //System.out.flush();
                ip_name = din.readLine();
                 InetAddress mac = InetAddress.getByName(ip_name);
                 System.out.println("Host Name : "+ mac.getHostName());
                 System.out.println("Host IP : "+FormatIP(mac.getAddress()));
                 }
       
       catch(UnknownHostException uhe) 
       {
    	   System.out.println(uhe);
       }
       catch(IOException ioe) 
       {
    	   System.out.println(ioe);
       }
}
static String FormatIP(byte[] ipaddress)

{
		StringBuffer sb= new StringBuffer();
		for(int i=0; i<ipaddress.length; i++) 
		{
      if(i>0)
 sb.append(".");
}
return sb.toString();
}
}
