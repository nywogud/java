package jhl2;

import java.util.Arrays;

class Time{
	private int hour;
	private int min;
	private int sec;

	Time(){}

	public void timeSetter(int hour, int min, int sec) {
		if (hour<0 || hour>23) return;
		if(min<0 || min >60) return;
		if(sec<0 || sec>60) return;

		this.hour = hour;
		this.min = min;
		this.sec = sec;
	}
	public int[] timeGetter() {
		int[] showTime = new int[3];
		showTime[0] = this.hour;
		showTime[1] = this.min;
		showTime[2] = this.sec;
		return showTime;
	}
}
public class TimeTest {

	public static void main(String[] args) {
		Time t = new Time();
		t.timeSetter(3,45,28);
		System.out.println(Arrays.toString(t.timeGetter()));}

}
