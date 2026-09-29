package p000;

import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import okio.ByteString;

/* JADX INFO: loaded from: classes.dex */
public final class ow3 implements yd9 {

    /* JADX INFO: renamed from: a */
    public final hj0 f55063a;

    /* JADX INFO: renamed from: b */
    public int f55064b;

    /* JADX INFO: renamed from: c */
    public int f55065c;

    /* JADX INFO: renamed from: d */
    public int f55066d;

    /* JADX INFO: renamed from: e */
    public int f55067e;

    /* JADX INFO: renamed from: f */
    public int f55068f;

    public ow3(hj0 hj0Var) {
        hj0Var.getClass();
        this.f55063a = hj0Var;
    }

    @Override // p000.yd9
    /* JADX INFO: renamed from: F */
    public final long mo459F(aj0 aj0Var, long j) throws IOException {
        int i;
        int i2;
        aj0Var.getClass();
        do {
            int i3 = this.f55067e;
            hj0 hj0Var = this.f55063a;
            if (i3 == 0) {
                hj0Var.skip(this.f55068f);
                this.f55068f = 0;
                if ((this.f55065c & 4) == 0) {
                    i = this.f55066d;
                    int iM13778n = icb.m13778n(hj0Var);
                    this.f55067e = iM13778n;
                    this.f55064b = iM13778n;
                    int i4 = hj0Var.readByte() & 255;
                    this.f55065c = hj0Var.readByte() & 255;
                    Logger logger = pw3.f56897d;
                    if (logger.isLoggable(Level.FINE)) {
                        ByteString byteString = gw3.f41422a;
                        logger.fine(gw3.m12931b(true, this.f55066d, this.f55064b, i4, this.f55065c));
                    }
                    i2 = hj0Var.readInt() & Integer.MAX_VALUE;
                    this.f55066d = i2;
                    if (i4 != 9) {
                        v63.m23133k(AbstractC3393o1.m17732g(i4, " != TYPE_CONTINUATION"));
                        return 0L;
                    }
                }
            } else {
                long jMo459F = hj0Var.mo459F(aj0Var, Math.min(j, i3));
                if (jMo459F != -1) {
                    this.f55067e -= (int) jMo459F;
                    return jMo459F;
                }
            }
            return -1L;
        } while (i2 == i);
        v63.m23133k("TYPE_CONTINUATION streamId changed");
        return 0L;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
    }

    @Override // p000.yd9, p000.t89
    /* JADX INFO: renamed from: i */
    public final c1a mo484i() {
        return this.f55063a.mo484i();
    }
}
