package com.lingq.feature.reader.video;

import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.res.Configuration;
import androidx.compose.p002ui.AbstractC0287b;
import androidx.compose.p002ui.node.C0352b;
import androidx.compose.p002ui.platform.AbstractC0394f;
import androidx.compose.runtime.AbstractC0278f;
import androidx.lifecycle.compose.AbstractC0711a;
import com.lingq.core.designsystem.R$bool;
import com.lingq.core.domain.model.lesson.Lesson;
import com.lingq.core.domain.model.lesson.TokenType;
import com.lingq.core.domain.model.status.CardStatus;
import com.lingq.core.domain.model.token.TextTokenType;
import com.lingq.core.domain.model.token.TokenControllerType;
import com.lingq.core.settings.theme.C1883c;
import com.lingq.core.token.AbstractC1899b;
import com.lingq.core.token.C1909e;
import com.lingq.core.token.TokenFragmentData;
import com.lingq.core.token.TokenPopupData;
import com.lingq.core.token.TokenViewState;
import com.lingq.feature.reader.video.components.AbstractC2587a;
import com.lingq.feature.reader.video.state.C2595a;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.WeakHashMap;
import kotlinx.coroutines.flow.C3244l;
import p000.AbstractC3393o1;
import p000.AbstractC3584sr;
import p000.C3288l7;
import p000.C3386nv;
import p000.C3560s4;
import p000.ara;
import p000.as4;
import p000.asa;
import p000.b16;
import p000.b45;
import p000.bra;
import p000.bsa;
import p000.bx7;
import p000.c18;
import p000.c3a;
import p000.c99;
import p000.cd4;
import p000.cg7;
import p000.cy0;
import p000.d32;
import p000.dh9;
import p000.dra;
import p000.dsa;
import p000.du7;
import p000.dua;
import p000.e08;
import p000.e16;
import p000.e28;
import p000.e37;
import p000.eh0;
import p000.era;
import p000.f5a;
import p000.f6d;
import p000.fb7;
import p000.fkc;
import p000.fy9;
import p000.g54;
import p000.gc0;
import p000.gi5;
import p000.gr3;
import p000.h24;
import p000.ho5;
import p000.hqa;
import p000.ht5;
import p000.hx7;
import p000.hz4;
import p000.ira;
import p000.iy7;
import p000.j2c;
import p000.j3a;
import p000.jbb;
import p000.jqa;
import p000.kad;
import p000.kqa;
import p000.l6b;
import p000.l70;
import p000.l77;
import p000.lbb;
import p000.lra;
import p000.lw8;
import p000.mbb;
import p000.mqa;
import p000.ms5;
import p000.n2a;
import p000.nj0;
import p000.nqa;
import p000.nz9;
import p000.oha;
import p000.ojd;
import p000.or1;
import p000.ora;
import p000.p2a;
import p000.p84;
import p000.pb1;
import p000.pbb;
import p000.pfa;
import p000.pk9;
import p000.ps5;
import p000.q7b;
import p000.qbb;
import p000.qh0;
import p000.qj8;
import p000.ql4;
import p000.qra;
import p000.se1;
import p000.sgc;
import p000.si5;
import p000.sj8;
import p000.sqa;
import p000.sra;
import p000.ss5;
import p000.sx7;
import p000.t66;
import p000.t9a;
import p000.tj3;
import p000.tpa;
import p000.tqa;
import p000.u4d;
import p000.u91;
import p000.ua7;
import p000.ub5;
import p000.ud6;
import p000.ui3;
import p000.un1;
import p000.un7;
import p000.ux5;
import p000.v91;
import p000.vh9;
import p000.vi3;
import p000.vz1;
import p000.w41;
import p000.we1;
import p000.wfb;
import p000.wz7;
import p000.x18;
import p000.xa7;
import p000.xfa;
import p000.xqa;
import p000.xy0;
import p000.xz7;
import p000.y38;
import p000.ye1;
import p000.zg0;
import p000.zi3;
import p000.zqa;
import p000.zu8;

