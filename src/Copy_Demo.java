
public class Copy_Demo {
	public static void main(String[] args) {
		int original=26;
		int target=original; //값 복사 주소 복사 차이
		
		System.out.println(original);
		System.out.println(target);
		
		original=32;
		
		System.out.println(original);
		System.out.println(target);
	}
}
