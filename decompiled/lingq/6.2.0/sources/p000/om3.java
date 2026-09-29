package p000;

import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;

/* JADX INFO: loaded from: classes3.dex */
public final class om3 implements c83 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f54570a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ n83 f54571b;

    public /* synthetic */ om3(n83 n83Var, int i) {
        this.f54570a = i;
        this.f54571b = n83Var;
    }

    @Override // p000.c83
    public final Object collect(e83 e83Var, Continuation continuation) throws Throwable {
        int i = this.f54570a;
        xfa xfaVar = xfa.f68157a;
        n83 n83Var = this.f54571b;
        switch (i) {
            case 0:
                Object objCollect = n83Var.collect(new C3475pw(e83Var, 28), continuation);
                return objCollect == CoroutineSingletons.COROUTINE_SUSPENDED ? objCollect : xfaVar;
            default:
                Object objCollect2 = n83Var.collect(new C3475pw(e83Var, 29), continuation);
                return objCollect2 == CoroutineSingletons.COROUTINE_SUSPENDED ? objCollect2 : xfaVar;
        }
    }
}
