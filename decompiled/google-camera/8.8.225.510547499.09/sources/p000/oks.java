package p000;

import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class oks implements Collection {

    /* JADX INFO: renamed from: a */
    private final Object[] f46208a;

    /* JADX INFO: renamed from: b */
    private final boolean f46209b;

    public oks(Object[] objArr, boolean z) {
        this.f46208a = objArr;
        this.f46209b = z;
    }

    @Override // java.util.Collection
    public final boolean add(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Collection
    public final boolean addAll(Collection collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Collection
    public final void clear() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    /* JADX WARN: Code duplicated, block: B:17:0x0023 A[RETURN] */
    @Override // java.util.Collection
    public final boolean contains(Object obj) {
        int i;
        Object[] objArr = this.f46208a;
        if (obj == null) {
            int length = objArr.length;
            i = 0;
            while (i < length) {
                if (objArr[i] != null) {
                    i++;
                } else if (i >= 0) {
                    return true;
                }
            }
        } else {
            int length2 = objArr.length;
            for (int i2 = 0; i2 < length2; i2++) {
                if (ooc.m18737c(obj, objArr[i2])) {
                    i = i2;
                    if (i >= 0) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    @Override // java.util.Collection
    public final boolean containsAll(Collection collection) {
        collection.getClass();
        if (collection.isEmpty()) {
            return true;
        }
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            if (!contains(it.next())) {
                return false;
            }
        }
        return true;
    }

    @Override // java.util.Collection
    public final boolean isEmpty() {
        return this.f46208a.length == 0;
    }

    @Override // java.util.Collection, java.lang.Iterable
    public final Iterator iterator() {
        return new onu(this.f46208a, 0);
    }

    @Override // java.util.Collection
    public final boolean remove(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Collection
    public final boolean removeAll(Collection collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Collection
    public final boolean retainAll(Collection collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Collection
    public final /* bridge */ int size() {
        return this.f46208a.length;
    }

    @Override // java.util.Collection
    public final Object[] toArray() {
        Object[] objArr = this.f46208a;
        if (this.f46209b && ooc.m18737c(objArr.getClass(), Object[].class)) {
            return objArr;
        }
        Object[] objArrCopyOf = Arrays.copyOf(objArr, objArr.length, Object[].class);
        objArrCopyOf.getClass();
        return objArrCopyOf;
    }

    @Override // java.util.Collection
    public final Object[] toArray(Object[] objArr) {
        objArr.getClass();
        return onz.m18733b(this, objArr);
    }
}
