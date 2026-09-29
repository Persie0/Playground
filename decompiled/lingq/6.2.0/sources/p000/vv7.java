package p000;

import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlinx.coroutines.flow.C3228h;

/* JADX INFO: loaded from: classes3.dex */
public final class vv7 implements c83 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f65987a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ C3228h f65988b;

    public /* synthetic */ vv7(C3228h c3228h, int i) {
        this.f65987a = i;
        this.f65988b = c3228h;
    }

    @Override // p000.c83
    public final Object collect(e83 e83Var, Continuation continuation) {
        int i = this.f65987a;
        xfa xfaVar = xfa.f68157a;
        C3228h c3228h = this.f65988b;
        switch (i) {
            case 0:
                Object objCollect = c3228h.collect(new zd7(e83Var, 24), continuation);
                return objCollect == CoroutineSingletons.COROUTINE_SUSPENDED ? objCollect : xfaVar;
            case 1:
                Object objCollect2 = c3228h.collect(new zd7(e83Var, 25), continuation);
                return objCollect2 == CoroutineSingletons.COROUTINE_SUSPENDED ? objCollect2 : xfaVar;
            case 2:
                Object objCollect3 = c3228h.collect(new zd7(e83Var, 26), continuation);
                return objCollect3 == CoroutineSingletons.COROUTINE_SUSPENDED ? objCollect3 : xfaVar;
            default:
                Object objCollect4 = c3228h.collect(new zd7(e83Var, 27), continuation);
                return objCollect4 == CoroutineSingletons.COROUTINE_SUSPENDED ? objCollect4 : xfaVar;
        }
    }
}
