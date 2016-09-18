package com.ccsi;

import java.util.*;

public class Main {

    public static void main(String[] args) {
	    List<Integer> result=getRow(6);
    }
    //Given an index k,return the kth row of the Pascal's triangle
    public static List<Integer> getRow(int rowIndex){
        List<Integer> result=new ArrayList<>();
        if(rowIndex<=0)return null;
        if(rowIndex>=1){
            result.add(1);
        }
        if(rowIndex>=2){
            result.add(1);
        }
        if(rowIndex>=3){
            for (int row = 2; row < rowIndex; row++) {
                for (int i = row-1; i >=1 ; i--) {                  //必须从后往前改变值
                    result.set(i,result.get(i)+result.get(i-1));    //利用set来改变值
                }
                result.add(1);
            }
        }
        return result;
    }
}
