package so;

import java.io.IOException;
import p124fp.InterfaceC5609f;

/* JADX INFO: renamed from: so.v */
/* JADX INFO: loaded from: classes2.dex */
public final class C9104v extends AbstractC9105w {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ C9098p f47557a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ int f47558b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ byte[] f47559c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ int f47560d;

    public C9104v(C9098p c9098p, byte[] bArr, int i10, int i11) {
        this.f47557a = c9098p;
        this.f47558b = i10;
        this.f47559c = bArr;
        this.f47560d = i11;
    }

    @Override // so.AbstractC9105w
    /* JADX INFO: renamed from: a */
    public final long mo13145a() {
        return this.f47558b;
    }

    @Override // so.AbstractC9105w
    /* JADX INFO: renamed from: b */
    public final C9098p mo13146b() {
        return this.f47557a;
    }

    @Override // so.AbstractC9105w
    /* JADX INFO: renamed from: c */
    public final void mo13147c(InterfaceC5609f interfaceC5609f) throws IOException {
        interfaceC5609f.mo11971v0(this.f47559c, this.f47560d, this.f47558b);
    }
}
