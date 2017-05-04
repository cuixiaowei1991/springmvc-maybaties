package com.ycy.controller;

import com.ycy.common.Utils;
import com.ycy.model.KeywordReply;
import com.ycy.service.KeywordReplyservice;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/**
 * Created by cuixiaowei on 2016/10/31.
 */
@Controller
public class KeywordReplyController {

    @Autowired
    private KeywordReplyservice keywordReplyservice;
    private static Logger logger = Logger
            .getLogger(KeywordReplyController.class);
    @RequestMapping(value="/addKeyWordReply",method= RequestMethod.POST,produces="application/json;charset=UTF-8")
    @ResponseBody
    public Object addKeywordReply(@RequestBody Map<String, Object> source,ModelMap modelMap)
    {
        logger.info("新增关键字回复："+source);
        List<KeywordReply> keywordReplies= Utils.converseMapToObject(KeywordReply.class,source);
        try {

            if(keywordReplies !=null && !keywordReplies.isEmpty())
            {
                for (KeywordReply keywordReply : keywordReplies)
                {
                    keywordReplyservice.insert(keywordReply);
                    modelMap.put("result","success");
                }
            }
        }catch (Exception e)
        {
            modelMap.put("result","faild");
            e.printStackTrace();
        }
        return modelMap;
    }

    /**
     * 获取关键字回复列表
     * @param source
     * @param modelMap
     * @return
     */
    @RequestMapping(value="/getKeyWordReply",method= RequestMethod.POST,produces="application/json;charset=UTF-8")
    @ResponseBody
    public Object getKeyWordReply(@RequestBody Map<String, Object> source,ModelMap modelMap)
    {
        logger.info("获取关键字回复列表条件："+source);
        List<KeywordReply> keywordReplies= Utils.converseMapToObject(KeywordReply.class,source);
        List<KeywordReply> keywordReplyList=new ArrayList<KeywordReply>();
        try
        {
            if(keywordReplies!=null && !keywordReplies.isEmpty())
            {
                for(KeywordReply keywordReply : keywordReplies)
                {
                    keywordReplyList=keywordReplyservice.selectByKeywordReply(keywordReply);
                }
            }
            else
            {
                KeywordReply keywordReply= new KeywordReply();
                keywordReplyList=keywordReplyservice.selectByKeywordReply(keywordReply);
            }
            modelMap.put("data",keywordReplyList);
            modelMap.put("result","success");
        }catch (Exception e)
        {
            modelMap.put("result","fail");
            modelMap.put("data",keywordReplyList);
            e.printStackTrace();
        }
        return modelMap;
    }

    @RequestMapping(value="/updateKeyWordReply",method= RequestMethod.POST,produces="application/json;charset=UTF-8")
    @ResponseBody
    public Object updateKeyWordReply(@RequestBody Map<String, Object> source,ModelMap modelMap)
    {
        logger.info("更新回复列表信息："+source);
        List<KeywordReply> keywordReplies=Utils.converseMapToObject(KeywordReply.class,source);
        int i=0;
        try
        {
            for (KeywordReply keywordReply : keywordReplies)
            {
               i= keywordReplyservice.updateByPrimaryKeySelective(keywordReply);
            }
            if(i!=0)
            {
                modelMap.put("result","success");
            }else
            {
                modelMap.put("result","fail");
            }
        }catch (Exception e)
        {
            modelMap.put("result","fail");
            e.printStackTrace();
        }
        return modelMap;
    }


}
