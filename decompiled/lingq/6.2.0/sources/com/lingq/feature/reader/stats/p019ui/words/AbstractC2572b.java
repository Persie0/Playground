package com.lingq.feature.reader.stats.p019ui.words;

import androidx.compose.p002ui.AbstractC0287b;
import androidx.compose.p002ui.node.C0352b;
import androidx.lifecycle.compose.AbstractC0711a;
import com.lingq.core.domain.model.lesson.LessonWord;
import com.lingq.core.domain.model.lesson.TokenType;
import com.lingq.core.domain.model.token.TokenControllerType;
import com.lingq.core.domain.model.token.TokenMeaning;
import com.lingq.core.p012ui.UpgradeReason;
import com.lingq.core.token.AbstractC1899b;
import com.lingq.core.token.C1909e;
import com.lingq.core.token.TokenPopupData;
import com.lingq.core.token.TokenViewState;
import java.util.List;
import kotlin.collections.EmptyList;
import p000.AbstractC3352my;
import p000.AbstractC3393o1;
import p000.AbstractC3584sr;
import p000.C2956e9;
import p000.C3180kd;
import p000.C3386nv;
import p000.C3522r4;
import p000.C3549ru;
import p000.C3709w4;
import p000.ab1;
import p000.as4;
import p000.atb;
import p000.b16;
import p000.b32;
import p000.b34;
import p000.bb1;
import p000.bia;
import p000.bz4;
import p000.c3a;
import p000.c99;
import p000.ci8;
import p000.cx2;
import p000.d32;
import p000.dua;
import p000.dz4;
import p000.e16;
import p000.eh0;
import p000.f5a;
import p000.fa4;
import p000.fc0;
import p000.fe9;
import p000.fz4;
import p000.g54;
import p000.ge9;
import p000.gm5;
import p000.gr3;
import p000.ht5;
import p000.jfa;
import p000.ke2;
import p000.l77;
import p000.lda;
import p000.lw9;
import p000.ms5;
import p000.n14;
import p000.nj0;
import p000.nja;
import p000.oha;
import p000.oja;
import p000.omd;
import p000.opa;
import p000.or1;
import p000.p58;
import p000.p84;
import p000.pfa;
import p000.pja;
import p000.ps5;
import p000.py0;
import p000.qh0;
import p000.qj8;
import p000.qja;
import p000.rja;
import p000.rw1;
import p000.ry4;
import p000.se1;
import p000.si5;
import p000.sj8;
import p000.sja;
import p000.ss5;
import p000.t17;
import p000.t66;
import p000.tj3;
import p000.tja;
import p000.u91;
import p000.ud6;
import p000.ui3;
import p000.uja;
import p000.vi3;
import p000.vx9;
import p000.vz1;
import p000.wd6;
import p000.we1;
import p000.wfb;
import p000.x18;
import p000.xfa;
import p000.xqb;
import p000.y38;
import p000.ye1;
import p000.yy4;
import p000.zf1;
import p000.zi3;
import p000.zy4;

