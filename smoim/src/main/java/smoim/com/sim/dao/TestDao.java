package smoim.com.sim.dao;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository("TestDao")
public class TestDao {
	
	@Autowired
	SqlSession sqlSession;
}
