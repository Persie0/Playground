package p152hb;

import p412ub.HandlerC9517f;

/* JADX INFO: renamed from: hb.o0 */
/* JADX INFO: loaded from: classes.dex */
public final class C5996o0 implements ComponentCallbacks2C5953b.a {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ C5961d f35565a;

    public C5996o0(C5961d c5961d) {
        this.f35565a = c5961d;
    }

    @Override // p152hb.ComponentCallbacks2C5953b.a
    /* JADX INFO: renamed from: a */
    public final void mo441a(boolean z10) {
        HandlerC9517f handlerC9517f = this.f35565a.f35440I;
        handlerC9517f.sendMessage(handlerC9517f.obtainMessage(1, Boolean.valueOf(z10)));
    }
}
