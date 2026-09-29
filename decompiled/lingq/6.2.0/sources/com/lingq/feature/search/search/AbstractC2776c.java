package com.lingq.feature.search.search;

import android.content.Context;
import androidx.compose.foundation.lazy.C0127b;
import androidx.compose.material3.AbstractC0231g;
import androidx.compose.p002ui.platform.AbstractC0394f;
import androidx.compose.runtime.AbstractC0278f;
import androidx.compose.runtime.internal.C0282a;
import androidx.lifecycle.compose.AbstractC0711a;
import com.lingq.core.domain.model.library.LibraryItem;
import com.lingq.core.p012ui.LessonInfoSource;
import com.lingq.feature.search.search.C2779e;
import com.lingq.feature.search.search.components.AbstractC2777a;
import java.util.List;
import kotlin.jvm.internal.FunctionReference;
import p000.AbstractC3584sr;
import p000.C3386nv;
import p000.b34;
import p000.bia;
import p000.c91;
import p000.ci8;
import p000.d32;
import p000.da6;
import p000.dua;
import p000.eq8;
import p000.fm6;
import p000.g98;
import p000.gi5;
import p000.gr3;
import p000.gt8;
import p000.ht6;
import p000.i91;
import p000.ij7;
import p000.js8;
import p000.ks8;
import p000.lo6;
import p000.m0d;
import p000.mv4;
import p000.or1;
import p000.p84;
import p000.pfa;
import p000.q2d;
import p000.sc9;
import p000.si5;
import p000.slc;
import p000.t66;
import p000.tj3;
import p000.ub5;
import p000.uc9;
import p000.ud6;
import p000.ui3;
import p000.vi3;
import p000.w41;
import p000.we1;
import p000.wh7;
import p000.ws6;
import p000.x18;
import p000.xs8;
import p000.xwc;
import p000.xy0;
import p000.y38;
import p000.ye1;
import p000.ys0;
import p000.zi3;

