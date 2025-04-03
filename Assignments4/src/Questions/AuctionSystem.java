package Questions;
import java.util.*;
class Bid {
    private String bidderName;
    private double amount;
    private String itemName;

    public Bid(String bidderName, double amount, String itemName) {
        this.bidderName = bidderName;
        this.amount = amount;
        this.itemName = itemName;
    }

    public String getBidderName() {
        return bidderName;
    }

    public double getAmount() {
        return amount;
    }

    public String getItemName() {
        return itemName;
    }
}
class Item {
    private String name;
    private PriorityQueue<Bid> bids;

    public Item(String name) {
        this.name = name;
        this.bids = new PriorityQueue<>(Comparator.comparingDouble(Bid::getAmount).reversed());
    }

    public String getName() {
        return name;
    }

    public void placeBid(Bid bid) {
        bids.offer(bid);
    }

    public Optional<Bid> getHighestBid() {
        return Optional.ofNullable(bids.peek());
    }

    public List<Bid> getAllBids() {
        List<Bid> bidList = new ArrayList<>(bids);
        bidList.sort(Comparator.comparingDouble(Bid::getAmount).reversed());
        return bidList;
    }
}
public class AuctionSystem {
    private Map<String, Item> items;

    public AuctionSystem() {
        this.items = new HashMap<>();
    }

    public void addItem(String itemName) {
        items.putIfAbsent(itemName, new Item(itemName));
    }

    public void placeBid(String itemName, String bidderName, double amount) {
        Item item = items.get(itemName);
        if (item != null) {
            item.placeBid(new Bid(bidderName, amount, itemName));
        } else {
            System.out.println("Item not found: " + itemName);
        }
    }

    public void displayHighestBid(String itemName) {
        Item item = items.get(itemName);
        if (item != null) {
            Optional<Bid> highestBid = item.getHighestBid();
            if (highestBid.isPresent()) {
                Bid bid = highestBid.get();
                System.out.println("Highest bid for " + itemName + ": " + bid.getAmount() + " by " + bid.getBidderName());
            } else {
                System.out.println("No bids placed for " + itemName);
            }
        } else {
            System.out.println("Item not found: " + itemName);
        }
    }

    public void displayAllBids(String itemName) {
        Item item = items.get(itemName);
        if (item != null) {
            List<Bid> allBids = item.getAllBids();
            if (!allBids.isEmpty()) {
                System.out.println("All bids for " + itemName + ":");
                for (Bid bid : allBids) {
                    System.out.println(bid.getAmount() + " by " + bid.getBidderName());
                }
            } else {
                System.out.println("No bids placed for " + itemName);
            }
        } else {
            System.out.println("Item not found: " + itemName);
        }
    }

    public static void main(String[] args) {
        AuctionSystem auction = new AuctionSystem();
        auction.addItem("Laptop");
        auction.addItem("Smartphone");
        auction.placeBid("Laptop", "Alice", 1200);
        auction.placeBid("Laptop", "Bob", 1300);
        auction.placeBid("Laptop", "Charlie", 1250);

        auction.placeBid("Smartphone", "David", 800);
        auction.placeBid("Smartphone", "Eve", 850);
        auction.displayHighestBid("Laptop");
        auction.displayHighestBid("Smartphone");
        auction.displayAllBids("Laptop");
        auction.displayAllBids("Smartphone");
    }
}
