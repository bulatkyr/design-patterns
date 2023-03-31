package org.example.adapter.enumeration;

import java.util.Enumeration;
import java.util.Iterator;

public class IteratorEnumerationAdapter implements Enumeration<Object> {

    private Iterator<Object> iterator;

    public IteratorEnumerationAdapter(Iterator<Object> iterator) {
        this.iterator = iterator;
    }

    @Override
    public boolean hasMoreElements() {
        return iterator.hasNext();
    }

    @Override
    public Object nextElement() {
        return iterator.next();
    }

}
