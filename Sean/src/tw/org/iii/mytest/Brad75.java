package tw.org.iii.mytest;

import java.util.Timer;
import java.util.TimerTask;

public class Brad75 {

	public static void main(String[] args) {
		Timer timer = new Timer(/*true*/);//true:前景結束timer就結束(預設值)
		
		MyTask myTask = new MyTask();
		
		//02.
		//StopTimer stopTimer = new StopTimer(timer);
		
		timer.schedule(myTask, 1*1000, 1*1000);
		//timer.schedule(stopTimer, 10*1000);
		System.out.println("here");
		//timer.cancel();//不取消則timer持續運作不停止(如手機背景偷傳數據回伺服器)
	}
	
	
}

class MyTask extends TimerTask {
	@Override
	public void run() {
		System.out.println("OK");
	}
}

class StopTimer extends TimerTask {
	Timer timer;
	StopTimer(Timer timer){this.timer = timer;}
	@Override
	public void run() {
		//timer.cancel();
		System.exit(0);
				
	}
}