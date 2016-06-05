package com.jibw.bridge;

public class InstrumentedPersistenceImpl extends PersistenceAbstraction{

	public InstrumentedPersistenceImpl(PersistenceImplementor impl) {
		super(impl);
	}
	
	public void save(Object obj) {
		System.out.println("InstrumentedPersistenceImpl - start saving object");
		super.save(obj);
		System.out.println("InstrumentedPersistenceImpl - done saving object");		
	}
	
	public void delete(int id) {
		System.out.println("InstrumentedPersistenceImpl - start deleting object");
		super.delete(id);
		System.out.println("InstrumentedPersistenceImpl - done deleting object");		
	}
	
	public Object get(int id) {
		System.out.println("InstrumentedPersistenceImpl - start fetching object");
		Object obj = super.get(id);
		System.out.println("InstrumentedPersistenceImpl - done fetching object");
		return obj;
	}
}
