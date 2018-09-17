package service.serviceimpl;

import dao.IRankDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import service.IRankService;

/**
 * @Author: qiuyunduo
 * @Description: null
 * @Date: Created in 下午8:02 18-9-14
 * @Modified: null
 */
@Service
public class RankServiceImpl implements IRankService{
    @Autowired
    private IRankDao rankDao;

    @Override
    public void test() {
        rankDao.test();
    }
}
