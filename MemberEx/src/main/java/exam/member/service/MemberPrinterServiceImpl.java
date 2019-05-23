package exam.member.service;

import exam.member.vo.MemberVo;

public class MemberPrinterServiceImpl implements MemberPrinterService{

	@Override
	public void print(MemberVo member) {
		System.out.println("id : "+member.getId()+", email : "+member.getEmail()+", name : "+member.getName()+", date : "+member.getRegisterDate());
	}
	
}
