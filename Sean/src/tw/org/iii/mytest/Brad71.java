package tw.org.iii.mytest;
import java.util.Iterator;
import java.util.TreeSet;

public class Brad71 {

	public static void main(String[] args) {
		//HashSet<Integer> set = new HashSet<>();//泛型之後，編譯時期就能輔助放的內容是一致的資料型態
		TreeSet<Integer> set = new TreeSet<>();//排序set
		//set.add(123);
		//set.add("Brad");
		while (set.size()<6) {//也可用來洗牌出不重複的結果
			set.add((int)(Math.random()*49+1));
		}
		System.out.println(set);
		
		//取出其中的值
		Iterator<Integer> it = set.iterator();//<Integer>泛型
		//還有內容嗎?還有的話印出來
		while (it.hasNext()) {
			Integer num = it.next();
			System.out.println(num);
		}
		System.out.println("--------");
		
		//招數二
		//只要是collection，就可以for each取出值
		//應用：手機偵測附近藍芽裝置，設定搜尋封包時間，對方藍芽裝置會重複回答，在藍芽清單能收集不重複的清單
		for (Integer num : set) {
			System.out.println(num);
		}
		
	}

}
