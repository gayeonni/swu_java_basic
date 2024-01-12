package equals.str;

public class User {
	public String id;
	public String pw;
	
	// 생성자는 필수 필드값을 받기 위해 사용한다.
	public User(String upw) {
		pw = upw;
	}
}
