package p000;

import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;

/* JADX INFO: loaded from: classes2.dex */
public final class ph4 implements c83 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f56220a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ C3540rl f56221b;

    public /* synthetic */ ph4(C3540rl c3540rl, int i) {
        this.f56220a = i;
        this.f56221b = c3540rl;
    }

    @Override // p000.c83
    public final Object collect(e83 e83Var, Continuation continuation) {
        int i = this.f56220a;
        xfa xfaVar = xfa.f68157a;
        C3540rl c3540rl = this.f56221b;
        switch (i) {
            case 0:
                Object objCollect = c3540rl.collect(new bn3(e83Var, 1), continuation);
                return objCollect == CoroutineSingletons.COROUTINE_SUSPENDED ? objCollect : xfaVar;
            case 1:
                Object objCollect2 = c3540rl.collect(new bn3(e83Var, 6), continuation);
                return objCollect2 == CoroutineSingletons.COROUTINE_SUSPENDED ? objCollect2 : xfaVar;
            case 2:
                Object objCollect3 = c3540rl.collect(new bn3(e83Var, 10), continuation);
                return objCollect3 == CoroutineSingletons.COROUTINE_SUSPENDED ? objCollect3 : xfaVar;
            case 3:
                Object objCollect4 = c3540rl.collect(new bn3(e83Var, 11), continuation);
                return objCollect4 == CoroutineSingletons.COROUTINE_SUSPENDED ? objCollect4 : xfaVar;
            case 4:
                Object objCollect5 = c3540rl.collect(new bn3(e83Var, 12), continuation);
                return objCollect5 == CoroutineSingletons.COROUTINE_SUSPENDED ? objCollect5 : xfaVar;
            case 5:
                Object objCollect6 = c3540rl.collect(new zd7(e83Var, 11), continuation);
                return objCollect6 == CoroutineSingletons.COROUTINE_SUSPENDED ? objCollect6 : xfaVar;
            case 6:
                Object objCollect7 = c3540rl.collect(new wv7(e83Var, 11), continuation);
                return objCollect7 == CoroutineSingletons.COROUTINE_SUSPENDED ? objCollect7 : xfaVar;
            default:
                Object objCollect8 = c3540rl.collect(new o08(e83Var, 22), continuation);
                return objCollect8 == CoroutineSingletons.COROUTINE_SUSPENDED ? objCollect8 : xfaVar;
        }
    }
}
