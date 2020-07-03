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

@RestController // 페이지가 들어오면 텍스트를 반환한다 Controller는 뷰를 반환 

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