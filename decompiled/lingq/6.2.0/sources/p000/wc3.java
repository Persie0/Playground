package p000;

/* JADX INFO: loaded from: classes.dex */
public abstract class wc3 implements yd9 {

    /* JADX INFO: renamed from: a */
    public final yd9 f66615a;

    public wc3(yd9 yd9Var) {
        yd9Var.getClass();
        this.f66615a = yd9Var;
    }

    @Override // p000.yd9
    /* JADX INFO: renamed from: F */
    public long mo459F(aj0 aj0Var, long j) {
        aj0Var.getClass();
        return this.f66615a.mo459F(aj0Var, j);
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        this.f66615a.close();
    }

    @Override // p000.yd9, p000.t89
    /* JADX INFO: renamed from: i */
    public final c1a mo484i() {
        return this.f66615a.mo484i();
    }

    public final String toString() {
        return getClass().getSimpleName() + '(' + this.f66615a + ')';
    }
}
