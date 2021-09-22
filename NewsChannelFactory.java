package com.oberver;

import com.oberver.News.NewsType;

public class NewsChannelFactory {
	public Observer getNewsChannel(News.NewsType channel) {
		
    
     
	switch (channel) {
		case MUMBAI_NEWS:
			return new MumbaiAajTak();
		case DELHI_NEWS:
			return new DelhiAajTak();
		case BUSINESS_NEWS:
			return new BusinessAajTak();
		}
		return null;

	}
}
