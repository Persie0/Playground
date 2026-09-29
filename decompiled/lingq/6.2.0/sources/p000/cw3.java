package p000;

import java.io.IOException;
import java.net.ProtocolException;
import java.util.TimeZone;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes.dex */
public final class cw3 extends zv3 {

    /* JADX INFO: renamed from: e */
    public long f34629e;

    /* JADX INFO: renamed from: f */
    public final /* synthetic */ fw3 f34630f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cw3(fw3 fw3Var, ex3 ex3Var, long j) {
        super(fw3Var, ex3Var);
        ex3Var.getClass();
        this.f34630f = fw3Var;
        this.f34629e = j;
        if (j == 0) {
            m25809a(qr3.f58109b);
        }
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
        long j2 = this.f34629e;
        if (j2 == 0) {
            return -1L;
        }
        long jMo459F = super.mo459F(aj0Var, Math.min(j2, j));
        if (jMo459F == -1) {
            this.f34630f.f39781b.mo11847e();
            ProtocolException protocolException = new ProtocolException("unexpected end of stream");
            m25809a(fw3.f39779f);
            throw protocolException;
        }
        long j3 = this.f34629e - jMo459F;
        this.f34629e = j3;
        if (j3 == 0) {
            m25809a(qr3.f58109b);
        }
        return jMo459F;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        boolean zM15116g;
        if (this.f72255c) {
            return;
        }
        if (this.f34629e != 0) {
            TimeZone timeZone = kcb.f47051a;
            TimeUnit.MILLISECONDS.getClass();
            try {
                zM15116g = kcb.m15116g(this, 100);
            } catch (IOException unused) {
                zM15116g = false;
            }
            if (!zM15116g) {
                this.f34630f.f39781b.mo11847e();
                m25809a(fw3.f39779f);
            }
        }
        this.f72255c = true;
    }
}
