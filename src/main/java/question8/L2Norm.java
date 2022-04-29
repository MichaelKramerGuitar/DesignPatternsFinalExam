package question8;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * A class to calculate L2 Norm.
 */

public class L2Norm extends NormTemplate {


  /**
   * This method calculates power of two of the values.
   *
   * @param  a list of values
   * @return a list of absolute values
   */
  public List<Double> doVectorCal(List<Double> a) {
    // calculate the sum of them
    List<Double> tmp = new ArrayList<Double>();
    for (int i = 0; i < a.size(); i++) {
      tmp.add(Math.pow(a.get(0), 2) );
    }
    return tmp;
  }
  /**
   * This method Calculates the sqrt value. Re-implement Hook.
   * @param a double
   * @return a double
   */
  public double doFinalCal(double a) {
    // calculate the sqrt
    return Math.sqrt(a);
  }
}

