package p000;

import android.content.Context;
import androidx.compose.p002ui.platform.AbstractC0394f;
import androidx.compose.p002ui.window.AbstractC0456d;
import androidx.compose.runtime.AbstractC0278f;
import androidx.compose.runtime.internal.C0282a;
import p000.ct9;
import p000.dh9;
import p000.dt9;
import p000.tj3;
import p000.u82;
import p000.we1;
import p000.xfa;
import p000.ye1;

/* JADX INFO: loaded from: classes.dex */
public abstract class u82 {

    /* JADX INFO: renamed from: a */
    public static final qh7 f63537a = new qh7(30, true);

    /* JADX INFO: renamed from: a */
    public static final void m22532a(nt9 nt9Var, ct9 ct9Var, ye1 ye1Var, int i) {
        tj3 tj3Var = (tj3) ye1Var;
        tj3Var.m22115d0(1904307118);
        int i2 = (tj3Var.m22120g(nt9Var) ? 4 : 2) | i | (tj3Var.m22124i(ct9Var) ? 32 : 16);
        if (tj3Var.m22099R(i2 & 1, (i2 & 19) != 18)) {
            tj3Var.m22111b0(-1009482584);
            Context context = (Context) tj3Var.m22128k(AbstractC0394f.f4761b);
            tj3Var.m22139q(false);
            boolean zM22124i = tj3Var.m22124i(ct9Var) | ((i2 & 14) == 4) | tj3Var.m22124i(context);
            Object objM22097O = tj3Var.m22097O();
            if (zM22124i || objM22097O == we1.f66679a) {
                objM22097O = new C3485q5(ct9Var, context, nt9Var, 12);
                tj3Var.m22131l0(objM22097O);
            }
            ul1.m22786b(null, null, (vi3) objM22097O, tj3Var, 0, 3);
        } else {
            tj3Var.m22102U();
        }
        x18 x18VarM22143u = tj3Var.m22143u();
        if (x18VarM22143u != null) {
            x18VarM22143u.f67642d = new rw1(nt9Var, i, 3, ct9Var);
        }
    }

    /* JADX INFO: renamed from: b */
    public static final void m22533b(final int i, final long j, ye1 ye1Var, final int i2) {
        final int i3;
        int i4;
        x18 x18VarM22143u;
        zi3 zi3Var;
        tj3 tj3Var = (tj3) ye1Var;
        tj3Var.m22115d0(-1240244237);
        if ((i2 & 6) == 0) {
            i3 = i;
            i4 = i2 | (tj3Var.m22116e(i3) ? 4 : 2);
        } else {
            i3 = i;
            i4 = i2;
        }
        if ((i2 & 48) == 0) {
            i4 |= tj3Var.m22118f(j) ? 32 : 16;
        }
        if (tj3Var.m22099R(i4 & 1, (i4 & 19) != 18)) {
            Context context = (Context) tj3Var.m22128k(AbstractC0394f.f4761b);
            boolean zM22120g = ((i4 & 14) == 4) | tj3Var.m22120g(context);
            Object objM22097O = tj3Var.m22097O();
            p84 p84Var = we1.f66679a;
            if (zM22120g || objM22097O == p84Var) {
                objM22097O = Integer.valueOf(context.obtainStyledAttributes(new int[]{i3}).getResourceId(0, -1));
                tj3Var.m22131l0(objM22097O);
            }
            int iIntValue = ((Number) objM22097O).intValue();
            if (iIntValue == -1) {
                x18VarM22143u = tj3Var.m22143u();
                if (x18VarM22143u == null) {
                    return;
                }
                final int i5 = 1;
                zi3Var = new zi3() { // from class: t82
                    @Override // p000.zi3
                    public final Object invoke(Object obj, Object obj2) {
                        int i6 = i5;
                        xfa xfaVar = xfa.f68157a;
                        int i7 = i2;
                        long j2 = j;
                        int i8 = i3;
                        ye1 ye1Var2 = (ye1) obj;
                        ((Integer) obj2).intValue();
                        switch (i6) {
                            case 0:
                                u82.m22533b(i8, j2, ye1Var2, pk9.m19383z(i7 | 1));
                                break;
                            default:
                                u82.m22533b(i8, j2, ye1Var2, pk9.m19383z(i7 | 1));
                                break;
                        }
                        return xfaVar;
                    }
                };
            } else {
                y27 y27VarM18236U = AbstractC3423or.m18236U(iIntValue, tj3Var, 0);
                boolean z = (i4 & 112) == 32;
                Object objM22097O2 = tj3Var.m22097O();
                if (z || objM22097O2 == p84Var) {
                    objM22097O2 = j == 16 ? null : new qd0(5, j);
                    tj3Var.m22131l0(objM22097O2);
                }
                qh0.m19963a(AbstractC3695vr.m23484B(c99.m4422o(b16.f7762a, tl1.f62473e), y27VarM18236U, null, hl1.f42565b, 0.0f, (fa1) objM22097O2, 22), tj3Var, 0);
            }
            x18VarM22143u.f67642d = zi3Var;
        }
        tj3Var.m22102U();
        x18VarM22143u = tj3Var.m22143u();
        if (x18VarM22143u != null) {
            final int i6 = 0;
            zi3Var = new zi3() { // from class: t82
                @Override // p000.zi3
                public final Object invoke(Object obj, Object obj2) {
                    int i7 = i6;
                    xfa xfaVar = xfa.f68157a;
                    int i8 = i2;
                    long j2 = j;
                    int i9 = i;
                    ye1 ye1Var2 = (ye1) obj;
                    ((Integer) obj2).intValue();
                    switch (i7) {
                        case 0:
                            u82.m22533b(i9, j2, ye1Var2, pk9.m19383z(i8 | 1));
                            break;
                        default:
                            u82.m22533b(i9, j2, ye1Var2, pk9.m19383z(i8 | 1));
                            break;
                    }
                    return xfaVar;
                }
            };
            x18VarM22143u.f67642d = zi3Var;
        }
    }

