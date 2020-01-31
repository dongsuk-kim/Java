package day02;

public class JavaPracticeEx {
	public static void main(String[] args) {
		// [3-5]
		// num 333이라면 331이 되고 777이라면 771이 된다.
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
//				System.out.println("필요한 바구니의 수 :" + numOfBucket);
				
				// [3-3]
//				int num = 10;
//				System.out.println( num > 0 ? "양수" : (num < 0 ? "음수" : 0) );
				
				// [3-4]
//				int num = 456;
//				System.out.println((num/100)*100);
				
				// [3-5]
//				int num = 333;
//				System.out.println(num/10 * 10 + 1); // 333/10 -> 33 * 10 -> 330 + 1 => 331
				
				// [3-6]
//				int num = 24;
//				System.out.println(10 - num % 10);
				
				// 다시 생각
				// [3-7] 
//				int fahrenheit = 100;
//				float celcius = (int)((5/9f * (fahrenheit - 32) * 100) + 0.5) / 100f;
//				
//				System.out.println("Fahrenheit:" + fahrenheit);
//				System.out.println("Celcius:" + celcius);
				
				// [3-8]
//				byte a = 10;
//				byte b = 20;
//				byte c = (byte)(a+b);		// 형변한 byte로
//				
//				char ch = 'A';				// A가 65
//				ch = (char)(ch + 2);		// 형변환 char로 해주고 계산결과가 67나오니까 C
//				
//				float f = (float)(3 / 2 + 0.5);			// 형변환 float로 해주고  0.5를 더하면 1.5 결과값 나옴.
//				long l = (3000 * 3000 * 3000L);			// 맨 끝에 리터널 L을 붙어줘야지 3000 * 3000 * 3000의 계산값이 출력된다.
//				
//				float f2 = 0.1f;
//				double d = 0.1;						// d가 0.1 더블타입이라서 f2는 플로트타입으로 맞춰야하기 때문에 (floa)로 형변환 시킴.
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
				
				// [3-10] - 잘 모르겠음 -
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
//					tsum +=sum;		// tsum = tsum + sum;  여기가 총합을 나타내는 부분.
//				}
//				System.out.println("tsum=" + tsum);
				
				// [4-4] - 잘 모르겠음 -
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
//					int j = 0;		// 초기식
//					while(j<=i) {   // 조건식
//						System.out.print("*");
//						j++;		// 증감식
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
				// Q.방정식 2x+4y=10의 모든 해를 구하시오. 단 x와 y는 정수이고 각각의 범위는 0<=x<=10, 0<=y<=10 이다.
				
//				for(int x = 0; x <= 10; x++) {					// x의 범위
//					for(int y = 0; y <= 10; y++) {				// y의 범위
//						if(2*x+4*y==10) {						// if문을 이용해서 방정식 2x+4y=10의 모든 해를 구하시오를 2*x+4*y=10으로 조건을 넣고 
//							System.out.println("x=" + x + "," + "y=" + y );	// 출력결과가 나와있는 것처럼 맞추어서 넣어주면 끝
//						}
//					}
//				}
//				System.out.println();
				
				// [4-9]
				// Q. 숫자로 이루어진 문자열 str이 있을 때, 각 자리의 합을 더한 결과가 출력하는 코드를 완성하라.
				// 	 만일 문자열이 "12345"라면, '1+2+3+4+5'의 결과인 15를 출력이 출력되어야 한다.
				// [Hint] String 클래스의 charAt(int i)을 사용
				
//				String str = "12345";
//				int sum = 0;
//				
//				for(int i = 0; i < str.length(); i++) {
//					// 코드 입력
//					sum += str.charAt(i) - '0'; 		// 문자'3'에서 숫자3로 바꾸는 방법은 문자'3'에서 문자'0'을 빼주는 것  
//				}
//				
//				System.out.println("sum=" + sum);
				
				// [4-10]
				// int 타입의 변수 num 이 있을 때, 각 자리의 합을 더한 결과를 출력하는 코드를 완성하라. 만일 변수 num의 값이 12345라면,
				// '1+2+3+4+5'의 결과인 15를 출력하라
				
//				int num = 12345;
//				int sum = 0;
//				
//				while(num>0) {					// 반복하면...
//					sum += num % 10;			// sum = sum + num%10;
//					num /= 10;					// num = num / 10;   num을 10으로 나눈 값(몫)을 다시 num에 저장
//				}
//				System.out.println("sum=" + sum);
		
				// [4-11]    - 잘 모르겠음- 
				// Q. 피보나치 수열 
		
				// Fibonnaci 수열의 시작의 첫 두 숫자를 1 ,1로 한다.
//				int num1 = 1;
//				int num2 = 1;
//				int num3 = 0;		// 세번째 값
//				System.out.println(num1 + "," + num2);
//				
//				for(int i = 0; i < 8; i++) {			// 0~7까지 8번반복
//					
//					System.out.print();
//					
//				}
				
				// [4-12]
				// 구구단의 일부분을 다음과 같이 출력하시오.
		
//				for(int i = 2; i<=9; i++) {
//					for(int j=1; j<=3; j++) {
//						System.out.println( i + "*" + j + "=" + i*j );
//					}
//					System.out.println();
//				}
		
				// [4-13]
				// 주어진 문자열(Value)이 숫자인지를 판별하는 프로그램이다. (1)에 알맞은 코드를 넣어서 프로그램을 완성하시오.
				
//				String value = "12o34";					// "12o34"는 문자이고 value에 저장함. "12o34"는 문자열(ch).charAt(index)에선 01234이므로 만일 charAt(3)를 한다면 3이 나온다.
//				char ch = ' ';
//				boolean isNumber = true;				 
//				
//				// 반복문과 charAt(int i)를 이용해서 문자열의 문자를 
//				// 하나씩 읽어서 검사한다.
//				for(int i = 0; i < value.length(); i++) {
//					/* (1)알맞는 코드를 넣어 완성하라*/
//					ch = value.charAt(i);				// 문자열.charAt(index)에서 index는 1이 아닌 0부터 시작함.
//					
////					System.out.println("ch=" + ch);		// 모르면 일단 출력을 한번 해보자. 
//
//					if('0' <= ch && ch <='9') {		// 조건식에 범위를 넣어주어서 문자(ch)가 숫자'0'~'9'안에 문자(o)가 들어있다면 
//						isNumber = false;				// ch가 숫자가 아닐때면 false이다. 반대로 ch가 숫자면 isNumber = true.
//					}
//					
//				}
//				
//				if(isNumber) {
//					System.out.println(value + "는 숫자입니다.");
//				} else {
//					System.out.println(value + "는 숫자가 아닙니다."); // 
//				}
		
				// [4-14] 
				// 1~100 사이의 임의의 값을 얻어서 answer에 저장한다. 랜덤함수 Math.random()을 넣어서 풀면 되겠다.
//				int answer = (int)(Math.random()*100) + 1;				// +1넣기 전엔 0~99였다가 +1해주어서 1~100 
//				int input = 0;					// 사용자입력을 저장할 공간
//				int count = 0;					// 시도횟수를 세기위한 변수
//				
//				// 화면으로 부터 사용자입력을 받기 위해서 Scanner클래스 사용
//				java.util.Scanner s = new java.util.Scanner(System.in);
//				
//				do {
//					count++;
//					System.out.print("1과 100 사이의 값을 입력하세요 :" );
//					input = s.nextInt();		// 입력받은 값을 변수 input에 저장한다.
//					
//					/* 알맞는 코드 입력 */ 	-예제 4-28 참고-
//					if(input > answer) {
//						System.out.println("더 작은 수를 입력하세요.");
//					} else if(input < answer) {
//						System.out.println("더 큰 수를 입력하세요.");
//					} else {
//						System.out.println("맞췄습니다.");
//						System.out.println("시도횟수는 " + count + "번 입니다.");
//						break;
//					}
//					
//				} while(true);		// 무한반복
				
				// [4-15]
				// 회문수를 구하는 프로그램이다. 예를 들면 '12321'이나 '13531'같은 수를 말한다
				// [Hint] 나머지 연산자를 이용하시오.
		
//				int number = 12321;
//				int tmp = number;
//				
//				int result = 0;			// 변수 number를 거꾸로 변환해서 담을 변수
//				
//				while(tmp !=0) {		// tmp (대입)<- number (대입)<- 12321 (오른쪽에서 왼쪽으로의 흐름)
//					/*
//					 * 알맞는 코드를 입력
//					 */
//					result = tmp % 10;			// result에 tmp의 값을 10으로 나머지 연산한 값을 대입
//												// result 
//					tmp /= 10;					// tmp = tmp / 10; 			-> 12321 / 10 = 1232 이런식으로 반복해서 가면 1232/10 = 123, 123/10 = 12, 12/10= 1
//												// tmp의 값은 tmp /=10에 의해 한자리씩 줄어들다가 0이 되면 while문의 조건식이 거짓이 되어 반복을 멈춘다. (예제 4-26) 
//					
//				}
//				
//				if(number == result) {
//					System.out.println(number + "는 회문수 입니다.");
//				} else {
//					System.out.println(number + "는 회문수가 아닙니다.");
//				}
				
				
				/// 배열 ///
				// [5-1] 
				// 문제참고 배열을 선언하거나 초기화한 것이다. 잘못된 것을 고르고 이유 설명하라.
				
//				b,d,f
				
				// [5-2]
				// Q. 문제참고 arr[3].length의 값은 얼마인가?

//				{30,30}
				
				// [5-3]
				// 배열 arr에 담긴 모든 값을 더하는 프로그램을 완성하시오.
				
				int[] arr = {10,20,30,40,50};
				int sum = 0;
				
				/*
				 * 알맞은 코드를 넣어 완성하시오.
				 */
				for(int i = 0; i < arr.length; i++) {
					sum += arr[i];
				}
				System.out.println("sum=" + sum);
				
				// [5-4]
				// 2차원 배열 arr에 담긴 모든 값의 총합과 평균을 구하는 프로그램을 완성하시오.
				
				
	}
}













