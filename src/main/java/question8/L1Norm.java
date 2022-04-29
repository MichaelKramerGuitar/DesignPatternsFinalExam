package question8;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * A class to calculate L1 Norm.
 */
public class L1Norm extends NormTemplate {



  /**
   * This method calculates absolute value.
   *
   * @param a
   *            list of values
   * @return a list of absolute values
   */
  public List<Double> doVectorCal(List<Double> a) {
    // calculate the sum of them
    List<Double> tmp = new ArrayList<Double>();
    for (int i = 0; i < a.size(); i++) {
      tmp.add(Math.abs(a.get(0)));
    }
    return tmp;
  }

}
