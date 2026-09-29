package com.lingq.feature.edit.components;

import androidx.compose.p002ui.focus.InterfaceC0300b;
import androidx.compose.p002ui.platform.AbstractC0402n;
import androidx.compose.runtime.AbstractC0278f;
import androidx.compose.runtime.internal.C0282a;
import p000.C3441oz;
import p000.C3592sz;
import p000.b16;
import p000.bna;
import p000.c99;
import p000.ci8;
import p000.d32;
import p000.e16;
import p000.gj4;
import p000.hj4;
import p000.ix0;
import p000.lda;
import p000.p84;
import p000.rb0;
import p000.sx7;
import p000.t66;
import p000.tj3;
import p000.ui3;
import p000.vi3;
import p000.vv9;
import p000.we1;
import p000.x18;
import p000.ye1;
import p000.zi3;

/* JADX INFO: renamed from: com.lingq.feature.edit.components.b */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC2079b {
    /* JADX INFO: renamed from: a */
    public static final void m8993a(String str, vi3 vi3Var, e16 e16Var, String str2, ui3 ui3Var, ye1 ye1Var, int i, int i2) {
        String str3;
        int i3;
        ui3 ui3Var2;
        int i4;
        tj3 tj3Var;
        String str4;
        ui3 ui3Var3;
        e16 e16Var2;
        C0282a c0282aM4703P;
        str.getClass();
        vi3Var.getClass();
        tj3 tj3Var2 = (tj3) ye1Var;
        tj3Var2.m22115d0(-47835358);
        int i5 = i | (tj3Var2.m22120g(str) ? 4 : 2) | (tj3Var2.m22124i(vi3Var) ? 32 : 16);
        int i6 = i5 | 384;
        int i7 = i2 & 8;
        if (i7 != 0) {
            i3 = i5 | 3456;
            str3 = str2;
        } else {
            str3 = str2;
            i3 = i6 | (tj3Var2.m22120g(str3) ? 2048 : 1024);
        }
        int i8 = i3 | 24576;
        int i9 = i2 & 32;
        if (i9 != 0) {
            i4 = i3 | 221184;
            ui3Var2 = ui3Var;
        } else {
            ui3Var2 = ui3Var;
            i4 = i8 | (tj3Var2.m22124i(ui3Var2) ? 131072 : 65536);
        }
        if (tj3Var2.m22099R(i4 & 1, (74899 & i4) != 74898)) {
            if (i7 != 0) {
                str3 = null;
            }
            if (i9 != 0) {
                ui3Var2 = null;
            }
            Object objM22097O = tj3Var2.m22097O();
            p84 p84Var = we1.f66679a;
            if (objM22097O == p84Var) {
                objM22097O = AbstractC0278f.m1260j(Boolean.FALSE);
                tj3Var2.m22131l0(objM22097O);
            }
            t66 t66Var = (t66) objM22097O;
            Object objM22097O2 = tj3Var2.m22097O();
            if (objM22097O2 == p84Var) {
                objM22097O2 = AbstractC0278f.m1260j(new vv9(str, 6, 0L));
                tj3Var2.m22131l0(objM22097O2);
            }
            t66 t66Var2 = (t66) objM22097O2;
            boolean z = (i4 & 14) == 4;
            Object objM22097O3 = tj3Var2.m22097O();
            if (z || objM22097O3 == p84Var) {
                objM22097O3 = new SentenceEditTextFieldKt$SentenceEditTextField$1$1(str, t66Var, t66Var2, null);
                tj3Var2.m22131l0(objM22097O3);
            }
            d32.m10047k(tj3Var2, (zi3) objM22097O3, str);
            InterfaceC0300b interfaceC0300b = (InterfaceC0300b) tj3Var2.m22128k(AbstractC0402n.f4817i);
            vv9 vv9Var = (vv9) t66Var2.getValue();
            b16 b16Var = b16.f7762a;
            e16 e16VarM4412e = c99.m4412e(b16Var, 1.0f);
            boolean z2 = (i4 & 458752) == 131072;
            Object objM22097O4 = tj3Var2.m22097O();
            if (z2 || objM22097O4 == p84Var) {
                objM22097O4 = new sx7(22, ui3Var2, t66Var);
                tj3Var2.m22131l0(objM22097O4);
            }
            e16 e16VarM16108H = lda.m16108H(e16VarM4412e, (vi3) objM22097O4);
            if (str3 == null) {
                tj3Var2.m22111b0(866981739);
                tj3Var2.m22139q(false);
                c0282aM4703P = null;
            } else {
                tj3Var2.m22111b0(866981740);
                c0282aM4703P = ci8.m4703P(1269308088, new C3441oz(str3, 27), tj3Var2);
                tj3Var2.m22139q(false);
            }
            String str5 = str3;
            hj4 hj4Var = new hj4(0, 7, null, 119);
            boolean zM22124i = tj3Var2.m22124i(interfaceC0300b);
            Object objM22097O5 = tj3Var2.m22097O();
            if (zM22124i || objM22097O5 == p84Var) {
                objM22097O5 = new C3592sz(interfaceC0300b, 2);
                tj3Var2.m22131l0(objM22097O5);
            }
            gj4 gj4Var = new gj4((vi3) objM22097O5, null, 62);
            boolean z3 = (i4 & 112) == 32;
            Object objM22097O6 = tj3Var2.m22097O();
            if (z3 || objM22097O6 == p84Var) {
                objM22097O6 = new ix0(vi3Var, t66Var2, 16);
                tj3Var2.m22131l0(objM22097O6);
            }
            tj3Var = tj3Var2;
            bna.m3940b(vv9Var, (vi3) objM22097O6, e16VarM16108H, false, null, c0282aM4703P, null, null, null, hj4Var, gj4Var, false, 0, 0, null, null, tj3Var, 0, 12779520, 8159160);
            str4 = str5;
            ui3Var3 = ui3Var2;
            e16Var2 = b16Var;
        } else {
            tj3Var = tj3Var2;
            tj3Var.m22102U();
            str4 = str3;
            ui3Var3 = ui3Var2;
            e16Var2 = e16Var;
        }
        x18 x18VarM22143u = tj3Var.m22143u();
        if (x18VarM22143u != null) {
            x18VarM22143u.f67642d = new rb0(str, vi3Var, e16Var2, str4, ui3Var3, i, i2);
        }
    }
}
