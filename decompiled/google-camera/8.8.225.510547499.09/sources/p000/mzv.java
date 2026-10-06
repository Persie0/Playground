package p000;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
final class mzv extends mws {

    /* JADX INFO: renamed from: a */
    private final transient Object[] f41867a;

    /* JADX INFO: renamed from: b */
    private final transient int f41868b;

    /* JADX INFO: renamed from: c */
    private final transient int f41869c;

    public mzv(Object[] objArr, int i, int i2) {
        this.f41867a = objArr;
        this.f41868b = i;
        this.f41869c = i2;
    }

    @Override // p000.mwj
    /* JADX INFO: renamed from: cs */
    public final boolean mo17014cs() {
        return true;
    }

    @Override // java.util.List
    public final Object get(int i) {
        lku.m15620O(i, this.f41869c);
        Object obj = this.f41867a[i + i + this.f41868b];
        obj.getClass();
        return obj;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f41869c;
    }
}
