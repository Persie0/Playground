package p124fp;

import dm.C5207g;
import java.io.IOException;
import java.io.OutputStream;

/* JADX INFO: renamed from: fp.q */
/* JADX INFO: loaded from: classes2.dex */
public final class C5620q implements InterfaceC5625v {

    /* JADX INFO: renamed from: a */
    public final OutputStream f34454a;

    /* JADX INFO: renamed from: b */
    public final C5628y f34455b;

    public C5620q(OutputStream outputStream, C5628y c5628y) {
        this.f34454a = outputStream;
        this.f34455b = c5628y;
    }

    @Override // p124fp.InterfaceC5625v, java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
        this.f34454a.close();
    }

    @Override // p124fp.InterfaceC5625v, java.io.Flushable
    public final void flush() throws IOException {
        this.f34454a.flush();
    }

    @Override // p124fp.InterfaceC5625v
    /* JADX INFO: renamed from: g */
    public final C5628y mo11921g() {
        return this.f34455b;
    }

    @Override // p124fp.InterfaceC5625v
    /* JADX INFO: renamed from: k1 */
    public final void mo11922k1(C5608e c5608e, long j10) throws IOException {
        C5207g.m11111f(c5608e, "source");
        C5617n.m11992d(c5608e.f34435b, 0L, j10);
        while (true) {
            while (j10 > 0) {
                this.f34455b.mo11985f();
                C5623t c5623t = c5608e.f34434a;
                C5207g.m11108c(c5623t);
                int iMin = (int) Math.min(j10, c5623t.f34465c - c5623t.f34464b);
                this.f34454a.write(c5623t.f34463a, c5623t.f34464b, iMin);
                int i10 = c5623t.f34464b + iMin;
                c5623t.f34464b = i10;
                long j11 = iMin;
                j10 -= j11;
                c5608e.f34435b -= j11;
                if (i10 == c5623t.f34465c) {
                    c5608e.f34434a = c5623t.m12002a();
                    C5624u.m12006a(c5623t);
                }
            }
            return;
        }
    }

    public final String toString() {
        return "sink(" + this.f34454a + ')';
    }
}
