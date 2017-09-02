package com.mutong.puke;
/*
 * 关于牌的操作
 */
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class cardList {
	public List<Card> cardlist;
	
	public cardList(){
		
		cardlist=new ArrayList<Card>();
	}
	
	
	/*
	 * 构造一副牌
	 */
	public void createCard(){
	    huaSe h=new huaSe();
	    data d=new data();
	    
		for(int i=0;i<13;i++)
			for(int j=0;j<4;j++){
				Card c=new Card(h.huaselist.get(j),d.datalist.get(i));
				cardlist.add(c);
			}
		int i=0;
		for(Card card:cardlist){
			if(i==4){                    //换行操作 ：一个数字对应四个花色
				System.out.println("");
				i=0;
			}			
			if(i!=4){
				System.out.print("<"+card.huase+card.data+">"+" ");
				i++;
			}			
		}
		System.out.println("\n---------------扑克牌创建成功-----------------\n");
	}
	
	
	/*
	 * 洗牌操作
	 */
	public List<Card> Wash(){
		List<Card> lc= new ArrayList<Card>();
		Random random=new Random();
		int i=0;
		while(i<52){
			Card c=cardlist.get(random.nextInt(52));
		    if(!lc.contains(c))	{	    
			   lc.add(c);
		       i++;
		    }
		}
		return lc;
	}
	
	
	/*
	 * 发牌操作
	 */
	public Card deal(){
		Random random=new Random();
		Card c= Wash().get(random.nextInt(52));
		return c;
	}
	
	
	/*
	 * 比大小
	 */
	public Card compare(Card c1,Card c2){
		data d=new data();
		huaSe h=new huaSe();
		Integer i1=d.datalist.indexOf(c1.data);
		Integer i2=d.datalist.indexOf(c2.data);
		int i=i1.compareTo(i2);
		
		if(i==0){                                       //大小相等比较花色  :黑红梅方
			Integer i3=h.huaselist.indexOf(c1.huase);
			Integer i4=h.huaselist.indexOf(c2.huase);
			int j=i3.compareTo(i4);
			if(j==0)
				return c1;
			if(j<0)
				return c2;
			if(j>0)
				return c1;		
		}
		if(i>0)                 //card1大
			return c1;
		
		return c2;              //否则card2大
	}
	
	
	
	public static void main(String[] args){
		cardList cl=new cardList();
		cl.createCard();
		for(Card c:cl.Wash()){
			System.out.println("<"+c.huase+c.data+">");
		}
		Card c1=cl.deal();
		System.out.println(c1.huase+c1.data);
		Card c2=cl.deal();
		System.out.println(c2.huase+c2.data);
		
		Card c = cl.compare(c1, c2);
		System.out.println(c.huase+c.data);
	}
	

}
