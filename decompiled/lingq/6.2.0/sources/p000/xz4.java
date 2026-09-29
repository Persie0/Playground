package p000;

import android.os.Bundle;
import androidx.compose.p002ui.AbstractC0287b;
import androidx.compose.p002ui.node.C0352b;
import androidx.compose.runtime.AbstractC0278f;
import androidx.lifecycle.compose.AbstractC0711a;
import com.lingq.core.domain.model.lesson.LessonCard;
import com.lingq.core.domain.model.lesson.LessonWord;
import com.lingq.core.domain.model.lesson.TokenType;
import com.lingq.core.domain.model.token.TokenControllerType;
import com.lingq.core.token.AbstractC1899b;
import com.lingq.core.token.C1909e;
import com.lingq.core.token.TokenPopupData;
import com.lingq.core.token.TokenViewState;
import com.lingq.feature.reader.R$id;
import com.lingq.feature.reader.stats.p019ui.lingqs.C2568b;
import java.util.List;
import kotlin.Pair;
import p000.c3a;
import p000.gm5;
import p000.lda;
import p000.q1b;
import p000.r1b;
import p000.s1b;
import p000.t1b;
import p000.u1b;
import p000.ud6;
import p000.uz4;
import p000.v1b;
import p000.vz1;
import p000.w65;
import p000.wfb;
import p000.xfa;

