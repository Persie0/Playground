package p422uo;

import dm.C5207g;
import java.io.IOException;
import java.util.concurrent.TimeUnit;
import okhttp3.C8072a;
import p124fp.C5608e;
import p124fp.C5621r;
import p124fp.C5628y;
import p124fp.InterfaceC5609f;
import p124fp.InterfaceC5610g;
import p124fp.InterfaceC5627x;
import to.C9347b;

/* JADX INFO: renamed from: uo.b */
/* JADX INFO: loaded from: classes2.dex */
public final class C9598b implements InterfaceC5627x {

    /* JADX INFO: renamed from: a */
    public boolean f49267a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ InterfaceC5610g f49268b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ InterfaceC9599c f49269c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ InterfaceC5609f f49270d;

    public C9598b(InterfaceC5610g interfaceC5610g, C8072a.d dVar, C5621r c5621r) {
        this.f49268b = interfaceC5610g;
        this.f49269c = dVar;
        this.f49270d = c5621r;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
        if (!this.f49267a && !C9347b.m17701h(this, TimeUnit.MILLISECONDS)) {
            this.f49267a = true;
            this.f49269c.mo15948a();
        }
        this.f49268b.close();
    }

    @Override // p124fp.InterfaceC5627x
    /* JADX INFO: renamed from: g */
    public final C5628y mo11923g() {
        return this.f49268b.mo11923g();
    }

    @Override // p124fp.InterfaceC5627x
    /* JADX INFO: renamed from: j0 */
    public final long mo11924j0(C5608e c5608e, long j10) throws IOException {
        C5207g.m11111f(c5608e, "sink");
        try {
            long jMo11924j0 = this.f49268b.mo11924j0(c5608e, j10);
            InterfaceC5609f interfaceC5609f = this.f49270d;
            if (jMo11924j0 != -1) {
                c5608e.m11928E(interfaceC5609f.mo11956f(), c5608e.f34435b - jMo11924j0, jMo11924j0);
                interfaceC5609f.mo11944S();
                return jMo11924j0;
            }
            if (!this.f49267a) {
                this.f49267a = true;
                interfaceC5609f.close();
            }
            return -1L;
        } catch (IOException e10) {
            if (!this.f49267a) {
                this.f49267a = true;
                this.f49269c.mo15948a();
            }
            throw e10;
        }
    }
}
