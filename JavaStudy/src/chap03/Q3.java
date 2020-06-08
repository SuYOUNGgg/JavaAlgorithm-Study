package chap03;
import java.util.*;

class Q3 {
	static int seqSearch(int[] a, int n, int key, int[] idx) {
		int pl = 0;
		int pr = n-1;
	
		do {
			int pc = (pl+pr)/2;
			if (a[pc] == key)
				return pc;
			else if (a[pc] < key)
				pl = pc+1;
			else
				pr = pc-1;
		}while (pl <= pr);
		return -1;
				
	}

	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		
		System.out.print("¿ä¼Ú¼ö : ");
		int num = stdIn.nextInt();
		int[] x = new int[num];

	}

}
