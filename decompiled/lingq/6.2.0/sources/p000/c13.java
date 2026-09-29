package p000;

import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlinx.coroutines.flow.C3244l;

/* JADX INFO: loaded from: classes2.dex */
public final class c13 implements c83 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f9307a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ C3244l f9308b;

    public /* synthetic */ c13(C3244l c3244l, int i) {
        this.f9307a = i;
        this.f9308b = c3244l;
    }

    @Override // p000.c83
    public final Object collect(e83 e83Var, Continuation continuation) throws Throwable {
        int i = this.f9307a;
        int i2 = 14;
        xfa xfaVar = xfa.f68157a;
        C3244l c3244l = this.f9308b;
        switch (i) {
            case 0:
                Object objCollect = c3244l.collect(new C3475pw(e83Var, i2), continuation);
                return objCollect == CoroutineSingletons.COROUTINE_SUSPENDED ? objCollect : xfaVar;
            case 1:
                Object objCollect2 = c3244l.collect(new C3475pw(e83Var, 19), continuation);
                return objCollect2 == CoroutineSingletons.COROUTINE_SUSPENDED ? objCollect2 : xfaVar;
            case 2:
                Object objCollect3 = c3244l.collect(new bn3(e83Var, 3), continuation);
                return objCollect3 == CoroutineSingletons.COROUTINE_SUSPENDED ? objCollect3 : xfaVar;
            case 3:
                Object objCollect4 = c3244l.collect(new wv7(e83Var, 10), continuation);
                return objCollect4 == CoroutineSingletons.COROUTINE_SUSPENDED ? objCollect4 : xfaVar;
            case 4:
                Object objCollect5 = c3244l.collect(new wv7(e83Var, 12), continuation);
                return objCollect5 == CoroutineSingletons.COROUTINE_SUSPENDED ? objCollect5 : xfaVar;
            case 5:
                Object objCollect6 = c3244l.collect(new wv7(e83Var, 15), continuation);
                return objCollect6 == CoroutineSingletons.COROUTINE_SUSPENDED ? objCollect6 : xfaVar;
            case 6:
                Object objCollect7 = c3244l.collect(new wv7(e83Var, 16), continuation);
                return objCollect7 == CoroutineSingletons.COROUTINE_SUSPENDED ? objCollect7 : xfaVar;
            case 7:
                Object objCollect8 = c3244l.collect(new o08(e83Var, 10), continuation);
                return objCollect8 == CoroutineSingletons.COROUTINE_SUSPENDED ? objCollect8 : xfaVar;
            case 8:
                Object objCollect9 = c3244l.collect(new o08(e83Var, 11), continuation);
                return objCollect9 == CoroutineSingletons.COROUTINE_SUSPENDED ? objCollect9 : xfaVar;
            case 9:
                Object objCollect10 = c3244l.collect(new o08(e83Var, 12), continuation);
                return objCollect10 == CoroutineSingletons.COROUTINE_SUSPENDED ? objCollect10 : xfaVar;
            case 10:
                Object objCollect11 = c3244l.collect(new o08(e83Var, 13), continuation);
                return objCollect11 == CoroutineSingletons.COROUTINE_SUSPENDED ? objCollect11 : xfaVar;
            case 11:
                Object objCollect12 = c3244l.collect(new o08(e83Var, 14), continuation);
                return objCollect12 == CoroutineSingletons.COROUTINE_SUSPENDED ? objCollect12 : xfaVar;
            case 12:
                Object objCollect13 = c3244l.collect(new o08(e83Var, 28), continuation);
                return objCollect13 == CoroutineSingletons.COROUTINE_SUSPENDED ? objCollect13 : xfaVar;
            default:
                Object objCollect14 = c3244l.collect(new l5a(e83Var, 1), continuation);
                return objCollect14 == CoroutineSingletons.COROUTINE_SUSPENDED ? objCollect14 : xfaVar;
        }
    }
}
