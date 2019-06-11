package exam.member.service;

import org.springframework.stereotype.Component;

import exam.member.vo.MemberVo;

@Component
public class MemberPrinterServiceImpl implements MemberPrinterService{

	@Override
	public void print(MemberVo member) {
		System.out.println("id : "+member.getId()+", email : "+member.getEmail()+", name : "+member.getName()+", pw : "+member.getPassword()+", date : "+member.getRegisterDate());
	}
	
}
