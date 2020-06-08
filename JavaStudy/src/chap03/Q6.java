package chap03;
import java.util.Arrays;
import java.util.Scanner;

class Q6 {

	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		
		System.out.print("요솟수: ");
		int num = stdIn.nextInt();
		int[] x = new int[num];
		
		System.out.println("오름차순으로 입력하세요.");
		
		System.out.print("x[0] : ");
		x[0] = stdIn.nextInt();
		
		for (int i=1; i< num; i++) {
			do {
				System.out.print("x["+ i + "] : ");
				x[i] = stdIn.nextInt();
			}while (x[i] < x[i-1]);
		}
		System.out.print("검색할 값 : ");
		int ky = stdIn.nextInt();
		
		int idx = Arrays.binarySearch(x, ky);
		
		if(idx<0) //배열에 k값과 일치하는 값이 없으면 인덱스값이 -1로 떨어진다.
			System.out.println(ky);
		else
			System.out.println(ky+"은 x[" + idx + "]에 있습니다." );

	}

}
