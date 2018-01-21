package connectionTest;

import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

//SqlSession��ü Ȯ��!! ----> iBatis�� SqlMapClient ����

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration
(locations={"file:src/main/webapp/WEB-INF/spring/root-context.xml"})
public class MybatisTest {
  
  @Autowired
  private SqlSessionFactory sqlFactory;	
  //root-context.xml �� SqlSessionFactoryBean��ü�� ����
	
  @Test
  public void testFactory(){
	  if(sqlFactory != null){
		  System.out.println("sqlSessionFactory��ü ���� ����");
		  System.out.println("SqlFactory: "+ sqlFactory);  
	  }else{
		  System.out.println("sqlSessionFactory��ü ���� ����");
		  System.out.println("root-context DB���� ȯ�漳�� Ȯ�� ���");
	  }
  }	
	
  @Test
  public void testSession()throws Exception{
	 SqlSession sqlSession = sqlFactory.openSession(); 
	 //iBatis (SqlMapClient)  ==  MyBatis (SqlSession)
	 System.out.println("Session: "+ sqlSession);
  }	
}








