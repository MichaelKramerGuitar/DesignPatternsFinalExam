package question7;

public class Buyer {

  private String buyerName;
  private Product product;
  private Bid latestBid;

  public Buyer(String name) {
    setBuyerName(name);
  }

  public String getBuyerName() {
    return buyerName;
  }

  public Bid getLatestBid() {
    return latestBid;
  }

  public void setBuyerName(String name) {
    this.buyerName = name;
  }

  public void setLatestBid(Bid bid) {
    this.latestBid = bid;
  }
  public void setMyBid(Seller seller, Bid bid) {

    System.out.println(this.buyerName + " Old bid: "
        + this.getLatestBid()
        + " being updated to: "
        + bid);
    // inform other buyers about my latest bid
    seller.notifyObservers(this.buyerName, bid);
  }
}