/* JADX INFO: loaded from: classes2.dex */
public abstract class xz4 {
    /* JADX INFO: renamed from: a */
    public static final void m24793a(final ud6 ud6Var, final int i, C2568b c2568b, C1909e c1909e, ye1 ye1Var, int i2) {
        C2568b c2568b2;
        C1909e c1909e2;
        final C2568b c2568b3;
        final C1909e c1909e3;
        int i3;
        ud6Var.getClass();
        tj3 tj3Var = (tj3) ye1Var;
        tj3Var.m22115d0(-920445488);
        int i4 = i2 | (tj3Var.m22124i(ud6Var) ? 4 : 2) | (tj3Var.m22116e(i) ? 32 : 16) | 1152;
        if (tj3Var.m22099R(i4 & 1, (i4 & 1171) != 1170)) {
            tj3Var.m22104W();
            if ((i2 & 1) == 0 || tj3Var.m22084B()) {
                dua duaVarM21396a = si5.m21396a(tj3Var);
                if (duaVarM21396a == null) {
                    C3386nv.m17633t("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner");
                    return;
                }
                c2568b3 = (C2568b) pfa.m19114d(y38.m24933a(C2568b.class), duaVarM21396a, null, AbstractC3584sr.m21591B(duaVarM21396a, tj3Var), duaVarM21396a instanceof gr3 ? ((gr3) duaVarM21396a).mo2103e() : or1.f54780b, tj3Var);
                dua duaVarM21396a2 = si5.m21396a(tj3Var);
                if (duaVarM21396a2 == null) {
                    C3386nv.m17633t("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner");
                    return;
                } else {
                    c1909e3 = (C1909e) pfa.m19114d(y38.m24933a(C1909e.class), duaVarM21396a2, null, AbstractC3584sr.m21591B(duaVarM21396a2, tj3Var), duaVarM21396a2 instanceof gr3 ? ((gr3) duaVarM21396a2).mo2103e() : or1.f54780b, tj3Var);
                    i3 = i4 & (-8065);
                }
            } else {
                tj3Var.m22102U();
                i3 = i4 & (-8065);
                c2568b3 = c2568b;
                c1909e3 = c1909e;
            }
            tj3Var.m22140r();
            t66 t66VarM2513c = AbstractC0711a.m2513c(c2568b3.f31070q, tj3Var);
            t66 t66VarM2513c2 = AbstractC0711a.m2513c(c2568b3.f31075v, tj3Var);
            t66 t66VarM2513c3 = AbstractC0711a.m2513c(c1909e3.f23886X, tj3Var);
            e1b e1bVar = new e1b((List) t66VarM2513c.getValue(), (vs3) t66VarM2513c2.getValue());
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
            boolean zM22124i = ((i3 & 112) == 32) | tj3Var.m22124i(ud6Var) | tj3Var.m22124i(c2568b3) | tj3Var.m22124i(c1909e3);
            Object objM22097O = tj3Var.m22097O();
            p84 p84Var = we1.f66679a;
            if (zM22124i || objM22097O == p84Var) {
                objM22097O = new vi3() { // from class: com.lingq.feature.reader.stats.ui.lingqs.a
                    @Override // p000.vi3
                    public final Object invoke(Object obj) {
                        Pair pair;
                        v1b v1bVar = (v1b) obj;
                        v1bVar.getClass();
                        boolean z = v1bVar instanceof q1b;
                        ud6 ud6Var2 = ud6Var;
                        xfa xfaVar = xfa.f68157a;
                        if (z) {
                            ud6Var2.m22689f();
                            return xfaVar;
                        }
                        if (v1bVar instanceof r1b) {
                            uz4.Companion.getClass();
                            int i5 = R$id.actionToLessonComplete;
                            ud6Var2.getClass();
                            Bundle bundle = new Bundle();
                            bundle.putInt("lessonId", i);
                            bundle.putBoolean("isCompleting", true);
                            ud6Var2.m22687d(i5, bundle, null);
                            return xfaVar;
                        }
                        boolean z2 = v1bVar instanceof t1b;
                        C2568b c2568b4 = c2568b3;
                        if (z2) {
                            w65 w65Var = ((t1b) v1bVar).f61755a;
                            if (!(w65Var instanceof LessonCard)) {
                                if (w65Var instanceof LessonWord) {
                                    pair = new Pair(((LessonWord) w65Var).f19314a, TokenType.WordType);
                                }
                                return xfaVar;
                            }
                            pair = new Pair(((LessonCard) w65Var).f19178a, TokenType.CardType);
                            String str = (String) pair.f47623a;
                            TokenType tokenType = (TokenType) pair.f47624b;
                            c1909e3.m8760d3(new c3a(new TokenPopupData(str, vz1.m23609O(str, c2568b4.f31056c.mo4589b2()), tokenType, 0, 0, null, TokenViewState.Expanded.f23709a, TokenControllerType.Vocabulary, null, 0, null, false, 0, 0, null, 0, 0, 0, 0, false, null, null, false, 8388408, null), false));
                            return xfaVar;
                        }
                        if (v1bVar instanceof u1b) {
                            u1b u1bVar = (u1b) v1bVar;
                            wfb.m23926u(lda.m16103C(c2568b4), null, null, new LessonCompleteVocabularyViewModel$updateStatus$1(c2568b4, u1bVar.f63256a, u1bVar.f63257b, null), 3);
                            return xfaVar;
                        }
                        if (!(v1bVar instanceof s1b)) {
                            gm5.m12750e();
                            return null;
                        }
                        w65 w65Var2 = ((s1b) v1bVar).f60163a;
                        w65Var2.getClass();
                        wfb.m23926u(lda.m16103C(c2568b4), null, null, new LessonCompleteVocabularyViewModel$onTtsClicked$1(c2568b4, w65Var2, null), 3);
                        return xfaVar;
                    }
                };
                tj3Var.m22131l0(objM22097O);
            }
            m24794b(e1bVar, (vi3) objM22097O, tj3Var, 0);
            f5a f5aVar = (f5a) t66VarM2513c3.getValue();
            boolean zM22124i2 = tj3Var.m22124i(c1909e3);
            Object objM22097O2 = tj3Var.m22097O();
            if (zM22124i2 || objM22097O2 == p84Var) {
                objM22097O2 = new fz4(c1909e3, 2);
                tj3Var.m22131l0(objM22097O2);
            }
            AbstractC1899b.m8698g(f5aVar, (vi3) objM22097O2, tj3Var, 8);
            tj3Var.m22139q(true);
            c1909e2 = c1909e3;
            c2568b2 = c2568b3;
        } else {
            tj3Var.m22102U();
            c2568b2 = c2568b;
            c1909e2 = c1909e;
        }
        x18 x18VarM22143u = tj3Var.m22143u();
        if (x18VarM22143u != null) {
            x18VarM22143u.f67642d = new C2956e9(ud6Var, i, c2568b2, c1909e2, i2);
        }
    }

    /* JADX INFO: renamed from: b */
    public static final void m24794b(e1b e1bVar, vi3 vi3Var, ye1 ye1Var, int i) {
        vi3Var.getClass();
        tj3 tj3Var = (tj3) ye1Var;
        tj3Var.m22115d0(1140416074);
        int i2 = 4;
        int i3 = (tj3Var.m22124i(e1bVar) ? 4 : 2) | i;
        if ((i & 48) == 0) {
            i3 |= tj3Var.m22124i(vi3Var) ? 32 : 16;
        }
        if (tj3Var.m22099R(i3 & 1, (i3 & 19) != 18)) {
            b34.m3232b(null, ci8.m4703P(-1103919602, new ks3(vi3Var, i2), tj3Var), ci8.m4703P(1367860431, new ks3(e1bVar, vi3Var), tj3Var), null, null, 0, 0L, 0L, null, ci8.m4703P(-1978847975, new iz4(1, e1bVar, vi3Var), tj3Var), tj3Var, 805306800, 505);
        } else {
            tj3Var.m22102U();
        }
        x18 x18VarM22143u = tj3Var.m22143u();
        if (x18VarM22143u != null) {
            x18VarM22143u.f67642d = new C3709w4(e1bVar, i, 17, vi3Var);
        }
    }

