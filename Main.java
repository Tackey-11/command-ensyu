import java.util.Scanner;

public class Main{
	public static void main(String []args){
		Scanner scanner = new Scanner(System.in);
		System.out.print("身長");
		double height = scanner.nextDouble();
		System.out.print("体重");
		double weight = scanner.nextDouble();

		String result = String.format("%.2f",weight/height/height);
                 System.out.println("BMI"+result);

		System.out.print("身長2");
		double height2 = scanner.nextDouble();

		System.out.print("体重2");
		double weight2 = scanner.nextDouble();
                                            
		]		String result2 = String.format("%.2f",weight/height/height);
		System.out.println("BMI"+result2);
	}
}
