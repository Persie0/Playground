package p000;

import android.view.View;
import androidx.compose.p002ui.node.C0353c;
import androidx.compose.p002ui.node.C0357g;
import androidx.compose.runtime.internal.C0282a;
import androidx.glance.layout.AbstractC0686a;

/* JADX INFO: loaded from: classes2.dex */
public abstract class ea4 {

    /* JADX INFO: renamed from: a */
    public static final C3188kl f36923a = new C3188kl();

    /* JADX INFO: renamed from: a */
    public static final void m10995a(final C0282a c0282a, final on3 on3Var, float f, final zi3 zi3Var, final zi3 zi3Var2, final zi3 zi3Var3, final InterfaceC3063h5 interfaceC3063h5, ye1 ye1Var, final int i) {
        int i2;
        final float f2;
        tj3 tj3Var = (tj3) ye1Var;
        tj3Var.m22115d0(-93691663);
        if ((i & 6) == 0) {
            i2 = (tj3Var.m22124i(c0282a) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= tj3Var.m22120g(on3Var) ? 32 : 16;
        }
        int i3 = i2 | 384;
        if ((i & 3072) == 0) {
            i3 |= tj3Var.m22124i(zi3Var) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            i3 |= tj3Var.m22124i(zi3Var2) ? 16384 : 8192;
        }
        if ((196608 & i) == 0) {
            i3 |= tj3Var.m22124i(zi3Var3) ? 131072 : 65536;
        }
        if ((1572864 & i) == 0) {
            i3 |= tj3Var.m22124i(interfaceC3063h5) ? 1048576 : 524288;
        }
        int i4 = i3 | 12582912;
        if (tj3Var.m22099R(i4 & 1, (4793491 & i4) != 4793490)) {
            tj3Var.m22111b0(560940441);
            tj3Var.m22139q(false);
            final float f3 = 16.0f;
            AbstractC0686a.m2487c(interfaceC3063h5 != null ? on3Var.mo16935d(new C0836c6(interfaceC3063h5, 0)) : on3Var, 0, 1, ci8.m4703P(-1314950827, new aj3() { // from class: jf5
                @Override // p000.aj3
                public final Object invoke(Object obj, Object obj2, Object obj3) {
                    ye1 ye1Var2 = (ye1) obj2;
                    ((Integer) obj3).getClass();
                    ((uj8) obj).getClass();
                    mn3 mn3Var = mn3.f51554a;
                    zi3 zi3Var4 = zi3Var2;
                    float f4 = f3;
                    if (zi3Var4 == null) {
                        tj3 tj3Var2 = (tj3) ye1Var2;
                        tj3Var2.m22111b0(696667400);
                        tj3Var2.m22139q(false);
                    } else {
                        tj3 tj3Var3 = (tj3) ye1Var2;
                        tj3Var3.m22111b0(696667401);
                        zi3Var4.invoke(tj3Var3, 0);
                        AbstractC0686a.m2488d(ci8.m4717b0(mn3Var, f4), tj3Var3, 0);
                        tj3Var3.m22139q(false);
                    }
                    AbstractC0686a.m2486b(new m4b(jg2.f45515a), 1, 0, ci8.m4703P(341715019, new iz4(3, c0282a, zi3Var), ye1Var2), ye1Var2, 3072, 4);
                    zi3 zi3Var5 = zi3Var3;
                    tj3 tj3Var4 = (tj3) ye1Var2;
                    if (zi3Var5 == null) {
                        tj3Var4.m22111b0(697054280);
                        tj3Var4.m22139q(false);
                    } else {
                        tj3Var4.m22111b0(697054281);
                        AbstractC0686a.m2488d(ci8.m4717b0(mn3Var, f4), tj3Var4, 0);
                        zi3Var5.invoke(tj3Var4, 0);
                        tj3Var4.m22139q(false);
                    }
                    return xfa.f68157a;
                }
            }, tj3Var), tj3Var, 3072, 2);
            f2 = 16.0f;
        } else {
            tj3Var.m22102U();
            f2 = f;
        }
        x18 x18VarM22143u = tj3Var.m22143u();
        if (x18VarM22143u != null) {
            x18VarM22143u.f67642d = new zi3() { // from class: lf5
                @Override // p000.zi3
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    ea4.m10995a(c0282a, on3Var, f2, zi3Var, zi3Var2, zi3Var3, interfaceC3063h5, (ye1) obj, pk9.m19383z(i | 1));
                    return xfa.f68157a;
                }
            };
        }
    }

    /* JADX INFO: renamed from: b */
    public static final void m10996b(View view, C0357g c0357g) {
        long jMo1671R = ((C0353c) c0357g.f4335a0.f46676d).mo1671R(0L);
        int iRound = Math.round(Float.intBitsToFloat((int) (jMo1671R >> 32)));
        int iRound2 = Math.round(Float.intBitsToFloat((int) (jMo1671R & 4294967295L)));
        view.layout(iRound, iRound2, view.getMeasuredWidth() + iRound, view.getMeasuredHeight() + iRound2);
    }

    /* JADX INFO: renamed from: c */
    public static final float m10997c(int i) {
        return i * (-1.0f);
    }

    /* JADX INFO: renamed from: d */
    public static final float m10998d(float f) {
        return f * (-1.0f);
    }

    /* JADX INFO: renamed from: e */
    public static final int m10999e(int i) {
        return i == 0 ? 1 : 2;
    }
}
