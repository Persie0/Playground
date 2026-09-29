package p000;

import java.io.InterruptedIOException;
import java.util.TimeZone;

/* JADX INFO: loaded from: classes.dex */
public final class qw3 implements t89 {

    /* JADX INFO: renamed from: a */
    public final boolean f58273a;

    /* JADX INFO: renamed from: b */
    public final aj0 f58274b = new aj0();

    /* JADX INFO: renamed from: c */
    public boolean f58275c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ tw3 f58276d;

    public qw3(tw3 tw3Var, boolean z) {
        this.f58276d = tw3Var;
        this.f58273a = z;
    }

    @Override // p000.t89
    /* JADX INFO: renamed from: X */
    public final void mo471X(aj0 aj0Var, long j) {
        TimeZone timeZone = kcb.f47051a;
        aj0 aj0Var2 = this.f58274b;
        aj0Var2.mo471X(aj0Var, j);
        while (aj0Var2.f723b >= 16384) {
            m20187a(false);
        }
    }

    /* JADX INFO: renamed from: a */
    public final void m20187a(boolean z) {
        long jMin;
        boolean z2;
        tw3 tw3Var = this.f58276d;
        synchronized (tw3Var) {
            tw3Var.f63004k.m24714h();
            while (tw3Var.f62997d >= tw3Var.f62998e && !this.f58273a && !this.f58275c && tw3Var.m22322g() == null) {
                try {
                    try {
                        tw3Var.wait();
                    } catch (InterruptedException unused) {
                        Thread.currentThread().interrupt();
                        throw new InterruptedIOException();
                    }
                } catch (Throwable th) {
                    tw3Var.f63004k.m21752l();
                    throw th;
                }
            }
            tw3Var.f63004k.m21752l();
            tw3Var.m22318b();
            jMin = Math.min(tw3Var.f62998e - tw3Var.f62997d, this.f58274b.f723b);
            tw3Var.f62997d += jMin;
            z2 = z && jMin == this.f58274b.f723b;
        }
        this.f58276d.f63004k.m24714h();
        try {
            tw3 tw3Var2 = this.f58276d;
            tw3Var2.f62995b.m17070p(tw3Var2.f62994a, z2, this.f58274b, jMin);
        } finally {
            this.f58276d.f63004k.m21752l();
        }
    }

    @Override // p000.t89, java.lang.AutoCloseable, java.nio.channels.Channel
    public final void close() {
        tw3 tw3Var = this.f58276d;
        TimeZone timeZone = kcb.f47051a;
        synchronized (tw3Var) {
            if (this.f58275c) {
                return;
            }
            boolean z = tw3Var.m22322g() == null;
            tw3 tw3Var2 = this.f58276d;
            if (!tw3Var2.f63002i.f58273a) {
                if (this.f58274b.f723b > 0) {
                    while (this.f58274b.f723b > 0) {
                        m20187a(true);
                    }
                } else if (z) {
                    tw3Var2.f62995b.m17070p(tw3Var2.f62994a, true, null, 0L);
                }
            }
            tw3 tw3Var3 = this.f58276d;
            synchronized (tw3Var3) {
                this.f58275c = true;
                tw3Var3.notifyAll();
            }
            this.f58276d.f62995b.flush();
            this.f58276d.m22317a();
        }
    }

    @Override // p000.t89, java.io.Flushable
    public final void flush() {
        tw3 tw3Var = this.f58276d;
        TimeZone timeZone = kcb.f47051a;
        synchronized (tw3Var) {
            tw3Var.m22318b();
        }
        while (this.f58274b.f723b > 0) {
            m20187a(false);
            this.f58276d.f62995b.flush();
        }
    }

    @Override // p000.t89
    /* JADX INFO: renamed from: i */
    public final c1a mo484i() {
        return this.f58276d.f63004k;
    }
}
