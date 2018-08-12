package tw.org.iii.mytest;

import java.net.InetAddress;
import java.net.UnknownHostException;

public class Brad59 {

	public static void main(String[] args) {
		try {
			// FQDN 搜尋google
			// HostName
			// 主機名稱.Domain.
			InetAddress[] ips = InetAddress.getAllByName("www.hinet.net");// ("主機名稱")不加http
			//一組IP只會在一台主機上，會用DNS分流，所以才會解析出不同IP位址。此為輪詢機制
			//一台主機可以擁有多組IP(錢多任性)
			//getAllByName會取得IP陣列，IPv4可以看到，大公司多換成IPV6，且只看得到一組而已。
			for (InetAddress ip : ips) {
				System.out.println(ip.getHostAddress());
			}
		}catch (UnknownHostException e) {
			System.out.println(e.toString());
		}
	}

}
