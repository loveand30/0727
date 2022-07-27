import java.util.Scanner;

public class result1 {
	public static void main(String[] args) {
		Employee sawon=new Employee();
		Scanner sc=new Scanner(System.in);
		
		System.out.print("사원번호 :");
		sawon.empno=sc.nextInt();
		
		sc.nextLine();
		
		System.out.print("사원이름 :");
		sawon.ename=sc.nextLine();
		
		System.out.print("사원출생년도 :");
		sawon.birthYear=sc.nextInt();
		
		System.out.print("사원월금 :");
		sawon.salary=sc.nextInt();
		
		sc.nextLine();
		
		System.out.print("사원이메일 :");
		sawon.email=sc.nextLine();
		
		System.out.print("사원전화번호 :");
		sawon.tel=sc.nextLine();
		
		System.out.print("정규직여부 :");
		sawon.flag=sc.nextBoolean();
		
		int sawonnai= 2022-sawon.birthYear+1;
		
		System.out.println("사원번호 :"+sawon.empno + "\n사원이름 : "+ sawon.ename + "\n사원나이 : "+ sawonnai+"살"+"\n사원월급 : "+sawon.salary+" 만원"+"\n사원이메일 : "+sawon.email+"\n사원전화번호 : "+sawon.tel+"\n사원 정규직 여부 : "+sawon.flag);
		
	}
}