/* JADX INFO: renamed from: com.lingq.feature.reader.video.h */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC2592h {
    /* JADX INFO: renamed from: a */
    public static final void m9516a(C2583a c2583a, C1909e c1909e, C1883c c1883c, ud6 ud6Var, w41 w41Var, ye1 ye1Var, int i) {
        C2583a c2583a2;
        C1909e c1909e2;
        C1883c c1883c2;
        C1883c c1883c3;
        C1909e c1909e3;
        C2583a c2583a3;
        Activity activity;
        Object c3560s4;
        Object obj;
        final t66 t66Var;
        String str;
        t66 t66Var2;
        vi3 vi3Var;
        C1909e c1909e4;
        final t66 t66Var3;
        ud6Var.getClass();
        w41Var.getClass();
        tj3 tj3Var = (tj3) ye1Var;
        tj3Var.m22115d0(1704522665);
        int i2 = i | 146 | (tj3Var.m22124i(ud6Var) ? 2048 : 1024) | (tj3Var.m22124i(w41Var) ? 16384 : 8192);
        if (tj3Var.m22099R(i2 & 1, (i2 & 9363) != 9362)) {
            tj3Var.m22104W();
            if ((i & 1) == 0 || tj3Var.m22084B()) {
                dua duaVarM21396a = si5.m21396a(tj3Var);
                if (duaVarM21396a == null) {
                    C3386nv.m17633t("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner");
                    return;
                }
                C2583a c2583a4 = (C2583a) pfa.m19114d(y38.m24933a(C2583a.class), duaVarM21396a, null, AbstractC3584sr.m21591B(duaVarM21396a, tj3Var), duaVarM21396a instanceof gr3 ? ((gr3) duaVarM21396a).mo2103e() : or1.f54780b, tj3Var);
                dua duaVarM21396a2 = si5.m21396a(tj3Var);
                if (duaVarM21396a2 == null) {
                    C3386nv.m17633t("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner");
                    return;
                }
                C1909e c1909e5 = (C1909e) pfa.m19114d(y38.m24933a(C1909e.class), duaVarM21396a2, null, AbstractC3584sr.m21591B(duaVarM21396a2, tj3Var), duaVarM21396a2 instanceof gr3 ? ((gr3) duaVarM21396a2).mo2103e() : or1.f54780b, tj3Var);
                dua duaVarM21396a3 = si5.m21396a(tj3Var);
                if (duaVarM21396a3 == null) {
                    C3386nv.m17633t("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner");
                    return;
                } else {
                    c1883c3 = (C1883c) pfa.m19114d(y38.m24933a(C1883c.class), duaVarM21396a3, null, AbstractC3584sr.m21591B(duaVarM21396a3, tj3Var), duaVarM21396a3 instanceof gr3 ? ((gr3) duaVarM21396a3).mo2103e() : or1.f54780b, tj3Var);
                    c1909e3 = c1909e5;
                    c2583a3 = c2583a4;
                }
            } else {
                tj3Var.m22102U();
                c2583a3 = c2583a;
                c1909e3 = c1909e;
                c1883c3 = c1883c;
            }
            tj3Var.m22140r();
            final String strMo4589b2 = c2583a3.f31369b.mo4589b2();
            Context context = (Context) tj3Var.m22128k(AbstractC0394f.f4761b);
            t66 t66VarM2513c = AbstractC0711a.m2513c(c1909e3.f23886X, tj3Var);
            t66 t66VarM2513c2 = AbstractC0711a.m2513c(c2583a3.f31369b.mo4594r1(), tj3Var);
            t66 t66VarM2513c3 = AbstractC0711a.m2513c(c2583a3.f31363V, tj3Var);
            t66 t66VarM2513c4 = AbstractC0711a.m2513c(c2583a3.f31361T, tj3Var);
            t66 t66VarM2513c5 = AbstractC0711a.m2513c(c2583a3.f31355N, tj3Var);
            t66 t66VarM2513c6 = AbstractC0711a.m2513c(c2583a3.f31364W, tj3Var);
            t66 t66VarM2513c7 = AbstractC0711a.m2513c(c2583a3.f31365X, tj3Var);
            t66 t66VarM2513c8 = AbstractC0711a.m2513c(c2583a3.f31366Y, tj3Var);
            final t66 t66VarM2513c9 = AbstractC0711a.m2513c(c2583a3.f31367Z, tj3Var);
            final t66 t66VarM2513c10 = AbstractC0711a.m2513c(c2583a3.f31353L, tj3Var);
            c1883c3.getClass();
            strMo4589b2.getClass();
            C3244l c3244l = c1883c3.f23312m;
            c3244l.getClass();
            c3244l.m15572j(null, strMo4589b2);
            t66 t66VarM2513c11 = AbstractC0711a.m2513c(c1883c3.f23314o, tj3Var);
            final t66 t66VarM2513c12 = AbstractC0711a.m2513c((c18) c2583a3.f31373f.f55514c, tj3Var);
            t66 t66VarM2513c13 = AbstractC0711a.m2513c(c2583a3.f31357P, tj3Var);
            t66 t66VarM2513c14 = AbstractC0711a.m2513c(c2583a3.f31358Q, tj3Var);
            Lesson lesson = ((hx7) t66VarM2513c8.getValue()).f43114c;
            ub5 ub5Var = (ub5) tj3Var.m22128k(gi5.f40854a);
            boolean zM22124i = tj3Var.m22124i(c2583a3) | tj3Var.m22124i(ub5Var);
            Object objM22097O = tj3Var.m22097O();
            p84 p84Var = we1.f66679a;
            if (zM22124i || objM22097O == p84Var) {
                objM22097O = new sx7(3, ub5Var, c2583a3);
                tj3Var.m22131l0(objM22097O);
            }
            d32.m10041h(ub5Var, (vi3) objM22097O, tj3Var);
            boolean zBooleanValue = ((Boolean) t66VarM2513c13.getValue()).booleanValue();
            boolean zM22124i2 = tj3Var.m22124i(c2583a3);
            Object objM22097O2 = tj3Var.m22097O();
            if (zM22124i2 || objM22097O2 == p84Var) {
                objM22097O2 = new cg7(c2583a3, 5);
                tj3Var.m22131l0(objM22097O2);
            }
            vi3 vi3Var2 = (vi3) objM22097O2;
            boolean zM22124i3 = tj3Var.m22124i(c2583a3);
            Object objM22097O3 = tj3Var.m22097O();
            if (zM22124i3 || objM22097O3 == p84Var) {
                objM22097O3 = new hz4(c2583a3, 20);
                tj3Var.m22131l0(objM22097O3);
            }
            u4d.m22468c(zBooleanValue, vi3Var2, (ui3) objM22097O3, tj3Var, 0);
            boolean z = ((Configuration) tj3Var.m22128k(AbstractC0394f.f4760a)).orientation == 2;
            boolean z2 = ((dsa) t66VarM2513c5.getValue()).f36184d;
            Context baseContext = context;
            while (true) {
                if (!(baseContext instanceof ContextWrapper)) {
                    activity = null;
                    break;
                } else if (baseContext instanceof Activity) {
                    activity = (Activity) baseContext;
                    break;
                } else {
                    baseContext = ((ContextWrapper) baseContext).getBaseContext();
                    baseContext.getClass();
                }
            }
            boolean zM12247b = fy9.m12247b(t9a.m21912b(tj3Var));
            boolean z3 = z;
            Object objM22097O4 = tj3Var.m22097O();
            if (objM22097O4 == p84Var) {
                objM22097O4 = Boolean.valueOf(context.getResources().getBoolean(R$bool.is_phone));
                tj3Var.m22131l0(objM22097O4);
            }
            boolean zBooleanValue2 = ((Boolean) objM22097O4).booleanValue();
            boolean z4 = !zM12247b && z3;
            boolean z5 = z4 && ((Boolean) AbstractC0711a.m2513c(c2583a3.f31374g.f29838d, tj3Var).getValue()).booleanValue() && !z2;
            Object objM22097O5 = tj3Var.m22097O();
            if (objM22097O5 == p84Var) {
                objM22097O5 = AbstractC0278f.m1260j(VideoSidePanelContent.Vocabulary);
                tj3Var.m22131l0(objM22097O5);
            }
            final t66 t66Var4 = (t66) objM22097O5;
            Boolean boolValueOf = Boolean.valueOf(z5);
            boolean zM22124i4 = tj3Var.m22124i(c1909e3);
            Object objM22097O6 = tj3Var.m22097O();
            if (zM22124i4 || objM22097O6 == p84Var) {
                objM22097O6 = new ReaderVideoScreenKt$ReaderVideoRoute$4$1(c1909e3, t66Var4, null);
                tj3Var.m22131l0(objM22097O6);
            }
            d32.m10047k(tj3Var, (zi3) objM22097O6, boolValueOf);
            Boolean boolValueOf2 = Boolean.valueOf(z2);
            boolean zM22124i5 = tj3Var.m22124i(activity) | tj3Var.m22122h(z2);
            Object objM22097O7 = tj3Var.m22097O();
            if (zM22124i5 || objM22097O7 == p84Var) {
                objM22097O7 = new ReaderVideoScreenKt$ReaderVideoRoute$5$1(activity, z2, zBooleanValue2, null);
                tj3Var.m22131l0(objM22097O7);
            }
            d32.m10047k(tj3Var, (zi3) objM22097O7, boolValueOf2);
            boolean zM22124i6 = tj3Var.m22124i(activity);
            Object objM22097O8 = tj3Var.m22097O();
            int i3 = 4;
            if (zM22124i6 || objM22097O8 == p84Var) {
                objM22097O8 = new cy0(activity, zBooleanValue2, i3);
                tj3Var.m22131l0(objM22097O8);
            }
            xfa xfaVar = xfa.f68157a;
            d32.m10041h(xfaVar, (vi3) objM22097O8, tj3Var);
            int i4 = 6;
            if (z2) {
                tj3Var.m22111b0(40563609);
                boolean zM22124i7 = tj3Var.m22124i(activity);
                Object objM22097O9 = tj3Var.m22097O();
                if (zM22124i7 || objM22097O9 == p84Var) {
                    objM22097O9 = new cg7(activity, i4);
                    tj3Var.m22131l0(objM22097O9);
                }
                d32.m10041h(xfaVar, (vi3) objM22097O9, tj3Var);
                tj3Var.m22139q(false);
            } else {
                tj3Var.m22111b0(40932633);
                tj3Var.m22139q(false);
            }
            boolean zM22122h = tj3Var.m22122h(z2) | tj3Var.m22124i(c2583a3) | tj3Var.m22124i(c1909e3) | tj3Var.m22124i(ud6Var);
            Object objM22097O10 = tj3Var.m22097O();
            if (zM22122h || objM22097O10 == p84Var) {
                obj = null;
                c3560s4 = new C3560s4(2, c2583a3, c1909e3, ud6Var, z2);
                tj3Var.m22131l0(c3560s4);
            } else {
                c3560s4 = objM22097O10;
                obj = null;
            }
            eh0.m11123c(0, 1, tj3Var, (ui3) c3560s4, false);
            Object objM22097O11 = tj3Var.m22097O();
            if (objM22097O11 == p84Var) {
                objM22097O11 = AbstractC0278f.m1260j(obj);
                tj3Var.m22131l0(objM22097O11);
            }
            final t66 t66Var5 = (t66) objM22097O11;
            Object objM22097O12 = tj3Var.m22097O();
            if (objM22097O12 == p84Var) {
                objM22097O12 = AbstractC0278f.m1260j(Boolean.FALSE);
                tj3Var.m22131l0(objM22097O12);
            }
            final t66 t66Var6 = (t66) objM22097O12;
            Object objM22097O13 = tj3Var.m22097O();
            if (objM22097O13 == p84Var) {
                objM22097O13 = AbstractC0278f.m1260j(obj);
                tj3Var.m22131l0(objM22097O13);
            }
            final t66 t66Var7 = (t66) objM22097O13;
            Object objM22097O14 = tj3Var.m22097O();
            if (objM22097O14 == p84Var) {
                objM22097O14 = d32.m10013K(tj3Var);
                tj3Var.m22131l0(objM22097O14);
            }
            final un1 un1Var = (un1) objM22097O14;
            boolean zM22124i8 = tj3Var.m22124i(c2583a3) | tj3Var.m22124i(c1909e3) | tj3Var.m22124i(ud6Var);
            Object objM22097O15 = tj3Var.m22097O();
            if (zM22124i8 || objM22097O15 == p84Var) {
                objM22097O15 = new zg0(c2583a3, c1909e3, ud6Var, 28);
                tj3Var.m22131l0(objM22097O15);
            }
            ui3 ui3Var = (ui3) objM22097O15;
            boolean zM22124i9 = tj3Var.m22124i(w41Var) | tj3Var.m22124i(lesson) | tj3Var.m22124i(ud6Var) | tj3Var.m22124i(c2583a3) | tj3Var.m22124i(context) | tj3Var.m22120g(ui3Var);
            Object objM22097O16 = tj3Var.m22097O();
            if (zM22124i9 || objM22097O16 == p84Var) {
                C2583a c2583a5 = c2583a3;
                b45 b45Var = new b45(w41Var, lesson, ud6Var, c2583a5, context, ui3Var, 3);
                c2583a3 = c2583a5;
                tj3Var.m22131l0(b45Var);
                objM22097O16 = b45Var;
            }
            final vi3 vi3Var3 = (vi3) objM22097O16;
            boolean zM22124i10 = tj3Var.m22124i(c2583a3) | tj3Var.m22124i(c1909e3) | tj3Var.m22122h(z5) | tj3Var.m22120g(t66VarM2513c12);
            Object objM22097O17 = tj3Var.m22097O();
            if (zM22124i10 || objM22097O17 == p84Var) {
                objM22097O17 = new C2584b(c2583a3, c1909e3, z5, t66Var4, t66VarM2513c12, t66Var5);
                tj3Var.m22131l0(objM22097O17);
            }
            vi3 vi3Var4 = (vi3) objM22097O17;
            boolean zM22124i11 = tj3Var.m22124i(c2583a3) | tj3Var.m22120g(t66VarM2513c10) | tj3Var.m22120g(strMo4589b2) | tj3Var.m22122h(z5) | tj3Var.m22124i(c1909e3) | tj3Var.m22120g(t66VarM2513c12) | tj3Var.m22124i(un1Var) | tj3Var.m22120g(t66VarM2513c9) | tj3Var.m22120g(t66VarM2513c3) | tj3Var.m22120g(vi3Var3);
            Object objM22097O18 = tj3Var.m22097O();
            if (zM22124i11 || objM22097O18 == p84Var) {
                final C2583a c2583a6 = c2583a3;
                t66Var = t66VarM2513c3;
                final boolean z6 = z5;
                final C1909e c1909e6 = c1909e3;
                objM22097O18 = new vi3() { // from class: com.lingq.feature.reader.video.c
                    @Override // p000.vi3
                    public final Object invoke(Object obj2) {
                        Integer numValueOf;
                        Object next;
                        C2583a c2583a7 = c2583a6;
                        C2595a c2595a = c2583a7.f31372e;
                        qra qraVar = (qra) obj2;
                        qraVar.getClass();
                        boolean z7 = qraVar instanceof lra;
                        String str2 = strMo4589b2;
                        boolean z8 = z6;
                        C1909e c1909e7 = c1909e6;
                        dh9 dh9Var = t66VarM2513c10;
                        t66 t66Var8 = t66Var5;
                        t66 t66Var9 = t66Var4;
                        TokenViewState tokenViewState = TokenViewState.Collapsed.f23708a;
                        TokenViewState.Expanded expanded = TokenViewState.Expanded.f23709a;
                        jbb jbbVar = jbb.f45386a;
                        if (z7) {
                            c2583a7.m9509V2(qraVar);
                            if (((Boolean) dh9Var.getValue()).booleanValue()) {
                                t66Var8.setValue(jbbVar);
                            }
                            lra lraVar = (lra) qraVar;
                            xz7 xz7Var = lraVar.f50048b;
                            c2595a.getClass();
                            xz7Var.getClass();
                            TokenFragmentData tokenFragmentDataM9520b = c2595a.m9520b(vz1.m23604J(xz7Var));
                            String str3 = xz7Var.f69008e;
                            String strM23609O = vz1.m23609O(str3, str2);
                            TokenType tokenType = lraVar.f50049c;
                            e28 e28Var = lraVar.f50051e;
                            int i5 = (int) e28Var.f36621b;
                            int i6 = (int) e28Var.f36623d;
                            int i7 = (int) e28Var.f36620a;
                            int i8 = (int) e28Var.f36622c;
                            if (z8) {
                                tokenViewState = expanded;
                            }
                            c1909e7.m8760d3(new c3a(new TokenPopupData(str3, strM23609O, tokenType, i5, i6, tokenFragmentDataM9520b, tokenViewState, TokenControllerType.LessonVideo, null, xz7Var.f69009f, xz7Var.f69013j, false, xz7Var.f69010g, xz7Var.f69011h, xz7Var.f69017n, i7, i8, 0, 0, z8, null, null, false, 7735552, null), false));
                            if (z8) {
                                t66Var9.setValue(VideoSidePanelContent.TokenPopup);
                            }
                        } else if (qraVar instanceof xqa) {
                            c2583a7.m9509V2(qraVar);
                            if (((Boolean) dh9Var.getValue()).booleanValue()) {
                                t66Var8.setValue(jbbVar);
                            }
                            xqa xqaVar = (xqa) qraVar;
                            iy7 iy7Var = xqaVar.f68550a;
                            List list = iy7Var.f44782d;
                            xz7 xz7Var2 = iy7Var.f44779a;
                            List listM23604J = list;
                            if (listM23604J.isEmpty()) {
                                listM23604J = vz1.m23604J(xz7Var2);
                            }
                            TokenFragmentData tokenFragmentDataM9520b2 = c2595a.m9520b(listM23604J);
                            String str4 = xz7Var2.f69008e;
                            String strM23609O2 = vz1.m23609O(str4, str2);
                            TokenType tokenType2 = TokenType.NewWordOrPhraseType;
                            e28 e28Var2 = xqaVar.f68552c;
                            int i9 = (int) e28Var2.f36621b;
                            int i10 = (int) e28Var2.f36623d;
                            int i11 = (int) e28Var2.f36620a;
                            int i12 = (int) e28Var2.f36622c;
                            if (z8) {
                                tokenViewState = expanded;
                            }
                            TokenControllerType tokenControllerType = TokenControllerType.LessonVideo;
                            int i13 = xz7Var2.f69009f;
                            xz7 xz7Var3 = (xz7) u91.m22591I0(iy7Var.f44782d);
                            int i14 = xz7Var3 != null ? xz7Var3.f69010g : xz7Var2.f69010g;
                            xz7 xz7Var4 = (xz7) u91.m22591I0(iy7Var.f44782d);
                            c1909e7.m8760d3(new c3a(new TokenPopupData(str4, strM23609O2, tokenType2, i9, i10, tokenFragmentDataM9520b2, tokenViewState, tokenControllerType, null, i13, null, false, i14, xz7Var4 != null ? xz7Var4.f69011h : xz7Var2.f69011h, null, i11, i12, 0, 0, z8, null, null, true, 3558656, null), false));
                            if (z8) {
                                t66Var9.setValue(VideoSidePanelContent.TokenPopup);
                            }
                        } else if (qraVar instanceof ira) {
                            c2583a7.m9509V2(qraVar);
                            zu8 zu8Var = ((ira) qraVar).f44463a;
                            List list2 = zu8Var.f72191a;
                            ArrayList arrayList = new ArrayList();
                            for (Object obj3 : list2) {
                                if (((q7b) obj3).f57357a.f69014k != TextTokenType.PUNCT) {
                                    arrayList.add(obj3);
                                }
                            }
                            String strM22596N0 = u91.m22596N0(arrayList, " ", null, null, new ql4(str2, 20), 30);
                            ArrayList arrayList2 = new ArrayList(v91.m23189q0(arrayList, 10));
                            Iterator it = arrayList.iterator();
                            while (it.hasNext()) {
                                arrayList2.add(((q7b) it.next()).f57357a);
                            }
                            TokenFragmentData tokenFragmentDataM9520b3 = c2595a.m9520b(arrayList2);
                            String str5 = zu8Var.f72192b;
                            TokenType tokenType3 = TokenType.NewWordOrPhraseType;
                            e28 e28Var3 = zu8Var.f72193c;
                            int i15 = (int) e28Var3.f36621b;
                            int i16 = (int) e28Var3.f36623d;
                            int i17 = (int) e28Var3.f36620a;
                            int i18 = (int) e28Var3.f36622c;
                            if (z8) {
                                tokenViewState = expanded;
                            }
                            TokenControllerType tokenControllerType2 = TokenControllerType.LessonVideo;
                            Integer num = zu8Var.f72196f;
                            c1909e7.m8760d3(new c3a(new TokenPopupData(str5, strM22596N0, tokenType3, i15, i16, tokenFragmentDataM9520b3, tokenViewState, tokenControllerType2, null, 0, null, false, num != null ? num.intValue() : 0, 0, null, i17, i18, 0, 0, z8, null, null, arrayList.size() > 1, 3567360, null), false));
                            if (z8) {
                                t66Var9.setValue(VideoSidePanelContent.TokenPopup);
                            }
                        } else {
                            boolean z9 = qraVar instanceof mqa;
                            lbb lbbVar = lbb.f49418a;
                            if (z9) {
                                c1909e7.m8760d3(n2a.f52243a);
                                c2583a7.m9509V2(qraVar);
                                if (z8) {
                                    t66Var9.setValue(VideoSidePanelContent.Vocabulary);
                                }
                                if (((bx7) t66VarM2513c12.getValue()).f9143g) {
                                    t66Var8.setValue(lbbVar);
                                }
                            } else {
                                boolean z10 = qraVar instanceof sqa;
                                un1 un1Var2 = un1Var;
                                t66 t66Var10 = t66Var7;
                                if (z10) {
                                    int i19 = ((sqa) qraVar).f61270a;
                                    Iterator it2 = ((List) ((C3244l) c2583a7.f31359R.f9311a).getValue()).iterator();
                                    while (true) {
                                        if (!it2.hasNext()) {
                                            numValueOf = null;
                                            break;
                                        }
                                        Iterator it3 = ((e37) it2.next()).f36654c.iterator();
                                        do {
                                            if (!it3.hasNext()) {
                                                next = null;
                                                break;
                                            }
                                            next = it3.next();
                                        } while (((lw8) next).f50212a != i19);
                                        lw8 lw8Var = (lw8) next;
                                        if (lw8Var != null) {
                                            double d = lw8Var.f50213b;
                                            if (d >= 0.0d) {
                                                numValueOf = Integer.valueOf((int) (d * 1000.0d));
                                                break;
                                            }
                                        }
                                    }
                                    cd4 cd4Var = (cd4) t66Var10.getValue();
                                    if (cd4Var != null) {
                                        cd4Var.mo4537a(null);
                                    }
                                    if (numValueOf != null) {
                                        t66Var8.setValue(new mbb(numValueOf.intValue()));
                                        t66Var10.setValue(wfb.m23926u(un1Var2, null, null, new ReaderVideoScreenKt$ReaderVideoRoute$handleAction$1$1$1(t66Var8, null), 3));
                                    }
                                } else {
                                    boolean zEquals = qraVar.equals(bra.f8903a);
                                    t66 t66Var11 = t66Var6;
                                    if (zEquals) {
                                        t66Var11.setValue(Boolean.valueOf(((hqa) t66VarM2513c9.getValue()).f42795c));
                                        if (((Boolean) t66Var11.getValue()).booleanValue()) {
                                            t66Var8.setValue(jbbVar);
                                        }
                                        c2583a7.m9509V2(qraVar);
                                    } else {
                                        boolean z11 = qraVar instanceof zqa;
                                        dh9 dh9Var2 = t66Var;
                                        if (z11) {
                                            AbstractC2592h.m9517b(un1Var2, dh9Var2, t66Var10, t66Var8, ((zqa) qraVar).f71988a, false);
                                            c2583a7.m9509V2(qraVar);
                                        } else if (qraVar instanceof ara) {
                                            AbstractC2592h.m9517b(un1Var2, dh9Var2, t66Var10, t66Var8, ((ara) qraVar).f7407a, ((Boolean) t66Var11.getValue()).booleanValue());
                                            t66Var11.setValue(Boolean.FALSE);
                                            c2583a7.m9509V2(qraVar);
                                        } else if (qraVar instanceof ora) {
                                            j2c j2cVar = ((ora) qraVar).f54799a;
                                            if (j2cVar instanceof ua7) {
                                                t66Var8.setValue(jbbVar);
                                            } else if (j2cVar instanceof xa7) {
                                                t66Var8.setValue(lbbVar);
                                            } else if (j2cVar instanceof fb7) {
                                                t66Var8.setValue(new mbb(((fb7) j2cVar).f38796e));
                                            }
                                            c2583a7.m9509V2(qraVar);
                                        } else {
                                            boolean zEquals2 = qraVar.equals(tqa.f62742a);
                                            vi3 vi3Var5 = vi3Var3;
                                            if (zEquals2) {
                                                c2583a7.m9509V2(qraVar);
                                                if (((tpa) dh9Var2.getValue()).f62714i) {
                                                    vi3Var5.invoke(bsa.f8956a);
                                                } else {
                                                    vi3Var5.invoke(sra.f61324a);
                                                }
                                            } else if (qraVar instanceof dra) {
                                                c2583a7.m9509V2(qraVar);
                                                dra draVar = (dra) qraVar;
                                                vi3Var5.invoke(new asa(c2583a7.f31348G, draVar.f36117a, draVar.f36119c, CardStatus.Learned));
                                            } else if (qraVar.equals(nqa.f53153a) || (qraVar instanceof era) || qraVar.equals(kqa.f48344a) || !qraVar.equals(jqa.f46016a)) {
                                                c2583a7.m9509V2(qraVar);
                                            } else {
                                                c2583a7.m9509V2(qraVar);
                                            }
                                        }
                                    }
                                }
                            }
                        }
                        return xfa.f68157a;
                    }
                };
                str = strMo4589b2;
                t66Var2 = t66Var5;
                t66Var4 = t66Var4;
                vi3Var = vi3Var3;
                tj3Var.m22131l0(objM22097O18);
            } else {
                t66Var = t66VarM2513c3;
                vi3Var = vi3Var3;
                str = strMo4589b2;
                t66Var2 = t66Var5;
            }
            vi3 vi3Var5 = (vi3) objM22097O18;
            boolean zM22120g = tj3Var.m22120g(t66VarM2513c2) | tj3Var.m22124i(c2583a3) | tj3Var.m22120g(str) | tj3Var.m22122h(z5) | tj3Var.m22124i(c1909e3);
            Object objM22097O19 = tj3Var.m22097O();
            if (zM22120g || objM22097O19 == p84Var) {
                t66 t66Var8 = t66Var4;
                C1909e c1909e7 = c1909e3;
                objM22097O19 = new C2584b(c2583a3, str, z5, c1909e7, t66VarM2513c2, t66Var8);
                c1909e4 = c1909e7;
                t66Var3 = t66Var8;
                tj3Var.m22131l0(objM22097O19);
            } else {
                c1909e4 = c1909e3;
                t66Var3 = t66Var4;
            }
            vi3 vi3Var6 = (vi3) objM22097O19;
            pbb pbbVar = (pbb) t66Var2.getValue();
            Object objM22097O20 = tj3Var.m22097O();
            if (objM22097O20 == p84Var) {
                objM22097O20 = new un7(6, t66Var2);
                tj3Var.m22131l0(objM22097O20);
            }
            qbb qbbVar = new qbb(pbbVar, (ui3) objM22097O20);
            tpa tpaVar = (tpa) t66Var.getValue();
            dsa dsaVar = (dsa) t66VarM2513c5.getValue();
            hqa hqaVar = (hqa) t66VarM2513c9.getValue();
            wz7 wz7Var = (wz7) t66VarM2513c6.getValue();
            e08 e08Var = (e08) t66VarM2513c7.getValue();
            hx7 hx7Var = (hx7) t66VarM2513c8.getValue();
            nz9 nz9Var = (nz9) t66VarM2513c11.getValue();
            du7 du7Var = (du7) t66VarM2513c4.getValue();
            h24 h24Var = (h24) t66VarM2513c14.getValue();
            f5a f5aVar = (f5a) t66VarM2513c.getValue();
            VideoSidePanelContent videoSidePanelContent = (VideoSidePanelContent) t66Var3.getValue();
            C1883c c1883c4 = c1883c3;
            boolean zM22124i12 = tj3Var.m22124i(c2583a3) | tj3Var.m22124i(c1883c4);
            Object objM22097O21 = tj3Var.m22097O();
            if (zM22124i12 || objM22097O21 == p84Var) {
                objM22097O21 = new sx7(4, c2583a3, c1883c4);
                tj3Var.m22131l0(objM22097O21);
            }
            vi3 vi3Var7 = (vi3) objM22097O21;
            Object objM22097O22 = tj3Var.m22097O();
            if (objM22097O22 == p84Var) {
                objM22097O22 = new vi3() { // from class: com.lingq.feature.reader.video.f
                    @Override // p000.vi3
                    public final Object invoke(Object obj2) {
                        VideoSidePanelContent videoSidePanelContent2 = (VideoSidePanelContent) obj2;
                        videoSidePanelContent2.getClass();
                        t66Var3.setValue(videoSidePanelContent2);
                        return xfa.f68157a;
                    }
                };
                tj3Var.m22131l0(objM22097O22);
            }
            m9518c(z5, z4, tpaVar, dsaVar, hqaVar, wz7Var, e08Var, hx7Var, nz9Var, du7Var, h24Var, f5aVar, videoSidePanelContent, qbbVar, vi3Var5, vi3Var7, vi3Var, vi3Var4, vi3Var6, (vi3) objM22097O22, tj3Var, 134217728);
            tj3Var = tj3Var;
            c1883c2 = c1883c4;
            c2583a2 = c2583a3;
            c1909e2 = c1909e4;
        } else {
            tj3Var.m22102U();
            c2583a2 = c2583a;
            c1909e2 = c1909e;
            c1883c2 = c1883c;
        }
        x18 x18VarM22143u = tj3Var.m22143u();
        if (x18VarM22143u != null) {
            x18VarM22143u.f67642d = new xy0(c2583a2, c1909e2, c1883c2, ud6Var, w41Var, i, 12);
        }
    }

    /* JADX WARN: Code duplicated, block: B:13:0x0041  */
    /* JADX INFO: renamed from: b */
    public static final void m9517b(un1 un1Var, dh9 dh9Var, t66 t66Var, t66 t66Var2, int i, boolean z) {
        Integer numValueOf;
        List list = ((tpa) dh9Var.getValue()).f62706a;
        int i2 = i - 1;
        int size = list.size() - 1;
        if (size < 0) {
            size = 0;
        }
        e37 e37Var = (e37) u91.m22592J0(l70.m15945h(i2, 0, size), list);
        lw8 lw8Var = e37Var != null ? (lw8) u91.m22591I0(e37Var.f36654c) : null;
        if (lw8Var != null) {
            double d = lw8Var.f50213b;
            if (d >= 0.0d) {
                numValueOf = Integer.valueOf((int) (d * 1000.0d));
            } else {
                numValueOf = null;
            }
        } else {
            numValueOf = null;
        }
        cd4 cd4Var = (cd4) t66Var.getValue();
        if (cd4Var != null) {
            cd4Var.mo4537a(null);
        }
        if (numValueOf == null) {
            if (z) {
                t66Var2.setValue(lbb.f49418a);
            }
        } else {
            t66Var2.setValue(new mbb(numValueOf.intValue()));
            if (z) {
                t66Var.setValue(wfb.m23926u(un1Var, null, null, new ReaderVideoScreenKt$ReaderVideoRoute$seekToSentencePosition$1(t66Var2, null), 3));
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r10v15 */
    /* JADX WARN: Type inference failed for: r10v17, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r10v25 */
    /* JADX INFO: renamed from: c */
    public static final void m9518c(final boolean z, final boolean z2, tpa tpaVar, final dsa dsaVar, final hqa hqaVar, final wz7 wz7Var, final e08 e08Var, final hx7 hx7Var, final nz9 nz9Var, final du7 du7Var, h24 h24Var, f5a f5aVar, final VideoSidePanelContent videoSidePanelContent, final qbb qbbVar, vi3 vi3Var, final vi3 vi3Var2, final vi3 vi3Var3, final vi3 vi3Var4, final vi3 vi3Var5, vi3 vi3Var6, ye1 ye1Var, final int i) {
        final h24 h24Var2;
        final vi3 vi3Var7;
        f5a f5aVar2;
        ?? r10;
        f5a f5aVar3;
        boolean z3;
        final tpa tpaVar2 = tpaVar;
        vi3 vi3Var8 = vi3Var;
        tj3 tj3Var = (tj3) ye1Var;
        tj3Var.m22115d0(-909555487);
        int i2 = i | (tj3Var.m22122h(z) ? 4 : 2) | (tj3Var.m22122h(z2) ? 32 : 16) | (tj3Var.m22120g(tpaVar2) ? 256 : 128) | (tj3Var.m22120g(dsaVar) ? 2048 : 1024) | (tj3Var.m22120g(hqaVar) ? 16384 : 8192) | (tj3Var.m22120g(wz7Var) ? 131072 : 65536) | (tj3Var.m22120g(e08Var) ? 1048576 : 524288) | (tj3Var.m22120g(hx7Var) ? 8388608 : 4194304) | (tj3Var.m22124i(nz9Var) ? 67108864 : 33554432) | (tj3Var.m22120g(du7Var) ? 536870912 : 268435456);
        int i3 = 805306432 | (tj3Var.m22124i(h24Var) ? 4 : 2) | (tj3Var.m22124i(f5aVar) ? 32 : 16) | (tj3Var.m22116e(videoSidePanelContent.ordinal()) ? 256 : 128) | (tj3Var.m22120g(qbbVar) ? 2048 : 1024) | (tj3Var.m22124i(vi3Var8) ? 16384 : 8192) | (tj3Var.m22124i(vi3Var2) ? 131072 : 65536) | (tj3Var.m22124i(vi3Var3) ? 1048576 : 524288) | (tj3Var.m22124i(vi3Var4) ? 8388608 : 4194304) | (tj3Var.m22124i(vi3Var5) ? 67108864 : 33554432);
        if (tj3Var.m22099R(i2 & 1, ((i2 & 306783379) == 306783378 && (i3 & 306783379) == 306783378) ? false : true)) {
            b16 b16Var = b16.f7762a;
            e16 e16VarM4411d = c99.m4411d(b16Var, 1.0f);
            gc0 gc0Var = nj0.f52808c;
            ht5 ht5VarM19966d = qh0.m19966d(gc0Var, false);
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
            zi3 zi3Var = C0352b.f4303f;
            oha.m18001g(tj3Var, zi3Var, ht5VarM19966d);
            zi3 zi3Var2 = C0352b.f4302e;
            oha.m18001g(tj3Var, zi3Var2, l77VarM22132m);
            Integer numValueOf = Integer.valueOf(iHashCode);
            zi3 zi3Var3 = C0352b.f4304g;
            oha.m18001g(tj3Var, zi3Var3, numValueOf);
            vi3 vi3Var9 = C0352b.f4305h;
            oha.m18000f(tj3Var, vi3Var9);
            zi3 zi3Var4 = C0352b.f4301d;
            oha.m18001g(tj3Var, zi3Var4, e16VarM1322c);
            if (z) {
                tj3Var.m22111b0(721404722);
                e16 e16VarM4411d2 = c99.m4411d(b16Var, 1.0f);
                sj8 sj8VarM20003a = qj8.m20003a(eh0.f37236b, nj0.f52817l, tj3Var, 0);
                int iHashCode2 = Long.hashCode(tj3Var.f62385T);
                l77 l77VarM22132m2 = tj3Var.m22132m();
                e16 e16VarM1322c2 = AbstractC0287b.m1322c(tj3Var, e16VarM4411d2);
                tj3Var.m22119f0();
                if (tj3Var.f62384S) {
                    tj3Var.m22130l(ui3Var);
                } else {
                    tj3Var.m22137o0();
                }
                oha.m18001g(tj3Var, zi3Var, sj8VarM20003a);
                oha.m18001g(tj3Var, zi3Var2, l77VarM22132m2);
                AbstractC3393o1.m17747v(iHashCode2, tj3Var, zi3Var3, tj3Var, vi3Var9);
                oha.m18001g(tj3Var, zi3Var4, e16VarM1322c2);
                if (0.7f <= 0.0d) {
                    g54.m12362a("invalid weight; must be greater than zero");
                }
                e16 e16VarM4410c = c99.m4410c(new as4(0.7f > Float.MAX_VALUE ? Float.MAX_VALUE : 0.7f, true), 1.0f);
                ht5 ht5VarM19966d2 = qh0.m19966d(gc0Var, false);
                int iHashCode3 = Long.hashCode(tj3Var.f62385T);
                l77 l77VarM22132m3 = tj3Var.m22132m();
                e16 e16VarM1322c3 = AbstractC0287b.m1322c(tj3Var, e16VarM4410c);
                tj3Var.m22119f0();
                if (tj3Var.f62384S) {
                    tj3Var.m22130l(ui3Var);
                } else {
                    tj3Var.m22137o0();
                }
                oha.m18001g(tj3Var, zi3Var, ht5VarM19966d2);
                oha.m18001g(tj3Var, zi3Var2, l77VarM22132m3);
                AbstractC3393o1.m17747v(iHashCode3, tj3Var, zi3Var3, tj3Var, vi3Var9);
                oha.m18001g(tj3Var, zi3Var4, e16VarM1322c3);
                int i4 = i2 >> 6;
                int i5 = i3 << 15;
                int i6 = (i4 & 29360128) | (i4 & 524286) | 2097152 | (i4 & 3670016) | (i5 & 234881024) | (i5 & 1879048192);
                int i7 = i3 >> 15;
                f6d.m11576a(tpaVar, dsaVar, hqaVar, wz7Var, e08Var, hx7Var, nz9Var, du7Var, qbbVar, vi3Var8, vi3Var2, vi3Var3, tj3Var, i6, i7 & 126);
                tj3Var.m22139q(true);
                e16 e16VarM4410c2 = c99.m4410c(b16Var, 1.0f);
                vh9 vh9Var = ps5.f56764b;
                pb1.m19037g(0.0f, 6, 2, ((ms5) tj3Var.m22128k(vh9Var)).f51799a.f55817B, tj3Var, e16VarM4410c2);
                if (0.3f <= 0.0d) {
                    g54.m12362a("invalid weight; must be greater than zero");
                }
                e16 e16VarM10007D = d32.m10007D(c99.m4410c(new as4(0.3f > Float.MAX_VALUE ? Float.MAX_VALUE : 0.3f, true), 1.0f), ((ms5) tj3Var.m22128k(vh9Var)).f51799a.f55824I, ss5.f61356d);
                WeakHashMap weakHashMap = l6b.f49204w;
                e16 e16VarM23904F = wfb.m23904F(wfb.m23904F(e16VarM10007D, ho5.m13397r(tj3Var).f49210f), ho5.m13397r(tj3Var).f49209e);
                ht5 ht5VarM19966d3 = qh0.m19966d(gc0Var, false);
                int iHashCode4 = Long.hashCode(tj3Var.f62385T);
                l77 l77VarM22132m4 = tj3Var.m22132m();
                e16 e16VarM1322c4 = AbstractC0287b.m1322c(tj3Var, e16VarM23904F);
                tj3Var.m22119f0();
                if (tj3Var.f62384S) {
                    tj3Var.m22130l(ui3Var);
                } else {
                    tj3Var.m22137o0();
                }
                oha.m18001g(tj3Var, zi3Var, ht5VarM19966d3);
                oha.m18001g(tj3Var, zi3Var2, l77VarM22132m4);
                AbstractC3393o1.m17747v(iHashCode4, tj3Var, zi3Var3, tj3Var, vi3Var9);
                oha.m18001g(tj3Var, zi3Var4, e16VarM1322c4);
                int i8 = AbstractC2591g.f31454b[videoSidePanelContent.ordinal()];
                Object obj = we1.f66679a;
                if (i8 == 1) {
                    tj3Var.m22111b0(-1701684017);
                    boolean z4 = (i3 & 29360128) == 8388608;
                    Object objM22097O = tj3Var.m22097O();
                    if (z4 || objM22097O == obj) {
                        vi3Var7 = vi3Var6;
                        objM22097O = new vi3() { // from class: com.lingq.feature.reader.video.d
                            @Override // p000.vi3
                            public final Object invoke(Object obj2) {
                                j3a j3aVar = (j3a) obj2;
                                j3aVar.getClass();
                                vi3Var4.invoke(j3aVar);
                                if ((j3aVar instanceof n2a) || (j3aVar instanceof p2a)) {
                                    vi3Var7.invoke(VideoSidePanelContent.Vocabulary);
                                }
                                return xfa.f68157a;
                            }
                        };
                        tj3Var.m22131l0(objM22097O);
                    } else {
                        vi3Var7 = vi3Var6;
                    }
                    f5aVar3 = f5aVar;
                    AbstractC1899b.m8698g(f5aVar3, (vi3) objM22097O, tj3Var, 8 | ((i3 >> 3) & 14));
                    z3 = false;
                    tj3Var.m22139q(false);
                } else {
                    if (i8 != 2) {
                        throw ux5.m23001x(tj3Var, -193442680, false);
                    }
                    tj3Var.m22111b0(-1701072232);
                    Object objM22097O2 = tj3Var.m22097O();
                    if (objM22097O2 == obj) {
                        objM22097O2 = new C3288l7(7);
                        tj3Var.m22131l0(objM22097O2);
                    }
                    ojd.m18053a(true, null, (ui3) objM22097O2, vi3Var5, tj3Var, (i7 & 7168) | 390);
                    z3 = false;
                    tj3Var.m22139q(false);
                    f5aVar3 = f5aVar;
                    vi3Var7 = vi3Var6;
                }
                AbstractC3393o1.m17723A(tj3Var, true, true, z3);
                vi3Var8 = vi3Var;
                r10 = z3;
                f5aVar2 = f5aVar3;
                tpaVar2 = tpaVar;
            } else {
                vi3Var7 = vi3Var6;
                tj3Var.m22111b0(723934043);
                if (dsaVar.f36184d) {
                    tj3Var.m22111b0(723942413);
                    int i9 = i2 >> 6;
                    int i10 = (i9 & 29360128) | (i9 & 524286) | 2097152 | (i9 & 3670016);
                    int i11 = i3 << 15;
                    vi3Var8 = vi3Var;
                    f5aVar2 = f5aVar;
                    AbstractC2587a.m9513a(tpaVar, dsaVar, hqaVar, wz7Var, e08Var, hx7Var, nz9Var, du7Var, qbbVar, vi3Var8, vi3Var2, vi3Var3, tj3Var, i10 | (i11 & 234881024) | (i11 & 1879048192), (i3 >> 15) & 126);
                    tj3Var.m22139q(false);
                } else {
                    f5aVar2 = f5aVar;
                    if (z2) {
                        tj3Var.m22111b0(724673703);
                        int i12 = i2 >> 6;
                        int i13 = i3 << 15;
                        vi3Var8 = vi3Var;
                        f6d.m11576a(tpaVar, dsaVar, hqaVar, wz7Var, e08Var, hx7Var, nz9Var, du7Var, qbbVar, vi3Var8, vi3Var2, vi3Var3, tj3Var, (i12 & 29360128) | (i12 & 524286) | 2097152 | (i12 & 3670016) | (i13 & 234881024) | (i13 & 1879048192), (i3 >> 15) & 126);
                        tj3Var.m22139q(false);
                    } else {
                        tj3Var.m22111b0(725397646);
                        int i14 = i2 >> 6;
                        int i15 = (i14 & 29360128) | (i14 & 524286) | 2097152 | (i14 & 3670016);
                        int i16 = i3 << 15;
                        tpaVar2 = tpaVar;
                        vi3Var8 = vi3Var;
                        sgc.m21368a(tpaVar2, dsaVar, hqaVar, wz7Var, e08Var, hx7Var, nz9Var, du7Var, qbbVar, vi3Var8, vi3Var2, vi3Var3, tj3Var, i15 | (i16 & 234881024) | (i16 & 1879048192), (i3 >> 15) & 126);
                        tj3Var.m22139q(false);
                    }
                    AbstractC1899b.m8698g(f5aVar2, vi3Var4, tj3Var, 8 | ((i3 >> 3) & 14) | ((i3 >> 18) & 112));
                    r10 = 0;
                    tj3Var.m22139q(false);
                }
                tpaVar2 = tpaVar;
                AbstractC1899b.m8698g(f5aVar2, vi3Var4, tj3Var, 8 | ((i3 >> 3) & 14) | ((i3 >> 18) & 112));
                r10 = 0;
                tj3Var.m22139q(false);
            }
            if (tpaVar2.f62713h) {
                tj3Var.m22111b0(726263197);
                fkc.m11927a(tj3Var, r10);
                tj3Var.m22139q(r10);
            } else {
                tj3Var.m22111b0(726303559);
                tj3Var.m22139q(r10);
            }
            h24Var2 = h24Var;
            kad.m15048a(h24Var2, tpaVar2.f62711f, vi3Var8, tj3Var, (i3 & 14) | ((i3 >> 6) & 896));
            tj3Var.m22139q(true);
        } else {
            h24Var2 = h24Var;
            vi3Var7 = vi3Var6;
            f5aVar2 = f5aVar;
            tj3Var.m22102U();
        }
        x18 x18VarM22143u = tj3Var.m22143u();
        if (x18VarM22143u != null) {
            final vi3 vi3Var10 = vi3Var7;
            final vi3 vi3Var11 = vi3Var8;
            final f5a f5aVar4 = f5aVar2;
            x18VarM22143u.f67642d = new zi3(z, z2, tpaVar2, dsaVar, hqaVar, wz7Var, e08Var, hx7Var, nz9Var, du7Var, h24Var2, f5aVar4, videoSidePanelContent, qbbVar, vi3Var11, vi3Var2, vi3Var3, vi3Var4, vi3Var5, vi3Var10, i) { // from class: com.lingq.feature.reader.video.e

                /* JADX INFO: renamed from: H */
                public final /* synthetic */ VideoSidePanelContent f31432H;

                /* JADX INFO: renamed from: I */
                public final /* synthetic */ qbb f31433I;

                /* JADX INFO: renamed from: J */
                public final /* synthetic */ vi3 f31434J;

                /* JADX INFO: renamed from: K */
                public final /* synthetic */ vi3 f31435K;

                /* JADX INFO: renamed from: L */
                public final /* synthetic */ vi3 f31436L;

                /* JADX INFO: renamed from: M */
                public final /* synthetic */ vi3 f31437M;

                /* JADX INFO: renamed from: N */
                public final /* synthetic */ vi3 f31438N;

                /* JADX INFO: renamed from: O */
                public final /* synthetic */ vi3 f31439O;

                /* JADX INFO: renamed from: a */
                public final /* synthetic */ boolean f31440a;

                /* JADX INFO: renamed from: b */
                public final /* synthetic */ boolean f31441b;

                /* JADX INFO: renamed from: c */
                public final /* synthetic */ tpa f31442c;

                /* JADX INFO: renamed from: d */
                public final /* synthetic */ dsa f31443d;

                /* JADX INFO: renamed from: e */
                public final /* synthetic */ hqa f31444e;

                /* JADX INFO: renamed from: f */
                public final /* synthetic */ wz7 f31445f;

                /* JADX INFO: renamed from: g */
                public final /* synthetic */ e08 f31446g;

                /* JADX INFO: renamed from: h */
                public final /* synthetic */ hx7 f31447h;

                /* JADX INFO: renamed from: i */
                public final /* synthetic */ nz9 f31448i;

                /* JADX INFO: renamed from: j */
                public final /* synthetic */ du7 f31449j;

                /* JADX INFO: renamed from: k */
                public final /* synthetic */ h24 f31450k;

                /* JADX INFO: renamed from: l */
                public final /* synthetic */ f5a f31451l;

                @Override // p000.zi3
                public final Object invoke(Object obj2, Object obj3) {
                    ((Integer) obj3).getClass();
                    int iM19383z = pk9.m19383z(134217729);
                    AbstractC2592h.m9518c(this.f31440a, this.f31441b, this.f31442c, this.f31443d, this.f31444e, this.f31445f, this.f31446g, this.f31447h, this.f31448i, this.f31449j, this.f31450k, this.f31451l, this.f31432H, this.f31433I, this.f31434J, this.f31435K, this.f31436L, this.f31437M, this.f31438N, this.f31439O, (ye1) obj2, iM19383z);
                    return xfa.f68157a;
                }
            };
        }
    }
}
