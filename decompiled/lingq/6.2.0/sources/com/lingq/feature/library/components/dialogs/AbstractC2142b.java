package com.lingq.feature.library.components.dialogs;

import androidx.compose.material3.AbstractC0231g;
import androidx.compose.material3.C0269z;
import com.lingq.core.domain.model.notification.Notice;
import java.util.List;
import p000.ci8;
import p000.d32;
import p000.hn0;
import p000.p84;
import p000.rb0;
import p000.tj3;
import p000.ui3;
import p000.un1;
import p000.vi3;
import p000.we1;
import p000.x18;
import p000.ye1;
import p000.zi3;

/* JADX INFO: renamed from: com.lingq.feature.library.components.dialogs.b */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC2142b {
    /* JADX INFO: renamed from: a */
    public static final void m9056a(Notice notice, List list, vi3 vi3Var, ui3 ui3Var, ui3 ui3Var2, ye1 ye1Var, int i) {
        tj3 tj3Var;
        notice.getClass();
        list.getClass();
        vi3Var.getClass();
        ui3Var.getClass();
        ui3Var2.getClass();
        tj3 tj3Var2 = (tj3) ye1Var;
        tj3Var2.m22115d0(346592023);
        int i2 = (tj3Var2.m22124i(notice) ? 4 : 2) | i;
        if ((i & 48) == 0) {
            i2 |= tj3Var2.m22124i(list) ? 32 : 16;
        }
        if ((i & 3072) == 0) {
            i2 |= tj3Var2.m22124i(vi3Var) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            i2 |= tj3Var2.m22124i(ui3Var) ? 16384 : 8192;
        }
        if ((196608 & i) == 0) {
            i2 |= tj3Var2.m22124i(ui3Var2) ? 131072 : 65536;
        }
        int i3 = i2;
        if (tj3Var2.m22099R(i3 & 1, (74899 & i3) != 74898)) {
            C0269z c0269zM1154g = AbstractC0231g.m1154g(false, tj3Var2, 0, 3);
            Object objM22097O = tj3Var2.m22097O();
            p84 p84Var = we1.f66679a;
            if (objM22097O == p84Var) {
                objM22097O = d32.m10013K(tj3Var2);
                tj3Var2.m22131l0(objM22097O);
            }
            un1 un1Var = (un1) objM22097O;
            Boolean bool = Boolean.TRUE;
            boolean zM22124i = tj3Var2.m22124i(notice) | ((i3 & 7168) == 2048);
            Object objM22097O2 = tj3Var2.m22097O();
            if (zM22124i || objM22097O2 == p84Var) {
                objM22097O2 = new MonthlyChallengeBottomSheetKt$MonthlyChallengeBottomSheet$1$1(vi3Var, notice, null);
                tj3Var2.m22131l0(objM22097O2);
            }
            d32.m10047k(tj3Var2, (zi3) objM22097O2, bool);
            tj3Var2.m22111b0(222020942);
            AbstractC0231g.m1150c(ui3Var, null, c0269zM1154g, 0.0f, false, null, 0L, 0L, 0L, null, null, null, ci8.m4703P(1620021904, new hn0(notice, un1Var, c0269zM1154g, ui3Var2, list, 9), tj3Var2), tj3Var2, (i3 >> 12) & 14, 3072, 8186);
            tj3Var = tj3Var2;
            tj3Var.m22139q(false);
        } else {
            tj3Var = tj3Var2;
            tj3Var.m22102U();
        }
        x18 x18VarM22143u = tj3Var.m22143u();
        if (x18VarM22143u != null) {
            x18VarM22143u.f67642d = new rb0(notice, list, vi3Var, ui3Var, ui3Var2, i, 4);
        }
    }
}
