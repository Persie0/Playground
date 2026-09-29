package com.lingq.feature.search.fastsearch;

import android.content.Context;
import android.content.res.Resources;
import androidx.compose.material3.AbstractC0231g;
import androidx.compose.p002ui.platform.AbstractC0394f;
import androidx.compose.runtime.AbstractC0278f;
import androidx.lifecycle.compose.AbstractC0711a;
import com.lingq.feature.search.fastsearch.C2768b;
import kotlin.jvm.internal.FunctionReference;
import p000.AbstractC3584sr;
import p000.C2919d9;
import p000.C3386nv;
import p000.C3836zk;
import p000.a13;
import p000.b34;
import p000.bia;
import p000.c91;
import p000.ci8;
import p000.d32;
import p000.dq0;
import p000.dua;
import p000.gi5;
import p000.gr3;
import p000.hn0;
import p000.i91;
import p000.ke2;
import p000.o03;
import p000.or1;
import p000.p84;
import p000.pfa;
import p000.q2d;
import p000.sc9;
import p000.si5;
import p000.t66;
import p000.tj3;
import p000.ub5;
import p000.uc9;
import p000.ud6;
import p000.ui3;
import p000.vi3;
import p000.w41;
import p000.we1;
import p000.wf1;
import p000.x18;
import p000.xwc;
import p000.y38;
import p000.ye1;
import p000.zi3;
import p000.zpb;

