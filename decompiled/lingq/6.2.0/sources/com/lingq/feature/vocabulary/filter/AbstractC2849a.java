package com.lingq.feature.vocabulary.filter;

import android.content.Context;
import androidx.compose.p002ui.platform.AbstractC0394f;
import androidx.compose.runtime.AbstractC0278f;
import androidx.lifecycle.compose.AbstractC0711a;
import java.util.List;
import kotlin.jvm.internal.FunctionReference;
import kotlinx.coroutines.flow.C3244l;
import p000.AbstractC3584sr;
import p000.C3386nv;
import p000.aa1;
import p000.b16;
import p000.c99;
import p000.ci8;
import p000.dua;
import p000.e16;
import p000.eu9;
import p000.eza;
import p000.fe9;
import p000.g39;
import p000.ge9;
import p000.gr3;
import p000.gza;
import p000.h39;
import p000.hj4;
import p000.ho9;
import p000.ix0;
import p000.l1b;
import p000.lsc;
import p000.mkd;
import p000.ms5;
import p000.nya;
import p000.or1;
import p000.p84;
import p000.pfa;
import p000.ps5;
import p000.q6d;
import p000.si5;
import p000.si8;
import p000.t66;
import p000.tg6;
import p000.tj3;
import p000.ui8;
import p000.v4a;
import p000.vh9;
import p000.vi3;
import p000.vx9;
import p000.we1;
import p000.x18;
import p000.y38;
import p000.ye1;
import p000.yza;
import p000.zf1;

