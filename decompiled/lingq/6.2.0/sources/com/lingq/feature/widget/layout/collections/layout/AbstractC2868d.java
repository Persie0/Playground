package com.lingq.feature.widget.layout.collections.layout;

import androidx.compose.runtime.internal.C0282a;
import androidx.glance.text.AbstractC0704a;
import java.util.ArrayList;
import p000.C0850ck;
import p000.ac3;
import p000.bk2;
import p000.bs0;
import p000.ci8;
import p000.d32;
import p000.dz1;
import p000.ea4;
import p000.f70;
import p000.h04;
import p000.i04;
import p000.iyc;
import p000.j04;
import p000.k04;
import p000.l04;
import p000.l70;
import p000.lyc;
import p000.m04;
import p000.m70;
import p000.mn3;
import p000.on3;
import p000.pk9;
import p000.rw1;
import p000.tg9;
import p000.tj3;
import p000.ty0;
import p000.ux5;
import p000.ux9;
import p000.vh9;
import p000.vn2;
import p000.wfb;
import p000.x18;
import p000.xfa;
import p000.xj2;
import p000.ye1;
import p000.yf1;
import p000.zi3;
import p000.zj8;
import p000.zx9;

/* JADX INFO: renamed from: com.lingq.feature.widget.layout.collections.layout.d */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC2868d {
    /* JADX INFO: renamed from: a */
    public static final void m9780a(ArrayList arrayList, ye1 ye1Var, int i) {
        tj3 tj3Var = (tj3) ye1Var;
        tj3Var.m22115d0(1918720988);
        int i2 = (tj3Var.m22124i(arrayList) ? 4 : 2) | i;
        int i3 = 1;
        if (tj3Var.m22099R(i2 & 1, (i2 & 3) != 2)) {
            ImageTextListLayoutSize.Companion.getClass();
            float fM3806b = bk2.m3806b(((bk2) tj3Var.m22128k(yf1.f69762a)).f8632a);
            boolean z = (xj2.m24559a(fM3806b, 479.0f) <= 0 && xj2.m24559a(fM3806b, 340.0f) >= 0) || xj2.m24559a(fM3806b, 620.0f) > 0;
            int i4 = AbstractC2867c.f33841a[C2869e.m9785a(tj3Var).ordinal()];
            if (i4 == 1) {
                tj3Var.m22111b0(-1102584602);
                m9784e(arrayList, false, z, tj3Var, (i2 & 14) | 48);
                tj3Var.m22139q(false);
            } else if (i4 == 2) {
                tj3Var.m22111b0(-1102374329);
                m9784e(arrayList, true, z, tj3Var, (i2 & 14) | 48);
                tj3Var.m22139q(false);
            } else {
                if (i4 != 3) {
                    throw ux5.m23001x(tj3Var, 1349904457, false);
                }
                tj3Var.m22111b0(-1102166009);
                m9782c(arrayList, z, tj3Var, (i2 & 14) | 48);
                tj3Var.m22139q(false);
            }
        } else {
            tj3Var.m22102U();
        }
        x18 x18VarM22143u = tj3Var.m22143u();
        if (x18VarM22143u != null) {
            x18VarM22143u.f67642d = new i04(arrayList, i, i3);
        }
    }

    /* JADX INFO: renamed from: b */
    public static final void m9781b(final h04 h04Var, boolean z, boolean z2, zj8 zj8Var, on3 on3Var, ye1 ye1Var, int i) {
        int i2;
        C0282a c0282a;
        tj3 tj3Var = (tj3) ye1Var;
        tj3Var.m22115d0(1741373998);
        if ((i & 6) == 0) {
            i2 = (tj3Var.m22124i(h04Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= tj3Var.m22122h(z) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= tj3Var.m22122h(z2) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= tj3Var.m22124i(zj8Var) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            i2 |= tj3Var.m22120g(on3Var) ? 16384 : 8192;
        }
        if (tj3Var.m22099R(i2 & 1, (i2 & 9363) != 9362)) {
            on3 on3VarMo16935d = l70.m15951n(wfb.m23928w(on3Var, 12.0f), 16.0f).mo16935d(new m70(((vn2) tj3Var.m22128k(yf1.f69766e)).f65638g));
            C0282a c0282aM4703P = null;
            if (z) {
                tj3Var.m22111b0(-1634854425);
                C0282a c0282aM4703P2 = ci8.m4703P(-1692019085, new rw1(13, h04Var, on3Var), tj3Var);
                tj3Var.m22139q(false);
                c0282a = c0282aM4703P2;
            } else {
                tj3Var.m22111b0(-1634804360);
                tj3Var.m22139q(false);
                c0282a = null;
            }
            if (z2) {
                tj3Var.m22111b0(-1634723636);
                c0282aM4703P = ci8.m4703P(1402642998, new j04(h04Var, zj8Var), tj3Var);
                tj3Var.m22139q(false);
            } else {
                tj3Var.m22111b0(-1634679121);
                tj3Var.m22139q(false);
            }
            ea4.m10995a(ci8.m4703P(66553232, new zi3() { // from class: com.lingq.feature.widget.layout.collections.layout.a
                @Override // p000.zi3
                public final Object invoke(Object obj, Object obj2) {
                    ye1 ye1Var2 = (ye1) obj;
                    int iIntValue = ((Integer) obj2).intValue();
                    tj3 tj3Var2 = (tj3) ye1Var2;
                    if (tj3Var2.m22099R(iIntValue & 1, (iIntValue & 3) != 2)) {
                        String str = h04Var.f41606b;
                        ImageTextListLayoutSize.Companion.getClass();
                        AbstractC0704a.m2506a(str, null, new ux9(((vn2) tj3Var2.m22128k(yf1.f69766e)).f65651t, new zx9(C2869e.m9785a(tj3Var2) == ImageTextListLayoutSize.Small ? d32.m10018P(14) : d32.m10018P(16)), new ac3(500), 120), 2, tj3Var2, 3072, 2);
                    } else {
                        tj3Var2.m22102U();
                    }
                    return xfa.f68157a;
                }
            }, tj3Var), on3VarMo16935d, 0.0f, ci8.m4703P(797163821, new j04(h04Var), tj3Var), c0282a, c0282aM4703P, zj8Var, tj3Var, ((i2 << 9) & 3670016) | 3078);
        } else {
            tj3Var.m22102U();
        }
        x18 x18VarM22143u = tj3Var.m22143u();
        if (x18VarM22143u != null) {
            x18VarM22143u.f67642d = new k04(h04Var, z, z2, zj8Var, on3Var, i, 0);
        }
    }

    /* JADX INFO: renamed from: c */
    public static final void m9782c(ArrayList arrayList, boolean z, ye1 ye1Var, int i) {
        ArrayList arrayList2;
        tj3 tj3Var = (tj3) ye1Var;
        tj3Var.m22115d0(636082086);
        int i2 = 2;
        int i3 = (tj3Var.m22124i(arrayList) ? 4 : 2) | i | (tj3Var.m22122h(z) ? 256 : 128);
        int i4 = 0;
        if (tj3Var.m22099R(i3 & 1, (i3 & 147) != 146)) {
            arrayList2 = arrayList;
            lyc.m16573a(arrayList2, ci8.m4703P(1848174912, new l04(i4, z), tj3Var), ci8.m4734s(mn3.f51554a), 4.0f, tj3Var, ((i3 << 3) & 112) | 196998);
        } else {
            arrayList2 = arrayList;
            tj3Var.m22102U();
        }
        x18 x18VarM22143u = tj3Var.m22143u();
        if (x18VarM22143u != null) {
            x18VarM22143u.f67642d = new f70(arrayList2, z, i, i2);
        }
    }

    /* JADX INFO: renamed from: d */
    public static final void m9783d(final String str, final int i, final int i2, final tg9 tg9Var, ArrayList arrayList, ye1 ye1Var, int i3) {
        str.getClass();
        tj3 tj3Var = (tj3) ye1Var;
        tj3Var.m22115d0(-570285591);
        int i4 = i3 | (tj3Var.m22120g(str) ? 4 : 2) | (tj3Var.m22116e(i) ? 32 : 16) | (tj3Var.m22116e(i2) ? 256 : 128) | (tj3Var.m22124i(tg9Var) ? 16384 : 8192) | (tj3Var.m22124i(arrayList) ? 131072 : 65536);
        if (tj3Var.m22099R(i4 & 1, (74899 & i4) != 74898)) {
            tj3Var.m22104W();
            if ((i3 & 1) != 0 && !tj3Var.m22084B()) {
                tj3Var.m22102U();
            }
            tj3Var.m22140r();
            ImageTextListLayoutSize.Companion.getClass();
            final ImageTextListLayoutSize imageTextListLayoutSizeM9785a = C2869e.m9785a(tj3Var);
            vh9 vh9Var = yf1.f69762a;
            float f = xj2.m24559a(bk2.m3805a(((bk2) tj3Var.m22128k(vh9Var)).f8632a), 180.0f) >= 0 ? 0.0f : 12.0f;
            d32.m10063w(wfb.m23931z(mn3.f51554a, f, 5), xj2.m24559a(bk2.m3805a(((bk2) tj3Var.m22128k(vh9Var)).f8632a), 180.0f) >= 0 ? new C0282a(-1417493026, true, new zi3() { // from class: com.lingq.feature.widget.layout.collections.layout.b
                @Override // p000.zi3
                public final Object invoke(Object obj, Object obj2) {
                    ye1 ye1Var2 = (ye1) obj;
                    int iIntValue = ((Integer) obj2).intValue();
                    tj3 tj3Var2 = (tj3) ye1Var2;
                    if (tj3Var2.m22099R(iIntValue & 1, (iIntValue & 3) != 2)) {
                        C0850ck c0850ck = new C0850ck(i);
                        String str2 = imageTextListLayoutSizeM9785a != ImageTextListLayoutSize.Small ? str : null;
                        if (str2 == null) {
                            str2 = "";
                        }
                        String str3 = str2;
                        vh9 vh9Var2 = yf1.f69766e;
                        pk9.m19367b(c0850ck, str3, ((vn2) tj3Var2.m22128k(vh9Var2)).f65632a, ((vn2) tj3Var2.m22128k(vh9Var2)).f65651t, null, ci8.m4703P(1640190900, new bs0(i2, tg9Var, 2), tj3Var2), tj3Var2, 1572864);
                    } else {
                        tj3Var2.m22102U();
                    }
                    return xfa.f68157a;
                }
            }) : null, ((vn2) tj3Var.m22128k(yf1.f69766e)).f65631A, 0.0f, ci8.m4703P(1167487664, new i04(arrayList), tj3Var), tj3Var, 24576);
        } else {
            tj3Var.m22102U();
        }
        x18 x18VarM22143u = tj3Var.m22143u();
        if (x18VarM22143u != null) {
            x18VarM22143u.f67642d = new dz1(str, i, i2, tg9Var, arrayList, i3);
        }
    }

    /* JADX INFO: renamed from: e */
    public static final void m9784e(ArrayList arrayList, boolean z, boolean z2, ye1 ye1Var, int i) {
        tj3 tj3Var = (tj3) ye1Var;
        tj3Var.m22115d0(2012884302);
        int i2 = (tj3Var.m22124i(arrayList) ? 4 : 2) | i | (tj3Var.m22122h(z2) ? 256 : 128);
        int i3 = 0;
        if (tj3Var.m22099R(i2 & 1, (i2 & 147) != 146)) {
            iyc.m14210b(arrayList, ci8.m4703P(1485186785, new m04(i3, z, z2), tj3Var), ci8.m4734s(mn3.f51554a), tj3Var, (i2 & 14) | 24624);
        } else {
            tj3Var.m22102U();
        }
        x18 x18VarM22143u = tj3Var.m22143u();
        if (x18VarM22143u != null) {
            x18VarM22143u.f67642d = new ty0(arrayList, z, z2, i);
        }
    }
}
