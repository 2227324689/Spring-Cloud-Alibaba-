package com.gupaoedu.book.sentinel.dynamic.springcloudsentineldynamicrule;

import com.alibaba.csp.sentinel.Entry;
import com.alibaba.csp.sentinel.EntryType;
import com.alibaba.csp.sentinel.SphU;
import com.alibaba.csp.sentinel.annotation.SentinelResource;
import com.alibaba.csp.sentinel.slots.block.BlockException;
import com.alibaba.csp.sentinel.slots.block.RuleConstant;
import com.alibaba.csp.sentinel.slots.block.flow.param.ParamFlowRule;
import com.alibaba.csp.sentinel.slots.block.flow.param.ParamFlowRuleManager;
import org.aspectj.apache.bcel.classfile.annotation.RuntimeInvisAnnos;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.PostConstruct;
import javax.websocket.server.PathParam;
import java.util.Collections;

/**
 * 咕泡学院，只为更好的你
 * 咕泡学院-Mic: 2227324689
 * http://www.gupaoedu.com
 **/
@RestController
public class ParamRuleController {

    private String resourceName="com.gupaoedu.book.sentinel.dynamic.springcloudsentineldynamicrule.ParamRuleController:sayHello(java.lang.String)";

    @PostConstruct
    public void initParamRule(){
        ParamFlowRule rule=new ParamFlowRule(resourceName);
        rule.setParamIdx(0);
        rule.setGrade(RuleConstant.FLOW_GRADE_QPS);
        rule.setCount(1);
        ParamFlowRuleManager.loadRules(Collections.singletonList(rule));
    }
  /*  @GetMapping("/hello")
    public String sayHello(@PathParam("id")String id,@PathParam("name")String name){
        Entry entry=null;
        try {
            entry=SphU.entry(resourceName, EntryType.IN,1,id);
            return "access success";
        } catch (BlockException e) {
            e.printStackTrace();
            return "block";
        }finally {
            if(entry!=null) {
                entry.exit();
            }
        }
    }*/
  @SentinelResource
  @GetMapping("/hello")
  public String sayHello(@PathParam("id")String id){
      return "access success";
  }
}
