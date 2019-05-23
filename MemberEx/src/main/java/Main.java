import exam.member.dao.MemberDao;
import exam.member.dao.MemberDaoImpl;
import exam.member.service.MemberRegisterService;
import exam.member.service.MemberRegisterServiceImpl;
import exam.member.ui.MemberUI;

public class Main {

	public static void main(String[] args) {
		MemberDao memberDao = new MemberDaoImpl();
		MemberRegisterService memberRegisterService = new MemberRegisterServiceImpl(memberDao);
		MemberUI memberUI = new MemberUI();
		memberUI.setMemberRegisterService(memberRegisterService);
		memberUI.showMenu();
	}

}
