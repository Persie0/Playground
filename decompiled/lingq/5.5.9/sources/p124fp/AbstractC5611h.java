package p124fp;

import dm.C5207g;
import java.io.IOException;

/* JADX INFO: renamed from: fp.h */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC5611h implements InterfaceC5625v {

    /* JADX INFO: renamed from: a */
    public final InterfaceC5625v f34437a;

    public AbstractC5611h(InterfaceC5625v interfaceC5625v) {
        C5207g.m11111f(interfaceC5625v, "delegate");
        this.f34437a = interfaceC5625v;
    }

    @Override // p124fp.InterfaceC5625v, java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        this.f34437a.close();
    }

    @Override // p124fp.InterfaceC5625v, java.io.Flushable
    public void flush() throws IOException {
        this.f34437a.flush();
    }

    @Override // p124fp.InterfaceC5625v
    /* JADX INFO: renamed from: g */
    public final C5628y mo11921g() {
        return this.f34437a.mo11921g();
    }

    @Override // p124fp.InterfaceC5625v
    /* JADX INFO: renamed from: k1 */
    public void mo11922k1(C5608e c5608e, long j10) throws IOException {
        C5207g.m11111f(c5608e, "source");
        this.f34437a.mo11922k1(c5608e, j10);
    }

    public final String toString() {
        return getClass().getSimpleName() + '(' + this.f34437a + ')';
    }
}
