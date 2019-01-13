package com.itguigu.java;

import com.itguigu.bean.Customer;

import java.util.ArrayList;

/**
 * @author LiBingCheng
 * @create 2019-01-11-下午 11:06
 *
 *
 *  1. IDEA中代码模板所处的位置：settings - Editor - Live Templates / Postfix Completion
 *  2. 常用的模板
 */
public class TemplateTest {

    //模板6：prsf
    private static final Customer CUSTOMER= new Customer();

    //变形：psf
    public static final int NUM = 10;

    //变形：psfi
    public static final int NUM2 = 10;

    //变形：psfs
    public static final String NAME = "haha";




    //模板一：psvm
    public static void main(String[] args) {

        //模板二：sout
        System.out.println("hello");
        System.out.println("TemplateTest.main");

        int num = 10;
        System.out.println("num = " + num);
        int num2 = 10;
        System.out.println("num2 = " + num2);

        System.out.println(num);

        //模板三fori
        String[] arr = {"云天明","逻辑","诚心"};

        for (int i = 0; i < arr.length ; i++) {
            System.out.println(arr[i]);

        }
        //变形：iter
        for (String s : arr) {
            System.out.println("s = " + s);
        }
        //变形itar
        for (int i = 0; i < arr.length; i++) {
            String s = arr[i];
        }

        //模板四:list.for
        ArrayList<Object> list = new ArrayList<>();
        list.add(123);
        list.add(456);
        list.add(789);

        for (Object o : list) {
            System.out.println("o = " + o);
        }

        //变形：list.fori
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }
        //变形：list.forr 倒叙遍历
        for (int i = list.size() - 1; i >= 0; i--) {
            System.out.println(list.get(i));
        }


    }

    public  void method(String name){

        //变形：soutp / soutm / soutv / xxx.sout
        System.out.println("name = [" + name + "]");
        System.out.println("TemplateTest.method");


        ArrayList<Object> list = new ArrayList<>();
        list.add(123);
        list.add(456);
        list.add(789);

        //模板5：ifn
        if (list == null) {

        }

        //变形：inn
        if (list != null) {

        }

        //变形：xx.nn
        if (list != null) {

        }
        //变形：xx.null
        if (list == null) {

        }


    }




}
