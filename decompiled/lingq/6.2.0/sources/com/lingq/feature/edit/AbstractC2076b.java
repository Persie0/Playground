package com.lingq.feature.edit;

import androidx.compose.p002ui.AbstractC0287b;
import androidx.compose.p002ui.node.C0352b;
import androidx.compose.runtime.internal.C0282a;
import androidx.lifecycle.Lifecycle$Event;
import androidx.lifecycle.compose.AbstractC0711a;
import com.lingq.feature.edit.AbstractC2076b;
import kotlin.jvm.internal.FunctionReference;
import p000.AbstractC3352my;
import p000.AbstractC3584sr;
import p000.C3386nv;
import p000.a05;
import p000.aa1;
import p000.aj3;
import p000.b16;
import p000.b34;
import p000.bq1;
import p000.c99;
import p000.ci8;
import p000.d32;
import p000.dua;
import p000.e16;
import p000.e2d;
import p000.fx8;
import p000.gr3;
import p000.ht5;
import p000.k2d;
import p000.kh4;
import p000.kx8;
import p000.l77;
import p000.ms5;
import p000.nc8;
import p000.nj0;
import p000.o72;
import p000.oha;
import p000.or1;
import p000.otb;
import p000.p84;
import p000.pfa;
import p000.ps5;
import p000.qh0;
import p000.rw1;
import p000.s06;
import p000.se1;
import p000.si5;
import p000.sid;
import p000.ss5;
import p000.t15;
import p000.t66;
import p000.tj3;
import p000.u15;
import p000.ui3;
import p000.un1;
import p000.ux5;
import p000.v27;
import p000.vi3;
import p000.w15;
import p000.we1;
import p000.x18;
import p000.xc9;
import p000.xfa;
import p000.y38;
import p000.ye1;
import p000.yu4;
import p000.yw8;
import p000.zi3;

