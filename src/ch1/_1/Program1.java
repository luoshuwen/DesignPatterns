package ch1._1;

import java.util.Scanner;

public class Program1 {
	public static void main(String[] args) {
		try {
			Scanner scanner=new Scanner(System.in);
			System.out.println("请输入数字A：");
			String a=scanner.nextLine();
			System.out.println("请选择运算符号：+，-，*，/：");
			String operand=scanner.nextLine();
			System.out.println("请输入数字B：");
			String b=scanner.nextLine();
			String result="";
			
			switch (operand) {
			case "+":
				result=Double.toString(Double.parseDouble(a)+Double.parseDouble(b));
				break;
			case "-":
				result=Double.toString(Double.parseDouble(a)-Double.parseDouble(b));
				break;
			case "*":
				result=Double.toString(Double.parseDouble(a)*Double.parseDouble(b));
				break;
			case "/":
				if(Double.parseDouble(b)!=0) {
					result=Double.toString(Double.parseDouble(a)/Double.parseDouble(b));
				} else {
					result="除数不能为0";
				}			
				break;

			default:
				break;
			}
			System.out.println("结果是："+result);
		} catch (Exception e) {
			System.err.println(e);
		}		
	}
}
