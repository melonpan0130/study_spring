package exam.member.dao;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

import exam.member.vo.MemberVo;

public class MemberDaoImpl implements MemberDao {
	private static long nextId = 0;
	private Map<String, MemberVo> map = new HashMap<String, MemberVo>();
	
	@Override
	public void insert(MemberVo member) {
		// TODO Auto-generated method stub
		member.setId(++nextId);
		map.put(member.getEmail(), member);
	}

	@Override
	public void update(MemberVo member) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Collection<MemberVo> selectAll() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public MemberVo selectByEmail(String email) {
		// TODO Auto-generated method stub
		return map.get(email);
	}
	
}
