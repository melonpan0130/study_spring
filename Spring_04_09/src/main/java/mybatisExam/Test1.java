package mybatisExam;

import org.apache.ibatis.session.SqlSession;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;
// java bean
public class Test1 {
	private SqlSession sqlSession;
	
	public Test1(SqlSession sqlSession){
		this.sqlSession=sqlSession;
	}
	
	public void selectOne() {
		int count = sqlSession.selectOne("exam.test.SingerMapper.getSingerCount");
		System.out.println("그룹 수: "+count);
	}
	
	public void selectOne1() {
		
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext ctx = new GenericXmlApplicationContext("mapper/bean.xml");
		Test1 test1 = ctx.getBean("test1", Test1.class);
		test1.selectOne();
	}

}
