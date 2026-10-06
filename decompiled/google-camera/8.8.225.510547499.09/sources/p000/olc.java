package p000;

import java.io.NotSerializableException;
import java.io.Serializable;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.RandomAccess;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class olc extends okq implements List, RandomAccess, Serializable {

    /* JADX INFO: renamed from: a */
    public Object[] f46231a;

    /* JADX INFO: renamed from: b */
    public int f46232b;

    /* JADX INFO: renamed from: c */
    public int f46233c;

    /* JADX INFO: renamed from: d */
    public boolean f46234d;

    /* JADX INFO: renamed from: e */
    public final olc f46235e;

    /* JADX INFO: renamed from: f */
    private final olc f46236f;

    public olc() {
        this(10);
    }

    /* JADX INFO: renamed from: d */
    private final int m18609d(int i, int i2, Collection collection, boolean z) {
        olc olcVar = this.f46235e;
        if (olcVar != null) {
            int iM18609d = olcVar.m18609d(i, i2, collection, z);
            this.f46233c -= iM18609d;
            return iM18609d;
        }
        int i3 = 0;
        int i4 = 0;
        while (i3 < i2) {
            int i5 = i + i3;
            if (collection.contains(this.f46231a[i5]) == z) {
                Object[] objArr = this.f46231a;
                objArr[i4 + i] = objArr[i5];
                i3++;
                i4++;
            } else {
                i3++;
            }
        }
        int i6 = i2 - i4;
        Object[] objArr2 = this.f46231a;
        omn.m18693ag(objArr2, objArr2, i + i4, i2 + i, this.f46233c);
        Object[] objArr3 = this.f46231a;
        int i7 = this.f46233c;
        omn.m18715t(objArr3, i7 - i6, i7);
        this.f46233c -= i6;
        return i6;
    }

    /* JADX INFO: renamed from: e */
    private final Object m18610e(int i) {
        olc olcVar = this.f46235e;
        if (olcVar != null) {
            Object objM18610e = olcVar.m18610e(i);
            this.f46233c--;
            return objM18610e;
        }
        Object[] objArr = this.f46231a;
        Object obj = objArr[i];
        omn.m18693ag(objArr, objArr, i, i + 1, this.f46232b + this.f46233c);
        omn.m18714s(this.f46231a, (this.f46232b + this.f46233c) - 1);
        this.f46233c--;
        return obj;
    }

    /* JADX INFO: renamed from: f */
    private final void m18611f(int i, Collection collection, int i2) {
        olc olcVar = this.f46235e;
        if (olcVar != null) {
            olcVar.m18611f(i, collection, i2);
            this.f46231a = this.f46235e.f46231a;
            this.f46233c += i2;
        } else {
            m18613h(i, i2);
            Iterator it = collection.iterator();
            for (int i3 = 0; i3 < i2; i3++) {
                this.f46231a[i + i3] = it.next();
            }
        }
    }

    /* JADX INFO: renamed from: g */
    private final void m18612g(int i, Object obj) {
        olc olcVar = this.f46235e;
        if (olcVar == null) {
            m18613h(i, 1);
            this.f46231a[i] = obj;
        } else {
            olcVar.m18612g(i, obj);
            this.f46231a = this.f46235e.f46231a;
            this.f46233c++;
        }
    }

    /* JADX INFO: renamed from: h */
    private final void m18613h(int i, int i2) {
        int i3 = this.f46233c + i2;
        if (this.f46235e != null) {
            throw new IllegalStateException();
        }
        if (i3 < 0) {
            throw new OutOfMemoryError();
        }
        Object[] objArr = this.f46231a;
        int length = objArr.length;
        if (i3 > length) {
            this.f46231a = omn.m18716u(objArr, lkm.m15586m(length, i3));
        }
        Object[] objArr2 = this.f46231a;
        omn.m18693ag(objArr2, objArr2, i + i2, i, this.f46232b + this.f46233c);
        this.f46233c += i2;
    }

    /* JADX INFO: renamed from: i */
    private final void m18614i(int i, int i2) {
        olc olcVar = this.f46235e;
        if (olcVar != null) {
            olcVar.m18614i(i, i2);
        } else {
            Object[] objArr = this.f46231a;
            omn.m18693ag(objArr, objArr, i, i + i2, this.f46233c);
            Object[] objArr2 = this.f46231a;
            int i3 = this.f46233c;
            omn.m18715t(objArr2, i3 - i2, i3);
        }
        this.f46233c -= i2;
    }

    /* JADX INFO: renamed from: j */
    private final boolean m18615j() {
        if (this.f46234d) {
            return true;
        }
        olc olcVar = this.f46236f;
        return olcVar != null && olcVar.f46234d;
    }

    @Override // p000.okq
    /* JADX INFO: renamed from: a */
    public final int mo18594a() {
        return this.f46233c;
    }

    @Override // java.util.AbstractList, java.util.List
    public final void add(int i, Object obj) {
        m18616c();
        lkm.m15588o(i, this.f46233c);
        m18612g(this.f46232b + i, obj);
    }

    @Override // java.util.AbstractList, java.util.List
    public final boolean addAll(int i, Collection collection) {
        collection.getClass();
        m18616c();
        lkm.m15588o(i, this.f46233c);
        int size = collection.size();
        m18611f(this.f46232b + i, collection, size);
        return size > 0;
    }

    @Override // p000.okq
    /* JADX INFO: renamed from: b */
    public final Object mo18595b(int i) {
        m18616c();
        lkm.m15587n(i, this.f46233c);
        return m18610e(this.f46232b + i);
    }

    /* JADX INFO: renamed from: c */
    public final void m18616c() {
        if (m18615j()) {
            throw new UnsupportedOperationException();
        }
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final void clear() {
        m18616c();
        m18614i(this.f46232b, this.f46233c);
    }

    @Override // java.util.AbstractList, java.util.Collection, java.util.List
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof List)) {
            return false;
        }
        List list = (List) obj;
        Object[] objArr = this.f46231a;
        int i = this.f46232b;
        int i2 = this.f46233c;
        if (i2 == list.size()) {
            for (int i3 = 0; i3 < i2; i3++) {
                if (ooc.m18737c(objArr[i + i3], list.get(i3))) {
                }
            }
            return true;
        }
        return false;
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object get(int i) {
        lkm.m15587n(i, this.f46233c);
        return this.f46231a[this.f46232b + i];
    }

    @Override // java.util.AbstractList, java.util.Collection, java.util.List
    public final int hashCode() {
        Object[] objArr = this.f46231a;
        int i = this.f46232b;
        int i2 = this.f46233c;
        int iHashCode = 1;
        for (int i3 = 0; i3 < i2; i3++) {
            Object obj = objArr[i + i3];
            iHashCode = (iHashCode * 31) + (obj != null ? obj.hashCode() : 0);
        }
        return iHashCode;
    }

    @Override // java.util.AbstractList, java.util.List
    public final int indexOf(Object obj) {
        for (int i = 0; i < this.f46233c; i++) {
            if (ooc.m18737c(this.f46231a[this.f46232b + i], obj)) {
                return i;
            }
        }
        return -1;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean isEmpty() {
        return this.f46233c == 0;
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.List
    public final Iterator iterator() {
        return new olb(this, 0);
    }

    @Override // java.util.AbstractList, java.util.List
    public final int lastIndexOf(Object obj) {
        for (int i = this.f46233c - 1; i >= 0; i--) {
            if (ooc.m18737c(this.f46231a[this.f46232b + i], obj)) {
                return i;
            }
        }
        return -1;
    }

    @Override // java.util.AbstractList, java.util.List
    public final ListIterator listIterator() {
        return new olb(this, 0);
    }

    @Override // java.util.AbstractList, java.util.List
    public final ListIterator listIterator(int i) {
        lkm.m15588o(i, this.f46233c);
        return new olb(this, i);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean remove(Object obj) {
        m18616c();
        int iIndexOf = indexOf(obj);
        if (iIndexOf >= 0) {
            mo18595b(iIndexOf);
        }
        return iIndexOf >= 0;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean removeAll(Collection collection) {
        collection.getClass();
        m18616c();
        return m18609d(this.f46232b, this.f46233c, collection, false) > 0;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean retainAll(Collection collection) {
        collection.getClass();
        m18616c();
        return m18609d(this.f46232b, this.f46233c, collection, true) > 0;
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object set(int i, Object obj) {
        m18616c();
        lkm.m15587n(i, this.f46233c);
        Object[] objArr = this.f46231a;
        int i2 = this.f46232b + i;
        Object obj2 = objArr[i2];
        objArr[i2] = obj;
        return obj2;
    }

    @Override // java.util.AbstractList, java.util.List
    public final List subList(int i, int i2) {
        lkm.m15589p(i, i2, this.f46233c);
        Object[] objArr = this.f46231a;
        int i3 = this.f46232b + i;
        boolean z = this.f46234d;
        olc olcVar = this.f46236f;
        return new olc(objArr, i3, i2 - i, z, this, olcVar == null ? this : olcVar);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final Object[] toArray() {
        Object[] objArr = this.f46231a;
        int i = this.f46232b;
        return omn.m18685Y(objArr, i, this.f46233c + i);
    }

    @Override // java.util.AbstractCollection
    public final String toString() {
        Object[] objArr = this.f46231a;
        int i = this.f46232b;
        int i2 = this.f46233c;
        StringBuilder sb = new StringBuilder((i2 * 3) + 2);
        sb.append("[");
        for (int i3 = 0; i3 < i2; i3++) {
            if (i3 > 0) {
                sb.append(", ");
            }
            sb.append(objArr[i + i3]);
        }
        sb.append("]");
        return sb.toString();
    }

    public olc(int i) {
        this(new Object[i], 0, 0, false, null, null);
    }

    private final Object writeReplace() throws NotSerializableException {
        if (m18615j()) {
            return new olk(this, 0);
        }
        throw new NotSerializableException("The list cannot be serialized while it is being built.");
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final Object[] toArray(Object[] objArr) {
        objArr.getClass();
        int length = objArr.length;
        int i = this.f46233c;
        if (length < i) {
            Object[] objArr2 = this.f46231a;
            int i2 = this.f46232b;
            Object[] objArrCopyOfRange = Arrays.copyOfRange(objArr2, i2, i + i2, objArr.getClass());
            objArrCopyOfRange.getClass();
            return objArrCopyOfRange;
        }
        Object[] objArr3 = this.f46231a;
        int i3 = this.f46232b;
        omn.m18693ag(objArr3, objArr, 0, i3, i + i3);
        int i4 = this.f46233c;
        if (length > i4) {
            objArr[i4] = null;
        }
        return objArr;
    }

    private olc(Object[] objArr, int i, int i2, boolean z, olc olcVar, olc olcVar2) {
        this.f46231a = objArr;
        this.f46232b = i;
        this.f46233c = i2;
        this.f46234d = z;
        this.f46235e = olcVar;
        this.f46236f = olcVar2;
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean add(Object obj) {
        m18616c();
        m18612g(this.f46232b + this.f46233c, obj);
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean addAll(Collection collection) {
        collection.getClass();
        m18616c();
        int size = collection.size();
        m18611f(this.f46232b + this.f46233c, collection, size);
        return size > 0;
    }
}
