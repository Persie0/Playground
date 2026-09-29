package p000;

import com.lingq.core.datastore.C1368a;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;

/* JADX INFO: loaded from: classes.dex */
public final class yi7 implements c83 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f69872a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ c83 f69873b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ C1368a f69874c;

    public /* synthetic */ yi7(c83 c83Var, C1368a c1368a, int i) {
        this.f69872a = i;
        this.f69873b = c83Var;
        this.f69874c = c1368a;
    }

    @Override // p000.c83
    public final Object collect(e83 e83Var, Continuation continuation) {
        int i = this.f69872a;
        xfa xfaVar = xfa.f68157a;
        C1368a c1368a = this.f69874c;
        c83 c83Var = this.f69873b;
        switch (i) {
            case 0:
                Object objCollect = c83Var.collect(new xi7(e83Var, c1368a, 17), continuation);
                return objCollect == CoroutineSingletons.COROUTINE_SUSPENDED ? objCollect : xfaVar;
            case 1:
                Object objCollect2 = c83Var.collect(new xi7(e83Var, c1368a, 18), continuation);
                return objCollect2 == CoroutineSingletons.COROUTINE_SUSPENDED ? objCollect2 : xfaVar;
            case 2:
                Object objCollect3 = c83Var.collect(new xi7(e83Var, c1368a, 19), continuation);
                return objCollect3 == CoroutineSingletons.COROUTINE_SUSPENDED ? objCollect3 : xfaVar;
            case 3:
                Object objCollect4 = c83Var.collect(new xi7(e83Var, c1368a, 20), continuation);
                return objCollect4 == CoroutineSingletons.COROUTINE_SUSPENDED ? objCollect4 : xfaVar;
            case 4:
                Object objCollect5 = c83Var.collect(new ti7(e83Var, c1368a, 14), continuation);
                return objCollect5 == CoroutineSingletons.COROUTINE_SUSPENDED ? objCollect5 : xfaVar;
            case 5:
                Object objCollect6 = c83Var.collect(new xi7(e83Var, c1368a, 11), continuation);
                return objCollect6 == CoroutineSingletons.COROUTINE_SUSPENDED ? objCollect6 : xfaVar;
            case 6:
                Object objCollect7 = c83Var.collect(new xi7(e83Var, c1368a, 22), continuation);
                return objCollect7 == CoroutineSingletons.COROUTINE_SUSPENDED ? objCollect7 : xfaVar;
            case 7:
                Object objCollect8 = c83Var.collect(new xi7(e83Var, c1368a, 23), continuation);
                return objCollect8 == CoroutineSingletons.COROUTINE_SUSPENDED ? objCollect8 : xfaVar;
            case 8:
                Object objCollect9 = c83Var.collect(new xi7(e83Var, c1368a, 21), continuation);
                return objCollect9 == CoroutineSingletons.COROUTINE_SUSPENDED ? objCollect9 : xfaVar;
            case 9:
                Object objCollect10 = c83Var.collect(new xi7(e83Var, c1368a, 24), continuation);
                return objCollect10 == CoroutineSingletons.COROUTINE_SUSPENDED ? objCollect10 : xfaVar;
            default:
                Object objCollect11 = c83Var.collect(new xi7(e83Var, c1368a, 25), continuation);
                return objCollect11 == CoroutineSingletons.COROUTINE_SUSPENDED ? objCollect11 : xfaVar;
        }
    }
}
