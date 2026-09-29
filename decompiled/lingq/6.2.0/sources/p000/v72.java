package p000;

/* JADX INFO: loaded from: classes.dex */
public final class v72 extends xu2 {

    /* JADX INFO: renamed from: d */
    public static final v72 f64959d;

    /* JADX INFO: renamed from: c */
    public tn1 f64960c;

    static {
        int i = bs9.f8952c;
        int i2 = bs9.f8953d;
        long j = bs9.f8954e;
        String str = bs9.f8950a;
        v72 v72Var = new v72();
        v72Var.f64960c = new tn1(i, j, str, i2);
        f64959d = v72Var;
    }

    @Override // p000.nn1
    /* JADX INFO: renamed from: T */
    public final void mo385T(kn1 kn1Var, Runnable runnable) {
        tn1.m22239c(this.f64960c, runnable, 6);
    }

    @Override // p000.nn1
    /* JADX INFO: renamed from: W */
    public final void mo386W(kn1 kn1Var, Runnable runnable) {
        tn1.m22239c(this.f64960c, runnable, 2);
    }

    @Override // p000.nn1
    /* JADX INFO: renamed from: Z */
    public final nn1 mo387Z(int i) {
        l70.m15942e(1);
        return 1 >= bs9.f8952c ? this : super.mo387Z(1);
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        throw new UnsupportedOperationException("Dispatchers.Default cannot be closed");
    }

    @Override // p000.nn1
    public final String toString() {
        return "Dispatchers.Default";
    }
}
