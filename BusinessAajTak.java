package com.oberver;

import com.oberver.News.NewsType;

public class BusinessAajTak <T>implements Observer<T>{

	@Override
	 public void onUpdate(T data) {
        if(data instanceof News) {
        	System.out.println(((News)data).getNews());
	}

}

	@Override
	public NewsType getRequiredNewsType() {
		// TODO Auto-generated method stub
		return News.NewsType.BUSINESS_NEWS;
	}
}
