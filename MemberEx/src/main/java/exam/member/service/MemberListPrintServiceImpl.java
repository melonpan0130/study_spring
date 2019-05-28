package exam.member.service;

import java.util.Collection;

import exam.member.dao.MemberDao;
import exam.member.vo.MemberVo;

public class MemberListPrintServiceImpl implements MemberListPrintService {
	// DAO class 선언
	private MemberDao memberDao;
	private MemberPrinterService memberPrinter;
	
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
