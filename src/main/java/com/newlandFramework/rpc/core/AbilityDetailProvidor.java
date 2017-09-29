package com.newlandFramework.rpc.core;

/**
 * @filename:AbilityDetailProvider.java
 * @description:AbilityDetailProvider功能模块
 * @Created by Johnny Chou on 2017/9/29.
 * @Author：
 */
public class AbilityDetailProvidor implements AbilityDetail {

    private final static String STYLE = "<style type=\"text/css\">\n" +
            "table.gridtable {\n" +
            "    font-family: verdana,arial,sans-serif;\n" +
            "    font-size:11px;\n" +
            "    color:#333333;\n" +
            "    border-width: 1px;\n" +
            "    border-color: #666666;\n" +
            "    border-collapse: collapse;\n" +
            "}\n" +
            "table.gridtable th {\n" +
            "    border-width: 1px;\n" +
            "    padding: 8px;\n" +
            "    border-style: solid;\n" +
            "    border-color: #666666;\n" +
            "    background-color: #dedede;\n" +
            "}\n" +
            "table.gridtable td {\n" +
            "    border-width: 1px;\n" +
            "    padding: 8px;\n" +
            "    border-style: solid;\n" +
            "    border-color: #666666;\n" +
            "    background-color: #ffffff;\n" +
            "}\n" +
            "</style>";

    private final static String HEADER = "<table class=\"gridtable\">\n" +
            "<tr>\n" +
            "    <th>NettyRPC Ability Detail</th>\n" +
            "</tr>";

    private final static String TAIL = "</table>";
    private final static String CELL_BEGIN = "<tr><td>";
    private final static String CELL_END = "</td></tr>";




    @Override
    public StringBuffer listAbilityDetail(boolean html) {

        //Map<String,Object> map = MessageRecvExecutor.


        return null;
    }
}
