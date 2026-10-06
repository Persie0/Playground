package p000;

import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.util.Arrays;
import java.util.Comparator;
import java.util.NavigableSet;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public abstract class mxt extends mxu implements NavigableSet, nae {

    /* JADX INFO: renamed from: b */
    final transient Comparator f41779b;

    /* JADX INFO: renamed from: c */
    transient mxt f41780c;

    public mxt(Comparator comparator) {
        this.f41779b = comparator;
    }

    /* JADX INFO: renamed from: P */
    public static mxt m17154P(Comparator comparator, int i, Object... objArr) {
        if (i == 0) {
            return m17155Q(comparator);
        }
        mkv.m16553r(objArr, i);
        Arrays.sort(objArr, 0, i, comparator);
        int i2 = 1;
        for (int i3 = 1; i3 < i; i3++) {
            Object obj = objArr[i3];
            if (comparator.compare(obj, objArr[i2 - 1]) != 0) {
                objArr[i2] = obj;
                i2++;
            }
        }
        Arrays.fill(objArr, i2, i, (Object) null);
        if (i2 < (objArr.length >> 1)) {
            objArr = Arrays.copyOf(objArr, i2);
        }
        return new mzy(mws.m17093h(objArr, i2), comparator);
    }

    /* JADX INFO: renamed from: Q */
    static mzy m17155Q(Comparator comparator) {
        if (mzg.f41839a.equals(comparator)) {
            return mzy.f41881a;
        }
        int i = mws.f41739d;
        return new mzy(mzr.f41857a, comparator);
    }

    private void readObject(ObjectInputStream objectInputStream) throws InvalidObjectException {
        throw new InvalidObjectException("Use SerializedForm");
    }

    /* JADX INFO: renamed from: O */
    final int m17156O(Object obj, Object obj2) {
        return this.f41779b.compare(obj, obj2);
    }

    public Object ceiling(Object obj) {
        return mkv.m16514V(tailSet(obj, true), null);
    }

    @Override // java.util.SortedSet, p000.nae
    public final Comparator comparator() {
        return this.f41779b;
    }

    @Override // java.util.NavigableSet
    /* JADX INFO: renamed from: cp, reason: merged with bridge method [inline-methods] */
    public mxt descendingSet() {
        mxt mxtVar = this.f41780c;
        if (mxtVar != null) {
            return mxtVar;
        }
        mxt mxtVarMo16989k = mo16989k();
        this.f41780c = mxtVarMo16989k;
        mxtVarMo16989k.f41780c = this;
        return mxtVarMo16989k;
    }

    @Override // java.util.NavigableSet
    /* JADX INFO: renamed from: cq, reason: merged with bridge method [inline-methods] */
    public abstract naz descendingIterator();

    @Override // p000.mxk, p000.mwj, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set, java.util.NavigableSet
    /* JADX INFO: renamed from: cr */
    public abstract naz listIterator();

    public Object first() {
        return listIterator().next();
    }

    public Object floor(Object obj) {
        return mkv.m16509Q(mo16991m(obj, true).descendingIterator(), null);
    }

    public Object higher(Object obj) {
        return mkv.m16514V(tailSet(obj, false), null);
    }

    /* JADX INFO: renamed from: k */
    public abstract mxt mo16989k();

    @Override // java.util.NavigableSet, java.util.SortedSet
    /* JADX INFO: renamed from: l */
    public mxt mo16990l(Object obj) {
        return mo16991m(obj, false);
    }

    public Object last() {
        return descendingIterator().next();
    }

    public Object lower(Object obj) {
        return mkv.m16509Q(mo16991m(obj, false).descendingIterator(), null);
    }

    @Override // java.util.NavigableSet
    /* JADX INFO: renamed from: m */
    public mxt mo16991m(Object obj, boolean z) {
        obj.getClass();
        return mo16992n(obj, z);
    }

    /* JADX INFO: renamed from: n */
    public abstract mxt mo16992n(Object obj, boolean z);

    @Override // java.util.NavigableSet, java.util.SortedSet
    /* JADX INFO: renamed from: o */
    public mxt subSet(Object obj, Object obj2) {
        return subSet(obj, true, obj2, false);
    }

    @Override // java.util.NavigableSet
    /* JADX INFO: renamed from: p */
    public mxt subSet(Object obj, boolean z, Object obj2, boolean z2) {
        obj.getClass();
        obj2.getClass();
        lku.m15669w(this.f41779b.compare(obj, obj2) <= 0);
        return mo16995q(obj, z, obj2, z2);
    }

    @Override // java.util.NavigableSet
    @Deprecated
    public final Object pollFirst() {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.NavigableSet
    @Deprecated
    public final Object pollLast() {
        throw new UnsupportedOperationException();
    }

    /* JADX INFO: renamed from: q */
    public abstract mxt mo16995q(Object obj, boolean z, Object obj2, boolean z2);

    @Override // java.util.NavigableSet, java.util.SortedSet
    /* JADX INFO: renamed from: r */
    public mxt tailSet(Object obj) {
        return tailSet(obj, true);
    }

    @Override // java.util.NavigableSet
    /* JADX INFO: renamed from: s */
    public mxt tailSet(Object obj, boolean z) {
        obj.getClass();
        return mo16998t(obj, z);
    }

    /* JADX INFO: renamed from: t */
    public abstract mxt mo16998t(Object obj, boolean z);

    @Override // p000.mxk, p000.mwj
    Object writeReplace() {
        return new mxs(this.f41779b, toArray());
    }
}
