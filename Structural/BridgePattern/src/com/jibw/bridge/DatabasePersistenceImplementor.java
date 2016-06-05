package com.jibw.bridge;

public class DatabasePersistenceImplementor implements PersistenceImplementor {

	public void save(Object obj) {
		System.out.println("DatabasePersistenceImplementor::save");
	}

	public void delete(int id) {
		System.out.println("DatabasePersistenceImplementor::delete");
	}

	public Object get(int id) {
		System.out.println("DatabasePersistenceImplementor::get");
		return new Object();
	}

}
