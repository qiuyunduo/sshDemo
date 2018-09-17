package action;

import com.alibaba.fastjson.JSON;
import com.opensymphony.xwork2.ActionContext;
import entity.Rank;
import org.apache.struts2.convention.annotation.*;
import org.springframework.beans.factory.annotation.Autowired;
import service.IRankService;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


/**
 * @Author: qiuyunduo
 * @Description: 前台与后台利用ajax进行数据交互
 * @Date: Created in 下午12:53 18-9-15
 * @Modified: null
 */
@ParentPackage(value="json-default")
@Namespace("/index")
@Results({
        @Result(type = "json")
})
public class IndexAction {

    private Map<String,Object> dataMap;
    private String test;

    public String getTest() {
        return test;
    }

    public void setTest(String test) {
        this.test = test;
    }

    public Map<String, Object> getDataMap() {
        return dataMap;
    }

    public void setDataMap(Map<String, Object> dataMap) {
        this.dataMap = dataMap;
    }

    @Action(value = "test",results = {@Result(type = "json",name = "ajax",params = {"root","{test,dataMap,rank}"})})
    public String delete(){
        Rank rank1 = new Rank();
        rank1.setId(1);
        rank1.setLevel(1);
        rank1.setName("初出茅庐");
        Rank rank2 = new Rank();
        rank2.setId(2);
        rank2.setLevel(2);
        rank2.setName("初见镇长");
        List<Rank> ranks = new ArrayList<>();
        ranks.add(rank1);
        ranks.add(rank2);
        this.test= "hhhhh";
        this.dataMap = new HashMap<>();
        dataMap.put("message","hello world");
        dataMap.put("rank1",rank1);
        dataMap.put("ranks",ranks);
        System.out.println("进入了deleet方法");
        return "ajax";
    }
}
