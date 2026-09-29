package p000;

import androidx.activity.compose.C0033a;
import androidx.compose.runtime.internal.C0282a;

/* JADX INFO: loaded from: classes2.dex */
public abstract class tgc {

    /* JADX INFO: renamed from: a */
    public static final C0282a f62262a = new C0282a(-219678989, false, new yd1(10));

    /* JADX INFO: renamed from: b */
    public static final C0282a f62263b = new C0282a(-1989150603, false, new yd1(11));

    /* JADX INFO: renamed from: c */
    public static final C0282a f62264c = new C0282a(-2102605638, false, new zd1(12));

    /* JADX INFO: renamed from: d */
    public static final C0282a f62265d = new C0282a(995039056, false, new yd1(12));

    /* JADX INFO: renamed from: e */
    public static final C0282a f62266e = new C0282a(1662420946, false, new yd1(13));

    /* JADX INFO: renamed from: f */
    public static final C0282a f62267f = new C0282a(-717771369, false, new zd1(13));

    /* JADX INFO: renamed from: a */
    public static final void m22030a(boolean z, zi3 zi3Var, ye1 ye1Var, int i) {
        int i2;
        tj3 tj3Var = (tj3) ye1Var;
        tj3Var.m22115d0(-642000585);
        if ((i & 6) == 0) {
            i2 = (tj3Var.m22122h(z) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= tj3Var.m22124i(zi3Var) ? 32 : 16;
        }
        if (tj3Var.m22099R(i2 & 1, (i2 & 19) != 18)) {
            Object objM13277a = hi5.m13277a(tj3Var);
            if (objM13277a == null) {
                tj3Var.m22111b0(1512740606);
                objM13277a = ii5.m13938a(tj3Var);
            } else {
                tj3Var.m22111b0(1512737723);
            }
            tj3Var.m22139q(false);
            if (objM13277a == null) {
                C3386nv.m17633t("No NavigationEventDispatcherOwner was provided via LocalNavigationEventDispatcherOwner and no OnBackPressedDispatcherOwner was provided via LocalOnBackPressedDispatcherOwner. Please provide one of the two.");
                return;
            }
            boolean zM22120g = tj3Var.m22120g(objM13277a);
            Object objM22097O = tj3Var.m22097O();
            p84 p84Var = we1.f66679a;
            if (zM22120g || objM22097O == p84Var) {
                aj6 aj6Var = objM13277a instanceof aj6 ? (aj6) objM13277a : null;
                ny8 ny8VarMo504a = aj6Var != null ? aj6Var.mo504a() : null;
                rr6 rr6Var = objM13277a instanceof rr6 ? (rr6) objM13277a : null;
                objM22097O = new y60(ny8VarMo504a, rr6Var != null ? rr6Var.mo13202c() : null);
                tj3Var.m22131l0(objM22097O);
            }
            y60 y60Var = (y60) objM22097O;
            Object objM22097O2 = tj3Var.m22097O();
            if (objM22097O2 == p84Var) {
                objM22097O2 = d32.m10013K(tj3Var);
                tj3Var.m22131l0(objM22097O2);
            }
            un1 un1Var = (un1) objM22097O2;
            long j = tj3Var.f62385T;
            boolean zM22120g2 = tj3Var.m22120g(y60Var) | tj3Var.m22118f(j);
            Object objM22097O3 = tj3Var.m22097O();
            if (zM22120g2 || objM22097O3 == p84Var) {
                objM22097O3 = new C0033a(un1Var, new oi7(objM13277a, j));
                tj3Var.m22131l0(objM22097O3);
            }
            C0033a c0033a = (C0033a) objM22097O3;
            tj3Var.m22111b0(-348514256);
            boolean zM22124i = tj3Var.m22124i(c0033a) | tj3Var.m22124i(zi3Var);
            Object objM22097O4 = tj3Var.m22097O();
            if (zM22124i || objM22097O4 == p84Var) {
                objM22097O4 = new a45(15, c0033a, zi3Var);
                tj3Var.m22131l0(objM22097O4);
            }
            d32.m10064x((ui3) objM22097O4, tj3Var);
            Boolean boolValueOf = Boolean.valueOf(z);
            int i3 = i2 & 14;
            boolean zM22124i2 = tj3Var.m22124i(c0033a) | (i3 == 4);
            Object objM22097O5 = tj3Var.m22097O();
            if (zM22124i2 || objM22097O5 == p84Var) {
                objM22097O5 = new cy0(c0033a, z, 3);
                tj3Var.m22131l0(objM22097O5);
            }
            AbstractC3352my.m17110b(boolValueOf, c0033a, null, (vi3) objM22097O5, tj3Var, i3);
            boolean zM22124i3 = tj3Var.m22124i(y60Var) | tj3Var.m22124i(c0033a);
            Object objM22097O6 = tj3Var.m22097O();
            if (zM22124i3 || objM22097O6 == p84Var) {
                objM22097O6 = new h85(28, y60Var, c0033a);
                tj3Var.m22131l0(objM22097O6);
            }
            d32.m10043i(y60Var, c0033a, (vi3) objM22097O6, tj3Var);
            tj3Var.m22139q(false);
        } else {
            tj3Var.m22102U();
        }
        x18 x18VarM22143u = tj3Var.m22143u();
        if (x18VarM22143u != null) {
            x18VarM22143u.f67642d = new ks1(z, zi3Var, i);
        }
    }
}
