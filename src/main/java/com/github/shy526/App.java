package com.github.shy526;

import com.alibaba.fastjson2.JSON;
import com.alibaba.fastjson2.JSONArray;
import com.alibaba.fastjson2.JSONObject;
import com.github.shy526.caimogu.CaiMoGuHelp;
import com.github.shy526.factory.OkHttpClientFactory;
import com.github.shy526.interceptor.UserAgentInterceptor;
import okhttp3.*;
import org.jetbrains.annotations.NotNull;

import java.io.*;
import java.nio.charset.StandardCharsets;
import java.time.YearMonth;
import java.time.format.DateTimeFormatter;
import java.util.HashSet;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {

        Set<Integer> ids = CaiMoGuHelp.readResources("gameIds.txt");
        if(ids.isEmpty()){
            ids = CaiMoGuHelp.ScanGameIds();
            //上传到Github
        }
        Set<Integer> acIds = CaiMoGuHelp.readResources("acIds.txt");
        //去掉交集
        if (!acIds.isEmpty()) {
            ids.removeAll(acIds);
        }
        if (ids.isEmpty()) {
            //无可用id时重新扫描
            ids = CaiMoGuHelp.ScanGameIds();
        }
        if (!acIds.isEmpty()) {
            ids.removeAll(acIds);
        }
        if (ids.isEmpty()) {
            //说明无可用Id
            return;
        }
        System.out.println("测试");
        int trueFlag = 0;
 /*       for (Integer id : ids) {
            if (CaiMoGuHelp.actSore(id,null)){
                trueFlag++;
                acIds.add(id);
            }
            if (trueFlag == 3) {
                return;
            }
        }*/
        //重新上传ac
    }









}
