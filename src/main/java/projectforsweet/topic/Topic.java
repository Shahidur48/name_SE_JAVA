package projectforsweet.topic;

public class Topic {
	
	private String name;
	private String price;
	private String profit_percentage;
	private String product_type;
	
	
	public Topic() {
		
	}
	
	public Topic(String name, String price, String profit_percentage, String product_type) {
		super();
		this.name = name;
		this.price = price;
		this.profit_percentage = profit_percentage;
		this.product_type = product_type;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPrice() {
		return price;
	}
	public void setPrice(String price) {
		this.price = price;
	}
	public String getProfit_percentage() {
		return profit_percentage;
	}
	public void setProfit_percentage(String profit_percentage) {
		this.profit_percentage = profit_percentage;
	}
	public String getProduct_type() {
		return product_type;
	}
	public void setProduct_type(String product_type) {
		this.product_type = product_type;
	}
	

}
