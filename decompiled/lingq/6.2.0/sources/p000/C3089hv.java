package p000;

import java.lang.reflect.Array;
import java.util.Collection;
import java.util.Iterator;
import java.util.Set;

/* JADX INFO: renamed from: hv */
/* JADX INFO: loaded from: classes.dex */
public final class C3089hv implements Set {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ C3275kv f42963a;

    public C3089hv(C3275kv c3275kv) {
        this.f42963a = c3275kv;
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean add(Object obj) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean addAll(Collection collection) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Set, java.util.Collection
    public final void clear() {
        this.f42963a.clear();
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean contains(Object obj) {
        return this.f42963a.containsKey(obj);
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean containsAll(Collection collection) {
        return this.f42963a.m15703j(collection);
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean equals(Object obj) {
        C3275kv c3275kv = this.f42963a;
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Set)) {
            return false;
        }
        Set set = (Set) obj;
        try {
            return c3275kv.f49254c == set.size() && c3275kv.m15703j(set);
        } catch (ClassCastException | NullPointerException unused) {
            return false;
        }
    }

    @Override // java.util.Set, java.util.Collection
    public final int hashCode() {
        C3275kv c3275kv = this.f42963a;
        int iHashCode = 0;
        for (int i = c3275kv.f49254c - 1; i >= 0; i--) {
            Object objM15974f = c3275kv.m15974f(i);
            iHashCode += objM15974f == null ? 0 : objM15974f.hashCode();
        }
        return iHashCode;
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean isEmpty() {
        return this.f42963a.isEmpty();
    }

    @Override // java.util.Set, java.util.Collection, java.lang.Iterable
    public final Iterator iterator() {
        return new C3052gv(this.f42963a, 0);
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean remove(Object obj) {
        C3275kv c3275kv = this.f42963a;
        int iM15972d = c3275kv.m15972d(obj);
        if (iM15972d < 0) {
            return false;
        }
        c3275kv.m15975g(iM15972d);
        return true;
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean removeAll(Collection collection) {
        return this.f42963a.m15704k(collection);
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean retainAll(Collection collection) {
        C3275kv c3275kv = this.f42963a;
        int i = c3275kv.f49254c;
        for (int i2 = i - 1; i2 >= 0; i2--) {
            if (!collection.contains(c3275kv.m15974f(i2))) {
                c3275kv.m15975g(i2);
            }
        }
        return i != c3275kv.f49254c;
    }

    @Override // java.util.Set, java.util.Collection
    public final int size() {
        return this.f42963a.f49254c;
    }

    @Override // java.util.Set, java.util.Collection
    public final Object[] toArray(Object[] objArr) {
        C3275kv c3275kv = this.f42963a;
        int i = c3275kv.f49254c;
        if (objArr.length < i) {
            objArr = (Object[]) Array.newInstance(objArr.getClass().getComponentType(), i);
        }
        for (int i2 = 0; i2 < i; i2++) {
            objArr[i2] = c3275kv.m15974f(i2);
        }
        if (objArr.length > i) {
            objArr[i] = null;
        }
        return objArr;
    }

    @Override // java.util.Set, java.util.Collection
    public final Object[] toArray() {
        C3275kv c3275kv = this.f42963a;
        int i = c3275kv.f49254c;
        Object[] objArr = new Object[i];
        for (int i2 = 0; i2 < i; i2++) {
            objArr[i2] = c3275kv.m15974f(i2);
        }
        return objArr;
    }
}
