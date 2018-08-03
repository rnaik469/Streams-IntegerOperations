package in.co.cg.in_toperations;

import java.util.ArrayList;
import java.util.function.Consumer;
import java.util.function.Predicate;

public class IntOperation {

	public static void main(String[] args) {
	
		ArrayList<Integer> list=new ArrayList<>();
		for(int i=1;i<=100;i++)
		{
			list.add((int)(Math.random()*10000)%100);
		}
		Consumer<Integer> consumerPrint=System.out::println;
		
		//use predicate to return true false on operations
		Predicate<Integer> pEven=(value)->(value%2==0)?true:false;
		Predicate<Integer> pOdd=(value)->(value%2==0)?false:true;	
		Predicate<Integer> pDivbysix=(value)->(value%6==0)?true:false;
		Predicate<Integer> pLessThanTwelve=(value)->(value<12)?true:false;
		Predicate<Integer> pGreterThanFifty=(value)->(value>50)?true:false;
		
		System.out.println("1.Integers in the list");
		list.stream().forEach(consumerPrint);
		
		System.out.println("2. Even values in the list");
		list.stream().filter(pEven).forEach(consumerPrint);
		
		System.out.println("3. Odd values in the list");
		list.stream().filter(pOdd).forEach(consumerPrint);
		
		System.out.println("4. Numbers divisible by 6 in the list");
		list.stream().filter(pDivbysix).forEach(consumerPrint);
		
		System.out.println("5. Numbers less than 12 in the list");
		list.stream().filter(pLessThanTwelve).forEach(consumerPrint);
		
		System.out.println("6. Numbers greater than 50 in the list");
		list.stream().filter(pGreterThanFifty).forEach(consumerPrint);
		
		
	}

}
