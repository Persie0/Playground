package p000;

import java.io.EOFException;
import java.io.IOException;
import java.util.zip.DataFormatException;
import java.util.zip.Inflater;

/* JADX INFO: loaded from: classes.dex */
public final class n44 implements yd9 {

    /* JADX INFO: renamed from: a */
    public final e18 f52315a;

    /* JADX INFO: renamed from: b */
    public final Inflater f52316b;

    /* JADX INFO: renamed from: c */
    public int f52317c;

    /* JADX INFO: renamed from: d */
    public boolean f52318d;

    public n44(e18 e18Var, Inflater inflater) {
        this.f52315a = e18Var;
        this.f52316b = inflater;
    }

    @Override // p000.yd9
    /* JADX INFO: renamed from: F */
    public final long mo459F(aj0 aj0Var, long j) throws IOException {
        long j2;
        aj0Var.getClass();
        while (j >= 0) {
            if (this.f52318d) {
                C3386nv.m17633t("closed");
                return 0L;
            }
            e18 e18Var = this.f52315a;
            Inflater inflater = this.f52316b;
            if (j == 0) {
                j2 = 0;
            } else {
                try {
                    zt8 zt8VarM485i0 = aj0Var.m485i0(1);
                    int iMin = (int) Math.min(j, 8192 - zt8VarM485i0.f72155c);
                    if (inflater.needsInput() && !e18Var.m10787a()) {
                        zt8 zt8Var = e18Var.f36575b.f722a;
                        zt8Var.getClass();
                        int i = zt8Var.f72155c;
                        int i2 = zt8Var.f72154b;
                        int i3 = i - i2;
                        this.f52317c = i3;
                        inflater.setInput(zt8Var.f72153a, i2, i3);
                    }
                    int iInflate = inflater.inflate(zt8VarM485i0.f72153a, zt8VarM485i0.f72155c, iMin);
                    int i4 = this.f52317c;
                    if (i4 != 0) {
                        int remaining = i4 - inflater.getRemaining();
                        this.f52317c -= remaining;
                        e18Var.skip(remaining);
                    }
                    if (iInflate > 0) {
                        zt8VarM485i0.f72155c += iInflate;
                        j2 = iInflate;
                        aj0Var.f723b += j2;
                    } else {
                        if (zt8VarM485i0.f72154b == zt8VarM485i0.f72155c) {
                            aj0Var.f722a = zt8VarM485i0.m25776a();
                            cu8.m9897a(zt8VarM485i0);
                        }
                        j2 = 0;
                    }
                } catch (DataFormatException e) {
                    throw new IOException(e);
                }
            }
            if (j2 > 0) {
                return j2;
            }
            if (inflater.finished() || inflater.needsDictionary()) {
                return -1L;
            }
            if (e18Var.m10787a()) {
                throw new EOFException("source exhausted prematurely");
            }
        }
        C3386nv.m17624j(wq1.m24116l("byteCount < 0: ", j));
        return 0L;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
        if (this.f52318d) {
            return;
        }
        this.f52316b.end();
        this.f52318d = true;
        this.f52315a.close();
    }

    @Override // p000.yd9, p000.t89
    /* JADX INFO: renamed from: i */
    public final c1a mo484i() {
        return this.f52315a.f36574a.mo484i();
    }
}
