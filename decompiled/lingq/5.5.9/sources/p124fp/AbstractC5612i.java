package p124fp;

import dm.C5207g;
import java.io.IOException;

/* JADX INFO: renamed from: fp.i */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC5612i implements InterfaceC5627x {

    /* JADX INFO: renamed from: a */
    public final InterfaceC5627x f34438a;

    public AbstractC5612i(InterfaceC5627x interfaceC5627x) {
        C5207g.m11111f(interfaceC5627x, "delegate");
        this.f34438a = interfaceC5627x;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        this.f34438a.close();
    }

    @Override // p124fp.InterfaceC5627x
    /* JADX INFO: renamed from: g */
    public final C5628y mo11923g() {
        return this.f34438a.mo11923g();
    }

    @Override // p124fp.InterfaceC5627x
    /* JADX INFO: renamed from: j0 */
    public long mo11924j0(C5608e c5608e, long j10) throws IOException {
        C5207g.m11111f(c5608e, "sink");
        return this.f34438a.mo11924j0(c5608e, j10);
    }

    public final String toString() {
        return getClass().getSimpleName() + '(' + this.f34438a + ')';
    }
}
