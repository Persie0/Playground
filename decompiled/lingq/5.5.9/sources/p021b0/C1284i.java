package p021b0;

import androidx.compose.runtime.C0480e;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.InterfaceC0476a;
import cm.InterfaceC2057q;
import p081e0.InterfaceC5299c;
import p081e0.InterfaceC5312g0;
import p081e0.InterfaceC5336s0;
import p338qd.C8573r0;
import p374s.C8904e0;
import p374s.C8927q;
import p387t0.C9169u;
import p470x1.C10017e;
import sl.C9072e;

/* JADX INFO: renamed from: b0.i */
/* JADX INFO: loaded from: classes.dex */
public final class C1284i {

    /* JADX INFO: renamed from: a */
    public static final C8904e0<Float> f7977a = new C8904e0<>(15, C8927q.f46849c, 2);

    /* JADX INFO: renamed from: a */
    public static final C1277b m4789a(float f3, InterfaceC0476a interfaceC0476a, int i10, int i11) {
        interfaceC0476a.mo1622c(1635163520);
        boolean z10 = (i11 & 1) != 0;
        if ((i11 & 2) != 0) {
            f3 = Float.NaN;
        }
        long j10 = (i11 & 4) != 0 ? C9169u.f47703f : 0L;
        InterfaceC2057q<InterfaceC5299c<?>, C0480e, InterfaceC5336s0, C9072e> interfaceC2057q = ComposerKt.f3003a;
        InterfaceC5312g0 interfaceC5312g0M16704V0 = C8573r0.m16704V0(new C9169u(j10), interfaceC0476a);
        Boolean boolValueOf = Boolean.valueOf(z10);
        C10017e c10017e = new C10017e(f3);
        interfaceC0476a.mo1622c(511388516);
        boolean zMo1665y = interfaceC0476a.mo1665y(boolValueOf) | interfaceC0476a.mo1665y(c10017e);
        Object objMo1624d = interfaceC0476a.mo1624d();
        if (zMo1665y || objMo1624d == InterfaceC0476a.a.f3122a) {
            objMo1624d = new C1277b(z10, f3, interfaceC5312g0M16704V0);
            interfaceC0476a.mo1655t(objMo1624d);
        }
        interfaceC0476a.mo1661w();
        C1277b c1277b = (C1277b) objMo1624d;
        interfaceC0476a.mo1661w();
        return c1277b;
    }
}
