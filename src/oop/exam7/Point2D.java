package oop.exam7;

public class Point2D {
	int x;
	int y;
	public Point2D(){
		this(1, 1);   // 생성자에서 생성자를 호출할때 제일먼저 수행되어야함
		System.out.println("Point2D()");  
	}
	public Point2D(int x, int y) {
		super();
		this.x = x;
		this.y = y;
		System.out.println("Point2D(x, y)");
	}
	
	
}
