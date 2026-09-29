package androidx.compose.foundation.gestures;

import dm.C5207g;
import no.C7828f;
import p284o0.InterfaceC7887c;
import p374s.InterfaceC8921n;
import p401u.InterfaceC9351d;
import p464wl.InterfaceC9968c;

/* JADX INFO: renamed from: androidx.compose.foundation.gestures.b */
/* JADX INFO: loaded from: classes.dex */
public final class C0413b implements InterfaceC9351d {

    /* JADX INFO: renamed from: a */
    public final InterfaceC8921n<Float> f2286a;

    /* JADX INFO: renamed from: b */
    public final InterfaceC7887c f2287b;

    public C0413b() {
        throw null;
    }

    public C0413b(InterfaceC8921n interfaceC8921n) {
        ScrollableKt.C0406a c0406a = ScrollableKt.f2168c;
        C5207g.m11111f(interfaceC8921n, "flingDecay");
        C5207g.m11111f(c0406a, "motionDurationScale");
        this.f2286a = interfaceC8921n;
        this.f2287b = c0406a;
    }

    @Override // p401u.InterfaceC9351d
    /* JADX INFO: renamed from: a */
    public final Object mo1491a(ScrollingLogic$doFlingAnimation$2.C0410a c0410a, float f3, InterfaceC9968c interfaceC9968c) {
        return C7828f.m15574h(interfaceC9968c, this.f2287b, new DefaultFlingBehavior$performFling$2(f3, this, c0410a, null));
    }
}
