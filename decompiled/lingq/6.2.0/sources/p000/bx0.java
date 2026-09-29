package p000;

import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;

/* JADX INFO: loaded from: classes2.dex */
public final class bx0 implements c83 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f9110a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ i93 f9111b;

    public /* synthetic */ bx0(i93 i93Var, int i) {
        this.f9110a = i;
        this.f9111b = i93Var;
    }

    @Override // p000.c83
    public final Object collect(e83 e83Var, Continuation continuation) {
        int i = this.f9110a;
        int i2 = 2;
        int i3 = 21;
        xfa xfaVar = xfa.f68157a;
        i93 i93Var = this.f9111b;
        switch (i) {
            case 0:
                Object objCollect = i93Var.collect(new C3475pw(e83Var, 1), continuation);
                return objCollect == CoroutineSingletons.COROUTINE_SUSPENDED ? objCollect : xfaVar;
            case 1:
                Object objCollect2 = i93Var.collect(new C3475pw(e83Var, i2), continuation);
                return objCollect2 == CoroutineSingletons.COROUTINE_SUSPENDED ? objCollect2 : xfaVar;
            case 2:
                Object objCollect3 = i93Var.collect(new C3475pw(e83Var, 10), continuation);
                return objCollect3 == CoroutineSingletons.COROUTINE_SUSPENDED ? objCollect3 : xfaVar;
            case 3:
                Object objCollect4 = i93Var.collect(new C3475pw(e83Var, 11), continuation);
                return objCollect4 == CoroutineSingletons.COROUTINE_SUSPENDED ? objCollect4 : xfaVar;
            case 4:
                Object objCollect5 = i93Var.collect(new bn3(e83Var, 0), continuation);
                return objCollect5 == CoroutineSingletons.COROUTINE_SUSPENDED ? objCollect5 : xfaVar;
            case 5:
                Object objCollect6 = i93Var.collect(new bn3(e83Var, i2), continuation);
                return objCollect6 == CoroutineSingletons.COROUTINE_SUSPENDED ? objCollect6 : xfaVar;
            case 6:
                Object objCollect7 = i93Var.collect(new bn3(e83Var, 4), continuation);
                return objCollect7 == CoroutineSingletons.COROUTINE_SUSPENDED ? objCollect7 : xfaVar;
            case 7:
                Object objCollect8 = i93Var.collect(new bn3(e83Var, 13), continuation);
                return objCollect8 == CoroutineSingletons.COROUTINE_SUSPENDED ? objCollect8 : xfaVar;
            case 8:
                Object objCollect9 = i93Var.collect(new bn3(e83Var, 14), continuation);
                return objCollect9 == CoroutineSingletons.COROUTINE_SUSPENDED ? objCollect9 : xfaVar;
            case 9:
                Object objCollect10 = i93Var.collect(new bn3(e83Var, 15), continuation);
                return objCollect10 == CoroutineSingletons.COROUTINE_SUSPENDED ? objCollect10 : xfaVar;
            case 10:
                Object objCollect11 = i93Var.collect(new bn3(e83Var, 16), continuation);
                return objCollect11 == CoroutineSingletons.COROUTINE_SUSPENDED ? objCollect11 : xfaVar;
            case 11:
                Object objCollect12 = i93Var.collect(new bn3(e83Var, 17), continuation);
                return objCollect12 == CoroutineSingletons.COROUTINE_SUSPENDED ? objCollect12 : xfaVar;
            case 12:
                Object objCollect13 = i93Var.collect(new bn3(e83Var, 18), continuation);
                return objCollect13 == CoroutineSingletons.COROUTINE_SUSPENDED ? objCollect13 : xfaVar;
            case 13:
                Object objCollect14 = i93Var.collect(new bn3(e83Var, 19), continuation);
                return objCollect14 == CoroutineSingletons.COROUTINE_SUSPENDED ? objCollect14 : xfaVar;
            case 14:
                Object objCollect15 = i93Var.collect(new bn3(e83Var, 20), continuation);
                return objCollect15 == CoroutineSingletons.COROUTINE_SUSPENDED ? objCollect15 : xfaVar;
            case 15:
                Object objCollect16 = i93Var.collect(new bn3(e83Var, i3), continuation);
                return objCollect16 == CoroutineSingletons.COROUTINE_SUSPENDED ? objCollect16 : xfaVar;
            case 16:
                Object objCollect17 = i93Var.collect(new bn3(e83Var, 22), continuation);
                return objCollect17 == CoroutineSingletons.COROUTINE_SUSPENDED ? objCollect17 : xfaVar;
            case 17:
                Object objCollect18 = i93Var.collect(new bn3(e83Var, 23), continuation);
                return objCollect18 == CoroutineSingletons.COROUTINE_SUSPENDED ? objCollect18 : xfaVar;
            case 18:
                Object objCollect19 = i93Var.collect(new bn3(e83Var, 24), continuation);
                return objCollect19 == CoroutineSingletons.COROUTINE_SUSPENDED ? objCollect19 : xfaVar;
            case 19:
                Object objCollect20 = i93Var.collect(new o08(e83Var, i3), continuation);
                return objCollect20 == CoroutineSingletons.COROUTINE_SUSPENDED ? objCollect20 : xfaVar;
            case 20:
                Object objCollect21 = i93Var.collect(new o08(e83Var, 25), continuation);
                return objCollect21 == CoroutineSingletons.COROUTINE_SUSPENDED ? objCollect21 : xfaVar;
            case 21:
                Object objCollect22 = i93Var.collect(new o08(e83Var, 26), continuation);
                return objCollect22 == CoroutineSingletons.COROUTINE_SUSPENDED ? objCollect22 : xfaVar;
            case 22:
                Object objCollect23 = i93Var.collect(new o08(e83Var, 27), continuation);
                return objCollect23 == CoroutineSingletons.COROUTINE_SUSPENDED ? objCollect23 : xfaVar;
            default:
                Object objCollect24 = i93Var.collect(new l5a(e83Var, 8), continuation);
                return objCollect24 == CoroutineSingletons.COROUTINE_SUSPENDED ? objCollect24 : xfaVar;
        }
    }
}
