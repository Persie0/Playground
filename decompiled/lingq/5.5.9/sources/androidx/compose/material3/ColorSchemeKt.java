package androidx.compose.material3;

import androidx.compose.material3.tokens.ColorSchemeKeyTokens;
import androidx.compose.runtime.C0480e;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalKt;
import androidx.compose.runtime.InterfaceC0476a;
import androidx.datastore.preferences.PreferencesProto$Value;
import cm.InterfaceC2041a;
import cm.InterfaceC2057q;
import dm.C5207g;
import kotlin.NoWhenBranchMatchedException;
import p036c0.C1648d;
import p059d0.C5000a;
import p081e0.C5304d1;
import p081e0.InterfaceC5299c;
import p081e0.InterfaceC5336s0;
import p338qd.C8584v;
import p387t0.C9169u;
import p470x1.C10017e;
import sl.C9072e;

/* JADX INFO: loaded from: classes.dex */
public final class ColorSchemeKt {

    /* JADX INFO: renamed from: a */
    public static final C5304d1 f2735a = CompositionLocalKt.m1693c(new InterfaceC2041a<C1648d>() { // from class: androidx.compose.material3.ColorSchemeKt$LocalColorScheme$1
        @Override // cm.InterfaceC2041a
        /* JADX INFO: renamed from: E */
        public final C1648d mo807E() {
            C5304d1 c5304d1 = ColorSchemeKt.f2735a;
            long j10 = C5000a.f32634t;
            return ColorSchemeKt.m1561c(j10, C5000a.f32624j, C5000a.f32635u, C5000a.f32625k, C5000a.f32619e, C5000a.f32637w, C5000a.f32626l, C5000a.f32638x, C5000a.f32627m, C5000a.f32613A, C5000a.f32630p, C5000a.f32614B, C5000a.f32631q, C5000a.f32615a, C5000a.f32621g, C5000a.f32639y, C5000a.f32628n, C5000a.f32640z, C5000a.f32629o, j10, C5000a.f32620f, C5000a.f32618d, C5000a.f32616b, C5000a.f32622h, C5000a.f32617c, C5000a.f32623i, C5000a.f32632r, C5000a.f32633s, C5000a.f32636v);
        }
    });

    /* JADX INFO: renamed from: androidx.compose.material3.ColorSchemeKt$a */
    public /* synthetic */ class C0458a {

        /* JADX INFO: renamed from: a */
        public static final /* synthetic */ int[] f2737a;

        static {
            int[] iArr = new int[ColorSchemeKeyTokens.values().length];
            iArr[ColorSchemeKeyTokens.Background.ordinal()] = 1;
            iArr[ColorSchemeKeyTokens.Error.ordinal()] = 2;
            iArr[ColorSchemeKeyTokens.ErrorContainer.ordinal()] = 3;
            iArr[ColorSchemeKeyTokens.InverseOnSurface.ordinal()] = 4;
            iArr[ColorSchemeKeyTokens.InversePrimary.ordinal()] = 5;
            iArr[ColorSchemeKeyTokens.InverseSurface.ordinal()] = 6;
            iArr[ColorSchemeKeyTokens.OnBackground.ordinal()] = 7;
            iArr[ColorSchemeKeyTokens.OnError.ordinal()] = 8;
            iArr[ColorSchemeKeyTokens.OnErrorContainer.ordinal()] = 9;
            iArr[ColorSchemeKeyTokens.OnPrimary.ordinal()] = 10;
            iArr[ColorSchemeKeyTokens.OnPrimaryContainer.ordinal()] = 11;
            iArr[ColorSchemeKeyTokens.OnSecondary.ordinal()] = 12;
            iArr[ColorSchemeKeyTokens.OnSecondaryContainer.ordinal()] = 13;
            iArr[ColorSchemeKeyTokens.OnSurface.ordinal()] = 14;
            iArr[ColorSchemeKeyTokens.OnSurfaceVariant.ordinal()] = 15;
            iArr[ColorSchemeKeyTokens.SurfaceTint.ordinal()] = 16;
            iArr[ColorSchemeKeyTokens.OnTertiary.ordinal()] = 17;
            iArr[ColorSchemeKeyTokens.OnTertiaryContainer.ordinal()] = 18;
            iArr[ColorSchemeKeyTokens.Outline.ordinal()] = 19;
            iArr[ColorSchemeKeyTokens.OutlineVariant.ordinal()] = 20;
            iArr[ColorSchemeKeyTokens.Primary.ordinal()] = 21;
            iArr[ColorSchemeKeyTokens.PrimaryContainer.ordinal()] = 22;
            iArr[ColorSchemeKeyTokens.Scrim.ordinal()] = 23;
            iArr[ColorSchemeKeyTokens.Secondary.ordinal()] = 24;
            iArr[ColorSchemeKeyTokens.SecondaryContainer.ordinal()] = 25;
            iArr[ColorSchemeKeyTokens.Surface.ordinal()] = 26;
            iArr[ColorSchemeKeyTokens.SurfaceVariant.ordinal()] = 27;
            iArr[ColorSchemeKeyTokens.Tertiary.ordinal()] = 28;
            iArr[ColorSchemeKeyTokens.TertiaryContainer.ordinal()] = 29;
            f2737a = iArr;
        }
    }

