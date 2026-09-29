package p000;

import java.io.IOException;
import java.net.ProtocolException;

/* JADX INFO: loaded from: classes.dex */
public final class pu2 extends wc3 {

    /* JADX INFO: renamed from: b */
    public final long f56798b;

    /* JADX INFO: renamed from: c */
    public final boolean f56799c;

    /* JADX INFO: renamed from: d */
    public long f56800d;

    /* JADX INFO: renamed from: e */
    public boolean f56801e;

    /* JADX INFO: renamed from: f */
    public boolean f56802f;

    /* JADX INFO: renamed from: g */
    public boolean f56803g;

    /* JADX INFO: renamed from: h */
    public final /* synthetic */ C3552rx f56804h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public pu2(C3552rx c3552rx, yd9 yd9Var, long j, boolean z) {
        super(yd9Var);
        yd9Var.getClass();
        this.f56804h = c3552rx;
        this.f56798b = j;
        this.f56799c = z;
        this.f56801e = true;
        if (j == 0) {
            m19481a(null);
        }
    }

    @Override // p000.wc3, p000.yd9
    /* JADX INFO: renamed from: F */
    public final long mo459F(aj0 aj0Var, long j) throws IOException {
        C3552rx c3552rx = this.f56804h;
        aj0Var.getClass();
        if (this.f56803g) {
            C3386nv.m17633t("closed");
            return 0L;
        }
        try {
            long jMo459F = this.f66615a.mo459F(aj0Var, j);
            if (this.f56801e) {
                this.f56801e = false;
            }
            if (jMo459F == -1) {
                m19481a(null);
                return -1L;
            }
            long j2 = this.f56800d + jMo459F;
            long j3 = this.f56798b;
            if (j3 == -1 || j2 <= j3) {
                this.f56800d = j2;
                if (((ru2) c3552rx.f59989d).mo12223c()) {
                    m19481a(null);
                }
                return jMo459F;
            }
            throw new ProtocolException("expected " + j3 + " bytes but received " + j2);
        } catch (IOException e) {
            IOException iOExceptionM19481a = m19481a(e);
            iOExceptionM19481a.getClass();
            throw iOExceptionM19481a;
        }
    }

    /* JADX INFO: renamed from: a */
    public final IOException m19481a(IOException iOException) {
        if (this.f56802f) {
            return iOException;
        }
        this.f56802f = true;
        if (iOException == null && this.f56801e) {
            this.f56801e = false;
        }
        return C3552rx.m20966b(this.f56804h, this.f56799c, iOException, 8);
    }

    @Override // p000.wc3, java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
        if (this.f56803g) {
            return;
        }
        this.f56803g = true;
        try {
            super.close();
            m19481a(null);
        } catch (IOException e) {
            IOException iOExceptionM19481a = m19481a(e);
            iOExceptionM19481a.getClass();
            throw iOExceptionM19481a;
        }
    }
}
