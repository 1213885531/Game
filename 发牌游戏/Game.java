package com.mutong.puke;

import java.util.Scanner;

public class Game {

	public static void main(String[] args) {
		// TODO �Զ����ɵķ������
		System.out.println("----------------��Ϸ��ʼ-------------------\n");
		System.out.println("---------------�����˿���------------------\n");
		cardList cl=new cardList();
		cl.createCard();
		
		System.out.println("----------------��ʼϴ��--------------------");
		cl.Wash();
		System.out.println("----------------ϴ�����--------------------\n"); 
		
		
		System.out.println("----------------�������--------------------");
		Scanner console = new Scanner(System.in);
		System.out.println("������һλ��ң�");
		System.out.println("���������ID��");
		String stri1=console.next();
		System.out.println("���������������\n");
		String strn1=console.next();
		System.out.println("�����ڶ�λ��ң�");
		System.out.println("���������ID��");
		String stri2=console.next();
		System.out.println("���������������\n");
		String strn2=console.next();
		System.out.println("----------------������ҳɹ�--------------------\n");
		
		
		System.out.println("------------------��ʼ����--------------------");
		System.out.println("-------���"+strn1+"����-------");
		System.out.println("-------���"+strn2+"����-------");
		System.out.println("-------���"+strn1+"����-------");
		System.out.println("-------���"+strn2+"����-------");
		//���Ʋ���
		Card c11=cl.deal();                                                       
		Card c12=cl.deal();
		Card c21=cl.deal();
		Card c22=cl.deal();
		System.out.println("------------------���ƽ���--------------------\n");
		
		//�������
		Person p1=new Person(stri1,strn1,c11,c12);
		Person p2=new Person(stri2,strn2,c21,c22);
		
		Card c1=cl.compare(c11, c12);  //��һλ��ҵ������
		Card c2=cl.compare(c21, c22);  //�ڶ�λ��ҵ������
		Card c=cl.compare(c1, c2);     //�Ƚ���λ��ҵ�����
		System.out.println("------------------��ʼ��Ϸ--------------------");
		System.out.println("���"+p1.name+"����Ϊ<"+c11.huase+c11.data+">  <"+c12.huase+c12.data+">");
		System.out.println("���"+p2.name+"����Ϊ<"+c21.huase+c21.data+">  <"+c22.huase+c22.data+">");
		if(c.equals(c1) && !c.equals(c2)){
			System.out.println("-------------lalalalalala��ϲ"+p1.name+"��ʤ������-----------------");
		}
		if(c.equals(c2) && !c.equals(c1)){
			System.out.println("-------------lalalalalala��ϲ"+p2.name+"��ʤ������-----------------");
		}
		if(c.equals(c1) && c.equals(c2)){
			System.out.println("-------------OH MY GOD��"+p1.name+p2.name+"ƽ��-----------------");
		}
		
		
	}

}
