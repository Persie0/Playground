package p000;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class lns {

    /* JADX INFO: renamed from: f */
    private static final ksi f38771f = new ksl();

    /* JADX INFO: renamed from: b */
    public final oju f38773b;

    /* JADX INFO: renamed from: c */
    public final ksi f38774c;

    /* JADX INFO: renamed from: a */
    public final Object f38772a = new Object();

    /* JADX INFO: renamed from: d */
    public int f38775d = 0;

    /* JADX INFO: renamed from: e */
    public long f38776e = 0;

    public lns(oju ojuVar, ksi ksiVar) {
        this.f38773b = ojuVar;
        this.f38774c = ksiVar;
    }

    /* JADX INFO: renamed from: a */
    public static lns m15771a(final int i) {
        return new lns(new oju() { // from class: lnr
            @Override // p000.oju
            public final Object get() {
                return Integer.valueOf(i);
            }
        }, f38771f);
    }
}
