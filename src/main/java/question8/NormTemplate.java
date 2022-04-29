package question8;

import java.util.List;

// TEMPLATE METHOD USED FOR REFACTOR
public abstract class NormTemplate {

  public abstract List<Double> doVectorCal(List<Double> a);

  /**
   * This method calculates the sum.
   *
   * @param a
   *            list of values
   * @return a single number
   */
  public double sum(List<Double> a) {
    // calculate the sum of them
    float sum = 0;
    for (int i = 0; i < a.size(); i++) {
      sum += a.get(0);
    }
    return sum;
  }

  /**
   * This method does nothing --- hook
   *
   * @param a
   * @return
   */
  public double doFinalCal(double a) {
    // Do nothing
    return a;
  }

  // Template method
  public double doCal(List<Double> a) {
    double tmp = 0;
    // Step-1:
    // First we calculate the abs values
    List<Double> tmpList = doVectorCal(a);
    // Step-2:
    // We sum them up.
    tmp = sum(tmpList);
    // Step-3:
    // hook
    tmp = doFinalCal(tmp);
    return tmp;
  }
}
