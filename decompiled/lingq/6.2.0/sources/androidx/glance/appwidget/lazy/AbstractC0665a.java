package androidx.glance.appwidget.lazy;

import androidx.compose.runtime.internal.C0282a;
import java.util.ArrayList;
import kotlin.jvm.internal.FunctionReference;
import p000.AbstractC3393o1;
import p000.C3406oe;
import p000.C3472pt;
import p000.C3532re;
import p000.C3836zk;
import p000.bv4;
import p000.ev4;
import p000.je1;
import p000.mn3;
import p000.mw4;
import p000.oha;
import p000.on3;
import p000.pk9;
import p000.rw1;
import p000.tj3;
import p000.ui3;
import p000.vi3;
import p000.we1;
import p000.x18;
import p000.xp3;
import p000.ye1;
import p000.yu4;
import p000.zu4;

/* JADX INFO: renamed from: androidx.glance.appwidget.lazy.a */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC0665a {
    /* JADX INFO: renamed from: a */
    public static final void m2256a(on3 on3Var, vi3 vi3Var, ye1 ye1Var, int i) {
        tj3 tj3Var = (tj3) ye1Var;
        tj3Var.m22115d0(1060451148);
        if (((i | 6 | (tj3Var.m22116e(0) ? 32 : 16) | (tj3Var.m22124i(vi3Var) ? 256 : 128)) & 147) == 146 && tj3Var.m22086D()) {
            tj3Var.m22102U();
        } else {
            tj3Var.m22104W();
            if ((i & 1) == 0 || tj3Var.m22084B()) {
                on3Var = mn3.f51554a;
            } else {
                tj3Var.m22102U();
            }
            tj3Var.m22140r();
            Object objM22097O = tj3Var.m22097O();
            if (objM22097O == we1.f66679a) {
                objM22097O = LazyListKt$LazyColumn$1$1.f6030i;
                tj3Var.m22131l0(objM22097O);
            }
            ui3 ui3Var = (ui3) ((FunctionReference) objM22097O);
            C3532re c3532re = new C3532re(0, 1);
            ArrayList arrayList = new ArrayList();
            vi3Var.invoke(new ev4(arrayList));
            C0282a c0282a = new C0282a(-1119459778, true, new zu4(arrayList, c3532re, 0));
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
            oha.m18001g(tj3Var, new je1(29), on3Var);
            oha.m18001g(tj3Var, new yu4(0), new C3406oe(0));
            c0282a.invoke(tj3Var, 0);
            AbstractC3393o1.m17723A(tj3Var, true, false, false);
        }
        x18 x18VarM22143u = tj3Var.m22143u();
        if (x18VarM22143u != null) {
            x18VarM22143u.f67642d = new rw1(on3Var, i, 22, vi3Var);
        }
    }

    /* JADX INFO: renamed from: b */
    public static final void m2257b(long j, C3532re c3532re, C0282a c0282a, ye1 ye1Var, int i) {
        tj3 tj3Var = (tj3) ye1Var;
        tj3Var.m22115d0(1266032519);
        if ((((tj3Var.m22118f(j) ? 4 : 2) | i | (tj3Var.m22120g(c3532re) ? 32 : 16)) & 147) == 146 && tj3Var.m22086D()) {
            tj3Var.m22102U();
        } else {
            tj3Var.m22106Y(1181514974, Long.valueOf(j));
            Object objM22097O = tj3Var.m22097O();
            if (objM22097O == we1.f66679a) {
                objM22097O = LazyListKt$LazyListItem$1$1.f6031i;
                tj3Var.m22131l0(objM22097O);
            }
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
            oha.m18001g(tj3Var, new yu4(1), Long.valueOf(j));
            oha.m18001g(tj3Var, new yu4(2), c3532re);
            c0282a.invoke(tj3Var, 6);
            tj3Var.m22139q(true);
            tj3Var.m22139q(false);
            tj3Var.m22139q(false);
            tj3Var.m22139q(false);
        }
        x18 x18VarM22143u = tj3Var.m22143u();
        if (x18VarM22143u != null) {
            x18VarM22143u.f67642d = new bv4(j, c3532re, c0282a, i, 0);
        }
    }

    /* JADX INFO: renamed from: c */
    public static final void m2258c(xp3 xp3Var, on3 on3Var, vi3 vi3Var, ye1 ye1Var, int i) {
        tj3 tj3Var = (tj3) ye1Var;
        tj3Var.m22115d0(-2047392247);
        if ((((tj3Var.m22120g(xp3Var) ? 4 : 2) | i | 48 | (tj3Var.m22116e(0) ? 256 : 128) | (tj3Var.m22124i(vi3Var) ? 2048 : 1024)) & 1171) == 1170 && tj3Var.m22086D()) {
            tj3Var.m22102U();
        } else {
            tj3Var.m22104W();
            if ((i & 1) == 0 || tj3Var.m22084B()) {
                on3Var = mn3.f51554a;
            } else {
                tj3Var.m22102U();
            }
            tj3Var.m22140r();
            Object objM22097O = tj3Var.m22097O();
            if (objM22097O == we1.f66679a) {
                objM22097O = LazyVerticalGridKt$LazyVerticalGrid$1$1.f6032i;
                tj3Var.m22131l0(objM22097O);
            }
            ui3 ui3Var = (ui3) ((FunctionReference) objM22097O);
            C3532re c3532re = new C3532re(0, 1);
            ArrayList arrayList = new ArrayList();
            vi3Var.invoke(new mw4(arrayList));
            C0282a c0282a = new C0282a(-1074214206, true, new zu4(arrayList, c3532re, 1));
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
            oha.m18001g(tj3Var, new yu4(3), xp3Var);
            oha.m18001g(tj3Var, new yu4(4), on3Var);
            oha.m18001g(tj3Var, new yu4(5), new C3406oe(0));
            c0282a.invoke(tj3Var, 0);
            AbstractC3393o1.m17723A(tj3Var, true, false, false);
        }
        on3 on3Var2 = on3Var;
        x18 x18VarM22143u = tj3Var.m22143u();
        if (x18VarM22143u != null) {
            x18VarM22143u.f67642d = new C3836zk(i, 18, xp3Var, on3Var2, vi3Var);
        }
    }

    /* JADX INFO: renamed from: d */
    public static final void m2259d(long j, C3532re c3532re, C0282a c0282a, ye1 ye1Var, int i) {
        tj3 tj3Var = (tj3) ye1Var;
        tj3Var.m22115d0(-950740793);
        if ((((tj3Var.m22118f(j) ? 4 : 2) | i | (tj3Var.m22120g(c3532re) ? 32 : 16)) & 147) == 146 && tj3Var.m22086D()) {
            tj3Var.m22102U();
        } else {
            tj3Var.m22106Y(1166141962, Long.valueOf(j));
            Object objM22097O = tj3Var.m22097O();
            if (objM22097O == we1.f66679a) {
                objM22097O = LazyVerticalGridKt$LazyVerticalGridItem$1$1.f6033i;
                tj3Var.m22131l0(objM22097O);
            }
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
            oha.m18001g(tj3Var, new yu4(6), Long.valueOf(j));
            oha.m18001g(tj3Var, new yu4(7), c3532re);
            c0282a.invoke(tj3Var, 6);
            tj3Var.m22139q(true);
            tj3Var.m22139q(false);
            tj3Var.m22139q(false);
            tj3Var.m22139q(false);
        }
        x18 x18VarM22143u = tj3Var.m22143u();
        if (x18VarM22143u != null) {
            x18VarM22143u.f67642d = new bv4(j, c3532re, c0282a, i, 1);
        }
    }
}
