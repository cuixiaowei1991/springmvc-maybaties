package com.ycy.controller;

import com.ycy.common.Utils;
import com.ycy.model.KeyWord;
import com.ycy.service.KeyWordservice;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/**
 * Created by cuixiaowei on 2016/10/28.
 */
@Controller
public class KeyWordController {


    @Autowired
    private KeyWordservice keyWordservice;

    private static Logger logger = Logger
            .getLogger(KeyWordController.class);
    /**
     * 添加关键字
     * @param source
     * @param model
     * @return
     */
    @RequestMapping(value="/addKeyWord",method= RequestMethod.POST,produces="application/json;charset=UTF-8")
    @ResponseBody
    public Object addKeyWord(@RequestBody Map<String, Object> source, ModelMap model)
    {
        logger.info("前台传入的数据："+source);
        List<KeyWord> keyWords = Utils.converseMapToObject(KeyWord.class, source);
        try {
            if (keyWords != null && !keyWords.isEmpty()) {
                for (KeyWord keyWord : keyWords) {
                    keyWordservice.insertKeyWord(keyWord);
                }
            }
            model.put("result","success");
        }catch (Exception ex)
        {
            model.put("result","faild");
            ex.printStackTrace();
        }
        return model;
    }

    @RequestMapping(value="/getKeyWord",method= RequestMethod.POST,produces="application/json;charset=UTF-8")
    @ResponseBody
    public Object getKeyWord(@RequestBody Map<String, Object> source,ModelMap model)
    {
        List<KeyWord> keyWords = Utils.converseMapToObject(KeyWord.class, source);
        List<KeyWord> keyWordList= new ArrayList<KeyWord>();
        try {
            if (keyWords != null && !keyWords.isEmpty()) {

                for (KeyWord keyWord : keyWords) {
                    keyWordList= keyWordservice.selectByKeyWord(keyWord);
                }
            }else
            {
                KeyWord keyWord=new KeyWord();
                keyWordList= keyWordservice.selectByKeyWord(keyWord);
            }
            model.put("data",keyWordList);
            model.put("result","success");
        }catch (Exception ex)
        {
            model.put("result","faild");
            model.put("data",keyWordList);
            ex.printStackTrace();
        }
        return model;
    }


}
