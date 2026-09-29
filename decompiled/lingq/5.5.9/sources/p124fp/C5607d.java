package p124fp;

import dm.C5207g;
import java.io.EOFException;

/* JADX INFO: renamed from: fp.d */
/* JADX INFO: loaded from: classes2.dex */
public final class C5607d implements InterfaceC5625v {
    @Override // p124fp.InterfaceC5625v, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
    }

    @Override // p124fp.InterfaceC5625v, java.io.Flushable
    public final void flush() {
    }

    @Override // p124fp.InterfaceC5625v
    /* JADX INFO: renamed from: g */
    public final C5628y mo11921g() {
        return C5628y.f34474d;
    }

    @Override // p124fp.InterfaceC5625v
    /* JADX INFO: renamed from: k1 */
    public final void mo11922k1(C5608e c5608e, long j10) throws EOFException {
        C5207g.m11111f(c5608e, "source");
        c5608e.skip(j10);
    }
}
