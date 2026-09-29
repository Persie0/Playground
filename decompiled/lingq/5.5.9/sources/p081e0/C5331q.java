package p081e0;

import androidx.compose.runtime.C0480e;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.InterfaceC0476a;
import cm.InterfaceC2041a;
import cm.InterfaceC2057q;
import dm.C5207g;
import p338qd.C8573r0;
import sl.C9072e;

/* JADX INFO: renamed from: e0.q */
/* JADX INFO: loaded from: classes.dex */
public final class C5331q<T> extends AbstractC5326n0<T> {

    /* JADX INFO: renamed from: b */
    public final InterfaceC5350z0<T> f33601b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C5331q(InterfaceC5350z0<T> interfaceC5350z0, InterfaceC2041a<? extends T> interfaceC2041a) {
        super(interfaceC2041a);
        C5207g.m11111f(interfaceC5350z0, "policy");
        C5207g.m11111f(interfaceC2041a, "defaultFactory");
        this.f33601b = interfaceC5350z0;
    }

    @Override // p081e0.AbstractC5317j
    /* JADX INFO: renamed from: a */
    public final InterfaceC5301c1 mo11450a(Object obj, InterfaceC0476a interfaceC0476a) {
        interfaceC0476a.mo1622c(-84026900);
        InterfaceC2057q<InterfaceC5299c<?>, C0480e, InterfaceC5336s0, C9072e> interfaceC2057q = ComposerKt.f3003a;
        interfaceC0476a.mo1622c(-492369756);
        Object objMo1624d = interfaceC0476a.mo1624d();
        if (objMo1624d == InterfaceC0476a.a.f3122a) {
            objMo1624d = C8573r0.m16682K0(obj, this.f33601b);
            interfaceC0476a.mo1655t(objMo1624d);
        }
        interfaceC0476a.mo1661w();
        InterfaceC5312g0 interfaceC5312g0 = (InterfaceC5312g0) objMo1624d;
        interfaceC5312g0.setValue(obj);
        interfaceC0476a.mo1661w();
        return interfaceC5312g0;
    }
}
