package question7;

public class Product {

  private String product;
  private Bid bid;

  public Product(String product) {
    setProductName(product);
  }

  public String getProductName() {
    return product;
  }

  public void setProductName(String product) {
    this.product = product;
  }

  public Bid getBid() {
    return bid;
  }

  public void setBid(Bid bid) {
    this.bid = bid;
  }

  public String toString() {
    return getProductName();
  }
}