    /* JADX INFO: renamed from: c */
    public static final void m22534c(final nt9 nt9Var, final dt9 dt9Var, ui3 ui3Var, ye1 ye1Var, int i) {
        int i2;
        tj3 tj3Var = (tj3) ye1Var;
        tj3Var.m22115d0(-2040393164);
        if ((i & 6) == 0) {
            i2 = ((i & 8) == 0 ? tj3Var.m22120g(nt9Var) : tj3Var.m22124i(nt9Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= (i & 64) == 0 ? tj3Var.m22120g(dt9Var) : tj3Var.m22124i(dt9Var) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= tj3Var.m22124i(ui3Var) ? 256 : 128;
        }
        boolean z = false;
        if (tj3Var.m22099R(i2 & 1, (i2 & 147) != 146)) {
            boolean z2 = (i2 & 112) == 32 || ((i2 & 64) != 0 && tj3Var.m22120g(dt9Var));
            Object objM22097O = tj3Var.m22097O();
            p84 p84Var = we1.f66679a;
            if (z2 || objM22097O == p84Var) {
                objM22097O = new gp5(new m58(new C3577sk(12, dt9Var, ui3Var), 15));
                tj3Var.m22131l0(objM22097O);
            }
            gp5 gp5Var = (gp5) objM22097O;
            if ((i2 & 14) == 4 || ((i2 & 8) != 0 && tj3Var.m22124i(nt9Var))) {
                z = true;
            }
            Object objM22097O2 = tj3Var.m22097O();
            if (z || objM22097O2 == p84Var) {
                objM22097O2 = new C3539rk(nt9Var, 14);
                tj3Var.m22131l0(objM22097O2);
            }
            AbstractC0456d.m1897a(gp5Var, (ui3) objM22097O2, f63537a, ci8.m4703P(1315155414, new zi3() { // from class: androidx.compose.foundation.text.contextmenu.internal.b
                @Override // p000.zi3
                public final Object invoke(Object obj, Object obj2) {
                    ye1 ye1Var2 = (ye1) obj;
                    int iIntValue = ((Integer) obj2).intValue();
                    tj3 tj3Var2 = (tj3) ye1Var2;
                    if (tj3Var2.m22099R(iIntValue & 1, (iIntValue & 3) != 2)) {
                        dt9 dt9Var2 = dt9Var;
                        boolean zM22120g = tj3Var2.m22120g(dt9Var2);
                        Object objM22097O3 = tj3Var2.m22097O();
                        if (zM22120g || objM22097O3 == we1.f66679a) {
                            objM22097O3 = AbstractC0278f.m1254d(new C0169x33611b20(0, dt9Var2, dt9.class, "data", "data()Landroidx/compose/foundation/text/contextmenu/data/TextContextMenuData;", 0));
                            tj3Var2.m22131l0(objM22097O3);
                        }
                        u82.m22532a(nt9Var, (ct9) ((dh9) objM22097O3).getValue(), tj3Var2, 0);
                    } else {
                        tj3Var2.m22102U();
                    }
                    return xfa.f68157a;
                }
            }, tj3Var), tj3Var, 3456, 0);
        } else {
            tj3Var.m22102U();
        }
        x18 x18VarM22143u = tj3Var.m22143u();
        if (x18VarM22143u != null) {
            x18VarM22143u.f67642d = new C2956e9(i, 19, nt9Var, dt9Var, ui3Var);
        }
    }

    /* JADX INFO: renamed from: d */
    public static final void m22535d(e16 e16Var, C0282a c0282a, ye1 ye1Var, int i) {
        int i2;
        tj3 tj3Var = (tj3) ye1Var;
        tj3Var.m22115d0(1392105195);
        int i3 = 2;
        if ((i & 6) == 0) {
            i2 = (tj3Var.m22120g(e16Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= tj3Var.m22124i(c0282a) ? 32 : 16;
        }
        if (tj3Var.m22099R(i2 & 1, (i2 & 19) != 18)) {
            vz1.m23623c(e16Var, lt9.f50118a, c0282a, tj3Var, ((i2 << 6) & 7168) | (i2 & 14) | 432);
        } else {
            tj3Var.m22102U();
        }
        x18 x18VarM22143u = tj3Var.m22143u();
        if (x18VarM22143u != null) {
            x18VarM22143u.f67642d = new C3762xk(e16Var, c0282a, i, i3);
        }
    }
}
