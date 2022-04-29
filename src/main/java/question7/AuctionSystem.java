package question7;

public interface AuctionSystem {

  void registerBuyer(Buyer b);

  void unregisterBuyer(Buyer b);

  void notifyObservers(String buyerName, Bid b);
}
