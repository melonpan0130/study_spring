package exam.member.service;

import exam.member.dao.MemberDao;
import exam.member.vo.MemberVo;

public class MemberChangeServiceImpl implements MemberChangeService{
	private MemberDao memberDao;
	
	public void MemberChangeServiceImpl(MemberDao memberDao) {
		this.memberDao = memberDao;
	}
	
	@Override
	public void changePassword(String email, String oldPassword, String newPassword) {
		MemberVo member = memberDao.selectByEmail(email);
		if(member.getPassword().equals(oldPassword))
			if(!member.getPassword().equals(oldPassword)) 
				System.out.println("Error");
			else 
				member.setPassword(newPassword);
	}

}
