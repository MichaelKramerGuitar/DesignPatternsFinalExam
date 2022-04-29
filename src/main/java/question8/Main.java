package question8;

import java.util.ArrayList;
import java.util.List;

// TEMPLATE METHOD USED FOR REFACTOR
public class Main {

  public static void main(String[] args) {

    List<Double> data = new ArrayList<Double>();

// generate some example data to test.
    for (int i = 0; i < 10; i++) {
      data.add(new Double(-2.0));
    }

    // Create different calculators
    NormTemplate l1Calulator = new L1Norm();
    L2Norm l2Calulator = new L2Norm();

    System.out.println("Data is: " + data);
    System.out.println("L1 Norm is: " + l1Calulator.doCal(data));
    System.out.println("L2 Norm is: "+ l2Calulator.doCal(data));

  }

}
