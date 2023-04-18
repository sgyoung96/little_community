package smoim.com.sim.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import smoim.com.sim.dao.TestDao;

@Service("TestService")
public class TestService {

	@Autowired
	TestDao dao;
}
