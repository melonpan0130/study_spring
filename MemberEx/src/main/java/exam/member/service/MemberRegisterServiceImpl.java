package exam.member.service;

import java.util.Date;

import exam.member.dao.MemberDao;
import exam.member.vo.MemberVo;
import exam.member.vo.RegisterRequest;

public class MemberRegisterServiceImpl implements MemberRegisterService{
	private MemberDao memberDao;
	
	public MemberRegisterServiceImpl(MemberDao memberDao) {
		this.memberDao = memberDao;
	}
	
	@Override
	public void register(RegisterRequest  req) {
		// 1. 기존에 같은 이메일이 있는지 검사
		// -> 있으면 X, 없으면 memberDao의 insert() 호출 
		MemberVo member = memberDao.selectByEmail(req.getEmail());
		
		if(member != null) {
			// 이미 가입되어있는 상황
		}
		
		MemberVo newMember = new MemberVo(req.getEmail(), req.getPassword(), req.getName(), new Date());
		memberDao.insert(newMember);
	}

}
