package com.oberver;

import com.oberver.News.NewsType;

public interface Observer<T>{
public void onUpdate(T data);

public NewsType getRequiredNewsType();

}

