package com.treasurefilter.servlet.controller;

import com.treasurefilter.servlet.service.GetData;
import org.springframework.web.bind.annotation.*;

import java.io.IOException;

@RestController//这是一个控制器并只返回数据不寻找视图
@CrossOrigin(origins =  {"http://localhost:3000", "http://47.116.134.96:3000", "http://treasure.rundstedt.cn"})
public class GetTreasure {
    @RequestMapping(value = "/getTreasure",method = RequestMethod.GET) //将本方法映射到url
    public String getTreasure(@RequestParam("status") String status,
                              @RequestParam("serverId") String serverId,
                              @RequestParam(value = "sortWay",required = false,defaultValue = "") String sortWay,
                              @RequestParam(value = "sortField",required = false,defaultValue = "") String sortField,
                              @RequestParam(value = "itemName",required = false,defaultValue = "") String itemName,
                              @RequestParam(value = "bwa1",required = false,defaultValue = "") String bwa1,
                              @RequestParam(value = "bwa2",required = false,defaultValue = "") String bwa2,
                              @RequestParam(value = "bwa3",required = false,defaultValue = "") String bwa3,
                              @RequestParam(value = "bwa4",required = false,defaultValue = "") String bwa4,
                              @RequestParam(value = "bwa5",required = false,defaultValue = "") String bwa5,
                              @RequestParam(value = "bwa6",required = false,defaultValue = "") String bwa6,
                              @RequestParam(value = "pageIndex",required = false,defaultValue = "") String pageIndex)throws IOException {
        GetData gd = new GetData();
        return gd.getdata(status,serverId,sortWay,sortField,itemName,bwa1,bwa2,bwa3,bwa4,bwa5,bwa6,pageIndex);
    }

    @RequestMapping(value = "/getServerList",method = RequestMethod.GET) //将本方法映射到url
    public String getServerList(){
        GetData gd = new GetData();
        return gd.getServerList();
    }

    @RequestMapping(value = "/getFollowCount",method = RequestMethod.GET) //将本方法映射到url
    public String getFollowCount(@RequestParam("serverId") String serverId,
                                 @RequestParam("itemIds") String itemIds){
        GetData gd = new GetData();
        return gd.getFollowCount(serverId,itemIds);
    }

    @RequestMapping(value = "/getTradeItem",method = RequestMethod.GET) //将本方法映射到url
    public String getTradeItem(@RequestParam("serverId") String serverId,
                                 @RequestParam("itemId") String itemId){
        GetData gd = new GetData();
        return gd.getTradeItem(serverId,itemId);
    }
}