package ch1._09;

public abstract class Operation {
  protected double a;
  protected double b;

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

  public abstract double getResult();
}
