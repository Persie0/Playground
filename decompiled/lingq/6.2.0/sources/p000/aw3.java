package p000;

/* JADX INFO: loaded from: classes3.dex */
public final class aw3 implements t89 {

    /* JADX INFO: renamed from: a */
    public final yc3 f7603a;

    /* JADX INFO: renamed from: b */
    public boolean f7604b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ fw3 f7605c;

    public aw3(fw3 fw3Var) {
        this.f7605c = fw3Var;
        this.f7603a = new yc3(((d18) fw3Var.f39782c.f50066d).f34849a.mo484i());
    }

    @Override // p000.t89
    /* JADX INFO: renamed from: X */
    public final void mo471X(aj0 aj0Var, long j) {
        if (this.f7604b) {
            C3386nv.m17633t("closed");
            return;
        }
        if (j == 0) {
            return;
        }
        d18 d18Var = (d18) this.f7605c.f39782c.f50066d;
        if (d18Var.f34851c) {
            C3386nv.m17633t("closed");
            return;
        }
        d18Var.f34850b.m489m0(j);
        d18Var.m9991a();
        d18Var.mo461H("\r\n");
        d18Var.mo471X(aj0Var, j);
        d18Var.mo461H("\r\n");
    }

    @Override // p000.t89, java.lang.AutoCloseable, java.nio.channels.Channel
    public final synchronized void close() {
        if (this.f7604b) {
            return;
        }
        this.f7604b = true;
        ((d18) this.f7605c.f39782c.f50066d).mo461H("0\r\n\r\n");
        fw3.m12220k(this.f7605c, this.f7603a);
        this.f7605c.f39783d = 3;
    }

    @Override // p000.t89, java.io.Flushable
    public final synchronized void flush() {
        if (this.f7604b) {
            return;
        }
        ((d18) this.f7605c.f39782c.f50066d).flush();
    }

    @Override // p000.t89
    /* JADX INFO: renamed from: i */
    public final c1a mo484i() {
        return this.f7603a;
    }
}
