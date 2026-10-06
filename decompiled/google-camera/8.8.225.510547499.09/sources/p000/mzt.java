package p000;

import java.util.Map;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
final class mzt extends mxk {

    /* JADX INFO: renamed from: a */
    public final transient Object[] f41861a;

    /* JADX INFO: renamed from: b */
    public final transient int f41862b;

    /* JADX INFO: renamed from: c */
    public final transient int f41863c;

    /* JADX INFO: renamed from: d */
    private final transient mwx f41864d;

    public mzt(mwx mwxVar, Object[] objArr, int i, int i2) {
        this.f41864d = mwxVar;
        this.f41861a = objArr;
        this.f41862b = i;
        this.f41863c = i2;
    }

    @Override // p000.mxk
    /* JADX INFO: renamed from: C */
    public final mws mo17143C() {
        return new mzs(this);
    }

    @Override // p000.mwj, java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean contains(Object obj) {
        if (obj instanceof Map.Entry) {
            Map.Entry entry = (Map.Entry) obj;
            Object key = entry.getKey();
            Object value = entry.getValue();
            if (value != null && value.equals(this.f41864d.get(key))) {
                return true;
            }
        }
        return false;
    }

    @Override // p000.mxk, p000.mwj, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set, java.util.NavigableSet
    /* JADX INFO: renamed from: cr */
    public final naz listIterator() {
        return mo17025v().iterator();
    }

    @Override // p000.mwj
    /* JADX INFO: renamed from: cs */
    public final boolean mo17014cs() {
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return this.f41863c;
    }

    @Override // p000.mwj
    /* JADX INFO: renamed from: x */
    public final int mo17075x(Object[] objArr, int i) {
        return mo17025v().mo17075x(objArr, i);
    }
}
