package codewars01;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
public class Kata001 {
 public static void main(String[] args) {	
	
	List<Object> kata01 = new ArrayList<Object>(Arrays.asList(1,2,"3a",4,"5","asfasdf"));
	
	List<Integer> kata02 = new ArrayList<Integer>();
	
	Iterator<Object> iterator01= kata01.iterator();
	
	System.out.println(kata01);
	//리스트를 받고 리스트를 셋으로 만들어서
	//리스트를 반복하는 Iterator<String> nameNumber= hm.keySet().iterator();
	// if 문으로 문자열인지 정수인지 확인해서
	// 정수라면 새로운 list에 add를 한다
	while(iterator01.hasNext()){
	if(iterator01.next() instanceof Integer) {
		kata02.add((Integer) iterator01.next());
		
		
		}
	}

	System.out.println(kata02);
	
}


	
}


//public static List filterList(final List list) {
//    // Return the List with the Strings filtered out
//
//    ArrayList<Integer> list2= new ArrayList<Integer>();
//    System.out.println();
//    for (Object element: list
//         ) {/*element.getClass().equals(Integer.class)*/
//        if(element.getClass().getName().equals(Integer.class.getName()) ){
//            list2.add((Integer) element);
//        }
//
//
//    
//}return list2;
//}