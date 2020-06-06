package firefly.sms.service;

import firefly.sms.bean.SignInfo;
import firefly.sms.mapper.SignInfoMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.List;

/**
 * @author Firefly
 * @version 1.0
 * @date 2020/6/4 10:56
 */

@Service
public class SignInfoService {


    final
    SignInfoMapper signInfoMapper;

    @Autowired
    public SignInfoService(SignInfoMapper signInfoMapper) {
        this.signInfoMapper = signInfoMapper;
    }

    public SignInfo getById(String id) {
        return signInfoMapper.getById(id);
    }


    boolean delById(String id) {
        if (getById(id) == null) {
            return false;
        }
        return signInfoMapper.delById(id);
    }

    public int addOne(SignInfo signInfo) {
        System.out.println(signInfo);
        return signInfoMapper.addOne(signInfo);
    }

    public List<SignInfo> getAll() {
        return signInfoMapper.getAll();
    }

}
