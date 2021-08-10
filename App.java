package ladder;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class App {
	public static Game[] games = new Game[10];

	public static void main(String[] args) {
		// д����Ŀ
		Project[] projects = new Project[10];
		Project proj = new Project();
		proj.name = "����ʵѵ����";
		proj.desc = "�����Ҫ����װ�����»���";
		proj.mark = 
		projects[0] = proj;
		proj = new Project();
		proj.name = "˼ά��ͼ";
		proj.desc = "�ҳ��ؼ��༰�����ԣ���Ϊ";
		projects[1] = proj;
		
		project[2] = proj;
		proj.name = "����ʵѵ����";
		proj.desc = "�����Ҫ����װ�����»���";
		proj.mark = 

		// ����ÿ����Ŀ
		for (int x = 0; x < projects.length; x++) {
			if (projects[x] != null) {
				System.out.println(projects[x].name);
			}
		}
		
		
		// д���û�
		User[] users = new User[10];
		User user = new User();
		user.name = "��������Ա";
		user.loginName = "228228";
		user.passwd = "225225";
		users[0] = user;
		user = new User();
		user.name = "ChaoHe";
		user.loginName = "ChaoHe";
		user.passwd = "ChaoHe225";
		users[1] = user;
		// �û���¼
		User loginuser = new User();
		loginuser.loginName = "ChaoHe";
		loginuser.passwd = "ChaoHe225";
		/*
		 * System.out.println("������loginName"); BufferedReader buf = new
		 * BufferedReader(new InputStreamReader(System.in)); try { loginuser.loginName =
		 * buf.readLine(); } catch (IOException e) { e.printStackTrace(); }
		 * System.out.println("������passwd"); buf = new BufferedReader(new
		 * InputStreamReader(System.in)); try { loginuser.passwd = buf.readLine(); }
		 * catch (IOException e) { e.printStackTrace(); }
		 */
		boolean flgLogin = false;
		for (int x = 0; x < users.length; x++) {
			// method overloading
			if (users[x] != null && users[x].checkLogin(loginuser.loginName, loginuser.passwd)) {
				loginuser = users[x];
				flgLogin = true;
				break;
			}
		}
		if (flgLogin) {
			System.out.println(loginuser.name + "��¼�ɹ���");
		} else {
			System.out.println(loginuser.loginName + "��¼ʧ�ܣ������û����������Ƿ���ȷ��");
		}
		// д��loginuser�����ɼ�

		Game game = new Game();
		game.user = loginuser;
		game.project = projects[0];
		
		// loginuser�ύ��Ŀ
		//String err = game.submit("loginuser�ύ��Ŀ");
		//if (err.length() > 0) {
		//	System.out.println(err);
		//} else {
			// ��loginuser����
		//	err = game.score("�ύ��Ŀ����", 200);
		//	if (err.length() > 0) {
		//		System.out.println(err);
		//	}
		//}
		
		games[0] = game;
		System.out.println(game.user.name + "ͬѧ�ڡ�" + game.project.name + "����Ŀ�л��" + game.point + "��");
		// loginuser�μӵڶ�����Ŀ
		game = new Game();
		game.user = loginuser;
		game.project = projects[1];
		// loginuser�ύ��Ŀ
		err = game.submit("loginuser�ύ��Ŀ2");
		if (err.length() > 0) {
			System.out.println(err);
		} else {
			// ��loginuser����
			err = game.score("�ύ��Ŀ2����", 180);
			if (err.length() > 0) {
				System.out.println(err);
			}
		}
		games[1] = game;
		// �������б���
		System.out.println(game.user.name + "ͬѧ�ڡ�" + game.project.name + "����Ŀ�л��" + game.point + "��");
		for (int x = 0; x < games.length; x++) {
			if (games[x] != null) {
				System.out.println(games[x].user.name + "ͬѧ�ڡ�" + games[x].project.name + "����Ŀ�л��" + games[x].point + "��");
			}
		}
	}
}


//new projects, users and games
public class Ladder {

	 public static void main(String[] args) {

	  int i;
	  //new users
	  User user[] = {};
	  for( i = 0; i < 5; i++) {
	   user[i] = new User();
	  }
	  
	  //new projects
	  Project project[] = {};
	  for( i = 0; i < 3; i++) {
	   project[i] = new Project(); 
	  }
	  
	  //new 10 games, distributing them to projects randomly
	  Game game[] = {};
	  for( i = 0; i < 10; i++) {
	   game[i] = new Game();   
	  }
	  
	  int flg[] = {};
	  for( i = 0; i < 5; i++) {
	   flg[i] = user[i].point / 300;
	  }
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	 }

	}
		