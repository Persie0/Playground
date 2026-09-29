package androidx.lifecycle.compose;

import androidx.compose.runtime.AbstractC0278f;
import androidx.lifecycle.Lifecycle$State;
import kotlin.coroutines.EmptyCoroutineContext;
import p000.AbstractC3572sf;
import p000.c83;
import p000.eh9;
import p000.gi5;
import p000.t66;
import p000.tj3;
import p000.ub5;
import p000.we1;
import p000.ye1;
import p000.zi3;

/* JADX INFO: renamed from: androidx.lifecycle.compose.a */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0711a {
    /* JADX INFO: renamed from: a */
    public static final t66 m2511a(c83 c83Var, Object obj, AbstractC3572sf abstractC3572sf, Lifecycle$State lifecycle$State, ye1 ye1Var, int i) {
        EmptyCoroutineContext emptyCoroutineContext = EmptyCoroutineContext.f47685a;
        Object[] objArr = {c83Var, abstractC3572sf, lifecycle$State, emptyCoroutineContext};
        tj3 tj3Var = (tj3) ye1Var;
        boolean zM22124i = ((((i & 7168) ^ 3072) > 2048 && tj3Var.m22116e(lifecycle$State.ordinal())) || (i & 3072) == 2048) | tj3Var.m22124i(abstractC3572sf) | tj3Var.m22124i(emptyCoroutineContext) | tj3Var.m22124i(c83Var);
        Object objM22097O = tj3Var.m22097O();
        if (zM22124i || objM22097O == we1.f66679a) {
            objM22097O = new FlowExtKt$collectAsStateWithLifecycle$1$1(abstractC3572sf, lifecycle$State, c83Var, null);
            tj3Var.m22131l0(objM22097O);
        }
        return AbstractC0278f.m1262l(obj, objArr, (zi3) objM22097O, tj3Var);
    }

    /* JADX INFO: renamed from: b */
    public static final t66 m2512b(c83 c83Var, Object obj, ye1 ye1Var, int i) {
        ub5 ub5Var = (ub5) ((tj3) ye1Var).m22128k(gi5.f40854a);
        return m2511a(c83Var, obj, ub5Var.mo256K(), Lifecycle$State.STARTED, ye1Var, i & 112);
    }

    /* JADX INFO: renamed from: c */
    public static final t66 m2513c(eh9 eh9Var, ye1 ye1Var) {
        ub5 ub5Var = (ub5) ((tj3) ye1Var).m22128k(gi5.f40854a);
        return m2511a(eh9Var, eh9Var.getValue(), ub5Var.mo256K(), Lifecycle$State.STARTED, ye1Var, 0);
    }
}
