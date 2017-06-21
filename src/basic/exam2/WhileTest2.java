package basic.exam2;

public class WhileTest2 {
	public static void main(String[] args) {
		
		int i = 1;
		while(i<=10){
			System.out.println(i*10 + ": 김지혁");
			i++;
		}
		System.out.println("종료");
		
		int sum = 0;
		int count = 1;
		while(count <= 1000) {
			if(count % 3 ==0){
				sum += count;	
			}
			count++;	
		}
		System.out.println(sum);
		
	}

}
