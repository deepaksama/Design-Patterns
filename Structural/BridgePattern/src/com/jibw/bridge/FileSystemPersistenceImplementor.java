package com.jibw.bridge;

public class FileSystemPersistenceImplementor implements PersistenceImplementor {

	public void save(Object obj) {
		System.out.println("FileSystemPersistenceImplementor::save");
	}

	public void delete(int id) {
		System.out.println("FileSystemPersistenceImplementor::delete");
	}

	public Object get(int id) {
		System.out.println("FileSystemPersistenceImplementor::get");
		return new Object();
	}

}
