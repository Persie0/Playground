package p000;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
final class mxf extends mwj {

    /* JADX INFO: renamed from: a */
    public final mwx f41757a;

    public mxf(mwx mwxVar) {
        this.f41757a = mwxVar;
    }

    @Override // p000.mwj, java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean contains(Object obj) {
        if (obj == null) {
            return false;
        }
        naz nazVarListIterator = listIterator();
        while (nazVarListIterator.hasNext()) {
            if (obj.equals(nazVarListIterator.next())) {
                return true;
            }
        }
        return false;
    }

    @Override // p000.mwj, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set, java.util.NavigableSet
    /* JADX INFO: renamed from: cr */
    public final naz listIterator() {
        return new mxc(this);
    }

    @Override // p000.mwj
    /* JADX INFO: renamed from: cs */
    public final boolean mo17014cs() {
        throw null;
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final int size() {
        return this.f41757a.size();
    }

    @Override // p000.mwj
    /* JADX INFO: renamed from: v */
    public final mws mo17025v() {
        return new mxd(this.f41757a.entrySet().mo17025v());
    }

    @Override // p000.mwj
    Object writeReplace() {
        return new mxe(this.f41757a);
    }
}
