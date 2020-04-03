package vo;

public class PayVO extends UserVO {
	private String payId;

	public String getPayId() {
		return payId;
	}

	public void setPayId(String payId) {
		this.payId = payId;
	}
	
	private int price; 
	private int type;
	private int plz;
	private int address;
	private int date;
	private int state;

	
}
