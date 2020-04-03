package vo;

public class UserVO {//VO는 변수와 게터세터로 만듭니다.

	private String id;
	private String password;
	private String name;
	
	//게터세터
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
}
