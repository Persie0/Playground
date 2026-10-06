package p000;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class nad extends mxk {

    /* JADX INFO: renamed from: a */
    final transient Object f41892a;

    public nad(Object obj) {
        obj.getClass();
        this.f41892a = obj;
    }

    @Override // p000.mwj, java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean contains(Object obj) {
        return this.f41892a.equals(obj);
    }

    @Override // p000.mxk, p000.mwj, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set, java.util.NavigableSet
    /* JADX INFO: renamed from: cr */
    public final naz listIterator() {
        return new myb(this.f41892a);
    }

    @Override // p000.mwj
    /* JADX INFO: renamed from: cs */
    public final boolean mo17014cs() {
        return false;
    }

    @Override // p000.mxk, java.util.Collection, java.util.Set
    public final int hashCode() {
        return this.f41892a.hashCode();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return 1;
    }

    @Override // java.util.AbstractCollection
    public final String toString() {
        return '[' + this.f41892a.toString() + ']';
    }

    @Override // p000.mxk, p000.mwj
    /* JADX INFO: renamed from: v */
    public final mws mo17025v() {
        return mws.m17097l(this.f41892a);
    }

    @Override // p000.mwj
    /* JADX INFO: renamed from: x */
    public final int mo17075x(Object[] objArr, int i) {
        objArr[i] = this.f41892a;
        return i + 1;
    }
}
