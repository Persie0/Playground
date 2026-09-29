package com.lingq.feature.imports;

import android.content.Context;
import android.widget.Toast;
import androidx.compose.material3.AbstractC0218a;
import androidx.compose.p002ui.platform.AbstractC0394f;
import androidx.compose.runtime.AbstractC0278f;
import androidx.lifecycle.compose.AbstractC0711a;
import com.lingq.feature.imports.data.UserImportDetailType;
import com.lingq.feature.imports.data.UserImportSourceType;
import java.util.List;
import kotlin.jvm.internal.FunctionReference;
import p000.AbstractC3584sr;
import p000.C3386nv;
import p000.aa1;
import p000.b16;
import p000.b34;
import p000.c99;
import p000.ci8;
import p000.d32;
import p000.dka;
import p000.dua;
import p000.e16;
import p000.eq8;
import p000.eu9;
import p000.fe9;
import p000.fka;
import p000.g24;
import p000.g39;
import p000.ge9;
import p000.gr3;
import p000.h7a;
import p000.hj4;
import p000.ho9;
import p000.ix0;
import p000.mkd;
import p000.mla;
import p000.ms5;
import p000.nla;
import p000.ola;
import p000.or1;
import p000.p84;
import p000.pfa;
import p000.ps2;
import p000.ps5;
import p000.q6d;
import p000.r3a;
import p000.sg8;
import p000.si5;
import p000.si8;
import p000.t66;
import p000.tg6;
import p000.tj3;
import p000.ui8;
import p000.v4a;
import p000.vh9;
import p000.vi3;
import p000.vka;
import p000.vx9;
import p000.we1;
import p000.x17;
import p000.x18;
import p000.xrc;
import p000.y35;
import p000.y38;
import p000.ye1;
import p000.zf1;
import p000.zi3;
import retrofit2.HttpException;

