package p000;

import java.io.IOException;
import java.io.InterruptedIOException;
import java.util.TimeZone;
import okhttp3.internal.http2.ErrorCode;
import okhttp3.internal.http2.StreamResetException;

/* JADX INFO: loaded from: classes.dex */
public final class rw3 implements yd9 {

    /* JADX INFO: renamed from: a */
    public final long f59955a;

    /* JADX INFO: renamed from: b */
    public boolean f59956b;

    /* JADX INFO: renamed from: c */
    public final aj0 f59957c = new aj0();

    /* JADX INFO: renamed from: d */
    public final aj0 f59958d = new aj0();

    /* JADX INFO: renamed from: e */
    public boolean f59959e;

    /* JADX INFO: renamed from: f */
    public final /* synthetic */ tw3 f59960f;

    public rw3(tw3 tw3Var, long j, boolean z) {
        this.f59960f = tw3Var;
        this.f59955a = j;
        this.f59956b = z;
    }

    @Override // p000.yd9
    /* JADX INFO: renamed from: F */
    public final long mo459F(aj0 aj0Var, long j) throws Throwable {
        boolean z;
        Throwable streamResetException;
        long j2;
        long jMo459F;
        aj0Var.getClass();
        long j3 = 0;
        if (j < 0) {
            C3386nv.m17624j(wq1.m24116l("byteCount < 0: ", j));
            return 0L;
        }
        while (true) {
            tw3 tw3Var = this.f59960f;
            synchronized (tw3Var) {
                tw3Var.f62995b.getClass();
                qw3 qw3Var = tw3Var.f63002i;
                z = true;
                boolean z2 = qw3Var.f58275c || qw3Var.f58273a;
                if (z2) {
                    tw3Var.f63003j.m24714h();
                }
                try {
                    if (tw3Var.m22322g() == null || this.f59956b) {
                        streamResetException = null;
                    } else {
                        streamResetException = tw3Var.f62993H;
                        if (streamResetException == null) {
                            ErrorCode errorCodeM22322g = tw3Var.m22322g();
                            errorCodeM22322g.getClass();
                            streamResetException = new StreamResetException(errorCodeM22322g);
                        }
                    }
                    if (this.f59959e) {
                        throw new IOException("stream closed");
                    }
                    aj0 aj0Var2 = this.f59958d;
                    long j4 = aj0Var2.f723b;
                    if (j4 > j3) {
                        jMo459F = aj0Var2.mo459F(aj0Var, Math.min(j, j4));
                        w4b.m23751b(tw3Var.f62996c, jMo459F, 0L, 2);
                        long jM23752a = tw3Var.f62996c.m23752a();
                        if (streamResetException == null) {
                            j2 = j3;
                            if (jM23752a >= tw3Var.f62995b.f51917L.m12993a() / 2) {
                                tw3Var.f62995b.m17072r(tw3Var.f62994a, jM23752a);
                                w4b.m23751b(tw3Var.f62996c, 0L, jM23752a, 1);
                            }
                        } else {
                            j2 = j3;
                        }
                        z = false;
                    } else {
                        j2 = j3;
                        if (this.f59956b || streamResetException != null) {
                            z = false;
                        } else {
                            try {
                                tw3Var.wait();
                            } catch (InterruptedException unused) {
                                Thread.currentThread().interrupt();
                                throw new InterruptedIOException();
                            }
                        }
                        jMo459F = -1;
                    }
                    if (z2) {
                        tw3Var.f63003j.m21752l();
                    }
                } catch (Throwable th) {
                    if (z2) {
                        tw3Var.f63003j.m21752l();
                    }
                    throw th;
                }
            }
            this.f59960f.f62995b.f51916K.getClass();
            if (!z) {
                if (jMo459F != -1) {
                    return jMo459F;
                }
                if (streamResetException == null) {
                    return -1L;
                }
                throw streamResetException;
            }
            j3 = j2;
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        long j;
        tw3 tw3Var = this.f59960f;
        synchronized (tw3Var) {
            this.f59959e = true;
            aj0 aj0Var = this.f59958d;
            j = aj0Var.f723b;
            aj0Var.m473a();
            tw3Var.notifyAll();
        }
        if (j > 0) {
            tw3 tw3Var2 = this.f59960f;
            TimeZone timeZone = kcb.f47051a;
            tw3Var2.f62995b.m17069n(j);
        }
        this.f59960f.m22317a();
    }

    @Override // p000.yd9, p000.t89
    /* JADX INFO: renamed from: i */
    public final c1a mo484i() {
        return this.f59960f.f63003j;
    }
}
