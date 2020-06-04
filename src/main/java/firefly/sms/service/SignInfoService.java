package firefly.sms.service;

import firefly.sms.bean.SignInfo;
import firefly.sms.mapper.SignInfoMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;

/**
 * @author Firefly
 * @version 1.0
 * @date 2020/6/4 10:56
 */

@Service
public class SignInfoService {


    @Autowired
    SignInfoMapper signInfoMapper;

    public SignInfo getById(String id) {
        return signInfoMapper.getById(id);
    }

}
