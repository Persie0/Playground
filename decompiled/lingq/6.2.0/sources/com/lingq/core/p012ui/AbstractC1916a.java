package com.lingq.core.p012ui;

import androidx.compose.material3.AbstractC0226d0;
import androidx.compose.p002ui.AbstractC0287b;
import androidx.compose.p002ui.node.C0352b;
import androidx.compose.runtime.AbstractC0278f;
import java.util.List;
import p000.C2956e9;
import p000.C3661uu;
import p000.as4;
import p000.d32;
import p000.e16;
import p000.fa9;
import p000.fe9;
import p000.ge9;
import p000.gm5;
import p000.h41;
import p000.l77;
import p000.la9;
import p000.lw9;
import p000.nj0;
import p000.oha;
import p000.p84;
import p000.qc9;
import p000.qj8;
import p000.se1;
import p000.sj8;
import p000.tj3;
import p000.u91;
import p000.ui3;
import p000.vi3;
import p000.vp0;
import p000.we1;
import p000.x18;
import p000.ye1;
import p000.zi3;

/* JADX INFO: renamed from: com.lingq.core.ui.a */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC1916a {
    /* JADX INFO: renamed from: a */
    public static final void m8794a(e16 e16Var, int i, List list, vi3 vi3Var, ye1 ye1Var, int i2) {
        list.getClass();
        vi3Var.getClass();
        tj3 tj3Var = (tj3) ye1Var;
        tj3Var.m22115d0(-1457405128);
        int i3 = i2 | (tj3Var.m22116e(i) ? 32 : 16) | (tj3Var.m22124i(list) ? 256 : 128) | (tj3Var.m22124i(vi3Var) ? 2048 : 1024);
        if (tj3Var.m22099R(i3 & 1, (i3 & 1171) != 1170)) {
            int size = list.size();
            int i4 = size - 1;
            Object objM22097O = tj3Var.m22097O();
            p84 p84Var = we1.f66679a;
            if (objM22097O == p84Var) {
                objM22097O = AbstractC0278f.m1256f(0.0f);
                tj3Var.m22131l0(objM22097O);
            }
            qc9 qc9Var = (qc9) objM22097O;
            Integer numValueOf = Integer.valueOf(i);
            boolean zM22124i = ((i3 & 112) == 32) | tj3Var.m22124i(list);
            Object objM22097O2 = tj3Var.m22097O();
            if (zM22124i || objM22097O2 == p84Var) {
                objM22097O2 = new FontSizeSelectorKt$FontSizeSelector$1$1(list, i, qc9Var, null);
                tj3Var.m22131l0(objM22097O2);
            }
            d32.m10047k(tj3Var, (zi3) objM22097O2, numValueOf);
            sj8 sj8VarM20003a = qj8.m20003a(new C3661uu(((fe9) tj3Var.m22128k(ge9.f40637a)).f38955d, true, new gm5(28)), nj0.f52789H, tj3Var, 48);
            int iHashCode = Long.hashCode(tj3Var.f62385T);
            l77 l77VarM22132m = tj3Var.m22132m();
            e16 e16VarM1322c = AbstractC0287b.m1322c(tj3Var, e16Var);
            se1.f60731q.getClass();
            ui3 ui3Var = C0352b.f4299b;
            tj3Var.m22119f0();
            if (tj3Var.f62384S) {
                tj3Var.m22130l(ui3Var);
            } else {
                tj3Var.m22137o0();
            }
            oha.m18001g(tj3Var, C0352b.f4303f, sj8VarM20003a);
            oha.m18001g(tj3Var, C0352b.f4302e, l77VarM22132m);
            oha.m18001g(tj3Var, C0352b.f4304g, Integer.valueOf(iHashCode));
            oha.m18000f(tj3Var, C0352b.f4305h);
            oha.m18001g(tj3Var, C0352b.f4301d, e16VarM1322c);
            lw9.m16554b("A", null, 0L, null, d32.m10018P(((Number) u91.m22589G0(list)).intValue()), null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, tj3Var, 6, 0, 262126);
            as4 as4Var = new as4(1.0f, true);
            float fM19861h = qc9Var.m19861h();
            h41 h41Var = new h41(0.0f, i4);
            int i5 = size - 2;
            la9 la9Var = la9.f49371a;
            fa9 fa9VarM16040g = la9.m16040g(0L, la9.m16039f(tj3Var).f38728d, la9.m16039f(tj3Var).f38729e, 0L, tj3Var, 1017);
            boolean zM22124i2 = ((i3 & 7168) == 2048) | tj3Var.m22124i(list) | tj3Var.m22116e(i4);
            Object objM22097O3 = tj3Var.m22097O();
            if (zM22124i2 || objM22097O3 == p84Var) {
                vp0 vp0Var = new vp0(i4, 2, vi3Var, list, qc9Var);
                tj3Var.m22131l0(vp0Var);
                objM22097O3 = vp0Var;
            }
            AbstractC0226d0.m1132c(fM19861h, (vi3) objM22097O3, as4Var, false, h41Var, i5, null, fa9VarM16040g, null, tj3Var, 0, 328);
            lw9.m16554b("A", null, 0L, null, d32.m10018P(((Number) u91.m22597O0(list)).intValue()), null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, tj3Var, 6, 0, 262126);
            tj3Var = tj3Var;
            tj3Var.m22139q(true);
        } else {
            tj3Var.m22102U();
        }
        x18 x18VarM22143u = tj3Var.m22143u();
        if (x18VarM22143u != null) {
            x18VarM22143u.f67642d = new C2956e9(e16Var, i, list, vi3Var, i2);
        }
    }
}
