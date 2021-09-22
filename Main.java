package com.oberver;

import com.oberver.News.NewsType;

public class Main {
	public static void main(String[] args) {
		AajTak subject = new AajTak();
		News data = new News("Some data");
		NewsChannelFactory newsChannelFactory = new NewsChannelFactory();
		Observer observer1 = newsChannelFactory.getNewsChannel(NewsType.MUMBAI_NEWS);
		Observer observer2 = newsChannelFactory.getNewsChannel(NewsType.DELHI_NEWS);
		Observer observer3 = newsChannelFactory.getNewsChannel(NewsType.BUSINESS_NEWS);

		data.setNews("Its raining in mumbai");
		data.setNewsType(News.NewsType.MUMBAI_NEWS);
		subject.register(observer1);
		subject.register(observer2);
		subject.register(observer3);

		subject.update(data);
	}
}
