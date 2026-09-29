package p124fp;

import android.support.v4.media.session.C0166e;
import dm.C5207g;
import java.io.IOException;
import java.io.InputStream;

/* JADX INFO: renamed from: fp.m */
/* JADX INFO: loaded from: classes2.dex */
public final class C5616m implements InterfaceC5627x {

    /* JADX INFO: renamed from: a */
    public final InputStream f34449a;

    /* JADX INFO: renamed from: b */
    public final C5628y f34450b;

    public C5616m(InputStream inputStream, C5628y c5628y) {
        C5207g.m11111f(c5628y, "timeout");
        this.f34449a = inputStream;
        this.f34450b = c5628y;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
        this.f34449a.close();
    }

    @Override // p124fp.InterfaceC5627x
    /* JADX INFO: renamed from: g */
    public final C5628y mo11923g() {
        return this.f34450b;
    }

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    @Override // p124fp.InterfaceC5627x
    /* JADX INFO: renamed from: j0 */
    public final long mo11924j0(C5608e c5608e, long j10) throws IOException {
        C5207g.m11111f(c5608e, "sink");
        if (j10 == 0) {
            return 0L;
        }
        if (!(j10 >= 0)) {
            throw new IllegalArgumentException(C0166e.m763i("byteCount < 0: ", j10).toString());
        }
        try {
            this.f34450b.mo11985f();
            C5623t c5623tM11947W0 = c5608e.m11947W0(1);
            int i10 = this.f34449a.read(c5623tM11947W0.f34463a, c5623tM11947W0.f34465c, (int) Math.min(j10, 8192 - c5623tM11947W0.f34465c));
            if (i10 == -1) {
                if (c5623tM11947W0.f34464b == c5623tM11947W0.f34465c) {
                    c5608e.f34434a = c5623tM11947W0.m12002a();
                    C5624u.m12006a(c5623tM11947W0);
                }
                return -1L;
            }
            c5623tM11947W0.f34465c += i10;
            long j11 = i10;
            c5608e.f34435b += j11;
            return j11;
        } catch (AssertionError e10) {
            if (C5617n.m11993e(e10)) {
                throw new IOException(e10);
            }
            throw e10;
        }
    }

    public final String toString() {
        return "source(" + this.f34449a + ')';
    }
}