/* JADX INFO: renamed from: com.lingq.feature.edit.b */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC2076b {
    /* JADX INFO: renamed from: a */
    public static final void m8984a(vi3 vi3Var, C2077c c2077c, ye1 ye1Var, int i) {
        tj3 tj3Var;
        final C2077c c2077c2;
        int i2;
        vi3Var.getClass();
        tj3 tj3Var2 = (tj3) ye1Var;
        tj3Var2.m22115d0(-1273273065);
        int i3 = (tj3Var2.m22124i(vi3Var) ? 4 : 2) | i | 16;
        if (tj3Var2.m22099R(i3 & 1, (i3 & 19) != 18)) {
            tj3Var2.m22104W();
            if ((i & 1) == 0 || tj3Var2.m22084B()) {
                dua duaVarM21396a = si5.m21396a(tj3Var2);
                if (duaVarM21396a == null) {
                    C3386nv.m17633t("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner");
                    return;
                } else {
                    tj3Var = tj3Var2;
                    c2077c2 = (C2077c) pfa.m19114d(y38.m24933a(C2077c.class), duaVarM21396a, null, AbstractC3584sr.m21591B(duaVarM21396a, tj3Var2), duaVarM21396a instanceof gr3 ? ((gr3) duaVarM21396a).mo2103e() : or1.f54780b, tj3Var);
                    i2 = i3 & (-113);
                }
            } else {
                tj3Var2.m22102U();
                i2 = i3 & (-113);
                c2077c2 = c2077c;
                tj3Var = tj3Var2;
            }
            tj3Var.m22140r();
            t66 t66VarM2513c = AbstractC0711a.m2513c(c2077c2.f25946p, tj3Var);
            w15 w15Var = (w15) ((xc9) c2077c2.f25944n).getValue();
            yw8 yw8Var = (yw8) ((xc9) c2077c2.f25947q).getValue();
            Boolean boolValueOf = Boolean.valueOf(w15Var.f66221c);
            boolean zM22120g = ((i2 & 14) == 4) | tj3Var.m22120g(w15Var);
            Object objM22097O = tj3Var.m22097O();
            p84 p84Var = we1.f66679a;
            if (zM22120g || objM22097O == p84Var) {
                objM22097O = new LessonEditRouteKt$LessonEditRoute$1$1(w15Var, vi3Var, null);
                tj3Var.m22131l0(objM22097O);
            }
            d32.m10047k(tj3Var, (zi3) objM22097O, boolValueOf);
            e16 e16VarM4411d = c99.m4411d(b16.f7762a, 1.0f);
            ht5 ht5VarM19966d = qh0.m19966d(nj0.f52808c, false);
            int iHashCode = Long.hashCode(tj3Var.f62385T);
            l77 l77VarM22132m = tj3Var.m22132m();
            e16 e16VarM1322c = AbstractC0287b.m1322c(tj3Var, e16VarM4411d);
            se1.f60731q.getClass();
            ui3 ui3Var = C0352b.f4299b;
            tj3Var.m22119f0();
            if (tj3Var.f62384S) {
                tj3Var.m22130l(ui3Var);
            } else {
                tj3Var.m22137o0();
            }
            oha.m18001g(tj3Var, C0352b.f4303f, ht5VarM19966d);
            oha.m18001g(tj3Var, C0352b.f4302e, l77VarM22132m);
            oha.m18001g(tj3Var, C0352b.f4304g, Integer.valueOf(iHashCode));
            oha.m18000f(tj3Var, C0352b.f4305h);
            oha.m18001g(tj3Var, C0352b.f4301d, e16VarM1322c);
            sid sidVar = w15Var.f66219a;
            if (sidVar instanceof t15) {
                tj3Var.m22111b0(1481900185);
                fx8 fx8Var = (fx8) t66VarM2513c.getValue();
                boolean zM22124i = tj3Var.m22124i(c2077c2);
                Object objM22097O2 = tj3Var.m22097O();
                if (zM22124i || objM22097O2 == p84Var) {
                    LessonEditRouteKt$LessonEditRoute$2$1$1 lessonEditRouteKt$LessonEditRoute$2$1$1 = new LessonEditRouteKt$LessonEditRoute$2$1$1(1, c2077c2, C2077c.class, "handleAction", "handleAction(Lcom/lingq/feature/edit/data/LessonEditAction;)V", 0);
                    tj3Var.m22131l0(lessonEditRouteKt$LessonEditRoute$2$1$1);
                    objM22097O2 = lessonEditRouteKt$LessonEditRoute$2$1$1;
                }
                k2d.m14775b(fx8Var, (vi3) ((FunctionReference) objM22097O2), tj3Var, 0);
                tj3Var.m22139q(false);
            } else {
                if (!(sidVar instanceof u15)) {
                    throw ux5.m23001x(tj3Var, 1433274252, false);
                }
                tj3Var.m22111b0(1482132220);
                int i4 = ((u15) sidVar).f63243a;
                boolean zM22124i2 = tj3Var.m22124i(c2077c2);
                Object objM22097O3 = tj3Var.m22097O();
                if (zM22124i2 || objM22097O3 == p84Var) {
                    LessonEditRouteKt$LessonEditRoute$2$2$1 lessonEditRouteKt$LessonEditRoute$2$2$1 = new LessonEditRouteKt$LessonEditRoute$2$2$1(1, c2077c2, C2077c.class, "handleAction", "handleAction(Lcom/lingq/feature/edit/data/LessonEditAction;)V", 0);
                    tj3Var.m22131l0(lessonEditRouteKt$LessonEditRoute$2$2$1);
                    objM22097O3 = lessonEditRouteKt$LessonEditRoute$2$2$1;
                }
                tj3 tj3Var3 = tj3Var;
                m8986c(yw8Var, i4, (vi3) ((FunctionReference) objM22097O3), ci8.m4703P(360370859, new aj3() { // from class: com.lingq.feature.edit.a
                    @Override // p000.aj3
                    public final Object invoke(Object obj, Object obj2, Object obj3) {
                        int iIntValue = ((Integer) obj).intValue();
                        ye1 ye1Var2 = (ye1) obj2;
                        int iIntValue2 = ((Integer) obj3).intValue();
                        if ((iIntValue2 & 6) == 0) {
                            iIntValue2 |= ((tj3) ye1Var2).m22116e(iIntValue) ? 4 : 2;
                        }
                        tj3 tj3Var4 = (tj3) ye1Var2;
                        if (tj3Var4.m22099R(iIntValue2 & 1, (iIntValue2 & 19) != 18)) {
                            C2077c c2077c3 = c2077c2;
                            kx8 kx8Var = (kx8) AbstractC0711a.m2513c(c2077c3.m8989X2(iIntValue), tj3Var4).getValue();
                            boolean zM22124i3 = tj3Var4.m22124i(c2077c3);
                            Object objM22097O4 = tj3Var4.m22097O();
                            if (zM22124i3 || objM22097O4 == we1.f66679a) {
                                LessonEditRouteKt$LessonEditRoute$2$3$1$1 lessonEditRouteKt$LessonEditRoute$2$3$1$1 = new LessonEditRouteKt$LessonEditRoute$2$3$1$1(1, c2077c3, C2077c.class, "handleAction", "handleAction(Lcom/lingq/feature/edit/data/LessonEditAction;)V", 0);
                                tj3Var4.m22131l0(lessonEditRouteKt$LessonEditRoute$2$3$1$1);
                                objM22097O4 = lessonEditRouteKt$LessonEditRoute$2$3$1$1;
                            }
                            e2d.m10813b(kx8Var, (vi3) ((FunctionReference) objM22097O4), null, tj3Var4, 0);
                        } else {
                            tj3Var4.m22102U();
                        }
                        return xfa.f68157a;
                    }
                }, tj3Var), tj3Var3, 3072);
                tj3Var = tj3Var3;
                tj3Var.m22139q(false);
            }
            if (w15Var.f66220b) {
                tj3Var.m22111b0(1482708510);
                m8985b(tj3Var, 0);
                tj3Var.m22139q(false);
            } else {
                tj3Var.m22111b0(1482745989);
                tj3Var.m22139q(false);
            }
            tj3Var.m22139q(true);
        } else {
            tj3Var = tj3Var2;
            tj3Var.m22102U();
            c2077c2 = c2077c;
        }
        x18 x18VarM22143u = tj3Var.m22143u();
        if (x18VarM22143u != null) {
            x18VarM22143u.f67642d = new rw1(vi3Var, c2077c2, i);
        }
    }

    /* JADX INFO: renamed from: b */
    public static final void m8985b(ye1 ye1Var, int i) {
        tj3 tj3Var = (tj3) ye1Var;
        tj3Var.m22115d0(-146061225);
        if (tj3Var.m22099R(i & 1, i != 0)) {
            e16 e16VarM10007D = d32.m10007D(c99.m4411d(b16.f7762a, 1.0f), aa1.m198b(0.5f, ((ms5) tj3Var.m22128k(ps5.f56764b)).f51799a.f55818C), ss5.f61356d);
            ht5 ht5VarM19966d = qh0.m19966d(nj0.f52812g, false);
            int iHashCode = Long.hashCode(tj3Var.f62385T);
            l77 l77VarM22132m = tj3Var.m22132m();
            e16 e16VarM1322c = AbstractC0287b.m1322c(tj3Var, e16VarM10007D);
            se1.f60731q.getClass();
            ui3 ui3Var = C0352b.f4299b;
            tj3Var.m22119f0();
            if (tj3Var.f62384S) {
                tj3Var.m22130l(ui3Var);
            } else {
                tj3Var.m22137o0();
            }
            oha.m18001g(tj3Var, C0352b.f4303f, ht5VarM19966d);
            oha.m18001g(tj3Var, C0352b.f4302e, l77VarM22132m);
            oha.m18001g(tj3Var, C0352b.f4304g, Integer.valueOf(iHashCode));
            oha.m18000f(tj3Var, C0352b.f4305h);
            oha.m18001g(tj3Var, C0352b.f4301d, e16VarM1322c);
            bq1.m4039O(null, null, null, null, null, otb.f54984a, tj3Var, 196608, 31);
            tj3Var.m22139q(true);
        } else {
            tj3Var.m22102U();
        }
        x18 x18VarM22143u = tj3Var.m22143u();
        if (x18VarM22143u != null) {
            x18VarM22143u.f67642d = new yu4(i, 11);
        }
    }

    /* JADX INFO: renamed from: c */
    public static final void m8986c(final yw8 yw8Var, final int i, final vi3 vi3Var, final C0282a c0282a, ye1 ye1Var, final int i2) {
        yw8 yw8Var2;
        x18 x18VarM22143u;
        zi3 zi3Var;
        yw8Var.getClass();
        vi3Var.getClass();
        tj3 tj3Var = (tj3) ye1Var;
        tj3Var.m22115d0(372657851);
        int i3 = (tj3Var.m22120g(yw8Var) ? 4 : 2) | i2;
        if ((i2 & 48) == 0) {
            i3 |= tj3Var.m22116e(i) ? 32 : 16;
        }
        if ((i2 & 384) == 0) {
            i3 |= tj3Var.m22124i(vi3Var) ? 256 : 128;
        }
        if (tj3Var.m22099R(i3 & 1, (i3 & 1171) != 1170)) {
            int i4 = yw8Var.f70595a;
            if (i4 == 0) {
                x18VarM22143u = tj3Var.m22143u();
                if (x18VarM22143u == null) {
                    return;
                }
                final int i5 = 0;
                zi3Var = new zi3() { // from class: uw8
                    @Override // p000.zi3
                    public final Object invoke(Object obj, Object obj2) {
                        int i6 = i5;
                        xfa xfaVar = xfa.f68157a;
                        int i7 = i2;
                        switch (i6) {
                            case 0:
                                ((Integer) obj2).getClass();
                                int iM19383z = pk9.m19383z(i7 | 1);
                                AbstractC2076b.m8986c(yw8Var, i, vi3Var, c0282a, (ye1) obj, iM19383z);
                                break;
                            default:
                                ((Integer) obj2).getClass();
                                int iM19383z2 = pk9.m19383z(i7 | 1);
                                AbstractC2076b.m8986c(yw8Var, i, vi3Var, c0282a, (ye1) obj, iM19383z2);
                                break;
                        }
                        return xfaVar;
                    }
                };
            } else {
                yw8Var2 = yw8Var;
                int i6 = i - 1;
                if (i6 < 0) {
                    i6 = 0;
                }
                boolean zM22116e = tj3Var.m22116e(i4);
                Object objM22097O = tj3Var.m22097O();
                p84 p84Var = we1.f66679a;
                if (zM22116e || objM22097O == p84Var) {
                    objM22097O = new kh4(i4, 2);
                    tj3Var.m22131l0(objM22097O);
                }
                o72 o72VarM23066b = v27.m23066b(i6, tj3Var, (ui3) objM22097O);
                Object objM22097O2 = tj3Var.m22097O();
                if (objM22097O2 == p84Var) {
                    objM22097O2 = d32.m10013K(tj3Var);
                    tj3Var.m22131l0(objM22097O2);
                }
                un1 un1Var = (un1) objM22097O2;
                int i7 = i3 & 896;
                boolean zM22120g = tj3Var.m22120g(o72VarM23066b) | (i7 == 256);
                Object objM22097O3 = tj3Var.m22097O();
                if (zM22120g || objM22097O3 == p84Var) {
                    objM22097O3 = new SentenceEditPagerScreenKt$SentenceEditPagerScreen$2$1(o72VarM23066b, vi3Var, null);
                    tj3Var.m22131l0(objM22097O3);
                }
                d32.m10047k(tj3Var, (zi3) objM22097O3, o72VarM23066b);
                Lifecycle$Event lifecycle$Event = Lifecycle$Event.ON_PAUSE;
                boolean z = i7 == 256;
                Object objM22097O4 = tj3Var.m22097O();
                if (z || objM22097O4 == p84Var) {
                    objM22097O4 = new nc8(vi3Var, 28);
                    tj3Var.m22131l0(objM22097O4);
                }
                AbstractC3352my.m17108a(lifecycle$Event, null, (ui3) objM22097O4, tj3Var, 6);
                b34.m3232b(null, ci8.m4703P(1426824055, new s06(i4, o72VarM23066b, ((ms5) tj3Var.m22128k(ps5.f56764b)).f51799a.f55852f, un1Var, vi3Var), tj3Var), null, null, null, 0, 0L, 0L, null, ci8.m4703P(1702689484, new a05(o72VarM23066b, yw8Var2, c0282a, 14), tj3Var), tj3Var, 805306416, 509);
            }
            x18VarM22143u.f67642d = zi3Var;
        }
        yw8Var2 = yw8Var;
        tj3Var.m22102U();
        x18VarM22143u = tj3Var.m22143u();
        if (x18VarM22143u != null) {
            final int i8 = 1;
            final yw8 yw8Var3 = yw8Var2;
            zi3Var = new zi3() { // from class: uw8
                @Override // p000.zi3
                public final Object invoke(Object obj, Object obj2) {
                    int i9 = i8;
                    xfa xfaVar = xfa.f68157a;
                    int i10 = i2;
                    switch (i9) {
                        case 0:
                            ((Integer) obj2).getClass();
                            int iM19383z = pk9.m19383z(i10 | 1);
                            AbstractC2076b.m8986c(yw8Var3, i, vi3Var, c0282a, (ye1) obj, iM19383z);
                            break;
                        default:
                            ((Integer) obj2).getClass();
                            int iM19383z2 = pk9.m19383z(i10 | 1);
                            AbstractC2076b.m8986c(yw8Var3, i, vi3Var, c0282a, (ye1) obj, iM19383z2);
                            break;
                    }
                    return xfaVar;
                }
            };
            x18VarM22143u.f67642d = zi3Var;
        }
    }
}
