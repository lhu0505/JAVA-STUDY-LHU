package exam05;

public class ch4 {

	public static void main(String[] args) {
		
		//1
		/*
		 * 1. int형 변수 x가 10보다 크고 20보다 작을 때 true인 조건식

답 : if(x>10 && x<20)

2. char형 변수 ch가 공백이나 탭이 아닐 때 true인 조건식

답 : if(ch != '' || ch != '\t')

3. char형 변수 ch가 'x' 또는 'X'일 때 true인 조건식

답 : if(ch == 'x' || ch == 'X')

4. char형 변수 ch가 숫자('0'~'9')일 때 true인 조건식

답 : if(ch >= '0' && ch <= '9')

5. char형 변수 ch가 영문자(대문자 또는 소문자)일 때 true인 조건식

답 : if((ch >= 'A' && ch <= 'Z') || (ch >= 'a' && ch <= 'z'))

6. int형 변수 year가 400으로 나눠떨어지거나 또는 4로 나눠떨어지고 100으로 나눠떨어지지 않을 때 true인 조건식

답 : if((year%400==0) || (year%4==0 && year%100!=0))

7. boolean형 변수 powerOn가 false일 때 true인 조건식

답 : if(!powerOn)

8. 문자열 참조변수 str이 "yes"일 때 true인 조건식

답 : if(str.equals("yes"))
		 */
		

		//2 1부터 20까지의 정수 중에서 2 또는 3의 배수가 아닌 수의 총합을 구하시오.
		int sum = 0;
		for(int i = 1; i <= 20; i++) {
			if(i%2!=0 && i%3!=0) {
				sum += i;
				
			}
		}
		System.out.println(sum);
		
		//3 1+(1+2)+(1+2+3)+(1+2+3+4)+...+(1+2+3+...+10)의 결과를 계산하시오.
		for(int i = 0; i<=10; i++) {
			int tmp =(1+i)*i/2;
			sum += tmp;
			
		}
		System.out.println(sum);
		
		
		//4
		
		int num = 0;
		
		while(true) {
			num++;
			if(num%2==0) {
				sum -= num;
			}else {
				sum += num;
			}
			if(sum >= 100) {
				break;
			}
			System.out.println(num);
		}
	
		
		
		
		//5
		

			 int i = 0, j = 0;

			 while (i <= 10) {

			 j = 0;

			 while (j <= i) {

			 System.out.print("*");

			 j++;

			 }

			 System.out.println();

			 i++;

			 }

			
			 
			 

	}
	
	
	

}
