package p000;

import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;

/* JADX INFO: loaded from: classes2.dex */
public final class p08 implements c83 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f55398a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ c83 f55399b;

    public /* synthetic */ p08(c83 c83Var, int i) {
        this.f55398a = i;
        this.f55399b = c83Var;
    }

    @Override // p000.c83
    public final Object collect(e83 e83Var, Continuation continuation) {
        int i = this.f55398a;
        xfa xfaVar = xfa.f68157a;
        c83 c83Var = this.f55399b;
        switch (i) {
            case 0:
                Object objCollect = c83Var.collect(new o08(e83Var, 4), continuation);
                return objCollect == CoroutineSingletons.COROUTINE_SUSPENDED ? objCollect : xfaVar;
            case 1:
                Object objCollect2 = c83Var.collect(new o08(e83Var, 5), continuation);
                return objCollect2 == CoroutineSingletons.COROUTINE_SUSPENDED ? objCollect2 : xfaVar;
            case 2:
                Object objCollect3 = c83Var.collect(new o08(e83Var, 6), continuation);
                return objCollect3 == CoroutineSingletons.COROUTINE_SUSPENDED ? objCollect3 : xfaVar;
            case 3:
                Object objCollect4 = c83Var.collect(new o08(e83Var, 7), continuation);
                return objCollect4 == CoroutineSingletons.COROUTINE_SUSPENDED ? objCollect4 : xfaVar;
            case 4:
                Object objCollect5 = c83Var.collect(new o08(e83Var, 8), continuation);
                return objCollect5 == CoroutineSingletons.COROUTINE_SUSPENDED ? objCollect5 : xfaVar;
            case 5:
                Object objCollect6 = c83Var.collect(new o08(e83Var, 9), continuation);
                return objCollect6 == CoroutineSingletons.COROUTINE_SUSPENDED ? objCollect6 : xfaVar;
            case 6:
                Object objCollect7 = c83Var.collect(new o08(e83Var, 17), continuation);
                return objCollect7 == CoroutineSingletons.COROUTINE_SUSPENDED ? objCollect7 : xfaVar;
            case 7:
                Object objCollect8 = c83Var.collect(new o08(e83Var, 18), continuation);
                return objCollect8 == CoroutineSingletons.COROUTINE_SUSPENDED ? objCollect8 : xfaVar;
            case 8:
                Object objCollect9 = c83Var.collect(new o08(e83Var, 19), continuation);
                return objCollect9 == CoroutineSingletons.COROUTINE_SUSPENDED ? objCollect9 : xfaVar;
            case 9:
                Object objCollect10 = c83Var.collect(new o08(e83Var, 20), continuation);
                return objCollect10 == CoroutineSingletons.COROUTINE_SUSPENDED ? objCollect10 : xfaVar;
            case 10:
                Object objCollect11 = c83Var.collect(new o08(e83Var, 23), continuation);
                return objCollect11 == CoroutineSingletons.COROUTINE_SUSPENDED ? objCollect11 : xfaVar;
            case 11:
                Object objCollect12 = c83Var.collect(new o08(e83Var, 24), continuation);
                return objCollect12 == CoroutineSingletons.COROUTINE_SUSPENDED ? objCollect12 : xfaVar;
            case 12:
                Object objCollect13 = c83Var.collect(new o08(e83Var, 29), continuation);
                return objCollect13 == CoroutineSingletons.COROUTINE_SUSPENDED ? objCollect13 : xfaVar;
            case 13:
                Object objCollect14 = c83Var.collect(new l5a(e83Var, 0), continuation);
                return objCollect14 == CoroutineSingletons.COROUTINE_SUSPENDED ? objCollect14 : xfaVar;
            case 14:
                Object objCollect15 = c83Var.collect(new l5a(e83Var, 4), continuation);
                return objCollect15 == CoroutineSingletons.COROUTINE_SUSPENDED ? objCollect15 : xfaVar;
            case 15:
                Object objCollect16 = c83Var.collect(new l5a(e83Var, 5), continuation);
                return objCollect16 == CoroutineSingletons.COROUTINE_SUSPENDED ? objCollect16 : xfaVar;
            default:
                Object objCollect17 = c83Var.collect(new l5a(e83Var, 6), continuation);
                return objCollect17 == CoroutineSingletons.COROUTINE_SUSPENDED ? objCollect17 : xfaVar;
        }
    }
}
