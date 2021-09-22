package com.oberver;

import java.util.List;
import java.util.ArrayList;

public class AajTak<T> {
    List<Observer<T>> observerList = new ArrayList<>();

    public void register(Observer<T> observer) {
        observerList.add(observer);
    }
    public void unRegister(Observer<T> observer) {
    	observerList.remove(observer);
    }

    public void update(T news) {
        for (Observer<T> observer : observerList) {
        	if(observer.getRequiredNewsType()==((News)news).getNewsType());
        	{
        		
        			observer.onUpdate(news);
        		}
        	}
            
        }
    }
