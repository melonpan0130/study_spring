package exam.member.dao;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

import org.springframework.stereotype.Component;

import exam.member.vo.MemberVo;

@Component
public class MemberDaoImpl implements MemberDao {
	private static long nextId = 0;
	private Map<String, MemberVo> map = new HashMap<String, MemberVo>();
	
	@Override
	public void insert(MemberVo member) {
		member.setId(++nextId);
		map.put(member.getEmail(), member);
	}

	@Override
	public void update(MemberVo member) {
		// id가 같아서?
		map.put(member.getEmail(), member);
	}

	@Override
	public Collection<MemberVo> selectAll() {
		return map.values();
	}

	@Override
	public MemberVo selectByEmail(String email) {
		return map.get(email);
	}
	
}
