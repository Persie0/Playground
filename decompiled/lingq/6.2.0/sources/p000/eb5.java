package p000;

import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;

/* JADX INFO: loaded from: classes.dex */
public final class eb5 implements c83 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f36978a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ C3540rl f36979b;

    public /* synthetic */ eb5(C3540rl c3540rl, int i) {
        this.f36978a = i;
        this.f36979b = c3540rl;
    }

    @Override // p000.c83
    public final Object collect(e83 e83Var, Continuation continuation) throws Throwable {
        int i = this.f36978a;
        xfa xfaVar = xfa.f68157a;
        C3540rl c3540rl = this.f36979b;
        switch (i) {
            case 0:
                Object objCollect = c3540rl.collect(new C3502ql(e83Var, 11), continuation);
                return objCollect == CoroutineSingletons.COROUTINE_SUSPENDED ? objCollect : xfaVar;
            default:
                Object objCollect2 = c3540rl.collect(new l5a(e83Var, 3), continuation);
                return objCollect2 == CoroutineSingletons.COROUTINE_SUSPENDED ? objCollect2 : xfaVar;
        }
    }
}
