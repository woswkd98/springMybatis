package Member.DAO;

import java.util.List;

import org.springframework.dao.DataAccessException;

public interface IMemberDAO<T> {
	public List<T> selectAll() throws DataAccessException;
	public int insert(T t) throws DataAccessException;
	public int delete(String id) throws DataAccessException;
	public int update(T t) throws DataAccessException;
}
