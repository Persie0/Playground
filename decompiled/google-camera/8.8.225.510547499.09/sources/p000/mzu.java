package p000;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
final class mzu extends mxk {

    /* JADX INFO: renamed from: a */
    private final transient mwx f41865a;

    /* JADX INFO: renamed from: b */
    private final transient mws f41866b;

    public mzu(mwx mwxVar, mws mwsVar) {
        this.f41865a = mwxVar;
        this.f41866b = mwsVar;
    }

    @Override // p000.mwj, java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean contains(Object obj) {
        return this.f41865a.get(obj) != null;
    }

    @Override // p000.mxk, p000.mwj, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set, java.util.NavigableSet
    /* JADX INFO: renamed from: cr */
    public final naz listIterator() {
        return this.f41866b.iterator();
    }

    @Override // p000.mwj
    /* JADX INFO: renamed from: cs */
    public final boolean mo17014cs() {
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return this.f41865a.size();
    }

    @Override // p000.mxk, p000.mwj
    /* JADX INFO: renamed from: v */
    public final mws mo17025v() {
        return this.f41866b;
    }

    @Override // p000.mwj
    /* JADX INFO: renamed from: x */
    public final int mo17075x(Object[] objArr, int i) {
        return this.f41866b.mo17075x(objArr, i);
    }
}
