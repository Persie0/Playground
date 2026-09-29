package p000;

import androidx.compose.animation.AbstractC0072k;
import androidx.compose.animation.core.AbstractC0060b;
import androidx.compose.material3.AbstractC0262s;
import androidx.compose.material3.tokens.MotionSchemeKeyTokens;
import androidx.compose.runtime.AbstractC0278f;
import androidx.compose.runtime.internal.C0282a;

/* JADX INFO: loaded from: classes2.dex */
public abstract class kic {

    /* JADX INFO: renamed from: a */
    public static final C0282a f47357a = new C0282a(-1037878726, false, new yd1(23));

    /* JADX INFO: renamed from: b */
    public static final C0282a f47358b = new C0282a(-1868532360, false, new yd1(24));

    /* JADX INFO: renamed from: c */
    public static final C0282a f47359c = new C0282a(581987603, false, new zd1(23));

    /* JADX INFO: renamed from: d */
    public static final C0282a f47360d = new C0282a(166660786, false, new zd1(24));

    /* JADX INFO: renamed from: a */
    public static final void m15264a(boolean z, ui3 ui3Var, e16 e16Var, boolean z2, fq7 fq7Var, ye1 ye1Var, int i) {
        tj3 tj3Var;
        e16 e16Var2;
        boolean z3;
        fq7 fq7Var2;
        fq7 fq7Var3;
        boolean z4;
        fq7 fq7Var4;
        e16 e16Var3;
        long j;
        dh9 dh9VarM1263m;
        e16 e16VarM19496D;
        tj3 tj3Var2 = (tj3) ye1Var;
        tj3Var2.m22115d0(408580840);
        int i2 = i | (tj3Var2.m22122h(z) ? 4 : 2) | (tj3Var2.m22124i(ui3Var) ? 32 : 16) | 208256;
        if (tj3Var2.m22099R(i2 & 1, (74899 & i2) != 74898)) {
            tj3Var2.m22104W();
            int i3 = i & 1;
            e16 e16Var4 = b16.f7762a;
            if (i3 == 0 || tj3Var2.m22084B()) {
                pa1 pa1Var = ((ms5) tj3Var2.m22128k(ps5.f56764b)).f51799a;
                fq7 fq7Var5 = pa1Var.f55863k0;
                if (fq7Var5 == null) {
                    fq7Var3 = new fq7(ra1.m20491d(pa1Var, hq7.f42785d), ra1.m20491d(pa1Var, hq7.f42787f), aa1.m198b(0.38f, ra1.m20491d(pa1Var, hq7.f42782a)), aa1.m198b(0.38f, ra1.m20491d(pa1Var, hq7.f42783b)));
                    pa1Var.f55863k0 = fq7Var3;
                } else {
                    fq7Var3 = fq7Var5;
                }
                z4 = true;
                fq7Var4 = fq7Var3;
                e16Var3 = e16Var4;
            } else {
                tj3Var2.m22102U();
                e16Var3 = e16Var;
                z4 = z2;
                fq7Var4 = fq7Var;
            }
            tj3Var2.m22140r();
            dh9 dh9VarM749a = AbstractC0060b.m749a(z ? 6.0f : 0.0f, ss5.m21705c0(MotionSchemeKeyTokens.FastSpatial, tj3Var2), null, tj3Var2, 0, 12);
            fq7Var4.getClass();
            if (z4 && z) {
                j = fq7Var4.f39485a;
            } else if (!z4 || z) {
                j = (z4 || !z) ? fq7Var4.f39488d : fq7Var4.f39487c;
            } else {
                j = fq7Var4.f39486b;
            }
            if (z4) {
                tj3Var2.m22111b0(1194671677);
                tj3Var = tj3Var2;
                dh9VarM1263m = AbstractC0072k.m785b(j, ss5.m21705c0(MotionSchemeKeyTokens.DefaultEffects, tj3Var2), null, tj3Var, 0, 12);
                tj3Var.m22139q(false);
            } else {
                tj3Var = tj3Var2;
                tj3Var.m22111b0(1194849338);
                dh9VarM1263m = AbstractC0278f.m1263m(new aa1(j), tj3Var);
                tj3Var.m22139q(false);
            }
            dh9 dh9Var = dh9VarM1263m;
            if (ui3Var != null) {
                z3 = z4;
                e16VarM19496D = pvc.m19496D(e16Var4, z, null, gh8.m12656a(false, hq7.f42786e / 2.0f, 0L, ui8.f63972a, 244), z3, new uh8(3), ui3Var);
            } else {
                z3 = z4;
                e16VarM19496D = e16Var4;
            }
            if (ui3Var != null) {
                iv3 iv3Var = AbstractC0262s.f3627a;
                e16Var4 = c06.f9271b;
            }
            e16 e16VarM4419l = c99.m4419l(AbstractC3584sr.m21607T(c99.m4430w(e16Var3.mo3161g(e16Var4).mo3161g(e16VarM19496D), nj0.f52812g, 2), 2.0f), hq7.f42784c);
            boolean zM22120g = tj3Var.m22120g(dh9Var) | tj3Var.m22120g(dh9VarM749a);
            Object objM22097O = tj3Var.m22097O();
            if (zM22120g || objM22097O == we1.f66679a) {
                objM22097O = new gq7(dh9Var, dh9VarM749a, 0);
                tj3Var.m22131l0(objM22097O);
            }
            eh0.m11124d(e16VarM4419l, (vi3) objM22097O, tj3Var, 0);
            e16Var2 = e16Var3;
            fq7Var2 = fq7Var4;
        } else {
            tj3Var = tj3Var2;
            tj3Var.m22102U();
            e16Var2 = e16Var;
            z3 = z2;
            fq7Var2 = fq7Var;
        }
        x18 x18VarM22143u = tj3Var.m22143u();
        if (x18VarM22143u != null) {
            x18VarM22143u.f67642d = new j07(z, ui3Var, e16Var2, z3, fq7Var2, i);
        }
    }
}
