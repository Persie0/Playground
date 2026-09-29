package p000;

import androidx.compose.foundation.AbstractC0080f;
import androidx.compose.material3.tokens.MotionSchemeKeyTokens;
import androidx.compose.p002ui.AbstractC0287b;
import androidx.compose.p002ui.graphics.AbstractC0309d;
import androidx.compose.p002ui.node.C0352b;
import androidx.compose.p002ui.platform.AbstractC0407s;
import androidx.compose.runtime.AbstractC0278f;
import androidx.compose.runtime.internal.C0282a;

/* JADX INFO: loaded from: classes2.dex */
public abstract class tw5 {

    /* JADX INFO: renamed from: a */
    public static final float f63010a;

    /* JADX INFO: renamed from: b */
    public static final float f63011b;

    /* JADX INFO: renamed from: c */
    public static final float f63012c;

    static {
        AbstractC3584sr.m21622e(4.0f, 0.0f, 2);
        AbstractC3584sr.m21620d(4.0f, 2.0f);
        f63010a = 8.0f;
        f63011b = 112.0f;
        f63012c = 280.0f;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v19 */
    /* JADX WARN: Type inference failed for: r2v2 */
    /* JADX WARN: Type inference failed for: r2v3, types: [boolean, int] */
    /* JADX INFO: renamed from: a */
    public static final void m22326a(e16 e16Var, final w66 w66Var, final t66 t66Var, yn8 yn8Var, o39 o39Var, long j, float f, C0282a c0282a, ye1 ye1Var, int i) {
        tj3 tj3Var;
        ?? r2;
        Object objM24111g;
        boolean z;
        Object objM1254d;
        boolean z2;
        Object objM24111g2;
        float f2;
        tj3 tj3Var2 = (tj3) ye1Var;
        tj3Var2.m22115d0(848986741);
        int i2 = i | (tj3Var2.m22120g(e16Var) ? 4 : 2) | (tj3Var2.m22120g(w66Var) ? 32 : 16) | (tj3Var2.m22120g(yn8Var) ? 2048 : 1024) | (tj3Var2.m22120g(o39Var) ? 16384 : 8192) | (tj3Var2.m22118f(j) ? 131072 : 65536) | (tj3Var2.m22114d(0.0f) ? 1048576 : 524288) | (tj3Var2.m22114d(f) ? 8388608 : 4194304) | (tj3Var2.m22120g(null) ? 67108864 : 33554432) | (tj3Var2.m22124i(c0282a) ? 536870912 : 268435456);
        if (tj3Var2.m22099R(i2 & 1, (i2 & 306783379) != 306783378)) {
            faa faaVarM15045g = kaa.m15045g(w66Var, "DropDownMenu", tj3Var2, ((i2 >> 3) & 14) | 48);
            l43 l43VarM21705c0 = ss5.m21705c0(MotionSchemeKeyTokens.FastSpatial, tj3Var2);
            l43 l43VarM21705c1 = ss5.m21705c0(MotionSchemeKeyTokens.FastEffects, tj3Var2);
            jda jdaVar = pk9.f56363h;
            boolean zM11673g = faaVarM15045g.m11673g();
            p84 p84Var = we1.f66679a;
            if (zM11673g) {
                r2 = 0;
                objM24111g = wq1.m24111g(tj3Var2, 1666827533, false, faaVarM15045g);
            } else {
                tj3Var2.m22111b0(1666573488);
                boolean zM22120g = tj3Var2.m22120g(faaVarM15045g);
                objM24111g = tj3Var2.m22097O();
                if (zM22120g || objM24111g == p84Var) {
                    jc9 jc9VarM16139y = lda.m16139y();
                    vi3 vi3VarMo3163e = jc9VarM16139y != null ? jc9VarM16139y.mo3163e() : null;
                    jc9 jc9VarM16106F = lda.m16106F(jc9VarM16139y);
                    try {
                        Object objM11669c = faaVarM15045g.m11669c();
                        lda.m16110J(jc9VarM16139y, jc9VarM16106F, vi3VarMo3163e);
                        tj3Var2.m22131l0(objM11669c);
                        objM24111g = objM11669c;
                    } catch (Throwable th) {
                        lda.m16110J(jc9VarM16139y, jc9VarM16106F, vi3VarMo3163e);
                        throw th;
                    }
                }
                r2 = 0;
                tj3Var2.m22139q(false);
            }
            boolean zBooleanValue = ((Boolean) objM24111g).booleanValue();
            tj3Var2.m22111b0(143964305);
            float f3 = zBooleanValue ? 1.0f : 0.8f;
            tj3Var2.m22139q(r2);
            Float fValueOf = Float.valueOf(f3);
            boolean zM22120g2 = tj3Var2.m22120g(faaVarM15045g);
            Object objM22097O = tj3Var2.m22097O();
            if (zM22120g2 || objM22097O == p84Var) {
                objM22097O = AbstractC0278f.m1254d(new sw5(faaVarM15045g, r2));
                tj3Var2.m22131l0(objM22097O);
            }
            boolean zBooleanValue2 = ((Boolean) ((dh9) objM22097O).getValue()).booleanValue();
            tj3Var2.m22111b0(143964305);
            float f4 = zBooleanValue2 ? 1.0f : 0.8f;
            tj3Var2.m22139q(false);
            Float fValueOf2 = Float.valueOf(f4);
            boolean zM22120g3 = tj3Var2.m22120g(faaVarM15045g);
            Object objM22097O2 = tj3Var2.m22097O();
            if (zM22120g3 || objM22097O2 == p84Var) {
                z = true;
                objM1254d = AbstractC0278f.m1254d(new sw5(faaVarM15045g, 1));
                tj3Var2.m22131l0(objM1254d);
            } else {
                objM1254d = objM22097O2;
                z = true;
            }
            tj3Var2.m22111b0(-745957716);
            tj3Var2.m22139q(false);
            final baa baaVarM15041c = kaa.m15041c(faaVarM15045g, fValueOf, fValueOf2, l43VarM21705c0, jdaVar, tj3Var2, 0);
            if (faaVarM15045g.m11673g()) {
                z2 = false;
                objM24111g2 = wq1.m24111g(tj3Var2, 1666827533, false, faaVarM15045g);
            } else {
                tj3Var2.m22111b0(1666573488);
                boolean zM22120g4 = tj3Var2.m22120g(faaVarM15045g);
                objM24111g2 = tj3Var2.m22097O();
                if (zM22120g4 || objM24111g2 == p84Var) {
                    jc9 jc9VarM16139y2 = lda.m16139y();
                    vi3 vi3VarMo3163e2 = jc9VarM16139y2 != null ? jc9VarM16139y2.mo3163e() : null;
                    jc9 jc9VarM16106F2 = lda.m16106F(jc9VarM16139y2);
                    try {
                        Object objM11669c2 = faaVarM15045g.m11669c();
                        lda.m16110J(jc9VarM16139y2, jc9VarM16106F2, vi3VarMo3163e2);
                        tj3Var2.m22131l0(objM11669c2);
                        objM24111g2 = objM11669c2;
                    } catch (Throwable th2) {
                        lda.m16110J(jc9VarM16139y2, jc9VarM16106F2, vi3VarMo3163e2);
                        throw th2;
                    }
                }
                z2 = false;
                tj3Var2.m22139q(false);
            }
            boolean zBooleanValue3 = ((Boolean) objM24111g2).booleanValue();
            tj3Var2.m22111b0(892761509);
            float f5 = zBooleanValue3 ? 1.0f : 0.0f;
            tj3Var2.m22139q(z2);
            Float fValueOf3 = Float.valueOf(f5);
            boolean zM22120g5 = tj3Var2.m22120g(faaVarM15045g);
            Object objM22097O3 = tj3Var2.m22097O();
            if (zM22120g5 || objM22097O3 == p84Var) {
                objM22097O3 = AbstractC0278f.m1254d(new sw5(faaVarM15045g, 2));
                tj3Var2.m22131l0(objM22097O3);
            }
            boolean zBooleanValue4 = ((Boolean) ((dh9) objM22097O3).getValue()).booleanValue();
            tj3Var2.m22111b0(892761509);
            float f6 = zBooleanValue4 ? 1.0f : 0.0f;
            tj3Var2.m22139q(false);
            Float fValueOf4 = Float.valueOf(f6);
            boolean zM22120g6 = tj3Var2.m22120g(faaVarM15045g);
            Object objM22097O4 = tj3Var2.m22097O();
            if (zM22120g6 || objM22097O4 == p84Var) {
                objM22097O4 = AbstractC0278f.m1254d(new sw5(faaVarM15045g, 3));
                tj3Var2.m22131l0(objM22097O4);
            }
            tj3Var2.m22111b0(2839488);
            tj3Var2.m22139q(false);
            final baa baaVarM15041c2 = kaa.m15041c(faaVarM15045g, fValueOf3, fValueOf4, l43VarM21705c1, jdaVar, tj3Var2, 0);
            final boolean zBooleanValue5 = ((Boolean) tj3Var2.m22128k(AbstractC0407s.f4861a)).booleanValue();
            boolean zM22122h = tj3Var2.m22122h(zBooleanValue5) | tj3Var2.m22120g(baaVarM15041c) | ((i2 & 112) != 32 ? false : z) | tj3Var2.m22120g(baaVarM15041c2);
            Object objM22097O5 = tj3Var2.m22097O();
            if (zM22122h || objM22097O5 == p84Var) {
                f2 = 0.0f;
                vi3 vi3Var = new vi3() { // from class: rw5
                    @Override // p000.vi3
                    public final Object invoke(Object obj) {
                        float fFloatValue;
                        t66 t66Var2 = w66Var.f66458c;
                        q98 q98Var = (q98) obj;
                        boolean z3 = zBooleanValue5;
                        dh9 dh9Var = baaVarM15041c;
                        float fFloatValue2 = 0.8f;
                        float fFloatValue3 = 1.0f;
                        if (z3) {
                            fFloatValue = ((Boolean) ((xc9) t66Var2).getValue()).booleanValue() ? 1.0f : 0.8f;
                        } else {
                            fFloatValue = ((Number) dh9Var.getValue()).floatValue();
                        }
                        q98Var.m19823p(fFloatValue);
                        if (!z3) {
                            fFloatValue2 = ((Number) dh9Var.getValue()).floatValue();
                        } else if (((Boolean) ((xc9) t66Var2).getValue()).booleanValue()) {
                            fFloatValue2 = 1.0f;
                        }
                        q98Var.m19824q(fFloatValue2);
                        if (!z3) {
                            fFloatValue3 = ((Number) baaVarM15041c2.getValue()).floatValue();
                        } else if (!((Boolean) ((xc9) t66Var2).getValue()).booleanValue()) {
                            fFloatValue3 = 0.0f;
                        }
                        q98Var.m19813c(fFloatValue3);
                        q98Var.m19828x(((k9a) t66Var.getValue()).f46917a);
                        return xfa.f68157a;
                    }
                };
                tj3Var2.m22131l0(vi3Var);
                objM22097O5 = vi3Var;
            } else {
                f2 = 0.0f;
            }
            int i3 = i2 >> 9;
            int i4 = i2 >> 6;
            ho9.m13414a(AbstractC0309d.m1406a(b16.f7762a, (vi3) objM22097O5), o39Var, j, 0L, f2, f, null, ci8.m4703P(-1463404422, new C3836zk(e16Var, yn8Var, c0282a, 24), tj3Var2), tj3Var2, (i3 & 896) | (i3 & 112) | 12582912 | (57344 & i4) | (458752 & i4) | (i4 & 3670016), 8);
            tj3Var = tj3Var2;
        } else {
            tj3Var2.m22102U();
            tj3Var = tj3Var2;
        }
        x18 x18VarM22143u = tj3Var.m22143u();
        if (x18VarM22143u != null) {
            x18VarM22143u.f67642d = new C0849cj(e16Var, w66Var, t66Var, yn8Var, o39Var, j, f, c0282a, i);
        }
    }

    /* JADX INFO: renamed from: b */
    public static final void m22327b(zi3 zi3Var, ui3 ui3Var, e16 e16Var, zi3 zi3Var2, zi3 zi3Var3, boolean z, kw5 kw5Var, t17 t17Var, ye1 ye1Var, int i) {
        int i2;
        tj3 tj3Var = (tj3) ye1Var;
        tj3Var.m22115d0(-1325192924);
        if ((i & 6) == 0) {
            i2 = (tj3Var.m22124i(zi3Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= tj3Var.m22124i(ui3Var) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= tj3Var.m22120g(e16Var) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= tj3Var.m22124i(zi3Var2) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            i2 |= tj3Var.m22124i(zi3Var3) ? 16384 : 8192;
        }
        if ((196608 & i) == 0) {
            i2 |= tj3Var.m22122h(z) ? 131072 : 65536;
        }
        if ((1572864 & i) == 0) {
            i2 |= tj3Var.m22120g(kw5Var) ? 1048576 : 524288;
        }
        if ((12582912 & i) == 0) {
            i2 |= tj3Var.m22120g(t17Var) ? 8388608 : 4194304;
        }
        if ((100663296 & i) == 0) {
            i2 |= tj3Var.m22120g(null) ? 67108864 : 33554432;
        }
        if (tj3Var.m22099R(i2 & 1, (38347923 & i2) != 38347922)) {
            e16 e16VarM21606S = AbstractC3584sr.m21606S(c99.m4425r(c99.m4412e(AbstractC0080f.m814a(e16Var, null, gh8.m12656a(true, 0.0f, 0L, null, 254), z, null, ui3Var, 24), 1.0f), f63011b, 48.0f, f63012c, 8), t17Var);
            sj8 sj8VarM20003a = qj8.m20003a(eh0.f37236b, nj0.f52789H, tj3Var, 48);
            int iHashCode = Long.hashCode(tj3Var.f62385T);
            l77 l77VarM22132m = tj3Var.m22132m();
            e16 e16VarM1322c = AbstractC0287b.m1322c(tj3Var, e16VarM21606S);
            se1.f60731q.getClass();
            ui3 ui3Var2 = C0352b.f4299b;
            tj3Var.m22119f0();
            if (tj3Var.f62384S) {
                tj3Var.m22130l(ui3Var2);
            } else {
                tj3Var.m22137o0();
            }
            oha.m18001g(tj3Var, C0352b.f4303f, sj8VarM20003a);
            oha.m18001g(tj3Var, C0352b.f4302e, l77VarM22132m);
            oha.m18001g(tj3Var, C0352b.f4304g, Integer.valueOf(iHashCode));
            oha.m18000f(tj3Var, C0352b.f4305h);
            oha.m18001g(tj3Var, C0352b.f4301d, e16VarM1322c);
            lw9.m16553a(((ms5) tj3Var.m22128k(ps5.f56764b)).f51800b.f71409m, ci8.m4703P(865999929, new uy0(zi3Var2, kw5Var, z, zi3Var3, zi3Var), tj3Var), tj3Var, 48);
            tj3Var.m22139q(true);
        } else {
            tj3Var.m22102U();
        }
        x18 x18VarM22143u = tj3Var.m22143u();
        if (x18VarM22143u != null) {
            x18VarM22143u.f67642d = new g75(zi3Var, ui3Var, e16Var, zi3Var2, zi3Var3, z, kw5Var, t17Var, i);
        }
    }
}
