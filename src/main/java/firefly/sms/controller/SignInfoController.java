package firefly.sms.controller;

import firefly.sms.bean.SignInfo;
import firefly.sms.bean.SignInfoDto;
import firefly.sms.mapper.SignInfoMapper;
import firefly.sms.service.SignInfoService;
import firefly.sms.util.JsonResult;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.*;

import java.util.Date;
import java.util.List;

/**
 * @author Firefly
 * @version 1.0
 * @date 2020/6/3 23:36
 */


@Api(tags = "签到系统接口", value = "提供起到系统的访问")
@RestController
@RequestMapping(path = "/sign")
public class SignInfoController {

    final
    SignInfoService signInfoService;

    @Autowired
    public SignInfoController(SignInfoService signInfoService) {
        this.signInfoService = signInfoService;
    }

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

    @ApiOperation("根据 id  删除 一条信息")
    @GetMapping("/del/{id}")
    public boolean delById(@PathVariable("id") String id) {
        return true;
    }

    @ApiOperation("增加一条信息")
    @PostMapping("/addOne")
    JsonResult<Integer> addOne(SignInfoDto signInfo) {
        SignInfo tmp = new SignInfo(signInfo);
        tmp.setDate(new Date());
        return JsonResult.successMessage(Integer.valueOf(signInfoService.addOne(tmp)).toString());
    }

    @ApiOperation("获取所有信息")
    @GetMapping("/getAll")
    JsonResult<List<SignInfo>> getAll() {
        return JsonResult.success(signInfoService.getAll());
    }

}
