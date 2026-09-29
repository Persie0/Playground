package com.google.common.collect;

import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.Serializable;
import java.util.AbstractCollection;
import java.util.Collection;
import java.util.Spliterator;
import java.util.Spliterators;
import p000.bga;
import p000.r1c;

/* JADX INFO: loaded from: classes.dex */
public abstract class ImmutableCollection<E> extends AbstractCollection<E> implements Serializable {

    /* JADX INFO: renamed from: a */
    public static final Object[] f13387a = new Object[0];

    private void readObject(ObjectInputStream objectInputStream) throws InvalidObjectException {
        throw new InvalidObjectException("Use SerializedForm");
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean add(Object obj) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean addAll(Collection collection) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final void clear() {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public abstract boolean contains(Object obj);

    /* JADX INFO: renamed from: d */
    public abstract ImmutableList mo6273d();

    /* JADX INFO: renamed from: f */
    public abstract int mo6274f(Object[] objArr, int i);

    /* JADX INFO: renamed from: g */
    public Object[] mo6275g() {
        return null;
    }

    /* JADX INFO: renamed from: h */
    public int mo6276h() {
        throw new UnsupportedOperationException();
    }

    /* JADX INFO: renamed from: i */
    public int mo6277i() {
        throw new UnsupportedOperationException();
    }

    /* JADX INFO: renamed from: j */
    public abstract boolean mo6278j();

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
    /* JADX INFO: renamed from: k, reason: merged with bridge method [inline-methods] */
    public abstract bga iterator();

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean remove(Object obj) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean removeAll(Collection collection) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean retainAll(Collection collection) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Collection, java.lang.Iterable
    public final Spliterator spliterator() {
        return Spliterators.spliterator(this, 1296);
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final Object[] toArray(Object[] objArr) {
        objArr.getClass();
        int size = size();
        if (objArr.length < size) {
            Object[] objArrMo6275g = mo6275g();
            if (objArrMo6275g != null) {
                return r1c.m20244a(mo6277i(), mo6276h(), objArrMo6275g, objArr);
            }
            objArr = r1c.m20245b(objArr, size);
        } else if (objArr.length > size) {
            objArr[size] = null;
        }
        mo6274f(objArr, 0);
        return objArr;
    }

    public Object writeReplace() {
        return new ImmutableList.SerializedForm(toArray(f13387a));
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final Object[] toArray() {
        return toArray(f13387a);
    }
}
