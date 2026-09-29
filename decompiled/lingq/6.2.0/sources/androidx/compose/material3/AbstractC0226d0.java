package androidx.compose.material3;

import androidx.compose.foundation.gestures.AbstractC0104l;
import androidx.compose.foundation.gestures.Orientation;
import androidx.compose.material3.AbstractC0226d0;
import androidx.compose.p002ui.AbstractC0287b;
import androidx.compose.p002ui.node.C0352b;
import androidx.compose.p002ui.platform.AbstractC0402n;
import androidx.compose.p002ui.semantics.AbstractC0424d;
import androidx.compose.p002ui.semantics.AbstractC0426f;
import androidx.compose.p002ui.semantics.C0427g;
import androidx.compose.p002ui.unit.LayoutDirection;
import androidx.compose.runtime.internal.C0282a;
import androidx.compose.runtime.snapshots.SnapshotStateList;
import p000.AbstractC3025g4;
import p000.AbstractC3393o1;
import p000.AbstractC3423or;
import p000.AbstractC3489q9;
import p000.AbstractC3584sr;
import p000.C3187kk;
import p000.C3386nv;
import p000.aj3;
import p000.b16;
import p000.bk2;
import p000.bq1;
import p000.c06;
import p000.c99;
import p000.ci8;
import p000.cy0;
import p000.d32;
import p000.dfc;
import p000.e16;
import p000.en0;
import p000.fa4;
import p000.fa9;
import p000.fb2;
import p000.fg7;
import p000.fn7;
import p000.g75;
import p000.gc0;
import p000.gh8;
import p000.h41;
import p000.he0;
import p000.ht5;
import p000.ig7;
import p000.iq8;
import p000.iv3;
import p000.l70;
import p000.l77;
import p000.la9;
import p000.lo9;
import p000.mo9;
import p000.nj0;
import p000.nq7;
import p000.nv8;
import p000.oha;
import p000.oq7;
import p000.p84;
import p000.pb1;
import p000.qa9;
import p000.qb0;
import p000.qc9;
import p000.qh0;
import p000.ql4;
import p000.qpa;
import p000.se1;
import p000.sh8;
import p000.t66;
import p000.th8;
import p000.thb;
import p000.tj3;
import p000.ua9;
import p000.ui3;
import p000.v56;
import p000.va9;
import p000.vi3;
import p000.wa9;
import p000.we1;
import p000.wfb;
import p000.x18;
import p000.x49;
import p000.xc9;
import p000.xh3;
import p000.xwc;
import p000.y33;
import p000.ya9;
import p000.ye1;
import p000.zi3;

