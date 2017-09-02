package com.mutong.puke;

import java.util.Scanner;

public class Game {

	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		System.out.println("----------------游戏开始-------------------\n");
		System.out.println("---------------创建扑克牌------------------\n");
		cardList cl=new cardList();
		cl.createCard();
		
		System.out.println("----------------开始洗牌--------------------");
		cl.Wash();
		System.out.println("----------------洗牌完成--------------------\n"); 
		
		
		System.out.println("----------------创建玩家--------------------");
		Scanner console = new Scanner(System.in);
		System.out.println("创建第一位玩家：");
		System.out.println("请输入玩家ID：");
		String stri1=console.next();
		System.out.println("请输入玩家姓名：\n");
		String strn1=console.next();
		System.out.println("创建第二位玩家：");
		System.out.println("请输入玩家ID：");
		String stri2=console.next();
		System.out.println("请输入玩家姓名：\n");
		String strn2=console.next();
		System.out.println("----------------创建玩家成功--------------------\n");
		
		
		System.out.println("------------------开始发牌--------------------");
		System.out.println("-------玩家"+strn1+"拿牌-------");
		System.out.println("-------玩家"+strn2+"拿牌-------");
		System.out.println("-------玩家"+strn1+"拿牌-------");
		System.out.println("-------玩家"+strn2+"拿牌-------");
		//发牌操作
		Card c11=cl.deal();                                                       
		Card c12=cl.deal();
		Card c21=cl.deal();
		Card c22=cl.deal();
		System.out.println("------------------发牌结束--------------------\n");
		
		//创建玩家
		Person p1=new Person(stri1,strn1,c11,c12);
		Person p2=new Person(stri2,strn2,c21,c22);
		
		Card c1=cl.compare(c11, c12);  //第一位玩家的最大牌
		Card c2=cl.compare(c21, c22);  //第二位玩家的最大牌
		Card c=cl.compare(c1, c2);     //比较两位玩家的牌面
		System.out.println("------------------开始游戏--------------------");
		System.out.println("玩家"+p1.name+"的牌为<"+c11.huase+c11.data+">  <"+c12.huase+c12.data+">");
		System.out.println("玩家"+p2.name+"的牌为<"+c21.huase+c21.data+">  <"+c22.huase+c22.data+">");
		if(c.equals(c1) && !c.equals(c2)){
			System.out.println("-------------lalalalalala恭喜"+p1.name+"获胜！！！-----------------");
		}
		if(c.equals(c2) && !c.equals(c1)){
			System.out.println("-------------lalalalalala恭喜"+p2.name+"获胜！！！-----------------");
		}
		if(c.equals(c1) && c.equals(c2)){
			System.out.println("-------------OH MY GOD！"+p1.name+p2.name+"平局-----------------");
		}
		
		
	}

}
