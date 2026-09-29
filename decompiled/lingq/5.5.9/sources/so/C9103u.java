package so;

import java.io.IOException;
import okio.ByteString;
import p124fp.InterfaceC5609f;

/* JADX INFO: renamed from: so.u */
/* JADX INFO: loaded from: classes2.dex */
public final class C9103u extends AbstractC9105w {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ C9098p f47555a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ ByteString f47556b;

    public C9103u(C9098p c9098p, ByteString byteString) {
        this.f47555a = c9098p;
        this.f47556b = byteString;
    }

    @Override // so.AbstractC9105w
    /* JADX INFO: renamed from: a */
    public final long mo13145a() {
        return this.f47556b.mo15992q();
    }

    @Override // so.AbstractC9105w
    /* JADX INFO: renamed from: b */
    public final C9098p mo13146b() {
        return this.f47555a;
    }

    @Override // so.AbstractC9105w
    /* JADX INFO: renamed from: c */
    public final void mo13147c(InterfaceC5609f interfaceC5609f) throws IOException {
        interfaceC5609f.mo11950Z0(this.f47556b);
    }
}
