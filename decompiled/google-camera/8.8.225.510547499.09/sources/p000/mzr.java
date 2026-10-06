package p000;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class mzr extends mws {

    /* JADX INFO: renamed from: a */
    public static final mws f41857a = new mzr(new Object[0], 0);

    /* JADX INFO: renamed from: b */
    final transient Object[] f41858b;

    /* JADX INFO: renamed from: c */
    public final transient int f41859c;

    public mzr(Object[] objArr, int i) {
        this.f41858b = objArr;
        this.f41859c = i;
    }

    @Override // p000.mwj
    /* JADX INFO: renamed from: A */
    public final Object[] mo17074A() {
        return this.f41858b;
    }

    @Override // p000.mwj
    /* JADX INFO: renamed from: cs */
    public final boolean mo17014cs() {
        return false;
    }

    @Override // java.util.List
    public final Object get(int i) {
        lku.m15620O(i, this.f41859c);
        Object obj = this.f41858b[i];
        obj.getClass();
        return obj;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f41859c;
    }

    @Override // p000.mws, p000.mwj
    /* JADX INFO: renamed from: x */
    public final int mo17075x(Object[] objArr, int i) {
        System.arraycopy(this.f41858b, 0, objArr, i, this.f41859c);
        return i + this.f41859c;
    }

    @Override // p000.mwj
    /* JADX INFO: renamed from: y */
    public final int mo17076y() {
        return this.f41859c;
    }

    @Override // p000.mwj
    /* JADX INFO: renamed from: z */
    public final int mo17077z() {
        return 0;
    }
}
