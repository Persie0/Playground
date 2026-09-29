package p000;

import androidx.compose.animation.core.C0059a;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* JADX INFO: loaded from: classes2.dex */
public abstract class ap2 {

    /* JADX INFO: renamed from: a */
    public static final fda f7318a;

    /* JADX INFO: renamed from: b */
    public static final fda f7319b;

    /* JADX INFO: renamed from: c */
    public static final fda f7320c;

    static {
        zr1 zr1Var = new zr1(0.4f, 0.0f, 0.6f, 1.0f);
        f7318a = new fda(120, io2.f44349a, 2);
        f7319b = new fda(150, zr1Var, 2);
        f7320c = new fda(120, zr1Var, 2);
    }

    /* JADX WARN: Code duplicated, block: B:6:0x0009 A[PHI: r1
      0x0009: PHI (r1v3 fda) = (r1v0 fda), (r1v0 fda), (r1v0 fda), (r1v4 fda), (r1v4 fda), (r1v4 fda), (r1v4 fda) binds: [B:19:0x0022, B:22:0x0027, B:28:0x0033, B:5:0x0007, B:8:0x000d, B:11:0x0012, B:14:0x0017] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX INFO: renamed from: a */
    public static final Object m2965a(C0059a c0059a, float f, q84 q84Var, q84 q84Var2, ContinuationImpl continuationImpl) {
        fda fdaVar;
        fda fdaVar2 = null;
        if (q84Var2 != null) {
            boolean z = q84Var2 instanceof lj7;
            fdaVar = f7318a;
            if (z || (q84Var2 instanceof xk2) || (q84Var2 instanceof rv3) || (q84Var2 instanceof q93)) {
                fdaVar2 = fdaVar;
            }
        } else if (q84Var != null) {
            boolean z2 = q84Var instanceof lj7;
            fdaVar = f7319b;
            if (z2 || (q84Var instanceof xk2)) {
                fdaVar2 = fdaVar;
            } else if (q84Var instanceof rv3) {
                fdaVar2 = f7320c;
            } else if (q84Var instanceof q93) {
                fdaVar2 = fdaVar;
            }
        }
        fda fdaVar3 = fdaVar2;
        if (fdaVar3 != null) {
            Object objM744c = C0059a.m744c(c0059a, new xj2(f), fdaVar3, null, continuationImpl, 12);
            if (objM744c == CoroutineSingletons.COROUTINE_SUSPENDED) {
                return objM744c;
            }
        } else {
            Object objM747f = c0059a.m747f(new xj2(f), continuationImpl);
            if (objM747f == CoroutineSingletons.COROUTINE_SUSPENDED) {
                return objM747f;
            }
        }
        return xfa.f68157a;
    }
}
