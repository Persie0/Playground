package p000;

import java.io.IOException;
import java.util.TimeZone;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes.dex */
public final class hl0 implements yd9 {

    /* JADX INFO: renamed from: a */
    public boolean f42560a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ hj0 f42561b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ pc0 f42562c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ d18 f42563d;

    public hl0(hj0 hj0Var, pc0 pc0Var, d18 d18Var) {
        this.f42561b = hj0Var;
        this.f42562c = pc0Var;
        this.f42563d = d18Var;
    }

    @Override // p000.yd9
    /* JADX INFO: renamed from: F */
    public final long mo459F(aj0 aj0Var, long j) throws IOException {
        aj0Var.getClass();
        try {
            long jMo459F = this.f42561b.mo459F(aj0Var, j);
            d18 d18Var = this.f42563d;
            if (jMo459F != -1) {
                aj0Var.m479e(d18Var.f34850b, aj0Var.f723b - jMo459F, jMo459F);
                d18Var.m9991a();
                return jMo459F;
            }
            if (!this.f42560a) {
                this.f42560a = true;
                d18Var.close();
            }
            return -1L;
        } catch (IOException e) {
            if (this.f42560a) {
                throw e;
            }
            this.f42560a = true;
            this.f42562c.m19060a();
            throw e;
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
        boolean zM15116g;
        if (!this.f42560a) {
            TimeZone timeZone = kcb.f47051a;
            TimeUnit.MILLISECONDS.getClass();
            try {
                zM15116g = kcb.m15116g(this, 100);
            } catch (IOException unused) {
                zM15116g = false;
            }
            if (!zM15116g) {
                this.f42560a = true;
                this.f42562c.m19060a();
            }
        }
        this.f42561b.close();
    }

    @Override // p000.yd9, p000.t89
    /* JADX INFO: renamed from: i */
    public final c1a mo484i() {
        return this.f42561b.mo484i();
    }
}
