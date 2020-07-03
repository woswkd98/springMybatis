package Member.DAO;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.dao.DataAccessException;
import org.springframework.stereotype.Repository;

import Member.model.MemberVO;

@Repository("memberDAO")
public class MemberDAOImpl  implements IMemberDAO<MemberVO> {
	@Autowired
	private SqlSession sqlSession;
	

	@Override
	public List<MemberVO> selectAll() throws DataAccessException {
		// TODO Auto-generated method stub
		List<MemberVO> memberList = null;
		memberList = sqlSession.selectList("mapper.member.selectAll");
		return memberList;
	}

	@Override
	public int insert(MemberVO t) throws DataAccessException {
		int result = sqlSession.insert("mapper.member.insert",t);
		return result;
	}

	@Override
	public int delete(String id) throws DataAccessException {
		// TODO Auto-generated method stub
		return sqlSession.delete("mapper.member.delete", id);
	}

	@Override
	public int update(MemberVO t) throws DataAccessException {
		// TODO Auto-generated method stub
		return sqlSession.update("mapper.member.update", t);
	}

}
