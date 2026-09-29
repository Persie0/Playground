package p000;

import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;

/* JADX INFO: loaded from: classes2.dex */
public final class ol3 implements c83 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f54528a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ kk8 f54529b;

    public /* synthetic */ ol3(kk8 kk8Var, int i) {
        this.f54528a = i;
        this.f54529b = kk8Var;
    }

    @Override // p000.c83
    public final Object collect(e83 e83Var, Continuation continuation) throws Throwable {
        int i = this.f54528a;
        xfa xfaVar = xfa.f68157a;
        kk8 kk8Var = this.f54529b;
        switch (i) {
            case 0:
                Object objCollect = kk8Var.collect(new C3475pw(e83Var, 20), continuation);
                return objCollect == CoroutineSingletons.COROUTINE_SUSPENDED ? objCollect : xfaVar;
            default:
                Object objCollect2 = kk8Var.collect(new C3475pw(e83Var, 21), continuation);
                return objCollect2 == CoroutineSingletons.COROUTINE_SUSPENDED ? objCollect2 : xfaVar;
        }
    }
}
