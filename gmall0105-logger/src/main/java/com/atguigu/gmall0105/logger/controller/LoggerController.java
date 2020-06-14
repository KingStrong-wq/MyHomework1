package com.atguigu.gmall0105.logger.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

//@Controller
@RestController //标记里面方面都是非网页方式返回
public class LoggerController {
    //一个访问路径对应一个方法
    @RequestMapping("/applog")
    public String log(@RequestBody String log) {
        //两种方式接受参数 1.@RequestParam


        System.out.println(log);
        //没加ResponseBody这里会被认为返回网页
        //会去templates找对应网页模板
        return log;
    }
}
