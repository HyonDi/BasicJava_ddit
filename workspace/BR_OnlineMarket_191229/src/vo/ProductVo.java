package vo;
//ch Yun 20191224
public class ProductVo {
	private int productid;
	private String producttype;
	private String name;
	private String explanation;
	private int price;
	private int stock;
	
	
	public void Product(int productid, String producttype, String name, String explanation,
			int price, int stock){
		this.productid = productid;
		this.producttype = producttype;
		this.name = name;
		this.explanation = explanation;
		this.price = price;
		this.stock = stock;
	
	}
	public String getProducttype() {
		return producttype;
	}
	public void setProducttype(String producttype) {
		this.producttype = producttype;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getExplanation() {
		return explanation;
	}
	public void setExplanation(String explanation) {
		this.explanation = explanation;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public int getStock() {
		return stock;
	}
	public void setStock(int stock) {
		this.stock = stock;
	}
	public int getProductid() {
		return productid;
	}
	public void setProductid(int productid) {
		this.productid = productid;
	}
	
}