    /* JADX INFO: renamed from: a */
    public static final long m1559a(long j10, InterfaceC0476a interfaceC0476a) {
        long jM5345d;
        InterfaceC2057q<InterfaceC5299c<?>, C0480e, InterfaceC5336s0, C9072e> interfaceC2057q = ComposerKt.f3003a;
        C1648d c1648d = (C1648d) interfaceC0476a.mo1648p(f2735a);
        C5207g.m11111f(c1648d, "$this$contentColorFor");
        if (C9169u.m17497c(j10, c1648d.m5359r())) {
            jM5345d = c1648d.m5350i();
        } else if (C9169u.m17497c(j10, c1648d.m5361t())) {
            jM5345d = c1648d.m5352k();
        } else if (C9169u.m17497c(j10, c1648d.m5366y())) {
            jM5345d = c1648d.m5356o();
        } else if (C9169u.m17497c(j10, c1648d.m5342a())) {
            jM5345d = c1648d.m5347f();
        } else if (C9169u.m17497c(j10, c1648d.m5343b())) {
            jM5345d = c1648d.m5348g();
        } else if (C9169u.m17497c(j10, c1648d.m5363v())) {
            jM5345d = c1648d.m5354m();
        } else if (C9169u.m17497c(j10, c1648d.m5365x())) {
            jM5345d = c1648d.m5355n();
        } else if (C9169u.m17497c(j10, c1648d.m5360s())) {
            jM5345d = c1648d.m5351j();
        } else if (C9169u.m17497c(j10, c1648d.m5362u())) {
            jM5345d = c1648d.m5353l();
        } else if (C9169u.m17497c(j10, c1648d.m5367z())) {
            jM5345d = c1648d.m5357p();
        } else if (C9169u.m17497c(j10, c1648d.m5344c())) {
            jM5345d = c1648d.m5349h();
        } else {
            jM5345d = C9169u.m17497c(j10, c1648d.m5346e()) ? c1648d.m5345d() : C9169u.f47703f;
        }
        return (jM5345d > C9169u.f47703f ? 1 : (jM5345d == C9169u.f47703f ? 0 : -1)) != 0 ? jM5345d : ((C9169u) interfaceC0476a.mo1648p(ContentColorKt.f2738a)).f47705a;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: b */
    public static final long m1560b(C1648d c1648d, ColorSchemeKeyTokens colorSchemeKeyTokens) {
        C5207g.m11111f(c1648d, "<this>");
        C5207g.m11111f(colorSchemeKeyTokens, "value");
        switch (C0458a.f2737a[colorSchemeKeyTokens.ordinal()]) {
            case 1:
                return c1648d.m5342a();
            case 2:
                return c1648d.m5343b();
            case 3:
                return c1648d.m5344c();
            case 4:
                return c1648d.m5345d();
            case 5:
                return ((C9169u) c1648d.f9220e.getValue()).f47705a;
            case PreferencesProto$Value.STRING_SET_FIELD_NUMBER /* 6 */:
                return c1648d.m5346e();
            case PreferencesProto$Value.DOUBLE_FIELD_NUMBER /* 7 */:
                return c1648d.m5347f();
            case 8:
                return c1648d.m5348g();
            case 9:
                return c1648d.m5349h();
            case 10:
                return c1648d.m5350i();
            case 11:
                return c1648d.m5351j();
            case 12:
                return c1648d.m5352k();
            case 13:
                return c1648d.m5353l();
            case 14:
                return c1648d.m5354m();
            case 15:
                return c1648d.m5355n();
            case 16:
                return c1648d.m5364w();
            case 17:
                return c1648d.m5356o();
            case 18:
                return c1648d.m5357p();
            case 19:
                return c1648d.m5358q();
            case 20:
                return ((C9169u) c1648d.f9214B.getValue()).f47705a;
            case 21:
                return c1648d.m5359r();
            case 22:
                return c1648d.m5360s();
            case 23:
                return ((C9169u) c1648d.f9215C.getValue()).f47705a;
            case 24:
                return c1648d.m5361t();
            case 25:
                return c1648d.m5362u();
            case 26:
                return c1648d.m5363v();
            case 27:
                return c1648d.m5365x();
            case 28:
                return c1648d.m5366y();
            case 29:
                return c1648d.m5367z();
            default:
                throw new NoWhenBranchMatchedException();
        }
    }

    /* JADX INFO: renamed from: c */
    public static final C1648d m1561c(long j10, long j11, long j12, long j13, long j14, long j15, long j16, long j17, long j18, long j19, long j20, long j21, long j22, long j23, long j24, long j25, long j26, long j27, long j28, long j29, long j30, long j31, long j32, long j33, long j34, long j35, long j36, long j37, long j38) {
        return new C1648d(j10, j11, j12, j13, j14, j15, j16, j17, j18, j19, j20, j21, j22, j23, j24, j25, j26, j27, j28, j29, j30, j31, j32, j33, j34, j35, j36, j37, j38);
    }

    /* JADX INFO: renamed from: d */
    public static final long m1562d(C1648d c1648d, float f3) {
        C5207g.m11111f(c1648d, "$this$surfaceColorAtElevation");
        if (C10017e.m18618a(f3, 0)) {
            return c1648d.m5363v();
        }
        return C8584v.m16792q(C9169u.m17496b(c1648d.m5364w(), ((((float) Math.log(f3 + 1)) * 4.5f) + 2.0f) / 100.0f), c1648d.m5363v());
    }

    /* JADX INFO: renamed from: e */
    public static final long m1563e(ColorSchemeKeyTokens colorSchemeKeyTokens, InterfaceC0476a interfaceC0476a) {
        C5207g.m11111f(colorSchemeKeyTokens, "<this>");
        InterfaceC2057q<InterfaceC5299c<?>, C0480e, InterfaceC5336s0, C9072e> interfaceC2057q = ComposerKt.f3003a;
        return m1560b((C1648d) interfaceC0476a.mo1648p(f2735a), colorSchemeKeyTokens);
    }
}