    /* JADX INFO: renamed from: c */
    public static final void m24795c(t17 t17Var, e1b e1bVar, vi3 vi3Var, ye1 ye1Var, int i) {
        int i2;
        tj3 tj3Var = (tj3) ye1Var;
        tj3Var.m22115d0(481796918);
        if ((i & 6) == 0) {
            i2 = (tj3Var.m22120g(t17Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= tj3Var.m22124i(e1bVar) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= tj3Var.m22124i(vi3Var) ? 256 : 128;
        }
        if (tj3Var.m22099R(i2 & 1, (i2 & 147) != 146)) {
            e16 e16VarM10007D = d32.m10007D(b16.f7762a, ((ms5) tj3Var.m22128k(ps5.f56764b)).f51799a.f55868n, ss5.f61356d);
            zf1 zf1Var = ge9.f40637a;
            e16 e16VarM21611X = AbstractC3584sr.m21611X(c99.m4411d(AbstractC3584sr.m21611X(e16VarM10007D, ((fe9) tj3Var.m22128k(zf1Var)).f38960i, 0.0f, ((fe9) tj3Var.m22128k(zf1Var)).f38960i, 0.0f, 10), 1.0f), 0.0f, t17Var.mo14021d(), 0.0f, t17Var.mo14018a(), 5);
            boolean zM22124i = tj3Var.m22124i(e1bVar) | ((i2 & 896) == 256);
            Object objM22097O = tj3Var.m22097O();
            if (zM22124i || objM22097O == we1.f66679a) {
                objM22097O = new ke2(19, e1bVar, vi3Var);
                tj3Var.m22131l0(objM22097O);
            }
            fa4.m11642c(e16VarM21611X, null, null, null, null, null, false, null, (vi3) objM22097O, tj3Var, 0, 510);
        } else {
            tj3Var.m22102U();
        }
        x18 x18VarM22143u = tj3Var.m22143u();
        if (x18VarM22143u != null) {
            x18VarM22143u.f67642d = new C2956e9(t17Var, e1bVar, vi3Var, i, 27);
        }
    }

    /* JADX INFO: renamed from: d */
    public static final void m24796d(e16 e16Var, vs3 vs3Var, w65 w65Var, vi3 vi3Var, ye1 ye1Var, int i) {
        vi3 vi3Var2 = vi3Var;
        fc0 fc0Var = nj0.f52789H;
        tj3 tj3Var = (tj3) ye1Var;
        tj3Var.m22115d0(-1450828380);
        int i2 = i | (tj3Var.m22120g(e16Var) ? 4 : 2) | (tj3Var.m22124i(vs3Var) ? 32 : 16) | (tj3Var.m22124i(w65Var) ? 256 : 128) | (tj3Var.m22124i(vi3Var2) ? 2048 : 1024);
        if (tj3Var.m22099R(i2 & 1, (i2 & 1171) != 1170)) {
            String strMo8035b = w65Var.mo8035b();
            String strMo8037d = w65Var.mo8037d();
            List listMo8039f = w65Var.mo8039f();
            if (listMo8039f.isEmpty()) {
                listMo8039f = w65Var.mo8036c();
            }
            String strM17122h = AbstractC3352my.m17122h(strMo8035b, strMo8037d, listMo8039f);
            String strM21897b = t7d.m21897b(w65Var.mo8034a());
            Object objM22097O = tj3Var.m22097O();
            p84 p84Var = we1.f66679a;
            if (objM22097O == p84Var) {
                objM22097O = AbstractC0278f.m1260j(Boolean.FALSE);
                tj3Var.m22131l0(objM22097O);
            }
            t66 t66Var = (t66) objM22097O;
            e16 e16VarM21609V = AbstractC3584sr.m21609V(e16Var, ge9.m12515a(tj3Var).f38952a, 0.0f, 2);
            C3549ru c3549ru = eh0.f37236b;
            sj8 sj8VarM20003a = qj8.m20003a(c3549ru, fc0Var, tj3Var, 48);
            int iHashCode = Long.hashCode(tj3Var.f62385T);
            l77 l77VarM22132m = tj3Var.m22132m();
            e16 e16VarM1322c = AbstractC0287b.m1322c(tj3Var, e16VarM21609V);
            se1.f60731q.getClass();
            ui3 ui3Var = C0352b.f4299b;
            tj3Var.m22119f0();
            if (tj3Var.f62384S) {
                tj3Var.m22130l(ui3Var);
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
            e16 e16VarM4430w = c99.m4430w(b16Var, null, 3);
            ht5 ht5VarM19966d = qh0.m19966d(nj0.f52808c, false);
            int iHashCode2 = Long.hashCode(tj3Var.f62385T);
            l77 l77VarM22132m2 = tj3Var.m22132m();
            e16 e16VarM1322c2 = AbstractC0287b.m1322c(tj3Var, e16VarM4430w);
            tj3Var.m22119f0();
            if (tj3Var.f62384S) {
                tj3Var.m22130l(ui3Var);
            } else {
                tj3Var.m22137o0();
            }
            oha.m18001g(tj3Var, zi3Var, ht5VarM19966d);
            oha.m18001g(tj3Var, zi3Var2, l77VarM22132m2);
            AbstractC3393o1.m17747v(iHashCode2, tj3Var, zi3Var3, tj3Var, vi3Var3);
            oha.m18001g(tj3Var, zi3Var4, e16VarM1322c2);
            Object objM22097O2 = tj3Var.m22097O();
            if (objM22097O2 == p84Var) {
                objM22097O2 = new do4(6, t66Var);
                tj3Var.m22131l0(objM22097O2);
            }
            j4d.m14287b(((i2 >> 6) & 14) | 384 | (i2 & 112), tj3Var, (ui3) objM22097O2, vs3Var, w65Var);
            boolean zBooleanValue = ((Boolean) t66Var.getValue()).booleanValue();
            Object objM22097O3 = tj3Var.m22097O();
            if (objM22097O3 == p84Var) {
                objM22097O3 = new C0023al(22, t66Var);
                tj3Var.m22131l0(objM22097O3);
            }
            vi3 vi3Var4 = (vi3) objM22097O3;
            int i3 = i2 & 7168;
            boolean zM22120g = (i3 == 2048) | tj3Var.m22120g(r16);
            Object objM22097O4 = tj3Var.m22097O();
            if (zM22120g || objM22097O4 == p84Var) {
                objM22097O4 = new C3485q5(23, vi3Var, (Object) t66Var, (String) r16);
                tj3Var.m22131l0(objM22097O4);
            }
            o4d.m17800a(vs3Var, zBooleanValue, vi3Var4, (vi3) objM22097O4, tj3Var, ((i2 >> 3) & 14) | 384);
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
                tj3Var.m22130l(ui3Var);
            } else {
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
            vi3Var2 = vi3Var;
            lw9.m16554b(strM17122h, c99.m4430w(b16Var, null, 3).mo3161g(new opa(fc0Var)), p58.m18900f(tj3Var).f55873q, null, 0L, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, p58.m18902j(tj3Var).f71406j, tj3Var, 0, 0, 131064);
            boolean zM22124i = tj3Var.m22124i(w65Var) | (i3 == 2048);
            Object objM22097O5 = tj3Var.m22097O();
            if (zM22124i || objM22097O5 == p84Var) {
                objM22097O5 = new ty4(vi3Var2, w65Var, 1);
                tj3Var.m22131l0(objM22097O5);
            }
            omd.m18141c((ui3) objM22097O5, c99.m4422o(AbstractC3584sr.m21611X(b16Var, ge9.m12515a(tj3Var).f38952a, 0.0f, 0.0f, 0.0f, 14).mo3161g(new opa(fc0Var)), ge9.m12515a(tj3Var).f38957f), false, null, null, gtb.f41313e, tj3Var, 1572864, 60);
            tj3Var.m22139q(true);
            lw9.m16554b(strM21897b, AbstractC3584sr.m21611X(c99.m4430w(b16Var, null, 3), 0.0f, ge9.m12515a(tj3Var).f38955d, 0.0f, 0.0f, 13), p58.m18900f(tj3Var).f55875s, null, 0L, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, p58.m18902j(tj3Var).f71407k, tj3Var, 0, 0, 131064);
            tj3Var = tj3Var;
            AbstractC3393o1.m17723A(tj3Var, true, true, true);
        } else {
            tj3Var.m22102U();
        }
        x18 x18VarM22143u = tj3Var.m22143u();
        if (x18VarM22143u != null) {
            x18VarM22143u.f67642d = new C2919d9((Object) e16Var, (Object) vs3Var, (Object) w65Var, (xi3) vi3Var2, i, 17);
        }
    }
}