/* JADX INFO: renamed from: com.lingq.feature.search.fastsearch.a */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC2767a {
    /* JADX INFO: renamed from: a */
    public static final void m9677a(ud6 ud6Var, w41 w41Var, bia biaVar, C2768b c2768b, ye1 ye1Var, int i) {
        tj3 tj3Var;
        C2768b c2768b2;
        final C2768b c2768b3;
        t66 t66Var;
        sc9 sc9Var;
        t66 t66Var2;
        Object obj;
        final int i2;
        ud6Var.getClass();
        w41Var.getClass();
        biaVar.getClass();
        tj3 tj3Var2 = (tj3) ye1Var;
        tj3Var2.m22115d0(1116750150);
        int i3 = i | (tj3Var2.m22124i(ud6Var) ? 4 : 2) | (tj3Var2.m22124i(w41Var) ? 32 : 16) | (tj3Var2.m22124i(biaVar) ? 256 : 128) | 1024;
        if (tj3Var2.m22099R(i3 & 1, (i3 & 1171) != 1170)) {
            tj3Var2.m22104W();
            if ((i & 1) == 0 || tj3Var2.m22084B()) {
                dua duaVarM21396a = si5.m21396a(tj3Var2);
                if (duaVarM21396a == null) {
                    C3386nv.m17633t("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner");
                    return;
                }
                c2768b3 = (C2768b) pfa.m19114d(y38.m24933a(C2768b.class), duaVarM21396a, null, AbstractC3584sr.m21591B(duaVarM21396a, tj3Var2), duaVarM21396a instanceof gr3 ? ((gr3) duaVarM21396a).mo2103e() : or1.f54780b, tj3Var2);
            } else {
                tj3Var2.m22102U();
                c2768b3 = c2768b;
            }
            tj3Var2.m22140r();
            t66 t66VarM2513c = AbstractC0711a.m2513c(c2768b3.f32893q, tj3Var2);
            Context context = (Context) tj3Var2.m22128k(AbstractC0394f.f4761b);
            ub5 ub5Var = (ub5) tj3Var2.m22128k(gi5.f40854a);
            Resources resources = (Resources) tj3Var2.m22128k(AbstractC0394f.f4762c);
            Object[] objArr = new Object[0];
            Object objM22097O = tj3Var2.m22097O();
            Object obj2 = we1.f66679a;
            if (objM22097O == obj2) {
                objM22097O = new wf1(13);
                tj3Var2.m22131l0(objM22097O);
            }
            t66 t66Var3 = (t66) xwc.m24745R(objArr, (ui3) objM22097O, tj3Var2, 48);
            Object[] objArr2 = new Object[0];
            Object objM22097O2 = tj3Var2.m22097O();
            if (objM22097O2 == obj2) {
                objM22097O2 = new wf1(14);
                tj3Var2.m22131l0(objM22097O2);
            }
            sc9 sc9Var2 = (sc9) xwc.m24745R(objArr2, (ui3) objM22097O2, tj3Var2, 48);
            Object[] objArr3 = new Object[0];
            Object objM22097O3 = tj3Var2.m22097O();
            if (objM22097O3 == obj2) {
                objM22097O3 = new wf1(15);
                tj3Var2.m22131l0(objM22097O3);
            }
            t66 t66Var4 = (t66) xwc.m24745R(objArr3, (ui3) objM22097O3, tj3Var2, 48);
            boolean zM22124i = tj3Var2.m22124i(c2768b3) | tj3Var2.m22124i(ub5Var);
            Object objM22097O4 = tj3Var2.m22097O();
            if (zM22124i || objM22097O4 == obj2) {
                objM22097O4 = new ke2(2, ub5Var, c2768b3);
                tj3Var2.m22131l0(objM22097O4);
            }
            d32.m10043i(ub5Var, c2768b3, (vi3) objM22097O4, tj3Var2);
            a13 a13Var = (a13) t66VarM2513c.getValue();
            boolean zM22124i2 = tj3Var2.m22124i(c2768b3);
            Object objM22097O5 = tj3Var2.m22097O();
            if (zM22124i2 || objM22097O5 == obj2) {
                objM22097O5 = new FastSearchScreenKt$FastSearchRoute$2$1(1, c2768b3, C2768b.class, "handleAction", "handleAction(Lcom/lingq/feature/search/fastsearch/data/FastSearchScreenActions;)V", 0);
                tj3Var2.m22131l0(objM22097O5);
            }
            vi3 vi3Var = (vi3) ((FunctionReference) objM22097O5);
            boolean zM22124i3 = tj3Var2.m22124i(ud6Var) | tj3Var2.m22124i(w41Var) | tj3Var2.m22120g(sc9Var2) | tj3Var2.m22120g(t66Var4) | tj3Var2.m22120g(t66Var3) | tj3Var2.m22124i(context) | tj3Var2.m22124i(c2768b3) | tj3Var2.m22124i(resources);
            Object objM22097O6 = tj3Var2.m22097O();
            if (zM22124i3 || objM22097O6 == obj2) {
                t66Var = t66Var3;
                sc9Var = sc9Var2;
                t66Var2 = t66Var4;
                obj = obj2;
                c91 c91Var = new c91(ud6Var, w41Var, context, resources, sc9Var, t66Var2, t66Var, c2768b3);
                tj3Var2.m22131l0(c91Var);
                objM22097O6 = c91Var;
            } else {
                t66Var = t66Var3;
                sc9Var = sc9Var2;
                t66Var2 = t66Var4;
                obj = obj2;
            }
            m9678b(a13Var, vi3Var, (vi3) objM22097O6, tj3Var2, 0);
            if (((a13) t66VarM2513c.getValue()).f60d == null) {
                tj3Var2.m22111b0(291741916);
                tj3Var2.m22139q(false);
                i2 = 1;
            } else {
                tj3Var2.m22111b0(291741917);
                boolean zM22124i4 = tj3Var2.m22124i(c2768b3);
                Object objM22097O7 = tj3Var2.m22097O();
                if (zM22124i4 || objM22097O7 == obj) {
                    objM22097O7 = new o03(c2768b3, 2);
                    tj3Var2.m22131l0(objM22097O7);
                }
                ui3 ui3Var = (ui3) objM22097O7;
                final int i4 = 0;
                i2 = 1;
                q2d.m19625a(ui3Var, ci8.m4703P(806649160, new zi3() { // from class: p03
                    @Override // p000.zi3
                    public final Object invoke(Object obj3, Object obj4) {
                        int i5 = i4;
                        xfa xfaVar = xfa.f68157a;
                        p84 p84Var = we1.f66679a;
                        C2768b c2768b4 = c2768b3;
                        switch (i5) {
                            case 0:
                                ye1 ye1Var2 = (ye1) obj3;
                                int iIntValue = ((Integer) obj4).intValue();
                                tj3 tj3Var3 = (tj3) ye1Var2;
                                if (!tj3Var3.m22099R(1 & iIntValue, (iIntValue & 3) != 2)) {
                                    tj3Var3.m22102U();
                                } else {
                                    boolean zM22124i5 = tj3Var3.m22124i(c2768b4);
                                    Object objM22097O8 = tj3Var3.m22097O();
                                    if (zM22124i5 || objM22097O8 == p84Var) {
                                        objM22097O8 = new o03(c2768b4, 0);
                                        tj3Var3.m22131l0(objM22097O8);
                                    }
                                    AbstractC0231g.m1153f(805306368, 510, null, tj3Var3, (ui3) objM22097O8, zpb.f71945a, null, null, null, false);
                                }
                                break;
                            default:
                                ye1 ye1Var3 = (ye1) obj3;
                                int iIntValue2 = ((Integer) obj4).intValue();
                                tj3 tj3Var4 = (tj3) ye1Var3;
                                if (!tj3Var4.m22099R(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                                    tj3Var4.m22102U();
                                } else {
                                    boolean zM22124i6 = tj3Var4.m22124i(c2768b4);
                                    Object objM22097O9 = tj3Var4.m22097O();
                                    if (zM22124i6 || objM22097O9 == p84Var) {
                                        objM22097O9 = new o03(c2768b4, 1);
                                        tj3Var4.m22131l0(objM22097O9);
                                    }
                                    AbstractC0231g.m1153f(805306368, 510, null, tj3Var4, (ui3) objM22097O9, zpb.f71946b, null, null, null, false);
                                }
                                break;
                        }
                        return xfaVar;
                    }
                }, tj3Var2), null, ci8.m4703P(1787399942, new zi3() { // from class: p03
                    @Override // p000.zi3
                    public final Object invoke(Object obj3, Object obj4) {
                        int i5 = i2;
                        xfa xfaVar = xfa.f68157a;
                        p84 p84Var = we1.f66679a;
                        C2768b c2768b4 = c2768b3;
                        switch (i5) {
                            case 0:
                                ye1 ye1Var2 = (ye1) obj3;
                                int iIntValue = ((Integer) obj4).intValue();
                                tj3 tj3Var3 = (tj3) ye1Var2;
                                if (!tj3Var3.m22099R(1 & iIntValue, (iIntValue & 3) != 2)) {
                                    tj3Var3.m22102U();
                                } else {
                                    boolean zM22124i5 = tj3Var3.m22124i(c2768b4);
                                    Object objM22097O8 = tj3Var3.m22097O();
                                    if (zM22124i5 || objM22097O8 == p84Var) {
                                        objM22097O8 = new o03(c2768b4, 0);
                                        tj3Var3.m22131l0(objM22097O8);
                                    }
                                    AbstractC0231g.m1153f(805306368, 510, null, tj3Var3, (ui3) objM22097O8, zpb.f71945a, null, null, null, false);
                                }
                                break;
                            default:
                                ye1 ye1Var3 = (ye1) obj3;
                                int iIntValue2 = ((Integer) obj4).intValue();
                                tj3 tj3Var4 = (tj3) ye1Var3;
                                if (!tj3Var4.m22099R(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                                    tj3Var4.m22102U();
                                } else {
                                    boolean zM22124i6 = tj3Var4.m22124i(c2768b4);
                                    Object objM22097O9 = tj3Var4.m22097O();
                                    if (zM22124i6 || objM22097O9 == p84Var) {
                                        objM22097O9 = new o03(c2768b4, 1);
                                        tj3Var4.m22131l0(objM22097O9);
                                    }
                                    AbstractC0231g.m1153f(805306368, 510, null, tj3Var4, (ui3) objM22097O9, zpb.f71946b, null, null, null, false);
                                }
                                break;
                        }
                        return xfaVar;
                    }
                }, tj3Var2), null, null, zpb.f71947c, null, 0L, 0L, 0L, 0L, null, tj3Var2, 1575984, 16308);
                tj3Var2 = tj3Var2;
                tj3Var2.m22139q(false);
            }
            tj3Var = tj3Var2;
            d32.m10060t(((Boolean) t66Var.getValue()).booleanValue(), sc9Var.m21222h(), (String) t66Var2.getValue(), false, false, new i91(t66Var, biaVar, i2), null, tj3Var, 0, 88);
            c2768b2 = c2768b3;
        } else {
            tj3Var = tj3Var2;
            tj3Var.m22102U();
            c2768b2 = c2768b;
        }
        x18 x18VarM22143u = tj3Var.m22143u();
        if (x18VarM22143u != null) {
            x18VarM22143u.f67642d = new C2919d9(ud6Var, w41Var, biaVar, c2768b2, i, 11);
        }
    }

    /* JADX INFO: renamed from: b */
    public static final void m9678b(a13 a13Var, vi3 vi3Var, vi3 vi3Var2, ye1 ye1Var, int i) {
        tj3 tj3Var = (tj3) ye1Var;
        tj3Var.m22115d0(-1014648057);
        int i2 = i | (tj3Var.m22124i(a13Var) ? 4 : 2) | (tj3Var.m22124i(vi3Var) ? 32 : 16) | (tj3Var.m22124i(vi3Var2) ? 256 : 128);
        if (tj3Var.m22099R(i2 & 1, (i2 & 147) != 146)) {
            Object objM22097O = tj3Var.m22097O();
            p84 p84Var = we1.f66679a;
            if (objM22097O == p84Var) {
                objM22097O = AbstractC0278f.m1260j(Boolean.FALSE);
                tj3Var.m22131l0(objM22097O);
            }
            t66 t66Var = (t66) objM22097O;
            Object objM22097O2 = tj3Var.m22097O();
            if (objM22097O2 == p84Var) {
                objM22097O2 = AbstractC0278f.m1258h(0L);
                tj3Var.m22131l0(objM22097O2);
            }
            uc9 uc9Var = (uc9) objM22097O2;
            Boolean boolValueOf = Boolean.valueOf(a13Var.f59c);
            Boolean bool = (Boolean) t66Var.getValue();
            bool.booleanValue();
            boolean zM22124i = tj3Var.m22124i(a13Var);
            Object objM22097O3 = tj3Var.m22097O();
            if (zM22124i || objM22097O3 == p84Var) {
                objM22097O3 = new FastSearchScreenKt$FastSearchScreen$1$1(a13Var, t66Var, uc9Var, null);
                tj3Var.m22131l0(objM22097O3);
            }
            d32.m10049l(boolValueOf, bool, (zi3) objM22097O3, tj3Var);
            b34.m3232b(null, ci8.m4703P(-1566312509, new dq0(vi3Var2, 28), tj3Var), null, null, null, 0, 0L, 0L, null, ci8.m4703P(1059103000, new hn0((Object) a13Var, vi3Var, (Object) t66Var, (Object) uc9Var, (Object) vi3Var2, 5), tj3Var), tj3Var, 805306416, 509);
        } else {
            tj3Var.m22102U();
        }
        x18 x18VarM22143u = tj3Var.m22143u();
        if (x18VarM22143u != null) {
            x18VarM22143u.f67642d = new C3836zk(i, 13, a13Var, vi3Var, vi3Var2);
        }
    }
}
