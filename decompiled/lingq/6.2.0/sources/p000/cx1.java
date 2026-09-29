package p000;

import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;

/* JADX INFO: loaded from: classes2.dex */
public final class cx1 implements c83 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f34674a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ c18 f34675b;

    public /* synthetic */ cx1(c18 c18Var, int i) {
        this.f34674a = i;
        this.f34675b = c18Var;
    }

    @Override // p000.c83
    public final Object collect(e83 e83Var, Continuation continuation) {
        int i = this.f34674a;
        xfa xfaVar = xfa.f68157a;
        c18 c18Var = this.f34675b;
        switch (i) {
            case 0:
                Object objCollect = c18Var.collect(new C3475pw(e83Var, 12), continuation);
                return objCollect == CoroutineSingletons.COROUTINE_SUSPENDED ? objCollect : xfaVar;
            case 1:
                Object objCollect2 = c18Var.collect(new zd7(e83Var, 22), continuation);
                return objCollect2 == CoroutineSingletons.COROUTINE_SUSPENDED ? objCollect2 : xfaVar;
            case 2:
                Object objCollect3 = c18Var.collect(new zd7(e83Var, 28), continuation);
                return objCollect3 == CoroutineSingletons.COROUTINE_SUSPENDED ? objCollect3 : xfaVar;
            case 3:
                Object objCollect4 = c18Var.collect(new zd7(e83Var, 29), continuation);
                return objCollect4 == CoroutineSingletons.COROUTINE_SUSPENDED ? objCollect4 : xfaVar;
            case 4:
                Object objCollect5 = c18Var.collect(new wv7(e83Var, 0), continuation);
                return objCollect5 == CoroutineSingletons.COROUTINE_SUSPENDED ? objCollect5 : xfaVar;
            case 5:
                Object objCollect6 = c18Var.collect(new wv7(e83Var, 1), continuation);
                return objCollect6 == CoroutineSingletons.COROUTINE_SUSPENDED ? objCollect6 : xfaVar;
            case 6:
                Object objCollect7 = c18Var.collect(new wv7(e83Var, 7), continuation);
                return objCollect7 == CoroutineSingletons.COROUTINE_SUSPENDED ? objCollect7 : xfaVar;
            case 7:
                Object objCollect8 = c18Var.collect(new o08(e83Var, 0), continuation);
                return objCollect8 == CoroutineSingletons.COROUTINE_SUSPENDED ? objCollect8 : xfaVar;
            case 8:
                Object objCollect9 = c18Var.collect(new o08(e83Var, 15), continuation);
                return objCollect9 == CoroutineSingletons.COROUTINE_SUSPENDED ? objCollect9 : xfaVar;
            case 9:
                Object objCollect10 = c18Var.collect(new o08(e83Var, 16), continuation);
                return objCollect10 == CoroutineSingletons.COROUTINE_SUSPENDED ? objCollect10 : xfaVar;
            default:
                Object objCollect11 = c18Var.collect(new l5a(e83Var, 7), continuation);
                return objCollect11 == CoroutineSingletons.COROUTINE_SUSPENDED ? objCollect11 : xfaVar;
        }
    }
}
