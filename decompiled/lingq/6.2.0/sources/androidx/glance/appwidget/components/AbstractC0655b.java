package androidx.glance.appwidget.components;

import android.os.Build;
import androidx.compose.runtime.internal.C0282a;
import androidx.glance.appwidget.R$dimen;
import androidx.glance.appwidget.R$drawable;
import androidx.glance.appwidget.components.AbstractC0655b;
import androidx.glance.layout.AbstractC0686a;
import p000.C0836c6;
import p000.C0850ck;
import p000.C3504qn;
import p000.C3532re;
import p000.ci8;
import p000.di0;
import p000.dn1;
import p000.ea1;
import p000.gk0;
import p000.j1a;
import p000.mg2;
import p000.mn3;
import p000.oa1;
import p000.on3;
import p000.pk9;
import p000.te1;
import p000.tg9;
import p000.tj3;
import p000.uj0;
import p000.ur2;
import p000.vh9;
import p000.vn2;
import p000.wfb;
import p000.x18;
import p000.xfa;
import p000.ye1;
import p000.yf1;
import p000.zi3;
import p000.zj0;
import p000.zz3;

/* JADX INFO: renamed from: androidx.glance.appwidget.components.b */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0655b {
    /* JADX WARN: Code duplicated, block: B:30:0x0067  */
    /* JADX WARN: Code duplicated, block: B:32:0x0071  */
    /* JADX WARN: Code duplicated, block: B:39:0x0086  */
    /* JADX WARN: Code duplicated, block: B:41:0x008d  */
    /* JADX WARN: Code duplicated, block: B:46:0x00ca  */
    /* JADX WARN: Code duplicated, block: B:48:? A[RETURN, SYNTHETIC] */
    /* JADX INFO: renamed from: a */
    public static final void m2219a(C0850ck c0850ck, String str, tg9 tg9Var, on3 on3Var, boolean z, oa1 oa1Var, oa1 oa1Var2, ye1 ye1Var, int i, int i2) {
        oa1 oa1Var3;
        int i3;
        int i4;
        oa1 oa1Var4;
        boolean z2;
        on3 on3Var2;
        oa1 oa1Var5;
        on3 on3Var3;
        boolean z3;
        x18 x18VarM22143u;
        tj3 tj3Var = (tj3) ye1Var;
        tj3Var.m22115d0(583948960);
        int i5 = i | (tj3Var.m22124i(c0850ck) ? 4 : 2);
        if ((i & 48) == 0) {
            i5 |= tj3Var.m22120g(str) ? 32 : 16;
        }
        int i6 = i5 | (tj3Var.m22124i(tg9Var) ? 256 : 128) | 27648;
        if ((i2 & 64) == 0) {
            oa1Var3 = oa1Var2;
            int i7 = tj3Var.m22124i(oa1Var3) ? 1048576 : 524288;
            i3 = i6 | i7;
            if ((599187 & i3) == 599186 || !tj3Var.m22086D()) {
                tj3Var.m22104W();
                if ((i & 1) != 0 || tj3Var.m22084B()) {
                    i4 = i2 & 64;
                    mn3 mn3Var = mn3.f51554a;
                    if (i4 != 0) {
                        oa1Var3 = ((vn2) tj3Var.m22128k(yf1.f69766e)).f65651t;
                        i3 &= -3670017;
                    }
                    oa1Var4 = oa1Var3;
                    z2 = true;
                    on3Var2 = mn3Var;
                } else {
                    tj3Var.m22102U();
                    if ((i2 & 64) != 0) {
                        i3 &= -3670017;
                    }
                    on3Var2 = on3Var;
                    z2 = z;
                    oa1Var4 = oa1Var3;
                }
                tj3Var.m22140r();
                m2221c(c0850ck, str, oa1Var4, oa1Var, IconButtonShape.Circle, tg9Var, on3Var2, z2, tj3Var, ((i3 << 9) & 458752) | (i3 & 14) | 24576 | (i3 & 112) | ((i3 >> 12) & 896) | 3072 | 14155776);
                oa1Var5 = oa1Var4;
                on3Var3 = on3Var2;
                z3 = z2;
            } else {
                tj3Var.m22102U();
                on3Var3 = on3Var;
                z3 = z;
                oa1Var5 = oa1Var3;
            }
            x18VarM22143u = tj3Var.m22143u();
            if (x18VarM22143u != null) {
                x18VarM22143u.f67642d = new zj0(c0850ck, str, tg9Var, on3Var3, z3, oa1Var, oa1Var5, i, i2);
            }
        }
        oa1Var3 = oa1Var2;
        i3 = i6 | i7;
        if ((599187 & i3) == 599186) {
            tj3Var.m22104W();
            if ((i & 1) != 0) {
                i4 = i2 & 64;
                mn3 mn3Var2 = mn3.f51554a;
                if (i4 != 0) {
                    oa1Var3 = ((vn2) tj3Var.m22128k(yf1.f69766e)).f65651t;
                    i3 &= -3670017;
                }
                oa1Var4 = oa1Var3;
                z2 = true;
                on3Var2 = mn3Var2;
            } else {
                i4 = i2 & 64;
                mn3 mn3Var3 = mn3.f51554a;
                if (i4 != 0) {
                    oa1Var3 = ((vn2) tj3Var.m22128k(yf1.f69766e)).f65651t;
                    i3 &= -3670017;
                }
                oa1Var4 = oa1Var3;
                z2 = true;
                on3Var2 = mn3Var3;
            }
            tj3Var.m22140r();
            m2221c(c0850ck, str, oa1Var4, oa1Var, IconButtonShape.Circle, tg9Var, on3Var2, z2, tj3Var, ((i3 << 9) & 458752) | (i3 & 14) | 24576 | (i3 & 112) | ((i3 >> 12) & 896) | 3072 | 14155776);
            oa1Var5 = oa1Var4;
            on3Var3 = on3Var2;
            z3 = z2;
        } else {
            tj3Var.m22104W();
            if ((i & 1) != 0) {
                i4 = i2 & 64;
                mn3 mn3Var4 = mn3.f51554a;
                if (i4 != 0) {
                    oa1Var3 = ((vn2) tj3Var.m22128k(yf1.f69766e)).f65651t;
                    i3 &= -3670017;
                }
                oa1Var4 = oa1Var3;
                z2 = true;
                on3Var2 = mn3Var4;
            } else {
                i4 = i2 & 64;
                mn3 mn3Var5 = mn3.f51554a;
                if (i4 != 0) {
                    oa1Var3 = ((vn2) tj3Var.m22128k(yf1.f69766e)).f65651t;
                    i3 &= -3670017;
                }
                oa1Var4 = oa1Var3;
                z2 = true;
                on3Var2 = mn3Var5;
            }
            tj3Var.m22140r();
            m2221c(c0850ck, str, oa1Var4, oa1Var, IconButtonShape.Circle, tg9Var, on3Var2, z2, tj3Var, ((i3 << 9) & 458752) | (i3 & 14) | 24576 | (i3 & 112) | ((i3 >> 12) & 896) | 3072 | 14155776);
            oa1Var5 = oa1Var4;
            on3Var3 = on3Var2;
            z3 = z2;
        }
        x18VarM22143u = tj3Var.m22143u();
        if (x18VarM22143u != null) {
            x18VarM22143u.f67642d = new zj0(c0850ck, str, tg9Var, on3Var3, z3, oa1Var, oa1Var5, i, i2);
        }
    }

    /* JADX INFO: renamed from: b */
    public static final void m2220b(String str, tg9 tg9Var, on3 on3Var, boolean z, zz3 zz3Var, uj0 uj0Var, int i, ye1 ye1Var, int i2) {
        int i3;
        on3 on3Var2;
        int i4;
        uj0 uj0Var2;
        boolean z2;
        boolean z3;
        int i5;
        uj0 uj0Var3;
        on3 on3Var3;
        tj3 tj3Var = (tj3) ye1Var;
        tj3Var.m22115d0(-326511592);
        int i6 = i2 | (tj3Var.m22120g(str) ? 4 : 2) | (tj3Var.m22124i(tg9Var) ? 32 : 16) | 3456 | (tj3Var.m22124i(zz3Var) ? 16384 : 8192) | 1638400;
        if ((599187 & i6) == 599186 && tj3Var.m22086D()) {
            tj3Var.m22102U();
            on3Var3 = on3Var;
            z3 = z;
            uj0Var3 = uj0Var;
            i5 = i;
        } else {
            tj3Var.m22104W();
            if ((i2 & 1) == 0 || tj3Var.m22084B()) {
                tj3Var.m22113c0(207135993);
                vh9 vh9Var = yf1.f69766e;
                uj0 uj0Var4 = new uj0(((vn2) tj3Var.m22128k(vh9Var)).f65632a, ((vn2) tj3Var.m22128k(vh9Var)).f65633b);
                tj3Var.m22139q(false);
                i3 = i6 & (-458753);
                on3Var2 = mn3.f51554a;
                i4 = Integer.MAX_VALUE;
                uj0Var2 = uj0Var4;
                z2 = true;
            } else {
                tj3Var.m22102U();
                i3 = i6 & (-458753);
                on3Var2 = on3Var;
                z2 = z;
                uj0Var2 = uj0Var;
                i4 = i;
            }
            tj3Var.m22140r();
            m2222d(str, tg9Var, on3Var2, z2, zz3Var, uj0Var2.f63985b, R$drawable.glance_component_btn_filled, uj0Var2.f63984a, i4, tj3Var, (i3 & 65534) | 100663296);
            z3 = z2;
            i5 = i4;
            uj0Var3 = uj0Var2;
            on3Var3 = on3Var2;
        }
        x18 x18VarM22143u = tj3Var.m22143u();
        if (x18VarM22143u != null) {
            x18VarM22143u.f67642d = new gk0(str, tg9Var, on3Var3, z3, zz3Var, uj0Var3, i5, i2);
        }
    }

    /* JADX INFO: renamed from: c */
    public static final void m2221c(final C0850ck c0850ck, final String str, final oa1 oa1Var, final oa1 oa1Var2, final IconButtonShape iconButtonShape, final tg9 tg9Var, final on3 on3Var, final boolean z, ye1 ye1Var, final int i) {
        int i2;
        tj3 tj3Var = (tj3) ye1Var;
        tj3Var.m22115d0(104489556);
        if ((i & 6) == 0) {
            i2 = (tj3Var.m22124i(c0850ck) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= tj3Var.m22120g(str) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= tj3Var.m22124i(oa1Var) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= tj3Var.m22124i(oa1Var2) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            i2 |= tj3Var.m22116e(iconButtonShape.ordinal()) ? 16384 : 8192;
        }
        if ((196608 & i) == 0) {
            i2 |= tj3Var.m22124i(tg9Var) ? 131072 : 65536;
        }
        if ((1572864 & i) == 0) {
            i2 |= tj3Var.m22120g(on3Var) ? 1048576 : 524288;
        }
        if ((12582912 & i) == 0) {
            i2 |= tj3Var.m22122h(z) ? 8388608 : 4194304;
        }
        if ((i2 & 4793491) == 4793490 && tj3Var.m22086D()) {
            tj3Var.m22102U();
        } else {
            on3 dn1Var = mn3.f51554a;
            on3 on3VarMo16935d = ci8.m4706S(dn1Var, iconButtonShape.m25918getDefaultSizeD9Ej5fM()).mo16935d(on3Var).mo16935d(oa1Var2 == null ? dn1Var : te1.m21996j(dn1Var, new C0850ck(iconButtonShape.getShape()), new ea1(new j1a(oa1Var2)), 2)).mo16935d(new C0836c6(tg9Var, iconButtonShape.getRipple())).mo16935d(new ur2(z));
            int cornerRadius = iconButtonShape.getCornerRadius();
            if (Build.VERSION.SDK_INT >= 31) {
                dn1Var = new dn1(new mg2(cornerRadius));
            }
            AbstractC0686a.m2485a(on3VarMo16935d.mo16935d(dn1Var), C3532re.f59146f, ci8.m4703P(841743538, new di0(oa1Var, c0850ck, str, 1), tj3Var), tj3Var, 384, 0);
        }
        x18 x18VarM22143u = tj3Var.m22143u();
        if (x18VarM22143u != null) {
            x18VarM22143u.f67642d = new zi3() { // from class: androidx.glance.appwidget.components.a
                @Override // p000.zi3
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    AbstractC0655b.m2221c(c0850ck, str, oa1Var, oa1Var2, iconButtonShape, tg9Var, on3Var, z, (ye1) obj, pk9.m19383z(i | 1));
                    return xfa.f68157a;
                }
            };
        }
    }

    /* JADX INFO: renamed from: d */
    public static final void m2222d(final String str, final tg9 tg9Var, final on3 on3Var, final boolean z, final zz3 zz3Var, final oa1 oa1Var, final int i, final oa1 oa1Var2, final int i2, ye1 ye1Var, final int i3) {
        int i4;
        tj3 tj3Var = (tj3) ye1Var;
        tj3Var.m22115d0(1704543196);
        if ((i3 & 6) == 0) {
            i4 = (tj3Var.m22120g(str) ? 4 : 2) | i3;
        } else {
            i4 = i3;
        }
        if ((i3 & 48) == 0) {
            i4 |= tj3Var.m22124i(tg9Var) ? 32 : 16;
        }
        if ((i3 & 384) == 0) {
            i4 |= tj3Var.m22120g(on3Var) ? 256 : 128;
        }
        if ((i3 & 3072) == 0) {
            i4 |= tj3Var.m22122h(z) ? 2048 : 1024;
        }
        if ((i3 & 24576) == 0) {
            i4 |= tj3Var.m22124i(zz3Var) ? 16384 : 8192;
        }
        if ((196608 & i3) == 0) {
            i4 |= tj3Var.m22124i(oa1Var) ? 131072 : 65536;
        }
        if ((1572864 & i3) == 0) {
            i4 |= tj3Var.m22116e(i) ? 1048576 : 524288;
        }
        if ((12582912 & i3) == 0) {
            i4 |= tj3Var.m22124i(oa1Var2) ? 8388608 : 4194304;
        }
        if ((100663296 & i3) == 0) {
            i4 |= tj3Var.m22116e(i2) ? 67108864 : 33554432;
        }
        if ((i4 & 38347923) == 38347922 && tj3Var.m22086D()) {
            tj3Var.m22102U();
        } else {
            float f = zz3Var != null ? 24.0f : 16.0f;
            C0282a c0282aM4703P = ci8.m4703P(-127672093, new C3504qn(str, i2, 1, oa1Var), tj3Var);
            on3 on3VarMo16935d = te1.m21996j(wfb.m23930y(on3Var, 16.0f, 10.0f, f, 10.0f), new C0850ck(i), new ea1(new j1a(oa1Var2)), 2).mo16935d(new ur2(z));
            int i5 = Build.VERSION.SDK_INT;
            AbstractC0686a.m2485a(on3VarMo16935d.mo16935d(new C0836c6(tg9Var, i5 >= 31 ? 0 : R$drawable.glance_component_m3_button_ripple)).mo16935d(i5 >= 31 ? new dn1(new mg2(R$dimen.glance_component_button_corners)) : mn3.f51554a), C3532re.f59146f, ci8.m4703P(180493370, new di0(oa1Var, zz3Var, c0282aM4703P), tj3Var), tj3Var, 384, 0);
        }
        x18 x18VarM22143u = tj3Var.m22143u();
        if (x18VarM22143u != null) {
            x18VarM22143u.f67642d = new zi3() { // from class: hk0
                @Override // p000.zi3
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    AbstractC0655b.m2222d(str, tg9Var, on3Var, z, zz3Var, oa1Var, i, oa1Var2, i2, (ye1) obj, pk9.m19383z(i3 | 1));
                    return xfa.f68157a;
                }
            };
        }
    }
}
