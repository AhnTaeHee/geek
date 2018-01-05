package net.pinnode.study.study;

//jdbc 연결
import java.sql.DriverManager;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.mysql.jdbc.Connection;
import com.mysql.jdbc.Driver;

@RunWith(SpringRunner.class)
@SpringBootTest
public class StudyApplicationTests {

	private static final String driver = "com.mysql.jdbc.Driver";
	private static final String url = "jdbc:mysql://127.0.0.1:3306/article?udrDDL=false";
	private static final String user = "root";
	private static final String pw = "1234";
	@Test
	public void contextLoads() throws Exception{
		
		Class.forName(driver);
		
		try(Connection con = (Connection) DriverManager.getConnection(url,user,pw)){
			System.out.println(con);
		}catch(Exception e) {
			e.printStackTrace();
		}
	}

}
