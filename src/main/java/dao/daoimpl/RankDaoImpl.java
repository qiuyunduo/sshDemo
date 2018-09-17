package dao.daoimpl;

import dao.IRankDao;
import entity.Rank;
import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.criterion.Example;
import org.hibernate.query.Query;
import org.springframework.stereotype.Repository;

import javax.annotation.Resource;
import java.util.List;

/**
 * @Author: qiuyunduo
 * @Description: null
 * @Date: Created in 下午8:04 18-9-14
 * @Modified: null
 */
@Repository
public class RankDaoImpl implements IRankDao {

    @Resource
    private SessionFactory sessionFactory;


    @Override
    public void test() {
        System.out.println("hell world!!!");
        Session session = sessionFactory.openSession();
        Rank rank = new Rank();
        rank.setId(13);
        rank.setLevel(13);
        rank.setName("天使");
        session.save(rank);
        rank = session.get(Rank.class,2);
        Query from_rank = session.createQuery("from Rank");
        List<Rank> rankList = from_rank.list();
        System.out.println(rankList.toString());
        System.out.println(rank.toString());
    }
}
