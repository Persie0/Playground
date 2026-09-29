package androidx.compose.p017ui.draw;

import androidx.compose.p017ui.InterfaceC0500b;
import androidx.compose.p017ui.graphics.C0512a;
import androidx.compose.p017ui.platform.C0658r0;
import androidx.compose.p017ui.platform.C0661s0;
import androidx.compose.p017ui.platform.InspectableValueKt;
import cm.InterfaceC2052l;
import dm.C5207g;
import p387t0.C9173y;
import p387t0.InterfaceC9154k0;
import p387t0.InterfaceC9172x;
import sl.C9072e;

/* JADX INFO: renamed from: androidx.compose.ui.draw.c */
/* JADX INFO: loaded from: classes.dex */
public final class C0503c {
    /* JADX INFO: renamed from: a */
    public static InterfaceC0500b m1952a(InterfaceC0500b interfaceC0500b, final float f3, final InterfaceC9154k0 interfaceC9154k0) {
        final boolean z10 = false;
        final long j10 = C9173y.f47709a;
        C5207g.m11111f(interfaceC0500b, "$this$shadow");
        C5207g.m11111f(interfaceC9154k0, "shape");
        if (Float.compare(f3, 0) <= 0) {
            return interfaceC0500b;
        }
        InterfaceC2052l<C0661s0, C9072e> interfaceC2052l = InspectableValueKt.f4184a;
        InterfaceC0500b interfaceC0500bM2000a = C0512a.m2000a(InterfaceC0500b.a.f3325a, new InterfaceC2052l<InterfaceC9172x, C9072e>() { // from class: androidx.compose.ui.draw.ShadowKt$shadow$2$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // cm.InterfaceC2052l
            /* JADX INFO: renamed from: n */
            public final C9072e mo528n(InterfaceC9172x interfaceC9172x) {
                InterfaceC9172x interfaceC9172x2 = interfaceC9172x;
                C5207g.m11111f(interfaceC9172x2, "$this$graphicsLayer");
                interfaceC9172x2.mo17452G(interfaceC9172x2.mo1463i0(f3));
                interfaceC9172x2.mo17454j0(interfaceC9154k0);
                interfaceC9172x2.mo17460q0(z10);
                interfaceC9172x2.mo17456k0(j10);
                interfaceC9172x2.mo17464v0(j10);
                return C9072e.f47360a;
            }
        });
        C5207g.m11111f(interfaceC2052l, "inspectorInfo");
        C5207g.m11111f(interfaceC0500bM2000a, "wrapped");
        C0658r0 c0658r0 = new C0658r0(interfaceC2052l);
        return interfaceC0500b.mo1929K(c0658r0).mo1929K(interfaceC0500bM2000a).mo1929K(c0658r0.f4338b);
    }
}
