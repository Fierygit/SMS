package firefly.sms.controller;

import firefly.sms.bean.SignInfo;
import firefly.sms.mapper.SignInfoMapper;
import firefly.sms.service.SignInfoService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.*;

/**
 * @author Firefly
 * @version 1.0
 * @date 2020/6/3 23:36
 */


@Api(tags = "签到系统接口", value = "提供起到系统的访问")
@RestController
@RequestMapping(path = "/sign")
public class SignInfoController {

    @Autowired
    SignInfoService signInfoService;

    @ApiOperation("测试 api helloworld")
    @GetMapping("/hello")
    public String test() {
        return "hello world";
    }

    @ApiOperation("根据 id  获取 一条信息")
    @GetMapping("/get/{id}")
    public SignInfo getById(@PathVariable("id") String id) {
        SignInfo res = signInfoService.getById(id);
        if (res == null) return new SignInfo();
        return res;
    }

}
