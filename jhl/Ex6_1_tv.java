package jhl;

public class Ex6_1_tv {

	public static void main(String[] args) {
		Radio r;
		r = new Radio();
		r.channel = 7;
		r.channelUp();
		r.channeldown();
		System.out.println("현재 채널은 "+ r.channel);
				
	}

}

class Radio{
	String color;
	boolean power;
	int channel;
	
	void power() {power = !power; }
	void channelUp() {channel +=1;}
	void channeldown() {channel -=1;}
	
}
