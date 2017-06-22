package oop.exam10;

public interface TV {      //인터페이스 내부의 메소드들은 모두 추상메소드라서 abstract를 생략해도됨
	public void powerOn();
	public void powerOff();
	public void channelUp();
	public void channelDown();
	public void soundUp();
	public void soundDown();
	public void setSpeaker(Speaker speaker);


}
