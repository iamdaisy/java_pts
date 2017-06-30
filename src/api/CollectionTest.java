package api;

import java.util.ArrayList;
import java.util.List;

public class CollectionTest {
	public static void main(String[] args) {        //ArrayList를 Upcasting해서 사용
		List<String> list = new ArrayList<String>();  //반드시 String타입만 들어오도록(제네릭) - 타입이 양쪽이 같을 경우 오른쪽<>으로 생략가능(java7부터 가능)
		list.add("조지클루니"); printstr(list);
		list.add("브래드피트"); printstr(list);
		list.add("디카프리오"); printstr(list);
		list.add("최지웅"); printstr(list);
		list.add("조니뎁"); printstr(list);
		list.add("원빈"); printstr(list);
		
		
	}
	/*private static void printstr(List list) {
		for(int i=0; i < list.size(); i++){
			System.out.print(list.get(i) + "\t");
			
		}
		System.out.println();
		
	}*/

	private static void printstr(List<String> list) {
		for(String name: list) {
			System.out.print(name + "\t");
			
		}
		System.out.println();
		
	}


}
