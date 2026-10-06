package p000;

import java.util.Iterator;
import java.util.Map;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
final class mxb extends mxw {

    /* JADX INFO: renamed from: a */
    private final mwx f41752a;

    public mxb(mwx mwxVar) {
        this.f41752a = mwxVar;
    }

    @Override // p000.mxw
    /* JADX INFO: renamed from: a */
    public final Object mo17125a(int i) {
        return ((Map.Entry) this.f41752a.entrySet().mo17025v().get(i)).getKey();
    }

    @Override // p000.mwj, java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean contains(Object obj) {
        return this.f41752a.containsKey(obj);
    }

    @Override // p000.mxw, p000.mxk, p000.mwj
    /* JADX INFO: renamed from: cr */
    public final naz listIterator() {
        return this.f41752a.mo17079cv();
    }

    @Override // p000.mwj
    /* JADX INFO: renamed from: cs */
    public final boolean mo17014cs() {
        return true;
    }

    @Override // p000.mxw, p000.mxk, p000.mwj, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set, java.util.NavigableSet
    /* JADX INFO: renamed from: iterator */
    public final /* bridge */ /* synthetic */ Iterator listIterator() {
        return listIterator();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return this.f41752a.size();
    }

    @Override // p000.mxk, p000.mwj
    Object writeReplace() {
        return new mxa(this.f41752a);
    }
}
