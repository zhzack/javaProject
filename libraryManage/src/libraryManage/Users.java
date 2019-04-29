package libraryManage;

public class Users {
	private String username;
	private String password;
	public int booknumber;
	//public int bookQuantity;//所借书的数量
	static Book[] userbooks=new Book[3];
	public Users(String username, String password) {
		super();
		this.username = username;
		this.password = password;
		this.booknumber=0;//所借书的数量
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	@Override
	public String toString() {
		return username + password;
	}

}
