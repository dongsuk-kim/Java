package day02;

public class JavaPracticeEx {
	public static void main(String[] args) {
		// [3-5]
		// num 333�̶�� 331�� �ǰ� 777�̶�� 771�� �ȴ�.
				//int num = 456;
				//System.out.println( num/100 * 100);
				
//				System.out.println("1"+"2");
//				System.out.println(true+"");
//				System.out.println('A'+'B');
//				System.out.println('1'+2);
//				System.out.println('1'+'2');
//				System.out.println('J'+"ava");
//				System.out.println(true+null);
				
				/*
				// [3-1]
				int x = 2;
				int y = 5;
				char c = 'A';
				
				System.out.println(1+x << 33);
				System.out.println(y >= 5 || x < 0 && x > 2);
				System.out.println(y += 10 - x++);
				System.out.println(x+=2);
				System.out.println(!('A' <= c && c <= 'Z'));
				System.out.println('C'-c);
				System.out.println('5'-'0');
				System.out.println(c+1);
				System.out.println(++c);
				System.out.println(c++);
				System.out.println(c);
				*/
				
//				System.out.println("i \t 2*i \t 2*i-1 \t i*i \t 11-i \t i%3 \t i/3");
//				System.out.println("-----------------------------------------------------------------------");
//				
//				for(int i=1; i<=10; i++)
//					System.out.printf("%d \t %d \t %d \t %d \t %d \t %d \t %d%n",
//											i, 2*i, 2*i-1, i*i, 11-i, (i+2)%3+1, (i+2)/3);
				// [3-2]
//				int numOfApples = 123;
//				int sizeOfBucket = 10;
//				int numOfBucket = numOfApples / sizeOfBucket + (numOfApples%sizeOfBucket > 0 ? 1 : 0);
//				
//				System.out.println("�ʿ��� �ٱ����� �� :" + numOfBucket);
				
				// [3-3]
//				int num = 10;
//				System.out.println( num > 0 ? "���" : (num < 0 ? "����" : 0) );
				
				// [3-4]
//				int num = 456;
//				System.out.println((num/100)*100);
				
				// [3-5]
//				int num = 333;
//				System.out.println(num/10 * 10 + 1); // 333/10 -> 33 * 10 -> 330 + 1 => 331
				
				// [3-6]
//				int num = 24;
//				System.out.println(10 - num % 10);
				
				// �ٽ� ����
				// [3-7] 
//				int fahrenheit = 100;
//				float celcius = (int)((5/9f * (fahrenheit - 32) * 100) + 0.5) / 100f;
//				
//				System.out.println("Fahrenheit:" + fahrenheit);
//				System.out.println("Celcius:" + celcius);
				
				// [3-8]
//				byte a = 10;
//				byte b = 20;
//				byte c = (byte)(a+b);		// ������ byte��
//				
//				char ch = 'A';				// A�� 65
//				ch = (char)(ch + 2);		// ����ȯ char�� ���ְ� ������� 67�����ϱ� C
//				
//				float f = (float)(3 / 2 + 0.5);			// ����ȯ float�� ���ְ�  0.5�� ���ϸ� 1.5 ����� ����.
//				long l = (3000 * 3000 * 3000L);			// �� ���� ���ͳ� L�� �پ������ 3000 * 3000 * 3000�� ��갪�� ��µȴ�.
//				
//				float f2 = 0.1f;
//				double d = 0.1;						// d�� 0.1 ����Ÿ���̶� f2�� �÷�ƮŸ������ ������ϱ� ������ (floa)�� ����ȯ ��Ŵ.
//				
//				boolean result = (float)d==f2;
//				
//				System.out.println("c="+c);
//				System.out.println("ch="+ch);
//				System.out.println("f="+f);
//				System.out.println("l="+l);
//				System.out.println("result=" + result);
				
				// [3-9]
//				char ch = 'z';
//				boolean b = ('a'<=ch && ch<='z') || ('A'<=ch && ch<='Z');
//				
//				System.out.println(b);
				
				// [3-10] - �� �𸣰��� -
//				char ch = 'A';
//				
//				char lowerCase = ( && ) ? ch+32 : ch;
//				
//				System.out.println("ch:"+ch);
//				System.out.println("ch to lowerCase:" + lowerCase);
				
				// [4-1]
//				1. x > 10 && x < 20
//				2. !(ch == ' ' || ch == '\t')
//				3. ch == 'x' || ch == 'X'
//				4. ch >= '0' && ch <='9'
//				5. ('a' <= ch && ch <= 'z') || ('A' <= ch && ch <= 'Z')
//				6. year % 400 == 0 || year % 4 == 0 && year%100!=0
//			    7. powerOn == false;
//				8. str.equals("yes");
				
				//[4-2]
//				int sum = 0;
//				for(int i = 1; i<=20; i++) {
//					if(i%2!=0 && i%3!=0 ) 
//						sum+=i;								//sum = sum + i (sum +=i) 
//					}
//					System.out.println("sum=" + sum);
//				}
				
				// [4-3]
//				int sum = 0;
//				int tsum = 0;
//				for(int i = 1; i<=10; i++) {
//					sum +=i;		// sum = sum + i;
//					tsum +=sum;		// tsum = tsum + sum;  ���Ⱑ ������ ��Ÿ���� �κ�.
//				}
//				System.out.println("tsum=" + tsum);
				
				// [4-4] - �� �𸣰��� -
//				int sum = 0;
//				int t = 1;
//				int num = 0;
//				
//				for(int i = 1; ; i++,t=-t) {
//					
//				}
				
				// [4-5]
//				int i = 0;
//				while(i<=10) {
//					int j = 0;		// �ʱ��
//					while(j<=i) {   // ���ǽ�
//						System.out.print("*");
//						j++;		// ������
//					}
//					System.out.println();
//					i++;
//				}
				
				// [4-6]
//				for(int i = 1; i<=6; i++) {
//					for(int j = 1; j<=6; j++) {
//						if(i+j==6) {
//							System.out.println(i + "+"+ j + "=" + (i+j));
//						}
//					}
//				}
				
				// [4-7]
//				int value = (int)(Math.random()*6)+1;
//				
//				System.out.println("value:" + value);
		
				// [4-8]
				// Q.������ 2x+4y=10�� ��� �ظ� ���Ͻÿ�. �� x�� y�� �����̰� ������ ������ 0<=x<=10, 0<=y<=10 �̴�.
				
//				for(int x = 0; x <= 10; x++) {					// x�� ����
//					for(int y = 0; y <= 10; y++) {				// y�� ����
//						if(2*x+4*y==10) {						// if���� �̿��ؼ� ������ 2x+4y=10�� ��� �ظ� ���Ͻÿ��� 2*x+4*y=10���� ������ �ְ� 
//							System.out.println("x=" + x + "," + "y=" + y );	// ��°���� �����ִ� ��ó�� ���߾ �־��ָ� ��
//						}
//					}
//				}
//				System.out.println();
				
				// [4-9]
				// Q. ���ڷ� �̷���� ���ڿ� str�� ���� ��, �� �ڸ��� ���� ���� ����� ����ϴ� �ڵ带 �ϼ��϶�.
				// 	 ���� ���ڿ��� "12345"���, '1+2+3+4+5'�� ����� 15�� ����� ��µǾ�� �Ѵ�.
				// [Hint] String Ŭ������ charAt(int i)�� ���
				
//				String str = "12345";
//				int sum = 0;
//				
//				for(int i = 0; i < str.length(); i++) {
//					// �ڵ� �Է�
//					sum += str.charAt(i) - '0'; 		// ����'3'���� ����3�� �ٲٴ� ����� ����'3'���� ����'0'�� ���ִ� ��  
//				}
//				
//				System.out.println("sum=" + sum);
				
				// [4-10]
				// int Ÿ���� ���� num �� ���� ��, �� �ڸ��� ���� ���� ����� ����ϴ� �ڵ带 �ϼ��϶�. ���� ���� num�� ���� 12345���,
				// '1+2+3+4+5'�� ����� 15�� ����϶�
				
//				int num = 12345;
//				int sum = 0;
//				
//				while(num>0) {					// �ݺ��ϸ�...
//					sum += num % 10;			// sum = sum + num%10;
//					num /= 10;					// num = num / 10;   num�� 10���� ���� ��(��)�� �ٽ� num�� ����
//				}
//				System.out.println("sum=" + sum);
		
				// [4-11]    - �� �𸣰���- 
				// Q. �Ǻ���ġ ���� 
		
				// Fibonnaci ������ ������ ù �� ���ڸ� 1 ,1�� �Ѵ�.
//				int num1 = 1;
//				int num2 = 1;
//				int num3 = 0;		// ����° ��
//				System.out.println(num1 + "," + num2);
//				
//				for(int i = 0; i < 8; i++) {			// 0~7���� 8���ݺ�
//					
//					System.out.print();
//					
//				}
				
				// [4-12]
				// �������� �Ϻκ��� ������ ���� ����Ͻÿ�.
		
//				for(int i = 2; i<=9; i++) {
//					for(int j=1; j<=3; j++) {
//						System.out.println( i + "*" + j + "=" + i*j );
//					}
//					System.out.println();
//				}
		
				// [4-13]
				// �־��� ���ڿ�(Value)�� ���������� �Ǻ��ϴ� ���α׷��̴�. (1)�� �˸��� �ڵ带 �־ ���α׷��� �ϼ��Ͻÿ�.
				
//				String value = "12o34";					// "12o34"�� �����̰� value�� ������. "12o34"�� ���ڿ�(ch).charAt(index)���� 01234�̹Ƿ� ���� charAt(3)�� �Ѵٸ� 3�� ���´�.
//				char ch = ' ';
//				boolean isNumber = true;				 
//				
//				// �ݺ����� charAt(int i)�� �̿��ؼ� ���ڿ��� ���ڸ� 
//				// �ϳ��� �о �˻��Ѵ�.
//				for(int i = 0; i < value.length(); i++) {
//					/* (1)�˸´� �ڵ带 �־� �ϼ��϶�*/
//					ch = value.charAt(i);				// ���ڿ�.charAt(index)���� index�� 1�� �ƴ� 0���� ������.
//					
////					System.out.println("ch=" + ch);		// �𸣸� �ϴ� ����� �ѹ� �غ���. 
//
//					if('0' <= ch && ch <='9') {		// ���ǽĿ� ������ �־��־ ����(ch)�� ����'0'~'9'�ȿ� ����(o)�� ����ִٸ� 
//						isNumber = false;				// ch�� ���ڰ� �ƴҶ��� false�̴�. �ݴ�� ch�� ���ڸ� isNumber = true.
//					}
//					
//				}
//				
//				if(isNumber) {
//					System.out.println(value + "�� �����Դϴ�.");
//				} else {
//					System.out.println(value + "�� ���ڰ� �ƴմϴ�."); // 
//				}
		
				// [4-14] 
				// 1~100 ������ ������ ���� �� answer�� �����Ѵ�. �����Լ� Math.random()�� �־ Ǯ�� �ǰڴ�.
//				int answer = (int)(Math.random()*100) + 1;				// +1�ֱ� ���� 0~99���ٰ� +1���־ 1~100 
//				int input = 0;					// ������Է��� ������ ����
//				int count = 0;					// �õ�Ƚ���� �������� ����
//				
//				// ȭ������ ���� ������Է��� �ޱ� ���ؼ� ScannerŬ���� ���
//				java.util.Scanner s = new java.util.Scanner(System.in);
//				
//				do {
//					count++;
//					System.out.print("1�� 100 ������ ���� �Է��ϼ��� :" );
//					input = s.nextInt();		// �Է¹��� ���� ���� input�� �����Ѵ�.
//					
//					/* �˸´� �ڵ� �Է� */ 	-���� 4-28 ����-
//					if(input > answer) {
//						System.out.println("�� ���� ���� �Է��ϼ���.");
//					} else if(input < answer) {
//						System.out.println("�� ū ���� �Է��ϼ���.");
//					} else {
//						System.out.println("������ϴ�.");
//						System.out.println("�õ�Ƚ���� " + count + "�� �Դϴ�.");
//						break;
//					}
//					
//				} while(true);		// ���ѹݺ�
				
				// [4-15]
				// ȸ������ ���ϴ� ���α׷��̴�. ���� ��� '12321'�̳� '13531'���� ���� ���Ѵ�
				// [Hint] ������ �����ڸ� �̿��Ͻÿ�.
		
//				int number = 12321;
//				int tmp = number;
//				
//				int result = 0;			// ���� number�� �Ųٷ� ��ȯ�ؼ� ���� ����
//				
//				while(tmp !=0) {		// tmp (����)<- number (����)<- 12321 (�����ʿ��� ���������� �帧)
//					/*
//					 * �˸´� �ڵ带 �Է�
//					 */
//					result = tmp % 10;			// result�� tmp�� ���� 10���� ������ ������ ���� ����
//												// result 
//					tmp /= 10;					// tmp = tmp / 10; 			-> 12321 / 10 = 1232 �̷������� �ݺ��ؼ� ���� 1232/10 = 123, 123/10 = 12, 12/10= 1
//												// tmp�� ���� tmp /=10�� ���� ���ڸ��� �پ��ٰ� 0�� �Ǹ� while���� ���ǽ��� ������ �Ǿ� �ݺ��� �����. (���� 4-26) 
//					
//				}
//				
//				if(number == result) {
//					System.out.println(number + "�� ȸ���� �Դϴ�.");
//				} else {
//					System.out.println(number + "�� ȸ������ �ƴմϴ�.");
//				}
				
				
				/// �迭 ///
				// [5-1] 
				// �������� �迭�� �����ϰų� �ʱ�ȭ�� ���̴�. �߸��� ���� ���� ���� �����϶�.
				
//				b,d,f
				
				// [5-2]
				// Q. �������� arr[3].length�� ���� ���ΰ�?

//				{30,30}
				
				// [5-3]
				// �迭 arr�� ��� ��� ���� ���ϴ� ���α׷��� �ϼ��Ͻÿ�.
				
				int[] arr = {10,20,30,40,50};
				int sum = 0;
				
				/*
				 * �˸��� �ڵ带 �־� �ϼ��Ͻÿ�.
				 */
				for(int i = 0; i < arr.length; i++) {
					sum += arr[i];
				}
				System.out.println("sum=" + sum);
				
				// [5-4]
				// 2���� �迭 arr�� ��� ��� ���� ���հ� ����� ���ϴ� ���α׷��� �ϼ��Ͻÿ�.
				
				
	}
}













