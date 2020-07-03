package Member.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataAccessException;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import Member.DAO.IMemberDAO;
import Member.model.MemberVO;

@Service("memberService")
@Transactional(propagation = Propagation.REQUIRED)
public class MemberServiceImpl implements IMemberService<MemberVO> {
	@Autowired
	private IMemberDAO<MemberVO> memberDAO;

	@Override
	public List<MemberVO> selectAll() throws DataAccessException {
		// TODO Auto-generated method stub
		return memberDAO.selectAll();
	}

	@Override
	public int insert(MemberVO t) throws DataAccessException {
		// TODO Auto-generated method stub
		return memberDAO.insert(t);
	}

	@Override
	public int delete(String id) throws DataAccessException {
		// TODO Auto-generated method stub
		return memberDAO.delete(id);
	}

	@Override
	public int update(MemberVO t) throws DataAccessException {
		// TODO Auto-generated method stub
		return  memberDAO.update(t);
	}

}