/* JADX INFO: renamed from: com.lingq.feature.vocabulary.filter.a */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC2849a {
    /* JADX INFO: renamed from: a */
    public static final void m9755a(l1b l1bVar, vi3 vi3Var, e16 e16Var, ye1 ye1Var, int i) {
        vi3 vi3Var2;
        e16 e16Var2;
        String str = l1bVar.f48905a;
        tj3 tj3Var = (tj3) ye1Var;
        tj3Var.m22115d0(536001379);
        int i2 = i | (tj3Var.m22120g(l1bVar) ? 4 : 2) | (tj3Var.m22124i(vi3Var) ? 32 : 16) | 384;
        if (tj3Var.m22099R(i2 & 1, (i2 & 147) != 146)) {
            boolean zM22120g = tj3Var.m22120g(str);
            Object objM22097O = tj3Var.m22097O();
            p84 p84Var = we1.f66679a;
            if (zM22120g || objM22097O == p84Var) {
                objM22097O = AbstractC0278f.m1260j(str);
                tj3Var.m22131l0(objM22097O);
            }
            t66 t66Var = (t66) objM22097O;
            String str2 = (String) t66Var.getValue();
            b16 b16Var = b16.f7762a;
            e16 e16VarM4412e = c99.m4412e(b16Var, 1.0f);
            vh9 vh9Var = ps5.f56764b;
            vx9 vx9Var = ((ms5) tj3Var.m22128k(vh9Var)).f51800b.f71406j;
            hj4 hj4Var = new hj4(1, 3, null, 115);
            long j = aa1.f411j;
            eu9 eu9VarM16905h = mkd.m16905h(0L, 0L, j, j, j, tj3Var, 2147469311);
            si8 si8Var = ((ms5) tj3Var.m22128k(vh9Var)).f51801c.f64857c;
            boolean zM22120g2 = tj3Var.m22120g(t66Var) | ((i2 & 112) == 32);
            Object objM22097O2 = tj3Var.m22097O();
            if (zM22120g2 || objM22097O2 == p84Var) {
                vi3Var2 = vi3Var;
                objM22097O2 = new ix0(vi3Var2, t66Var, 29);
                tj3Var.m22131l0(objM22097O2);
            } else {
                vi3Var2 = vi3Var;
            }
            q6d.m19686c(str2, (vi3) objM22097O2, e16VarM4412e, false, vx9Var, null, lsc.f50090b, lsc.f50091c, null, null, false, null, hj4Var, null, true, 0, 0, si8Var, eu9VarM16905h, tj3Var, 113246208, 12779520, 1932888);
            tj3Var = tj3Var;
            e16Var2 = b16Var;
        } else {
            vi3Var2 = vi3Var;
            tj3Var.m22102U();
            e16Var2 = e16Var;
        }
        x18 x18VarM22143u = tj3Var.m22143u();
        if (x18VarM22143u != null) {
            x18VarM22143u.f67642d = new g39(l1bVar, vi3Var2, e16Var2, i);
        }
    }

    /* JADX INFO: renamed from: b */
    public static final void m9756b(C2851c c2851c, vi3 vi3Var, ye1 ye1Var, int i) {
        C2851c c2851c2;
        int i2;
        vi3Var.getClass();
        tj3 tj3Var = (tj3) ye1Var;
        tj3Var.m22115d0(-417014162);
        int i3 = i | 2 | (tj3Var.m22124i(vi3Var) ? 32 : 16);
        int i4 = 1;
        if (tj3Var.m22099R(i3 & 1, (i3 & 19) != 18)) {
            tj3Var.m22104W();
            if ((i & 1) == 0 || tj3Var.m22084B()) {
                dua duaVarM21396a = si5.m21396a(tj3Var);
                if (duaVarM21396a == null) {
                    C3386nv.m17633t("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner");
                    return;
                } else {
                    c2851c2 = (C2851c) pfa.m19114d(y38.m24933a(C2851c.class), duaVarM21396a, null, AbstractC3584sr.m21591B(duaVarM21396a, tj3Var), duaVarM21396a instanceof gr3 ? ((gr3) duaVarM21396a).mo2103e() : or1.f54780b, tj3Var);
                    i2 = i3 & (-15);
                }
            } else {
                tj3Var.m22102U();
                i2 = i3 & (-15);
                c2851c2 = c2851c;
            }
            tj3Var.m22140r();
            yza yzaVar = new yza((List) AbstractC0711a.m2513c(c2851c2.f33705e, tj3Var).getValue());
            boolean zM22124i = tj3Var.m22124i(c2851c2);
            Object objM22097O = tj3Var.m22097O();
            p84 p84Var = we1.f66679a;
            if (zM22124i || objM22097O == p84Var) {
                VocabularyFilterScreenKt$VocabularyFilterRoute$1$1 vocabularyFilterScreenKt$VocabularyFilterRoute$1$1 = new VocabularyFilterScreenKt$VocabularyFilterRoute$1$1(1, c2851c2, C2851c.class, "handleAction", "handleAction(Lcom/lingq/feature/vocabulary/filter/VocabularyFilterAction;)V", 0);
                tj3Var.m22131l0(vocabularyFilterScreenKt$VocabularyFilterRoute$1$1);
                objM22097O = vocabularyFilterScreenKt$VocabularyFilterRoute$1$1;
            }
            vi3 vi3Var2 = (vi3) ((FunctionReference) objM22097O);
            boolean z = (i2 & 112) == 32;
            Object objM22097O2 = tj3Var.m22097O();
            if (z || objM22097O2 == p84Var) {
                objM22097O2 = new v4a(vi3Var, 15);
                tj3Var.m22131l0(objM22097O2);
            }
            m9757c(yzaVar, vi3Var2, (vi3) objM22097O2, tj3Var, 0);
        } else {
            tj3Var.m22102U();
            c2851c2 = c2851c;
        }
        x18 x18VarM22143u = tj3Var.m22143u();
        if (x18VarM22143u != null) {
            x18VarM22143u.f67642d = new nya(c2851c2, vi3Var, i, i4);
        }
    }

    /* JADX INFO: renamed from: c */
    public static final void m9757c(yza yzaVar, vi3 vi3Var, vi3 vi3Var2, ye1 ye1Var, int i) {
        vi3Var.getClass();
        vi3Var2.getClass();
        tj3 tj3Var = (tj3) ye1Var;
        tj3Var.m22115d0(1606153987);
        int i2 = i | (tj3Var.m22124i(yzaVar) ? 4 : 2) | (tj3Var.m22124i(vi3Var) ? 32 : 16) | (tj3Var.m22124i(vi3Var2) ? 256 : 128);
        if (tj3Var.m22099R(i2 & 1, (i2 & 147) != 146)) {
            Context context = (Context) tj3Var.m22128k(AbstractC0394f.f4761b);
            e16 e16VarM4430w = c99.m4430w(b16.f7762a, null, 3);
            zf1 zf1Var = ge9.f40637a;
            ho9.m13414a(e16VarM4430w, ui8.m22754c(((fe9) tj3Var.m22128k(zf1Var)).f38956e, ((fe9) tj3Var.m22128k(zf1Var)).f38956e, 12), 0L, 0L, 0.0f, 0.0f, null, ci8.m4703P(2123418504, new h39(yzaVar, context, vi3Var, vi3Var2, 8), tj3Var), tj3Var, 12582918, 124);
        } else {
            tj3Var.m22102U();
        }
        x18 x18VarM22143u = tj3Var.m22143u();
        if (x18VarM22143u != null) {
            x18VarM22143u.f67642d = new g39(yzaVar, vi3Var, vi3Var2, i, 19);
        }
    }

    /* JADX INFO: renamed from: d */
    public static final void m9758d(C2850b c2850b, vi3 vi3Var, ye1 ye1Var, int i) {
        C2850b c2850b2;
        int i2;
        vi3Var.getClass();
        tj3 tj3Var = (tj3) ye1Var;
        tj3Var.m22115d0(-1587103550);
        int i3 = i | 2 | (tj3Var.m22124i(vi3Var) ? 32 : 16);
        if (tj3Var.m22099R(i3 & 1, (i3 & 19) != 18)) {
            tj3Var.m22104W();
            if ((i & 1) == 0 || tj3Var.m22084B()) {
                dua duaVarM21396a = si5.m21396a(tj3Var);
                if (duaVarM21396a == null) {
                    C3386nv.m17633t("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner");
                    return;
                } else {
                    c2850b2 = (C2850b) pfa.m19114d(y38.m24933a(C2850b.class), duaVarM21396a, null, AbstractC3584sr.m21591B(duaVarM21396a, tj3Var), duaVarM21396a instanceof gr3 ? ((gr3) duaVarM21396a).mo2103e() : or1.f54780b, tj3Var);
                    i2 = i3 & (-15);
                }
            } else {
                tj3Var.m22102U();
                i2 = i3 & (-15);
                c2850b2 = c2850b;
            }
            tj3Var.m22140r();
            t66 t66VarM2513c = AbstractC0711a.m2513c(c2850b2.f33690o, tj3Var);
            t66 t66VarM2513c2 = AbstractC0711a.m2513c(c2850b2.f33686k, tj3Var);
            t66 t66VarM2513c3 = AbstractC0711a.m2513c(c2850b2.f33688m, tj3Var);
            if (((Boolean) AbstractC0711a.m2513c(c2850b2.f33700y, tj3Var).getValue()).booleanValue()) {
                vi3Var.invoke(tg6.f62255a);
                C3244l c3244l = c2850b2.f33699x;
                Boolean bool = Boolean.FALSE;
                c3244l.getClass();
                c3244l.m15572j(null, bool);
            }
            gza gzaVar = new gza((List) t66VarM2513c.getValue(), ((Boolean) t66VarM2513c2.getValue()).booleanValue(), ((Boolean) t66VarM2513c3.getValue()).booleanValue());
            boolean zM22124i = tj3Var.m22124i(c2850b2);
            Object objM22097O = tj3Var.m22097O();
            p84 p84Var = we1.f66679a;
            if (zM22124i || objM22097O == p84Var) {
                C2832x1f447056 c2832x1f447056 = new C2832x1f447056(1, c2850b2, C2850b.class, "handleAction", "handleAction(Lcom/lingq/feature/vocabulary/filter/VocabularyFilterSelectionAction;)V", 0);
                tj3Var.m22131l0(c2832x1f447056);
                objM22097O = c2832x1f447056;
            }
            vi3 vi3Var2 = (vi3) ((FunctionReference) objM22097O);
            boolean z = (i2 & 112) == 32;
            Object objM22097O2 = tj3Var.m22097O();
            if (z || objM22097O2 == p84Var) {
                objM22097O2 = new v4a(vi3Var, 16);
                tj3Var.m22131l0(objM22097O2);
            }
            m9759e(gzaVar, vi3Var2, (vi3) objM22097O2, tj3Var, 0);
        } else {
            tj3Var.m22102U();
            c2850b2 = c2850b;
        }
        x18 x18VarM22143u = tj3Var.m22143u();
        if (x18VarM22143u != null) {
            x18VarM22143u.f67642d = new nya(c2850b2, vi3Var, i, 2);
        }
    }

    /* JADX INFO: renamed from: e */
    public static final void m9759e(gza gzaVar, vi3 vi3Var, vi3 vi3Var2, ye1 ye1Var, int i) {
        vi3Var.getClass();
        vi3Var2.getClass();
        tj3 tj3Var = (tj3) ye1Var;
        tj3Var.m22115d0(259697099);
        int i2 = (tj3Var.m22124i(gzaVar) ? 4 : 2) | i | (tj3Var.m22124i(vi3Var) ? 32 : 16) | (tj3Var.m22124i(vi3Var2) ? 256 : 128);
        if (tj3Var.m22099R(i2 & 1, (i2 & 147) != 146)) {
            e16 e16VarM4430w = c99.m4430w(b16.f7762a, null, 3);
            zf1 zf1Var = ge9.f40637a;
            ho9.m13414a(e16VarM4430w, ui8.m22754c(((fe9) tj3Var.m22128k(zf1Var)).f38956e, ((fe9) tj3Var.m22128k(zf1Var)).f38956e, 12), 0L, 0L, 0.0f, 0.0f, null, ci8.m4703P(-2099631578, new eza(gzaVar, vi3Var, vi3Var2), tj3Var), tj3Var, 12582918, 124);
        } else {
            tj3Var.m22102U();
        }
        x18 x18VarM22143u = tj3Var.m22143u();
        if (x18VarM22143u != null) {
            x18VarM22143u.f67642d = new eza(gzaVar, vi3Var, vi3Var2, i);
        }
    }
}
