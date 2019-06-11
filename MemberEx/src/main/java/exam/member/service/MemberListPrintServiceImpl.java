package exam.member.service;

import java.util.Collection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import exam.member.dao.MemberDao;
import exam.member.vo.MemberVo;

@Component
public class MemberListPrintServiceImpl implements MemberListPrintService {
	// DAO class 선언
	private MemberDao memberDao;
	private MemberPrinterService memberPrinter;
	
	@Autowired
	public MemberListPrintServiceImpl(MemberDao memberDao, MemberPrinterService memberPrinter) {
		this.memberDao = memberDao;
		this.memberPrinter = memberPrinter;
	}
	
	// set
	@Override
	public void printAll() {
		Collection<MemberVo> members = memberDao.selectAll();
		for(MemberVo member : members) {
			memberPrinter.print(member);
		}
	}

}
