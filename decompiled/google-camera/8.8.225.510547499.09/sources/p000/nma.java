package p000;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public enum nma implements nxt {
    UNKNOWN(0),
    SLOWEST(1),
    SLOW(2),
    LITTLE_FAST(3),
    FAST(4),
    FASTEST(5),
    AUTO(6);


    /* JADX INFO: renamed from: h */
    public final int f43724h;

    nma(int i) {
        this.f43724h = i;
    }

    @Override // p000.nxt
    /* JADX INFO: renamed from: a */
    public final int mo14936a() {
        return this.f43724h;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return Integer.toString(this.f43724h);
    }
}
