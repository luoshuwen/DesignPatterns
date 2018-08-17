package ch1._9;

public abstract class Operation {
  protected static double a = 1;
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
