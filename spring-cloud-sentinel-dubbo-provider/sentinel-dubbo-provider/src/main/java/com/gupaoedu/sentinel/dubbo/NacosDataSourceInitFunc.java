package com.gupaoedu.sentinel.dubbo;

import com.alibaba.csp.sentinel.datasource.ReadableDataSource;
import com.alibaba.csp.sentinel.datasource.nacos.NacosDataSource;
import com.alibaba.csp.sentinel.init.InitFunc;
import com.alibaba.csp.sentinel.slots.block.flow.FlowRule;
import com.alibaba.csp.sentinel.slots.block.flow.FlowRuleManager;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.TypeReference;

import java.util.List;

/**
 * 咕泡学院，只为更好的你
 * 咕泡学院-Mic: 2227324689
 * http://www.gupaoedu.com
 **/
public class NacosDataSourceInitFunc implements InitFunc{
    private String serverAddr="192.168.216.128:8848";
    private String groupId="DEFAULT_GROUP";
    private String dataId="spring-cloud.sentinel-dubbo.provider-sentinel-flow";

    @Override
    public void init() throws Exception {
        loadNacosData();
    }
    private void loadNacosData(){
        ReadableDataSource<String,List<FlowRule>> flowRuleDataSource=
                new NacosDataSource<>(serverAddr, groupId, dataId, source -> JSON.parseObject(source, new TypeReference<List<FlowRule>>() {
                }));
        FlowRuleManager.register2Property(flowRuleDataSource.getProperty());
    }
}
