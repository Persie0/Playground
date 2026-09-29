package p000;

import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlinx.coroutines.AbstractC3208a;
import kotlinx.coroutines.DispatchException;

/* JADX INFO: loaded from: classes.dex */
public abstract class dha implements zua {
    /* JADX INFO: renamed from: d */
    public static final double m10392d(long j) {
        return ((j >>> 11) * 2048.0d) + (j & 2047);
    }

    /* JADX INFO: renamed from: e */
    public static final String m10393e(int i, long j) {
        if (j >= 0) {
            ci8.m4727l(i);
            String string = Long.toString(j, i);
            string.getClass();
            return string;
        }
        long j2 = i;
        long j3 = ((j >>> 1) / j2) << 1;
        long j4 = j - (j3 * j2);
        if (j4 >= j2) {
            j4 -= j2;
            j3++;
        }
        ci8.m4727l(i);
        String string2 = Long.toString(j3, i);
        string2.getClass();
        ci8.m4727l(i);
        String string3 = Long.toString(j4, i);
        string3.getClass();
        return string2.concat(string3);
    }

    /* JADX INFO: renamed from: f */
    public static final Object m10394f(ContinuationImpl continuationImpl) throws DispatchException {
        Object obj;
        kn1 context = continuationImpl.getContext();
        AbstractC3208a.m15439f(context);
        Continuation continuationM21600K = AbstractC3584sr.m21600K(continuationImpl);
        kh2 kh2Var = continuationM21600K instanceof kh2 ? (kh2) continuationM21600K : null;
        xfa xfaVar = xfa.f68157a;
        if (kh2Var == null) {
            obj = xfaVar;
        } else {
            nn1 nn1Var = kh2Var.f47289d;
            if (eh0.m11118O(nn1Var, context)) {
                kh2Var.f47291f = xfaVar;
                kh2Var.f49653c = 1;
                nn1Var.mo386W(context, kh2Var);
            } else {
                kn1 kn1VarPlus = context.plus(new uab(uab.f63657b));
                kh2Var.f47291f = xfaVar;
                kh2Var.f49653c = 1;
                nn1Var.mo386W(kn1VarPlus, kh2Var);
            }
            obj = CoroutineSingletons.COROUTINE_SUSPENDED;
        }
        return obj == CoroutineSingletons.COROUTINE_SUSPENDED ? obj : xfaVar;
    }

    @Override // p000.zua
    /* JADX INFO: renamed from: a */
    public void mo10395a() {
    }

    @Override // p000.zua
    /* JADX INFO: renamed from: b */
    public void mo10396b() {
    }
}
