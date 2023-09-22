package arraytest;

import java.util.Arrays;
import java.util.Collections;

public class ArraysTest1 {

	public static void main(String[] args) {
		Integer[] arr = {5, 2, 9, 1, 5};
        
        // 배열을 오름차순으로 정렬
        Arrays.sort(arr);
        
        System.out.println(Arrays.toString(arr));
        
        // 배열을 내림차순으로 뒤집기
        Collections.reverse(Arrays.asList(arr));
        
        // 결과 출력
        System.out.println(Arrays.toString(arr));

	}

}
