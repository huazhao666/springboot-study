package org.example.controller;

import org.example.model.JSONArticle;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created with Intellij IDEA
 * Description:
 * User : 花朝
 * Date : 2020-12-26
 * Time : 18:49
 */
@Controller
@RequestMapping("/test")
public class ArticleController {
    @RequestMapping("/1")
    @ResponseBody
    public Object articleAdd(){
        Map<String,String> map = new HashMap<>();
        map.put("title" , "冲鸭");
        map.put("content", "加油");
        return map;
    }

    @RequestMapping("/2")
    @ResponseBody
    public Object login2(){
        JSONArticle js = new JSONArticle();
        js.setSuccess(true);
        js.setCode("LOG001");
        js.setMessage("用户没有登录");
        js.setData(2333);
        return js;
    }

    @RequestMapping("/3")
    @ResponseBody
    public Object articleList(){
        Map<String, Object> map = new HashMap<>();
        map.put("success",true);
        List<Map<String,String>> list =  new ArrayList<>();
        Map<String,String> map1 = new HashMap<>();
        map1.put("id","1");
        map1.put("title","黑色星期五");
        Map<String,String> map2 = new HashMap<>();
        map2.put("id","2");
        map2.put("title","马上干饭");
        list.add(map1);
        list.add(map2);
        map.put("data",list);
        return map;

    }
}
