package action;

import org.apache.struts2.convention.annotation.*;
import org.springframework.beans.factory.annotation.Autowired;
import service.IRankService;


/**
 * @Author: qiuyunduo
 * @Description: null
 * @Date: Created in 下午12:53 18-9-15
 * @Modified: null
 */
@ParentPackage(value="struts-default")
@Namespace("/rank")
@Result(name = "delete",location = "/delete.jsp")
public class RankAction{

    @Autowired
    private IRankService rankService;

    @Action(value="test",
            results={@Result(name="success",location="/index.jsp"),
                    @Result(name="error",location="/error.html")})

    public String test(){
        System.out.println("进入了RankAction");
        rankService.test();
        System.out.println("执行了RankServiceImpl中的方法");
        int number = (int) (Math.random()*10);
        System.out.println(number);
        if(number > 5){
            return "error";
        }else {
            return "success";
        }


    }


    @Action("delete")
    public String delete(){
        System.out.println("进入了deleet方法");
        return "delete";
    }
}
