package androidx.glance.layout;

import androidx.compose.runtime.internal.C0282a;
import androidx.glance.GlanceNodeKt$GlanceNode$$inlined$ComposeNode$1;
import kotlin.jvm.internal.FunctionReference;
import p000.C3186kj;
import p000.C3406oe;
import p000.C3472pt;
import p000.C3494qe;
import p000.C3532re;
import p000.am8;
import p000.cb1;
import p000.ln1;
import p000.mn3;
import p000.oh0;
import p000.oha;
import p000.on3;
import p000.ph0;
import p000.pk9;
import p000.tj3;
import p000.ui3;
import p000.uj8;
import p000.we1;
import p000.x18;
import p000.ye1;
import p000.za1;
import p000.zi3;

/* JADX INFO: renamed from: androidx.glance.layout.a */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0686a {
    /* JADX INFO: renamed from: a */
    public static final void m2485a(on3 on3Var, C3532re c3532re, zi3 zi3Var, ye1 ye1Var, int i, int i2) {
        int i3;
        C3532re c3532re2;
        tj3 tj3Var = (tj3) ye1Var;
        tj3Var.m22115d0(227045628);
        int i4 = (tj3Var.m22120g(on3Var) ? 4 : 2) | i;
        int i5 = i2 & 2;
        if (i5 != 0) {
            i3 = i4 | 48;
        } else {
            i3 = i4 | (tj3Var.m22120g(c3532re) ? 32 : 16);
        }
        if ((i & 384) == 0) {
            i3 |= tj3Var.m22124i(zi3Var) ? 256 : 128;
        }
        if ((i3 & 147) == 146 && tj3Var.m22086D()) {
            tj3Var.m22102U();
            c3532re2 = c3532re;
        } else {
            C3532re c3532re3 = i5 != 0 ? C3532re.f59143c : c3532re;
            tj3Var.m22113c0(1849434622);
            Object objM22097O = tj3Var.m22097O();
            if (objM22097O == we1.f66679a) {
                objM22097O = BoxKt$Box$1$1.f6111i;
                tj3Var.m22131l0(objM22097O);
            }
            int i6 = 0;
            tj3Var.m22139q(false);
            ui3 ui3Var = (ui3) ((FunctionReference) objM22097O);
            tj3Var.m22113c0(-683746039);
            int i7 = (((i3 & 896) | 6) & 896) | 6;
            tj3Var.m22113c0(-548224868);
            if (!(tj3Var.f62387a instanceof C3472pt)) {
                pk9.m19377r();
                throw null;
            }
            tj3Var.m22107Z();
            if (tj3Var.f62384S) {
                tj3Var.m22130l(ui3Var);
            } else {
                tj3Var.m22137o0();
            }
            oha.m18001g(tj3Var, new oh0(i6), on3Var);
            oha.m18001g(tj3Var, new oh0(1), c3532re3);
            zi3Var.invoke(tj3Var, Integer.valueOf((i7 >> 6) & 14));
            tj3Var.m22139q(true);
            tj3Var.m22139q(false);
            tj3Var.m22139q(false);
            c3532re2 = c3532re3;
        }
        x18 x18VarM22143u = tj3Var.m22143u();
        if (x18VarM22143u != null) {
            x18VarM22143u.f67642d = new ph0(on3Var, c3532re2, zi3Var, i, i2);
        }
    }

    /* JADX INFO: renamed from: b */
    public static final void m2486b(on3 on3Var, int i, int i2, C0282a c0282a, ye1 ye1Var, int i3, int i4) {
        int i5;
        int i6;
        tj3 tj3Var = (tj3) ye1Var;
        tj3Var.m22115d0(-474572032);
        int i7 = 2;
        int i8 = 4;
        int i9 = (tj3Var.m22120g(on3Var) ? 4 : 2) | i3;
        int i10 = i4 & 2;
        if (i10 != 0) {
            i5 = i9 | 48;
        } else {
            i5 = i9 | (tj3Var.m22116e(i) ? 32 : 16);
        }
        int i11 = i4 & 4;
        if (i11 != 0) {
            i6 = i5 | 384;
        } else {
            i6 = i5 | (tj3Var.m22116e(i2) ? 256 : 128);
        }
        if ((i6 & 1171) == 1170 && tj3Var.m22086D()) {
            tj3Var.m22102U();
        } else {
            if (i10 != 0) {
                i = 0;
            }
            if (i11 != 0) {
                i2 = 0;
            }
            tj3Var.m22113c0(1849434622);
            Object objM22097O = tj3Var.m22097O();
            if (objM22097O == we1.f66679a) {
                objM22097O = ColumnKt$Column$1$1.f6112i;
                tj3Var.m22131l0(objM22097O);
            }
            tj3Var.m22139q(false);
            ui3 ui3Var = (ui3) ((FunctionReference) objM22097O);
            tj3Var.m22113c0(-683746039);
            tj3Var.m22113c0(-548224868);
            if (!(tj3Var.f62387a instanceof C3472pt)) {
                pk9.m19377r();
                throw null;
            }
            tj3Var.m22107Z();
            if (tj3Var.f62384S) {
                tj3Var.m22130l(ui3Var);
            } else {
                tj3Var.m22137o0();
            }
            oha.m18001g(tj3Var, new oh0(i7), on3Var);
            oha.m18001g(tj3Var, new oh0(3), new C3406oe(i2));
            oha.m18001g(tj3Var, new oh0(i8), new C3494qe(i));
            c0282a.invoke(cb1.f9823a, tj3Var, 54);
            tj3Var.m22139q(true);
            tj3Var.m22139q(false);
            tj3Var.m22139q(false);
        }
        int i12 = i;
        int i13 = i2;
        x18 x18VarM22143u = tj3Var.m22143u();
        if (x18VarM22143u != null) {
            x18VarM22143u.f67642d = new za1(on3Var, i12, i13, c0282a, i3, i4, 0);
        }
    }

    /* JADX INFO: renamed from: c */
    public static final void m2487c(on3 on3Var, int i, int i2, C0282a c0282a, ye1 ye1Var, int i3, int i4) {
        on3 on3Var2;
        int i5;
        int i6;
        int i7;
        int i8;
        int i9;
        C0282a c0282a2;
        on3 on3Var3;
        tj3 tj3Var = (tj3) ye1Var;
        tj3Var.m22115d0(-1208072102);
        int i10 = i4 & 1;
        if (i10 != 0) {
            i5 = i3 | 6;
            on3Var2 = on3Var;
        } else {
            on3Var2 = on3Var;
            i5 = i3 | (tj3Var.m22120g(on3Var2) ? 4 : 2);
        }
        int i11 = i4 & 2;
        if (i11 != 0) {
            i7 = i5 | 48;
            i6 = i;
        } else {
            i6 = i;
            i7 = i5 | (tj3Var.m22116e(i6) ? 32 : 16);
        }
        int i12 = i4 & 4;
        if (i12 != 0) {
            i9 = i7 | 384;
            i8 = i2;
        } else {
            i8 = i2;
            i9 = i7 | (tj3Var.m22116e(i8) ? 256 : 128);
        }
        if ((i9 & 1171) == 1170 && tj3Var.m22086D()) {
            tj3Var.m22102U();
            c0282a2 = c0282a;
            on3Var3 = on3Var2;
        } else {
            on3 on3Var4 = i10 != 0 ? mn3.f51554a : on3Var2;
            if (i11 != 0) {
                i6 = 0;
            }
            if (i12 != 0) {
                i8 = 0;
            }
            tj3Var.m22113c0(1849434622);
            Object objM22097O = tj3Var.m22097O();
            if (objM22097O == we1.f66679a) {
                objM22097O = RowKt$Row$1$1.f6113i;
                tj3Var.m22131l0(objM22097O);
            }
            tj3Var.m22139q(false);
            ui3 ui3Var = (ui3) ((FunctionReference) objM22097O);
            tj3Var.m22113c0(-683746039);
            tj3Var.m22113c0(-548224868);
            if (!(tj3Var.f62387a instanceof C3472pt)) {
                pk9.m19377r();
                throw null;
            }
            tj3Var.m22107Z();
            if (tj3Var.f62384S) {
                tj3Var.m22130l(ui3Var);
            } else {
                tj3Var.m22137o0();
            }
            oha.m18001g(tj3Var, new ln1(17), on3Var4);
            oha.m18001g(tj3Var, new ln1(18), new C3494qe(i8));
            oha.m18001g(tj3Var, new ln1(19), new C3406oe(i6));
            c0282a2 = c0282a;
            c0282a2.invoke(uj8.f63991a, tj3Var, 54);
            tj3Var.m22139q(true);
            tj3Var.m22139q(false);
            tj3Var.m22139q(false);
            on3Var3 = on3Var4;
        }
        int i13 = i6;
        int i14 = i8;
        x18 x18VarM22143u = tj3Var.m22143u();
        if (x18VarM22143u != null) {
            x18VarM22143u.f67642d = new za1(on3Var3, i13, i14, c0282a2, i3, i4, 1);
        }
    }

    /* JADX INFO: renamed from: d */
    public static final void m2488d(on3 on3Var, ye1 ye1Var, int i) {
        tj3 tj3Var = (tj3) ye1Var;
        tj3Var.m22115d0(1380468206);
        if ((((tj3Var.m22120g(on3Var) ? 4 : 2) | i) & 3) == 2 && tj3Var.m22086D()) {
            tj3Var.m22102U();
        } else {
            tj3Var.m22113c0(1849434622);
            Object objM22097O = tj3Var.m22097O();
            if (objM22097O == we1.f66679a) {
                objM22097O = SpacerKt$Spacer$1$1.f6114i;
                tj3Var.m22131l0(objM22097O);
            }
            tj3Var.m22139q(false);
            ui3 ui3Var = (ui3) ((FunctionReference) objM22097O);
            tj3Var.m22113c0(-1115894518);
            tj3Var.m22113c0(1886828752);
            if (!(tj3Var.f62387a instanceof C3472pt)) {
                pk9.m19377r();
                throw null;
            }
            tj3Var.m22107Z();
            if (tj3Var.f62384S) {
                tj3Var.m22130l(new GlanceNodeKt$GlanceNode$$inlined$ComposeNode$1(ui3Var));
            } else {
                tj3Var.m22137o0();
            }
            oha.m18001g(tj3Var, new am8(27), on3Var);
            tj3Var.m22139q(true);
            tj3Var.m22139q(false);
            tj3Var.m22139q(false);
        }
        x18 x18VarM22143u = tj3Var.m22143u();
        if (x18VarM22143u != null) {
            x18VarM22143u.f67642d = new C3186kj(on3Var, i, 22);
        }
    }
}
