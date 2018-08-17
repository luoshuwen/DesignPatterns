package ch1._10;

public class OperationDivision implements IOperation {
  private double a;
  private double b;

  public double getA() {
    return a;
  }

  public void setA(double a) {
    this.a = a;
  }

  public double getB() {
    return b;
  }

  public void setB(double b) {
    this.b = b;
  }

  @Override
  public double getResult() {
    return a / b;
  }

}
