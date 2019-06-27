package com.test;

import javafx.scene.shape.VLineTo;
import sun.security.util.Length;

import java.time.temporal.ValueRange;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class LeetCode02 {

    //-2147483648
    //尝试将链表转换成int，然后相加，转换成int,然后转换成Stirng分离位数
    //在leetcode的1+1999999999的用例用，输出结果超过Int类型的上限，暂时没有解决的办法


    public static ListNode addTwoNumbers(ListNode l1, ListNode l2) {

            Map<Integer,Integer> map = new HashMap<>();
            Map<Integer,Integer> mapx = new HashMap<>();

            //将两个数从链表中取出再相加，然后存放在一个链表中

        int length=0;
        int lengthx=0;
        int val1=0;
        int val2=0;
        if(l1==null){
            System.out.println("为空");
        }
        while (l1!=null) {
                map.put(length,l1.val);
                length+=1;
                l1 = l1.next;
        }
        while(l2!=null){
            mapx.put(lengthx,l2.val);
            lengthx+=1;
            l2 = l2.next;
        }
            for (int i=0;i<length;i++){
                val1+=map.get(i)* Math.pow(10,i);
            }

            for(int i=0;i<lengthx;i++){
                val2+=mapx.get(i)*Math.pow(10,i);
            }
            int value = val1+val2;
        System.out.println(value);

            String VAL = String.valueOf(value);
        ListNode node1 = new ListNode(     Integer.parseInt(String.valueOf(VAL.charAt(VAL.length() - 1)))  );
        ListNode nodex = null;
        nodex = node1;
            for(int j =VAL.length()-2;j>=0;j--){
                nodex.next = new ListNode(Integer.parseInt(String.valueOf(VAL.charAt(j))));
                nodex=nodex.next;
            }


            //得到结果，倒叙放到一个链表中
        return node1;
    }

    //second
    //public solution
    public static ListNode addTwoNumbersSec(ListNode l1, ListNode l2){

        ListNode node = new ListNode(0);
        ListNode nodex = node;
        int carry = 0;
        while(l1!=null||l2!=null) {
            int x = l1 != null ? l1.val : 0;
            int y = l2 != null ? l2.val : 0;

            int sum = x + y + carry;

            carry = sum / 10;
            sum = sum % 10;
            node.next = new ListNode(sum);

            node = node.next;
            if(l1!=null)
                l1 = l1.next;
            if(l2!=null)
                l2 = l2.next;

        }
        if(carry ==1 ){
            node.next = new ListNode(carry);
        }
         return nodex.next;
    }
    /**
 *
 Definition for singly-linked list.
 */
public static class ListNode {
    int val;
     ListNode next;
    ListNode(int x) { val = x; }
 }


    public static void main(String[] args) {
        ListNode l1 = new ListNode(1);


        ListNode l2 = new ListNode(1);
        l2.next=new ListNode(9);
        l2.next.next = new ListNode(9);
       l2.next.next.next = new ListNode(9);
       l2.next.next.next.next = new ListNode(9);
       l2.next.next.next.next.next = new ListNode(9);
       l2.next.next.next.next.next.next = new ListNode(9);
       l2.next.next.next.next.next.next.next = new ListNode(9);
       l2.next.next.next.next.next.next.next.next = new ListNode(9);
       l2.next.next.next.next.next.next.next.next.next = new ListNode(9);


        ListNode x = addTwoNumbers(l1, l2);
//        ListNode x = addTwoNumbersSec(l1,l2);
        System.out.println(x.val);
        System.out.println(x.next.val);
        System.out.println(x.next.next.val);
        System.out.println(x.next.next.next.val);
    }

}
