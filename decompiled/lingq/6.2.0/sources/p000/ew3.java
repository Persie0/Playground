package p000;

import java.io.IOException;

/* JADX INFO: loaded from: classes2.dex */
public final class ew3 extends zv3 {

    /* JADX INFO: renamed from: e */
    public boolean f37986e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ew3(fw3 fw3Var, ex3 ex3Var) {
        super(fw3Var, ex3Var);
        ex3Var.getClass();
    }

    @Override // p000.zv3, p000.yd9
    /* JADX INFO: renamed from: F */
    public final long mo459F(aj0 aj0Var, long j) throws IOException {
        aj0Var.getClass();
        if (j < 0) {
            C3386nv.m17624j(wq1.m24116l("byteCount < 0: ", j));
            return 0L;
        }
        if (this.f72255c) {
            C3386nv.m17633t("closed");
            return 0L;
        }
        if (this.f37986e) {
            return -1L;
        }
        long jMo459F = super.mo459F(aj0Var, j);
        if (jMo459F != -1) {
            return jMo459F;
        }
        this.f37986e = true;
        m25809a(qr3.f58109b);
        return -1L;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        if (this.f72255c) {
            return;
        }
        if (!this.f37986e) {
            m25809a(fw3.f39779f);
        }
        this.f72255c = true;
    }
}
