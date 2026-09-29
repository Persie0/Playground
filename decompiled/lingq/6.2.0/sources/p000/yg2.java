package p000;

/* JADX INFO: loaded from: classes3.dex */
public final class yg2 extends wc3 {

    /* JADX INFO: renamed from: b */
    public boolean f69809b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ gh2 f69810c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ zg2 f69811d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public yg2(yd9 yd9Var, gh2 gh2Var, zg2 zg2Var) {
        super(yd9Var);
        this.f69810c = gh2Var;
        this.f69811d = zg2Var;
    }

    @Override // p000.wc3, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        super.close();
        if (this.f69809b) {
            return;
        }
        this.f69809b = true;
        gh2 gh2Var = this.f69810c;
        zg2 zg2Var = this.f69811d;
        synchronized (gh2Var) {
            int i = zg2Var.f71528h - 1;
            zg2Var.f71528h = i;
            if (i == 0 && zg2Var.f71526f) {
                gh2Var.m12654z(zg2Var);
            }
        }
    }
}
