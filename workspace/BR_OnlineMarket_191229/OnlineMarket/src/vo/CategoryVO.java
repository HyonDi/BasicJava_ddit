package vo;

//hh.joo 20191225 add
public class CategoryVO {
	
	//reference : 11st.co.kr : main display
	/*
	 * |bigCode				|midCode		|smallCode		|productName
	 * |0:brand fashion		|0:brand female |0:one-piece	|
	 * |0:brand fashion		|0:brand female |1:blouse		|
	 * |0:brand fashion		|0:brand female |2:t-shirt		|
	 * 
	 * 
	 * 
	 * |1:clothes			|				|		|
	 * |2:beauty			|				|		|
	 * |3:leisure/car		|				|		|
	 * |4:food				|				|		|
	 * |5:baby				|				|		|
	 * |6:life/health		|				|		|
	 * |7:furniture			|				|		|
	 * |8:digital			|				|		|
	 * |9:book/pet			|				|		|
	 * |10:trip				|				|		|
	 */
	
	private int bigCode;
	private int midCode;
	private int smallCode;
	
	private int categoryId = 0;		//primary key
	private String userId;
	//private String sellId;	//duple //
	private int productId;
	private String productType;
	private String productName;
	private String productExplain;
	private int productPrice;
	private int productQuantity; 
	private String productRegDate;
	public int getBigCode() {
		return bigCode;
	}
	public void setBigCode(int bigCode) {
		this.bigCode = bigCode;
	}
	public int getMidCode() {
		return midCode;
	}
	public void setMidCode(int midCode) {
		this.midCode = midCode;
	}
	public int getSmallCode() {
		return smallCode;
	}
	public void setSmallCode(int smallCode) {
		this.smallCode = smallCode;
	}
	public int getCategoryId() {
		return categoryId;
	}
	public void setCategoryId(int categoryId) {
		this.categoryId = categoryId;
	}
	public String getUserId() {
		return userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}
	public int getProductId() {
		return productId;
	}
	public void setProductId(int productId) {
		this.productId = productId;
	}
	public String getProductType() {
		return productType;
	}
	public void setProductType(String productType) {
		this.productType = productType;
	}
	public String getProductName() {
		return productName;
	}
	public void setProductName(String productName) {
		this.productName = productName;
	}
	public String getProductExplain() {
		return productExplain;
	}
	public void setProductExplain(String productExplain) {
		this.productExplain = productExplain;
	}
	public int getProductPrice() {
		return productPrice;
	}
	public void setProductPrice(int productPrice) {
		this.productPrice = productPrice;
	}
	public int getProductQuantity() {
		return productQuantity;
	}
	public void setProductQuantity(int productQuantity) {
		this.productQuantity = productQuantity;
	}
	public String getProductRegDate() {
		return productRegDate;
	}
	public void setProductRegDate(String productRegDate) {
		this.productRegDate = productRegDate;
	}

	public String toString() {
		
		StringBuffer sb = new StringBuffer();
		
		sb.append("[Category id:").append(categoryId).append(" | ");
		
		sb.append("User id:").append(userId).append(" | ").append("ProductName:").append(productName).append(" | ");
		
		sb.append("Price:").append(productPrice).append(" | ").append("Expalin").append(productExplain).append(" | ");
		
		sb.append("regDate:").append(productRegDate);
		
		return sb.toString();
		
	}
		
	
	
}
