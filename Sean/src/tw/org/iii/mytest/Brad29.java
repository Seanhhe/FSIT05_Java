/*
 * 01.子類別物件實體asign給父類別的物件實體
 * 02.父類別物件時提asign給子類別的物件實體 ，要轉型別(編譯時期會警告)
 */

package tw.org.iii.mytest;

public class Brad29 {

	public static void main(String[] args) {
		Brad291 obj1 = new Brad291();
		obj1.m1();//obj1被宣告為類別Brad291，所以只能用.m1()
		Brad291 obj2 = new Brad292();
		obj2.m1();
		//Brad292 obj3 = obj2; 此寫法不可行
		Brad292 obj3 = (Brad292)obj2; //OK語法
		obj3.m1();
		obj3.m2();
		System.out.println(obj2 == obj3);
		
		//System.out.println(obj1 instanceof Brad292); //骨子裡是否為???
		if (obj1 instanceof Brad292) {
			Brad292 obj4 = (Brad292)obj1; //=> 語法可編譯，不可執行=>RuntimeException
		}else {
			System.out.println("xx");
		}
		
		
		Brad294 obj5 =new Brad294();
		//Brad292 obj6 = (Brad292)obj5; 只有直系血親才可成功編譯 => compile error
		
	}

}

//心中浮現族譜結構
//能不能呼叫看宣告，能不能執行看骨子內容
class Brad291 {
	void m1(){
		System.out.println("Brad291:m1()");
	}
}
class Brad292 extends Brad291{
	void m1(){
		System.out.println("Brad292:m1()");
	}
	void m2(){}
}
class Brad293 extends Brad292{void m3(){}}
class Brad294{}