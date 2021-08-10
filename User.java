package ladder;

public class User {
	public String name;
	public String loginName;
	public String passwd;
	public int point;

	public boolean checkLogin(String loginName, String passwd) {
		if (loginName.equals(this.loginName) && passwd.equals(this.passwd)) {
			return true;
		} else {
			return false;
		}
	}
	public boolean checkLogin(User user) {
		if (user.loginName.equals(this.loginName) && user.passwd.equals(this.passwd)) {
			return true;
		} else {
			return false;
		}
	}
}

//ranking system
	switch (rank);
	{
	case '1'
		System.out.print("入门")
		break；
	case '2'
		System.out.print("青铜")
		break；
	case '3'
		System.out.print("白银")
		break；
	}

	