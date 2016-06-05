package com.jibw.bridge;

public interface PersistenceImplementor {
	public void save(Object obj);
	public void delete(int id);
	public Object get(int id);

}
