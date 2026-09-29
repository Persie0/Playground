package p124fp;

import dm.C5207g;
import java.io.IOException;
import sl.C9072e;

/* JADX INFO: renamed from: fp.c */
/* JADX INFO: loaded from: classes2.dex */
public final class C5606c implements InterfaceC5627x {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ C5604a f34432a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ InterfaceC5627x f34433b;

    public C5606c(C5626w c5626w, C5616m c5616m) {
        this.f34432a = c5626w;
        this.f34433b = c5616m;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
        InterfaceC5627x interfaceC5627x = this.f34433b;
        C5604a c5604a = this.f34432a;
        c5604a.m11916h();
        try {
            try {
                interfaceC5627x.close();
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

    @Override // p124fp.InterfaceC5627x
    /* JADX INFO: renamed from: g */
    public final C5628y mo11923g() {
        return this.f34432a;
    }

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    @Override // p124fp.InterfaceC5627x
    /* JADX INFO: renamed from: j0 */
    public final long mo11924j0(C5608e c5608e, long j10) throws IOException {
        C5207g.m11111f(c5608e, "sink");
        InterfaceC5627x interfaceC5627x = this.f34433b;
        C5604a c5604a = this.f34432a;
        c5604a.m11916h();
        try {
            try {
                long jMo11924j0 = interfaceC5627x.mo11924j0(c5608e, j10);
                if (c5604a.m11917i()) {
                    throw c5604a.mo11918j(null);
                }
                return jMo11924j0;
            } catch (IOException e10) {
                if (c5604a.m11917i()) {
                    throw c5604a.mo11918j(e10);
                }
                throw e10;
            }
        } catch (Throwable th2) {
            c5604a.m11917i();
            throw th2;
        }
    }

    public final String toString() {
        return "AsyncTimeout.source(" + this.f34433b + ')';
    }
}
