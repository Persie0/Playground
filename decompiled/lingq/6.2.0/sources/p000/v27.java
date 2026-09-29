package p000;

import androidx.compose.foundation.gestures.Orientation;
import kotlin.coroutines.EmptyCoroutineContext;

/* JADX INFO: loaded from: classes.dex */
public abstract class v27 {

    /* JADX INFO: renamed from: a */
    public static final u27 f64740a;

    /* JADX INFO: renamed from: b */
    public static final n27 f64741b;

    static {
        u27 u27Var = new u27(0);
        f64740a = u27Var;
        int i = 0;
        int i2 = 0;
        int i3 = 0;
        int i4 = 0;
        f64741b = new n27(i, i2, i3, Orientation.Horizontal, i4, 0, 0, gz8.f41567h, new dt4(3), vz1.m23619a(EmptyCoroutineContext.f47685a), u27Var, dk1.m10424b(0, 0, 0, 0, 15));
    }

    /* JADX INFO: renamed from: a */
    public static final long m23065a(n27 n27Var, int i) {
        int i2 = n27Var.f52221c;
        long j = (((((long) i) * ((long) (n27Var.f52220b + i2))) + ((long) (-n27Var.f52224f))) + ((long) n27Var.f52222d)) - ((long) i2);
        int iM17188g = (int) (n27Var.f52223e == Orientation.Horizontal ? n27Var.m17188g() >> 32 : n27Var.m17188g() & 4294967295L);
        n27Var.f52233o.getClass();
        long jM15945h = j - ((long) (iM17188g - l70.m15945h(0, 0, iM17188g)));
        if (jM15945h < 0) {
            return 0L;
        }
        return jM15945h;
    }

    /* JADX INFO: renamed from: b */
    public static final o72 m23066b(final int i, ye1 ye1Var, final ui3 ui3Var) {
        Object[] objArr = new Object[0];
        fs6 fs6Var = o72.f53927I;
        boolean zM22116e = ((tj3) ye1Var).m22116e(i) | ((tj3) ye1Var).m22114d(0.0f) | ((tj3) ye1Var).m22120g(ui3Var);
        tj3 tj3Var = (tj3) ye1Var;
        Object objM22097O = tj3Var.m22097O();
        if (zM22116e || objM22097O == we1.f66679a) {
            objM22097O = new ui3() { // from class: t27
                @Override // p000.ui3
                /* JADX INFO: renamed from: a */
                public final Object mo0a() {
                    return new o72(i, 0.0f, ui3Var);
                }
            };
            tj3Var.m22131l0(objM22097O);
        }
        o72 o72Var = (o72) xwc.m24747T(objArr, fs6Var, (ui3) objM22097O, tj3Var, 0);
        ((xc9) o72Var.f53928H).setValue(ui3Var);
        return o72Var;
    }
}
