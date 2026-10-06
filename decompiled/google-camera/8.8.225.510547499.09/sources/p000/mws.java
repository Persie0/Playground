package p000;

import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.util.Arrays;
import java.util.Collection;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.RandomAccess;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public abstract class mws extends mwj implements List, RandomAccess {

    /* JADX INFO: renamed from: a */
    private static final nba f41738a = new mwo(mzr.f41857a, 0);

    /* JADX INFO: renamed from: d */
    public static final /* synthetic */ int f41739d = 0;

    /* JADX INFO: renamed from: e */
    public static mwn m17090e() {
        return new mwn();
    }

    /* JADX INFO: renamed from: f */
    public static mwn m17091f(int i) {
        lku.m15655i(i, "expectedSize");
        return new mwn(i);
    }

    /* JADX INFO: renamed from: g */
    static mws m17092g(Object[] objArr) {
        return m17093h(objArr, objArr.length);
    }

    /* JADX INFO: renamed from: h */
    static mws m17093h(Object[] objArr, int i) {
        return i == 0 ? mzr.f41857a : new mzr(objArr, i);
    }

    /* JADX INFO: renamed from: i */
    public static mws m17094i(Iterable iterable) {
        iterable.getClass();
        if (iterable instanceof Collection) {
            return m17095j((Collection) iterable);
        }
        Iterator it = iterable.iterator();
        if (!it.hasNext()) {
            return mzr.f41857a;
        }
        Object next = it.next();
        if (!it.hasNext()) {
            return m17097l(next);
        }
        mwn mwnVar = new mwn();
        mwnVar.m17082g(next);
        mwnVar.m17084i(it);
        return mwnVar.m17081f();
    }

    /* JADX INFO: renamed from: j */
    public static mws m17095j(Collection collection) {
        if (!(collection instanceof mwj)) {
            return m17104u(collection.toArray());
        }
        mws mwsVarMo17025v = ((mwj) collection).mo17025v();
        return mwsVarMo17025v.mo17014cs() ? m17092g(mwsVarMo17025v.toArray()) : mwsVarMo17025v;
    }

    /* JADX INFO: renamed from: k */
    public static mws m17096k(Object[] objArr) {
        return objArr.length == 0 ? mzr.f41857a : m17104u((Object[]) objArr.clone());
    }

    /* JADX INFO: renamed from: l */
    public static mws m17097l(Object obj) {
        return m17104u(obj);
    }

    /* JADX INFO: renamed from: m */
    public static mws m17098m(Object obj, Object obj2) {
        return m17104u(obj, obj2);
    }

    /* JADX INFO: renamed from: n */
    public static mws m17099n(Object obj, Object obj2, Object obj3) {
        return m17104u(obj, obj2, obj3);
    }

    /* JADX INFO: renamed from: o */
    public static mws m17100o(Object obj, Object obj2, Object obj3, Object obj4) {
        return m17104u(obj, obj2, obj3, obj4);
    }

    /* JADX INFO: renamed from: p */
    public static mws m17101p(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        return m17104u(obj, obj2, obj3, obj4, obj5);
    }

    @SafeVarargs
    /* JADX INFO: renamed from: q */
    public static mws m17102q(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, Object obj7, Object obj8, Object obj9, Object obj10, Object obj11, Object obj12, Object... objArr) {
        lku.m15670x(true, "the total number of elements must fit in an int");
        int length = objArr.length;
        Object[] objArr2 = new Object[length + 12];
        objArr2[0] = obj;
        objArr2[1] = obj2;
        objArr2[2] = obj3;
        objArr2[3] = obj4;
        objArr2[4] = obj5;
        objArr2[5] = obj6;
        objArr2[6] = obj7;
        objArr2[7] = obj8;
        objArr2[8] = obj9;
        objArr2[9] = obj10;
        objArr2[10] = obj11;
        objArr2[11] = obj12;
        System.arraycopy(objArr, 0, objArr2, 12, length);
        return m17104u(objArr2);
    }

    /* JADX INFO: renamed from: r */
    public static mws m17103r(Comparator comparator, Iterable iterable) {
        comparator.getClass();
        Object[] objArrM16519aa = mkv.m16519aa(iterable);
        mkv.m16552q(objArrM16519aa);
        Arrays.sort(objArrM16519aa, comparator);
        return m17092g(objArrM16519aa);
    }

    private void readObject(ObjectInputStream objectInputStream) throws InvalidObjectException {
        throw new InvalidObjectException("Use SerializedForm");
    }

    /* JADX INFO: renamed from: u */
    private static mws m17104u(Object... objArr) {
        mkv.m16552q(objArr);
        return m17092g(objArr);
    }

    /* JADX INFO: renamed from: a */
    public mws mo17088a() {
        return size() <= 1 ? this : new mwp(this);
    }

    @Override // java.util.List
    @Deprecated
    public final void add(int i, Object obj) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.List
    @Deprecated
    public final boolean addAll(int i, Collection collection) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.List
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public mws subList(int i, int i2) {
        lku.m15612G(i, i2, size());
        int i3 = i2 - i;
        if (i3 == size()) {
            return this;
        }
        return i3 == 0 ? mzr.f41857a : new mwr(this, i, i3);
    }

    @Override // p000.mwj, java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean contains(Object obj) {
        return indexOf(obj) >= 0;
    }

    @Override // p000.mwj
    /* JADX INFO: renamed from: cr */
    public final naz listIterator() {
        return iterator();
    }

    @Override // java.util.Collection, java.util.List
    public final boolean equals(Object obj) {
        return mkv.m16505M(this, obj);
    }

    @Override // java.util.Collection, java.util.List
    public final int hashCode() {
        int size = size();
        int iHashCode = 1;
        for (int i = 0; i < size; i++) {
            iHashCode = (iHashCode * 31) + get(i).hashCode();
        }
        return iHashCode;
    }

    public int indexOf(Object obj) {
        if (obj == null) {
            return -1;
        }
        int size = size();
        for (int i = 0; i < size; i++) {
            if (obj.equals(get(i))) {
                return i;
            }
        }
        return -1;
    }

    public int lastIndexOf(Object obj) {
        if (obj == null) {
            return -1;
        }
        for (int size = size() - 1; size >= 0; size--) {
            if (obj.equals(get(size))) {
                return size;
            }
        }
        return -1;
    }

    @Override // java.util.List
    @Deprecated
    public final Object remove(int i) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.List
    /* JADX INFO: renamed from: s, reason: merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public final nba listIterator() {
        return listIterator(0);
    }

    @Override // java.util.List
    @Deprecated
    public final Object set(int i, Object obj) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.List
    /* JADX INFO: renamed from: t, reason: merged with bridge method [inline-methods] */
    public final nba listIterator(int i) {
        lku.m15621P(i, size());
        return isEmpty() ? f41738a : new mwo(this, i);
    }

    @Override // p000.mwj
    @Deprecated
    /* JADX INFO: renamed from: v */
    public final mws mo17025v() {
        return this;
    }

    @Override // p000.mwj
    Object writeReplace() {
        return new mwq(toArray());
    }

    @Override // p000.mwj
    /* JADX INFO: renamed from: x */
    public int mo17075x(Object[] objArr, int i) {
        int size = size();
        for (int i2 = 0; i2 < size; i2++) {
            objArr[i + i2] = get(i2);
        }
        return i + size;
    }
}
