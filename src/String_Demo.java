import java.util.Scanner;

public class String_Demo {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
//		String name="hanjimin";//초기화
//		System.out.printf("이름 : %s\n", name);
//		String name=new String("hanjimin");
//		System.out.print(name);
		Student jimin=new Student();
		Student minji=new Student();
		
		System.out.print("학번은? :");
		jimin.hakbun=sc.nextLine();
		
		System.out.print("이름은? :");
		jimin.name=sc.nextLine();
		minji.name=sc.nextLine();
		
		System.out.print("국어점수는? :");
		jimin.kor=sc.nextInt();
		
		System.out.print("수학 점수는? :");
		jimin.eng=sc.nextInt();
		
		System.out.print("영어 점수는? :");
		jimin.mat=sc.nextInt();
		
		System.out.printf(jimin.hakbun + jimin.name+ jimin.kor+jimin.eng+jimin.mat);
		
	
		
	}

}
