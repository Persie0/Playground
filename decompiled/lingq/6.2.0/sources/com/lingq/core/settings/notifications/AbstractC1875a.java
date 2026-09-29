package com.lingq.core.settings.notifications;

import androidx.lifecycle.compose.AbstractC0711a;
import kotlin.jvm.internal.FunctionReference;
import p000.AbstractC3584sr;
import p000.C3386nv;
import p000.b16;
import p000.b34;
import p000.c99;
import p000.ci8;
import p000.dua;
import p000.gr3;
import p000.i75;
import p000.iz4;
import p000.or1;
import p000.pfa;
import p000.r1d;
import p000.si5;
import p000.tj3;
import p000.vi3;
import p000.wa5;
import p000.we1;
import p000.wz2;
import p000.x18;
import p000.xu8;
import p000.y38;
import p000.ye1;
import p000.yn6;

/* JADX INFO: renamed from: com.lingq.core.settings.notifications.a */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC1875a {
    /* JADX INFO: renamed from: a */
    public static final void m8650a(C1876b c1876b, ye1 ye1Var, int i) {
        tj3 tj3Var = (tj3) ye1Var;
        tj3Var.m22115d0(1478277822);
        int i2 = i | 2;
        if (tj3Var.m22099R(i2 & 1, (i2 & 3) != 2)) {
            tj3Var.m22104W();
            if ((i & 1) == 0 || tj3Var.m22084B()) {
                dua duaVarM21396a = si5.m21396a(tj3Var);
                if (duaVarM21396a == null) {
                    C3386nv.m17633t("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner");
                    return;
                }
                c1876b = (C1876b) pfa.m19114d(y38.m24933a(C1876b.class), duaVarM21396a, null, AbstractC3584sr.m21591B(duaVarM21396a, tj3Var), duaVarM21396a instanceof gr3 ? ((gr3) duaVarM21396a).mo2103e() : or1.f54780b, tj3Var);
            } else {
                tj3Var.m22102U();
            }
            C1876b c1876b2 = c1876b;
            tj3Var.m22140r();
            yn6 yn6Var = (yn6) AbstractC0711a.m2513c(c1876b2.f23018j, tj3Var).getValue();
            boolean zM22124i = tj3Var.m22124i(c1876b2);
            Object objM22097O = tj3Var.m22097O();
            if (zM22124i || objM22097O == we1.f66679a) {
                C1874x7e9c57a6 c1874x7e9c57a6 = new C1874x7e9c57a6(1, c1876b2, C1876b.class, "handleAction", "handleAction(Lcom/lingq/core/settings/notifications/NotificationsDailyLingqsAction;)V", 0);
                tj3Var.m22131l0(c1874x7e9c57a6);
                objM22097O = c1874x7e9c57a6;
            }
            m8651b(yn6Var, (vi3) ((FunctionReference) objM22097O), tj3Var, 0);
            c1876b = c1876b2;
        } else {
            tj3Var.m22102U();
        }
        x18 x18VarM22143u = tj3Var.m22143u();
        if (x18VarM22143u != null) {
            x18VarM22143u.f67642d = new wz2(c1876b, i, 24);
        }
    }

    /* JADX INFO: renamed from: b */
    public static final void m8651b(yn6 yn6Var, vi3 vi3Var, ye1 ye1Var, int i) {
        tj3 tj3Var = (tj3) ye1Var;
        tj3Var.m22115d0(1256266565);
        int i2 = i | (tj3Var.m22124i(yn6Var) ? 4 : 2) | (tj3Var.m22124i(vi3Var) ? 32 : 16);
        int i3 = 5;
        if (tj3Var.m22099R(i2 & 1, (i2 & 19) != 18)) {
            b34.m3232b(c99.m4429v(c99.m4412e(b16.f7762a, 1.0f)), null, null, null, null, 0, 0L, 0L, null, ci8.m4703P(1470245780, new iz4(i3, yn6Var, vi3Var), tj3Var), tj3Var, 805306374, 510);
            xu8 xu8Var = yn6Var.f70109e;
            boolean z = (i2 & 112) == 32;
            Object objM22097O = tj3Var.m22097O();
            if (z || objM22097O == we1.f66679a) {
                objM22097O = new i75(vi3Var, 9);
                tj3Var.m22131l0(objM22097O);
            }
            r1d.m20246a(xu8Var, (vi3) objM22097O, null, tj3Var, 0, 4);
        } else {
            tj3Var.m22102U();
        }
        x18 x18VarM22143u = tj3Var.m22143u();
        if (x18VarM22143u != null) {
            x18VarM22143u.f67642d = new wa5(yn6Var, i, 5, vi3Var);
        }
    }
}
