package oop.exam1;

public class Practice3D extends Practice2D{
	
	private int z;

	public int getZ() {
		return z;
	}

	public void setZ(int z) {
		this.z = z;
	}
	
	
	public void print() {
		super.print();
		System.out.println("z = "+ z);
	}

	

}
