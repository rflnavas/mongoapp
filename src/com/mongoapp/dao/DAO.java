package com.mongoapp.dao;

import com.mongodb.DB;
import com.mongodb.MongoClient;

public abstract class DAO<T> {
	
	public static String DATABASE_NAME = "myMongoDB";
	
	protected DB db;
	
	public DAO(MongoClient mClient) {
		this.db = mClient.getDB(DATABASE_NAME);
	}
	
	public abstract T create(T t);
	public abstract T update(T t);
	public abstract T get(String id);
	public abstract void remove(String id);
}
