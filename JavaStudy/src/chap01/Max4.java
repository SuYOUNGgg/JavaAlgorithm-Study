package chap01;
import java.util.*;

class Max4 {

	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		
		System.out.println("�� ������ �ִ밪�� ���մϴ�.");
		System.out.println("a�� �� : "); int a = stdIn.nextInt();
		System.out.println("b�� �� : "); int b = stdIn.nextInt();
		System.out.println("c�� �� : "); int c = stdIn.nextInt();
		System.out.println("d�� �� : "); int d = stdIn.nextInt();
		int max = a;
		if(b>max) max =b;
		if(c>max) max = c;
		if(d>max) max = d;
		System.out.println("�ִ밪�� "+ max + "�Դϴ�.");		
		
	}

}
