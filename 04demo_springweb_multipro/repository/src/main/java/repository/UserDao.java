package repository;

import com.alibaba.fastjson.JSONObject;
import model.User;
import org.springframework.stereotype.Repository;

@Repository
public class UserDao {
    public String getUser(Long id){
        return JSONObject.toJSONString(new User(id,"小明"));
    }
}