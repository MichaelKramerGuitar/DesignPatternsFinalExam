package question7;

public class Bid {

  private float bid;

  public Bid(float bid) {
    setBid(bid);
  }

  public float getBid() {
    return bid;
  }

  public void setBid(float bid) {
    this.bid = bid;
  }

  public String toString() {
    return Float.toString(bid);
  }
}
