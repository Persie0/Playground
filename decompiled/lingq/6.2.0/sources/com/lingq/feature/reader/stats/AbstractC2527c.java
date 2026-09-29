package com.lingq.feature.reader.stats;

import android.app.Activity;
import android.content.Context;
import androidx.compose.p002ui.platform.AbstractC0394f;
import androidx.compose.p002ui.platform.AbstractC0402n;
import androidx.compose.runtime.AbstractC0278f;
import androidx.lifecycle.compose.AbstractC0711a;
import com.lingq.core.analytics.data.LqAnalyticsValues$LessonPath;
import com.lingq.core.common.util.AbstractC1263a;
import com.lingq.core.domain.model.lesson.LessonReference;
import com.lingq.core.domain.model.lesson.TokenType;
import com.lingq.core.domain.model.library.LibraryShelf;
import com.lingq.core.domain.model.token.TokenControllerType;
import com.lingq.core.domain.model.token.TokenTransliteration;
import com.lingq.core.token.AbstractC1899b;
import com.lingq.core.token.C1909e;
import com.lingq.core.token.TokenPopupData;
import com.lingq.core.token.TokenViewState;
import java.util.Map;
import kotlin.collections.EmptyList;
import p000.AbstractC3584sr;
import p000.C3026g5;
import p000.C3386nv;
import p000.C3539rk;
import p000.C3577sk;
import p000.InterfaceC3066h8;
import p000.a85;
import p000.b5d;
import p000.bia;
import p000.c3a;
import p000.cl9;
import p000.d32;
import p000.d4b;
import p000.dua;
import p000.e28;
import p000.ea6;
import p000.eh0;
import p000.f5a;
import p000.fa4;
import p000.fz4;
import p000.gi5;
import p000.gr3;
import p000.i91;
import p000.ja6;
import p000.jl6;
import p000.lda;
import p000.mbd;
import p000.mn5;
import p000.or1;
import p000.p84;
import p000.pfa;
import p000.qid;
import p000.qj9;
import p000.ql9;
import p000.s65;
import p000.sc9;
import p000.si5;
import p000.t31;
import p000.t66;
import p000.tj3;
import p000.ub5;
import p000.ud6;
import p000.ui3;
import p000.uj9;
import p000.un1;
import p000.ux4;
import p000.ux5;
import p000.vi3;
import p000.vx4;
import p000.vz1;
import p000.w41;
import p000.we1;
import p000.wfb;
import p000.x08;
import p000.x18;
import p000.xfa;
import p000.xx4;
import p000.xy0;
import p000.y38;
import p000.y65;
import p000.ye1;
import p000.yx4;
import p000.zc7;
import p000.zi3;

