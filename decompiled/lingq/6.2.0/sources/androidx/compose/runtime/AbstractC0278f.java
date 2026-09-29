package androidx.compose.runtime;

import java.util.Arrays;
import kotlin.coroutines.EmptyCoroutineContext;
import p000.c83;
import p000.d32;
import p000.eh9;
import p000.gc2;
import p000.kk8;
import p000.kn1;
import p000.p84;
import p000.qc9;
import p000.sc9;
import p000.sj3;
import p000.sq5;
import p000.t66;
import p000.tj3;
import p000.tr3;
import p000.uc9;
import p000.ui3;
import p000.we1;
import p000.x66;
import p000.xfa;
import p000.yc9;
import p000.ye1;
import p000.zc9;
import p000.zi3;

/* JADX INFO: renamed from: androidx.compose.runtime.f */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0278f {
    /* JADX INFO: renamed from: a */
    public static final t66 m1251a(c83 c83Var, Object obj, kn1 kn1Var, ye1 ye1Var, int i, int i2) {
        if ((i2 & 2) != 0) {
            kn1Var = EmptyCoroutineContext.f47685a;
        }
        tj3 tj3Var = (tj3) ye1Var;
        boolean zM22124i = tj3Var.m22124i(kn1Var) | tj3Var.m22124i(c83Var);
        Object objM22097O = tj3Var.m22097O();
        p84 p84Var = we1.f66679a;
        if (zM22124i || objM22097O == p84Var) {
            objM22097O = new SnapshotStateKt__SnapshotFlowKt$collectAsState$1$1(kn1Var, c83Var, null);
            tj3Var.m22131l0(objM22097O);
        }
        zi3 zi3Var = (zi3) objM22097O;
        Object objM22097O2 = tj3Var.m22097O();
        if (objM22097O2 == p84Var) {
            objM22097O2 = m1260j(obj);
            tj3Var.m22131l0(objM22097O2);
        }
        t66 t66Var = (t66) objM22097O2;
        boolean zM22124i2 = tj3Var.m22124i(zi3Var);
        Object objM22097O3 = tj3Var.m22097O();
        if (zM22124i2 || objM22097O3 == p84Var) {
            objM22097O3 = new SnapshotStateKt__ProduceStateKt$produceState$3$1(zi3Var, t66Var, null);
            tj3Var.m22131l0(objM22097O3);
        }
        d32.m10049l(c83Var, kn1Var, (zi3) objM22097O3, tj3Var);
        return t66Var;
    }

    /* JADX INFO: renamed from: b */
    public static final t66 m1252b(eh9 eh9Var, tj3 tj3Var) {
        return m1251a(eh9Var, eh9Var.getValue(), EmptyCoroutineContext.f47685a, tj3Var, 0, 0);
    }

    /* JADX INFO: renamed from: c */
    public static final x66 m1253c() {
        sq5 sq5Var = zc9.f71368b;
        x66 x66Var = (x66) sq5Var.m21566g();
        if (x66Var != null) {
            return x66Var;
        }
        x66 x66Var2 = new x66(new sj3[0]);
        sq5Var.m21552A(x66Var2);
        return x66Var2;
    }

    /* JADX INFO: renamed from: d */
    public static final gc2 m1254d(ui3 ui3Var) {
        sq5 sq5Var = zc9.f71367a;
        return new gc2(ui3Var, null);
    }

    /* JADX INFO: renamed from: e */
    public static final gc2 m1255e(ui3 ui3Var, yc9 yc9Var) {
        sq5 sq5Var = zc9.f71367a;
        return new gc2(ui3Var, yc9Var);
    }

    /* JADX INFO: renamed from: f */
    public static final qc9 m1256f(float f) {
        return new ParcelableSnapshotMutableFloatState(f);
    }

    /* JADX INFO: renamed from: g */
    public static final sc9 m1257g(int i) {
        return new ParcelableSnapshotMutableIntState(i);
    }

    /* JADX INFO: renamed from: h */
    public static final uc9 m1258h(long j) {
        return new ParcelableSnapshotMutableLongState(j);
    }

    /* JADX INFO: renamed from: i */
    public static final t66 m1259i(Object obj, yc9 yc9Var) {
        return new ParcelableSnapshotMutableState(obj, yc9Var);
    }

    /* JADX INFO: renamed from: j */
    public static t66 m1260j(Object obj) {
        return new ParcelableSnapshotMutableState(obj, tr3.f62761g);
    }

    /* JADX INFO: renamed from: k */
    public static final t66 m1261k(ye1 ye1Var, zi3 zi3Var, Object obj) {
        tj3 tj3Var = (tj3) ye1Var;
        Object objM22097O = tj3Var.m22097O();
        p84 p84Var = we1.f66679a;
        if (objM22097O == p84Var) {
            objM22097O = m1260j(obj);
            tj3Var.m22131l0(objM22097O);
        }
        t66 t66Var = (t66) objM22097O;
        boolean zM22124i = tj3Var.m22124i(zi3Var);
        Object objM22097O2 = tj3Var.m22097O();
        if (zM22124i || objM22097O2 == p84Var) {
            objM22097O2 = new SnapshotStateKt__ProduceStateKt$produceState$1$1(zi3Var, t66Var, null);
            tj3Var.m22131l0(objM22097O2);
        }
        d32.m10047k(tj3Var, (zi3) objM22097O2, xfa.f68157a);
        return t66Var;
    }

    /* JADX INFO: renamed from: l */
    public static final t66 m1262l(Object obj, Object[] objArr, zi3 zi3Var, ye1 ye1Var) {
        tj3 tj3Var = (tj3) ye1Var;
        Object objM22097O = tj3Var.m22097O();
        p84 p84Var = we1.f66679a;
        if (objM22097O == p84Var) {
            objM22097O = m1260j(obj);
            tj3Var.m22131l0(objM22097O);
        }
        t66 t66Var = (t66) objM22097O;
        Object[] objArrCopyOf = Arrays.copyOf(objArr, objArr.length);
        boolean zM22124i = tj3Var.m22124i(zi3Var);
        Object objM22097O2 = tj3Var.m22097O();
        if (zM22124i || objM22097O2 == p84Var) {
            objM22097O2 = new SnapshotStateKt__ProduceStateKt$produceState$5$1(zi3Var, t66Var, null);
            tj3Var.m22131l0(objM22097O2);
        }
        d32.m10053n(objArrCopyOf, (zi3) objM22097O2, tj3Var);
        return t66Var;
    }

    /* JADX INFO: renamed from: m */
    public static final t66 m1263m(Object obj, ye1 ye1Var) {
        tj3 tj3Var = (tj3) ye1Var;
        Object objM22097O = tj3Var.m22097O();
        if (objM22097O == we1.f66679a) {
            objM22097O = m1260j(obj);
            tj3Var.m22131l0(objM22097O);
        }
        t66 t66Var = (t66) objM22097O;
        t66Var.setValue(obj);
        return t66Var;
    }

    /* JADX INFO: renamed from: n */
    public static final kk8 m1264n(ui3 ui3Var) {
        return new kk8(new SnapshotStateKt__SnapshotFlowKt$snapshotFlowImpl$1(ui3Var, null));
    }
}
