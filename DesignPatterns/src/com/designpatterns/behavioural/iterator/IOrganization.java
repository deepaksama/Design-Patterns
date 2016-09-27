package com.designpatterns.behavioural.iterator;

import java.util.Iterator;

public interface IOrganization {
	Iterator filterIterator(Designation designation);
}
