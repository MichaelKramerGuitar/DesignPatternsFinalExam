package question7;

public class Main {

  public static void main(String[] args) {

    Buyer michael = new Buyer("michael");
    Buyer glennys = new Buyer("glennys");

    Seller ebay = new Seller();

    ebay.registerBuyer(michael);
    ebay.registerBuyer(glennys);

    Product michaelStratocaster = new Product("stratocaster");
    Product glennysStratocaster = new Product("stratocaster");

    Bid michaelBid = new Bid(100);
    michaelStratocaster.setBid(michaelBid);
    michael.setLatestBid(michaelStratocaster.getBid());

    Bid glennysBid = new Bid(110);
    glennysStratocaster.setBid(glennysBid);
    glennys.setLatestBid(glennysStratocaster.getBid());

    michael.setMyBid(ebay, michaelStratocaster.getBid());
    glennys.setMyBid(ebay, glennysStratocaster.getBid());
  }
}
