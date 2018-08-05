package tw.org.iii.mytest;

public class Brad28 {

	public static void main(String[] args) {
		 StringBuffer sb1 = new StringBuffer();
		 System.out.println(sb1);//物件印toString
		 System.out.println(sb1.capacity());
		 System.out.println(sb1.length());
		 
		 StringBuffer sb2 = sb1.append("123456789012345");
		 System.out.println("sb1:" + sb1);//物件印toString
		 System.out.println("sb1:" + sb1.capacity());
		 System.out.println("sb1:" + sb1.length());
		 System.out.println("sb2:" + sb2);//物件印toString
		 System.out.println("sb2:" + sb2.capacity());
		 System.out.println("sb2:" + sb2.length());
		 
		 System.out.println(sb1 == sb2); //true等於兩者一樣
		 
		 sb1.append("6");//增加字元到字串中，看超過16是否會爆掉
		 System.out.println("sb1:" + sb1);//物件印toString
		 System.out.println("sb1:" + sb1.capacity());
		 System.out.println("sb1:" + sb1.length());
		 
		 sb1.append("7");
		 System.out.println("sb1:" + sb1);//物件印toString
		 System.out.println("sb1:" + sb1.capacity());
		 System.out.println("sb1:" + sb1.length());
		 
		 sb1.append("8").replace(0, 3, "Brad").append("OK");
		 System.out.println(sb1);
//--------------------------------------------------------		 
		 Brad281 obj1 = new Brad281();
		 System.out.println(obj1.calSum());
		 obj1.setS1(12).setS2(34).setS3(48); //有傳回本物件實體的方法才可這樣設定
		 System.out.println(obj1.calSum());
//--------------------------------------------------------
		 StringBuffer sb3 = new StringBuffer("Brad");
		 StringBuffer sb4 = new StringBuffer("Brad");
		 System.out.println(sb3.equals(sb4)); //沒override => same as ==
		 
		 //型別轉換
		 //變成字串，就能用equals比較內容(equals前後一定要轉toString)
		 System.out.println(sb3.toString().equals(sb4.toString()));
		 System.out.println(sb3.toString().equals(sb4)); //false比較不能，因為sb4沒先轉型
		 
	}

}

class Brad281 {
	int s1, s2, s3;
	Brad281 setS1(int s1) {this.s1=s1; return this;}
	Brad281 setS2(int s2) {this.s2=s2; return this;}
	Brad281 setS3(int s3) {this.s3=s3; return this;}
	int calSum() {return s1+s2+s3;}
}
//--------------------------------------------------------