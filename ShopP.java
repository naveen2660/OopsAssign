package oops;

public class ShopP {

	public static void main(String[] args) {
		
 
	}

}
 class icecream extends dessert {
	private double cost;
	
	public icecream(String name,double cost) {
		super(name);
		this.cost=cost;
	}

	@Override
	public double getcost() {
		// TODO Auto-generated method stub
		return cost;
	}

	@Override
	public double getTax() {
		// TODO Auto-generated method stub
		return 0.1*getcost();
	}

	@Override
	public String currency() {
		// TODO Auto-generated method stub
		return "rupees";
	}
	
}
 class candy extends dessert {
	
	private double candyWeight;
	private double candyPrice;// Candy constructor takes a String for name & double for weight in lbs.// and price per lb.
	private Object dollar;
	
	public candy(String name, double candyWeight, double candyPrice, Object dollar) {
		super(name);
		this.candyWeight = candyWeight;
		this.candyPrice = candyPrice;
		this.dollar=dollar;
	}
	public double getWeightInPounds() {
		return candyWeight;
	}
	public double getPricePerPound() {
		return candyPrice;
	}
	@Override
	public double getcost() {
		// TODO Auto-generated method stub
		double cost = (double) Math.round(candyPrice * candyWeight);
		return cost;
	}
	@Override
	public double getTax() {
		// TODO Auto-generated method stub
		return 0.1*getcost();
	}
	@Override
	public double currency() {
		// TODO Auto-generated method stub
		return (double) (dollar=60);
	}
	
}
 class cookie extends dessert {
	
	private int cookieCount;
	private double cookiePrize;
	
	public cookie(String name, int cookieCount, double cookiePrize) {
		super(name);
		this.cookieCount = cookieCount;
		this.cookiePrize = cookiePrize;
	}
	public double getItemCount() {
		return cookieCount;
	}
	public double getPricePerDozen() {
		return cookiePrize;
	}
	@Override
	public double getcost() {
		// TODO Auto-generated method stub
		double cost = (double) Math.round(cookiePrize * cookieCount / 12);
		return cost;
	}
	@Override
	public double getTax() {
		// TODO Auto-generated method stub
		return 0.1*getcost();
	}
	@Override
	public String currency() {
		// TODO Auto-generated method stub
		return "euro";
	}
}
 abstract class dessert {
	protected final String name;
	
	public dessert(String name) {
		this.name=name;
	}
	public final String getName() {
		return name;
	}
	public abstract double getcost();
	public abstract double getTax();
	public abstract double currency();
}