/* JADX INFO: renamed from: com.lingq.feature.reader.stats.c */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC2527c {
    /* JADX INFO: renamed from: a */
    public static final void m9455a(ud6 ud6Var, w41 w41Var, bia biaVar, C2535j c2535j, C1909e c1909e, ye1 ye1Var, int i) {
        final ud6 ud6Var2;
        bia biaVar2;
        C2535j c2535j2;
        C1909e c1909e2;
        C2535j c2535j3;
        C1909e c1909e3;
        Object lessonCompleteRouteKt$LessonCompleteRoute$3$1;
        C2535j c2535j4;
        Boolean bool;
        t66 t66Var;
        ud6Var.getClass();
        w41Var.getClass();
        biaVar.getClass();
        tj3 tj3Var = (tj3) ye1Var;
        tj3Var.m22115d0(-973187256);
        int i2 = i | (tj3Var.m22124i(ud6Var) ? 4 : 2) | (tj3Var.m22124i(w41Var) ? 32 : 16) | (tj3Var.m22124i(biaVar) ? 256 : 128) | 9216;
        if (tj3Var.m22099R(i2 & 1, (i2 & 9363) != 9362)) {
            tj3Var.m22104W();
            if ((i & 1) == 0 || tj3Var.m22084B()) {
                dua duaVarM21396a = si5.m21396a(tj3Var);
                if (duaVarM21396a == null) {
                    C3386nv.m17633t("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner");
                    return;
                }
                c2535j3 = (C2535j) pfa.m19114d(y38.m24933a(C2535j.class), duaVarM21396a, null, AbstractC3584sr.m21591B(duaVarM21396a, tj3Var), duaVarM21396a instanceof gr3 ? ((gr3) duaVarM21396a).mo2103e() : or1.f54780b, tj3Var);
                dua duaVarM21396a2 = si5.m21396a(tj3Var);
                if (duaVarM21396a2 == null) {
                    C3386nv.m17633t("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner");
                    return;
                }
                c1909e3 = (C1909e) pfa.m19114d(y38.m24933a(C1909e.class), duaVarM21396a2, null, AbstractC3584sr.m21591B(duaVarM21396a2, tj3Var), duaVarM21396a2 instanceof gr3 ? ((gr3) duaVarM21396a2).mo2103e() : or1.f54780b, tj3Var);
            } else {
                tj3Var.m22102U();
                c2535j3 = c2535j;
                c1909e3 = c1909e;
            }
            tj3Var.m22140r();
            final Context context = (Context) tj3Var.m22128k(AbstractC0394f.f4761b);
            t31 t31Var = (t31) tj3Var.m22128k(AbstractC0402n.f4814f);
            Object objM22097O = tj3Var.m22097O();
            p84 p84Var = we1.f66679a;
            if (objM22097O == p84Var) {
                objM22097O = d32.m10013K(tj3Var);
                tj3Var.m22131l0(objM22097O);
            }
            un1 un1Var = (un1) objM22097O;
            ub5 ub5Var = (ub5) tj3Var.m22128k(gi5.f40854a);
            t66 t66VarM2513c = AbstractC0711a.m2513c(c2535j3.f30819b0, tj3Var);
            t66 t66VarM2513c2 = AbstractC0711a.m2513c(c2535j3.f30821c0, tj3Var);
            t66 t66VarM2513c3 = AbstractC0711a.m2513c(c2535j3.f30847p0, tj3Var);
            t66 t66VarM2513c4 = AbstractC0711a.m2513c(c2535j3.f30853s0, tj3Var);
            t66 t66VarM2513c5 = AbstractC0711a.m2513c(c2535j3.f30851r0, tj3Var);
            t66 t66VarM2513c6 = AbstractC0711a.m2513c(c2535j3.f30823d0, tj3Var);
            t66 t66VarM2513c7 = AbstractC0711a.m2513c(c2535j3.f30827f0, tj3Var);
            t66 t66VarM2513c8 = AbstractC0711a.m2513c(c2535j3.f30825e0, tj3Var);
            t66 t66VarM2513c9 = AbstractC0711a.m2513c(c2535j3.f30829g0, tj3Var);
            t66 t66VarM2513c10 = AbstractC0711a.m2513c(c2535j3.f30831h0, tj3Var);
            t66 t66VarM2513c11 = AbstractC0711a.m2513c(c2535j3.f30833i0, tj3Var);
            t66 t66VarM2513c12 = AbstractC0711a.m2513c(c2535j3.f30810T, tj3Var);
            t66 t66VarM2513c13 = AbstractC0711a.m2513c(c2535j3.f30817a0, tj3Var);
            t66 t66VarM2513c14 = AbstractC0711a.m2513c(c2535j3.f30818b.mo4594r1(), tj3Var);
            final t66 t66VarM2512b = AbstractC0711a.m2512b(c2535j3.f30820c.mo9319C2(), xx4.f68925a, tj3Var, 0);
            t66 t66VarM2513c15 = AbstractC0711a.m2513c(c2535j3.f30837k0, tj3Var);
            t66 t66VarM2513c16 = AbstractC0711a.m2513c(c2535j3.f30841m0, tj3Var);
            t66 t66VarM2513c17 = AbstractC0711a.m2513c(c2535j3.f30808R, tj3Var);
            t66 t66VarM2513c18 = AbstractC0711a.m2513c(c2535j3.f30807Q, tj3Var);
            t66 t66VarM2513c19 = AbstractC0711a.m2513c(c1909e3.f23886X, tj3Var);
            boolean z = ((f5a) t66VarM2513c19.getValue()).f38475g != null;
            boolean zM22124i = tj3Var.m22124i(c1909e3) | tj3Var.m22124i(c2535j3);
            Object objM22097O2 = tj3Var.m22097O();
            if (zM22124i || objM22097O2 == p84Var) {
                objM22097O2 = new C3577sk(28, c1909e3, c2535j3);
                tj3Var.m22131l0(objM22097O2);
            }
            eh0.m11123c(0, 0, tj3Var, (ui3) objM22097O2, z);
            Object objM22097O3 = tj3Var.m22097O();
            if (objM22097O3 == p84Var) {
                objM22097O3 = AbstractC0278f.m1260j(Boolean.FALSE);
                tj3Var.m22131l0(objM22097O3);
            }
            t66 t66Var2 = (t66) objM22097O3;
            Object objM22097O4 = tj3Var.m22097O();
            if (objM22097O4 == p84Var) {
                objM22097O4 = AbstractC0278f.m1257g(-1);
                tj3Var.m22131l0(objM22097O4);
            }
            sc9 sc9Var = (sc9) objM22097O4;
            Object objM22097O5 = tj3Var.m22097O();
            if (objM22097O5 == p84Var) {
                objM22097O5 = AbstractC0278f.m1260j("");
                tj3Var.m22131l0(objM22097O5);
            }
            t66 t66Var3 = (t66) objM22097O5;
            Object objM22097O6 = tj3Var.m22097O();
            if (objM22097O6 == p84Var) {
                objM22097O6 = AbstractC0278f.m1260j(Boolean.FALSE);
                tj3Var.m22131l0(objM22097O6);
            }
            t66 t66Var4 = (t66) objM22097O6;
            boolean zM22124i2 = tj3Var.m22124i(ub5Var) | tj3Var.m22124i(c2535j3);
            Object objM22097O7 = tj3Var.m22097O();
            if (zM22124i2 || objM22097O7 == p84Var) {
                objM22097O7 = new LessonCompleteRouteKt$LessonCompleteRoute$2$1(ub5Var, c2535j3, null);
                tj3Var.m22131l0(objM22097O7);
            }
            d32.m10047k(tj3Var, (zi3) objM22097O7, ub5Var);
            Boolean bool2 = (Boolean) t66VarM2513c15.getValue();
            bool2.getClass();
            boolean zM22120g = tj3Var.m22120g(t66VarM2513c15) | tj3Var.m22124i(c2535j3) | tj3Var.m22120g(t66VarM2513c17) | tj3Var.m22124i(ud6Var) | tj3Var.m22124i(w41Var);
            Object objM22097O8 = tj3Var.m22097O();
            if (zM22120g || objM22097O8 == p84Var) {
                c2535j4 = c2535j3;
                bool = bool2;
                t66Var = t66VarM2513c17;
                lessonCompleteRouteKt$LessonCompleteRoute$3$1 = new LessonCompleteRouteKt$LessonCompleteRoute$3$1(c2535j4, ud6Var, w41Var, t66VarM2513c15, t66Var, null);
                tj3Var.m22131l0(lessonCompleteRouteKt$LessonCompleteRoute$3$1);
            } else {
                bool = bool2;
                c2535j4 = c2535j3;
                lessonCompleteRouteKt$LessonCompleteRoute$3$1 = objM22097O8;
                t66Var = t66VarM2513c17;
            }
            d32.m10047k(tj3Var, (zi3) lessonCompleteRouteKt$LessonCompleteRoute$3$1, bool);
            zc7 zc7Var = (zc7) t66VarM2513c16.getValue();
            boolean zM22120g2 = tj3Var.m22120g(t66VarM2513c16) | tj3Var.m22124i(c2535j4);
            Object objM22097O9 = tj3Var.m22097O();
            if (zM22120g2 || objM22097O9 == p84Var) {
                objM22097O9 = new LessonCompleteRouteKt$LessonCompleteRoute$4$1(c2535j4, t66VarM2513c16, sc9Var, t66Var3, t66Var4, t66Var2, null);
                tj3Var.m22131l0(objM22097O9);
            }
            d32.m10047k(tj3Var, (zi3) objM22097O9, zc7Var);
            boolean z2 = c2535j4.f30804N;
            qj9 qj9Var = (qj9) t66VarM2513c.getValue();
            uj9 uj9Var = (uj9) t66VarM2513c2.getValue();
            s65 s65Var = (s65) t66VarM2513c3.getValue();
            jl6 jl6Var = (jl6) t66VarM2513c4.getValue();
            y65 y65Var = (y65) t66VarM2513c5.getValue();
            final C2535j c2535j5 = c2535j4;
            C1909e c1909e4 = c1909e3;
            qid.m19981a(z2, qj9Var, uj9Var, (d4b) t66VarM2513c6.getValue(), (InterfaceC3066h8) t66VarM2513c8.getValue(), (a85) t66VarM2513c7.getValue(), s65Var, jl6Var, y65Var, (C3026g5) t66VarM2513c9.getValue(), (ql9) t66VarM2513c10.getValue(), (x08) t66VarM2513c11.getValue(), ((LibraryShelf) t66VarM2513c12.getValue()) != null, (mn5) t66VarM2513c13.getValue(), new C2526b(ud6Var, c2535j5, w41Var, t66VarM2513c18, t66Var, biaVar, t66VarM2513c13, un1Var, t31Var, c1909e3, t66VarM2513c14, t66VarM2513c12), tj3Var, 0, 0);
            tj3Var = tj3Var;
            boolean z3 = !(((yx4) t66VarM2512b.getValue()) instanceof xx4);
            yx4 yx4Var = (yx4) t66VarM2512b.getValue();
            boolean zM22124i3 = tj3Var.m22124i(c2535j5);
            Object objM22097O10 = tj3Var.m22097O();
            if (zM22124i3 || objM22097O10 == p84Var) {
                objM22097O10 = new C3539rk(c2535j5, 29);
                tj3Var.m22131l0(objM22097O10);
            }
            ui3 ui3Var = (ui3) objM22097O10;
            ud6Var2 = ud6Var;
            boolean zM22124i4 = tj3Var.m22124i(c2535j5) | tj3Var.m22120g(t66VarM2512b) | tj3Var.m22124i(context) | tj3Var.m22124i(ud6Var2);
            Object objM22097O11 = tj3Var.m22097O();
            if (zM22124i4 || objM22097O11 == p84Var) {
                objM22097O11 = new ui3(context, ud6Var2, t66VarM2512b) { // from class: com.lingq.feature.reader.stats.a

                    /* JADX INFO: renamed from: b */
                    public final /* synthetic */ Context f30721b;

                    /* JADX INFO: renamed from: c */
                    public final /* synthetic */ t66 f30722c;

                    {
                        this.f30722c = t66VarM2512b;
                    }

                    @Override // p000.ui3
                    /* JADX INFO: renamed from: a */
                    public final Object mo0a() {
                        xx4 xx4Var = xx4.f68925a;
                        C2535j c2535j6 = this.f30720a;
                        c2535j6.f30820c.mo9326g2(xx4Var);
                        t66 t66Var5 = this.f30722c;
                        yx4 yx4Var2 = (yx4) t66Var5.getValue();
                        if (yx4Var2 instanceof ux4) {
                            Context context2 = this.f30721b;
                            Activity activity = context2 instanceof Activity ? (Activity) context2 : null;
                            if (activity != null) {
                                yx4 yx4Var3 = (yx4) t66Var5.getValue();
                                yx4Var3.getClass();
                                mbd.m16755c(activity, ((ux4) yx4Var3).f64488c, null, 26);
                            }
                        } else if (yx4Var2 instanceof vx4) {
                            yx4 yx4Var4 = (yx4) t66Var5.getValue();
                            yx4Var4.getClass();
                            vx4 vx4Var = (vx4) yx4Var4;
                            int i3 = vx4Var.f66044a;
                            int i4 = vx4Var.f66046c;
                            AbstractC1263a.m7047b(lda.m16103C(c2535j6), c2535j6.f30802L, ux5.m22988k(i4, "buyLesson "), new LessonCompleteViewModel$buyLesson$1(c2535j6, i4, i3, null));
                        }
                        return xfa.f68157a;
                    }
                };
                tj3Var.m22131l0(objM22097O11);
            }
            b5d.m3323a(z3, yx4Var, ui3Var, (ui3) objM22097O11, tj3Var, 0);
            biaVar2 = biaVar;
            d32.m10060t(((Boolean) t66Var2.getValue()).booleanValue(), sc9Var.m21222h(), (String) t66Var3.getValue(), false, ((Boolean) t66Var4.getValue()).booleanValue(), new i91(t66Var2, biaVar2, 2), null, tj3Var, 0, 72);
            f5a f5aVar = (f5a) t66VarM2513c19.getValue();
            boolean zM22124i5 = tj3Var.m22124i(c1909e4);
            Object objM22097O12 = tj3Var.m22097O();
            if (zM22124i5 || objM22097O12 == p84Var) {
                objM22097O12 = new fz4(c1909e4, 1);
                tj3Var.m22131l0(objM22097O12);
            }
            AbstractC1899b.m8698g(f5aVar, (vi3) objM22097O12, tj3Var, 8);
            c1909e2 = c1909e4;
            c2535j2 = c2535j5;
        } else {
            ud6Var2 = ud6Var;
            biaVar2 = biaVar;
            tj3Var.m22102U();
            c2535j2 = c2535j;
            c1909e2 = c1909e;
        }
        x18 x18VarM22143u = tj3Var.m22143u();
        if (x18VarM22143u != null) {
            x18VarM22143u.f67642d = new xy0(ud6Var2, w41Var, biaVar2, c2535j2, c1909e2, i, 5);
        }
    }

    /* JADX INFO: renamed from: b */
    public static final void m9456b(C2535j c2535j, boolean z) {
        if (c2535j.f30804N) {
            wfb.m23926u(lda.m16103C(c2535j), null, null, new LessonCompleteViewModel$updateLessonCompleted$1(c2535j, z, null), 3);
        }
    }

    /* JADX INFO: renamed from: c */
    public static final void m9457c(LessonReference lessonReference, w41 w41Var) {
        String str = lessonReference.f19246f;
        String str2 = lessonReference.f19250j;
        boolean zM11650l = fa4.m11650l(str, "external");
        LqAnalyticsValues$LessonPath.LessonComplete lessonComplete = LqAnalyticsValues$LessonPath.LessonComplete.f14308a;
        if (!((zM11650l && str2 != null) || cl9.m4834Q(str, "virtual", true) || cl9.m4834Q(str, "V", true)) || lessonReference.f19244d) {
            int i = lessonReference.f19241a;
            String str3 = lessonReference.f19243c;
            w41Var.m23737z(new ja6(i, 0, str3 != null ? str3 : "", lessonComplete));
            return;
        }
        String str4 = str2 == null ? "" : str2;
        String str5 = lessonReference.f19251k;
        String str6 = str5 == null ? "" : str5;
        int i2 = lessonReference.f19241a;
        boolean z = cl9.m4834Q(str, "virtual", true) || cl9.m4834Q(str, "V", true);
        Integer num = lessonReference.f19249i;
        w41Var.m23737z(new ea6(str4, str6, i2, lessonComplete, "", "", EmptyList.f47638a, z, false, num != null ? num.intValue() : 0));
    }

    /* JADX INFO: renamed from: d */
    public static final void m9458d(C1909e c1909e, String str, String str2, mn5 mn5Var, String str3, TokenType tokenType, e28 e28Var, int i, int i2, int i3, TokenTransliteration tokenTransliteration, Map map) {
        String strM23609O = vz1.m23609O(str3, str);
        int i4 = (int) e28Var.f36621b;
        int i5 = (int) e28Var.f36623d;
        int i6 = (int) e28Var.f36620a;
        int i7 = (int) e28Var.f36622c;
        c1909e.m8760d3(new c3a(new TokenPopupData(str3, strM23609O, tokenType, i4, i5, null, TokenViewState.Collapsed.f23708a, TokenControllerType.Lesson, null, i, tokenTransliteration, false, i2, i3, map, i6, i7, mn5Var.f51567i, mn5Var.f51568j, false, str2, null, false, 6818080, null), true));
    }
}
