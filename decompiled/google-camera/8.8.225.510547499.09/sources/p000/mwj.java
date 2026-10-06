package p000;

import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.Serializable;
import java.util.AbstractCollection;
import java.util.Arrays;
import java.util.Collection;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public abstract class mwj extends AbstractCollection implements Serializable {

    /* JADX INFO: renamed from: ro */
    private static final Object[] f41727ro = new Object[0];

    private void readObject(ObjectInputStream objectInputStream) throws InvalidObjectException {
        throw new InvalidObjectException("Use SerializedForm");
    }

    /* JADX INFO: renamed from: A */
    public Object[] mo17074A() {
        return null;
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    @Deprecated
    public final boolean add(Object obj) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    @Deprecated
    public final boolean addAll(Collection collection) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    @Deprecated
    public final void clear() {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public abstract boolean contains(Object obj);

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set, java.util.NavigableSet
    /* JADX INFO: renamed from: cr */
    public abstract naz listIterator();

    /* JADX INFO: renamed from: cs */
    public abstract boolean mo17014cs();

    @Override // java.util.AbstractCollection, java.util.Collection
    @Deprecated
    public final boolean remove(Object obj) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    @Deprecated
    public final boolean removeAll(Collection collection) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    @Deprecated
    public final boolean retainAll(Collection collection) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final Object[] toArray() {
        return toArray(f41727ro);
    }

    /* JADX INFO: renamed from: v */
    public mws mo17025v() {
        throw null;
    }

    Object writeReplace() {
        return new mwq(toArray());
    }

    /* JADX INFO: renamed from: x */
    public int mo17075x(Object[] objArr, int i) {
        naz nazVarListIterator = listIterator();
        while (nazVarListIterator.hasNext()) {
            objArr[i] = nazVarListIterator.next();
            i++;
        }
        return i;
    }

    /* JADX INFO: renamed from: y */
    public int mo17076y() {
        throw new UnsupportedOperationException();
    }

    /* JADX INFO: renamed from: z */
    public int mo17077z() {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final Object[] toArray(Object[] objArr) {
        objArr.getClass();
        int size = size();
        int length = objArr.length;
        if (length < size) {
            Object[] objArrMo17074A = mo17074A();
            if (objArrMo17074A != null) {
                return Arrays.copyOfRange(objArrMo17074A, mo17077z(), mo17076y(), objArr.getClass());
            }
            objArr = mpw.m16759K(objArr, size);
        } else if (length > size) {
            objArr[size] = null;
        }
        mo17075x(objArr, 0);
        return objArr;
    }
}
