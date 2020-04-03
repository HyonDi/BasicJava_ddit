package kategorie;

public class KatVO {
	
	private int bigCode;
	private int midCode;
	private int smallCode;//스몰코드 없음!
	
	private String categoryId;
	private String userId;
	//private String sellId; 		//duple //
	private String productId;
	private String productName;
	private String productExplain;
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
	public String getCategoryId() {
		return categoryId;
	}
	public void setCategoryId(String categoryId) {
		this.categoryId = categoryId;
	}
	public String getUserId() {
		return userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}
	public String getProductId() {
		return productId;
	}
	public void setProductId(String productId) {
		this.productId = productId;
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
	public String getProductRegDate() {
		return productRegDate;
	}
	public void setProductRegDate(String productRegDate) {
		this.productRegDate = productRegDate;
	}
	

	
	
}