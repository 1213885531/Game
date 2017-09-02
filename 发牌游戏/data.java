package com.mutong.puke;

import java.util.ArrayList;
import java.util.List;

public class data {
	public List<String> datalist;
	public data(){
		datalist=new ArrayList<String>();
		for(int i=1;i<10;i++){
			datalist.add((i+1)+"");
		}
		datalist.add("J");
		datalist.add("Q");
		datalist.add("k");
		datalist.add("A");
	}

}
