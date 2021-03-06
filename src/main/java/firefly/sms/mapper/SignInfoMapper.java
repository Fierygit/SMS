package firefly.sms.mapper;

import firefly.sms.bean.SignInfo;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * @author Firefly
 * @version 1.0
 * @date 2020/6/3 23:11
 */

//@Mapper
@Repository
public interface SignInfoMapper {

    SignInfo getById(String id);

    boolean delById(String id);

    int addOne(SignInfo signInfo);

    List<SignInfo> getAll();

}
