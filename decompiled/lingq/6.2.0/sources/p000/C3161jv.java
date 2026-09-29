package p000;

import java.lang.reflect.Array;
import java.util.Collection;
import java.util.Iterator;

/* JADX INFO: renamed from: jv */
/* JADX INFO: loaded from: classes.dex */
public final class C3161jv implements Collection {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ C3275kv f46172a;

    public C3161jv(C3275kv c3275kv) {
        this.f46172a = c3275kv;
    }

    @Override // java.util.Collection
    public final boolean add(Object obj) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Collection
    public final boolean addAll(Collection collection) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Collection
    public final void clear() {
        this.f46172a.clear();
    }

    @Override // java.util.Collection
    public final boolean contains(Object obj) {
        return this.f46172a.m15969a(obj) >= 0;
    }

    @Override // java.util.Collection
    public final boolean containsAll(Collection collection) {
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
        return this.f46172a.isEmpty();
    }

    @Override // java.util.Collection, java.lang.Iterable
    public final Iterator iterator() {
        return new C3052gv(this.f46172a, 1);
    }

    @Override // java.util.Collection
    public final boolean remove(Object obj) {
        C3275kv c3275kv = this.f46172a;
        int iM15969a = c3275kv.m15969a(obj);
        if (iM15969a < 0) {
            return false;
        }
        c3275kv.m15975g(iM15969a);
        return true;
    }

    @Override // java.util.Collection
    public final boolean removeAll(Collection collection) {
        C3275kv c3275kv = this.f46172a;
        int i = c3275kv.f49254c;
        int i2 = 0;
        boolean z = false;
        while (i2 < i) {
            if (collection.contains(c3275kv.m15977i(i2))) {
                c3275kv.m15975g(i2);
                i2--;
                i--;
                z = true;
            }
            i2++;
        }
        return z;
    }

    @Override // java.util.Collection
    public final boolean retainAll(Collection collection) {
        C3275kv c3275kv = this.f46172a;
        int i = c3275kv.f49254c;
        int i2 = 0;
        boolean z = false;
        while (i2 < i) {
            if (!collection.contains(c3275kv.m15977i(i2))) {
                c3275kv.m15975g(i2);
                i2--;
                i--;
                z = true;
            }
            i2++;
        }
        return z;
    }

    @Override // java.util.Collection
    public final int size() {
        return this.f46172a.f49254c;
    }

    @Override // java.util.Collection
    public final Object[] toArray(Object[] objArr) {
        C3275kv c3275kv = this.f46172a;
        int i = c3275kv.f49254c;
        if (objArr.length < i) {
            objArr = (Object[]) Array.newInstance(objArr.getClass().getComponentType(), i);
        }
        for (int i2 = 0; i2 < i; i2++) {
            objArr[i2] = c3275kv.m15977i(i2);
        }
        if (objArr.length > i) {
            objArr[i] = null;
        }
        return objArr;
    }

    @Override // java.util.Collection
    public final Object[] toArray() {
        C3275kv c3275kv = this.f46172a;
        int i = c3275kv.f49254c;
        Object[] objArr = new Object[i];
        for (int i2 = 0; i2 < i; i2++) {
            objArr[i2] = c3275kv.m15977i(i2);
        }
        return objArr;
    }
}
