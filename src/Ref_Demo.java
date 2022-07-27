import java.util.Scanner;


public class Ref_Demo {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		System.out.println("이름이 뭔가요? :");
		String name=sc.nextLine();
		
		System.out.println("나이가 얼마인가요? :");
		int age=sc.nextInt();
		
		Student hojun=new Student();
		hojun.name=name;
		hojun.age=age;
		
		Student jimin=hojun;
		
		System.out.println(hojun.name);
		System.out.println(jimin.name);
		
		hojun.name="jojo";
		
		System.out.println(hojun.name);
		
		
		System.out.println(jimin.name);
		System.out.println(jimin.age
				);
	}
}
