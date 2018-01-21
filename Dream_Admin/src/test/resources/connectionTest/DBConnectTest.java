package connectionTest;

import java.sql.Connection;

import javax.sql.DataSource;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
// @ContextConfiguration(locations={"file:src/main/webapp/WEB-INF/spring/*.xml"})
// �������� root-context.xml�� ���� ������ ���� �ε�
@ContextConfiguration(locations = { "file:src/main/webapp/WEB-INF/spring/root-context.xml" })

public class DBConnectTest {

	@Autowired
	// root-context�� �ִ� DataSource��ü �ܺ�����
	private DataSource ds;

	@Test
	public void testConnection() throws Exception {

		Connection conn = ds.getConnection();
		if(conn != null){
			System.out.println("DataBase���� ����");
			System.out.println("Connection��ü : " + conn);	
		}else{
			System.out.println("root-context.xml DB���� ȯ�漳�� Ȯ�� ���");
		}
	}
}
