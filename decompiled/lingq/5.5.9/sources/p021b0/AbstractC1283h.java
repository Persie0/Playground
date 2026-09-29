package p021b0;

import dm.C5207g;
import no.InterfaceC7882z;
import p081e0.InterfaceC5312g0;
import p375s0.C8944f;
import p386t.InterfaceC9127s;
import p387t0.C9169u;
import p423v.C9615m;
import p424v0.C9617a;
import p424v0.C9623g;
import p424v0.InterfaceC9621e;

/* JADX INFO: renamed from: b0.h */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC1283h implements InterfaceC9127s {

    /* JADX INFO: renamed from: a */
    public final C1286k f7976a;

    public AbstractC1283h(InterfaceC5312g0 interfaceC5312g0, boolean z10) {
        this.f7976a = new C1286k(interfaceC5312g0, z10);
    }

    /* JADX INFO: renamed from: e */
    public abstract void mo1548e(C9615m c9615m, InterfaceC7882z interfaceC7882z);

    /* JADX INFO: renamed from: f */
    public final void m4788f(InterfaceC9621e interfaceC9621e, float f3, long j10) {
        C5207g.m11111f(interfaceC9621e, "$this$drawStateLayer");
        C1286k c1286k = this.f7976a;
        c1286k.getClass();
        boolean zIsNaN = Float.isNaN(f3);
        boolean z10 = c1286k.f7978a;
        float fM4782a = zIsNaN ? C1279d.m4782a(interfaceC9621e, z10, interfaceC9621e.mo12674d()) : interfaceC9621e.mo1463i0(f3);
        float fFloatValue = c1286k.f7980c.m1383c().floatValue();
        if (fFloatValue > 0.0f) {
            long jM17496b = C9169u.m17496b(j10, fFloatValue);
            if (!z10) {
                interfaceC9621e.mo12678r0(jM17496b, (124 & 2) != 0 ? C8944f.m17176c(interfaceC9621e.mo12674d()) / 2.0f : fM4782a, (124 & 4) != 0 ? interfaceC9621e.mo12680y0() : 0L, (124 & 8) != 0 ? 1.0f : 0.0f, (124 & 16) != 0 ? C9623g.f49295a : null, null, (124 & 64) != 0 ? 3 : 0);
                return;
            }
            float fM17177d = C8944f.m17177d(interfaceC9621e.mo12674d());
            float fM17175b = C8944f.m17175b(interfaceC9621e.mo12674d());
            C9617a.b bVarMo12676l0 = interfaceC9621e.mo12676l0();
            long jMo18081d = bVarMo12676l0.mo18081d();
            bVarMo12676l0.mo18080b().mo17420d();
            bVarMo12676l0.f49292a.m18083b(0.0f, 0.0f, fM17177d, fM17175b, 1);
            interfaceC9621e.mo12678r0(jM17496b, (124 & 2) != 0 ? C8944f.m17176c(interfaceC9621e.mo12674d()) / 2.0f : fM4782a, (124 & 4) != 0 ? interfaceC9621e.mo12680y0() : 0L, (124 & 8) != 0 ? 1.0f : 0.0f, (124 & 16) != 0 ? C9623g.f49295a : null, null, (124 & 64) != 0 ? 3 : 0);
            bVarMo12676l0.mo18080b().mo17428o();
            bVarMo12676l0.mo18079a(jMo18081d);
        }
    }

    /* JADX INFO: renamed from: g */
    public abstract void mo1549g(C9615m c9615m);
}
