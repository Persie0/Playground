package p420um;

import cm.InterfaceC2041a;
import co.InterfaceC2076h;
import p372rm.InterfaceC8843i0;
import p543do.InterfaceC5240k0;

/* JADX INFO: renamed from: um.f */
/* JADX INFO: loaded from: classes2.dex */
public final class C9565f implements InterfaceC2041a<InterfaceC5240k0> {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ InterfaceC2076h f49185a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ InterfaceC8843i0 f49186b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ AbstractC9571i f49187c;

    public C9565f(AbstractC9571i abstractC9571i, InterfaceC2076h interfaceC2076h, InterfaceC8843i0 interfaceC8843i0) {
        this.f49187c = abstractC9571i;
        this.f49185a = interfaceC2076h;
        this.f49186b = interfaceC8843i0;
    }

    @Override // cm.InterfaceC2041a
    /* JADX INFO: renamed from: E */
    public final InterfaceC5240k0 mo807E() {
        return new AbstractC9571i.a(this.f49187c, this.f49185a, this.f49186b);
    }
}