/* JADX INFO: renamed from: androidx.compose.material3.d0 */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC0226d0 {

    /* JADX INFO: renamed from: a */
    public static final float f3389a = ya9.f69566m;

    /* JADX INFO: renamed from: b */
    public static final float f3390b;

    /* JADX INFO: renamed from: c */
    public static final long f3391c;

    /* JADX INFO: renamed from: d */
    public static final float f3392d;

    /* JADX INFO: renamed from: e */
    public static final float f3393e;

    /* JADX INFO: renamed from: f */
    public static final qpa f3394f;

    static {
        float f = ya9.f69564k;
        f3390b = f;
        float f2 = ya9.f69562i;
        f3391c = AbstractC3584sr.m21614a(f, f2);
        AbstractC3584sr.m21614a(f2, f);
        f3392d = 6.0f;
        f3393e = 2.0f;
        f3394f = new qpa(SliderKt$CornerSizeAlignmentLine$1.f3260i);
    }

    /* JADX INFO: renamed from: a */
    public static final void m1130a(oq7 oq7Var, e16 e16Var, boolean z, fa9 fa9Var, v56 v56Var, v56 v56Var2, aj3 aj3Var, aj3 aj3Var2, aj3 aj3Var3, ye1 ye1Var, int i) {
        e16 e16Var2;
        boolean z2;
        fa9 fa9Var2;
        v56 v56Var3;
        v56 v56Var4;
        aj3 aj3Var4;
        aj3 aj3Var5;
        aj3 aj3Var6;
        int i2;
        e16 e16Var3;
        v56 v56Var5;
        aj3 aj3Var7;
        fa9 fa9Var3;
        boolean z3;
        aj3 aj3Var8;
        v56 v56Var6;
        aj3 aj3Var9;
        tj3 tj3Var = (tj3) ye1Var;
        tj3Var.m22115d0(-781154979);
        int i3 = i | (tj3Var.m22124i(oq7Var) ? 4 : 2) | 115041712;
        final int i4 = 0;
        final int i5 = 1;
        if (tj3Var.m22099R(i3 & 1, (38347923 & i3) != 38347922)) {
            tj3Var.m22104W();
            int i6 = 3;
            if ((i & 1) == 0 || tj3Var.m22084B()) {
                la9 la9Var = la9.f49371a;
                final fa9 fa9VarM16039f = la9.m16039f(tj3Var);
                int i7 = i3 & (-7169);
                Object objM22097O = tj3Var.m22097O();
                p84 p84Var = we1.f66679a;
                if (objM22097O == p84Var) {
                    objM22097O = AbstractC3393o1.m17729d(tj3Var);
                }
                final v56 v56Var7 = (v56) objM22097O;
                Object objM22097O2 = tj3Var.m22097O();
                if (objM22097O2 == p84Var) {
                    objM22097O2 = AbstractC3393o1.m17729d(tj3Var);
                }
                final v56 v56Var8 = (v56) objM22097O2;
                C0282a c0282aM4703P = ci8.m4703P(1597255314, new aj3() { // from class: sa9
                    @Override // p000.aj3
                    public final Object invoke(Object obj, Object obj2, Object obj3) {
                        int i8 = i4;
                        xfa xfaVar = xfa.f68157a;
                        ye1 ye1Var2 = (ye1) obj2;
                        ((Integer) obj3).getClass();
                        switch (i8) {
                            case 0:
                                la9.f49371a.m16045a(v56Var7, null, fa9VarM16039f, true, 0L, ye1Var2, 196608, 18);
                                break;
                            default:
                                la9.f49371a.m16045a(v56Var7, null, fa9VarM16039f, true, 0L, ye1Var2, 196608, 18);
                                break;
                        }
                        return xfaVar;
                    }
                }, tj3Var);
                C0282a c0282aM4703P2 = ci8.m4703P(1348023737, new aj3() { // from class: sa9
                    @Override // p000.aj3
                    public final Object invoke(Object obj, Object obj2, Object obj3) {
                        int i8 = i5;
                        xfa xfaVar = xfa.f68157a;
                        ye1 ye1Var2 = (ye1) obj2;
                        ((Integer) obj3).getClass();
                        switch (i8) {
                            case 0:
                                la9.f49371a.m16045a(v56Var8, null, fa9VarM16039f, true, 0L, ye1Var2, 196608, 18);
                                break;
                            default:
                                la9.f49371a.m16045a(v56Var8, null, fa9VarM16039f, true, 0L, ye1Var2, 196608, 18);
                                break;
                        }
                        return xfaVar;
                    }
                }, tj3Var);
                C0282a c0282aM4703P3 = ci8.m4703P(-453269015, new iq8(fa9VarM16039f, i6), tj3Var);
                i2 = i7;
                e16Var3 = b16.f7762a;
                v56Var5 = v56Var7;
                aj3Var7 = c0282aM4703P2;
                fa9Var3 = fa9VarM16039f;
                z3 = true;
                aj3Var8 = c0282aM4703P;
                v56Var6 = v56Var8;
                aj3Var9 = c0282aM4703P3;
            } else {
                tj3Var.m22102U();
                z3 = z;
                fa9Var3 = fa9Var;
                v56Var6 = v56Var2;
                aj3Var8 = aj3Var;
                aj3Var7 = aj3Var2;
                aj3Var9 = aj3Var3;
                i2 = i3 & (-7169);
                e16Var3 = e16Var;
                v56Var5 = v56Var;
            }
            tj3Var.m22140r();
            if (oq7Var.f54735a < 0) {
                C3386nv.m17626m("steps should be >= 0");
                return;
            }
            m1131b(e16Var3, oq7Var, z3, v56Var5, v56Var6, aj3Var8, aj3Var7, aj3Var9, tj3Var, ((i2 << 3) & 112) | 14380422);
            aj3Var5 = aj3Var9;
            aj3Var4 = aj3Var8;
            v56Var3 = v56Var5;
            z2 = z3;
            e16Var2 = e16Var3;
            aj3Var6 = aj3Var7;
            v56Var4 = v56Var6;
            fa9Var2 = fa9Var3;
        } else {
            tj3Var.m22102U();
            e16Var2 = e16Var;
            z2 = z;
            fa9Var2 = fa9Var;
            v56Var3 = v56Var;
            v56Var4 = v56Var2;
            aj3Var4 = aj3Var;
            aj3Var5 = aj3Var3;
            aj3Var6 = aj3Var2;
        }
        x18 x18VarM22143u = tj3Var.m22143u();
        if (x18VarM22143u != null) {
            x18VarM22143u.f67642d = new en0(oq7Var, e16Var2, z2, fa9Var2, v56Var3, v56Var4, aj3Var4, aj3Var6, aj3Var5, i);
        }
    }

    /* JADX WARN: Code duplicated, block: B:114:0x0360  */
    /* JADX WARN: Code duplicated, block: B:118:0x038c  */
    /* JADX WARN: Code duplicated, block: B:121:0x0399  */
    /* JADX WARN: Code duplicated, block: B:123:0x03d4  */
    /* JADX WARN: Code duplicated, block: B:124:0x03d8  */
    /* JADX WARN: Code duplicated, block: B:127:0x0424  */
    /* JADX WARN: Code duplicated, block: B:128:0x0428  */
    /* JADX WARN: Code duplicated, block: B:130:0x044e  */
    /* JADX INFO: renamed from: b */
    public static final void m1131b(e16 e16Var, final oq7 oq7Var, final boolean z, v56 v56Var, v56 v56Var2, aj3 aj3Var, aj3 aj3Var2, aj3 aj3Var3, ye1 ye1Var, int i) {
        int i2;
        oq7 oq7Var2;
        aj3 aj3Var4;
        tj3 tj3Var;
        v56 v56Var3;
        aj3 aj3Var5;
        zi3 zi3Var;
        p84 p84Var;
        boolean zM22120g;
        Object objM22097O;
        e16 e16VarM17643c;
        int i3;
        float fM19861h;
        float fM19861h2;
        boolean zM18211e;
        boolean zM22124i;
        Object objM22097O2;
        vi3 vi3Var;
        final boolean z2 = z;
        tj3 tj3Var2 = (tj3) ye1Var;
        tj3Var2.m22115d0(-287468326);
        if ((i & 6) == 0) {
            i2 = (tj3Var2.m22120g(e16Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= tj3Var2.m22124i(oq7Var) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= tj3Var2.m22122h(z2) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= tj3Var2.m22120g(v56Var) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            i2 |= tj3Var2.m22120g(v56Var2) ? 16384 : 8192;
        }
        if ((196608 & i) == 0) {
            i2 |= tj3Var2.m22124i(aj3Var) ? 131072 : 65536;
        }
        if ((1572864 & i) == 0) {
            i2 |= tj3Var2.m22124i(aj3Var2) ? 1048576 : 524288;
        }
        if ((12582912 & i) == 0) {
            i2 |= tj3Var2.m22124i(aj3Var3) ? 8388608 : 4194304;
        }
        int i4 = i2;
        if (tj3Var2.m22099R(i4 & 1, (i4 & 4793491) != 4793490)) {
            boolean z3 = tj3Var2.m22128k(AbstractC0402n.f4822n) == LayoutDirection.Rtl;
            t66 t66Var = oq7Var.f54749o;
            ui3 ui3Var = oq7Var.f54736b;
            h41 h41Var = oq7Var.f54737c;
            qc9 qc9Var = oq7Var.f54738d;
            qc9 qc9Var2 = oq7Var.f54739e;
            ((xc9) t66Var).setValue(Boolean.valueOf(z3));
            b16 b16Var = b16.f7762a;
            e16 e16VarM16958b = z2 ? mo9.m16958b(b16Var, new Object[]{v56Var, v56Var2, oq7Var}, new C0222b0(oq7Var, v56Var, v56Var2)) : b16Var;
            String strM11661w = fa4.m11661w(tj3Var2, androidx.compose.p002ui.R$string.range_start);
            String strM11661w2 = fa4.m11661w(tj3Var2, androidx.compose.p002ui.R$string.range_end);
            sh8 sh8Var = ((th8) tj3Var2.m22128k(gh8.f40823a)).f62294a;
            tj3Var2.m22111b0(197421000);
            tj3Var2.m22139q(false);
            tj3Var2.m22111b0(198096552);
            tj3Var2.m22139q(false);
            fb2 fb2Var = (fb2) tj3Var2.m22128k(AbstractC0402n.f4816h);
            iv3 iv3Var = AbstractC0262s.f3627a;
            e16 e16VarMo3161g = c99.m4420m(e16Var.mo3161g(c06.f9271b), f3390b, f3389a, 0.0f, 0.0f, 12).mo3161g(e16VarM16958b);
            boolean zM22122h = tj3Var2.m22122h(false) | tj3Var2.m22124i(oq7Var);
            Object objM22097O3 = tj3Var2.m22097O();
            p84 p84Var2 = we1.f66679a;
            if (zM22122h || objM22097O3 == p84Var2) {
                objM22097O3 = new C0219a0(oq7Var, 0);
                tj3Var2.m22131l0(objM22097O3);
            }
            ht5 ht5Var = (ht5) objM22097O3;
            int iHashCode = Long.hashCode(tj3Var2.f62385T);
            l77 l77VarM22132m = tj3Var2.m22132m();
            e16 e16VarM1322c = AbstractC0287b.m1322c(tj3Var2, e16VarMo3161g);
            se1.f60731q.getClass();
            ui3 ui3Var2 = C0352b.f4299b;
            tj3Var2.m22119f0();
            if (tj3Var2.f62384S) {
                tj3Var2.m22130l(ui3Var2);
            } else {
                tj3Var2.m22137o0();
            }
            zi3 zi3Var2 = C0352b.f4303f;
            oha.m18001g(tj3Var2, zi3Var2, ht5Var);
            zi3 zi3Var3 = C0352b.f4302e;
            oha.m18001g(tj3Var2, zi3Var3, l77VarM22132m);
            Integer numValueOf = Integer.valueOf(iHashCode);
            zi3 zi3Var4 = C0352b.f4304g;
            oha.m18001g(tj3Var2, zi3Var4, numValueOf);
            vi3 vi3Var2 = C0352b.f4305h;
            oha.m18000f(tj3Var2, vi3Var2);
            zi3 zi3Var5 = C0352b.f4301d;
            oha.m18001g(tj3Var2, zi3Var5, e16VarM1322c);
            e16 e16VarM4431x = c99.m4431x(l70.m15961x(b16Var, RangeSliderComponents.STARTTHUMB).mo3161g(b16Var));
            boolean zM22122h2 = tj3Var2.m22122h(false) | tj3Var2.m22120g(fb2Var) | tj3Var2.m22124i(oq7Var);
            Object objM22097O4 = tj3Var2.m22097O();
            if (zM22122h2 || objM22097O4 == p84Var2) {
                objM22097O4 = new nq7(fb2Var, oq7Var, 1);
                tj3Var2.m22131l0(objM22097O4);
            }
            e16 e16VarM19025M = pb1.m19025M(e16VarM4431x, (vi3) objM22097O4);
            final h41 h41Var2 = new h41(h41Var.f41765a, qc9Var2.m19861h());
            final int i5 = 1;
            e16 e16VarM17643c2 = nv8.m17643c(e16VarM19025M, false, new vi3() { // from class: pa9
                @Override // p000.vi3
                public final Object invoke(Object obj) {
                    int i6 = i5;
                    final h41 h41Var3 = h41Var2;
                    final oq7 oq7Var3 = oq7Var;
                    boolean z4 = z2;
                    xfa xfaVar = xfa.f68157a;
                    final int i7 = 0;
                    tv8 tv8Var = (tv8) obj;
                    switch (i6) {
                        case 0:
                            if (!z4) {
                                bh4[] bh4VarArr = AbstractC0426f.f5022a;
                                tv8Var.mo3709d(AbstractC0424d.f5003j, xfaVar);
                            }
                            String strValueOf = String.valueOf(ss5.m21693T(oq7Var3.f54739e.m19861h() * 100.0f) / 100.0f);
                            bh4[] bh4VarArr2 = AbstractC0426f.f5022a;
                            C0427g c0427g = AbstractC0424d.f4995b;
                            bh4 bh4Var = AbstractC0426f.f5022a[0];
                            tv8Var.mo3709d(c0427g, strValueOf);
                            final int i8 = 1;
                            AbstractC0426f.m1862f(tv8Var, new vi3() { // from class: na9
                                @Override // p000.vi3
                                public final Object invoke(Object obj2) {
                                    int iM18210d;
                                    int iM18209c;
                                    int i9 = i8;
                                    boolean z5 = true;
                                    oq7 oq7Var4 = oq7Var3;
                                    h41 h41Var4 = h41Var3;
                                    float fFloatValue = ((Float) obj2).floatValue();
                                    switch (i9) {
                                        case 0:
                                            float f = h41Var4.f41765a;
                                            float f2 = h41Var4.f41766b;
                                            float fM15944g = l70.m15944g(fFloatValue, f, f2);
                                            int iM18210d2 = oq7Var4.m18210d();
                                            qc9 qc9Var3 = oq7Var4.f54739e;
                                            qc9 qc9Var4 = oq7Var4.f54738d;
                                            if (iM18210d2 > 0 && (iM18210d = oq7Var4.m18210d() + 1) >= 0) {
                                                float fAbs = fM15944g;
                                                float f3 = fAbs;
                                                int i10 = 0;
                                                while (true) {
                                                    float fM18232Q = AbstractC3423or.m18232Q(f, f2, i10 / (oq7Var4.m18210d() + 1));
                                                    float f4 = fM18232Q - fM15944g;
                                                    if (Math.abs(f4) <= fAbs) {
                                                        fAbs = Math.abs(f4);
                                                        f3 = fM18232Q;
                                                    }
                                                    if (i10 != iM18210d) {
                                                        i10++;
                                                    } else {
                                                        fM15944g = f3;
                                                    }
                                                }
                                            }
                                            if (fM15944g == qc9Var4.m19861h()) {
                                                z5 = false;
                                            } else {
                                                long jM1136g = AbstractC0226d0.m1136g(fM15944g, qc9Var3.m19861h());
                                                long jM1136g2 = AbstractC0226d0.m1136g(qc9Var4.m19861h(), qc9Var3.m19861h());
                                                int i11 = wa9.f66568c;
                                                if (jM1136g != jM1136g2) {
                                                    oq7Var4.m18215i(wa9.m23825b(jM1136g));
                                                    oq7Var4.m18214h(wa9.m23824a(jM1136g));
                                                }
                                                oq7Var4.f54736b.mo0a();
                                            }
                                            return Boolean.valueOf(z5);
                                        default:
                                            float f5 = h41Var4.f41765a;
                                            float f6 = h41Var4.f41766b;
                                            float fM15944g2 = l70.m15944g(fFloatValue, f5, f6);
                                            int iM18209c2 = oq7Var4.m18209c();
                                            qc9 qc9Var5 = oq7Var4.f54738d;
                                            qc9 qc9Var6 = oq7Var4.f54739e;
                                            if (iM18209c2 > 0 && (iM18209c = oq7Var4.m18209c() + 1) >= 0) {
                                                float fAbs2 = fM15944g2;
                                                float f7 = fAbs2;
                                                int i12 = 0;
                                                while (true) {
                                                    float fM18232Q2 = AbstractC3423or.m18232Q(f5, f6, i12 / (oq7Var4.m18209c() + 1));
                                                    float f8 = fM18232Q2 - fM15944g2;
                                                    if (Math.abs(f8) <= fAbs2) {
                                                        fAbs2 = Math.abs(f8);
                                                        f7 = fM18232Q2;
                                                    }
                                                    if (i12 != iM18209c) {
                                                        i12++;
                                                    } else {
                                                        fM15944g2 = f7;
                                                    }
                                                }
                                            }
                                            if (fM15944g2 == qc9Var6.m19861h()) {
                                                z5 = false;
                                            } else {
                                                long jM1136g3 = AbstractC0226d0.m1136g(qc9Var5.m19861h(), fM15944g2);
                                                long jM1136g4 = AbstractC0226d0.m1136g(qc9Var5.m19861h(), qc9Var6.m19861h());
                                                int i13 = wa9.f66568c;
                                                if (jM1136g3 != jM1136g4) {
                                                    oq7Var4.m18215i(wa9.m23825b(jM1136g3));
                                                    oq7Var4.m18214h(wa9.m23824a(jM1136g3));
                                                }
                                                oq7Var4.f54736b.mo0a();
                                            }
                                            return Boolean.valueOf(z5);
                                    }
                                }
                            });
                            break;
                        default:
                            if (!z4) {
                                bh4[] bh4VarArr3 = AbstractC0426f.f5022a;
                                tv8Var.mo3709d(AbstractC0424d.f5003j, xfaVar);
                            }
                            String strValueOf2 = String.valueOf(ss5.m21693T(oq7Var3.f54738d.m19861h() * 100.0f) / 100.0f);
                            bh4[] bh4VarArr4 = AbstractC0426f.f5022a;
                            C0427g c0427g2 = AbstractC0424d.f4995b;
                            bh4 bh4Var2 = AbstractC0426f.f5022a[0];
                            tv8Var.mo3709d(c0427g2, strValueOf2);
                            AbstractC0426f.m1862f(tv8Var, new vi3() { // from class: na9
                                @Override // p000.vi3
                                public final Object invoke(Object obj2) {
                                    int iM18210d;
                                    int iM18209c;
                                    int i9 = i7;
                                    boolean z5 = true;
                                    oq7 oq7Var4 = oq7Var3;
                                    h41 h41Var4 = h41Var3;
                                    float fFloatValue = ((Float) obj2).floatValue();
                                    switch (i9) {
                                        case 0:
                                            float f = h41Var4.f41765a;
                                            float f2 = h41Var4.f41766b;
                                            float fM15944g = l70.m15944g(fFloatValue, f, f2);
                                            int iM18210d2 = oq7Var4.m18210d();
                                            qc9 qc9Var3 = oq7Var4.f54739e;
                                            qc9 qc9Var4 = oq7Var4.f54738d;
                                            if (iM18210d2 > 0 && (iM18210d = oq7Var4.m18210d() + 1) >= 0) {
                                                float fAbs = fM15944g;
                                                float f3 = fAbs;
                                                int i10 = 0;
                                                while (true) {
                                                    float fM18232Q = AbstractC3423or.m18232Q(f, f2, i10 / (oq7Var4.m18210d() + 1));
                                                    float f4 = fM18232Q - fM15944g;
                                                    if (Math.abs(f4) <= fAbs) {
                                                        fAbs = Math.abs(f4);
                                                        f3 = fM18232Q;
                                                    }
                                                    if (i10 != iM18210d) {
                                                        i10++;
                                                    } else {
                                                        fM15944g = f3;
                                                    }
                                                }
                                            }
                                            if (fM15944g == qc9Var4.m19861h()) {
                                                z5 = false;
                                            } else {
                                                long jM1136g = AbstractC0226d0.m1136g(fM15944g, qc9Var3.m19861h());
                                                long jM1136g2 = AbstractC0226d0.m1136g(qc9Var4.m19861h(), qc9Var3.m19861h());
                                                int i11 = wa9.f66568c;
                                                if (jM1136g != jM1136g2) {
                                                    oq7Var4.m18215i(wa9.m23825b(jM1136g));
                                                    oq7Var4.m18214h(wa9.m23824a(jM1136g));
                                                }
                                                oq7Var4.f54736b.mo0a();
                                            }
                                            return Boolean.valueOf(z5);
                                        default:
                                            float f5 = h41Var4.f41765a;
                                            float f6 = h41Var4.f41766b;
                                            float fM15944g2 = l70.m15944g(fFloatValue, f5, f6);
                                            int iM18209c2 = oq7Var4.m18209c();
                                            qc9 qc9Var5 = oq7Var4.f54738d;
                                            qc9 qc9Var6 = oq7Var4.f54739e;
                                            if (iM18209c2 > 0 && (iM18209c = oq7Var4.m18209c() + 1) >= 0) {
                                                float fAbs2 = fM15944g2;
                                                float f7 = fAbs2;
                                                int i12 = 0;
                                                while (true) {
                                                    float fM18232Q2 = AbstractC3423or.m18232Q(f5, f6, i12 / (oq7Var4.m18209c() + 1));
                                                    float f8 = fM18232Q2 - fM15944g2;
                                                    if (Math.abs(f8) <= fAbs2) {
                                                        fAbs2 = Math.abs(f8);
                                                        f7 = fM18232Q2;
                                                    }
                                                    if (i12 != iM18209c) {
                                                        i12++;
                                                    } else {
                                                        fM15944g2 = f7;
                                                    }
                                                }
                                            }
                                            if (fM15944g2 == qc9Var6.m19861h()) {
                                                z5 = false;
                                            } else {
                                                long jM1136g3 = AbstractC0226d0.m1136g(qc9Var5.m19861h(), fM15944g2);
                                                long jM1136g4 = AbstractC0226d0.m1136g(qc9Var5.m19861h(), qc9Var6.m19861h());
                                                int i13 = wa9.f66568c;
                                                if (jM1136g3 != jM1136g4) {
                                                    oq7Var4.m18215i(wa9.m23825b(jM1136g3));
                                                    oq7Var4.m18214h(wa9.m23824a(jM1136g3));
                                                }
                                                oq7Var4.f54736b.mo0a();
                                            }
                                            return Boolean.valueOf(z5);
                                    }
                                }
                            });
                            break;
                    }
                    return xfaVar;
                }
            });
            e16 e16Var2 = AbstractC3025g4.f40155a;
            e16 e16VarM17643c3 = nv8.m17643c(e16VarM17643c2.mo3161g(e16Var2), true, new fn7(qc9Var.m19861h(), h41Var2, oq7Var.m18210d()));
            boolean zM22120g2 = tj3Var2.m22120g(strM11661w);
            Object objM22097O5 = tj3Var2.m22097O();
            if (zM22120g2 || objM22097O5 == p84Var2) {
                objM22097O5 = new ql4(strM11661w, 23);
                tj3Var2.m22131l0(objM22097O5);
            }
            e16 e16VarM17643c4 = nv8.m17643c(e16VarM17643c3, true, (vi3) objM22097O5);
            int i6 = oq7Var.f54735a;
            float fM19861h3 = qc9Var.m19861h();
            float fM19861h4 = qc9Var2.m19861h();
            boolean zM18211e2 = oq7Var.m18211e();
            boolean zM22124i2 = tj3Var2.m22124i(oq7Var);
            Object objM22097O6 = tj3Var2.m22097O();
            if (zM22124i2 || objM22097O6 == p84Var2) {
                objM22097O6 = new nq7(oq7Var, 2);
                tj3Var2.m22131l0(objM22097O6);
            }
            vi3 vi3Var3 = (vi3) objM22097O6;
            if (i6 < 0) {
                C3386nv.m17626m("steps should be >= 0");
                return;
            }
            tj3Var = tj3Var2;
            e16 e16VarM23919n = wfb.m23919n(AbstractC3489q9.m19794x(e16VarM17643c4, new ua9(z, h41Var, i6, zM18211e2, true, fM19861h4, vi3Var3, fM19861h3, ui3Var)), z, v56Var);
            gc0 gc0Var = nj0.f52808c;
            ht5 ht5VarM19966d = qh0.m19966d(gc0Var, false);
            int iHashCode2 = Long.hashCode(tj3Var.f62385T);
            l77 l77VarM22132m2 = tj3Var.m22132m();
            e16 e16VarM1322c2 = AbstractC0287b.m1322c(tj3Var, e16VarM23919n);
            tj3Var.m22119f0();
            if (tj3Var.f62384S) {
                tj3Var.m22130l(ui3Var2);
            } else {
                tj3Var.m22137o0();
            }
            oha.m18001g(tj3Var, zi3Var2, ht5VarM19966d);
            oha.m18001g(tj3Var, zi3Var3, l77VarM22132m2);
            AbstractC3393o1.m17747v(iHashCode2, tj3Var, zi3Var4, tj3Var, vi3Var2);
            oha.m18001g(tj3Var, zi3Var5, e16VarM1322c2);
            int i7 = (i4 >> 3) & 14;
            aj3Var.invoke(oq7Var, tj3Var, Integer.valueOf(i7 | ((i4 >> 12) & 112)));
            tj3Var.m22139q(true);
            e16 e16VarM4431x2 = c99.m4431x(l70.m15961x(b16Var, RangeSliderComponents.ENDTHUMB).mo3161g(b16Var));
            boolean zM22122h3 = tj3Var.m22122h(false) | tj3Var.m22120g(fb2Var) | tj3Var.m22124i(oq7Var);
            Object objM22097O7 = tj3Var.m22097O();
            if (zM22122h3) {
                zi3Var = zi3Var3;
                p84Var = p84Var2;
            } else {
                zi3Var = zi3Var3;
                p84Var = p84Var2;
                if (objM22097O7 == p84Var) {
                }
                e16 e16VarM19025M2 = pb1.m19025M(e16VarM4431x2, (vi3) objM22097O7);
                final h41 h41Var3 = new h41(qc9Var.m19861h(), h41Var.f41766b);
                final int i8 = 0;
                e16 e16VarM17643c5 = nv8.m17643c(nv8.m17643c(e16VarM19025M2, false, new vi3() { // from class: pa9
                    @Override // p000.vi3
                    public final Object invoke(Object obj) {
                        int i9 = i8;
                        final h41 h41Var4 = h41Var3;
                        final oq7 oq7Var3 = oq7Var;
                        boolean z4 = z;
                        xfa xfaVar = xfa.f68157a;
                        final int i10 = 0;
                        tv8 tv8Var = (tv8) obj;
                        switch (i9) {
                            case 0:
                                if (!z4) {
                                    bh4[] bh4VarArr = AbstractC0426f.f5022a;
                                    tv8Var.mo3709d(AbstractC0424d.f5003j, xfaVar);
                                }
                                String strValueOf = String.valueOf(ss5.m21693T(oq7Var3.f54739e.m19861h() * 100.0f) / 100.0f);
                                bh4[] bh4VarArr2 = AbstractC0426f.f5022a;
                                C0427g c0427g = AbstractC0424d.f4995b;
                                bh4 bh4Var = AbstractC0426f.f5022a[0];
                                tv8Var.mo3709d(c0427g, strValueOf);
                                final int i11 = 1;
                                AbstractC0426f.m1862f(tv8Var, new vi3() { // from class: na9
                                    @Override // p000.vi3
                                    public final Object invoke(Object obj2) {
                                        int iM18210d;
                                        int iM18209c;
                                        int i12 = i11;
                                        boolean z5 = true;
                                        oq7 oq7Var4 = oq7Var3;
                                        h41 h41Var5 = h41Var4;
                                        float fFloatValue = ((Float) obj2).floatValue();
                                        switch (i12) {
                                            case 0:
                                                float f = h41Var5.f41765a;
                                                float f2 = h41Var5.f41766b;
                                                float fM15944g = l70.m15944g(fFloatValue, f, f2);
                                                int iM18210d2 = oq7Var4.m18210d();
                                                qc9 qc9Var3 = oq7Var4.f54739e;
                                                qc9 qc9Var4 = oq7Var4.f54738d;
                                                if (iM18210d2 > 0 && (iM18210d = oq7Var4.m18210d() + 1) >= 0) {
                                                    float fAbs = fM15944g;
                                                    float f3 = fAbs;
                                                    int i13 = 0;
                                                    while (true) {
                                                        float fM18232Q = AbstractC3423or.m18232Q(f, f2, i13 / (oq7Var4.m18210d() + 1));
                                                        float f4 = fM18232Q - fM15944g;
                                                        if (Math.abs(f4) <= fAbs) {
                                                            fAbs = Math.abs(f4);
                                                            f3 = fM18232Q;
                                                        }
                                                        if (i13 != iM18210d) {
                                                            i13++;
                                                        } else {
                                                            fM15944g = f3;
                                                        }
                                                    }
                                                }
                                                if (fM15944g == qc9Var4.m19861h()) {
                                                    z5 = false;
                                                } else {
                                                    long jM1136g = AbstractC0226d0.m1136g(fM15944g, qc9Var3.m19861h());
                                                    long jM1136g2 = AbstractC0226d0.m1136g(qc9Var4.m19861h(), qc9Var3.m19861h());
                                                    int i14 = wa9.f66568c;
                                                    if (jM1136g != jM1136g2) {
                                                        oq7Var4.m18215i(wa9.m23825b(jM1136g));
                                                        oq7Var4.m18214h(wa9.m23824a(jM1136g));
                                                    }
                                                    oq7Var4.f54736b.mo0a();
                                                }
                                                return Boolean.valueOf(z5);
                                            default:
                                                float f5 = h41Var5.f41765a;
                                                float f6 = h41Var5.f41766b;
                                                float fM15944g2 = l70.m15944g(fFloatValue, f5, f6);
                                                int iM18209c2 = oq7Var4.m18209c();
                                                qc9 qc9Var5 = oq7Var4.f54738d;
                                                qc9 qc9Var6 = oq7Var4.f54739e;
                                                if (iM18209c2 > 0 && (iM18209c = oq7Var4.m18209c() + 1) >= 0) {
                                                    float fAbs2 = fM15944g2;
                                                    float f7 = fAbs2;
                                                    int i15 = 0;
                                                    while (true) {
                                                        float fM18232Q2 = AbstractC3423or.m18232Q(f5, f6, i15 / (oq7Var4.m18209c() + 1));
                                                        float f8 = fM18232Q2 - fM15944g2;
                                                        if (Math.abs(f8) <= fAbs2) {
                                                            fAbs2 = Math.abs(f8);
                                                            f7 = fM18232Q2;
                                                        }
                                                        if (i15 != iM18209c) {
                                                            i15++;
                                                        } else {
                                                            fM15944g2 = f7;
                                                        }
                                                    }
                                                }
                                                if (fM15944g2 == qc9Var6.m19861h()) {
                                                    z5 = false;
                                                } else {
                                                    long jM1136g3 = AbstractC0226d0.m1136g(qc9Var5.m19861h(), fM15944g2);
                                                    long jM1136g4 = AbstractC0226d0.m1136g(qc9Var5.m19861h(), qc9Var6.m19861h());
                                                    int i16 = wa9.f66568c;
                                                    if (jM1136g3 != jM1136g4) {
                                                        oq7Var4.m18215i(wa9.m23825b(jM1136g3));
                                                        oq7Var4.m18214h(wa9.m23824a(jM1136g3));
                                                    }
                                                    oq7Var4.f54736b.mo0a();
                                                }
                                                return Boolean.valueOf(z5);
                                        }
                                    }
                                });
                                break;
                            default:
                                if (!z4) {
                                    bh4[] bh4VarArr3 = AbstractC0426f.f5022a;
                                    tv8Var.mo3709d(AbstractC0424d.f5003j, xfaVar);
                                }
                                String strValueOf2 = String.valueOf(ss5.m21693T(oq7Var3.f54738d.m19861h() * 100.0f) / 100.0f);
                                bh4[] bh4VarArr4 = AbstractC0426f.f5022a;
                                C0427g c0427g2 = AbstractC0424d.f4995b;
                                bh4 bh4Var2 = AbstractC0426f.f5022a[0];
                                tv8Var.mo3709d(c0427g2, strValueOf2);
                                AbstractC0426f.m1862f(tv8Var, new vi3() { // from class: na9
                                    @Override // p000.vi3
                                    public final Object invoke(Object obj2) {
                                        int iM18210d;
                                        int iM18209c;
                                        int i12 = i10;
                                        boolean z5 = true;
                                        oq7 oq7Var4 = oq7Var3;
                                        h41 h41Var5 = h41Var4;
                                        float fFloatValue = ((Float) obj2).floatValue();
                                        switch (i12) {
                                            case 0:
                                                float f = h41Var5.f41765a;
                                                float f2 = h41Var5.f41766b;
                                                float fM15944g = l70.m15944g(fFloatValue, f, f2);
                                                int iM18210d2 = oq7Var4.m18210d();
                                                qc9 qc9Var3 = oq7Var4.f54739e;
                                                qc9 qc9Var4 = oq7Var4.f54738d;
                                                if (iM18210d2 > 0 && (iM18210d = oq7Var4.m18210d() + 1) >= 0) {
                                                    float fAbs = fM15944g;
                                                    float f3 = fAbs;
                                                    int i13 = 0;
                                                    while (true) {
                                                        float fM18232Q = AbstractC3423or.m18232Q(f, f2, i13 / (oq7Var4.m18210d() + 1));
                                                        float f4 = fM18232Q - fM15944g;
                                                        if (Math.abs(f4) <= fAbs) {
                                                            fAbs = Math.abs(f4);
                                                            f3 = fM18232Q;
                                                        }
                                                        if (i13 != iM18210d) {
                                                            i13++;
                                                        } else {
                                                            fM15944g = f3;
                                                        }
                                                    }
                                                }
                                                if (fM15944g == qc9Var4.m19861h()) {
                                                    z5 = false;
                                                } else {
                                                    long jM1136g = AbstractC0226d0.m1136g(fM15944g, qc9Var3.m19861h());
                                                    long jM1136g2 = AbstractC0226d0.m1136g(qc9Var4.m19861h(), qc9Var3.m19861h());
                                                    int i14 = wa9.f66568c;
                                                    if (jM1136g != jM1136g2) {
                                                        oq7Var4.m18215i(wa9.m23825b(jM1136g));
                                                        oq7Var4.m18214h(wa9.m23824a(jM1136g));
                                                    }
                                                    oq7Var4.f54736b.mo0a();
                                                }
                                                return Boolean.valueOf(z5);
                                            default:
                                                float f5 = h41Var5.f41765a;
                                                float f6 = h41Var5.f41766b;
                                                float fM15944g2 = l70.m15944g(fFloatValue, f5, f6);
                                                int iM18209c2 = oq7Var4.m18209c();
                                                qc9 qc9Var5 = oq7Var4.f54738d;
                                                qc9 qc9Var6 = oq7Var4.f54739e;
                                                if (iM18209c2 > 0 && (iM18209c = oq7Var4.m18209c() + 1) >= 0) {
                                                    float fAbs2 = fM15944g2;
                                                    float f7 = fAbs2;
                                                    int i15 = 0;
                                                    while (true) {
                                                        float fM18232Q2 = AbstractC3423or.m18232Q(f5, f6, i15 / (oq7Var4.m18209c() + 1));
                                                        float f8 = fM18232Q2 - fM15944g2;
                                                        if (Math.abs(f8) <= fAbs2) {
                                                            fAbs2 = Math.abs(f8);
                                                            f7 = fM18232Q2;
                                                        }
                                                        if (i15 != iM18209c) {
                                                            i15++;
                                                        } else {
                                                            fM15944g2 = f7;
                                                        }
                                                    }
                                                }
                                                if (fM15944g2 == qc9Var6.m19861h()) {
                                                    z5 = false;
                                                } else {
                                                    long jM1136g3 = AbstractC0226d0.m1136g(qc9Var5.m19861h(), fM15944g2);
                                                    long jM1136g4 = AbstractC0226d0.m1136g(qc9Var5.m19861h(), qc9Var6.m19861h());
                                                    int i16 = wa9.f66568c;
                                                    if (jM1136g3 != jM1136g4) {
                                                        oq7Var4.m18215i(wa9.m23825b(jM1136g3));
                                                        oq7Var4.m18214h(wa9.m23824a(jM1136g3));
                                                    }
                                                    oq7Var4.f54736b.mo0a();
                                                }
                                                return Boolean.valueOf(z5);
                                        }
                                    }
                                });
                                break;
                        }
                        return xfaVar;
                    }
                }).mo3161g(e16Var2), true, new fn7(qc9Var2.m19861h(), h41Var3, oq7Var.m18209c()));
                zM22120g = tj3Var.m22120g(strM11661w2);
                objM22097O = tj3Var.m22097O();
                if (zM22120g || objM22097O == p84Var) {
                    objM22097O = new ql4(strM11661w2, 24);
                    tj3Var.m22131l0(objM22097O);
                }
                e16VarM17643c = nv8.m17643c(e16VarM17643c5, true, (vi3) objM22097O);
                i3 = oq7Var.f54735a;
                fM19861h = qc9Var.m19861h();
                fM19861h2 = qc9Var2.m19861h();
                zM18211e = oq7Var.m18211e();
                zM22124i = tj3Var.m22124i(oq7Var);
                objM22097O2 = tj3Var.m22097O();
                if (zM22124i || objM22097O2 == p84Var) {
                    objM22097O2 = new nq7(oq7Var, 4);
                    tj3Var.m22131l0(objM22097O2);
                }
                vi3Var = (vi3) objM22097O2;
                if (i3 >= 0) {
                    C3386nv.m17626m("steps should be >= 0");
                    return;
                }
                zi3 zi3Var6 = zi3Var;
                z2 = z;
                e16 e16VarM19794x = AbstractC3489q9.m19794x(e16VarM17643c, new ua9(z2, h41Var, i3, zM18211e, false, fM19861h2, vi3Var, fM19861h, ui3Var));
                v56Var3 = v56Var2;
                e16 e16VarM23919n2 = wfb.m23919n(e16VarM19794x, z2, v56Var3);
                ht5 ht5VarM19966d2 = qh0.m19966d(gc0Var, false);
                int iHashCode3 = Long.hashCode(tj3Var.f62385T);
                l77 l77VarM22132m3 = tj3Var.m22132m();
                e16 e16VarM1322c3 = AbstractC0287b.m1322c(tj3Var, e16VarM23919n2);
                tj3Var.m22119f0();
                if (tj3Var.f62384S) {
                    tj3Var.m22130l(ui3Var2);
                } else {
                    tj3Var.m22137o0();
                }
                oha.m18001g(tj3Var, zi3Var2, ht5VarM19966d2);
                oha.m18001g(tj3Var, zi3Var6, l77VarM22132m3);
                AbstractC3393o1.m17747v(iHashCode3, tj3Var, zi3Var4, tj3Var, vi3Var2);
                oha.m18001g(tj3Var, zi3Var5, e16VarM1322c3);
                oq7Var2 = oq7Var;
                aj3Var5 = aj3Var2;
                aj3Var5.invoke(oq7Var2, tj3Var, Integer.valueOf(i7 | ((i4 >> 15) & 112)));
                tj3Var.m22139q(true);
                e16 e16VarM15961x = l70.m15961x(b16Var, RangeSliderComponents.TRACK);
                ht5 ht5VarM19966d3 = qh0.m19966d(gc0Var, false);
                int iHashCode4 = Long.hashCode(tj3Var.f62385T);
                l77 l77VarM22132m4 = tj3Var.m22132m();
                e16 e16VarM1322c4 = AbstractC0287b.m1322c(tj3Var, e16VarM15961x);
                tj3Var.m22119f0();
                if (tj3Var.f62384S) {
                    tj3Var.m22130l(ui3Var2);
                } else {
                    tj3Var.m22137o0();
                }
                oha.m18001g(tj3Var, zi3Var2, ht5VarM19966d3);
                oha.m18001g(tj3Var, zi3Var6, l77VarM22132m4);
                AbstractC3393o1.m17747v(iHashCode4, tj3Var, zi3Var4, tj3Var, vi3Var2);
                oha.m18001g(tj3Var, zi3Var5, e16VarM1322c4);
                aj3Var4 = aj3Var3;
                aj3Var4.invoke(oq7Var2, tj3Var, Integer.valueOf(i7 | ((i4 >> 18) & 112)));
                tj3Var.m22139q(true);
                tj3Var.m22139q(true);
            }
            objM22097O7 = new nq7(fb2Var, oq7Var, 3);
            tj3Var.m22131l0(objM22097O7);
            e16 e16VarM19025M3 = pb1.m19025M(e16VarM4431x2, (vi3) objM22097O7);
            final h41 h41Var4 = new h41(qc9Var.m19861h(), h41Var.f41766b);
            final int i9 = 0;
            e16 e16VarM17643c6 = nv8.m17643c(nv8.m17643c(e16VarM19025M3, false, new vi3() { // from class: pa9
                @Override // p000.vi3
                public final Object invoke(Object obj) {
                    int i10 = i9;
                    final h41 h41Var5 = h41Var4;
                    final oq7 oq7Var3 = oq7Var;
                    boolean z4 = z;
                    xfa xfaVar = xfa.f68157a;
                    final int i11 = 0;
                    tv8 tv8Var = (tv8) obj;
                    switch (i10) {
                        case 0:
                            if (!z4) {
                                bh4[] bh4VarArr = AbstractC0426f.f5022a;
                                tv8Var.mo3709d(AbstractC0424d.f5003j, xfaVar);
                            }
                            String strValueOf = String.valueOf(ss5.m21693T(oq7Var3.f54739e.m19861h() * 100.0f) / 100.0f);
                            bh4[] bh4VarArr2 = AbstractC0426f.f5022a;
                            C0427g c0427g = AbstractC0424d.f4995b;
                            bh4 bh4Var = AbstractC0426f.f5022a[0];
                            tv8Var.mo3709d(c0427g, strValueOf);
                            final int i12 = 1;
                            AbstractC0426f.m1862f(tv8Var, new vi3() { // from class: na9
                                @Override // p000.vi3
                                public final Object invoke(Object obj2) {
                                    int iM18210d;
                                    int iM18209c;
                                    int i13 = i12;
                                    boolean z5 = true;
                                    oq7 oq7Var4 = oq7Var3;
                                    h41 h41Var6 = h41Var5;
                                    float fFloatValue = ((Float) obj2).floatValue();
                                    switch (i13) {
                                        case 0:
                                            float f = h41Var6.f41765a;
                                            float f2 = h41Var6.f41766b;
                                            float fM15944g = l70.m15944g(fFloatValue, f, f2);
                                            int iM18210d2 = oq7Var4.m18210d();
                                            qc9 qc9Var3 = oq7Var4.f54739e;
                                            qc9 qc9Var4 = oq7Var4.f54738d;
                                            if (iM18210d2 > 0 && (iM18210d = oq7Var4.m18210d() + 1) >= 0) {
                                                float fAbs = fM15944g;
                                                float f3 = fAbs;
                                                int i14 = 0;
                                                while (true) {
                                                    float fM18232Q = AbstractC3423or.m18232Q(f, f2, i14 / (oq7Var4.m18210d() + 1));
                                                    float f4 = fM18232Q - fM15944g;
                                                    if (Math.abs(f4) <= fAbs) {
                                                        fAbs = Math.abs(f4);
                                                        f3 = fM18232Q;
                                                    }
                                                    if (i14 != iM18210d) {
                                                        i14++;
                                                    } else {
                                                        fM15944g = f3;
                                                    }
                                                }
                                            }
                                            if (fM15944g == qc9Var4.m19861h()) {
                                                z5 = false;
                                            } else {
                                                long jM1136g = AbstractC0226d0.m1136g(fM15944g, qc9Var3.m19861h());
                                                long jM1136g2 = AbstractC0226d0.m1136g(qc9Var4.m19861h(), qc9Var3.m19861h());
                                                int i15 = wa9.f66568c;
                                                if (jM1136g != jM1136g2) {
                                                    oq7Var4.m18215i(wa9.m23825b(jM1136g));
                                                    oq7Var4.m18214h(wa9.m23824a(jM1136g));
                                                }
                                                oq7Var4.f54736b.mo0a();
                                            }
                                            return Boolean.valueOf(z5);
                                        default:
                                            float f5 = h41Var6.f41765a;
                                            float f6 = h41Var6.f41766b;
                                            float fM15944g2 = l70.m15944g(fFloatValue, f5, f6);
                                            int iM18209c2 = oq7Var4.m18209c();
                                            qc9 qc9Var5 = oq7Var4.f54738d;
                                            qc9 qc9Var6 = oq7Var4.f54739e;
                                            if (iM18209c2 > 0 && (iM18209c = oq7Var4.m18209c() + 1) >= 0) {
                                                float fAbs2 = fM15944g2;
                                                float f7 = fAbs2;
                                                int i16 = 0;
                                                while (true) {
                                                    float fM18232Q2 = AbstractC3423or.m18232Q(f5, f6, i16 / (oq7Var4.m18209c() + 1));
                                                    float f8 = fM18232Q2 - fM15944g2;
                                                    if (Math.abs(f8) <= fAbs2) {
                                                        fAbs2 = Math.abs(f8);
                                                        f7 = fM18232Q2;
                                                    }
                                                    if (i16 != iM18209c) {
                                                        i16++;
                                                    } else {
                                                        fM15944g2 = f7;
                                                    }
                                                }
                                            }
                                            if (fM15944g2 == qc9Var6.m19861h()) {
                                                z5 = false;
                                            } else {
                                                long jM1136g3 = AbstractC0226d0.m1136g(qc9Var5.m19861h(), fM15944g2);
                                                long jM1136g4 = AbstractC0226d0.m1136g(qc9Var5.m19861h(), qc9Var6.m19861h());
                                                int i17 = wa9.f66568c;
                                                if (jM1136g3 != jM1136g4) {
                                                    oq7Var4.m18215i(wa9.m23825b(jM1136g3));
                                                    oq7Var4.m18214h(wa9.m23824a(jM1136g3));
                                                }
                                                oq7Var4.f54736b.mo0a();
                                            }
                                            return Boolean.valueOf(z5);
                                    }
                                }
                            });
                            break;
                        default:
                            if (!z4) {
                                bh4[] bh4VarArr3 = AbstractC0426f.f5022a;
                                tv8Var.mo3709d(AbstractC0424d.f5003j, xfaVar);
                            }
                            String strValueOf2 = String.valueOf(ss5.m21693T(oq7Var3.f54738d.m19861h() * 100.0f) / 100.0f);
                            bh4[] bh4VarArr4 = AbstractC0426f.f5022a;
                            C0427g c0427g2 = AbstractC0424d.f4995b;
                            bh4 bh4Var2 = AbstractC0426f.f5022a[0];
                            tv8Var.mo3709d(c0427g2, strValueOf2);
                            AbstractC0426f.m1862f(tv8Var, new vi3() { // from class: na9
                                @Override // p000.vi3
                                public final Object invoke(Object obj2) {
                                    int iM18210d;
                                    int iM18209c;
                                    int i13 = i11;
                                    boolean z5 = true;
                                    oq7 oq7Var4 = oq7Var3;
                                    h41 h41Var6 = h41Var5;
                                    float fFloatValue = ((Float) obj2).floatValue();
                                    switch (i13) {
                                        case 0:
                                            float f = h41Var6.f41765a;
                                            float f2 = h41Var6.f41766b;
                                            float fM15944g = l70.m15944g(fFloatValue, f, f2);
                                            int iM18210d2 = oq7Var4.m18210d();
                                            qc9 qc9Var3 = oq7Var4.f54739e;
                                            qc9 qc9Var4 = oq7Var4.f54738d;
                                            if (iM18210d2 > 0 && (iM18210d = oq7Var4.m18210d() + 1) >= 0) {
                                                float fAbs = fM15944g;
                                                float f3 = fAbs;
                                                int i14 = 0;
                                                while (true) {
                                                    float fM18232Q = AbstractC3423or.m18232Q(f, f2, i14 / (oq7Var4.m18210d() + 1));
                                                    float f4 = fM18232Q - fM15944g;
                                                    if (Math.abs(f4) <= fAbs) {
                                                        fAbs = Math.abs(f4);
                                                        f3 = fM18232Q;
                                                    }
                                                    if (i14 != iM18210d) {
                                                        i14++;
                                                    } else {
                                                        fM15944g = f3;
                                                    }
                                                }
                                            }
                                            if (fM15944g == qc9Var4.m19861h()) {
                                                z5 = false;
                                            } else {
                                                long jM1136g = AbstractC0226d0.m1136g(fM15944g, qc9Var3.m19861h());
                                                long jM1136g2 = AbstractC0226d0.m1136g(qc9Var4.m19861h(), qc9Var3.m19861h());
                                                int i15 = wa9.f66568c;
                                                if (jM1136g != jM1136g2) {
                                                    oq7Var4.m18215i(wa9.m23825b(jM1136g));
                                                    oq7Var4.m18214h(wa9.m23824a(jM1136g));
                                                }
                                                oq7Var4.f54736b.mo0a();
                                            }
                                            return Boolean.valueOf(z5);
                                        default:
                                            float f5 = h41Var6.f41765a;
                                            float f6 = h41Var6.f41766b;
                                            float fM15944g2 = l70.m15944g(fFloatValue, f5, f6);
                                            int iM18209c2 = oq7Var4.m18209c();
                                            qc9 qc9Var5 = oq7Var4.f54738d;
                                            qc9 qc9Var6 = oq7Var4.f54739e;
                                            if (iM18209c2 > 0 && (iM18209c = oq7Var4.m18209c() + 1) >= 0) {
                                                float fAbs2 = fM15944g2;
                                                float f7 = fAbs2;
                                                int i16 = 0;
                                                while (true) {
                                                    float fM18232Q2 = AbstractC3423or.m18232Q(f5, f6, i16 / (oq7Var4.m18209c() + 1));
                                                    float f8 = fM18232Q2 - fM15944g2;
                                                    if (Math.abs(f8) <= fAbs2) {
                                                        fAbs2 = Math.abs(f8);
                                                        f7 = fM18232Q2;
                                                    }
                                                    if (i16 != iM18209c) {
                                                        i16++;
                                                    } else {
                                                        fM15944g2 = f7;
                                                    }
                                                }
                                            }
                                            if (fM15944g2 == qc9Var6.m19861h()) {
                                                z5 = false;
                                            } else {
                                                long jM1136g3 = AbstractC0226d0.m1136g(qc9Var5.m19861h(), fM15944g2);
                                                long jM1136g4 = AbstractC0226d0.m1136g(qc9Var5.m19861h(), qc9Var6.m19861h());
                                                int i17 = wa9.f66568c;
                                                if (jM1136g3 != jM1136g4) {
                                                    oq7Var4.m18215i(wa9.m23825b(jM1136g3));
                                                    oq7Var4.m18214h(wa9.m23824a(jM1136g3));
                                                }
                                                oq7Var4.f54736b.mo0a();
                                            }
                                            return Boolean.valueOf(z5);
                                    }
                                }
                            });
                            break;
                    }
                    return xfaVar;
                }
            }).mo3161g(e16Var2), true, new fn7(qc9Var2.m19861h(), h41Var4, oq7Var.m18209c()));
            zM22120g = tj3Var.m22120g(strM11661w2);
            objM22097O = tj3Var.m22097O();
            if (zM22120g) {
                objM22097O = new ql4(strM11661w2, 24);
                tj3Var.m22131l0(objM22097O);
            } else {
                objM22097O = new ql4(strM11661w2, 24);
                tj3Var.m22131l0(objM22097O);
            }
            e16VarM17643c = nv8.m17643c(e16VarM17643c6, true, (vi3) objM22097O);
            i3 = oq7Var.f54735a;
            fM19861h = qc9Var.m19861h();
            fM19861h2 = qc9Var2.m19861h();
            zM18211e = oq7Var.m18211e();
            zM22124i = tj3Var.m22124i(oq7Var);
            objM22097O2 = tj3Var.m22097O();
            if (zM22124i) {
                objM22097O2 = new nq7(oq7Var, 4);
                tj3Var.m22131l0(objM22097O2);
            } else {
                objM22097O2 = new nq7(oq7Var, 4);
                tj3Var.m22131l0(objM22097O2);
            }
            vi3Var = (vi3) objM22097O2;
            if (i3 >= 0) {
                C3386nv.m17626m("steps should be >= 0");
                return;
            }
            zi3 zi3Var7 = zi3Var;
            z2 = z;
            e16 e16VarM19794x2 = AbstractC3489q9.m19794x(e16VarM17643c, new ua9(z2, h41Var, i3, zM18211e, false, fM19861h2, vi3Var, fM19861h, ui3Var));
            v56Var3 = v56Var2;
            e16 e16VarM23919n3 = wfb.m23919n(e16VarM19794x2, z2, v56Var3);
            ht5 ht5VarM19966d4 = qh0.m19966d(gc0Var, false);
            int iHashCode5 = Long.hashCode(tj3Var.f62385T);
            l77 l77VarM22132m5 = tj3Var.m22132m();
            e16 e16VarM1322c5 = AbstractC0287b.m1322c(tj3Var, e16VarM23919n3);
            tj3Var.m22119f0();
            if (tj3Var.f62384S) {
                tj3Var.m22130l(ui3Var2);
            } else {
                tj3Var.m22137o0();
            }
            oha.m18001g(tj3Var, zi3Var2, ht5VarM19966d4);
            oha.m18001g(tj3Var, zi3Var7, l77VarM22132m5);
            AbstractC3393o1.m17747v(iHashCode5, tj3Var, zi3Var4, tj3Var, vi3Var2);
            oha.m18001g(tj3Var, zi3Var5, e16VarM1322c5);
            oq7Var2 = oq7Var;
            aj3Var5 = aj3Var2;
            aj3Var5.invoke(oq7Var2, tj3Var, Integer.valueOf(i7 | ((i4 >> 15) & 112)));
            tj3Var.m22139q(true);
            e16 e16VarM15961x2 = l70.m15961x(b16Var, RangeSliderComponents.TRACK);
            ht5 ht5VarM19966d5 = qh0.m19966d(gc0Var, false);
            int iHashCode6 = Long.hashCode(tj3Var.f62385T);
            l77 l77VarM22132m6 = tj3Var.m22132m();
            e16 e16VarM1322c6 = AbstractC0287b.m1322c(tj3Var, e16VarM15961x2);
            tj3Var.m22119f0();
            if (tj3Var.f62384S) {
                tj3Var.m22130l(ui3Var2);
            } else {
                tj3Var.m22137o0();
            }
            oha.m18001g(tj3Var, zi3Var2, ht5VarM19966d5);
            oha.m18001g(tj3Var, zi3Var7, l77VarM22132m6);
            AbstractC3393o1.m17747v(iHashCode6, tj3Var, zi3Var4, tj3Var, vi3Var2);
            oha.m18001g(tj3Var, zi3Var5, e16VarM1322c6);
            aj3Var4 = aj3Var3;
            aj3Var4.invoke(oq7Var2, tj3Var, Integer.valueOf(i7 | ((i4 >> 18) & 112)));
            tj3Var.m22139q(true);
            tj3Var.m22139q(true);
        } else {
            oq7Var2 = oq7Var;
            aj3Var4 = aj3Var3;
            tj3Var = tj3Var2;
            v56Var3 = v56Var2;
            aj3Var5 = aj3Var2;
            tj3Var.m22102U();
        }
        x18 x18VarM22143u = tj3Var.m22143u();
        if (x18VarM22143u != null) {
            x18VarM22143u.f67642d = new g75(e16Var, oq7Var2, z2, v56Var, v56Var3, aj3Var, aj3Var5, aj3Var4, i);
        }
    }

    /* JADX WARN: Code duplicated, block: B:100:0x013e  */
    /* JADX WARN: Code duplicated, block: B:103:0x019f  */
    /* JADX WARN: Code duplicated, block: B:106:0x01af  */
    /* JADX WARN: Code duplicated, block: B:108:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:37:0x0063  */
    /* JADX WARN: Code duplicated, block: B:39:0x006b  */
    /* JADX WARN: Code duplicated, block: B:40:0x006e  */
    /* JADX WARN: Code duplicated, block: B:44:0x0077  */
    /* JADX WARN: Code duplicated, block: B:45:0x007d  */
    /* JADX WARN: Code duplicated, block: B:47:0x0085  */
    /* JADX WARN: Code duplicated, block: B:48:0x0088  */
    /* JADX WARN: Code duplicated, block: B:52:0x0091  */
    /* JADX WARN: Code duplicated, block: B:53:0x0095  */
    /* JADX WARN: Code duplicated, block: B:55:0x009d  */
    /* JADX WARN: Code duplicated, block: B:56:0x00a0  */
    /* JADX WARN: Code duplicated, block: B:60:0x00aa  */
    /* JADX WARN: Code duplicated, block: B:62:0x00b2  */
    /* JADX WARN: Code duplicated, block: B:63:0x00b5  */
    /* JADX WARN: Code duplicated, block: B:67:0x00cf  */
    /* JADX WARN: Code duplicated, block: B:68:0x00d2  */
    /* JADX WARN: Code duplicated, block: B:71:0x00dc  */
    /* JADX WARN: Code duplicated, block: B:73:0x00e9  */
    /* JADX WARN: Code duplicated, block: B:85:0x010b A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:86:0x010d  */
    /* JADX WARN: Code duplicated, block: B:89:0x0113  */
    /* JADX WARN: Code duplicated, block: B:90:0x0120  */
    /* JADX WARN: Code duplicated, block: B:92:0x0124  */
    /* JADX WARN: Code duplicated, block: B:94:0x0128  */
    /* JADX WARN: Code duplicated, block: B:97:0x012e  */
    /* JADX INFO: renamed from: c */
    public static final void m1132c(final float f, final vi3 vi3Var, final e16 e16Var, boolean z, h41 h41Var, int i, ui3 ui3Var, fa9 fa9Var, v56 v56Var, ye1 ye1Var, final int i2, final int i3) {
        int i4;
        final boolean z2;
        final h41 h41Var2;
        int i5;
        int i6;
        int i7;
        int i8;
        int i9;
        int i10;
        ui3 ui3Var2;
        int i11;
        int i12;
        fa9 fa9VarM16039f;
        int i13;
        boolean z3;
        tj3 tj3Var;
        final int i14;
        final fa9 fa9Var2;
        final ui3 ui3Var3;
        final v56 v56Var2;
        x18 x18VarM22143u;
        int i15;
        Object objM22097O;
        v56 v56Var3;
        tj3 tj3Var2 = (tj3) ye1Var;
        tj3Var2.m22115d0(-202044027);
        if ((i2 & 6) == 0) {
            i4 = (tj3Var2.m22114d(f) ? 4 : 2) | i2;
        } else {
            i4 = i2;
        }
        if ((i2 & 48) == 0) {
            i4 |= tj3Var2.m22124i(vi3Var) ? 32 : 16;
        }
        if ((i2 & 384) == 0) {
            i4 |= tj3Var2.m22120g(e16Var) ? 256 : 128;
        }
        int i16 = i3 & 8;
        if (i16 == 0) {
            if ((i2 & 3072) == 0) {
                z2 = z;
                i4 |= tj3Var2.m22122h(z2) ? 2048 : 1024;
            }
            if ((i3 & 16) == 0) {
                h41Var2 = h41Var;
                int i17 = tj3Var2.m22120g(h41Var2) ? 16384 : 8192;
                i5 = i4 | i17;
                i6 = i3 & 32;
                if (i6 != 0) {
                    i9 = i5 | 196608;
                    i7 = i;
                } else {
                    i7 = i;
                    if (tj3Var2.m22116e(i7)) {
                        i8 = 131072;
                    } else {
                        i8 = 65536;
                    }
                    i9 = i5 | i8;
                }
                i10 = i3 & 64;
                if (i10 != 0) {
                    i12 = i9 | 1572864;
                    ui3Var2 = ui3Var;
                } else {
                    ui3Var2 = ui3Var;
                    if (tj3Var2.m22124i(ui3Var2)) {
                        i11 = 1048576;
                    } else {
                        i11 = 524288;
                    }
                    i12 = i9 | i11;
                }
                if ((i3 & 128) == 0) {
                    fa9VarM16039f = fa9Var;
                    int i18 = tj3Var2.m22120g(fa9VarM16039f) ? 8388608 : 4194304;
                    i13 = i12 | i18 | 100663296;
                    if ((i13 & 38347923) != 38347922) {
                        z3 = true;
                    } else {
                        z3 = false;
                    }
                    if (tj3Var2.m22099R(i13 & 1, z3)) {
                        tj3Var2.m22104W();
                        if ((i2 & 1) != 0 || tj3Var2.m22084B()) {
                            if (i16 != 0) {
                                z2 = true;
                            }
                            if ((i3 & 16) != 0) {
                                h41Var2 = new h41(0.0f, 1.0f);
                                i15 = i13 & (-57345);
                            }
                            if (i6 != 0) {
                                i15 = i13;
                                i7 = 0;
                            }
                            if (i10 != 0) {
                                ui3Var2 = null;
                            }
                            if ((i3 & 128) != 0) {
                                la9 la9Var = la9.f49371a;
                                i15 &= -29360129;
                                fa9VarM16039f = la9.m16039f(tj3Var2);
                            }
                            objM22097O = tj3Var2.m22097O();
                            if (objM22097O == we1.f66679a) {
                                objM22097O = AbstractC3393o1.m17729d(tj3Var2);
                            }
                            v56Var3 = (v56) objM22097O;
                        } else {
                            tj3Var2.m22102U();
                            i15 = (i3 & 16) != 0 ? i13 & (-57345) : i13;
                            if ((i3 & 128) != 0) {
                                i15 &= -29360129;
                            }
                            v56Var3 = v56Var;
                        }
                        h41 h41Var3 = h41Var2;
                        int i19 = i7;
                        ui3 ui3Var4 = ui3Var2;
                        boolean z4 = z2;
                        tj3Var2.m22140r();
                        int i20 = i15 >> 6;
                        tj3Var = tj3Var2;
                        v56 v56Var4 = v56Var3;
                        fa9 fa9Var3 = fa9VarM16039f;
                        m1133d(f, vi3Var, e16Var, z4, ui3Var4, fa9Var3, v56Var4, i19, ci8.m4703P(308249025, new xh3(v56Var3, fa9VarM16039f, z4, 4), tj3Var2), ci8.m4703P(-1843234110, new C3187kk(z4, fa9VarM16039f, 3), tj3Var2), h41Var3, tj3Var, (i15 & 14) | 905969664 | (i15 & 112) | (i15 & 896) | (i15 & 7168) | (57344 & i20) | (i20 & 458752) | 1572864 | (29360128 & (i15 << 6)), (i15 >> 12) & 14, 0);
                        z2 = z4;
                        ui3Var3 = ui3Var4;
                        fa9Var2 = fa9Var3;
                        v56Var2 = v56Var4;
                        i14 = i19;
                        h41Var2 = h41Var3;
                    } else {
                        tj3Var = tj3Var2;
                        tj3Var.m22102U();
                        i14 = i7;
                        fa9Var2 = fa9VarM16039f;
                        ui3Var3 = ui3Var2;
                        v56Var2 = v56Var;
                    }
                    x18VarM22143u = tj3Var.m22143u();
                    if (x18VarM22143u != null) {
                        x18VarM22143u.f67642d = new zi3() { // from class: ma9
                            @Override // p000.zi3
                            public final Object invoke(Object obj, Object obj2) {
                                ((Integer) obj2).getClass();
                                AbstractC0226d0.m1132c(f, vi3Var, e16Var, z2, h41Var2, i14, ui3Var3, fa9Var2, v56Var2, (ye1) obj, pk9.m19383z(i2 | 1), i3);
                                return xfa.f68157a;
                            }
                        };
                    }
                }
                fa9VarM16039f = fa9Var;
                i13 = i12 | i18 | 100663296;
                if ((i13 & 38347923) != 38347922) {
                    z3 = true;
                } else {
                    z3 = false;
                }
                if (tj3Var2.m22099R(i13 & 1, z3)) {
                    tj3Var2.m22104W();
                    if ((i2 & 1) != 0) {
                        if (i16 != 0) {
                            z2 = true;
                        }
                        if ((i3 & 16) != 0) {
                            h41Var2 = new h41(0.0f, 1.0f);
                            i15 = i13 & (-57345);
                        }
                        if (i6 != 0) {
                            i15 = i13;
                            i7 = 0;
                        }
                        if (i10 != 0) {
                            ui3Var2 = null;
                        }
                        if ((i3 & 128) != 0) {
                            la9 la9Var2 = la9.f49371a;
                            i15 &= -29360129;
                            fa9VarM16039f = la9.m16039f(tj3Var2);
                        }
                        objM22097O = tj3Var2.m22097O();
                        if (objM22097O == we1.f66679a) {
                            objM22097O = AbstractC3393o1.m17729d(tj3Var2);
                        }
                        v56Var3 = (v56) objM22097O;
                    } else {
                        if (i16 != 0) {
                            z2 = true;
                        }
                        if ((i3 & 16) != 0) {
                            h41Var2 = new h41(0.0f, 1.0f);
                            i15 = i13 & (-57345);
                        }
                        if (i6 != 0) {
                            i15 = i13;
                            i7 = 0;
                        }
                        if (i10 != 0) {
                            ui3Var2 = null;
                        }
                        if ((i3 & 128) != 0) {
                            la9 la9Var3 = la9.f49371a;
                            i15 &= -29360129;
                            fa9VarM16039f = la9.m16039f(tj3Var2);
                        }
                        objM22097O = tj3Var2.m22097O();
                        if (objM22097O == we1.f66679a) {
                            objM22097O = AbstractC3393o1.m17729d(tj3Var2);
                        }
                        v56Var3 = (v56) objM22097O;
                    }
                    h41 h41Var4 = h41Var2;
                    int i110 = i7;
                    ui3 ui3Var5 = ui3Var2;
                    boolean z5 = z2;
                    tj3Var2.m22140r();
                    int i21 = i15 >> 6;
                    tj3Var = tj3Var2;
                    v56 v56Var5 = v56Var3;
                    fa9 fa9Var4 = fa9VarM16039f;
                    m1133d(f, vi3Var, e16Var, z5, ui3Var5, fa9Var4, v56Var5, i110, ci8.m4703P(308249025, new xh3(v56Var3, fa9VarM16039f, z5, 4), tj3Var2), ci8.m4703P(-1843234110, new C3187kk(z5, fa9VarM16039f, 3), tj3Var2), h41Var4, tj3Var, (i15 & 14) | 905969664 | (i15 & 112) | (i15 & 896) | (i15 & 7168) | (57344 & i21) | (i21 & 458752) | 1572864 | (29360128 & (i15 << 6)), (i15 >> 12) & 14, 0);
                    z2 = z5;
                    ui3Var3 = ui3Var5;
                    fa9Var2 = fa9Var4;
                    v56Var2 = v56Var5;
                    i14 = i110;
                    h41Var2 = h41Var4;
                } else {
                    tj3Var = tj3Var2;
                    tj3Var.m22102U();
                    i14 = i7;
                    fa9Var2 = fa9VarM16039f;
                    ui3Var3 = ui3Var2;
                    v56Var2 = v56Var;
                }
                x18VarM22143u = tj3Var.m22143u();
                if (x18VarM22143u != null) {
                    x18VarM22143u.f67642d = new zi3() { // from class: ma9
                        @Override // p000.zi3
                        public final Object invoke(Object obj, Object obj2) {
                            ((Integer) obj2).getClass();
                            AbstractC0226d0.m1132c(f, vi3Var, e16Var, z2, h41Var2, i14, ui3Var3, fa9Var2, v56Var2, (ye1) obj, pk9.m19383z(i2 | 1), i3);
                            return xfa.f68157a;
                        }
                    };
                }
            }
            h41Var2 = h41Var;
            i5 = i4 | i17;
            i6 = i3 & 32;
            if (i6 != 0) {
                i9 = i5 | 196608;
                i7 = i;
            } else {
                i7 = i;
                if (tj3Var2.m22116e(i7)) {
                    i8 = 131072;
                } else {
                    i8 = 65536;
                }
                i9 = i5 | i8;
            }
            i10 = i3 & 64;
            if (i10 != 0) {
                i12 = i9 | 1572864;
                ui3Var2 = ui3Var;
            } else {
                ui3Var2 = ui3Var;
                if (tj3Var2.m22124i(ui3Var2)) {
                    i11 = 1048576;
                } else {
                    i11 = 524288;
                }
                i12 = i9 | i11;
            }
            if ((i3 & 128) == 0) {
                fa9VarM16039f = fa9Var;
                if (tj3Var2.m22120g(fa9VarM16039f)) {
                }
                i13 = i12 | i18 | 100663296;
                if ((i13 & 38347923) != 38347922) {
                    z3 = true;
                } else {
                    z3 = false;
                }
                if (tj3Var2.m22099R(i13 & 1, z3)) {
                    tj3Var2.m22104W();
                    if ((i2 & 1) != 0) {
                        if (i16 != 0) {
                            z2 = true;
                        }
                        if ((i3 & 16) != 0) {
                            h41Var2 = new h41(0.0f, 1.0f);
                            i15 = i13 & (-57345);
                        }
                        if (i6 != 0) {
                            i15 = i13;
                            i7 = 0;
                        }
                        if (i10 != 0) {
                            ui3Var2 = null;
                        }
                        if ((i3 & 128) != 0) {
                            la9 la9Var4 = la9.f49371a;
                            i15 &= -29360129;
                            fa9VarM16039f = la9.m16039f(tj3Var2);
                        }
                        objM22097O = tj3Var2.m22097O();
                        if (objM22097O == we1.f66679a) {
                            objM22097O = AbstractC3393o1.m17729d(tj3Var2);
                        }
                        v56Var3 = (v56) objM22097O;
                    } else {
                        if (i16 != 0) {
                            z2 = true;
                        }
                        if ((i3 & 16) != 0) {
                            h41Var2 = new h41(0.0f, 1.0f);
                            i15 = i13 & (-57345);
                        }
                        if (i6 != 0) {
                            i15 = i13;
                            i7 = 0;
                        }
                        if (i10 != 0) {
                            ui3Var2 = null;
                        }
                        if ((i3 & 128) != 0) {
                            la9 la9Var5 = la9.f49371a;
                            i15 &= -29360129;
                            fa9VarM16039f = la9.m16039f(tj3Var2);
                        }
                        objM22097O = tj3Var2.m22097O();
                        if (objM22097O == we1.f66679a) {
                            objM22097O = AbstractC3393o1.m17729d(tj3Var2);
                        }
                        v56Var3 = (v56) objM22097O;
                    }
                    h41 h41Var5 = h41Var2;
                    int i111 = i7;
                    ui3 ui3Var6 = ui3Var2;
                    boolean z6 = z2;
                    tj3Var2.m22140r();
                    int i22 = i15 >> 6;
                    tj3Var = tj3Var2;
                    v56 v56Var6 = v56Var3;
                    fa9 fa9Var5 = fa9VarM16039f;
                    m1133d(f, vi3Var, e16Var, z6, ui3Var6, fa9Var5, v56Var6, i111, ci8.m4703P(308249025, new xh3(v56Var3, fa9VarM16039f, z6, 4), tj3Var2), ci8.m4703P(-1843234110, new C3187kk(z6, fa9VarM16039f, 3), tj3Var2), h41Var5, tj3Var, (i15 & 14) | 905969664 | (i15 & 112) | (i15 & 896) | (i15 & 7168) | (57344 & i22) | (i22 & 458752) | 1572864 | (29360128 & (i15 << 6)), (i15 >> 12) & 14, 0);
                    z2 = z6;
                    ui3Var3 = ui3Var6;
                    fa9Var2 = fa9Var5;
                    v56Var2 = v56Var6;
                    i14 = i111;
                    h41Var2 = h41Var5;
                } else {
                    tj3Var = tj3Var2;
                    tj3Var.m22102U();
                    i14 = i7;
                    fa9Var2 = fa9VarM16039f;
                    ui3Var3 = ui3Var2;
                    v56Var2 = v56Var;
                }
                x18VarM22143u = tj3Var.m22143u();
                if (x18VarM22143u != null) {
                    x18VarM22143u.f67642d = new zi3() { // from class: ma9
                        @Override // p000.zi3
                        public final Object invoke(Object obj, Object obj2) {
                            ((Integer) obj2).getClass();
                            AbstractC0226d0.m1132c(f, vi3Var, e16Var, z2, h41Var2, i14, ui3Var3, fa9Var2, v56Var2, (ye1) obj, pk9.m19383z(i2 | 1), i3);
                            return xfa.f68157a;
                        }
                    };
                }
            }
            fa9VarM16039f = fa9Var;
            i13 = i12 | i18 | 100663296;
            if ((i13 & 38347923) != 38347922) {
                z3 = true;
            } else {
                z3 = false;
            }
            if (tj3Var2.m22099R(i13 & 1, z3)) {
                tj3Var2.m22104W();
                if ((i2 & 1) != 0) {
                    if (i16 != 0) {
                        z2 = true;
                    }
                    if ((i3 & 16) != 0) {
                        h41Var2 = new h41(0.0f, 1.0f);
                        i15 = i13 & (-57345);
                    }
                    if (i6 != 0) {
                        i15 = i13;
                        i7 = 0;
                    }
                    if (i10 != 0) {
                        ui3Var2 = null;
                    }
                    if ((i3 & 128) != 0) {
                        la9 la9Var6 = la9.f49371a;
                        i15 &= -29360129;
                        fa9VarM16039f = la9.m16039f(tj3Var2);
                    }
                    objM22097O = tj3Var2.m22097O();
                    if (objM22097O == we1.f66679a) {
                        objM22097O = AbstractC3393o1.m17729d(tj3Var2);
                    }
                    v56Var3 = (v56) objM22097O;
                } else {
                    if (i16 != 0) {
                        z2 = true;
                    }
                    if ((i3 & 16) != 0) {
                        h41Var2 = new h41(0.0f, 1.0f);
                        i15 = i13 & (-57345);
                    }
                    if (i6 != 0) {
                        i15 = i13;
                        i7 = 0;
                    }
                    if (i10 != 0) {
                        ui3Var2 = null;
                    }
                    if ((i3 & 128) != 0) {
                        la9 la9Var7 = la9.f49371a;
                        i15 &= -29360129;
                        fa9VarM16039f = la9.m16039f(tj3Var2);
                    }
                    objM22097O = tj3Var2.m22097O();
                    if (objM22097O == we1.f66679a) {
                        objM22097O = AbstractC3393o1.m17729d(tj3Var2);
                    }
                    v56Var3 = (v56) objM22097O;
                }
                h41 h41Var6 = h41Var2;
                int i112 = i7;
                ui3 ui3Var7 = ui3Var2;
                boolean z7 = z2;
                tj3Var2.m22140r();
                int i23 = i15 >> 6;
                tj3Var = tj3Var2;
                v56 v56Var7 = v56Var3;
                fa9 fa9Var6 = fa9VarM16039f;
                m1133d(f, vi3Var, e16Var, z7, ui3Var7, fa9Var6, v56Var7, i112, ci8.m4703P(308249025, new xh3(v56Var3, fa9VarM16039f, z7, 4), tj3Var2), ci8.m4703P(-1843234110, new C3187kk(z7, fa9VarM16039f, 3), tj3Var2), h41Var6, tj3Var, (i15 & 14) | 905969664 | (i15 & 112) | (i15 & 896) | (i15 & 7168) | (57344 & i23) | (i23 & 458752) | 1572864 | (29360128 & (i15 << 6)), (i15 >> 12) & 14, 0);
                z2 = z7;
                ui3Var3 = ui3Var7;
                fa9Var2 = fa9Var6;
                v56Var2 = v56Var7;
                i14 = i112;
                h41Var2 = h41Var6;
            } else {
                tj3Var = tj3Var2;
                tj3Var.m22102U();
                i14 = i7;
                fa9Var2 = fa9VarM16039f;
                ui3Var3 = ui3Var2;
                v56Var2 = v56Var;
            }
            x18VarM22143u = tj3Var.m22143u();
            if (x18VarM22143u != null) {
                x18VarM22143u.f67642d = new zi3() { // from class: ma9
                    @Override // p000.zi3
                    public final Object invoke(Object obj, Object obj2) {
                        ((Integer) obj2).getClass();
                        AbstractC0226d0.m1132c(f, vi3Var, e16Var, z2, h41Var2, i14, ui3Var3, fa9Var2, v56Var2, (ye1) obj, pk9.m19383z(i2 | 1), i3);
                        return xfa.f68157a;
                    }
                };
            }
        }
        i4 |= 3072;
        z2 = z;
        if ((i3 & 16) == 0) {
            h41Var2 = h41Var;
            if (tj3Var2.m22120g(h41Var2)) {
            }
            i5 = i4 | i17;
            i6 = i3 & 32;
            if (i6 != 0) {
                i9 = i5 | 196608;
                i7 = i;
            } else {
                i7 = i;
                if (tj3Var2.m22116e(i7)) {
                    i8 = 131072;
                } else {
                    i8 = 65536;
                }
                i9 = i5 | i8;
            }
            i10 = i3 & 64;
            if (i10 != 0) {
                i12 = i9 | 1572864;
                ui3Var2 = ui3Var;
            } else {
                ui3Var2 = ui3Var;
                if (tj3Var2.m22124i(ui3Var2)) {
                    i11 = 1048576;
                } else {
                    i11 = 524288;
                }
                i12 = i9 | i11;
            }
            if ((i3 & 128) == 0) {
                fa9VarM16039f = fa9Var;
                if (tj3Var2.m22120g(fa9VarM16039f)) {
                }
                i13 = i12 | i18 | 100663296;
                if ((i13 & 38347923) != 38347922) {
                    z3 = true;
                } else {
                    z3 = false;
                }
                if (tj3Var2.m22099R(i13 & 1, z3)) {
                    tj3Var2.m22104W();
                    if ((i2 & 1) != 0) {
                        if (i16 != 0) {
                            z2 = true;
                        }
                        if ((i3 & 16) != 0) {
                            h41Var2 = new h41(0.0f, 1.0f);
                            i15 = i13 & (-57345);
                        }
                        if (i6 != 0) {
                            i15 = i13;
                            i7 = 0;
                        }
                        if (i10 != 0) {
                            ui3Var2 = null;
                        }
                        if ((i3 & 128) != 0) {
                            la9 la9Var8 = la9.f49371a;
                            i15 &= -29360129;
                            fa9VarM16039f = la9.m16039f(tj3Var2);
                        }
                        objM22097O = tj3Var2.m22097O();
                        if (objM22097O == we1.f66679a) {
                            objM22097O = AbstractC3393o1.m17729d(tj3Var2);
                        }
                        v56Var3 = (v56) objM22097O;
                    } else {
                        if (i16 != 0) {
                            z2 = true;
                        }
                        if ((i3 & 16) != 0) {
                            h41Var2 = new h41(0.0f, 1.0f);
                            i15 = i13 & (-57345);
                        }
                        if (i6 != 0) {
                            i15 = i13;
                            i7 = 0;
                        }
                        if (i10 != 0) {
                            ui3Var2 = null;
                        }
                        if ((i3 & 128) != 0) {
                            la9 la9Var9 = la9.f49371a;
                            i15 &= -29360129;
                            fa9VarM16039f = la9.m16039f(tj3Var2);
                        }
                        objM22097O = tj3Var2.m22097O();
                        if (objM22097O == we1.f66679a) {
                            objM22097O = AbstractC3393o1.m17729d(tj3Var2);
                        }
                        v56Var3 = (v56) objM22097O;
                    }
                    h41 h41Var7 = h41Var2;
                    int i113 = i7;
                    ui3 ui3Var8 = ui3Var2;
                    boolean z8 = z2;
                    tj3Var2.m22140r();
                    int i24 = i15 >> 6;
                    tj3Var = tj3Var2;
                    v56 v56Var8 = v56Var3;
                    fa9 fa9Var7 = fa9VarM16039f;
                    m1133d(f, vi3Var, e16Var, z8, ui3Var8, fa9Var7, v56Var8, i113, ci8.m4703P(308249025, new xh3(v56Var3, fa9VarM16039f, z8, 4), tj3Var2), ci8.m4703P(-1843234110, new C3187kk(z8, fa9VarM16039f, 3), tj3Var2), h41Var7, tj3Var, (i15 & 14) | 905969664 | (i15 & 112) | (i15 & 896) | (i15 & 7168) | (57344 & i24) | (i24 & 458752) | 1572864 | (29360128 & (i15 << 6)), (i15 >> 12) & 14, 0);
                    z2 = z8;
                    ui3Var3 = ui3Var8;
                    fa9Var2 = fa9Var7;
                    v56Var2 = v56Var8;
                    i14 = i113;
                    h41Var2 = h41Var7;
                } else {
                    tj3Var = tj3Var2;
                    tj3Var.m22102U();
                    i14 = i7;
                    fa9Var2 = fa9VarM16039f;
                    ui3Var3 = ui3Var2;
                    v56Var2 = v56Var;
                }
                x18VarM22143u = tj3Var.m22143u();
                if (x18VarM22143u != null) {
                    x18VarM22143u.f67642d = new zi3() { // from class: ma9
                        @Override // p000.zi3
                        public final Object invoke(Object obj, Object obj2) {
                            ((Integer) obj2).getClass();
                            AbstractC0226d0.m1132c(f, vi3Var, e16Var, z2, h41Var2, i14, ui3Var3, fa9Var2, v56Var2, (ye1) obj, pk9.m19383z(i2 | 1), i3);
                            return xfa.f68157a;
                        }
                    };
                }
            }
            fa9VarM16039f = fa9Var;
            i13 = i12 | i18 | 100663296;
            if ((i13 & 38347923) != 38347922) {
                z3 = true;
            } else {
                z3 = false;
            }
            if (tj3Var2.m22099R(i13 & 1, z3)) {
                tj3Var2.m22104W();
                if ((i2 & 1) != 0) {
                    if (i16 != 0) {
                        z2 = true;
                    }
                    if ((i3 & 16) != 0) {
                        h41Var2 = new h41(0.0f, 1.0f);
                        i15 = i13 & (-57345);
                    }
                    if (i6 != 0) {
                        i15 = i13;
                        i7 = 0;
                    }
                    if (i10 != 0) {
                        ui3Var2 = null;
                    }
                    if ((i3 & 128) != 0) {
                        la9 la9Var10 = la9.f49371a;
                        i15 &= -29360129;
                        fa9VarM16039f = la9.m16039f(tj3Var2);
                    }
                    objM22097O = tj3Var2.m22097O();
                    if (objM22097O == we1.f66679a) {
                        objM22097O = AbstractC3393o1.m17729d(tj3Var2);
                    }
                    v56Var3 = (v56) objM22097O;
                } else {
                    if (i16 != 0) {
                        z2 = true;
                    }
                    if ((i3 & 16) != 0) {
                        h41Var2 = new h41(0.0f, 1.0f);
                        i15 = i13 & (-57345);
                    }
                    if (i6 != 0) {
                        i15 = i13;
                        i7 = 0;
                    }
                    if (i10 != 0) {
                        ui3Var2 = null;
                    }
                    if ((i3 & 128) != 0) {
                        la9 la9Var11 = la9.f49371a;
                        i15 &= -29360129;
                        fa9VarM16039f = la9.m16039f(tj3Var2);
                    }
                    objM22097O = tj3Var2.m22097O();
                    if (objM22097O == we1.f66679a) {
                        objM22097O = AbstractC3393o1.m17729d(tj3Var2);
                    }
                    v56Var3 = (v56) objM22097O;
                }
                h41 h41Var8 = h41Var2;
                int i114 = i7;
                ui3 ui3Var9 = ui3Var2;
                boolean z9 = z2;
                tj3Var2.m22140r();
                int i25 = i15 >> 6;
                tj3Var = tj3Var2;
                v56 v56Var9 = v56Var3;
                fa9 fa9Var8 = fa9VarM16039f;
                m1133d(f, vi3Var, e16Var, z9, ui3Var9, fa9Var8, v56Var9, i114, ci8.m4703P(308249025, new xh3(v56Var3, fa9VarM16039f, z9, 4), tj3Var2), ci8.m4703P(-1843234110, new C3187kk(z9, fa9VarM16039f, 3), tj3Var2), h41Var8, tj3Var, (i15 & 14) | 905969664 | (i15 & 112) | (i15 & 896) | (i15 & 7168) | (57344 & i25) | (i25 & 458752) | 1572864 | (29360128 & (i15 << 6)), (i15 >> 12) & 14, 0);
                z2 = z9;
                ui3Var3 = ui3Var9;
                fa9Var2 = fa9Var8;
                v56Var2 = v56Var9;
                i14 = i114;
                h41Var2 = h41Var8;
            } else {
                tj3Var = tj3Var2;
                tj3Var.m22102U();
                i14 = i7;
                fa9Var2 = fa9VarM16039f;
                ui3Var3 = ui3Var2;
                v56Var2 = v56Var;
            }
            x18VarM22143u = tj3Var.m22143u();
            if (x18VarM22143u != null) {
                x18VarM22143u.f67642d = new zi3() { // from class: ma9
                    @Override // p000.zi3
                    public final Object invoke(Object obj, Object obj2) {
                        ((Integer) obj2).getClass();
                        AbstractC0226d0.m1132c(f, vi3Var, e16Var, z2, h41Var2, i14, ui3Var3, fa9Var2, v56Var2, (ye1) obj, pk9.m19383z(i2 | 1), i3);
                        return xfa.f68157a;
                    }
                };
            }
        }
        h41Var2 = h41Var;
        i5 = i4 | i17;
        i6 = i3 & 32;
        if (i6 != 0) {
            i9 = i5 | 196608;
            i7 = i;
        } else {
            i7 = i;
            if (tj3Var2.m22116e(i7)) {
                i8 = 131072;
            } else {
                i8 = 65536;
            }
            i9 = i5 | i8;
        }
        i10 = i3 & 64;
        if (i10 != 0) {
            i12 = i9 | 1572864;
            ui3Var2 = ui3Var;
        } else {
            ui3Var2 = ui3Var;
            if (tj3Var2.m22124i(ui3Var2)) {
                i11 = 1048576;
            } else {
                i11 = 524288;
            }
            i12 = i9 | i11;
        }
        if ((i3 & 128) == 0) {
            fa9VarM16039f = fa9Var;
            if (tj3Var2.m22120g(fa9VarM16039f)) {
            }
            i13 = i12 | i18 | 100663296;
            if ((i13 & 38347923) != 38347922) {
                z3 = true;
            } else {
                z3 = false;
            }
            if (tj3Var2.m22099R(i13 & 1, z3)) {
                tj3Var2.m22104W();
                if ((i2 & 1) != 0) {
                    if (i16 != 0) {
                        z2 = true;
                    }
                    if ((i3 & 16) != 0) {
                        h41Var2 = new h41(0.0f, 1.0f);
                        i15 = i13 & (-57345);
                    }
                    if (i6 != 0) {
                        i15 = i13;
                        i7 = 0;
                    }
                    if (i10 != 0) {
                        ui3Var2 = null;
                    }
                    if ((i3 & 128) != 0) {
                        la9 la9Var12 = la9.f49371a;
                        i15 &= -29360129;
                        fa9VarM16039f = la9.m16039f(tj3Var2);
                    }
                    objM22097O = tj3Var2.m22097O();
                    if (objM22097O == we1.f66679a) {
                        objM22097O = AbstractC3393o1.m17729d(tj3Var2);
                    }
                    v56Var3 = (v56) objM22097O;
                } else {
                    if (i16 != 0) {
                        z2 = true;
                    }
                    if ((i3 & 16) != 0) {
                        h41Var2 = new h41(0.0f, 1.0f);
                        i15 = i13 & (-57345);
                    }
                    if (i6 != 0) {
                        i15 = i13;
                        i7 = 0;
                    }
                    if (i10 != 0) {
                        ui3Var2 = null;
                    }
                    if ((i3 & 128) != 0) {
                        la9 la9Var13 = la9.f49371a;
                        i15 &= -29360129;
                        fa9VarM16039f = la9.m16039f(tj3Var2);
                    }
                    objM22097O = tj3Var2.m22097O();
                    if (objM22097O == we1.f66679a) {
                        objM22097O = AbstractC3393o1.m17729d(tj3Var2);
                    }
                    v56Var3 = (v56) objM22097O;
                }
                h41 h41Var9 = h41Var2;
                int i115 = i7;
                ui3 ui3Var10 = ui3Var2;
                boolean z10 = z2;
                tj3Var2.m22140r();
                int i26 = i15 >> 6;
                tj3Var = tj3Var2;
                v56 v56Var10 = v56Var3;
                fa9 fa9Var9 = fa9VarM16039f;
                m1133d(f, vi3Var, e16Var, z10, ui3Var10, fa9Var9, v56Var10, i115, ci8.m4703P(308249025, new xh3(v56Var3, fa9VarM16039f, z10, 4), tj3Var2), ci8.m4703P(-1843234110, new C3187kk(z10, fa9VarM16039f, 3), tj3Var2), h41Var9, tj3Var, (i15 & 14) | 905969664 | (i15 & 112) | (i15 & 896) | (i15 & 7168) | (57344 & i26) | (i26 & 458752) | 1572864 | (29360128 & (i15 << 6)), (i15 >> 12) & 14, 0);
                z2 = z10;
                ui3Var3 = ui3Var10;
                fa9Var2 = fa9Var9;
                v56Var2 = v56Var10;
                i14 = i115;
                h41Var2 = h41Var9;
            } else {
                tj3Var = tj3Var2;
                tj3Var.m22102U();
                i14 = i7;
                fa9Var2 = fa9VarM16039f;
                ui3Var3 = ui3Var2;
                v56Var2 = v56Var;
            }
            x18VarM22143u = tj3Var.m22143u();
            if (x18VarM22143u != null) {
                x18VarM22143u.f67642d = new zi3() { // from class: ma9
                    @Override // p000.zi3
                    public final Object invoke(Object obj, Object obj2) {
                        ((Integer) obj2).getClass();
                        AbstractC0226d0.m1132c(f, vi3Var, e16Var, z2, h41Var2, i14, ui3Var3, fa9Var2, v56Var2, (ye1) obj, pk9.m19383z(i2 | 1), i3);
                        return xfa.f68157a;
                    }
                };
            }
        }
        fa9VarM16039f = fa9Var;
        i13 = i12 | i18 | 100663296;
        if ((i13 & 38347923) != 38347922) {
            z3 = true;
        } else {
            z3 = false;
        }
        if (tj3Var2.m22099R(i13 & 1, z3)) {
            tj3Var2.m22104W();
            if ((i2 & 1) != 0) {
                if (i16 != 0) {
                    z2 = true;
                }
                if ((i3 & 16) != 0) {
                    h41Var2 = new h41(0.0f, 1.0f);
                    i15 = i13 & (-57345);
                }
                if (i6 != 0) {
                    i15 = i13;
                    i7 = 0;
                }
                if (i10 != 0) {
                    ui3Var2 = null;
                }
                if ((i3 & 128) != 0) {
                    la9 la9Var14 = la9.f49371a;
                    i15 &= -29360129;
                    fa9VarM16039f = la9.m16039f(tj3Var2);
                }
                objM22097O = tj3Var2.m22097O();
                if (objM22097O == we1.f66679a) {
                    objM22097O = AbstractC3393o1.m17729d(tj3Var2);
                }
                v56Var3 = (v56) objM22097O;
            } else {
                if (i16 != 0) {
                    z2 = true;
                }
                if ((i3 & 16) != 0) {
                    h41Var2 = new h41(0.0f, 1.0f);
                    i15 = i13 & (-57345);
                }
                if (i6 != 0) {
                    i15 = i13;
                    i7 = 0;
                }
                if (i10 != 0) {
                    ui3Var2 = null;
                }
                if ((i3 & 128) != 0) {
                    la9 la9Var15 = la9.f49371a;
                    i15 &= -29360129;
                    fa9VarM16039f = la9.m16039f(tj3Var2);
                }
                objM22097O = tj3Var2.m22097O();
                if (objM22097O == we1.f66679a) {
                    objM22097O = AbstractC3393o1.m17729d(tj3Var2);
                }
                v56Var3 = (v56) objM22097O;
            }
            h41 h41Var10 = h41Var2;
            int i116 = i7;
            ui3 ui3Var11 = ui3Var2;
            boolean z11 = z2;
            tj3Var2.m22140r();
            int i27 = i15 >> 6;
            tj3Var = tj3Var2;
            v56 v56Var11 = v56Var3;
            fa9 fa9Var10 = fa9VarM16039f;
            m1133d(f, vi3Var, e16Var, z11, ui3Var11, fa9Var10, v56Var11, i116, ci8.m4703P(308249025, new xh3(v56Var3, fa9VarM16039f, z11, 4), tj3Var2), ci8.m4703P(-1843234110, new C3187kk(z11, fa9VarM16039f, 3), tj3Var2), h41Var10, tj3Var, (i15 & 14) | 905969664 | (i15 & 112) | (i15 & 896) | (i15 & 7168) | (57344 & i27) | (i27 & 458752) | 1572864 | (29360128 & (i15 << 6)), (i15 >> 12) & 14, 0);
            z2 = z11;
            ui3Var3 = ui3Var11;
            fa9Var2 = fa9Var10;
            v56Var2 = v56Var11;
            i14 = i116;
            h41Var2 = h41Var10;
        } else {
            tj3Var = tj3Var2;
            tj3Var.m22102U();
            i14 = i7;
            fa9Var2 = fa9VarM16039f;
            ui3Var3 = ui3Var2;
            v56Var2 = v56Var;
        }
        x18VarM22143u = tj3Var.m22143u();
        if (x18VarM22143u != null) {
            x18VarM22143u.f67642d = new zi3() { // from class: ma9
                @Override // p000.zi3
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    AbstractC0226d0.m1132c(f, vi3Var, e16Var, z2, h41Var2, i14, ui3Var3, fa9Var2, v56Var2, (ye1) obj, pk9.m19383z(i2 | 1), i3);
                    return xfa.f68157a;
                }
            };
        }
    }

    /* JADX WARN: Code duplicated, block: B:100:0x0119  */
    /* JADX WARN: Code duplicated, block: B:110:0x0138 A[PHI: r9 r18
      0x0138: PHI (r9v7 boolean) = (r9v4 boolean), (r9v2 boolean) binds: [B:114:0x0140, B:109:0x0136] A[DONT_GENERATE, DONT_INLINE]
      0x0138: PHI (r18v5 int) = (r18v1 int), (r18v6 int) binds: [B:114:0x0140, B:109:0x0136] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:111:0x013a A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:112:0x013c  */
    /* JADX WARN: Code duplicated, block: B:115:0x0142  */
    /* JADX WARN: Code duplicated, block: B:118:0x0157  */
    /* JADX WARN: Code duplicated, block: B:119:0x015a  */
    /* JADX WARN: Code duplicated, block: B:122:0x0163  */
    /* JADX WARN: Code duplicated, block: B:124:0x0169  */
    /* JADX WARN: Code duplicated, block: B:129:0x0177  */
    /* JADX WARN: Code duplicated, block: B:131:0x017b  */
    /* JADX WARN: Code duplicated, block: B:133:0x01b8  */
    /* JADX WARN: Code duplicated, block: B:136:0x01c5  */
    /* JADX WARN: Code duplicated, block: B:138:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:37:0x0067  */
    /* JADX WARN: Code duplicated, block: B:39:0x006d  */
    /* JADX WARN: Code duplicated, block: B:40:0x0070  */
    /* JADX WARN: Code duplicated, block: B:44:0x0078  */
    /* JADX WARN: Code duplicated, block: B:46:0x007c  */
    /* JADX WARN: Code duplicated, block: B:48:0x0084  */
    /* JADX WARN: Code duplicated, block: B:49:0x0087  */
    /* JADX WARN: Code duplicated, block: B:52:0x008d  */
    /* JADX WARN: Code duplicated, block: B:55:0x0094  */
    /* JADX WARN: Code duplicated, block: B:57:0x009c  */
    /* JADX WARN: Code duplicated, block: B:58:0x009f  */
    /* JADX WARN: Code duplicated, block: B:60:0x00a3  */
    /* JADX WARN: Code duplicated, block: B:63:0x00aa  */
    /* JADX WARN: Code duplicated, block: B:65:0x00b0  */
    /* JADX WARN: Code duplicated, block: B:66:0x00b3  */
    /* JADX WARN: Code duplicated, block: B:70:0x00bb  */
    /* JADX WARN: Code duplicated, block: B:72:0x00c3  */
    /* JADX WARN: Code duplicated, block: B:73:0x00c6  */
    /* JADX WARN: Code duplicated, block: B:75:0x00cb  */
    /* JADX WARN: Code duplicated, block: B:78:0x00d5  */
    /* JADX WARN: Code duplicated, block: B:80:0x00db  */
    /* JADX WARN: Code duplicated, block: B:81:0x00de  */
    /* JADX WARN: Code duplicated, block: B:85:0x00e6  */
    /* JADX WARN: Code duplicated, block: B:87:0x00ec  */
    /* JADX WARN: Code duplicated, block: B:88:0x00ef  */
    /* JADX WARN: Code duplicated, block: B:90:0x00f4  */
    /* JADX WARN: Code duplicated, block: B:97:0x010f  */
    /* JADX INFO: renamed from: d */
    public static final void m1133d(final float f, final vi3 vi3Var, final e16 e16Var, boolean z, final ui3 ui3Var, fa9 fa9Var, final v56 v56Var, final int i, final C0282a c0282a, final C0282a c0282a2, final h41 h41Var, ye1 ye1Var, final int i2, final int i3, final int i4) {
        int i5;
        boolean z2;
        fa9 fa9Var2;
        v56 v56Var2;
        C0282a c0282a3;
        int i6;
        int i7;
        boolean z3;
        tj3 tj3Var;
        final boolean z4;
        final fa9 fa9Var3;
        x18 x18VarM22143u;
        fa9 fa9VarM16039f;
        boolean z5;
        boolean z6;
        Object objM22097O;
        int i8;
        int i9;
        int i10;
        int i11;
        int i12;
        int i13;
        tj3 tj3Var2 = (tj3) ye1Var;
        tj3Var2.m22115d0(985901935);
        if ((i2 & 6) == 0) {
            i5 = (tj3Var2.m22114d(f) ? 4 : 2) | i2;
        } else {
            i5 = i2;
        }
        if ((i2 & 48) == 0) {
            i5 |= tj3Var2.m22124i(vi3Var) ? 32 : 16;
        }
        if ((i2 & 384) == 0) {
            i5 |= tj3Var2.m22120g(e16Var) ? 256 : 128;
        }
        int i14 = i4 & 8;
        if (i14 == 0) {
            if ((i2 & 3072) == 0) {
                z2 = z;
                i5 |= tj3Var2.m22122h(z2) ? 2048 : 1024;
            }
            if ((i2 & 24576) == 0) {
                if (tj3Var2.m22124i(ui3Var)) {
                    i13 = 16384;
                } else {
                    i13 = 8192;
                }
                i5 |= i13;
            }
            if ((196608 & i2) == 0) {
                if ((i4 & 32) == 0) {
                    fa9Var2 = fa9Var;
                    int i15 = tj3Var2.m22120g(fa9Var2) ? 131072 : 65536;
                    i5 |= i15;
                } else {
                    fa9Var2 = fa9Var;
                }
                i5 |= i15;
            } else {
                fa9Var2 = fa9Var;
            }
            if ((1572864 & i2) == 0) {
                v56Var2 = v56Var;
                if (tj3Var2.m22120g(v56Var2)) {
                    i12 = 1048576;
                } else {
                    i12 = 524288;
                }
                i5 |= i12;
            } else {
                v56Var2 = v56Var;
            }
            if ((12582912 & i2) == 0) {
                if (tj3Var2.m22116e(i)) {
                    i11 = 8388608;
                } else {
                    i11 = 4194304;
                }
                i5 |= i11;
            }
            if ((100663296 & i2) == 0) {
                c0282a3 = c0282a;
                if (tj3Var2.m22124i(c0282a3)) {
                    i10 = 67108864;
                } else {
                    i10 = 33554432;
                }
                i5 |= i10;
            } else {
                c0282a3 = c0282a;
            }
            if ((i2 & 805306368) == 0) {
                if (tj3Var2.m22124i(c0282a2)) {
                    i9 = 536870912;
                } else {
                    i9 = 268435456;
                }
                i5 |= i9;
            }
            if ((i3 & 6) == 0) {
                if (tj3Var2.m22120g(h41Var)) {
                    i8 = 4;
                } else {
                    i8 = 2;
                }
                i6 = i3 | i8;
            } else {
                i6 = i3;
            }
            i7 = i5;
            if ((i5 & 306783379) == 306783378 || (i6 & 3) != 2) {
                z3 = true;
            } else {
                z3 = false;
            }
            if (tj3Var2.m22099R(i7 & 1, z3)) {
                tj3Var2.m22104W();
                if ((i2 & 1) != 0 || tj3Var2.m22084B()) {
                    if (i14 != 0) {
                        z2 = true;
                    }
                    if ((i4 & 32) != 0) {
                        la9 la9Var = la9.f49371a;
                        fa9VarM16039f = la9.m16039f(tj3Var2);
                        i7 &= -458753;
                    }
                    tj3Var2.m22140r();
                    if ((i7 & 29360128) == 8388608) {
                        z5 = true;
                    } else {
                        z5 = false;
                    }
                    z6 = z5 | ((((i6 & 14) ^ 6) <= 4 && tj3Var2.m22120g(h41Var)) || (i6 & 6) == 4);
                    objM22097O = tj3Var2.m22097O();
                    if (z6 || objM22097O == we1.f66679a) {
                        objM22097O = new C0228e0(f, i, ui3Var, h41Var);
                        tj3Var2.m22131l0(objM22097O);
                    }
                    C0228e0 c0228e0 = (C0228e0) objM22097O;
                    c0228e0.f3401b = ui3Var;
                    c0228e0.f3404e = vi3Var;
                    c0228e0.m1143d(f);
                    int i16 = ((i7 >> 3) & 1008) | ((i7 >> 6) & 57344);
                    int i17 = i7 >> 9;
                    tj3Var = tj3Var2;
                    C0282a c0282a4 = c0282a3;
                    boolean z7 = z2;
                    m1134e(c0228e0, e16Var, z7, null, v56Var2, c0282a4, c0282a2, tj3Var, i16 | (i17 & 458752) | (i17 & 3670016));
                    fa9Var3 = fa9VarM16039f;
                    z4 = z7;
                } else {
                    tj3Var2.m22102U();
                    i7 = (i4 & 32) != 0 ? i7 & (-458753) : i7;
                }
                fa9VarM16039f = fa9Var2;
                tj3Var2.m22140r();
                if ((i7 & 29360128) == 8388608) {
                    z5 = true;
                } else {
                    z5 = false;
                }
                z6 = z5 | ((((i6 & 14) ^ 6) <= 4 && tj3Var2.m22120g(h41Var)) || (i6 & 6) == 4);
                objM22097O = tj3Var2.m22097O();
                if (z6) {
                    objM22097O = new C0228e0(f, i, ui3Var, h41Var);
                    tj3Var2.m22131l0(objM22097O);
                } else {
                    objM22097O = new C0228e0(f, i, ui3Var, h41Var);
                    tj3Var2.m22131l0(objM22097O);
                }
                C0228e0 c0228e1 = (C0228e0) objM22097O;
                c0228e1.f3401b = ui3Var;
                c0228e1.f3404e = vi3Var;
                c0228e1.m1143d(f);
                int i18 = ((i7 >> 3) & 1008) | ((i7 >> 6) & 57344);
                int i19 = i7 >> 9;
                tj3Var = tj3Var2;
                C0282a c0282a5 = c0282a3;
                boolean z8 = z2;
                m1134e(c0228e1, e16Var, z8, null, v56Var2, c0282a5, c0282a2, tj3Var, i18 | (i19 & 458752) | (i19 & 3670016));
                fa9Var3 = fa9VarM16039f;
                z4 = z8;
            } else {
                tj3Var = tj3Var2;
                tj3Var.m22102U();
                z4 = z2;
                fa9Var3 = fa9Var2;
            }
            x18VarM22143u = tj3Var.m22143u();
            if (x18VarM22143u != null) {
                x18VarM22143u.f67642d = new zi3() { // from class: ra9
                    @Override // p000.zi3
                    public final Object invoke(Object obj, Object obj2) {
                        ((Integer) obj2).getClass();
                        int iM19383z = pk9.m19383z(i2 | 1);
                        int iM19383z2 = pk9.m19383z(i3);
                        AbstractC0226d0.m1133d(f, vi3Var, e16Var, z4, ui3Var, fa9Var3, v56Var, i, c0282a, c0282a2, h41Var, (ye1) obj, iM19383z, iM19383z2, i4);
                        return xfa.f68157a;
                    }
                };
            }
        }
        i5 |= 3072;
        z2 = z;
        if ((i2 & 24576) == 0) {
            if (tj3Var2.m22124i(ui3Var)) {
                i13 = 16384;
            } else {
                i13 = 8192;
            }
            i5 |= i13;
        }
        if ((196608 & i2) == 0) {
            if ((i4 & 32) == 0) {
                fa9Var2 = fa9Var;
                if (tj3Var2.m22120g(fa9Var2)) {
                }
                i5 |= i15;
            } else {
                fa9Var2 = fa9Var;
            }
            i5 |= i15;
        } else {
            fa9Var2 = fa9Var;
        }
        if ((1572864 & i2) == 0) {
            v56Var2 = v56Var;
            if (tj3Var2.m22120g(v56Var2)) {
                i12 = 1048576;
            } else {
                i12 = 524288;
            }
            i5 |= i12;
        } else {
            v56Var2 = v56Var;
        }
        if ((12582912 & i2) == 0) {
            if (tj3Var2.m22116e(i)) {
                i11 = 8388608;
            } else {
                i11 = 4194304;
            }
            i5 |= i11;
        }
        if ((100663296 & i2) == 0) {
            c0282a3 = c0282a;
            if (tj3Var2.m22124i(c0282a3)) {
                i10 = 67108864;
            } else {
                i10 = 33554432;
            }
            i5 |= i10;
        } else {
            c0282a3 = c0282a;
        }
        if ((i2 & 805306368) == 0) {
            if (tj3Var2.m22124i(c0282a2)) {
                i9 = 536870912;
            } else {
                i9 = 268435456;
            }
            i5 |= i9;
        }
        if ((i3 & 6) == 0) {
            if (tj3Var2.m22120g(h41Var)) {
                i8 = 4;
            } else {
                i8 = 2;
            }
            i6 = i3 | i8;
        } else {
            i6 = i3;
        }
        i7 = i5;
        if ((i5 & 306783379) == 306783378) {
            z3 = true;
        } else {
            z3 = true;
        }
        if (tj3Var2.m22099R(i7 & 1, z3)) {
            tj3Var2.m22104W();
            if ((i2 & 1) != 0) {
                if (i14 != 0) {
                    z2 = true;
                }
                if ((i4 & 32) != 0) {
                    la9 la9Var2 = la9.f49371a;
                    fa9VarM16039f = la9.m16039f(tj3Var2);
                    i7 &= -458753;
                } else {
                    fa9VarM16039f = fa9Var2;
                }
            } else {
                if (i14 != 0) {
                    z2 = true;
                }
                if ((i4 & 32) != 0) {
                    la9 la9Var3 = la9.f49371a;
                    fa9VarM16039f = la9.m16039f(tj3Var2);
                    i7 &= -458753;
                } else {
                    fa9VarM16039f = fa9Var2;
                }
            }
            tj3Var2.m22140r();
            if ((i7 & 29360128) == 8388608) {
                z5 = true;
            } else {
                z5 = false;
            }
            z6 = z5 | ((((i6 & 14) ^ 6) <= 4 && tj3Var2.m22120g(h41Var)) || (i6 & 6) == 4);
            objM22097O = tj3Var2.m22097O();
            if (z6) {
                objM22097O = new C0228e0(f, i, ui3Var, h41Var);
                tj3Var2.m22131l0(objM22097O);
            } else {
                objM22097O = new C0228e0(f, i, ui3Var, h41Var);
                tj3Var2.m22131l0(objM22097O);
            }
            C0228e0 c0228e2 = (C0228e0) objM22097O;
            c0228e2.f3401b = ui3Var;
            c0228e2.f3404e = vi3Var;
            c0228e2.m1143d(f);
            int i110 = ((i7 >> 3) & 1008) | ((i7 >> 6) & 57344);
            int i111 = i7 >> 9;
            tj3Var = tj3Var2;
            C0282a c0282a6 = c0282a3;
            boolean z9 = z2;
            m1134e(c0228e2, e16Var, z9, null, v56Var2, c0282a6, c0282a2, tj3Var, i110 | (i111 & 458752) | (i111 & 3670016));
            fa9Var3 = fa9VarM16039f;
            z4 = z9;
        } else {
            tj3Var = tj3Var2;
            tj3Var.m22102U();
            z4 = z2;
            fa9Var3 = fa9Var2;
        }
        x18VarM22143u = tj3Var.m22143u();
        if (x18VarM22143u != null) {
            x18VarM22143u.f67642d = new zi3() { // from class: ra9
                @Override // p000.zi3
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int iM19383z = pk9.m19383z(i2 | 1);
                    int iM19383z2 = pk9.m19383z(i3);
                    AbstractC0226d0.m1133d(f, vi3Var, e16Var, z4, ui3Var, fa9Var3, v56Var, i, c0282a, c0282a2, h41Var, (ye1) obj, iM19383z, iM19383z2, i4);
                    return xfa.f68157a;
                }
            };
        }
    }

    /* JADX INFO: renamed from: e */
    public static final void m1134e(C0228e0 c0228e0, e16 e16Var, boolean z, fa9 fa9Var, v56 v56Var, C0282a c0282a, C0282a c0282a2, ye1 ye1Var, int i) {
        int i2;
        fa9 fa9Var2;
        int i3;
        fa9 fa9VarM16039f;
        tj3 tj3Var = (tj3) ye1Var;
        tj3Var.m22115d0(409861960);
        if ((i & 6) == 0) {
            i2 = (tj3Var.m22124i(c0228e0) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= tj3Var.m22120g(e16Var) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= tj3Var.m22122h(z) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= 1024;
        }
        if ((i & 24576) == 0) {
            i2 |= tj3Var.m22120g(v56Var) ? 16384 : 8192;
        }
        if ((196608 & i) == 0) {
            i2 |= tj3Var.m22124i(c0282a) ? 131072 : 65536;
        }
        if ((1572864 & i) == 0) {
            i2 |= tj3Var.m22124i(c0282a2) ? 1048576 : 524288;
        }
        if (tj3Var.m22099R(i2 & 1, (599187 & i2) != 599186)) {
            tj3Var.m22104W();
            if ((i & 1) == 0 || tj3Var.m22084B()) {
                la9 la9Var = la9.f49371a;
                i3 = i2 & (-7169);
                fa9VarM16039f = la9.m16039f(tj3Var);
            } else {
                tj3Var.m22102U();
                i3 = i2 & (-7169);
                fa9VarM16039f = fa9Var;
            }
            tj3Var.m22140r();
            if (c0228e0.f3400a < 0) {
                C3386nv.m17626m("steps should be >= 0");
                return;
            } else {
                int i4 = i3 >> 3;
                m1135f(e16Var, c0228e0, z, v56Var, c0282a, c0282a2, tj3Var, (i3 & 896) | (i4 & 14) | ((i3 << 3) & 112) | (i4 & 7168) | (57344 & i4) | (i4 & 458752));
                fa9Var2 = fa9VarM16039f;
            }
        } else {
            tj3Var.m22102U();
            fa9Var2 = fa9Var;
        }
        x18 x18VarM22143u = tj3Var.m22143u();
        if (x18VarM22143u != null) {
            x18VarM22143u.f67642d = new he0(c0228e0, e16Var, z, fa9Var2, v56Var, c0282a, c0282a2, i);
        }
    }

    /* JADX WARN: Code duplicated, block: B:101:0x0230  */
    /* JADX WARN: Code duplicated, block: B:102:0x0234  */
    /* JADX WARN: Code duplicated, block: B:106:0x0273  */
    /* JADX WARN: Code duplicated, block: B:109:0x029e  */
    /* JADX WARN: Code duplicated, block: B:110:0x02a2  */
    /* JADX WARN: Code duplicated, block: B:113:0x02e7  */
    /* JADX WARN: Code duplicated, block: B:114:0x02eb  */
    /* JADX WARN: Code duplicated, block: B:116:0x0310  */
    /* JADX WARN: Code duplicated, block: B:92:0x01cc  */
    /* JADX WARN: Code duplicated, block: B:93:0x01ce  */
    /* JADX WARN: Code duplicated, block: B:95:0x01d1  */
    /* JADX WARN: Code duplicated, block: B:98:0x020a  */
    /* JADX INFO: renamed from: f */
    public static final void m1135f(e16 e16Var, C0228e0 c0228e0, boolean z, v56 v56Var, C0282a c0282a, C0282a c0282a2, ye1 ye1Var, int i) {
        int i2;
        C0228e0 c0228e1;
        C0282a c0282a3;
        C0282a c0282a4;
        b16 b16Var;
        Orientation orientation;
        C0228e0 c0228e2;
        e16 lo9Var;
        p84 p84Var;
        vi3 vi3Var;
        ui3 ui3Var;
        boolean z2;
        int i3;
        boolean zM22122h;
        Object objM22097O;
        ui3 ui3Var2;
        boolean zM22122h2;
        Object objM22097O2;
        C0282a c0282a5 = c0282a;
        tj3 tj3Var = (tj3) ye1Var;
        tj3Var.m22115d0(898172835);
        if ((i & 6) == 0) {
            i2 = (tj3Var.m22120g(e16Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= tj3Var.m22124i(c0228e0) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= tj3Var.m22122h(z) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= tj3Var.m22120g(v56Var) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            i2 |= tj3Var.m22124i(c0282a5) ? 16384 : 8192;
        }
        if ((196608 & i) == 0) {
            i2 |= tj3Var.m22124i(c0282a2) ? 131072 : 65536;
        }
        int i4 = i2;
        boolean z3 = false;
        if (tj3Var.m22099R(i4 & 1, (74899 & i4) != 74898)) {
            boolean z4 = tj3Var.m22128k(AbstractC0402n.f4822n) == LayoutDirection.Rtl;
            c0228e0.f3409j = z4;
            qc9 qc9Var = c0228e0.f3403d;
            Orientation orientation2 = c0228e0.f3412m;
            if (orientation2 == Orientation.Horizontal && z4) {
                z3 = true;
            }
            b16 b16Var2 = b16.f7762a;
            if (z) {
                C0224c0 c0224c0 = new C0224c0(v56Var, c0228e0);
                fg7 fg7Var = mo9.f51649a;
                b16Var = b16Var2;
                orientation = orientation2;
                c0228e2 = c0228e0;
                lo9Var = new lo9(c0228e2, v56Var, null, c0224c0, 4);
            } else {
                b16Var = b16Var2;
                orientation = orientation2;
                c0228e2 = c0228e0;
                lo9Var = b16Var;
            }
            Orientation orientation3 = c0228e2.f3412m;
            boolean zBooleanValue = ((Boolean) ((xc9) c0228e2.f3413n).getValue()).booleanValue();
            boolean zM22124i = tj3Var.m22124i(c0228e2);
            Object objM22097O3 = tj3Var.m22097O();
            p84 p84Var2 = we1.f66679a;
            if (zM22124i || objM22097O3 == p84Var2) {
                objM22097O3 = new SliderKt$SliderImpl$drag$1$1(c0228e2, null);
                tj3Var.m22131l0(objM22097O3);
            }
            e16 e16Var2 = lo9Var;
            C0228e0 c0228e3 = c0228e2;
            e16 e16VarM891a = AbstractC0104l.m891a(c0228e3, orientation3, z, v56Var, zBooleanValue, (aj3) objM22097O3, z3, 32);
            Orientation orientation4 = Orientation.Vertical;
            Orientation orientation5 = orientation;
            e16 e16VarM4429v = orientation5 == orientation4 ? c99.m4429v(l70.m15961x(b16Var, SliderComponents.THUMB)) : c99.m4431x(l70.m15961x(b16Var, SliderComponents.THUMB));
            sh8 sh8Var = ((th8) tj3Var.m22128k(gh8.f40823a)).f62294a;
            tj3Var.m22111b0(-177425921);
            tj3Var.m22139q(false);
            fb2 fb2Var = (fb2) tj3Var.m22128k(AbstractC0402n.f4816h);
            iv3 iv3Var = AbstractC0262s.f3627a;
            e16 e16VarMo3161g = e16Var.mo3161g(c06.f9271b);
            float f = f3390b;
            float f2 = f3389a;
            float f3 = f2;
            if (orientation5 != orientation4) {
                f2 = f;
            }
            if (orientation5 == orientation4) {
                f3 = f;
            }
            e16 e16VarM4420m = c99.m4420m(e16VarMo3161g, f2, f3, 0.0f, 0.0f, 12);
            boolean z5 = z3;
            e16 e16VarM17643c = nv8.m17643c(e16VarM4420m, false, new cy0(z, c0228e3, 5));
            h41 h41Var = c0228e3.f3402c;
            e16 e16Var3 = e16VarM4429v;
            b16 b16Var3 = b16Var;
            e16 e16VarM23919n = wfb.m23919n(nv8.m17643c(e16VarM17643c.mo3161g(orientation5 == orientation4 ? AbstractC3025g4.f40156b : AbstractC3025g4.f40155a), true, new fn7(qc9Var.m19861h(), new h41(h41Var.f41765a, h41Var.f41766b), c0228e3.f3400a)), z, v56Var);
            int i5 = c0228e3.f3400a;
            h41 h41Var2 = c0228e3.f3402c;
            float fM19861h = qc9Var.m19861h();
            boolean zM22124i2 = tj3Var.m22124i(c0228e3);
            Object objM22097O4 = tj3Var.m22097O();
            if (zM22124i2) {
                p84Var = p84Var2;
            } else {
                p84Var = p84Var2;
                if (objM22097O4 == p84Var) {
                }
                vi3Var = (vi3) objM22097O4;
                ui3Var = c0228e3.f3401b;
                p84 p84Var3 = p84Var;
                if (orientation5 == orientation4) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                if (i5 >= 0) {
                    C3386nv.m17626m("steps should be >= 0");
                    return;
                }
                c0228e1 = c0228e0;
                i3 = 1;
                e16 e16VarMo3161g2 = AbstractC3489q9.m19794x(e16VarM23919n, new va9(z, h41Var2, i5, z5, vi3Var, z2, fM19861h, ui3Var)).mo3161g(e16Var2).mo3161g(e16VarM891a);
                zM22122h = tj3Var.m22122h(false) | tj3Var.m22124i(c0228e1);
                objM22097O = tj3Var.m22097O();
                if (zM22122h || objM22097O == p84Var3) {
                    objM22097O = new C0219a0(c0228e1, i3);
                    tj3Var.m22131l0(objM22097O);
                }
                ht5 ht5Var = (ht5) objM22097O;
                int iHashCode = Long.hashCode(tj3Var.f62385T);
                l77 l77VarM22132m = tj3Var.m22132m();
                e16 e16VarM1322c = AbstractC0287b.m1322c(tj3Var, e16VarMo3161g2);
                se1.f60731q.getClass();
                ui3Var2 = C0352b.f4299b;
                tj3Var.m22119f0();
                if (tj3Var.f62384S) {
                    tj3Var.m22130l(ui3Var2);
                } else {
                    tj3Var.m22137o0();
                }
                zi3 zi3Var = C0352b.f4303f;
                oha.m18001g(tj3Var, zi3Var, ht5Var);
                zi3 zi3Var2 = C0352b.f4302e;
                oha.m18001g(tj3Var, zi3Var2, l77VarM22132m);
                Integer numValueOf = Integer.valueOf(iHashCode);
                zi3 zi3Var3 = C0352b.f4304g;
                oha.m18001g(tj3Var, zi3Var3, numValueOf);
                vi3 vi3Var2 = C0352b.f4305h;
                oha.m18000f(tj3Var, vi3Var2);
                zi3 zi3Var4 = C0352b.f4301d;
                oha.m18001g(tj3Var, zi3Var4, e16VarM1322c);
                e16 e16VarMo3161g3 = e16Var3.mo3161g(b16Var3);
                zM22122h2 = tj3Var.m22122h(false) | tj3Var.m22120g(fb2Var) | tj3Var.m22124i(c0228e1);
                objM22097O2 = tj3Var.m22097O();
                if (zM22122h2 || objM22097O2 == p84Var3) {
                    objM22097O2 = new qa9(fb2Var, c0228e1);
                    tj3Var.m22131l0(objM22097O2);
                }
                e16 e16VarM19025M = pb1.m19025M(e16VarMo3161g3, (vi3) objM22097O2);
                gc0 gc0Var = nj0.f52808c;
                ht5 ht5VarM19966d = qh0.m19966d(gc0Var, false);
                int iHashCode2 = Long.hashCode(tj3Var.f62385T);
                l77 l77VarM22132m2 = tj3Var.m22132m();
                e16 e16VarM1322c2 = AbstractC0287b.m1322c(tj3Var, e16VarM19025M);
                tj3Var.m22119f0();
                if (tj3Var.f62384S) {
                    tj3Var.m22130l(ui3Var2);
                } else {
                    tj3Var.m22137o0();
                }
                oha.m18001g(tj3Var, zi3Var, ht5VarM19966d);
                oha.m18001g(tj3Var, zi3Var2, l77VarM22132m2);
                AbstractC3393o1.m17747v(iHashCode2, tj3Var, zi3Var3, tj3Var, vi3Var2);
                oha.m18001g(tj3Var, zi3Var4, e16VarM1322c2);
                int i6 = (i4 >> 3) & 14;
                C0282a c0282a6 = c0282a;
                c0282a6.invoke(c0228e1, tj3Var, Integer.valueOf(((i4 >> 9) & 112) | i6));
                tj3Var.m22139q(true);
                e16 e16VarM15961x = l70.m15961x(b16Var3, SliderComponents.TRACK);
                ht5 ht5VarM19966d2 = qh0.m19966d(gc0Var, false);
                int iHashCode3 = Long.hashCode(tj3Var.f62385T);
                l77 l77VarM22132m3 = tj3Var.m22132m();
                e16 e16VarM1322c3 = AbstractC0287b.m1322c(tj3Var, e16VarM15961x);
                tj3Var.m22119f0();
                if (tj3Var.f62384S) {
                    tj3Var.m22130l(ui3Var2);
                } else {
                    tj3Var.m22137o0();
                }
                oha.m18001g(tj3Var, zi3Var, ht5VarM19966d2);
                oha.m18001g(tj3Var, zi3Var2, l77VarM22132m3);
                AbstractC3393o1.m17747v(iHashCode3, tj3Var, zi3Var3, tj3Var, vi3Var2);
                oha.m18001g(tj3Var, zi3Var4, e16VarM1322c3);
                C0282a c0282a7 = c0282a2;
                c0282a7.invoke(c0228e1, tj3Var, Integer.valueOf(i6 | ((i4 >> 12) & 112)));
                tj3Var.m22139q(true);
                tj3Var.m22139q(true);
                c0282a3 = c0282a7;
                c0282a4 = c0282a6;
            }
            objM22097O4 = new qa9(c0228e3, 0);
            tj3Var.m22131l0(objM22097O4);
            vi3Var = (vi3) objM22097O4;
            ui3Var = c0228e3.f3401b;
            p84 p84Var4 = p84Var;
            if (orientation5 == orientation4) {
                z2 = true;
            } else {
                z2 = false;
            }
            if (i5 >= 0) {
                C3386nv.m17626m("steps should be >= 0");
                return;
            }
            c0228e1 = c0228e0;
            i3 = 1;
            e16 e16VarMo3161g4 = AbstractC3489q9.m19794x(e16VarM23919n, new va9(z, h41Var2, i5, z5, vi3Var, z2, fM19861h, ui3Var)).mo3161g(e16Var2).mo3161g(e16VarM891a);
            zM22122h = tj3Var.m22122h(false) | tj3Var.m22124i(c0228e1);
            objM22097O = tj3Var.m22097O();
            if (zM22122h) {
                objM22097O = new C0219a0(c0228e1, i3);
                tj3Var.m22131l0(objM22097O);
            } else {
                objM22097O = new C0219a0(c0228e1, i3);
                tj3Var.m22131l0(objM22097O);
            }
            ht5 ht5Var2 = (ht5) objM22097O;
            int iHashCode4 = Long.hashCode(tj3Var.f62385T);
            l77 l77VarM22132m4 = tj3Var.m22132m();
            e16 e16VarM1322c4 = AbstractC0287b.m1322c(tj3Var, e16VarMo3161g4);
            se1.f60731q.getClass();
            ui3Var2 = C0352b.f4299b;
            tj3Var.m22119f0();
            if (tj3Var.f62384S) {
                tj3Var.m22130l(ui3Var2);
            } else {
                tj3Var.m22137o0();
            }
            zi3 zi3Var5 = C0352b.f4303f;
            oha.m18001g(tj3Var, zi3Var5, ht5Var2);
            zi3 zi3Var6 = C0352b.f4302e;
            oha.m18001g(tj3Var, zi3Var6, l77VarM22132m4);
            Integer numValueOf2 = Integer.valueOf(iHashCode4);
            zi3 zi3Var7 = C0352b.f4304g;
            oha.m18001g(tj3Var, zi3Var7, numValueOf2);
            vi3 vi3Var3 = C0352b.f4305h;
            oha.m18000f(tj3Var, vi3Var3);
            zi3 zi3Var8 = C0352b.f4301d;
            oha.m18001g(tj3Var, zi3Var8, e16VarM1322c4);
            e16 e16VarMo3161g5 = e16Var3.mo3161g(b16Var3);
            zM22122h2 = tj3Var.m22122h(false) | tj3Var.m22120g(fb2Var) | tj3Var.m22124i(c0228e1);
            objM22097O2 = tj3Var.m22097O();
            if (zM22122h2) {
                objM22097O2 = new qa9(fb2Var, c0228e1);
                tj3Var.m22131l0(objM22097O2);
            } else {
                objM22097O2 = new qa9(fb2Var, c0228e1);
                tj3Var.m22131l0(objM22097O2);
            }
            e16 e16VarM19025M2 = pb1.m19025M(e16VarMo3161g5, (vi3) objM22097O2);
            gc0 gc0Var2 = nj0.f52808c;
            ht5 ht5VarM19966d3 = qh0.m19966d(gc0Var2, false);
            int iHashCode5 = Long.hashCode(tj3Var.f62385T);
            l77 l77VarM22132m5 = tj3Var.m22132m();
            e16 e16VarM1322c5 = AbstractC0287b.m1322c(tj3Var, e16VarM19025M2);
            tj3Var.m22119f0();
            if (tj3Var.f62384S) {
                tj3Var.m22130l(ui3Var2);
            } else {
                tj3Var.m22137o0();
            }
            oha.m18001g(tj3Var, zi3Var5, ht5VarM19966d3);
            oha.m18001g(tj3Var, zi3Var6, l77VarM22132m5);
            AbstractC3393o1.m17747v(iHashCode5, tj3Var, zi3Var7, tj3Var, vi3Var3);
            oha.m18001g(tj3Var, zi3Var8, e16VarM1322c5);
            int i7 = (i4 >> 3) & 14;
            C0282a c0282a8 = c0282a;
            c0282a8.invoke(c0228e1, tj3Var, Integer.valueOf(((i4 >> 9) & 112) | i7));
            tj3Var.m22139q(true);
            e16 e16VarM15961x2 = l70.m15961x(b16Var3, SliderComponents.TRACK);
            ht5 ht5VarM19966d4 = qh0.m19966d(gc0Var2, false);
            int iHashCode6 = Long.hashCode(tj3Var.f62385T);
            l77 l77VarM22132m6 = tj3Var.m22132m();
            e16 e16VarM1322c6 = AbstractC0287b.m1322c(tj3Var, e16VarM15961x2);
            tj3Var.m22119f0();
            if (tj3Var.f62384S) {
                tj3Var.m22130l(ui3Var2);
            } else {
                tj3Var.m22137o0();
            }
            oha.m18001g(tj3Var, zi3Var5, ht5VarM19966d4);
            oha.m18001g(tj3Var, zi3Var6, l77VarM22132m6);
            AbstractC3393o1.m17747v(iHashCode6, tj3Var, zi3Var7, tj3Var, vi3Var3);
            oha.m18001g(tj3Var, zi3Var8, e16VarM1322c6);
            C0282a c0282a9 = c0282a2;
            c0282a9.invoke(c0228e1, tj3Var, Integer.valueOf(i7 | ((i4 >> 12) & 112)));
            tj3Var.m22139q(true);
            tj3Var.m22139q(true);
            c0282a3 = c0282a9;
            c0282a4 = c0282a8;
        } else {
            c0228e1 = c0228e0;
            c0282a3 = c0282a2;
            tj3Var.m22102U();
            c0282a4 = c0282a5;
        }
        x18 x18VarM22143u = tj3Var.m22143u();
        if (x18VarM22143u != null) {
            x18VarM22143u.f67642d = new qb0(e16Var, c0228e1, z, v56Var, c0282a4, c0282a3, i);
        }
    }

    /* JADX INFO: renamed from: g */
    public static final long m1136g(float f, float f2) {
        if ((Float.isNaN(f) && Float.isNaN(f2)) || f <= f2) {
            long jFloatToRawIntBits = (((long) Float.floatToRawIntBits(f2)) & 4294967295L) | (Float.floatToRawIntBits(f) << 32);
            int i = wa9.f66568c;
            return jFloatToRawIntBits;
        }
        throw new IllegalArgumentException(("start(" + f + ") must be <= endInclusive(" + f2 + ')').toString());
    }

    /* JADX INFO: renamed from: h */
    public static final void m1137h(final v56 v56Var, final e16 e16Var, final fa9 fa9Var, final boolean z, final long j, ye1 ye1Var, final int i) {
        int i2;
        long jFloatToRawIntBits;
        tj3 tj3Var = (tj3) ye1Var;
        tj3Var.m22115d0(2115331054);
        if ((i & 6) == 0) {
            i2 = (tj3Var.m22120g(v56Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= tj3Var.m22120g(e16Var) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= tj3Var.m22120g(fa9Var) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= tj3Var.m22122h(z) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            i2 |= tj3Var.m22118f(j) ? 16384 : 8192;
        }
        if ((196608 & i) == 0) {
            i2 |= tj3Var.m22122h(false) ? 131072 : 65536;
        }
        if (tj3Var.m22099R(i2 & 1, (74899 & i2) != 74898)) {
            Object objM22097O = tj3Var.m22097O();
            p84 p84Var = we1.f66679a;
            if (objM22097O == p84Var) {
                objM22097O = new SnapshotStateList();
                tj3Var.m22131l0(objM22097O);
            }
            SnapshotStateList snapshotStateList = (SnapshotStateList) objM22097O;
            boolean z2 = (i2 & 14) == 4;
            Object objM22097O2 = tj3Var.m22097O();
            if (z2 || objM22097O2 == p84Var) {
                objM22097O2 = new SliderKt$Thumb$1$1(v56Var, snapshotStateList, null);
                tj3Var.m22131l0(objM22097O2);
            }
            d32.m10047k(tj3Var, (zi3) objM22097O2, v56Var);
            if (snapshotStateList.isEmpty()) {
                jFloatToRawIntBits = j;
            } else {
                float fM3806b = bk2.m3806b(j) / 2.0f;
                if ((2 & 1) != 0) {
                    fM3806b = bk2.m3806b(j);
                }
                jFloatToRawIntBits = (((long) Float.floatToRawIntBits((2 & 2) != 0 ? bk2.m3805a(j) : 0.0f)) & 4294967295L) | (((long) Float.floatToRawIntBits(fM3806b)) << 32);
            }
            y33 y33Var = c99.f9762a;
            e16 e16VarM24734G = xwc.m24734G(c99.m4423p(e16Var, bk2.m3806b(jFloatToRawIntBits), bk2.m3805a(jFloatToRawIntBits)), v56Var);
            ig7.f44091a.getClass();
            thb.m22044c(tj3Var, d32.m10007D(dfc.m10323a(e16VarM24734G, bq1.f8857f), z ? fa9Var.f38725a : fa9Var.f38730f, x49.m24271b(ya9.f69563j, tj3Var)));
        } else {
            tj3Var.m22102U();
        }
        x18 x18VarM22143u = tj3Var.m22143u();
        if (x18VarM22143u != null) {
            x18VarM22143u.f67642d = new zi3() { // from class: oa9
                @Override // p000.zi3
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    AbstractC0226d0.m1137h(v56Var, e16Var, fa9Var, z, j, (ye1) obj, pk9.m19383z(i | 1));
                    return xfa.f68157a;
                }
            };
        }
    }

    /* JADX INFO: renamed from: i */
    public static final float m1138i(float f, float[] fArr, float f2, float f3) {
        Float fValueOf;
        if (fArr.length == 0) {
            fValueOf = null;
        } else {
            float f4 = fArr[0];
            int i = 1;
            int length = fArr.length - 1;
            if (length == 0) {
                fValueOf = Float.valueOf(f4);
            } else {
                float fAbs = Math.abs(AbstractC3423or.m18232Q(f2, f3, f4) - f);
                if (1 <= length) {
                    while (true) {
                        float f5 = fArr[i];
                        float fAbs2 = Math.abs(AbstractC3423or.m18232Q(f2, f3, f5) - f);
                        if (Float.compare(fAbs, fAbs2) > 0) {
                            f4 = f5;
                            fAbs = fAbs2;
                        }
                        if (i == length) {
                            break;
                        }
                        i++;
                    }
                }
                fValueOf = Float.valueOf(f4);
            }
        }
        return fValueOf != null ? AbstractC3423or.m18232Q(f2, f3, fValueOf.floatValue()) : f;
    }

    /* JADX INFO: renamed from: j */
    public static final float m1139j(float f, float f2, float f3) {
        float f4 = f2 - f;
        return l70.m15944g(f4 == 0.0f ? 0.0f : (f3 - f) / f4, 0.0f, 1.0f);
    }

    /* JADX INFO: renamed from: k */
    public static final float m1140k(float f, float f2, float f3, float f4, float f5) {
        return AbstractC3423or.m18232Q(f4, f5, m1139j(f, f2, f3));
    }
}
