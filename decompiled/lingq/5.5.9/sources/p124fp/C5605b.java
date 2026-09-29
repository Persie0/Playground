package p124fp;

import dm.C5207g;
import java.io.IOException;
import sl.C9072e;

/* JADX INFO: renamed from: fp.b */
/* JADX INFO: loaded from: classes2.dex */
public final class C5605b implements InterfaceC5625v {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ C5604a f34430a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ InterfaceC5625v f34431b;

    public C5605b(C5626w c5626w, C5620q c5620q) {
        this.f34430a = c5626w;
        this.f34431b = c5620q;
    }

    @Override // p124fp.InterfaceC5625v, java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
        InterfaceC5625v interfaceC5625v = this.f34431b;
        C5604a c5604a = this.f34430a;
        c5604a.m11916h();
        try {
            try {
                interfaceC5625v.close();
                C9072e c9072e = C9072e.f47360a;
                if (c5604a.m11917i()) {
                    throw c5604a.mo11918j(null);
                }
            } catch (IOException e10) {
                if (!c5604a.m11917i()) {
                    throw e10;
                }
                throw c5604a.mo11918j(e10);
            }
        } catch (Throwable th2) {
            c5604a.m11917i();
            throw th2;
        }
    }

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    @Override // p124fp.InterfaceC5625v, java.io.Flushable
    public final void flush() throws IOException {
        InterfaceC5625v interfaceC5625v = this.f34431b;
        C5604a c5604a = this.f34430a;
        c5604a.m11916h();
        try {
            try {
                interfaceC5625v.flush();
                C9072e c9072e = C9072e.f47360a;
                if (c5604a.m11917i()) {
                    throw c5604a.mo11918j(null);
                }
            } catch (IOException e10) {
                if (!c5604a.m11917i()) {
                    throw e10;
                }
                throw c5604a.mo11918j(e10);
            }
        } catch (Throwable th2) {
            c5604a.m11917i();
            throw th2;
        }
    }

    @Override // p124fp.InterfaceC5625v
    /* JADX INFO: renamed from: g */
    public final C5628y mo11921g() {
        return this.f34430a;
    }

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    @Override // p124fp.InterfaceC5625v
    /* JADX INFO: renamed from: k1 */
    public final void mo11922k1(C5608e c5608e, long j10) throws IOException {
        C5207g.m11111f(c5608e, "source");
        C5617n.m11992d(c5608e.f34435b, 0L, j10);
        while (true) {
            long j11 = 0;
            if (j10 <= 0) {
                return;
            }
            C5623t c5623t = c5608e.f34434a;
            C5207g.m11108c(c5623t);
            while (j11 < 65536) {
                j11 += (long) (c5623t.f34465c - c5623t.f34464b);
                if (j11 >= j10) {
                    j11 = j10;
                    break;
                } else {
                    c5623t = c5623t.f34468f;
                    C5207g.m11108c(c5623t);
                }
            }
            InterfaceC5625v interfaceC5625v = this.f34431b;
            C5604a c5604a = this.f34430a;
            c5604a.m11916h();
            try {
                try {
                    interfaceC5625v.mo11922k1(c5608e, j11);
                    C9072e c9072e = C9072e.f47360a;
                    if (c5604a.m11917i()) {
                        throw c5604a.mo11918j(null);
                    }
                    j10 -= j11;
                } catch (IOException e10) {
                    if (!c5604a.m11917i()) {
                        throw e10;
                    }
                    throw c5604a.mo11918j(e10);
                }
            } catch (Throwable th2) {
                c5604a.m11917i();
                throw th2;
            }
        }
    }

    public final String toString() {
        return "AsyncTimeout.sink(" + this.f34431b + ')';
    }
}
