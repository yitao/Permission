package com.yt.mybatis.utils;

/**
 * mybatis Mapper 生成器
 * Created by yitao on 2016/5/30.
 */
public class MapperMaker {
    String xmlHead = "<?xml version=\"1.0\" encoding=\"UTF-8\"?>";
    String mybatisDocType = "<!DOCTYPE configuration PUBLIC \"-//mybatis.org//DTD Config 3.0//EN\" \"http://mybatis.org/dtd/mybatis-3-config.dtd\">";
    String[] keyWords = new String[]{"name","insert","into","update","from","set","delete","where","order","by","select","alter","drop","create","table"};
    //插入语句容器
    //删除语句容器
    //修改语句容器
    //查询语句容器
    String fieldTemplate = "#{%FIELD%}";
    String columnTemplate = "%COLUMN%";
    String evalTemplate = "%COLUMN% = #{%FIELD%}";
    String mapperTemplate = "<mapper namespace=\"%CLASS_NAME%\">%CONTENT%</mapper>";

    String insertTemplate = "<insert id=\"%INSERT_ID%\" parameterType=\"%INSERT_PARAMTYPE%\">\n" +
            "        INSERT  INTO %INSERT_TABLE%(%INSERT_FIELDS%)\n" +
            "        VALUES (%INSERT_VALUES%)\n" +
            "    </insert>";
    String setIfTempalte =
            "            <if test=\"%FIELD% != null\">\n" +
            "                %EVAL_CONTENT%\n" +
            "            </if>\n";
    String setTemplate =
            "        <set>\n" +
            "            %SET_IFS%" +
            "        </set>\n";
    String whereIfTemplate =
            "            <if test=\"%FIELD% != null\">\n" +
            "                and %EVAL_CONTENT%\n" +
            "            </if>\n";
    String whereTemplate =
            "        <where>\n" +
            "            1 = 1\n" +
            "            %WHERE_IFS%" +
            "        </where>";
    String updateTemplate =
            "<update id=\"%UPDATE_ID%\" parameterType=\"%UPDATE_PARAMTYPE\">\n" +
            "        UPDATE %TABLE%\n" +
            "        %SET_CONTENT%" +
            "        %WHERE_CONTENT%\n" +
            "    </update>";

    String deleteTemplate =
            "    <delete id=\"%DELETE_ID%\" parameterType=\"%DELETE_PARAMTYPE%\">\n" +
            "        DELETE FROM %TABLE% %WHERE_IFS%\n" +
            "    </delete>";

    String selectTemplate =
            "    <select id=\"%ID%\" parameterType=\"java.util.Map\" resultType=\"Account\">\n" +
            "        select * from account\n" +
            "        <where>\n" +
            "            1 = 1\n" +
            "            <if test=\"account != null\">\n" +
            "                and account = #{account}\n" +
            "            </if>\n" +
            "            <if test=\"password != password\">\n" +
            "                and ctime = #{ctime}\n" +
            "            </if>\n" +
            "            <if test=\"inuse != inuse\">\n" +
            "                and inuse = #{inuse}\n" +
            "            </if>\n" +
            "\n" +
            "        </where>\n" +
            "    </select>";

}