/* JADX INFO: renamed from: com.lingq.feature.imports.b */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC2105b {
    /* JADX INFO: renamed from: a */
    public static final void m9003a(dka dkaVar, vi3 vi3Var, vi3 vi3Var2, ye1 ye1Var, int i) {
        tj3 tj3Var;
        tj3 tj3Var2 = (tj3) ye1Var;
        tj3Var2.m22115d0(1543565299);
        int i2 = (tj3Var2.m22120g(dkaVar) ? 4 : 2) | i;
        if ((i & 48) == 0) {
            i2 |= tj3Var2.m22124i(vi3Var) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= tj3Var2.m22124i(vi3Var2) ? 256 : 128;
        }
        if (tj3Var2.m22099R(i2 & 1, (i2 & 147) != 146)) {
            Object objM22097O = tj3Var2.m22097O();
            if (objM22097O == we1.f66679a) {
                objM22097O = AbstractC0278f.m1260j(dkaVar.f35753a);
                tj3Var2.m22131l0(objM22097O);
            }
            e16 e16VarM4430w = c99.m4430w(b16.f7762a, null, 3);
            zf1 zf1Var = ge9.f40637a;
            tj3Var = tj3Var2;
            ho9.m13414a(e16VarM4430w, ui8.m22754c(((fe9) tj3Var2.m22128k(zf1Var)).f38956e, ((fe9) tj3Var2.m22128k(zf1Var)).f38956e, 12), 0L, 0L, 0.0f, 0.0f, null, ci8.m4703P(1566612558, new g39(vi3Var2, vi3Var, (t66) objM22097O, 14), tj3Var2), tj3Var, 12582918, 124);
        } else {
            tj3Var = tj3Var2;
            tj3Var.m22102U();
        }
        x18 x18VarM22143u = tj3Var.m22143u();
        if (x18VarM22143u != null) {
            x18VarM22143u.f67642d = new y35(i, 18, dkaVar, vi3Var, vi3Var2);
        }
    }

    /* JADX INFO: renamed from: b */
    public static final void m9004b(fka fkaVar, vi3 vi3Var, ye1 ye1Var, int i) {
        fka fkaVar2;
        int i2;
        vi3Var.getClass();
        tj3 tj3Var = (tj3) ye1Var;
        tj3Var.m22115d0(-1340517002);
        int i3 = i | 2 | (tj3Var.m22124i(vi3Var) ? 32 : 16);
        if (tj3Var.m22099R(i3 & 1, (i3 & 19) != 18)) {
            tj3Var.m22104W();
            if ((i & 1) == 0 || tj3Var.m22084B()) {
                dua duaVarM21396a = si5.m21396a(tj3Var);
                if (duaVarM21396a == null) {
                    C3386nv.m17633t("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner");
                    return;
                } else {
                    fkaVar2 = (fka) pfa.m19114d(y38.m24933a(fka.class), duaVarM21396a, null, AbstractC3584sr.m21591B(duaVarM21396a, tj3Var), duaVarM21396a instanceof gr3 ? ((gr3) duaVarM21396a).mo2103e() : or1.f54780b, tj3Var);
                    i2 = i3 & (-15);
                }
            } else {
                tj3Var.m22102U();
                i2 = i3 & (-15);
                fkaVar2 = fkaVar;
            }
            tj3Var.m22140r();
            dka dkaVar = new dka();
            boolean zM22124i = tj3Var.m22124i(fkaVar2);
            Object objM22097O = tj3Var.m22097O();
            p84 p84Var = we1.f66679a;
            if (zM22124i || objM22097O == p84Var) {
                UserImportAddCourseScreenKt$AddCourseScreenRoute$1$1 userImportAddCourseScreenKt$AddCourseScreenRoute$1$1 = new UserImportAddCourseScreenKt$AddCourseScreenRoute$1$1(1, fkaVar2, fka.class, "handleAction", "handleAction(Lcom/lingq/feature/imports/UserImportAddCourseAction;)V", 0);
                tj3Var.m22131l0(userImportAddCourseScreenKt$AddCourseScreenRoute$1$1);
                objM22097O = userImportAddCourseScreenKt$AddCourseScreenRoute$1$1;
            }
            vi3 vi3Var2 = (vi3) ((FunctionReference) objM22097O);
            boolean z = (i2 & 112) == 32;
            Object objM22097O2 = tj3Var.m22097O();
            if (z || objM22097O2 == p84Var) {
                objM22097O2 = new v4a(vi3Var, 5);
                tj3Var.m22131l0(objM22097O2);
            }
            m9003a(dkaVar, vi3Var2, (vi3) objM22097O2, tj3Var, 0);
        } else {
            tj3Var.m22102U();
            fkaVar2 = fkaVar;
        }
        x18 x18VarM22143u = tj3Var.m22143u();
        if (x18VarM22143u != null) {
            x18VarM22143u.f67642d = new eq8(fkaVar2, i, 25, vi3Var);
        }
    }

    /* JADX INFO: renamed from: c */
    public static final void m9005c(e16 e16Var, ola olaVar, vi3 vi3Var, ye1 ye1Var, int i) {
        e16 e16Var2;
        tj3 tj3Var = (tj3) ye1Var;
        tj3Var.m22115d0(-767931481);
        int i2 = i | 6 | (tj3Var.m22120g(olaVar) ? 32 : 16) | (tj3Var.m22124i(vi3Var) ? 256 : 128);
        if (tj3Var.m22099R(i2 & 1, (i2 & 147) != 146)) {
            Object objM22097O = tj3Var.m22097O();
            p84 p84Var = we1.f66679a;
            if (objM22097O == p84Var) {
                objM22097O = AbstractC0278f.m1260j(olaVar.f54558a);
                tj3Var.m22131l0(objM22097O);
            }
            t66 t66Var = (t66) objM22097O;
            String str = (String) t66Var.getValue();
            b16 b16Var = b16.f7762a;
            e16 e16VarM4412e = c99.m4412e(b16Var, 1.0f);
            vh9 vh9Var = ps5.f56764b;
            vx9 vx9Var = ((ms5) tj3Var.m22128k(vh9Var)).f51800b.f71406j;
            hj4 hj4Var = new hj4(1, 3, null, 115);
            long j = aa1.f411j;
            eu9 eu9VarM16905h = mkd.m16905h(0L, 0L, j, j, j, tj3Var, 2147469311);
            si8 si8Var = ((ms5) tj3Var.m22128k(vh9Var)).f51801c.f64857c;
            boolean z = (i2 & 896) == 256;
            Object objM22097O2 = tj3Var.m22097O();
            if (z || objM22097O2 == p84Var) {
                objM22097O2 = new ix0(vi3Var, t66Var, 27);
                tj3Var.m22131l0(objM22097O2);
            }
            q6d.m19686c(str, (vi3) objM22097O2, e16VarM4412e, false, vx9Var, null, xrc.f68592b, xrc.f68593c, null, null, false, null, hj4Var, null, true, 0, 0, si8Var, eu9VarM16905h, tj3Var, 113246208, 12779520, 1932888);
            tj3Var = tj3Var;
            e16Var2 = b16Var;
        } else {
            tj3Var.m22102U();
            e16Var2 = e16Var;
        }
        x18 x18VarM22143u = tj3Var.m22143u();
        if (x18VarM22143u != null) {
            x18VarM22143u.f67642d = new g39(e16Var2, olaVar, vi3Var, i, 17);
        }
    }

    /* JADX INFO: renamed from: d */
    public static final void m9006d(C2109f c2109f, vi3 vi3Var, ye1 ye1Var, int i) {
        C2109f c2109f2;
        int i2;
        vi3Var.getClass();
        tj3 tj3Var = (tj3) ye1Var;
        tj3Var.m22115d0(-1484497462);
        int i3 = i | 2 | (tj3Var.m22124i(vi3Var) ? 32 : 16);
        if (tj3Var.m22099R(i3 & 1, (i3 & 19) != 18)) {
            tj3Var.m22104W();
            if ((i & 1) == 0 || tj3Var.m22084B()) {
                dua duaVarM21396a = si5.m21396a(tj3Var);
                if (duaVarM21396a == null) {
                    C3386nv.m17633t("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner");
                    return;
                } else {
                    c2109f2 = (C2109f) pfa.m19114d(y38.m24933a(C2109f.class), duaVarM21396a, null, AbstractC3584sr.m21591B(duaVarM21396a, tj3Var), duaVarM21396a instanceof gr3 ? ((gr3) duaVarM21396a).mo2103e() : or1.f54780b, tj3Var);
                    i2 = i3 & (-15);
                }
            } else {
                tj3Var.m22102U();
                i2 = i3 & (-15);
                c2109f2 = c2109f;
            }
            tj3Var.m22140r();
            vka vkaVar = new vka((g24) AbstractC0711a.m2513c(c2109f2.f26189u, tj3Var).getValue(), c2109f2.f26181m.f56382a);
            boolean zM22124i = tj3Var.m22124i(c2109f2);
            Object objM22097O = tj3Var.m22097O();
            p84 p84Var = we1.f66679a;
            if (zM22124i || objM22097O == p84Var) {
                UserImportScreenKt$UserImportRoute$1$1 userImportScreenKt$UserImportRoute$1$1 = new UserImportScreenKt$UserImportRoute$1$1(1, c2109f2, C2109f.class, "handleAction", "handleAction(Lcom/lingq/feature/imports/ImportUiAction;)V", 0);
                tj3Var.m22131l0(userImportScreenKt$UserImportRoute$1$1);
                objM22097O = userImportScreenKt$UserImportRoute$1$1;
            }
            vi3 vi3Var2 = (vi3) ((FunctionReference) objM22097O);
            boolean z = (i2 & 112) == 32;
            Object objM22097O2 = tj3Var.m22097O();
            if (z || objM22097O2 == p84Var) {
                objM22097O2 = new v4a(vi3Var, 6);
                tj3Var.m22131l0(objM22097O2);
            }
            m9007e(vkaVar, vi3Var2, (vi3) objM22097O2, tj3Var, 0);
        } else {
            tj3Var.m22102U();
            c2109f2 = c2109f;
        }
        x18 x18VarM22143u = tj3Var.m22143u();
        if (x18VarM22143u != null) {
            x18VarM22143u.f67642d = new eq8(c2109f2, i, 26, vi3Var);
        }
    }

    /* JADX INFO: renamed from: e */
    public static final void m9007e(vka vkaVar, vi3 vi3Var, vi3 vi3Var2, ye1 ye1Var, int i) {
        tj3 tj3Var;
        tj3 tj3Var2 = (tj3) ye1Var;
        tj3Var2.m22115d0(476244983);
        int i2 = (tj3Var2.m22120g(vkaVar) ? 4 : 2) | i;
        int i3 = 16;
        if ((i & 48) == 0) {
            i2 |= tj3Var2.m22124i(vi3Var) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= tj3Var2.m22124i(vi3Var2) ? 256 : 128;
        }
        if (tj3Var2.m22099R(i2 & 1, (i2 & 147) != 146)) {
            g24 g24Var = vkaVar.f65547a;
            UserImportSourceType userImportSourceType = vkaVar.f65548b;
            Context context = (Context) tj3Var2.m22128k(AbstractC0394f.f4761b);
            x17 x17Var = h7a.f41916a;
            ps2 ps2VarM13114a = h7a.m13114a(AbstractC0218a.m1129i(tj3Var2), tj3Var2);
            Object objM22097O = tj3Var2.m22097O();
            p84 p84Var = we1.f66679a;
            if (objM22097O == p84Var) {
                objM22097O = AbstractC0278f.m1260j("");
                tj3Var2.m22131l0(objM22097O);
            }
            t66 t66Var = (t66) objM22097O;
            Object objM22097O2 = tj3Var2.m22097O();
            if (objM22097O2 == p84Var) {
                objM22097O2 = AbstractC0278f.m1260j("");
                tj3Var2.m22131l0(objM22097O2);
            }
            t66 t66Var2 = (t66) objM22097O2;
            boolean zM22120g = tj3Var2.m22120g(g24Var);
            Object objM22097O3 = tj3Var2.m22097O();
            if (zM22120g || objM22097O3 == p84Var) {
                objM22097O3 = new UserImportScreenKt$UserImportScreen$1$1(g24Var, t66Var2, t66Var, null);
                tj3Var2.m22131l0(objM22097O3);
            }
            d32.m10047k(tj3Var2, (zi3) objM22097O3, g24Var);
            tj3Var = tj3Var2;
            b34.m3232b(null, ci8.m4703P(1852877747, new g39(ps2VarM13114a, userImportSourceType, vi3Var2, i3), tj3Var2), null, null, null, 0, 0L, 0L, null, ci8.m4703P(1161562952, new sg8(g24Var, vi3Var, userImportSourceType, context, vi3Var2, t66Var, t66Var2), tj3Var2), tj3Var, 805306416, 509);
        } else {
            tj3Var = tj3Var2;
            tj3Var.m22102U();
        }
        x18 x18VarM22143u = tj3Var.m22143u();
        if (x18VarM22143u != null) {
            x18VarM22143u.f67642d = new y35(i, 19, vkaVar, vi3Var, vi3Var2);
        }
    }

    /* JADX INFO: renamed from: f */
    public static final String m9008f(t66 t66Var) {
        return (String) t66Var.getValue();
    }

    /* JADX INFO: renamed from: g */
    public static final void m9009g(C2108e c2108e, vi3 vi3Var, ye1 ye1Var, int i) {
        C2108e c2108e2;
        int i2;
        vi3Var.getClass();
        tj3 tj3Var = (tj3) ye1Var;
        tj3Var.m22115d0(-1632473470);
        int i3 = i | 2 | (tj3Var.m22124i(vi3Var) ? 32 : 16);
        if (tj3Var.m22099R(i3 & 1, (i3 & 19) != 18)) {
            tj3Var.m22104W();
            if ((i & 1) == 0 || tj3Var.m22084B()) {
                dua duaVarM21396a = si5.m21396a(tj3Var);
                if (duaVarM21396a == null) {
                    C3386nv.m17633t("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner");
                    return;
                } else {
                    c2108e2 = (C2108e) pfa.m19114d(y38.m24933a(C2108e.class), duaVarM21396a, null, AbstractC3584sr.m21591B(duaVarM21396a, tj3Var), duaVarM21396a instanceof gr3 ? ((gr3) duaVarM21396a).mo2103e() : or1.f54780b, tj3Var);
                    i2 = i3 & (-15);
                }
            } else {
                tj3Var.m22102U();
                i2 = i3 & (-15);
                c2108e2 = c2108e;
            }
            tj3Var.m22140r();
            Context context = (Context) tj3Var.m22128k(AbstractC0394f.f4761b);
            t66 t66VarM2513c = AbstractC0711a.m2513c(c2108e2.f26169q, tj3Var);
            t66 t66VarM2513c2 = AbstractC0711a.m2513c(c2108e2.f26163k, tj3Var);
            t66 t66VarM2513c3 = AbstractC0711a.m2513c(c2108e2.f26154b.mo9013l0(), tj3Var);
            t66 t66VarM2513c4 = AbstractC0711a.m2513c(c2108e2.f26166n, tj3Var);
            if (((Boolean) t66VarM2513c3.getValue()).booleanValue()) {
                vi3Var.invoke(tg6.f62255a);
            }
            if (((HttpException) t66VarM2513c4.getValue()) != null) {
                Toast.makeText(context, String.valueOf((HttpException) t66VarM2513c4.getValue()), 1).show();
                c2108e2.f26165m.m15571i(null);
            }
            nla nlaVar = new nla((List) t66VarM2513c.getValue(), ((Boolean) t66VarM2513c2.getValue()).booleanValue(), c2108e2.f26160h.f8663a == UserImportDetailType.Course);
            boolean zM22124i = tj3Var.m22124i(c2108e2);
            Object objM22097O = tj3Var.m22097O();
            p84 p84Var = we1.f66679a;
            if (zM22124i || objM22097O == p84Var) {
                UserImportSelectionScreenKt$UserImportSelectionRoute$2$1 userImportSelectionScreenKt$UserImportSelectionRoute$2$1 = new UserImportSelectionScreenKt$UserImportSelectionRoute$2$1(1, c2108e2, C2108e.class, "handleAction", "handleAction(Lcom/lingq/feature/imports/UserImportSelectionAction;)V", 0);
                tj3Var.m22131l0(userImportSelectionScreenKt$UserImportSelectionRoute$2$1);
                objM22097O = userImportSelectionScreenKt$UserImportSelectionRoute$2$1;
            }
            vi3 vi3Var2 = (vi3) ((FunctionReference) objM22097O);
            boolean zM22124i2 = tj3Var.m22124i(c2108e2) | ((i2 & 112) == 32);
            Object objM22097O2 = tj3Var.m22097O();
            if (zM22124i2 || objM22097O2 == p84Var) {
                objM22097O2 = new r3a(9, vi3Var, c2108e2);
                tj3Var.m22131l0(objM22097O2);
            }
            m9010h(nlaVar, vi3Var2, (vi3) objM22097O2, tj3Var, 0);
        } else {
            tj3Var.m22102U();
            c2108e2 = c2108e;
        }
        x18 x18VarM22143u = tj3Var.m22143u();
        if (x18VarM22143u != null) {
            x18VarM22143u.f67642d = new eq8(c2108e2, i, 27, vi3Var);
        }
    }

    /* JADX INFO: renamed from: h */
    public static final void m9010h(nla nlaVar, vi3 vi3Var, vi3 vi3Var2, ye1 ye1Var, int i) {
        tj3 tj3Var = (tj3) ye1Var;
        tj3Var.m22115d0(-841743501);
        int i2 = (tj3Var.m22124i(nlaVar) ? 4 : 2) | i | (tj3Var.m22124i(vi3Var) ? 32 : 16) | (tj3Var.m22124i(vi3Var2) ? 256 : 128);
        if (tj3Var.m22099R(i2 & 1, (i2 & 147) != 146)) {
            e16 e16VarM4430w = c99.m4430w(b16.f7762a, null, 3);
            zf1 zf1Var = ge9.f40637a;
            ho9.m13414a(e16VarM4430w, ui8.m22754c(((fe9) tj3Var.m22128k(zf1Var)).f38956e, ((fe9) tj3Var.m22128k(zf1Var)).f38956e, 12), 0L, 0L, 0.0f, 0.0f, null, ci8.m4703P(2044213774, new mla(nlaVar, vi3Var, vi3Var2), tj3Var), tj3Var, 12582918, 124);
        } else {
            tj3Var.m22102U();
        }
        x18 x18VarM22143u = tj3Var.m22143u();
        if (x18VarM22143u != null) {
            x18VarM22143u.f67642d = new mla(nlaVar, vi3Var, vi3Var2, i);
        }
    }
}
