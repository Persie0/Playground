package p000;

import java.util.List;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
final class mwp extends mws {

    /* JADX INFO: renamed from: a */
    private final transient mws f41733a;

    public mwp(mws mwsVar) {
        this.f41733a = mwsVar;
    }

    /* JADX INFO: renamed from: u */
    private final int m17086u(int i) {
        return (size() - 1) - i;
    }

    /* JADX INFO: renamed from: w */
    private final int m17087w(int i) {
        return size() - i;
    }

    @Override // p000.mws
    /* JADX INFO: renamed from: a */
    public final mws mo17088a() {
        return this.f41733a;
    }

    @Override // p000.mws
    /* JADX INFO: renamed from: b */
    public final mws subList(int i, int i2) {
        lku.m15612G(i, i2, size());
        return this.f41733a.subList(m17087w(i2), m17087w(i)).mo17088a();
    }

    @Override // p000.mws, p000.mwj, java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean contains(Object obj) {
        return this.f41733a.contains(obj);
    }

    @Override // p000.mwj
    /* JADX INFO: renamed from: cs */
    public final boolean mo17014cs() {
        return this.f41733a.mo17014cs();
    }

    @Override // java.util.List
    public final Object get(int i) {
        lku.m15620O(i, size());
        return this.f41733a.get(m17086u(i));
    }

    @Override // p000.mws, java.util.List
    public final int indexOf(Object obj) {
        int iLastIndexOf = this.f41733a.lastIndexOf(obj);
        if (iLastIndexOf >= 0) {
            return m17086u(iLastIndexOf);
        }
        return -1;
    }

    @Override // p000.mws, java.util.List
    public final int lastIndexOf(Object obj) {
        int iIndexOf = this.f41733a.indexOf(obj);
        if (iIndexOf >= 0) {
            return m17086u(iIndexOf);
        }
        return -1;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f41733a.size();
    }

    @Override // p000.mws, java.util.List
    public final /* bridge */ /* synthetic */ List subList(int i, int i2) {
        return subList(i, i2);
    }
}
