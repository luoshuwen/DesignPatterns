package ch1._8;

import java.util.Scanner;

import org.junit.Test;

public class TestOperation {

	@Test
	public void test1() {
		Scanner scanner=new Scanner(System.in);
		System.out.println("请输入数字A：");
		String a=scanner.nextLine();
		System.out.println("请选择运算符号：+，-，*，/：");
		String operand=scanner.nextLine();
		System.out.println("请输入数字B：");
		String b=scanner.nextLine();
		Double result=Operation.getResult(Double.parseDouble(a), Double.parseDouble(b), operand);
		System.out.println(result);
	}
}
