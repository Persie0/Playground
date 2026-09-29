package p000;

import androidx.compose.foundation.gestures.Orientation;
import androidx.compose.foundation.lazy.C0127b;
import kotlin.collections.EmptyList;
import kotlin.coroutines.EmptyCoroutineContext;

/* JADX INFO: loaded from: classes.dex */
public abstract class mv4 {

    /* JADX INFO: renamed from: a */
    public static final hv4 f51883a = new hv4(null, 0, false, 0.0f, new dt4(1), 0.0f, false, vz1.m23619a(EmptyCoroutineContext.f47685a), vz1.m23621b(), dk1.m10424b(0, 0, 0, 0, 15), EmptyList.f47638a, 0, 0, 0, Orientation.Vertical, 0, 0);

    /* JADX INFO: renamed from: a */
    public static final C0127b m17056a(final int i, ye1 ye1Var, int i2) {
        if ((i2 & 1) != 0) {
            i = 0;
        }
        Object[] objArr = new Object[0];
        fs6 fs6Var = C0127b.f2435y;
        boolean zM22116e = ((tj3) ye1Var).m22116e(i) | ((tj3) ye1Var).m22116e(0);
        tj3 tj3Var = (tj3) ye1Var;
        Object objM22097O = tj3Var.m22097O();
        if (zM22116e || objM22097O == we1.f66679a) {
            objM22097O = new ui3() { // from class: lv4
                @Override // p000.ui3
                /* JADX INFO: renamed from: a */
                public final Object mo0a() {
                    return new C0127b(i, 0);
                }
            };
            tj3Var.m22131l0(objM22097O);
        }
        return (C0127b) xwc.m24747T(objArr, fs6Var, (ui3) objM22097O, tj3Var, 0);
    }
}
