package com.jibw.bridge;

public class PersistenceAbstraction {
	private PersistenceImplementor impl;
		
	public PersistenceAbstraction(PersistenceImplementor impl) {
		super();
		this.impl = impl;
	}
	
	public void save(Object obj) {
		this.impl.save(obj);
	}
	
	public void delete(int id) {
		this.impl.delete(id);
	}
	
	public Object get(int id) {
		return this.impl.get(id);
	}
}
