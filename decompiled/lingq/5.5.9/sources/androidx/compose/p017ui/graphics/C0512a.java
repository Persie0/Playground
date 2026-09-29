package androidx.compose.p017ui.graphics;

import androidx.compose.p017ui.InterfaceC0500b;
import cm.InterfaceC2052l;
import dm.C5207g;
import p387t0.C9144f0;
import p387t0.C9162o0;
import p387t0.C9173y;
import p387t0.InterfaceC9154k0;
import p387t0.InterfaceC9172x;
import sl.C9072e;

/* JADX INFO: renamed from: androidx.compose.ui.graphics.a */
/* JADX INFO: loaded from: classes.dex */
public final class C0512a {
    /* JADX INFO: renamed from: a */
    public static final InterfaceC0500b m2000a(InterfaceC0500b interfaceC0500b, InterfaceC2052l<? super InterfaceC9172x, C9072e> interfaceC2052l) {
        C5207g.m11111f(interfaceC0500b, "<this>");
        C5207g.m11111f(interfaceC2052l, "block");
        return interfaceC0500b.mo1929K(new BlockGraphicsLayerElement(interfaceC2052l));
    }

    /* JADX INFO: renamed from: b */
    public static InterfaceC0500b m2001b(InterfaceC0500b interfaceC0500b, float f3, InterfaceC9154k0 interfaceC9154k0, boolean z10, int i10) {
        float f10 = (i10 & 1) != 0 ? 1.0f : 0.0f;
        float f11 = (i10 & 2) != 0 ? 1.0f : 0.0f;
        float f12 = (i10 & 4) != 0 ? 1.0f : f3;
        float f13 = (i10 & 512) != 0 ? 8.0f : 0.0f;
        long j10 = (i10 & 1024) != 0 ? C9162o0.f47689b : 0L;
        InterfaceC9154k0 interfaceC9154k1 = (i10 & 2048) != 0 ? C9144f0.f47650a : interfaceC9154k0;
        boolean z11 = (i10 & 4096) != 0 ? false : z10;
        long j11 = (i10 & 16384) != 0 ? C9173y.f47709a : 0L;
        long j12 = (i10 & 32768) != 0 ? C9173y.f47709a : 0L;
        C5207g.m11111f(interfaceC0500b, "$this$graphicsLayer");
        C5207g.m11111f(interfaceC9154k1, "shape");
        return interfaceC0500b.mo1929K(new GraphicsLayerModifierNodeElement(f10, f11, f12, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, f13, j10, interfaceC9154k1, z11, j11, j12, 0));
    }
}
