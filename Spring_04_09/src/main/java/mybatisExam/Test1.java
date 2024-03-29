package mybatisExam;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.apache.ibatis.session.SqlSession;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;


import mybatis.Singer;
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
	
	public void selectOne1(String name) {
		int count = sqlSession.selectOne("exam.test.SingerMapper.getSingerMember", name);
		System.out.println("그룹 멤버수 : "+count);
		
	}
	
	public void selectOne2(int count) {
		String name = sqlSession.selectOne("exam.test.SingerMapper.getSingerName", count);
		System.out.println("멤버 이름 : " + name);
	}
	
	public void selectOne3(String name, int member) {
		Map<String, Object> paramMap = new HashMap<String, Object>();
		paramMap.put("name", name);
		paramMap.put("member", member);
		String rname = sqlSession.selectOne("exam.test.SingerMapper.getSingerNameMember", paramMap);
		System.out.println(member + "명 그룹이름(map 이용) "+ rname);
	}
	
	public void selectOne4(Singer singer) {
		Singer rsinger = sqlSession.selectOne("exam.test.SingerMapper.getSinger1", singer);
		System.out.println(rsinger);
	}
	
	public void insert(Singer singer) {
		int num = sqlSession.insert("exam.test.SingerMapper.insertSinger", singer);
		System.out.println("inserted "+num+" rows.");
	}
	
	public void selectList(int member) {
		List<Singer> singers = sqlSession.selectList("exam.test.SingerMapper.getSingers", member); 
		
		for(Singer singer:singers)
			System.out.println("group name: "+singer.getName());
	}
	
	public void update(Singer singer) {
		int num = sqlSession.update("exam.test.SingerMapper.updateSinger", singer);
		
		System.out.println("updated "+num+" rows.");
	}
	
	public void delete(String name) {
		int num = sqlSession.delete("exam.test.SingerMapper.deleteSinger", name);
		System.out.println("deleted "+num+" rows.");
	}
	
	public static void main(String[] args) {
		ApplicationContext ctx = new GenericXmlApplicationContext("mapper/bean.xml");
		Test1 test1 = ctx.getBean("test1", Test1.class);
		test1.selectOne();
		test1.selectOne1("BTS");
		test1.selectOne2(2);
		test1.selectOne3("BTS", 7);
		test1.selectOne4(new Singer("BTS", 7));
		
		test1.insert(new Singer("mirim", 7));
		
		// 여러개의 결과를 끌어 낼 수 있음; selectList
		test1.selectList(7);
		
		test1.update(new Singer("mirim", 6));
		test1.delete("mirim");
	}
}
