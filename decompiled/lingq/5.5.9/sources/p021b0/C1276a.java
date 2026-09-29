package p021b0;

import androidx.compose.material.ripple.RippleThemeKt;
import androidx.compose.runtime.C0480e;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.InterfaceC0476a;
import cm.InterfaceC2057q;
import p081e0.InterfaceC5299c;
import p081e0.InterfaceC5336s0;
import p338qd.C8584v;
import p387t0.C9169u;
import sl.C9072e;

/* JADX INFO: renamed from: b0.a */
/* JADX INFO: loaded from: classes.dex */
public final class C1276a implements InterfaceC1285j {

    /* JADX INFO: renamed from: a */
    public static final C1276a f7956a = new C1276a();

    @Override // p021b0.InterfaceC1285j
    /* JADX INFO: renamed from: a */
    public final long mo4780a(InterfaceC0476a interfaceC0476a) {
        interfaceC0476a.mo1622c(2042140174);
        InterfaceC2057q<InterfaceC5299c<?>, C0480e, InterfaceC5336s0, C9072e> interfaceC2057q = ComposerKt.f3003a;
        long j10 = C9169u.f47699b;
        C8584v.m16798w(j10);
        interfaceC0476a.mo1661w();
        return j10;
    }

    @Override // p021b0.InterfaceC1285j
    /* JADX INFO: renamed from: b */
    public final C1278c mo4781b(InterfaceC0476a interfaceC0476a) {
        interfaceC0476a.mo1622c(-1629816343);
        InterfaceC2057q<InterfaceC5299c<?>, C0480e, InterfaceC5336s0, C9072e> interfaceC2057q = ComposerKt.f3003a;
        C1278c c1278c = ((double) C8584v.m16798w(C9169u.f47699b)) > 0.5d ? RippleThemeKt.f2619b : RippleThemeKt.f2620c;
        interfaceC0476a.mo1661w();
        return c1278c;
    }
}
