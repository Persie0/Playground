package p036c0;

import androidx.compose.material3.ColorSchemeKt;
import androidx.compose.material3.tokens.ColorSchemeKeyTokens;
import androidx.compose.runtime.C0480e;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.InterfaceC0476a;
import cm.InterfaceC2057q;
import p059d0.C5004e;
import p081e0.InterfaceC5299c;
import p081e0.InterfaceC5336s0;
import p387t0.C9169u;
import p443w.C9782m;
import sl.C9072e;

/* JADX INFO: renamed from: c0.b */
/* JADX INFO: loaded from: classes.dex */
public final class C1646b {

    /* JADX INFO: renamed from: a */
    public static final C9782m f9206a;

    /* JADX INFO: renamed from: b */
    public static final float f9207b;

    /* JADX INFO: renamed from: c */
    public static final float f9208c;

    static {
        float f3 = 24;
        float f10 = 8;
        f9206a = new C9782m(f3, f10, f3, f10);
        new C9782m(16, f10, f3, f10);
        float f11 = 12;
        new C9782m(f11, f10, f11, f10);
        f9207b = 58;
        f9208c = 40;
        ColorSchemeKeyTokens colorSchemeKeyTokens = C5004e.f32654a;
    }

    /* JADX INFO: renamed from: a */
    public static C1645a m5339a(long j10, InterfaceC0476a interfaceC0476a, int i10) {
        interfaceC0476a.mo1622c(-339300779);
        if ((i10 & 1) != 0) {
            j10 = ColorSchemeKt.m1563e(C5004e.f32654a, interfaceC0476a);
        }
        long j11 = j10;
        long jM1563e = (i10 & 2) != 0 ? ColorSchemeKt.m1563e(C5004e.f32662i, interfaceC0476a) : 0L;
        long jM17496b = (i10 & 4) != 0 ? C9169u.m17496b(ColorSchemeKt.m1563e(C5004e.f32657d, interfaceC0476a), 0.12f) : 0L;
        long jM17496b2 = (i10 & 8) != 0 ? C9169u.m17496b(ColorSchemeKt.m1563e(C5004e.f32659f, interfaceC0476a), 0.38f) : 0L;
        InterfaceC2057q<InterfaceC5299c<?>, C0480e, InterfaceC5336s0, C9072e> interfaceC2057q = ComposerKt.f3003a;
        C1645a c1645a = new C1645a(j11, jM1563e, jM17496b, jM17496b2);
        interfaceC0476a.mo1661w();
        return c1645a;
    }
}
