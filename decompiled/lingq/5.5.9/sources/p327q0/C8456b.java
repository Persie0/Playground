package p327q0;

import cm.InterfaceC2052l;
import dm.C5207g;
import p424v0.InterfaceC9619c;
import p470x1.InterfaceC10015c;
import sl.C9072e;

/* JADX INFO: renamed from: q0.b */
/* JADX INFO: loaded from: classes.dex */
public final class C8456b implements InterfaceC10015c {

    /* JADX INFO: renamed from: a */
    public InterfaceC8455a f45627a = C8463i.f45634a;

    /* JADX INFO: renamed from: b */
    public C8461g f45628b;

    /* JADX INFO: renamed from: a */
    public final C8461g m16539a(InterfaceC2052l<? super InterfaceC9619c, C9072e> interfaceC2052l) {
        C5207g.m11111f(interfaceC2052l, "block");
        C8461g c8461g = new C8461g(interfaceC2052l);
        this.f45628b = c8461g;
        return c8461g;
    }

    @Override // p470x1.InterfaceC10015c
    /* JADX INFO: renamed from: c0 */
    public final float mo1462c0() {
        return this.f45627a.getDensity().mo1462c0();
    }

    /* JADX INFO: renamed from: d */
    public final long m16540d() {
        return this.f45627a.mo2084d();
    }

    @Override // p470x1.InterfaceC10015c
    public final float getDensity() {
        return this.f45627a.getDensity().getDensity();
    }
}
