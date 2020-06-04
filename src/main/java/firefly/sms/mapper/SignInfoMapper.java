package firefly.sms.mapper;

import firefly.sms.bean.SignInfo;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

/**
 * @author Firefly
 * @version 1.0
 * @date 2020/6/3 23:11
 */

//@Mapper
@Repository
public interface SignInfoMapper {

    SignInfo getById(String id);

}
