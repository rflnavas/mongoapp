package com.mongoapp.dao;

import org.bson.types.ObjectId;

import com.mongoapp.beans.Member;
import com.mongoapp.converters.MemberConverter;
import com.mongodb.DBCollection;
import com.mongodb.DBObject;
import com.mongodb.MongoClient;

public class MemberDAO extends DAO<Member> {

	private DBCollection collection;

	public MemberDAO(MongoClient mClient) {
		super(mClient);
		this.collection = db.getCollection(MongoDBCollections.MEMBERS
				.collectionName());
	}

	public DBCollection getCollection() {
		return collection;
	}

	public void setCollection(DBCollection collection) {
		this.collection = collection;
	}
	
	@Override
	public Member create(Member m){
		
		DBObject doc = MemberConverter.getInstance().toDBObject(m);
		this.collection.insert(doc);
		ObjectId id = (ObjectId) doc.get("_id");
		m.setId(id.toString());
		return m;
	}

	@Override
	public Member update(Member t) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Member get(String id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void remove(String id) {
		// TODO Auto-generated method stub
		
	}
	
	
}
