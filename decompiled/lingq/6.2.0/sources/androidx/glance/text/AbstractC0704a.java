package androidx.glance.text;

import androidx.glance.GlanceNodeKt$GlanceNode$$inlined$ComposeNode$1;
import kotlin.jvm.internal.FunctionReference;
import p000.AbstractC3393o1;
import p000.C3472pt;
import p000.fa4;
import p000.jw9;
import p000.mn3;
import p000.oha;
import p000.on3;
import p000.pk9;
import p000.pr2;
import p000.tj3;
import p000.ui3;
import p000.ux9;
import p000.we1;
import p000.x18;
import p000.ye1;

/* JADX INFO: renamed from: androidx.glance.text.a */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0704a {
    /* JADX INFO: renamed from: a */
    public static final void m2506a(String str, on3 on3Var, ux9 ux9Var, int i, ye1 ye1Var, int i2, int i3) {
        int i4;
        tj3 tj3Var = (tj3) ye1Var;
        tj3Var.m22115d0(-192911377);
        int i5 = (tj3Var.m22120g(str) ? 4 : 2) | i2;
        int i6 = i3 & 2;
        if (i6 != 0) {
            i4 = i5 | 48;
        } else {
            i4 = i5 | (tj3Var.m22120g(on3Var) ? 32 : 16);
        }
        int i7 = i4 | (tj3Var.m22120g(ux9Var) ? 256 : 128);
        int i8 = i3 & 8;
        if (i8 != 0) {
            i7 |= 3072;
        } else if ((i2 & 3072) == 0) {
            i7 |= tj3Var.m22116e(i) ? 2048 : 1024;
        }
        if ((i7 & 1171) == 1170 && tj3Var.m22086D()) {
            tj3Var.m22102U();
        } else {
            tj3Var.m22104W();
            if ((i2 & 1) == 0 || tj3Var.m22084B()) {
                if (i6 != 0) {
                    on3Var = mn3.f51554a;
                }
                if (i8 != 0) {
                    i = Integer.MAX_VALUE;
                }
            } else {
                tj3Var.m22102U();
            }
            tj3Var.m22140r();
            tj3Var.m22113c0(1849434622);
            Object objM22097O = tj3Var.m22097O();
            if (objM22097O == we1.f66679a) {
                objM22097O = TextKt$Text$1$1.f6308i;
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
            oha.m18001g(tj3Var, new jw9(0), str);
            oha.m18001g(tj3Var, new jw9(1), on3Var);
            oha.m18001g(tj3Var, new jw9(2), ux9Var);
            jw9 jw9Var = new jw9(3);
            if (tj3Var.f62384S || !fa4.m11650l(tj3Var.m22097O(), Integer.valueOf(i))) {
                tj3Var.m22131l0(Integer.valueOf(i));
                tj3Var.m22110b(Integer.valueOf(i), jw9Var);
            }
            AbstractC3393o1.m17723A(tj3Var, true, false, false);
        }
        on3 on3Var2 = on3Var;
        int i9 = i;
        x18 x18VarM22143u = tj3Var.m22143u();
        if (x18VarM22143u != null) {
            x18VarM22143u.f67642d = new pr2(str, on3Var2, ux9Var, i9, i2, i3);
        }
    }
}
