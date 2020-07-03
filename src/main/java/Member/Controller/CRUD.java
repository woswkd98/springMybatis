package Member.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import Member.Service.IMemberService;
import Member.model.MemberVO;

@RestController // �������� ������ �ؽ�Ʈ�� ��ȯ�Ѵ� Controller�� �並 ��ȯ 

public class CRUD {
	@Autowired
    private IMemberService<MemberVO> memberService;

    @RequestMapping(value = "/create" , method = RequestMethod.POST)
    public int insert(@RequestBody MemberVO user)  {
    	System.out.println("asedf");
        return memberService.insert(user);
    } 
    @ResponseBody
    @RequestMapping("/read")
    public  List<MemberVO> read() {
    	List<MemberVO> users = memberService.selectAll();
        return users;
    }

    @RequestMapping("/update")
    public int update(@RequestBody MemberVO user) {
        return memberService.update(user);
    }


    @RequestMapping("/delete")
    public int delete(@RequestBody MemberVO user) {
        return memberService.delete(user.getName());
    }

    

}   