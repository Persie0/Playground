package p000;

/* JADX INFO: loaded from: classes3.dex */
public final class dw3 implements t89 {

    /* JADX INFO: renamed from: a */
    public final yc3 f36292a;

    /* JADX INFO: renamed from: b */
    public boolean f36293b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ fw3 f36294c;

    public dw3(fw3 fw3Var) {
        this.f36294c = fw3Var;
        this.f36292a = new yc3(((d18) fw3Var.f39782c.f50066d).f34849a.mo484i());
    }

    @Override // p000.t89
    /* JADX INFO: renamed from: X */
    public final void mo471X(aj0 aj0Var, long j) {
        if (this.f36293b) {
            C3386nv.m17633t("closed");
        } else {
            icb.m13765a(aj0Var.f723b, 0L, j);
            ((d18) this.f36294c.f39782c.f50066d).mo471X(aj0Var, j);
        }
    }

    @Override // p000.t89, java.lang.AutoCloseable, java.nio.channels.Channel
    public final void close() {
        if (this.f36293b) {
            return;
        }
        this.f36293b = true;
        yc3 yc3Var = this.f36292a;
        fw3 fw3Var = this.f36294c;
        fw3.m12220k(fw3Var, yc3Var);
        fw3Var.f39783d = 3;
    }

    @Override // p000.t89, java.io.Flushable
    public final void flush() {
        if (this.f36293b) {
            return;
        }
        ((d18) this.f36294c.f39782c.f50066d).flush();
    }

    @Override // p000.t89
    /* JADX INFO: renamed from: i */
    public final c1a mo484i() {
        return this.f36292a;
    }
}
