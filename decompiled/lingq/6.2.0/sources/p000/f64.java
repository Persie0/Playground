package p000;

import java.io.IOException;
import java.io.InputStream;

/* JADX INFO: loaded from: classes.dex */
public final class f64 implements yd9 {

    /* JADX INFO: renamed from: a */
    public final InputStream f38515a;

    /* JADX INFO: renamed from: b */
    public final c1a f38516b;

    public f64(InputStream inputStream, c1a c1aVar) {
        inputStream.getClass();
        this.f38515a = inputStream;
        this.f38516b = c1aVar;
    }

    @Override // p000.yd9
    /* JADX INFO: renamed from: F */
    public final long mo459F(aj0 aj0Var, long j) throws IOException {
        aj0Var.getClass();
        if (j == 0) {
            return 0L;
        }
        if (j < 0) {
            C3386nv.m17624j(wq1.m24116l("byteCount < 0: ", j));
            return 0L;
        }
        try {
            this.f38516b.mo3172f();
            zt8 zt8VarM485i0 = aj0Var.m485i0(1);
            int i = this.f38515a.read(zt8VarM485i0.f72153a, zt8VarM485i0.f72155c, (int) Math.min(j, 8192 - zt8VarM485i0.f72155c));
            if (i != -1) {
                zt8VarM485i0.f72155c += i;
                long j2 = i;
                aj0Var.f723b += j2;
                return j2;
            }
            if (zt8VarM485i0.f72154b != zt8VarM485i0.f72155c) {
                return -1L;
            }
            aj0Var.f722a = zt8VarM485i0.m25776a();
            cu8.m9897a(zt8VarM485i0);
            return -1L;
        } catch (AssertionError e) {
            if (hcb.m13198b(e)) {
                throw new IOException(e);
            }
            throw e;
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
        this.f38515a.close();
    }

    @Override // p000.yd9, p000.t89
    /* JADX INFO: renamed from: i */
    public final c1a mo484i() {
        return this.f38516b;
    }

    public final String toString() {
        return "source(" + this.f38515a + ')';
    }
}
