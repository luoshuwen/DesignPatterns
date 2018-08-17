package ch1._10;

import ch1._09.AddOperation;
import ch1._09.DivisionOperation;
import ch1._09.MinusOperation;
import ch1._09.MultiplyOperation;
import ch1._09.Operation;

//简单工厂类：根据不同的要求，返回抽象类或接口的，不同的具体实现对象
public class OperationFactory {

  public static Operation getSpecificInstanceBasedOnAbstractClass(String operand) {
    switch (operand) {
    case "+":
      return new AddOperation();
    case "-":
      return new MinusOperation();
    case "*":
      return new MultiplyOperation();
    case "/":
      return new DivisionOperation();
    default:
      return new AddOperation();
    }
  }

  public static IOperation getSpecificInstanceBasedOnIntergace(String operand) {
    switch (operand) {
    case "+":
      return new OperationAdd();
    case "-":
      return new OperationMinus();
    case "*":
      return new OperationMultiply();
    case "/":
      return new OperationDivision();
    default:
      return new OperationAdd();
    }
  }
}
