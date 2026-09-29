package p000;

import com.lingq.core.datastore.C1370c;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;

/* JADX INFO: loaded from: classes.dex */
public final class mg8 implements c83 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f51304a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ c83 f51305b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ C1370c f51306c;

    public /* synthetic */ mg8(c83 c83Var, C1370c c1370c, int i) {
        this.f51304a = i;
        this.f51305b = c83Var;
        this.f51306c = c1370c;
    }

    @Override // p000.c83
    public final Object collect(e83 e83Var, Continuation continuation) {
        int i = this.f51304a;
        xfa xfaVar = xfa.f68157a;
        C1370c c1370c = this.f51306c;
        c83 c83Var = this.f51305b;
        switch (i) {
            case 0:
                Object objCollect = c83Var.collect(new kg8(e83Var, c1370c, 26), continuation);
                return objCollect == CoroutineSingletons.COROUTINE_SUSPENDED ? objCollect : xfaVar;
            case 1:
                Object objCollect2 = c83Var.collect(new kg8(e83Var, c1370c, 27), continuation);
                return objCollect2 == CoroutineSingletons.COROUTINE_SUSPENDED ? objCollect2 : xfaVar;
            case 2:
                Object objCollect3 = c83Var.collect(new kg8(e83Var, c1370c, 28), continuation);
                return objCollect3 == CoroutineSingletons.COROUTINE_SUSPENDED ? objCollect3 : xfaVar;
            case 3:
                Object objCollect4 = c83Var.collect(new ng8(e83Var, c1370c, 1), continuation);
                return objCollect4 == CoroutineSingletons.COROUTINE_SUSPENDED ? objCollect4 : xfaVar;
            default:
                Object objCollect5 = c83Var.collect(new ng8(e83Var, c1370c, 0), continuation);
                return objCollect5 == CoroutineSingletons.COROUTINE_SUSPENDED ? objCollect5 : xfaVar;
        }
    }
}
