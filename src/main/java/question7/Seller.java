package question7;

import java.util.HashMap;
import java.util.Map;

public class Seller implements AuctionSystem {

  Map<String, Buyer> buyerMap = new HashMap<>();


  public void registerBuyer(Buyer b) {
    if (!buyerMap.containsKey(b.getBuyerName())) {
      buyerMap.put(b.getBuyerName(), b);
    }
  }

  public void unregisterBuyer(Buyer b) {
    buyerMap.remove(b.getBuyerName(), b);
  }

  public void notifyObservers(String driverName, Bid bid) {
    for (Map.Entry<String, Buyer> entry : buyerMap.entrySet()) {
      // if not the same driver
      if (entry.getKey().equals(driverName)) {
        System.out.println("[Broadcast to all buyers] ---------->  NEW BID for:\n"
           + bid);
      } else {
        entry.getValue().setLatestBid(bid);
      }
    }
  }

}
