package p142h1;

import android.support.v4.media.AbstractC0140a;
import dm.C5207g;

/* JADX INFO: renamed from: h1.a */
/* JADX INFO: loaded from: classes.dex */
public final class C5870a extends AbstractC0140a {

    /* JADX INFO: renamed from: a */
    public InterfaceC5875f<?> f35149a;

    public C5870a(InterfaceC5875f<?> interfaceC5875f) {
        C5207g.m11111f(interfaceC5875f, "element");
        this.f35149a = interfaceC5875f;
    }

    @Override // android.support.v4.media.AbstractC0140a
    /* JADX INFO: renamed from: o */
    public final boolean mo602o(AbstractC5872c<?> abstractC5872c) {
        C5207g.m11111f(abstractC5872c, "key");
        return abstractC5872c == this.f35149a.getKey();
    }

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    @Override // android.support.v4.media.AbstractC0140a
    /* JADX INFO: renamed from: y */
    public final Object mo607y(C5877h c5877h) {
        C5207g.m11111f(c5877h, "key");
        if (c5877h == this.f35149a.getKey()) {
            return this.f35149a.getValue();
        }
        throw new IllegalStateException("Check failed.".toString());
    }
}
