package p000;

import com.lingq.p020ui.C2889e;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;

/* JADX INFO: loaded from: classes.dex */
public final class fp5 implements c83 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f39420a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ C3540rl f39421b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ C2889e f39422c;

    public /* synthetic */ fp5(C3540rl c3540rl, C2889e c2889e, int i) {
        this.f39420a = i;
        this.f39421b = c3540rl;
        this.f39422c = c2889e;
    }

    @Override // p000.c83
    public final Object collect(e83 e83Var, Continuation continuation) throws Throwable {
        int i = this.f39420a;
        xfa xfaVar = xfa.f68157a;
        C2889e c2889e = this.f39422c;
        C3540rl c3540rl = this.f39421b;
        switch (i) {
            case 0:
                Object objCollect = c3540rl.collect(new ep5(e83Var, c2889e, 0), continuation);
                return objCollect == CoroutineSingletons.COROUTINE_SUSPENDED ? objCollect : xfaVar;
            default:
                Object objCollect2 = c3540rl.collect(new ep5(e83Var, c2889e, 1), continuation);
                return objCollect2 == CoroutineSingletons.COROUTINE_SUSPENDED ? objCollect2 : xfaVar;
        }
    }
}