/* JADX INFO: renamed from: com.lingq.feature.reader.stats.ui.words.b */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC2572b {
    /* JADX INFO: renamed from: a */
    public static final void m9484a(ud6 ud6Var, final int i, C2573c c2573c, C1909e c1909e, final bia biaVar, ye1 ye1Var, int i2) {
        C2573c c2573c2;
        C1909e c1909e2;
        int i3;
        C1909e c1909e3;
        C2573c c2573c3;
        int i4;
        wd6 wd6Var;
        t66 t66Var;
        final ud6 ud6Var2;
        final C1909e c1909e4;
        final C2573c c2573c4;
        ud6Var.getClass();
        biaVar.getClass();
        tj3 tj3Var = (tj3) ye1Var;
        tj3Var.m22115d0(-1061308138);
        int i5 = i2 | (tj3Var.m22124i(ud6Var) ? 4 : 2) | (tj3Var.m22116e(i) ? 32 : 16) | 1152 | (tj3Var.m22124i(biaVar) ? 16384 : 8192);
        if (tj3Var.m22099R(i5 & 1, (i5 & 9363) != 9362)) {
            tj3Var.m22104W();
            if ((i2 & 1) == 0 || tj3Var.m22084B()) {
                dua duaVarM21396a = si5.m21396a(tj3Var);
                if (duaVarM21396a == null) {
                    C3386nv.m17633t("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner");
                    return;
                }
                C2573c c2573c5 = (C2573c) pfa.m19114d(y38.m24933a(C2573c.class), duaVarM21396a, null, AbstractC3584sr.m21591B(duaVarM21396a, tj3Var), duaVarM21396a instanceof gr3 ? ((gr3) duaVarM21396a).mo2103e() : or1.f54780b, tj3Var);
                dua duaVarM21396a2 = si5.m21396a(tj3Var);
                if (duaVarM21396a2 == null) {
                    C3386nv.m17633t("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner");
                    return;
                } else {
                    i3 = i5 & (-8065);
                    c1909e3 = (C1909e) pfa.m19114d(y38.m24933a(C1909e.class), duaVarM21396a2, null, AbstractC3584sr.m21591B(duaVarM21396a2, tj3Var), duaVarM21396a2 instanceof gr3 ? ((gr3) duaVarM21396a2).mo2103e() : or1.f54780b, tj3Var);
                    c2573c3 = c2573c5;
                }
            } else {
                tj3Var.m22102U();
                i3 = i5 & (-8065);
                c2573c3 = c2573c;
                c1909e3 = c1909e;
            }
            tj3Var.m22140r();
            t66 t66VarM2513c = AbstractC0711a.m2513c(c2573c3.f31129l, tj3Var);
            t66 t66VarM2513c2 = AbstractC0711a.m2513c(c2573c3.f31131n, tj3Var);
            t66 t66VarM2513c3 = AbstractC0711a.m2513c(c2573c3.f31120c.mo4594r1(), tj3Var);
            t66 t66VarM2513c4 = AbstractC0711a.m2513c(c2573c3.f31130m, tj3Var);
            t66 t66VarM2513c5 = AbstractC0711a.m2513c(c1909e3.f23886X, tj3Var);
            List list = (List) t66VarM2513c.getValue();
            if (list == null) {
                list = EmptyList.f47638a;
            }
            b32 b32Var = new b32(list, ((Boolean) t66VarM2513c3.getValue()).booleanValue(), ((Boolean) t66VarM2513c2.getValue()).booleanValue(), fa4.m11650l((Boolean) t66VarM2513c4.getValue(), Boolean.TRUE));
            Object objM22097O = tj3Var.m22097O();
            p84 p84Var = we1.f66679a;
            if (objM22097O == p84Var) {
                objM22097O = new ry4(3);
                tj3Var.m22131l0(objM22097O);
            }
            wd6 wd6VarM24650a = xqb.m24650a((vi3) objM22097O);
            List list2 = (List) t66VarM2513c.getValue();
            Boolean bool = (Boolean) t66VarM2513c4.getValue();
            int i6 = i3 & 112;
            boolean zM22120g = (i6 == 32) | tj3Var.m22120g(t66VarM2513c) | tj3Var.m22120g(t66VarM2513c4) | tj3Var.m22124i(wd6VarM24650a) | tj3Var.m22124i(ud6Var);
            Object objM22097O2 = tj3Var.m22097O();
            if (zM22120g || objM22097O2 == p84Var) {
                i4 = i6;
                wd6Var = wd6VarM24650a;
                t66Var = t66VarM2513c4;
                LessonCompleteDealBlueScreenKt$LessonCompleteDealBlueRoute$1$1 lessonCompleteDealBlueScreenKt$LessonCompleteDealBlueRoute$1$1 = new LessonCompleteDealBlueScreenKt$LessonCompleteDealBlueRoute$1$1(t66VarM2513c, t66Var, wd6Var, ud6Var, i, null);
                ud6Var2 = ud6Var;
                tj3Var.m22131l0(lessonCompleteDealBlueScreenKt$LessonCompleteDealBlueRoute$1$1);
                objM22097O2 = lessonCompleteDealBlueScreenKt$LessonCompleteDealBlueRoute$1$1;
            } else {
                ud6Var2 = ud6Var;
                wd6Var = wd6VarM24650a;
                t66Var = t66VarM2513c4;
                i4 = i6;
            }
            d32.m10049l(list2, bool, (zi3) objM22097O2, tj3Var);
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
            boolean zM22124i = tj3Var.m22124i(ud6Var2) | tj3Var.m22124i(wd6Var) | tj3Var.m22120g(t66Var) | (i4 == 32) | tj3Var.m22124i(c2573c3) | tj3Var.m22124i(c1909e3) | tj3Var.m22124i(biaVar);
            Object objM22097O3 = tj3Var.m22097O();
            if (zM22124i || objM22097O3 == p84Var) {
                final wd6 wd6Var2 = wd6Var;
                c1909e4 = c1909e3;
                final t66 t66Var2 = t66Var;
                c2573c4 = c2573c3;
                vi3 vi3Var = new vi3() { // from class: com.lingq.feature.reader.stats.ui.words.a
                    @Override // p000.vi3
                    public final Object invoke(Object obj) {
                        uja ujaVar = (uja) obj;
                        ujaVar.getClass();
                        boolean z = ujaVar instanceof oja;
                        ud6 ud6Var3 = ud6Var2;
                        if (z) {
                            ud6Var3.m22689f();
                        } else if (ujaVar instanceof pja) {
                            AbstractC2572b.m9485b(wd6Var2, ud6Var3, i, t66Var2, false);
                        } else {
                            boolean z2 = ujaVar instanceof tja;
                            C2573c c2573c6 = c2573c4;
                            if (z2) {
                                String str = ((tja) ujaVar).f62426a.f19314a;
                                c1909e4.m8760d3(new c3a(new TokenPopupData(str, vz1.m23609O(str, c2573c6.f31120c.mo4589b2()), TokenType.WordType, 0, 0, null, TokenViewState.Expanded.f23709a, TokenControllerType.Vocabulary, null, 0, null, false, 0, 0, null, 0, 0, 0, 0, false, null, null, false, 8388408, null), false));
                            } else if (ujaVar instanceof qja) {
                                LessonWord lessonWord = ((qja) ujaVar).f57859a;
                                lessonWord.getClass();
                                wfb.m23926u(lda.m16103C(c2573c6), null, null, new LessonCompleteDealBlueViewModel$onIgnore$1(c2573c6, lessonWord, null), 3);
                            } else if (ujaVar instanceof nja) {
                                LessonWord lessonWord2 = ((nja) ujaVar).f52857a;
                                lessonWord2.getClass();
                                wfb.m23926u(lda.m16103C(c2573c6), null, null, new LessonCompleteDealBlueViewModel$onAddMeaning$1(c2573c6, lessonWord2, null), 3);
                            } else if (ujaVar instanceof sja) {
                                biaVar.mo3737M1(UpgradeReason.LIMIT_WORDS);
                            } else {
                                if (!(ujaVar instanceof rja)) {
                                    gm5.m12750e();
                                    return null;
                                }
                                LessonWord lessonWord3 = ((rja) ujaVar).f59416a;
                                lessonWord3.getClass();
                                wfb.m23926u(lda.m16103C(c2573c6), null, null, new LessonCompleteDealBlueViewModel$onTtsClicked$1(c2573c6, lessonWord3, null), 3);
                            }
                        }
                        return xfa.f68157a;
                    }
                };
                tj3Var.m22131l0(vi3Var);
                objM22097O3 = vi3Var;
            } else {
                c2573c4 = c2573c3;
                c1909e4 = c1909e3;
            }
            m9486c(b32Var, (vi3) objM22097O3, tj3Var, 0);
            f5a f5aVar = (f5a) t66VarM2513c5.getValue();
            boolean zM22124i2 = tj3Var.m22124i(c1909e4);
            Object objM22097O4 = tj3Var.m22097O();
            if (zM22124i2 || objM22097O4 == p84Var) {
                objM22097O4 = new fz4(c1909e4, 0);
                tj3Var.m22131l0(objM22097O4);
            }
            AbstractC1899b.m8698g(f5aVar, (vi3) objM22097O4, tj3Var, 8);
            tj3Var.m22139q(true);
            c1909e2 = c1909e4;
            c2573c2 = c2573c4;
        } else {
            tj3Var.m22102U();
            c2573c2 = c2573c;
            c1909e2 = c1909e;
        }
        x18 x18VarM22143u = tj3Var.m22143u();
        if (x18VarM22143u != null) {
            x18VarM22143u.f67642d = new C3522r4(ud6Var, i, c2573c2, c1909e2, biaVar, i2, 14);
        }
    }

    /* JADX INFO: renamed from: b */
    public static final void m9485b(wd6 wd6Var, ud6 ud6Var, int i, t66 t66Var, boolean z) {
        if (!z) {
            wd6Var = null;
        }
        if (fa4.m11650l((Boolean) t66Var.getValue(), Boolean.TRUE)) {
            bz4.Companion.getClass();
            jfa.m14428k(ud6Var, new zy4(i), wd6Var);
        } else {
            bz4.Companion.getClass();
            jfa.m14428k(ud6Var, new yy4(i), wd6Var);
        }
    }

    /* JADX INFO: renamed from: c */
    public static final void m9486c(b32 b32Var, vi3 vi3Var, ye1 ye1Var, int i) {
        vi3Var.getClass();
        tj3 tj3Var = (tj3) ye1Var;
        tj3Var.m22115d0(1458482937);
        int i2 = 2;
        int i3 = (tj3Var.m22124i(b32Var) ? 4 : 2) | i;
        if ((i & 48) == 0) {
            i3 |= tj3Var.m22124i(vi3Var) ? 32 : 16;
        }
        if (tj3Var.m22099R(i3 & 1, (i3 & 19) != 18)) {
            b34.m3232b(null, ci8.m4703P(-1782318155, new n14(b32Var.f7839d ? 3 : 2, vi3Var, i2), tj3Var), ci8.m4703P(1650344980, new rw1(23, b32Var, vi3Var), tj3Var), null, null, 0, 0L, 0L, null, ci8.m4703P(-1506452726, new C3180kd(28, b32Var, vi3Var), tj3Var), tj3Var, 805306800, 505);
        } else {
            tj3Var.m22102U();
        }
        x18 x18VarM22143u = tj3Var.m22143u();
        if (x18VarM22143u != null) {
            x18VarM22143u.f67642d = new C3709w4(b32Var, i, 16, vi3Var);
        }
    }

    /* JADX INFO: renamed from: d */
    public static final void m9487d(t17 t17Var, b32 b32Var, vi3 vi3Var, ye1 ye1Var, int i) {
        int i2;
        tj3 tj3Var = (tj3) ye1Var;
        tj3Var.m22115d0(-418537965);
        if ((i & 6) == 0) {
            i2 = (tj3Var.m22120g(t17Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= tj3Var.m22124i(b32Var) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= tj3Var.m22124i(vi3Var) ? 256 : 128;
        }
        if (tj3Var.m22099R(i2 & 1, (i2 & 147) != 146)) {
            e16 e16VarM10007D = d32.m10007D(b16.f7762a, ((ms5) tj3Var.m22128k(ps5.f56764b)).f51799a.f55868n, ss5.f61356d);
            zf1 zf1Var = ge9.f40637a;
            e16 e16VarM21611X = AbstractC3584sr.m21611X(c99.m4411d(AbstractC3584sr.m21611X(e16VarM10007D, ((fe9) tj3Var.m22128k(zf1Var)).f38960i, 0.0f, ((fe9) tj3Var.m22128k(zf1Var)).f38960i, 0.0f, 10), 1.0f), 0.0f, t17Var.mo14021d(), 0.0f, t17Var.mo14018a(), 5);
            boolean zM22124i = tj3Var.m22124i(b32Var) | ((i2 & 896) == 256);
            Object objM22097O = tj3Var.m22097O();
            if (zM22124i || objM22097O == we1.f66679a) {
                objM22097O = new ke2(18, b32Var, vi3Var);
                tj3Var.m22131l0(objM22097O);
            }
            fa4.m11642c(e16VarM21611X, null, null, null, null, null, false, null, (vi3) objM22097O, tj3Var, 0, 510);
        } else {
            tj3Var.m22102U();
        }
        x18 x18VarM22143u = tj3Var.m22143u();
        if (x18VarM22143u != null) {
            x18VarM22143u.f67642d = new C2956e9(t17Var, b32Var, vi3Var, i, 26);
        }
    }

    /* JADX INFO: renamed from: e */
    public static final void m9488e(e16 e16Var, final LessonWord lessonWord, boolean z, vi3 vi3Var, ye1 ye1Var, int i) {
        ui3 ui3Var;
        final vi3 vi3Var2 = vi3Var;
        fc0 fc0Var = nj0.f52789H;
        tj3 tj3Var = (tj3) ye1Var;
        tj3Var.m22115d0(2007104615);
        int i2 = i | (tj3Var.m22120g(e16Var) ? 4 : 2) | (tj3Var.m22124i(lessonWord) ? 32 : 16) | (tj3Var.m22122h(z) ? 256 : 128) | (tj3Var.m22124i(vi3Var2) ? 2048 : 1024);
        if (tj3Var.m22099R(i2 & 1, (i2 & 1171) != 1170)) {
            String str = lessonWord.f19318e;
            String str2 = lessonWord.f19314a;
            List list = lessonWord.f19317d;
            if (list.isEmpty()) {
                list = lessonWord.f19316c;
            }
            String strM17122h = AbstractC3352my.m17122h(str, str2, list);
            TokenMeaning tokenMeaning = (TokenMeaning) u91.m22591I0(lessonWord.f19319f);
            if (tokenMeaning == null) {
                tokenMeaning = new TokenMeaning(0, null, "", 0, false, null, false, 0, 1019);
            }
            e16 e16VarM21609V = AbstractC3584sr.m21609V(e16Var, ge9.m12515a(tj3Var).f38952a, 0.0f, 2);
            C3549ru c3549ru = eh0.f37236b;
            sj8 sj8VarM20003a = qj8.m20003a(c3549ru, fc0Var, tj3Var, 48);
            int iHashCode = Long.hashCode(tj3Var.f62385T);
            l77 l77VarM22132m = tj3Var.m22132m();
            e16 e16VarM1322c = AbstractC0287b.m1322c(tj3Var, e16VarM21609V);
            se1.f60731q.getClass();
            ui3 ui3Var2 = C0352b.f4299b;
            tj3Var.m22119f0();
            if (tj3Var.f62384S) {
                tj3Var.m22130l(ui3Var2);
            } else {
                tj3Var.m22137o0();
            }
            zi3 zi3Var = C0352b.f4303f;
            oha.m18001g(tj3Var, zi3Var, sj8VarM20003a);
            zi3 zi3Var2 = C0352b.f4302e;
            oha.m18001g(tj3Var, zi3Var2, l77VarM22132m);
            Integer numValueOf = Integer.valueOf(iHashCode);
            zi3 zi3Var3 = C0352b.f4304g;
            oha.m18001g(tj3Var, zi3Var3, numValueOf);
            vi3 vi3Var3 = C0352b.f4305h;
            oha.m18000f(tj3Var, vi3Var3);
            zi3 zi3Var4 = C0352b.f4301d;
            oha.m18001g(tj3Var, zi3Var4, e16VarM1322c);
            b16 b16Var = b16.f7762a;
            TokenMeaning tokenMeaning2 = tokenMeaning;
            e16 e16VarM4430w = c99.m4430w(b16Var, null, 3);
            ht5 ht5VarM19966d = qh0.m19966d(nj0.f52808c, false);
            int iHashCode2 = Long.hashCode(tj3Var.f62385T);
            l77 l77VarM22132m2 = tj3Var.m22132m();
            e16 e16VarM1322c2 = AbstractC0287b.m1322c(tj3Var, e16VarM4430w);
            tj3Var.m22119f0();
            if (tj3Var.f62384S) {
                tj3Var.m22130l(ui3Var2);
            } else {
                tj3Var.m22137o0();
            }
            oha.m18001g(tj3Var, zi3Var, ht5VarM19966d);
            oha.m18001g(tj3Var, zi3Var2, l77VarM22132m2);
            AbstractC3393o1.m17747v(iHashCode2, tj3Var, zi3Var3, tj3Var, vi3Var3);
            oha.m18001g(tj3Var, zi3Var4, e16VarM1322c2);
            boolean z2 = (i2 & 896) == 256;
            int i3 = i2 & 7168;
            boolean zM22124i = z2 | (i3 == 2048) | tj3Var.m22124i(lessonWord);
            Object objM22097O = tj3Var.m22097O();
            p84 p84Var = we1.f66679a;
            if (zM22124i || objM22097O == p84Var) {
                objM22097O = new dz4(z, vi3Var2, lessonWord);
                tj3Var.m22131l0(objM22097O);
            }
            omd.m18141c((ui3) objM22097O, d32.m10007D(c99.m4430w(b16Var, null, 3), cx2.m9917a(tj3Var).m4216i(), p58.m18901i(tj3Var).f64859e), false, null, null, atb.f7477d, tj3Var, 1572864, 60);
            tj3Var.m22139q(true);
            e16 e16VarM21607T = AbstractC3584sr.m21607T(b16Var, ge9.m12515a(tj3Var).f38952a);
            if (1.0f <= 0.0d) {
                g54.m12362a("invalid weight; must be greater than zero");
            }
            e16 e16VarMo3161g = e16VarM21607T.mo3161g(new as4(1.0f > Float.MAX_VALUE ? Float.MAX_VALUE : 1.0f, true)).mo3161g(new opa(fc0Var));
            ht5 ht5VarM19966d2 = qh0.m19966d(nj0.f52811f, false);
            int iHashCode3 = Long.hashCode(tj3Var.f62385T);
            l77 l77VarM22132m3 = tj3Var.m22132m();
            e16 e16VarM1322c3 = AbstractC0287b.m1322c(tj3Var, e16VarMo3161g);
            tj3Var.m22119f0();
            if (tj3Var.f62384S) {
                ui3Var = ui3Var2;
                tj3Var.m22130l(ui3Var);
            } else {
                ui3Var = ui3Var2;
                tj3Var.m22137o0();
            }
            oha.m18001g(tj3Var, zi3Var, ht5VarM19966d2);
            oha.m18001g(tj3Var, zi3Var2, l77VarM22132m3);
            AbstractC3393o1.m17747v(iHashCode3, tj3Var, zi3Var3, tj3Var, vi3Var3);
            oha.m18001g(tj3Var, zi3Var4, e16VarM1322c3);
            bb1 bb1VarM230a = ab1.m230a(eh0.f37238d, nj0.f52791J, tj3Var, 0);
            int iHashCode4 = Long.hashCode(tj3Var.f62385T);
            l77 l77VarM22132m4 = tj3Var.m22132m();
            e16 e16VarM1322c4 = AbstractC0287b.m1322c(tj3Var, b16Var);
            tj3Var.m22119f0();
            if (tj3Var.f62384S) {
                tj3Var.m22130l(ui3Var);
            } else {
                tj3Var.m22137o0();
            }
            oha.m18001g(tj3Var, zi3Var, bb1VarM230a);
            oha.m18001g(tj3Var, zi3Var2, l77VarM22132m4);
            AbstractC3393o1.m17747v(iHashCode4, tj3Var, zi3Var3, tj3Var, vi3Var3);
            oha.m18001g(tj3Var, zi3Var4, e16VarM1322c4);
            sj8 sj8VarM20003a2 = qj8.m20003a(c3549ru, nj0.f52817l, tj3Var, 0);
            int iHashCode5 = Long.hashCode(tj3Var.f62385T);
            l77 l77VarM22132m5 = tj3Var.m22132m();
            e16 e16VarM1322c5 = AbstractC0287b.m1322c(tj3Var, b16Var);
            tj3Var.m22119f0();
            if (tj3Var.f62384S) {
                tj3Var.m22130l(ui3Var);
            } else {
                tj3Var.m22137o0();
            }
            oha.m18001g(tj3Var, zi3Var, sj8VarM20003a2);
            oha.m18001g(tj3Var, zi3Var2, l77VarM22132m5);
            AbstractC3393o1.m17747v(iHashCode5, tj3Var, zi3Var3, tj3Var, vi3Var3);
            oha.m18001g(tj3Var, zi3Var4, e16VarM1322c5);
            ui3 ui3Var3 = ui3Var;
            lw9.m16554b(strM17122h, c99.m4430w(b16Var, null, 3).mo3161g(new opa(fc0Var)), p58.m18900f(tj3Var).f55873q, null, 0L, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, p58.m18902j(tj3Var).f71406j, tj3Var, 0, 0, 131064);
            boolean zM22124i2 = tj3Var.m22124i(lessonWord) | (i3 == 2048);
            Object objM22097O2 = tj3Var.m22097O();
            if (zM22124i2 || objM22097O2 == p84Var) {
                final int i4 = 0;
                objM22097O2 = new ui3() { // from class: ez4
                    @Override // p000.ui3
                    /* JADX INFO: renamed from: a */
                    public final Object mo0a() {
                        int i5 = i4;
                        xfa xfaVar = xfa.f68157a;
                        LessonWord lessonWord2 = lessonWord;
                        vi3 vi3Var4 = vi3Var2;
                        switch (i5) {
                            case 0:
                                vi3Var4.invoke(new rja(lessonWord2));
                                break;
                            default:
                                vi3Var4.invoke(new qja(lessonWord2));
                                break;
                        }
                        return xfaVar;
                    }
                };
                tj3Var.m22131l0(objM22097O2);
            }
            omd.m18141c((ui3) objM22097O2, c99.m4422o(AbstractC3584sr.m21611X(b16Var, ge9.m12515a(tj3Var).f38952a, 0.0f, 0.0f, 0.0f, 14).mo3161g(new opa(fc0Var)), ge9.m12515a(tj3Var).f38957f), false, null, null, atb.f7478e, tj3Var, 1572864, 60);
            tj3Var.m22139q(true);
            e16 e16VarM21611X = AbstractC3584sr.m21611X(c99.m4430w(b16Var, null, 3), 0.0f, ge9.m12515a(tj3Var).f38955d, 0.0f, 0.0f, 13);
            vx9 vx9Var = p58.m18902j(tj3Var).f71407k;
            long j = p58.m18900f(tj3Var).f55875s;
            String str3 = tokenMeaning2.f19596c;
            if (str3 == null) {
                str3 = "";
            }
            lw9.m16554b(str3, e16VarM21611X, j, null, 0L, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, vx9Var, tj3Var, 0, 0, 131064);
            tj3Var = tj3Var;
            tj3Var.m22139q(true);
            tj3Var.m22139q(true);
            e16 e16VarM4430w2 = c99.m4430w(b16Var, nj0.f52812g, 2);
            sj8 sj8VarM20003a3 = qj8.m20003a(c3549ru, fc0Var, tj3Var, 48);
            int iHashCode6 = Long.hashCode(tj3Var.f62385T);
            l77 l77VarM22132m6 = tj3Var.m22132m();
            e16 e16VarM1322c6 = AbstractC0287b.m1322c(tj3Var, e16VarM4430w2);
            tj3Var.m22119f0();
            if (tj3Var.f62384S) {
                tj3Var.m22130l(ui3Var3);
            } else {
                tj3Var.m22137o0();
            }
            oha.m18001g(tj3Var, zi3Var, sj8VarM20003a3);
            oha.m18001g(tj3Var, zi3Var2, l77VarM22132m6);
            AbstractC3393o1.m17747v(iHashCode6, tj3Var, zi3Var3, tj3Var, vi3Var3);
            oha.m18001g(tj3Var, zi3Var4, e16VarM1322c6);
            boolean zM22124i3 = tj3Var.m22124i(lessonWord) | (i3 == 2048);
            Object objM22097O3 = tj3Var.m22097O();
            if (zM22124i3 || objM22097O3 == p84Var) {
                vi3Var2 = vi3Var;
                final int i5 = 1;
                objM22097O3 = new ui3() { // from class: ez4
                    @Override // p000.ui3
                    /* JADX INFO: renamed from: a */
                    public final Object mo0a() {
                        int i6 = i5;
                        xfa xfaVar = xfa.f68157a;
                        LessonWord lessonWord2 = lessonWord;
                        vi3 vi3Var4 = vi3Var2;
                        switch (i6) {
                            case 0:
                                vi3Var4.invoke(new rja(lessonWord2));
                                break;
                            default:
                                vi3Var4.invoke(new qja(lessonWord2));
                                break;
                        }
                        return xfaVar;
                    }
                };
                tj3Var.m22131l0(objM22097O3);
            } else {
                vi3Var2 = vi3Var;
            }
            omd.m18141c((ui3) objM22097O3, c99.m4430w(b16Var, null, 3), false, null, null, atb.f7479f, tj3Var, 1572912, 60);
            tj3Var.m22139q(true);
            tj3Var.m22139q(true);
        } else {
            tj3Var.m22102U();
        }
        x18 x18VarM22143u = tj3Var.m22143u();
        if (x18VarM22143u != null) {
            x18VarM22143u.f67642d = new py0(e16Var, lessonWord, z, vi3Var2, i, 2);
        }
    }
}