/* JADX INFO: renamed from: com.lingq.feature.search.search.c */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC2776c {
    /* JADX INFO: renamed from: a */
    public static final void m9701a(String str, ud6 ud6Var, w41 w41Var, bia biaVar, C2779e c2779e, ye1 ye1Var, int i) {
        C2779e c2779e2;
        int i2;
        C2779e c2779e3;
        Context context;
        final C2779e c2779e4;
        sc9 sc9Var;
        t66 t66Var;
        t66 t66Var2;
        int i3;
        final int i4;
        boolean z;
        final int i5;
        ud6 ud6Var2 = ud6Var;
        bia biaVar2 = biaVar;
        ud6Var2.getClass();
        w41Var.getClass();
        biaVar2.getClass();
        tj3 tj3Var = (tj3) ye1Var;
        tj3Var.m22115d0(654743525);
        int i6 = i | (tj3Var.m22120g(str) ? 4 : 2) | (tj3Var.m22124i(ud6Var2) ? 32 : 16) | (tj3Var.m22124i(w41Var) ? 256 : 128) | (tj3Var.m22124i(biaVar2) ? 2048 : 1024) | 8192;
        if (tj3Var.m22099R(i6 & 1, (i6 & 9363) != 9362)) {
            tj3Var.m22104W();
            if ((i & 1) == 0 || tj3Var.m22084B()) {
                dua duaVarM21396a = si5.m21396a(tj3Var);
                if (duaVarM21396a == null) {
                    C3386nv.m17633t("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner");
                    return;
                } else {
                    i2 = 0;
                    c2779e3 = (C2779e) pfa.m19114d(y38.m24933a(C2779e.class), duaVarM21396a, null, AbstractC3584sr.m21591B(duaVarM21396a, tj3Var), duaVarM21396a instanceof gr3 ? ((gr3) duaVarM21396a).mo2103e() : or1.f54780b, tj3Var);
                }
            } else {
                tj3Var.m22102U();
                c2779e3 = c2779e;
                i2 = 0;
            }
            tj3Var.m22140r();
            t66 t66VarM2513c = AbstractC0711a.m2513c(c2779e3.f33118z, tj3Var);
            ub5 ub5Var = (ub5) tj3Var.m22128k(gi5.f40854a);
            Context context2 = (Context) tj3Var.m22128k(AbstractC0394f.f4761b);
            Object[] objArr = new Object[i2];
            Object objM22097O = tj3Var.m22097O();
            p84 p84Var = we1.f66679a;
            if (objM22097O == p84Var) {
                objM22097O = new g98(27);
                tj3Var.m22131l0(objM22097O);
            }
            t66 t66Var3 = (t66) xwc.m24745R(objArr, (ui3) objM22097O, tj3Var, 48);
            Object[] objArr2 = new Object[i2];
            Object objM22097O2 = tj3Var.m22097O();
            if (objM22097O2 == p84Var) {
                objM22097O2 = new g98(28);
                tj3Var.m22131l0(objM22097O2);
            }
            sc9 sc9Var2 = (sc9) xwc.m24745R(objArr2, (ui3) objM22097O2, tj3Var, 48);
            Object[] objArr3 = new Object[i2];
            Object objM22097O3 = tj3Var.m22097O();
            if (objM22097O3 == p84Var) {
                objM22097O3 = new g98(29);
                tj3Var.m22131l0(objM22097O3);
            }
            t66 t66Var4 = (t66) xwc.m24745R(objArr3, (ui3) objM22097O3, tj3Var, 48);
            Object[] objArr4 = new Object[0];
            Object objM22097O4 = tj3Var.m22097O();
            if (objM22097O4 == p84Var) {
                objM22097O4 = new ks8(0);
                tj3Var.m22131l0(objM22097O4);
            }
            t66 t66Var5 = (t66) xwc.m24745R(objArr4, (ui3) objM22097O4, tj3Var, 48);
            String str2 = ((xs8) t66VarM2513c.getValue()).f68662k;
            boolean zM22120g = tj3Var.m22120g(t66VarM2513c) | tj3Var.m22124i(context2) | tj3Var.m22124i(ud6Var2) | tj3Var.m22124i(c2779e3);
            Object objM22097O5 = tj3Var.m22097O();
            if (zM22120g || objM22097O5 == p84Var) {
                objM22097O5 = new SearchScreenKt$SearchRoute$1$1(t66VarM2513c, context2, ud6Var2, c2779e3, null);
                t66VarM2513c = t66VarM2513c;
                ud6Var2 = ud6Var2;
                C2779e c2779e5 = c2779e3;
                context = context2;
                c2779e4 = c2779e5;
                tj3Var.m22131l0(objM22097O5);
            } else {
                c2779e4 = c2779e3;
                context = context2;
            }
            d32.m10047k(tj3Var, (zi3) objM22097O5, str2);
            boolean zM22120g2 = tj3Var.m22120g(t66VarM2513c) | tj3Var.m22124i(c2779e4) | tj3Var.m22124i(ub5Var);
            Object objM22097O6 = tj3Var.m22097O();
            if (zM22120g2 || objM22097O6 == p84Var) {
                objM22097O6 = new ws6(ub5Var, c2779e4, t66VarM2513c, 10);
                tj3Var.m22131l0(objM22097O6);
            }
            d32.m10041h(ub5Var, (vi3) objM22097O6, tj3Var);
            xs8 xs8Var = (xs8) t66VarM2513c.getValue();
            List list = xs8Var.f68653b;
            boolean z2 = xs8Var.f68654c;
            boolean z3 = xs8Var.f68655d;
            gt8 gt8Var = xs8Var.f68656e;
            t66 t66Var6 = t66VarM2513c;
            ij7 ij7Var = xs8Var.f68657f;
            fm6 fm6Var = xs8Var.f68658g;
            boolean z4 = xs8Var.f68659h;
            boolean z5 = xs8Var.f68660i;
            boolean z6 = xs8Var.f68661j;
            String str3 = xs8Var.f68662k;
            boolean z7 = xs8Var.f68663l;
            list.getClass();
            gt8Var.getClass();
            xs8 xs8Var2 = new xs8(str, list, z2, z3, gt8Var, ij7Var, fm6Var, z4, z5, z6, str3, z7);
            boolean zM22124i = tj3Var.m22124i(c2779e4);
            Object objM22097O7 = tj3Var.m22097O();
            if (zM22124i || objM22097O7 == p84Var) {
                objM22097O7 = new SearchScreenKt$SearchRoute$3$1(1, c2779e4, C2779e.class, "handleAction", "handleAction(Lcom/lingq/feature/search/search/data/SearchScreenActions;)V", 0);
                tj3Var.m22131l0(objM22097O7);
            }
            vi3 vi3Var = (vi3) ((FunctionReference) objM22097O7);
            boolean zM22124i2 = tj3Var.m22124i(ud6Var2) | tj3Var.m22124i(c2779e4) | tj3Var.m22124i(w41Var) | tj3Var.m22120g(sc9Var2) | tj3Var.m22120g(t66Var4) | tj3Var.m22120g(r36) | tj3Var.m22120g(t66Var3) | tj3Var.m22124i(context);
            Object objM22097O8 = tj3Var.m22097O();
            if (zM22124i2 || objM22097O8 == p84Var) {
                sc9Var = sc9Var2;
                t66Var = t66Var3;
                t66Var2 = t66Var4;
                i3 = 4;
                c91 c91Var = new c91(ud6Var2, c2779e4, w41Var, context, sc9Var, t66Var2, (t66) r36, t66Var);
                tj3Var.m22131l0(c91Var);
                objM22097O8 = c91Var;
            } else {
                sc9Var = sc9Var2;
                t66Var = t66Var3;
                t66Var2 = t66Var4;
                i3 = 4;
            }
            m9702b(xs8Var2, vi3Var, (vi3) objM22097O8, tj3Var, 0);
            boolean zBooleanValue = ((Boolean) t66Var.getValue()).booleanValue();
            int iM21222h = sc9Var.m21222h();
            String str4 = (String) t66Var2.getValue();
            boolean zBooleanValue2 = ((Boolean) t66Var5.getValue()).booleanValue();
            final int i7 = 3;
            biaVar2 = biaVar;
            final int i8 = i3;
            d32.m10060t(zBooleanValue, iM21222h, str4, zBooleanValue2, false, new i91(t66Var, biaVar2, 3), null, tj3Var, 0, 80);
            tj3Var = tj3Var;
            ij7 ij7Var2 = ((xs8) t66Var6.getValue()).f68657f;
            if (ij7Var2 == null) {
                tj3Var.m22111b0(2024060559);
                z = false;
                tj3Var.m22139q(false);
                i4 = 2;
            } else {
                tj3Var.m22111b0(2024060560);
                boolean zM22124i3 = tj3Var.m22124i(c2779e4);
                Object objM22097O9 = tj3Var.m22097O();
                if (zM22124i3 || objM22097O9 == p84Var) {
                    i4 = 2;
                    objM22097O9 = new js8(c2779e4, 2);
                    tj3Var.m22131l0(objM22097O9);
                } else {
                    i4 = 2;
                }
                q2d.m19625a((ui3) objM22097O9, ci8.m4703P(-459586414, new eq8(3, c2779e4, ij7Var2), tj3Var), null, ci8.m4703P(-801265328, new zi3() { // from class: is8
                    @Override // p000.zi3
                    public final Object invoke(Object obj, Object obj2) {
                        int i9 = i7;
                        xfa xfaVar = xfa.f68157a;
                        p84 p84Var2 = we1.f66679a;
                        C2779e c2779e6 = c2779e4;
                        switch (i9) {
                            case 0:
                                ye1 ye1Var2 = (ye1) obj;
                                int iIntValue = ((Integer) obj2).intValue();
                                tj3 tj3Var2 = (tj3) ye1Var2;
                                if (!tj3Var2.m22099R(iIntValue & 1, (iIntValue & 3) != 2)) {
                                    tj3Var2.m22102U();
                                } else {
                                    boolean zM22124i4 = tj3Var2.m22124i(c2779e6);
                                    Object objM22097O10 = tj3Var2.m22097O();
                                    if (zM22124i4 || objM22097O10 == p84Var2) {
                                        objM22097O10 = new js8(c2779e6, 8);
                                        tj3Var2.m22131l0(objM22097O10);
                                    }
                                    AbstractC0231g.m1153f(805306368, 510, null, tj3Var2, (ui3) objM22097O10, slc.f61001k, null, null, null, false);
                                }
                                break;
                            case 1:
                                ye1 ye1Var3 = (ye1) obj;
                                int iIntValue2 = ((Integer) obj2).intValue();
                                tj3 tj3Var3 = (tj3) ye1Var3;
                                if (!tj3Var3.m22099R(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                                    tj3Var3.m22102U();
                                } else {
                                    boolean zM22124i5 = tj3Var3.m22124i(c2779e6);
                                    Object objM22097O11 = tj3Var3.m22097O();
                                    if (zM22124i5 || objM22097O11 == p84Var2) {
                                        objM22097O11 = new js8(c2779e6, 3);
                                        tj3Var3.m22131l0(objM22097O11);
                                    }
                                    AbstractC0231g.m1153f(805306368, 510, null, tj3Var3, (ui3) objM22097O11, slc.f61003m, null, null, null, false);
                                }
                                break;
                            case 2:
                                ye1 ye1Var4 = (ye1) obj;
                                int iIntValue3 = ((Integer) obj2).intValue();
                                tj3 tj3Var4 = (tj3) ye1Var4;
                                if (!tj3Var4.m22099R(iIntValue3 & 1, (iIntValue3 & 3) != 2)) {
                                    tj3Var4.m22102U();
                                } else {
                                    boolean zM22124i6 = tj3Var4.m22124i(c2779e6);
                                    Object objM22097O12 = tj3Var4.m22097O();
                                    if (zM22124i6 || objM22097O12 == p84Var2) {
                                        objM22097O12 = new js8(c2779e6, 6);
                                        tj3Var4.m22131l0(objM22097O12);
                                    }
                                    AbstractC0231g.m1153f(805306368, 510, null, tj3Var4, (ui3) objM22097O12, slc.f61004n, null, null, null, false);
                                }
                                break;
                            case 3:
                                ye1 ye1Var5 = (ye1) obj;
                                int iIntValue4 = ((Integer) obj2).intValue();
                                tj3 tj3Var5 = (tj3) ye1Var5;
                                if (!tj3Var5.m22099R(iIntValue4 & 1, (iIntValue4 & 3) != 2)) {
                                    tj3Var5.m22102U();
                                } else {
                                    boolean zM22124i7 = tj3Var5.m22124i(c2779e6);
                                    Object objM22097O13 = tj3Var5.m22097O();
                                    if (zM22124i7 || objM22097O13 == p84Var2) {
                                        objM22097O13 = new js8(c2779e6, 7);
                                        tj3Var5.m22131l0(objM22097O13);
                                    }
                                    AbstractC0231g.m1153f(805306368, 510, null, tj3Var5, (ui3) objM22097O13, slc.f60992b, null, null, null, false);
                                }
                                break;
                            case 4:
                                ye1 ye1Var6 = (ye1) obj;
                                int iIntValue5 = ((Integer) obj2).intValue();
                                tj3 tj3Var6 = (tj3) ye1Var6;
                                if (!tj3Var6.m22099R(iIntValue5 & 1, (iIntValue5 & 3) != 2)) {
                                    tj3Var6.m22102U();
                                } else {
                                    boolean zM22124i8 = tj3Var6.m22124i(c2779e6);
                                    Object objM22097O14 = tj3Var6.m22097O();
                                    if (zM22124i8 || objM22097O14 == p84Var2) {
                                        objM22097O14 = new js8(c2779e6, 10);
                                        tj3Var6.m22131l0(objM22097O14);
                                    }
                                    AbstractC0231g.m1153f(805306368, 510, null, tj3Var6, (ui3) objM22097O14, slc.f60994d, null, null, null, false);
                                }
                                break;
                            case 5:
                                ye1 ye1Var7 = (ye1) obj;
                                int iIntValue6 = ((Integer) obj2).intValue();
                                tj3 tj3Var7 = (tj3) ye1Var7;
                                if (!tj3Var7.m22099R(iIntValue6 & 1, (iIntValue6 & 3) != 2)) {
                                    tj3Var7.m22102U();
                                } else {
                                    boolean zM22124i9 = tj3Var7.m22124i(c2779e6);
                                    Object objM22097O15 = tj3Var7.m22097O();
                                    if (zM22124i9 || objM22097O15 == p84Var2) {
                                        objM22097O15 = new js8(c2779e6, 9);
                                        tj3Var7.m22131l0(objM22097O15);
                                    }
                                    AbstractC0231g.m1153f(805306368, 510, null, tj3Var7, (ui3) objM22097O15, slc.f60995e, null, null, null, false);
                                }
                                break;
                            case 6:
                                ye1 ye1Var8 = (ye1) obj;
                                int iIntValue7 = ((Integer) obj2).intValue();
                                tj3 tj3Var8 = (tj3) ye1Var8;
                                if (!tj3Var8.m22099R(iIntValue7 & 1, (iIntValue7 & 3) != 2)) {
                                    tj3Var8.m22102U();
                                } else {
                                    boolean zM22124i10 = tj3Var8.m22124i(c2779e6);
                                    Object objM22097O16 = tj3Var8.m22097O();
                                    if (zM22124i10 || objM22097O16 == p84Var2) {
                                        objM22097O16 = new js8(c2779e6, 11);
                                        tj3Var8.m22131l0(objM22097O16);
                                    }
                                    AbstractC0231g.m1153f(805306368, 510, null, tj3Var8, (ui3) objM22097O16, slc.f60997g, null, null, null, false);
                                }
                                break;
                            case 7:
                                ye1 ye1Var9 = (ye1) obj;
                                int iIntValue8 = ((Integer) obj2).intValue();
                                tj3 tj3Var9 = (tj3) ye1Var9;
                                if (!tj3Var9.m22099R(iIntValue8 & 1, (iIntValue8 & 3) != 2)) {
                                    tj3Var9.m22102U();
                                } else {
                                    boolean zM22124i11 = tj3Var9.m22124i(c2779e6);
                                    Object objM22097O17 = tj3Var9.m22097O();
                                    if (zM22124i11 || objM22097O17 == p84Var2) {
                                        objM22097O17 = new js8(c2779e6, 5);
                                        tj3Var9.m22131l0(objM22097O17);
                                    }
                                    AbstractC0231g.m1153f(805306368, 510, null, tj3Var9, (ui3) objM22097O17, slc.f60998h, null, null, null, false);
                                }
                                break;
                            default:
                                ye1 ye1Var10 = (ye1) obj;
                                int iIntValue9 = ((Integer) obj2).intValue();
                                tj3 tj3Var10 = (tj3) ye1Var10;
                                if (!tj3Var10.m22099R(iIntValue9 & 1, (iIntValue9 & 3) != 2)) {
                                    tj3Var10.m22102U();
                                } else {
                                    boolean zM22124i12 = tj3Var10.m22124i(c2779e6);
                                    Object objM22097O18 = tj3Var10.m22097O();
                                    if (zM22124i12 || objM22097O18 == p84Var2) {
                                        objM22097O18 = new js8(c2779e6, 4);
                                        tj3Var10.m22131l0(objM22097O18);
                                    }
                                    AbstractC0231g.m1153f(805306368, 510, null, tj3Var10, (ui3) objM22097O18, slc.f61000j, null, null, null, false);
                                }
                                break;
                        }
                        return xfaVar;
                    }
                }, tj3Var), null, slc.f60993c, ci8.m4703P(-1313783699, new ht6(ij7Var2, 20), tj3Var), null, 0L, 0L, 0L, 0L, null, tj3Var, 1772592, 16276);
                tj3Var = tj3Var;
                z = false;
                tj3Var.m22139q(false);
            }
            fm6 fm6Var2 = ((xs8) t66Var6.getValue()).f68658g;
            if (fm6Var2 == null) {
                tj3Var.m22111b0(2025535012);
                tj3Var.m22139q(z);
                i5 = 1;
            } else {
                tj3Var.m22111b0(2025535013);
                boolean zM22124i4 = tj3Var.m22124i(c2779e4);
                Object objM22097O10 = tj3Var.m22097O();
                if (zM22124i4 || objM22097O10 == p84Var) {
                    i5 = 1;
                    objM22097O10 = new js8(c2779e4, 1);
                    tj3Var.m22131l0(objM22097O10);
                } else {
                    i5 = 1;
                }
                final int i9 = 5;
                tj3 tj3Var2 = tj3Var;
                q2d.m19625a((ui3) objM22097O10, ci8.m4703P(992542571, new zi3() { // from class: is8
                    @Override // p000.zi3
                    public final Object invoke(Object obj, Object obj2) {
                        int i10 = i8;
                        xfa xfaVar = xfa.f68157a;
                        p84 p84Var2 = we1.f66679a;
                        C2779e c2779e6 = c2779e4;
                        switch (i10) {
                            case 0:
                                ye1 ye1Var2 = (ye1) obj;
                                int iIntValue = ((Integer) obj2).intValue();
                                tj3 tj3Var3 = (tj3) ye1Var2;
                                if (!tj3Var3.m22099R(iIntValue & 1, (iIntValue & 3) != 2)) {
                                    tj3Var3.m22102U();
                                } else {
                                    boolean zM22124i5 = tj3Var3.m22124i(c2779e6);
                                    Object objM22097O11 = tj3Var3.m22097O();
                                    if (zM22124i5 || objM22097O11 == p84Var2) {
                                        objM22097O11 = new js8(c2779e6, 8);
                                        tj3Var3.m22131l0(objM22097O11);
                                    }
                                    AbstractC0231g.m1153f(805306368, 510, null, tj3Var3, (ui3) objM22097O11, slc.f61001k, null, null, null, false);
                                }
                                break;
                            case 1:
                                ye1 ye1Var3 = (ye1) obj;
                                int iIntValue2 = ((Integer) obj2).intValue();
                                tj3 tj3Var4 = (tj3) ye1Var3;
                                if (!tj3Var4.m22099R(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                                    tj3Var4.m22102U();
                                } else {
                                    boolean zM22124i6 = tj3Var4.m22124i(c2779e6);
                                    Object objM22097O12 = tj3Var4.m22097O();
                                    if (zM22124i6 || objM22097O12 == p84Var2) {
                                        objM22097O12 = new js8(c2779e6, 3);
                                        tj3Var4.m22131l0(objM22097O12);
                                    }
                                    AbstractC0231g.m1153f(805306368, 510, null, tj3Var4, (ui3) objM22097O12, slc.f61003m, null, null, null, false);
                                }
                                break;
                            case 2:
                                ye1 ye1Var4 = (ye1) obj;
                                int iIntValue3 = ((Integer) obj2).intValue();
                                tj3 tj3Var5 = (tj3) ye1Var4;
                                if (!tj3Var5.m22099R(iIntValue3 & 1, (iIntValue3 & 3) != 2)) {
                                    tj3Var5.m22102U();
                                } else {
                                    boolean zM22124i7 = tj3Var5.m22124i(c2779e6);
                                    Object objM22097O13 = tj3Var5.m22097O();
                                    if (zM22124i7 || objM22097O13 == p84Var2) {
                                        objM22097O13 = new js8(c2779e6, 6);
                                        tj3Var5.m22131l0(objM22097O13);
                                    }
                                    AbstractC0231g.m1153f(805306368, 510, null, tj3Var5, (ui3) objM22097O13, slc.f61004n, null, null, null, false);
                                }
                                break;
                            case 3:
                                ye1 ye1Var5 = (ye1) obj;
                                int iIntValue4 = ((Integer) obj2).intValue();
                                tj3 tj3Var6 = (tj3) ye1Var5;
                                if (!tj3Var6.m22099R(iIntValue4 & 1, (iIntValue4 & 3) != 2)) {
                                    tj3Var6.m22102U();
                                } else {
                                    boolean zM22124i8 = tj3Var6.m22124i(c2779e6);
                                    Object objM22097O14 = tj3Var6.m22097O();
                                    if (zM22124i8 || objM22097O14 == p84Var2) {
                                        objM22097O14 = new js8(c2779e6, 7);
                                        tj3Var6.m22131l0(objM22097O14);
                                    }
                                    AbstractC0231g.m1153f(805306368, 510, null, tj3Var6, (ui3) objM22097O14, slc.f60992b, null, null, null, false);
                                }
                                break;
                            case 4:
                                ye1 ye1Var6 = (ye1) obj;
                                int iIntValue5 = ((Integer) obj2).intValue();
                                tj3 tj3Var7 = (tj3) ye1Var6;
                                if (!tj3Var7.m22099R(iIntValue5 & 1, (iIntValue5 & 3) != 2)) {
                                    tj3Var7.m22102U();
                                } else {
                                    boolean zM22124i9 = tj3Var7.m22124i(c2779e6);
                                    Object objM22097O15 = tj3Var7.m22097O();
                                    if (zM22124i9 || objM22097O15 == p84Var2) {
                                        objM22097O15 = new js8(c2779e6, 10);
                                        tj3Var7.m22131l0(objM22097O15);
                                    }
                                    AbstractC0231g.m1153f(805306368, 510, null, tj3Var7, (ui3) objM22097O15, slc.f60994d, null, null, null, false);
                                }
                                break;
                            case 5:
                                ye1 ye1Var7 = (ye1) obj;
                                int iIntValue6 = ((Integer) obj2).intValue();
                                tj3 tj3Var8 = (tj3) ye1Var7;
                                if (!tj3Var8.m22099R(iIntValue6 & 1, (iIntValue6 & 3) != 2)) {
                                    tj3Var8.m22102U();
                                } else {
                                    boolean zM22124i10 = tj3Var8.m22124i(c2779e6);
                                    Object objM22097O16 = tj3Var8.m22097O();
                                    if (zM22124i10 || objM22097O16 == p84Var2) {
                                        objM22097O16 = new js8(c2779e6, 9);
                                        tj3Var8.m22131l0(objM22097O16);
                                    }
                                    AbstractC0231g.m1153f(805306368, 510, null, tj3Var8, (ui3) objM22097O16, slc.f60995e, null, null, null, false);
                                }
                                break;
                            case 6:
                                ye1 ye1Var8 = (ye1) obj;
                                int iIntValue7 = ((Integer) obj2).intValue();
                                tj3 tj3Var9 = (tj3) ye1Var8;
                                if (!tj3Var9.m22099R(iIntValue7 & 1, (iIntValue7 & 3) != 2)) {
                                    tj3Var9.m22102U();
                                } else {
                                    boolean zM22124i11 = tj3Var9.m22124i(c2779e6);
                                    Object objM22097O17 = tj3Var9.m22097O();
                                    if (zM22124i11 || objM22097O17 == p84Var2) {
                                        objM22097O17 = new js8(c2779e6, 11);
                                        tj3Var9.m22131l0(objM22097O17);
                                    }
                                    AbstractC0231g.m1153f(805306368, 510, null, tj3Var9, (ui3) objM22097O17, slc.f60997g, null, null, null, false);
                                }
                                break;
                            case 7:
                                ye1 ye1Var9 = (ye1) obj;
                                int iIntValue8 = ((Integer) obj2).intValue();
                                tj3 tj3Var10 = (tj3) ye1Var9;
                                if (!tj3Var10.m22099R(iIntValue8 & 1, (iIntValue8 & 3) != 2)) {
                                    tj3Var10.m22102U();
                                } else {
                                    boolean zM22124i12 = tj3Var10.m22124i(c2779e6);
                                    Object objM22097O18 = tj3Var10.m22097O();
                                    if (zM22124i12 || objM22097O18 == p84Var2) {
                                        objM22097O18 = new js8(c2779e6, 5);
                                        tj3Var10.m22131l0(objM22097O18);
                                    }
                                    AbstractC0231g.m1153f(805306368, 510, null, tj3Var10, (ui3) objM22097O18, slc.f60998h, null, null, null, false);
                                }
                                break;
                            default:
                                ye1 ye1Var10 = (ye1) obj;
                                int iIntValue9 = ((Integer) obj2).intValue();
                                tj3 tj3Var11 = (tj3) ye1Var10;
                                if (!tj3Var11.m22099R(iIntValue9 & 1, (iIntValue9 & 3) != 2)) {
                                    tj3Var11.m22102U();
                                } else {
                                    boolean zM22124i13 = tj3Var11.m22124i(c2779e6);
                                    Object objM22097O19 = tj3Var11.m22097O();
                                    if (zM22124i13 || objM22097O19 == p84Var2) {
                                        objM22097O19 = new js8(c2779e6, 4);
                                        tj3Var11.m22131l0(objM22097O19);
                                    }
                                    AbstractC0231g.m1153f(805306368, 510, null, tj3Var11, (ui3) objM22097O19, slc.f61000j, null, null, null, false);
                                }
                                break;
                        }
                        return xfaVar;
                    }
                }, tj3Var), null, ci8.m4703P(765321581, new zi3() { // from class: is8
                    @Override // p000.zi3
                    public final Object invoke(Object obj, Object obj2) {
                        int i10 = i9;
                        xfa xfaVar = xfa.f68157a;
                        p84 p84Var2 = we1.f66679a;
                        C2779e c2779e6 = c2779e4;
                        switch (i10) {
                            case 0:
                                ye1 ye1Var2 = (ye1) obj;
                                int iIntValue = ((Integer) obj2).intValue();
                                tj3 tj3Var3 = (tj3) ye1Var2;
                                if (!tj3Var3.m22099R(iIntValue & 1, (iIntValue & 3) != 2)) {
                                    tj3Var3.m22102U();
                                } else {
                                    boolean zM22124i5 = tj3Var3.m22124i(c2779e6);
                                    Object objM22097O11 = tj3Var3.m22097O();
                                    if (zM22124i5 || objM22097O11 == p84Var2) {
                                        objM22097O11 = new js8(c2779e6, 8);
                                        tj3Var3.m22131l0(objM22097O11);
                                    }
                                    AbstractC0231g.m1153f(805306368, 510, null, tj3Var3, (ui3) objM22097O11, slc.f61001k, null, null, null, false);
                                }
                                break;
                            case 1:
                                ye1 ye1Var3 = (ye1) obj;
                                int iIntValue2 = ((Integer) obj2).intValue();
                                tj3 tj3Var4 = (tj3) ye1Var3;
                                if (!tj3Var4.m22099R(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                                    tj3Var4.m22102U();
                                } else {
                                    boolean zM22124i6 = tj3Var4.m22124i(c2779e6);
                                    Object objM22097O12 = tj3Var4.m22097O();
                                    if (zM22124i6 || objM22097O12 == p84Var2) {
                                        objM22097O12 = new js8(c2779e6, 3);
                                        tj3Var4.m22131l0(objM22097O12);
                                    }
                                    AbstractC0231g.m1153f(805306368, 510, null, tj3Var4, (ui3) objM22097O12, slc.f61003m, null, null, null, false);
                                }
                                break;
                            case 2:
                                ye1 ye1Var4 = (ye1) obj;
                                int iIntValue3 = ((Integer) obj2).intValue();
                                tj3 tj3Var5 = (tj3) ye1Var4;
                                if (!tj3Var5.m22099R(iIntValue3 & 1, (iIntValue3 & 3) != 2)) {
                                    tj3Var5.m22102U();
                                } else {
                                    boolean zM22124i7 = tj3Var5.m22124i(c2779e6);
                                    Object objM22097O13 = tj3Var5.m22097O();
                                    if (zM22124i7 || objM22097O13 == p84Var2) {
                                        objM22097O13 = new js8(c2779e6, 6);
                                        tj3Var5.m22131l0(objM22097O13);
                                    }
                                    AbstractC0231g.m1153f(805306368, 510, null, tj3Var5, (ui3) objM22097O13, slc.f61004n, null, null, null, false);
                                }
                                break;
                            case 3:
                                ye1 ye1Var5 = (ye1) obj;
                                int iIntValue4 = ((Integer) obj2).intValue();
                                tj3 tj3Var6 = (tj3) ye1Var5;
                                if (!tj3Var6.m22099R(iIntValue4 & 1, (iIntValue4 & 3) != 2)) {
                                    tj3Var6.m22102U();
                                } else {
                                    boolean zM22124i8 = tj3Var6.m22124i(c2779e6);
                                    Object objM22097O14 = tj3Var6.m22097O();
                                    if (zM22124i8 || objM22097O14 == p84Var2) {
                                        objM22097O14 = new js8(c2779e6, 7);
                                        tj3Var6.m22131l0(objM22097O14);
                                    }
                                    AbstractC0231g.m1153f(805306368, 510, null, tj3Var6, (ui3) objM22097O14, slc.f60992b, null, null, null, false);
                                }
                                break;
                            case 4:
                                ye1 ye1Var6 = (ye1) obj;
                                int iIntValue5 = ((Integer) obj2).intValue();
                                tj3 tj3Var7 = (tj3) ye1Var6;
                                if (!tj3Var7.m22099R(iIntValue5 & 1, (iIntValue5 & 3) != 2)) {
                                    tj3Var7.m22102U();
                                } else {
                                    boolean zM22124i9 = tj3Var7.m22124i(c2779e6);
                                    Object objM22097O15 = tj3Var7.m22097O();
                                    if (zM22124i9 || objM22097O15 == p84Var2) {
                                        objM22097O15 = new js8(c2779e6, 10);
                                        tj3Var7.m22131l0(objM22097O15);
                                    }
                                    AbstractC0231g.m1153f(805306368, 510, null, tj3Var7, (ui3) objM22097O15, slc.f60994d, null, null, null, false);
                                }
                                break;
                            case 5:
                                ye1 ye1Var7 = (ye1) obj;
                                int iIntValue6 = ((Integer) obj2).intValue();
                                tj3 tj3Var8 = (tj3) ye1Var7;
                                if (!tj3Var8.m22099R(iIntValue6 & 1, (iIntValue6 & 3) != 2)) {
                                    tj3Var8.m22102U();
                                } else {
                                    boolean zM22124i10 = tj3Var8.m22124i(c2779e6);
                                    Object objM22097O16 = tj3Var8.m22097O();
                                    if (zM22124i10 || objM22097O16 == p84Var2) {
                                        objM22097O16 = new js8(c2779e6, 9);
                                        tj3Var8.m22131l0(objM22097O16);
                                    }
                                    AbstractC0231g.m1153f(805306368, 510, null, tj3Var8, (ui3) objM22097O16, slc.f60995e, null, null, null, false);
                                }
                                break;
                            case 6:
                                ye1 ye1Var8 = (ye1) obj;
                                int iIntValue7 = ((Integer) obj2).intValue();
                                tj3 tj3Var9 = (tj3) ye1Var8;
                                if (!tj3Var9.m22099R(iIntValue7 & 1, (iIntValue7 & 3) != 2)) {
                                    tj3Var9.m22102U();
                                } else {
                                    boolean zM22124i11 = tj3Var9.m22124i(c2779e6);
                                    Object objM22097O17 = tj3Var9.m22097O();
                                    if (zM22124i11 || objM22097O17 == p84Var2) {
                                        objM22097O17 = new js8(c2779e6, 11);
                                        tj3Var9.m22131l0(objM22097O17);
                                    }
                                    AbstractC0231g.m1153f(805306368, 510, null, tj3Var9, (ui3) objM22097O17, slc.f60997g, null, null, null, false);
                                }
                                break;
                            case 7:
                                ye1 ye1Var9 = (ye1) obj;
                                int iIntValue8 = ((Integer) obj2).intValue();
                                tj3 tj3Var10 = (tj3) ye1Var9;
                                if (!tj3Var10.m22099R(iIntValue8 & 1, (iIntValue8 & 3) != 2)) {
                                    tj3Var10.m22102U();
                                } else {
                                    boolean zM22124i12 = tj3Var10.m22124i(c2779e6);
                                    Object objM22097O18 = tj3Var10.m22097O();
                                    if (zM22124i12 || objM22097O18 == p84Var2) {
                                        objM22097O18 = new js8(c2779e6, 5);
                                        tj3Var10.m22131l0(objM22097O18);
                                    }
                                    AbstractC0231g.m1153f(805306368, 510, null, tj3Var10, (ui3) objM22097O18, slc.f60998h, null, null, null, false);
                                }
                                break;
                            default:
                                ye1 ye1Var10 = (ye1) obj;
                                int iIntValue9 = ((Integer) obj2).intValue();
                                tj3 tj3Var11 = (tj3) ye1Var10;
                                if (!tj3Var11.m22099R(iIntValue9 & 1, (iIntValue9 & 3) != 2)) {
                                    tj3Var11.m22102U();
                                } else {
                                    boolean zM22124i13 = tj3Var11.m22124i(c2779e6);
                                    Object objM22097O19 = tj3Var11.m22097O();
                                    if (zM22124i13 || objM22097O19 == p84Var2) {
                                        objM22097O19 = new js8(c2779e6, 4);
                                        tj3Var11.m22131l0(objM22097O19);
                                    }
                                    AbstractC0231g.m1153f(805306368, 510, null, tj3Var11, (ui3) objM22097O19, slc.f61000j, null, null, null, false);
                                }
                                break;
                        }
                        return xfaVar;
                    }
                }, tj3Var), null, slc.f60996f, ci8.m4703P(424490096, new ht6(fm6Var2, 22), tj3Var), null, 0L, 0L, 0L, 0L, null, tj3Var2, 1772592, 16276);
                tj3Var = tj3Var2;
                tj3Var.m22139q(false);
            }
            if (((xs8) t66Var6.getValue()).f68659h) {
                tj3Var.m22111b0(2026769650);
                boolean zM22124i5 = tj3Var.m22124i(c2779e4);
                Object objM22097O11 = tj3Var.m22097O();
                if (zM22124i5 || objM22097O11 == p84Var) {
                    objM22097O11 = new js8(c2779e4, 12);
                    tj3Var.m22131l0(objM22097O11);
                }
                ui3 ui3Var = (ui3) objM22097O11;
                final int i10 = 6;
                C0282a c0282aM4703P = ci8.m4703P(1414909106, new zi3() { // from class: is8
                    @Override // p000.zi3
                    public final Object invoke(Object obj, Object obj2) {
                        int i11 = i10;
                        xfa xfaVar = xfa.f68157a;
                        p84 p84Var2 = we1.f66679a;
                        C2779e c2779e6 = c2779e4;
                        switch (i11) {
                            case 0:
                                ye1 ye1Var2 = (ye1) obj;
                                int iIntValue = ((Integer) obj2).intValue();
                                tj3 tj3Var3 = (tj3) ye1Var2;
                                if (!tj3Var3.m22099R(iIntValue & 1, (iIntValue & 3) != 2)) {
                                    tj3Var3.m22102U();
                                } else {
                                    boolean zM22124i6 = tj3Var3.m22124i(c2779e6);
                                    Object objM22097O12 = tj3Var3.m22097O();
                                    if (zM22124i6 || objM22097O12 == p84Var2) {
                                        objM22097O12 = new js8(c2779e6, 8);
                                        tj3Var3.m22131l0(objM22097O12);
                                    }
                                    AbstractC0231g.m1153f(805306368, 510, null, tj3Var3, (ui3) objM22097O12, slc.f61001k, null, null, null, false);
                                }
                                break;
                            case 1:
                                ye1 ye1Var3 = (ye1) obj;
                                int iIntValue2 = ((Integer) obj2).intValue();
                                tj3 tj3Var4 = (tj3) ye1Var3;
                                if (!tj3Var4.m22099R(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                                    tj3Var4.m22102U();
                                } else {
                                    boolean zM22124i7 = tj3Var4.m22124i(c2779e6);
                                    Object objM22097O13 = tj3Var4.m22097O();
                                    if (zM22124i7 || objM22097O13 == p84Var2) {
                                        objM22097O13 = new js8(c2779e6, 3);
                                        tj3Var4.m22131l0(objM22097O13);
                                    }
                                    AbstractC0231g.m1153f(805306368, 510, null, tj3Var4, (ui3) objM22097O13, slc.f61003m, null, null, null, false);
                                }
                                break;
                            case 2:
                                ye1 ye1Var4 = (ye1) obj;
                                int iIntValue3 = ((Integer) obj2).intValue();
                                tj3 tj3Var5 = (tj3) ye1Var4;
                                if (!tj3Var5.m22099R(iIntValue3 & 1, (iIntValue3 & 3) != 2)) {
                                    tj3Var5.m22102U();
                                } else {
                                    boolean zM22124i8 = tj3Var5.m22124i(c2779e6);
                                    Object objM22097O14 = tj3Var5.m22097O();
                                    if (zM22124i8 || objM22097O14 == p84Var2) {
                                        objM22097O14 = new js8(c2779e6, 6);
                                        tj3Var5.m22131l0(objM22097O14);
                                    }
                                    AbstractC0231g.m1153f(805306368, 510, null, tj3Var5, (ui3) objM22097O14, slc.f61004n, null, null, null, false);
                                }
                                break;
                            case 3:
                                ye1 ye1Var5 = (ye1) obj;
                                int iIntValue4 = ((Integer) obj2).intValue();
                                tj3 tj3Var6 = (tj3) ye1Var5;
                                if (!tj3Var6.m22099R(iIntValue4 & 1, (iIntValue4 & 3) != 2)) {
                                    tj3Var6.m22102U();
                                } else {
                                    boolean zM22124i9 = tj3Var6.m22124i(c2779e6);
                                    Object objM22097O15 = tj3Var6.m22097O();
                                    if (zM22124i9 || objM22097O15 == p84Var2) {
                                        objM22097O15 = new js8(c2779e6, 7);
                                        tj3Var6.m22131l0(objM22097O15);
                                    }
                                    AbstractC0231g.m1153f(805306368, 510, null, tj3Var6, (ui3) objM22097O15, slc.f60992b, null, null, null, false);
                                }
                                break;
                            case 4:
                                ye1 ye1Var6 = (ye1) obj;
                                int iIntValue5 = ((Integer) obj2).intValue();
                                tj3 tj3Var7 = (tj3) ye1Var6;
                                if (!tj3Var7.m22099R(iIntValue5 & 1, (iIntValue5 & 3) != 2)) {
                                    tj3Var7.m22102U();
                                } else {
                                    boolean zM22124i10 = tj3Var7.m22124i(c2779e6);
                                    Object objM22097O16 = tj3Var7.m22097O();
                                    if (zM22124i10 || objM22097O16 == p84Var2) {
                                        objM22097O16 = new js8(c2779e6, 10);
                                        tj3Var7.m22131l0(objM22097O16);
                                    }
                                    AbstractC0231g.m1153f(805306368, 510, null, tj3Var7, (ui3) objM22097O16, slc.f60994d, null, null, null, false);
                                }
                                break;
                            case 5:
                                ye1 ye1Var7 = (ye1) obj;
                                int iIntValue6 = ((Integer) obj2).intValue();
                                tj3 tj3Var8 = (tj3) ye1Var7;
                                if (!tj3Var8.m22099R(iIntValue6 & 1, (iIntValue6 & 3) != 2)) {
                                    tj3Var8.m22102U();
                                } else {
                                    boolean zM22124i11 = tj3Var8.m22124i(c2779e6);
                                    Object objM22097O17 = tj3Var8.m22097O();
                                    if (zM22124i11 || objM22097O17 == p84Var2) {
                                        objM22097O17 = new js8(c2779e6, 9);
                                        tj3Var8.m22131l0(objM22097O17);
                                    }
                                    AbstractC0231g.m1153f(805306368, 510, null, tj3Var8, (ui3) objM22097O17, slc.f60995e, null, null, null, false);
                                }
                                break;
                            case 6:
                                ye1 ye1Var8 = (ye1) obj;
                                int iIntValue7 = ((Integer) obj2).intValue();
                                tj3 tj3Var9 = (tj3) ye1Var8;
                                if (!tj3Var9.m22099R(iIntValue7 & 1, (iIntValue7 & 3) != 2)) {
                                    tj3Var9.m22102U();
                                } else {
                                    boolean zM22124i12 = tj3Var9.m22124i(c2779e6);
                                    Object objM22097O18 = tj3Var9.m22097O();
                                    if (zM22124i12 || objM22097O18 == p84Var2) {
                                        objM22097O18 = new js8(c2779e6, 11);
                                        tj3Var9.m22131l0(objM22097O18);
                                    }
                                    AbstractC0231g.m1153f(805306368, 510, null, tj3Var9, (ui3) objM22097O18, slc.f60997g, null, null, null, false);
                                }
                                break;
                            case 7:
                                ye1 ye1Var9 = (ye1) obj;
                                int iIntValue8 = ((Integer) obj2).intValue();
                                tj3 tj3Var10 = (tj3) ye1Var9;
                                if (!tj3Var10.m22099R(iIntValue8 & 1, (iIntValue8 & 3) != 2)) {
                                    tj3Var10.m22102U();
                                } else {
                                    boolean zM22124i13 = tj3Var10.m22124i(c2779e6);
                                    Object objM22097O19 = tj3Var10.m22097O();
                                    if (zM22124i13 || objM22097O19 == p84Var2) {
                                        objM22097O19 = new js8(c2779e6, 5);
                                        tj3Var10.m22131l0(objM22097O19);
                                    }
                                    AbstractC0231g.m1153f(805306368, 510, null, tj3Var10, (ui3) objM22097O19, slc.f60998h, null, null, null, false);
                                }
                                break;
                            default:
                                ye1 ye1Var10 = (ye1) obj;
                                int iIntValue9 = ((Integer) obj2).intValue();
                                tj3 tj3Var11 = (tj3) ye1Var10;
                                if (!tj3Var11.m22099R(iIntValue9 & 1, (iIntValue9 & 3) != 2)) {
                                    tj3Var11.m22102U();
                                } else {
                                    boolean zM22124i14 = tj3Var11.m22124i(c2779e6);
                                    Object objM22097O110 = tj3Var11.m22097O();
                                    if (zM22124i14 || objM22097O110 == p84Var2) {
                                        objM22097O110 = new js8(c2779e6, 4);
                                        tj3Var11.m22131l0(objM22097O110);
                                    }
                                    AbstractC0231g.m1153f(805306368, 510, null, tj3Var11, (ui3) objM22097O110, slc.f61000j, null, null, null, false);
                                }
                                break;
                        }
                        return xfaVar;
                    }
                }, tj3Var);
                final int i11 = 7;
                tj3 tj3Var3 = tj3Var;
                q2d.m19625a(ui3Var, c0282aM4703P, null, ci8.m4703P(-1722525900, new zi3() { // from class: is8
                    @Override // p000.zi3
                    public final Object invoke(Object obj, Object obj2) {
                        int i12 = i11;
                        xfa xfaVar = xfa.f68157a;
                        p84 p84Var2 = we1.f66679a;
                        C2779e c2779e6 = c2779e4;
                        switch (i12) {
                            case 0:
                                ye1 ye1Var2 = (ye1) obj;
                                int iIntValue = ((Integer) obj2).intValue();
                                tj3 tj3Var4 = (tj3) ye1Var2;
                                if (!tj3Var4.m22099R(iIntValue & 1, (iIntValue & 3) != 2)) {
                                    tj3Var4.m22102U();
                                } else {
                                    boolean zM22124i6 = tj3Var4.m22124i(c2779e6);
                                    Object objM22097O12 = tj3Var4.m22097O();
                                    if (zM22124i6 || objM22097O12 == p84Var2) {
                                        objM22097O12 = new js8(c2779e6, 8);
                                        tj3Var4.m22131l0(objM22097O12);
                                    }
                                    AbstractC0231g.m1153f(805306368, 510, null, tj3Var4, (ui3) objM22097O12, slc.f61001k, null, null, null, false);
                                }
                                break;
                            case 1:
                                ye1 ye1Var3 = (ye1) obj;
                                int iIntValue2 = ((Integer) obj2).intValue();
                                tj3 tj3Var5 = (tj3) ye1Var3;
                                if (!tj3Var5.m22099R(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                                    tj3Var5.m22102U();
                                } else {
                                    boolean zM22124i7 = tj3Var5.m22124i(c2779e6);
                                    Object objM22097O13 = tj3Var5.m22097O();
                                    if (zM22124i7 || objM22097O13 == p84Var2) {
                                        objM22097O13 = new js8(c2779e6, 3);
                                        tj3Var5.m22131l0(objM22097O13);
                                    }
                                    AbstractC0231g.m1153f(805306368, 510, null, tj3Var5, (ui3) objM22097O13, slc.f61003m, null, null, null, false);
                                }
                                break;
                            case 2:
                                ye1 ye1Var4 = (ye1) obj;
                                int iIntValue3 = ((Integer) obj2).intValue();
                                tj3 tj3Var6 = (tj3) ye1Var4;
                                if (!tj3Var6.m22099R(iIntValue3 & 1, (iIntValue3 & 3) != 2)) {
                                    tj3Var6.m22102U();
                                } else {
                                    boolean zM22124i8 = tj3Var6.m22124i(c2779e6);
                                    Object objM22097O14 = tj3Var6.m22097O();
                                    if (zM22124i8 || objM22097O14 == p84Var2) {
                                        objM22097O14 = new js8(c2779e6, 6);
                                        tj3Var6.m22131l0(objM22097O14);
                                    }
                                    AbstractC0231g.m1153f(805306368, 510, null, tj3Var6, (ui3) objM22097O14, slc.f61004n, null, null, null, false);
                                }
                                break;
                            case 3:
                                ye1 ye1Var5 = (ye1) obj;
                                int iIntValue4 = ((Integer) obj2).intValue();
                                tj3 tj3Var7 = (tj3) ye1Var5;
                                if (!tj3Var7.m22099R(iIntValue4 & 1, (iIntValue4 & 3) != 2)) {
                                    tj3Var7.m22102U();
                                } else {
                                    boolean zM22124i9 = tj3Var7.m22124i(c2779e6);
                                    Object objM22097O15 = tj3Var7.m22097O();
                                    if (zM22124i9 || objM22097O15 == p84Var2) {
                                        objM22097O15 = new js8(c2779e6, 7);
                                        tj3Var7.m22131l0(objM22097O15);
                                    }
                                    AbstractC0231g.m1153f(805306368, 510, null, tj3Var7, (ui3) objM22097O15, slc.f60992b, null, null, null, false);
                                }
                                break;
                            case 4:
                                ye1 ye1Var6 = (ye1) obj;
                                int iIntValue5 = ((Integer) obj2).intValue();
                                tj3 tj3Var8 = (tj3) ye1Var6;
                                if (!tj3Var8.m22099R(iIntValue5 & 1, (iIntValue5 & 3) != 2)) {
                                    tj3Var8.m22102U();
                                } else {
                                    boolean zM22124i10 = tj3Var8.m22124i(c2779e6);
                                    Object objM22097O16 = tj3Var8.m22097O();
                                    if (zM22124i10 || objM22097O16 == p84Var2) {
                                        objM22097O16 = new js8(c2779e6, 10);
                                        tj3Var8.m22131l0(objM22097O16);
                                    }
                                    AbstractC0231g.m1153f(805306368, 510, null, tj3Var8, (ui3) objM22097O16, slc.f60994d, null, null, null, false);
                                }
                                break;
                            case 5:
                                ye1 ye1Var7 = (ye1) obj;
                                int iIntValue6 = ((Integer) obj2).intValue();
                                tj3 tj3Var9 = (tj3) ye1Var7;
                                if (!tj3Var9.m22099R(iIntValue6 & 1, (iIntValue6 & 3) != 2)) {
                                    tj3Var9.m22102U();
                                } else {
                                    boolean zM22124i11 = tj3Var9.m22124i(c2779e6);
                                    Object objM22097O17 = tj3Var9.m22097O();
                                    if (zM22124i11 || objM22097O17 == p84Var2) {
                                        objM22097O17 = new js8(c2779e6, 9);
                                        tj3Var9.m22131l0(objM22097O17);
                                    }
                                    AbstractC0231g.m1153f(805306368, 510, null, tj3Var9, (ui3) objM22097O17, slc.f60995e, null, null, null, false);
                                }
                                break;
                            case 6:
                                ye1 ye1Var8 = (ye1) obj;
                                int iIntValue7 = ((Integer) obj2).intValue();
                                tj3 tj3Var10 = (tj3) ye1Var8;
                                if (!tj3Var10.m22099R(iIntValue7 & 1, (iIntValue7 & 3) != 2)) {
                                    tj3Var10.m22102U();
                                } else {
                                    boolean zM22124i12 = tj3Var10.m22124i(c2779e6);
                                    Object objM22097O18 = tj3Var10.m22097O();
                                    if (zM22124i12 || objM22097O18 == p84Var2) {
                                        objM22097O18 = new js8(c2779e6, 11);
                                        tj3Var10.m22131l0(objM22097O18);
                                    }
                                    AbstractC0231g.m1153f(805306368, 510, null, tj3Var10, (ui3) objM22097O18, slc.f60997g, null, null, null, false);
                                }
                                break;
                            case 7:
                                ye1 ye1Var9 = (ye1) obj;
                                int iIntValue8 = ((Integer) obj2).intValue();
                                tj3 tj3Var11 = (tj3) ye1Var9;
                                if (!tj3Var11.m22099R(iIntValue8 & 1, (iIntValue8 & 3) != 2)) {
                                    tj3Var11.m22102U();
                                } else {
                                    boolean zM22124i13 = tj3Var11.m22124i(c2779e6);
                                    Object objM22097O19 = tj3Var11.m22097O();
                                    if (zM22124i13 || objM22097O19 == p84Var2) {
                                        objM22097O19 = new js8(c2779e6, 5);
                                        tj3Var11.m22131l0(objM22097O19);
                                    }
                                    AbstractC0231g.m1153f(805306368, 510, null, tj3Var11, (ui3) objM22097O19, slc.f60998h, null, null, null, false);
                                }
                                break;
                            default:
                                ye1 ye1Var10 = (ye1) obj;
                                int iIntValue9 = ((Integer) obj2).intValue();
                                tj3 tj3Var12 = (tj3) ye1Var10;
                                if (!tj3Var12.m22099R(iIntValue9 & 1, (iIntValue9 & 3) != 2)) {
                                    tj3Var12.m22102U();
                                } else {
                                    boolean zM22124i14 = tj3Var12.m22124i(c2779e6);
                                    Object objM22097O110 = tj3Var12.m22097O();
                                    if (zM22124i14 || objM22097O110 == p84Var2) {
                                        objM22097O110 = new js8(c2779e6, 4);
                                        tj3Var12.m22131l0(objM22097O110);
                                    }
                                    AbstractC0231g.m1153f(805306368, 510, null, tj3Var12, (ui3) objM22097O110, slc.f61000j, null, null, null, false);
                                }
                                break;
                        }
                        return xfaVar;
                    }
                }, tj3Var), null, null, slc.f60999i, null, 0L, 0L, 0L, 0L, null, tj3Var3, 1575984, 16308);
                tj3Var = tj3Var3;
                tj3Var.m22139q(false);
            } else {
                tj3Var.m22111b0(2027641277);
                tj3Var.m22139q(false);
            }
            if (((xs8) t66Var6.getValue()).f68660i) {
                tj3Var.m22111b0(2027708082);
                boolean zM22124i6 = tj3Var.m22124i(c2779e4);
                Object objM22097O12 = tj3Var.m22097O();
                if (zM22124i6 || objM22097O12 == p84Var) {
                    objM22097O12 = new js8(c2779e4, 13);
                    tj3Var.m22131l0(objM22097O12);
                }
                ui3 ui3Var2 = (ui3) objM22097O12;
                final int i12 = 8;
                C0282a c0282aM4703P2 = ci8.m4703P(409176987, new zi3() { // from class: is8
                    @Override // p000.zi3
                    public final Object invoke(Object obj, Object obj2) {
                        int i13 = i12;
                        xfa xfaVar = xfa.f68157a;
                        p84 p84Var2 = we1.f66679a;
                        C2779e c2779e6 = c2779e4;
                        switch (i13) {
                            case 0:
                                ye1 ye1Var2 = (ye1) obj;
                                int iIntValue = ((Integer) obj2).intValue();
                                tj3 tj3Var4 = (tj3) ye1Var2;
                                if (!tj3Var4.m22099R(iIntValue & 1, (iIntValue & 3) != 2)) {
                                    tj3Var4.m22102U();
                                } else {
                                    boolean zM22124i7 = tj3Var4.m22124i(c2779e6);
                                    Object objM22097O13 = tj3Var4.m22097O();
                                    if (zM22124i7 || objM22097O13 == p84Var2) {
                                        objM22097O13 = new js8(c2779e6, 8);
                                        tj3Var4.m22131l0(objM22097O13);
                                    }
                                    AbstractC0231g.m1153f(805306368, 510, null, tj3Var4, (ui3) objM22097O13, slc.f61001k, null, null, null, false);
                                }
                                break;
                            case 1:
                                ye1 ye1Var3 = (ye1) obj;
                                int iIntValue2 = ((Integer) obj2).intValue();
                                tj3 tj3Var5 = (tj3) ye1Var3;
                                if (!tj3Var5.m22099R(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                                    tj3Var5.m22102U();
                                } else {
                                    boolean zM22124i8 = tj3Var5.m22124i(c2779e6);
                                    Object objM22097O14 = tj3Var5.m22097O();
                                    if (zM22124i8 || objM22097O14 == p84Var2) {
                                        objM22097O14 = new js8(c2779e6, 3);
                                        tj3Var5.m22131l0(objM22097O14);
                                    }
                                    AbstractC0231g.m1153f(805306368, 510, null, tj3Var5, (ui3) objM22097O14, slc.f61003m, null, null, null, false);
                                }
                                break;
                            case 2:
                                ye1 ye1Var4 = (ye1) obj;
                                int iIntValue3 = ((Integer) obj2).intValue();
                                tj3 tj3Var6 = (tj3) ye1Var4;
                                if (!tj3Var6.m22099R(iIntValue3 & 1, (iIntValue3 & 3) != 2)) {
                                    tj3Var6.m22102U();
                                } else {
                                    boolean zM22124i9 = tj3Var6.m22124i(c2779e6);
                                    Object objM22097O15 = tj3Var6.m22097O();
                                    if (zM22124i9 || objM22097O15 == p84Var2) {
                                        objM22097O15 = new js8(c2779e6, 6);
                                        tj3Var6.m22131l0(objM22097O15);
                                    }
                                    AbstractC0231g.m1153f(805306368, 510, null, tj3Var6, (ui3) objM22097O15, slc.f61004n, null, null, null, false);
                                }
                                break;
                            case 3:
                                ye1 ye1Var5 = (ye1) obj;
                                int iIntValue4 = ((Integer) obj2).intValue();
                                tj3 tj3Var7 = (tj3) ye1Var5;
                                if (!tj3Var7.m22099R(iIntValue4 & 1, (iIntValue4 & 3) != 2)) {
                                    tj3Var7.m22102U();
                                } else {
                                    boolean zM22124i10 = tj3Var7.m22124i(c2779e6);
                                    Object objM22097O16 = tj3Var7.m22097O();
                                    if (zM22124i10 || objM22097O16 == p84Var2) {
                                        objM22097O16 = new js8(c2779e6, 7);
                                        tj3Var7.m22131l0(objM22097O16);
                                    }
                                    AbstractC0231g.m1153f(805306368, 510, null, tj3Var7, (ui3) objM22097O16, slc.f60992b, null, null, null, false);
                                }
                                break;
                            case 4:
                                ye1 ye1Var6 = (ye1) obj;
                                int iIntValue5 = ((Integer) obj2).intValue();
                                tj3 tj3Var8 = (tj3) ye1Var6;
                                if (!tj3Var8.m22099R(iIntValue5 & 1, (iIntValue5 & 3) != 2)) {
                                    tj3Var8.m22102U();
                                } else {
                                    boolean zM22124i11 = tj3Var8.m22124i(c2779e6);
                                    Object objM22097O17 = tj3Var8.m22097O();
                                    if (zM22124i11 || objM22097O17 == p84Var2) {
                                        objM22097O17 = new js8(c2779e6, 10);
                                        tj3Var8.m22131l0(objM22097O17);
                                    }
                                    AbstractC0231g.m1153f(805306368, 510, null, tj3Var8, (ui3) objM22097O17, slc.f60994d, null, null, null, false);
                                }
                                break;
                            case 5:
                                ye1 ye1Var7 = (ye1) obj;
                                int iIntValue6 = ((Integer) obj2).intValue();
                                tj3 tj3Var9 = (tj3) ye1Var7;
                                if (!tj3Var9.m22099R(iIntValue6 & 1, (iIntValue6 & 3) != 2)) {
                                    tj3Var9.m22102U();
                                } else {
                                    boolean zM22124i12 = tj3Var9.m22124i(c2779e6);
                                    Object objM22097O18 = tj3Var9.m22097O();
                                    if (zM22124i12 || objM22097O18 == p84Var2) {
                                        objM22097O18 = new js8(c2779e6, 9);
                                        tj3Var9.m22131l0(objM22097O18);
                                    }
                                    AbstractC0231g.m1153f(805306368, 510, null, tj3Var9, (ui3) objM22097O18, slc.f60995e, null, null, null, false);
                                }
                                break;
                            case 6:
                                ye1 ye1Var8 = (ye1) obj;
                                int iIntValue7 = ((Integer) obj2).intValue();
                                tj3 tj3Var10 = (tj3) ye1Var8;
                                if (!tj3Var10.m22099R(iIntValue7 & 1, (iIntValue7 & 3) != 2)) {
                                    tj3Var10.m22102U();
                                } else {
                                    boolean zM22124i13 = tj3Var10.m22124i(c2779e6);
                                    Object objM22097O19 = tj3Var10.m22097O();
                                    if (zM22124i13 || objM22097O19 == p84Var2) {
                                        objM22097O19 = new js8(c2779e6, 11);
                                        tj3Var10.m22131l0(objM22097O19);
                                    }
                                    AbstractC0231g.m1153f(805306368, 510, null, tj3Var10, (ui3) objM22097O19, slc.f60997g, null, null, null, false);
                                }
                                break;
                            case 7:
                                ye1 ye1Var9 = (ye1) obj;
                                int iIntValue8 = ((Integer) obj2).intValue();
                                tj3 tj3Var11 = (tj3) ye1Var9;
                                if (!tj3Var11.m22099R(iIntValue8 & 1, (iIntValue8 & 3) != 2)) {
                                    tj3Var11.m22102U();
                                } else {
                                    boolean zM22124i14 = tj3Var11.m22124i(c2779e6);
                                    Object objM22097O110 = tj3Var11.m22097O();
                                    if (zM22124i14 || objM22097O110 == p84Var2) {
                                        objM22097O110 = new js8(c2779e6, 5);
                                        tj3Var11.m22131l0(objM22097O110);
                                    }
                                    AbstractC0231g.m1153f(805306368, 510, null, tj3Var11, (ui3) objM22097O110, slc.f60998h, null, null, null, false);
                                }
                                break;
                            default:
                                ye1 ye1Var10 = (ye1) obj;
                                int iIntValue9 = ((Integer) obj2).intValue();
                                tj3 tj3Var12 = (tj3) ye1Var10;
                                if (!tj3Var12.m22099R(iIntValue9 & 1, (iIntValue9 & 3) != 2)) {
                                    tj3Var12.m22102U();
                                } else {
                                    boolean zM22124i15 = tj3Var12.m22124i(c2779e6);
                                    Object objM22097O111 = tj3Var12.m22097O();
                                    if (zM22124i15 || objM22097O111 == p84Var2) {
                                        objM22097O111 = new js8(c2779e6, 4);
                                        tj3Var12.m22131l0(objM22097O111);
                                    }
                                    AbstractC0231g.m1153f(805306368, 510, null, tj3Var12, (ui3) objM22097O111, slc.f61000j, null, null, null, false);
                                }
                                break;
                        }
                        return xfaVar;
                    }
                }, tj3Var);
                final int i13 = 0;
                tj3 tj3Var4 = tj3Var;
                q2d.m19625a(ui3Var2, c0282aM4703P2, null, ci8.m4703P(401178013, new zi3() { // from class: is8
                    @Override // p000.zi3
                    public final Object invoke(Object obj, Object obj2) {
                        int i14 = i13;
                        xfa xfaVar = xfa.f68157a;
                        p84 p84Var2 = we1.f66679a;
                        C2779e c2779e6 = c2779e4;
                        switch (i14) {
                            case 0:
                                ye1 ye1Var2 = (ye1) obj;
                                int iIntValue = ((Integer) obj2).intValue();
                                tj3 tj3Var5 = (tj3) ye1Var2;
                                if (!tj3Var5.m22099R(iIntValue & 1, (iIntValue & 3) != 2)) {
                                    tj3Var5.m22102U();
                                } else {
                                    boolean zM22124i7 = tj3Var5.m22124i(c2779e6);
                                    Object objM22097O13 = tj3Var5.m22097O();
                                    if (zM22124i7 || objM22097O13 == p84Var2) {
                                        objM22097O13 = new js8(c2779e6, 8);
                                        tj3Var5.m22131l0(objM22097O13);
                                    }
                                    AbstractC0231g.m1153f(805306368, 510, null, tj3Var5, (ui3) objM22097O13, slc.f61001k, null, null, null, false);
                                }
                                break;
                            case 1:
                                ye1 ye1Var3 = (ye1) obj;
                                int iIntValue2 = ((Integer) obj2).intValue();
                                tj3 tj3Var6 = (tj3) ye1Var3;
                                if (!tj3Var6.m22099R(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                                    tj3Var6.m22102U();
                                } else {
                                    boolean zM22124i8 = tj3Var6.m22124i(c2779e6);
                                    Object objM22097O14 = tj3Var6.m22097O();
                                    if (zM22124i8 || objM22097O14 == p84Var2) {
                                        objM22097O14 = new js8(c2779e6, 3);
                                        tj3Var6.m22131l0(objM22097O14);
                                    }
                                    AbstractC0231g.m1153f(805306368, 510, null, tj3Var6, (ui3) objM22097O14, slc.f61003m, null, null, null, false);
                                }
                                break;
                            case 2:
                                ye1 ye1Var4 = (ye1) obj;
                                int iIntValue3 = ((Integer) obj2).intValue();
                                tj3 tj3Var7 = (tj3) ye1Var4;
                                if (!tj3Var7.m22099R(iIntValue3 & 1, (iIntValue3 & 3) != 2)) {
                                    tj3Var7.m22102U();
                                } else {
                                    boolean zM22124i9 = tj3Var7.m22124i(c2779e6);
                                    Object objM22097O15 = tj3Var7.m22097O();
                                    if (zM22124i9 || objM22097O15 == p84Var2) {
                                        objM22097O15 = new js8(c2779e6, 6);
                                        tj3Var7.m22131l0(objM22097O15);
                                    }
                                    AbstractC0231g.m1153f(805306368, 510, null, tj3Var7, (ui3) objM22097O15, slc.f61004n, null, null, null, false);
                                }
                                break;
                            case 3:
                                ye1 ye1Var5 = (ye1) obj;
                                int iIntValue4 = ((Integer) obj2).intValue();
                                tj3 tj3Var8 = (tj3) ye1Var5;
                                if (!tj3Var8.m22099R(iIntValue4 & 1, (iIntValue4 & 3) != 2)) {
                                    tj3Var8.m22102U();
                                } else {
                                    boolean zM22124i10 = tj3Var8.m22124i(c2779e6);
                                    Object objM22097O16 = tj3Var8.m22097O();
                                    if (zM22124i10 || objM22097O16 == p84Var2) {
                                        objM22097O16 = new js8(c2779e6, 7);
                                        tj3Var8.m22131l0(objM22097O16);
                                    }
                                    AbstractC0231g.m1153f(805306368, 510, null, tj3Var8, (ui3) objM22097O16, slc.f60992b, null, null, null, false);
                                }
                                break;
                            case 4:
                                ye1 ye1Var6 = (ye1) obj;
                                int iIntValue5 = ((Integer) obj2).intValue();
                                tj3 tj3Var9 = (tj3) ye1Var6;
                                if (!tj3Var9.m22099R(iIntValue5 & 1, (iIntValue5 & 3) != 2)) {
                                    tj3Var9.m22102U();
                                } else {
                                    boolean zM22124i11 = tj3Var9.m22124i(c2779e6);
                                    Object objM22097O17 = tj3Var9.m22097O();
                                    if (zM22124i11 || objM22097O17 == p84Var2) {
                                        objM22097O17 = new js8(c2779e6, 10);
                                        tj3Var9.m22131l0(objM22097O17);
                                    }
                                    AbstractC0231g.m1153f(805306368, 510, null, tj3Var9, (ui3) objM22097O17, slc.f60994d, null, null, null, false);
                                }
                                break;
                            case 5:
                                ye1 ye1Var7 = (ye1) obj;
                                int iIntValue6 = ((Integer) obj2).intValue();
                                tj3 tj3Var10 = (tj3) ye1Var7;
                                if (!tj3Var10.m22099R(iIntValue6 & 1, (iIntValue6 & 3) != 2)) {
                                    tj3Var10.m22102U();
                                } else {
                                    boolean zM22124i12 = tj3Var10.m22124i(c2779e6);
                                    Object objM22097O18 = tj3Var10.m22097O();
                                    if (zM22124i12 || objM22097O18 == p84Var2) {
                                        objM22097O18 = new js8(c2779e6, 9);
                                        tj3Var10.m22131l0(objM22097O18);
                                    }
                                    AbstractC0231g.m1153f(805306368, 510, null, tj3Var10, (ui3) objM22097O18, slc.f60995e, null, null, null, false);
                                }
                                break;
                            case 6:
                                ye1 ye1Var8 = (ye1) obj;
                                int iIntValue7 = ((Integer) obj2).intValue();
                                tj3 tj3Var11 = (tj3) ye1Var8;
                                if (!tj3Var11.m22099R(iIntValue7 & 1, (iIntValue7 & 3) != 2)) {
                                    tj3Var11.m22102U();
                                } else {
                                    boolean zM22124i13 = tj3Var11.m22124i(c2779e6);
                                    Object objM22097O19 = tj3Var11.m22097O();
                                    if (zM22124i13 || objM22097O19 == p84Var2) {
                                        objM22097O19 = new js8(c2779e6, 11);
                                        tj3Var11.m22131l0(objM22097O19);
                                    }
                                    AbstractC0231g.m1153f(805306368, 510, null, tj3Var11, (ui3) objM22097O19, slc.f60997g, null, null, null, false);
                                }
                                break;
                            case 7:
                                ye1 ye1Var9 = (ye1) obj;
                                int iIntValue8 = ((Integer) obj2).intValue();
                                tj3 tj3Var12 = (tj3) ye1Var9;
                                if (!tj3Var12.m22099R(iIntValue8 & 1, (iIntValue8 & 3) != 2)) {
                                    tj3Var12.m22102U();
                                } else {
                                    boolean zM22124i14 = tj3Var12.m22124i(c2779e6);
                                    Object objM22097O110 = tj3Var12.m22097O();
                                    if (zM22124i14 || objM22097O110 == p84Var2) {
                                        objM22097O110 = new js8(c2779e6, 5);
                                        tj3Var12.m22131l0(objM22097O110);
                                    }
                                    AbstractC0231g.m1153f(805306368, 510, null, tj3Var12, (ui3) objM22097O110, slc.f60998h, null, null, null, false);
                                }
                                break;
                            default:
                                ye1 ye1Var10 = (ye1) obj;
                                int iIntValue9 = ((Integer) obj2).intValue();
                                tj3 tj3Var13 = (tj3) ye1Var10;
                                if (!tj3Var13.m22099R(iIntValue9 & 1, (iIntValue9 & 3) != 2)) {
                                    tj3Var13.m22102U();
                                } else {
                                    boolean zM22124i15 = tj3Var13.m22124i(c2779e6);
                                    Object objM22097O111 = tj3Var13.m22097O();
                                    if (zM22124i15 || objM22097O111 == p84Var2) {
                                        objM22097O111 = new js8(c2779e6, 4);
                                        tj3Var13.m22131l0(objM22097O111);
                                    }
                                    AbstractC0231g.m1153f(805306368, 510, null, tj3Var13, (ui3) objM22097O111, slc.f61000j, null, null, null, false);
                                }
                                break;
                        }
                        return xfaVar;
                    }
                }, tj3Var), null, null, slc.f61002l, null, 0L, 0L, 0L, 0L, null, tj3Var4, 1575984, 16308);
                tj3Var = tj3Var4;
                tj3Var.m22139q(false);
            } else {
                tj3Var.m22111b0(2028518205);
                tj3Var.m22139q(false);
            }
            if (((xs8) t66Var6.getValue()).f68661j) {
                tj3Var.m22111b0(2028588761);
                boolean zM22124i7 = tj3Var.m22124i(c2779e4);
                Object objM22097O13 = tj3Var.m22097O();
                if (zM22124i7 || objM22097O13 == p84Var) {
                    objM22097O13 = new js8(c2779e4, 0);
                    tj3Var.m22131l0(objM22097O13);
                }
                tj3 tj3Var5 = tj3Var;
                q2d.m19625a((ui3) objM22097O13, ci8.m4703P(-1247829254, new zi3() { // from class: is8
                    @Override // p000.zi3
                    public final Object invoke(Object obj, Object obj2) {
                        int i14 = i5;
                        xfa xfaVar = xfa.f68157a;
                        p84 p84Var2 = we1.f66679a;
                        C2779e c2779e6 = c2779e4;
                        switch (i14) {
                            case 0:
                                ye1 ye1Var2 = (ye1) obj;
                                int iIntValue = ((Integer) obj2).intValue();
                                tj3 tj3Var6 = (tj3) ye1Var2;
                                if (!tj3Var6.m22099R(iIntValue & 1, (iIntValue & 3) != 2)) {
                                    tj3Var6.m22102U();
                                } else {
                                    boolean zM22124i8 = tj3Var6.m22124i(c2779e6);
                                    Object objM22097O14 = tj3Var6.m22097O();
                                    if (zM22124i8 || objM22097O14 == p84Var2) {
                                        objM22097O14 = new js8(c2779e6, 8);
                                        tj3Var6.m22131l0(objM22097O14);
                                    }
                                    AbstractC0231g.m1153f(805306368, 510, null, tj3Var6, (ui3) objM22097O14, slc.f61001k, null, null, null, false);
                                }
                                break;
                            case 1:
                                ye1 ye1Var3 = (ye1) obj;
                                int iIntValue2 = ((Integer) obj2).intValue();
                                tj3 tj3Var7 = (tj3) ye1Var3;
                                if (!tj3Var7.m22099R(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                                    tj3Var7.m22102U();
                                } else {
                                    boolean zM22124i9 = tj3Var7.m22124i(c2779e6);
                                    Object objM22097O15 = tj3Var7.m22097O();
                                    if (zM22124i9 || objM22097O15 == p84Var2) {
                                        objM22097O15 = new js8(c2779e6, 3);
                                        tj3Var7.m22131l0(objM22097O15);
                                    }
                                    AbstractC0231g.m1153f(805306368, 510, null, tj3Var7, (ui3) objM22097O15, slc.f61003m, null, null, null, false);
                                }
                                break;
                            case 2:
                                ye1 ye1Var4 = (ye1) obj;
                                int iIntValue3 = ((Integer) obj2).intValue();
                                tj3 tj3Var8 = (tj3) ye1Var4;
                                if (!tj3Var8.m22099R(iIntValue3 & 1, (iIntValue3 & 3) != 2)) {
                                    tj3Var8.m22102U();
                                } else {
                                    boolean zM22124i10 = tj3Var8.m22124i(c2779e6);
                                    Object objM22097O16 = tj3Var8.m22097O();
                                    if (zM22124i10 || objM22097O16 == p84Var2) {
                                        objM22097O16 = new js8(c2779e6, 6);
                                        tj3Var8.m22131l0(objM22097O16);
                                    }
                                    AbstractC0231g.m1153f(805306368, 510, null, tj3Var8, (ui3) objM22097O16, slc.f61004n, null, null, null, false);
                                }
                                break;
                            case 3:
                                ye1 ye1Var5 = (ye1) obj;
                                int iIntValue4 = ((Integer) obj2).intValue();
                                tj3 tj3Var9 = (tj3) ye1Var5;
                                if (!tj3Var9.m22099R(iIntValue4 & 1, (iIntValue4 & 3) != 2)) {
                                    tj3Var9.m22102U();
                                } else {
                                    boolean zM22124i11 = tj3Var9.m22124i(c2779e6);
                                    Object objM22097O17 = tj3Var9.m22097O();
                                    if (zM22124i11 || objM22097O17 == p84Var2) {
                                        objM22097O17 = new js8(c2779e6, 7);
                                        tj3Var9.m22131l0(objM22097O17);
                                    }
                                    AbstractC0231g.m1153f(805306368, 510, null, tj3Var9, (ui3) objM22097O17, slc.f60992b, null, null, null, false);
                                }
                                break;
                            case 4:
                                ye1 ye1Var6 = (ye1) obj;
                                int iIntValue5 = ((Integer) obj2).intValue();
                                tj3 tj3Var10 = (tj3) ye1Var6;
                                if (!tj3Var10.m22099R(iIntValue5 & 1, (iIntValue5 & 3) != 2)) {
                                    tj3Var10.m22102U();
                                } else {
                                    boolean zM22124i12 = tj3Var10.m22124i(c2779e6);
                                    Object objM22097O18 = tj3Var10.m22097O();
                                    if (zM22124i12 || objM22097O18 == p84Var2) {
                                        objM22097O18 = new js8(c2779e6, 10);
                                        tj3Var10.m22131l0(objM22097O18);
                                    }
                                    AbstractC0231g.m1153f(805306368, 510, null, tj3Var10, (ui3) objM22097O18, slc.f60994d, null, null, null, false);
                                }
                                break;
                            case 5:
                                ye1 ye1Var7 = (ye1) obj;
                                int iIntValue6 = ((Integer) obj2).intValue();
                                tj3 tj3Var11 = (tj3) ye1Var7;
                                if (!tj3Var11.m22099R(iIntValue6 & 1, (iIntValue6 & 3) != 2)) {
                                    tj3Var11.m22102U();
                                } else {
                                    boolean zM22124i13 = tj3Var11.m22124i(c2779e6);
                                    Object objM22097O19 = tj3Var11.m22097O();
                                    if (zM22124i13 || objM22097O19 == p84Var2) {
                                        objM22097O19 = new js8(c2779e6, 9);
                                        tj3Var11.m22131l0(objM22097O19);
                                    }
                                    AbstractC0231g.m1153f(805306368, 510, null, tj3Var11, (ui3) objM22097O19, slc.f60995e, null, null, null, false);
                                }
                                break;
                            case 6:
                                ye1 ye1Var8 = (ye1) obj;
                                int iIntValue7 = ((Integer) obj2).intValue();
                                tj3 tj3Var12 = (tj3) ye1Var8;
                                if (!tj3Var12.m22099R(iIntValue7 & 1, (iIntValue7 & 3) != 2)) {
                                    tj3Var12.m22102U();
                                } else {
                                    boolean zM22124i14 = tj3Var12.m22124i(c2779e6);
                                    Object objM22097O110 = tj3Var12.m22097O();
                                    if (zM22124i14 || objM22097O110 == p84Var2) {
                                        objM22097O110 = new js8(c2779e6, 11);
                                        tj3Var12.m22131l0(objM22097O110);
                                    }
                                    AbstractC0231g.m1153f(805306368, 510, null, tj3Var12, (ui3) objM22097O110, slc.f60997g, null, null, null, false);
                                }
                                break;
                            case 7:
                                ye1 ye1Var9 = (ye1) obj;
                                int iIntValue8 = ((Integer) obj2).intValue();
                                tj3 tj3Var13 = (tj3) ye1Var9;
                                if (!tj3Var13.m22099R(iIntValue8 & 1, (iIntValue8 & 3) != 2)) {
                                    tj3Var13.m22102U();
                                } else {
                                    boolean zM22124i15 = tj3Var13.m22124i(c2779e6);
                                    Object objM22097O111 = tj3Var13.m22097O();
                                    if (zM22124i15 || objM22097O111 == p84Var2) {
                                        objM22097O111 = new js8(c2779e6, 5);
                                        tj3Var13.m22131l0(objM22097O111);
                                    }
                                    AbstractC0231g.m1153f(805306368, 510, null, tj3Var13, (ui3) objM22097O111, slc.f60998h, null, null, null, false);
                                }
                                break;
                            default:
                                ye1 ye1Var10 = (ye1) obj;
                                int iIntValue9 = ((Integer) obj2).intValue();
                                tj3 tj3Var14 = (tj3) ye1Var10;
                                if (!tj3Var14.m22099R(iIntValue9 & 1, (iIntValue9 & 3) != 2)) {
                                    tj3Var14.m22102U();
                                } else {
                                    boolean zM22124i16 = tj3Var14.m22124i(c2779e6);
                                    Object objM22097O112 = tj3Var14.m22097O();
                                    if (zM22124i16 || objM22097O112 == p84Var2) {
                                        objM22097O112 = new js8(c2779e6, 4);
                                        tj3Var14.m22131l0(objM22097O112);
                                    }
                                    AbstractC0231g.m1153f(805306368, 510, null, tj3Var14, (ui3) objM22097O112, slc.f61000j, null, null, null, false);
                                }
                                break;
                        }
                        return xfaVar;
                    }
                }, tj3Var), null, ci8.m4703P(-1255828228, new zi3() { // from class: is8
                    @Override // p000.zi3
                    public final Object invoke(Object obj, Object obj2) {
                        int i14 = i4;
                        xfa xfaVar = xfa.f68157a;
                        p84 p84Var2 = we1.f66679a;
                        C2779e c2779e6 = c2779e4;
                        switch (i14) {
                            case 0:
                                ye1 ye1Var2 = (ye1) obj;
                                int iIntValue = ((Integer) obj2).intValue();
                                tj3 tj3Var6 = (tj3) ye1Var2;
                                if (!tj3Var6.m22099R(iIntValue & 1, (iIntValue & 3) != 2)) {
                                    tj3Var6.m22102U();
                                } else {
                                    boolean zM22124i8 = tj3Var6.m22124i(c2779e6);
                                    Object objM22097O14 = tj3Var6.m22097O();
                                    if (zM22124i8 || objM22097O14 == p84Var2) {
                                        objM22097O14 = new js8(c2779e6, 8);
                                        tj3Var6.m22131l0(objM22097O14);
                                    }
                                    AbstractC0231g.m1153f(805306368, 510, null, tj3Var6, (ui3) objM22097O14, slc.f61001k, null, null, null, false);
                                }
                                break;
                            case 1:
                                ye1 ye1Var3 = (ye1) obj;
                                int iIntValue2 = ((Integer) obj2).intValue();
                                tj3 tj3Var7 = (tj3) ye1Var3;
                                if (!tj3Var7.m22099R(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                                    tj3Var7.m22102U();
                                } else {
                                    boolean zM22124i9 = tj3Var7.m22124i(c2779e6);
                                    Object objM22097O15 = tj3Var7.m22097O();
                                    if (zM22124i9 || objM22097O15 == p84Var2) {
                                        objM22097O15 = new js8(c2779e6, 3);
                                        tj3Var7.m22131l0(objM22097O15);
                                    }
                                    AbstractC0231g.m1153f(805306368, 510, null, tj3Var7, (ui3) objM22097O15, slc.f61003m, null, null, null, false);
                                }
                                break;
                            case 2:
                                ye1 ye1Var4 = (ye1) obj;
                                int iIntValue3 = ((Integer) obj2).intValue();
                                tj3 tj3Var8 = (tj3) ye1Var4;
                                if (!tj3Var8.m22099R(iIntValue3 & 1, (iIntValue3 & 3) != 2)) {
                                    tj3Var8.m22102U();
                                } else {
                                    boolean zM22124i10 = tj3Var8.m22124i(c2779e6);
                                    Object objM22097O16 = tj3Var8.m22097O();
                                    if (zM22124i10 || objM22097O16 == p84Var2) {
                                        objM22097O16 = new js8(c2779e6, 6);
                                        tj3Var8.m22131l0(objM22097O16);
                                    }
                                    AbstractC0231g.m1153f(805306368, 510, null, tj3Var8, (ui3) objM22097O16, slc.f61004n, null, null, null, false);
                                }
                                break;
                            case 3:
                                ye1 ye1Var5 = (ye1) obj;
                                int iIntValue4 = ((Integer) obj2).intValue();
                                tj3 tj3Var9 = (tj3) ye1Var5;
                                if (!tj3Var9.m22099R(iIntValue4 & 1, (iIntValue4 & 3) != 2)) {
                                    tj3Var9.m22102U();
                                } else {
                                    boolean zM22124i11 = tj3Var9.m22124i(c2779e6);
                                    Object objM22097O17 = tj3Var9.m22097O();
                                    if (zM22124i11 || objM22097O17 == p84Var2) {
                                        objM22097O17 = new js8(c2779e6, 7);
                                        tj3Var9.m22131l0(objM22097O17);
                                    }
                                    AbstractC0231g.m1153f(805306368, 510, null, tj3Var9, (ui3) objM22097O17, slc.f60992b, null, null, null, false);
                                }
                                break;
                            case 4:
                                ye1 ye1Var6 = (ye1) obj;
                                int iIntValue5 = ((Integer) obj2).intValue();
                                tj3 tj3Var10 = (tj3) ye1Var6;
                                if (!tj3Var10.m22099R(iIntValue5 & 1, (iIntValue5 & 3) != 2)) {
                                    tj3Var10.m22102U();
                                } else {
                                    boolean zM22124i12 = tj3Var10.m22124i(c2779e6);
                                    Object objM22097O18 = tj3Var10.m22097O();
                                    if (zM22124i12 || objM22097O18 == p84Var2) {
                                        objM22097O18 = new js8(c2779e6, 10);
                                        tj3Var10.m22131l0(objM22097O18);
                                    }
                                    AbstractC0231g.m1153f(805306368, 510, null, tj3Var10, (ui3) objM22097O18, slc.f60994d, null, null, null, false);
                                }
                                break;
                            case 5:
                                ye1 ye1Var7 = (ye1) obj;
                                int iIntValue6 = ((Integer) obj2).intValue();
                                tj3 tj3Var11 = (tj3) ye1Var7;
                                if (!tj3Var11.m22099R(iIntValue6 & 1, (iIntValue6 & 3) != 2)) {
                                    tj3Var11.m22102U();
                                } else {
                                    boolean zM22124i13 = tj3Var11.m22124i(c2779e6);
                                    Object objM22097O19 = tj3Var11.m22097O();
                                    if (zM22124i13 || objM22097O19 == p84Var2) {
                                        objM22097O19 = new js8(c2779e6, 9);
                                        tj3Var11.m22131l0(objM22097O19);
                                    }
                                    AbstractC0231g.m1153f(805306368, 510, null, tj3Var11, (ui3) objM22097O19, slc.f60995e, null, null, null, false);
                                }
                                break;
                            case 6:
                                ye1 ye1Var8 = (ye1) obj;
                                int iIntValue7 = ((Integer) obj2).intValue();
                                tj3 tj3Var12 = (tj3) ye1Var8;
                                if (!tj3Var12.m22099R(iIntValue7 & 1, (iIntValue7 & 3) != 2)) {
                                    tj3Var12.m22102U();
                                } else {
                                    boolean zM22124i14 = tj3Var12.m22124i(c2779e6);
                                    Object objM22097O110 = tj3Var12.m22097O();
                                    if (zM22124i14 || objM22097O110 == p84Var2) {
                                        objM22097O110 = new js8(c2779e6, 11);
                                        tj3Var12.m22131l0(objM22097O110);
                                    }
                                    AbstractC0231g.m1153f(805306368, 510, null, tj3Var12, (ui3) objM22097O110, slc.f60997g, null, null, null, false);
                                }
                                break;
                            case 7:
                                ye1 ye1Var9 = (ye1) obj;
                                int iIntValue8 = ((Integer) obj2).intValue();
                                tj3 tj3Var13 = (tj3) ye1Var9;
                                if (!tj3Var13.m22099R(iIntValue8 & 1, (iIntValue8 & 3) != 2)) {
                                    tj3Var13.m22102U();
                                } else {
                                    boolean zM22124i15 = tj3Var13.m22124i(c2779e6);
                                    Object objM22097O111 = tj3Var13.m22097O();
                                    if (zM22124i15 || objM22097O111 == p84Var2) {
                                        objM22097O111 = new js8(c2779e6, 5);
                                        tj3Var13.m22131l0(objM22097O111);
                                    }
                                    AbstractC0231g.m1153f(805306368, 510, null, tj3Var13, (ui3) objM22097O111, slc.f60998h, null, null, null, false);
                                }
                                break;
                            default:
                                ye1 ye1Var10 = (ye1) obj;
                                int iIntValue9 = ((Integer) obj2).intValue();
                                tj3 tj3Var14 = (tj3) ye1Var10;
                                if (!tj3Var14.m22099R(iIntValue9 & 1, (iIntValue9 & 3) != 2)) {
                                    tj3Var14.m22102U();
                                } else {
                                    boolean zM22124i16 = tj3Var14.m22124i(c2779e6);
                                    Object objM22097O112 = tj3Var14.m22097O();
                                    if (zM22124i16 || objM22097O112 == p84Var2) {
                                        objM22097O112 = new js8(c2779e6, 4);
                                        tj3Var14.m22131l0(objM22097O112);
                                    }
                                    AbstractC0231g.m1153f(805306368, 510, null, tj3Var14, (ui3) objM22097O112, slc.f61000j, null, null, null, false);
                                }
                                break;
                        }
                        return xfaVar;
                    }
                }, tj3Var), null, slc.f61005o, slc.f61006p, null, 0L, 0L, 0L, 0L, null, tj3Var5, 1772592, 16276);
                tj3Var = tj3Var5;
                tj3Var.m22139q(false);
            } else {
                tj3Var.m22111b0(2029484413);
                tj3Var.m22139q(false);
            }
            c2779e2 = c2779e4;
        } else {
            tj3Var.m22102U();
            c2779e2 = c2779e;
        }
        x18 x18VarM22143u = tj3Var.m22143u();
        if (x18VarM22143u != null) {
            x18VarM22143u.f67642d = new xy0(str, ud6Var, w41Var, biaVar2, c2779e2, i, 14);
        }
    }

    /* JADX INFO: renamed from: b */
    public static final void m9702b(xs8 xs8Var, vi3 vi3Var, vi3 vi3Var2, ye1 ye1Var, int i) {
        xs8 xs8Var2;
        vi3 vi3Var3;
        tj3 tj3Var = (tj3) ye1Var;
        tj3Var.m22115d0(1604261727);
        int i2 = i | (tj3Var.m22124i(xs8Var) ? 4 : 2) | (tj3Var.m22124i(vi3Var) ? 32 : 16) | (tj3Var.m22124i(vi3Var2) ? 256 : 128);
        if (tj3Var.m22099R(i2 & 1, (i2 & 147) != 146)) {
            C0127b c0127bM17056a = mv4.m17056a(0, tj3Var, 3);
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
            Boolean boolValueOf = Boolean.valueOf(xs8Var.f68654c);
            Boolean bool = (Boolean) t66Var.getValue();
            bool.booleanValue();
            boolean zM22124i = tj3Var.m22124i(xs8Var);
            Object objM22097O3 = tj3Var.m22097O();
            if (zM22124i || objM22097O3 == p84Var) {
                objM22097O3 = new SearchScreenKt$SearchScreen$1$1(xs8Var, t66Var, uc9Var, null);
                tj3Var.m22131l0(objM22097O3);
            }
            d32.m10049l(boolValueOf, bool, (zi3) objM22097O3, tj3Var);
            int i3 = i2 & 112;
            AbstractC2777a.m9704a(c0127bM17056a, vi3Var, tj3Var, i3);
            xs8Var2 = xs8Var;
            b34.m3232b(null, ci8.m4703P(-1074375653, new eq8(4, xs8Var, vi3Var2), tj3Var), null, null, null, 0, 0L, 0L, null, ci8.m4703P(1817331568, new ys0(xs8Var, vi3Var, t66Var, uc9Var, c0127bM17056a, vi3Var2, 3), tj3Var), tj3Var, 805306416, 509);
            if (xs8Var2.f68655d) {
                tj3Var.m22111b0(-1832993755);
                gt8 gt8Var = xs8Var2.f68656e;
                boolean z = i3 == 32;
                Object objM22097O4 = tj3Var.m22097O();
                if (z || objM22097O4 == p84Var) {
                    vi3Var3 = vi3Var;
                    objM22097O4 = new wh7(vi3Var3, 25);
                    tj3Var.m22131l0(objM22097O4);
                } else {
                    vi3Var3 = vi3Var;
                }
                vi3 vi3Var4 = (vi3) objM22097O4;
                boolean z2 = i3 == 32;
                Object objM22097O5 = tj3Var.m22097O();
                if (z2 || objM22097O5 == p84Var) {
                    objM22097O5 = new wh7(vi3Var3, 26);
                    tj3Var.m22131l0(objM22097O5);
                }
                m0d.m16592a(gt8Var, vi3Var4, (vi3) objM22097O5, tj3Var, 0);
                tj3Var.m22139q(false);
            } else {
                vi3Var3 = vi3Var;
                tj3Var.m22111b0(-1832565149);
                tj3Var.m22139q(false);
            }
        } else {
            xs8Var2 = xs8Var;
            vi3Var3 = vi3Var;
            tj3Var.m22102U();
        }
        x18 x18VarM22143u = tj3Var.m22143u();
        if (x18VarM22143u != null) {
            x18VarM22143u.f67642d = new lo6(i, 23, xs8Var2, vi3Var3, vi3Var2);
        }
    }

    /* JADX INFO: renamed from: c */
    public static final void m9703c(w41 w41Var, LibraryItem libraryItem, String str) {
        int i = libraryItem.f19426a;
        String str2 = libraryItem.f19433e;
        if (str2 == null) {
            str2 = "";
        }
        String str3 = libraryItem.f19436h;
        if (str3 == null) {
            str3 = "";
        }
        String str4 = libraryItem.f19409J;
        if (str4 == null && (str4 = libraryItem.f19402C) == null) {
            str4 = "";
        }
        String str5 = libraryItem.f19434f;
        w41Var.m23737z(new da6(i, str2, str3, str4, str5 != null ? str5 : "", LessonInfoSource.Overview, str));
    }
}
