package ch1._9;

import org.junit.Test;

public class TestOperation {
  @Test
  public void test1() {
    Operation addOperation = new AddOperation();
    addOperation.setA(3);
    addOperation.setB(5);
    System.out.println(addOperation.getResult());
    Operation minusOperation = new MinusOperation();
    System.out.println(minusOperation.getResult());
  }
}
