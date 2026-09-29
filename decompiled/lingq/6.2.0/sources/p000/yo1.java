package p000;

import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;

/* JADX INFO: loaded from: classes.dex */
public final class yo1 implements c83 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f70138a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ i93 f70139b;

    public /* synthetic */ yo1(i93 i93Var, int i) {
        this.f70138a = i;
        this.f70139b = i93Var;
    }

    @Override // p000.c83
    public final Object collect(e83 e83Var, Continuation continuation) {
        int i = this.f70138a;
        xfa xfaVar = xfa.f68157a;
        i93 i93Var = this.f70139b;
        switch (i) {
            case 0:
                Object objCollect = i93Var.collect(new C3502ql(e83Var, 2), continuation);
                return objCollect == CoroutineSingletons.COROUTINE_SUSPENDED ? objCollect : xfaVar;
            case 1:
                Object objCollect2 = i93Var.collect(new C3502ql(e83Var, 3), continuation);
                return objCollect2 == CoroutineSingletons.COROUTINE_SUSPENDED ? objCollect2 : xfaVar;
            case 2:
                Object objCollect3 = i93Var.collect(new C3502ql(e83Var, 8), continuation);
                return objCollect3 == CoroutineSingletons.COROUTINE_SUSPENDED ? objCollect3 : xfaVar;
            case 3:
                Object objCollect4 = i93Var.collect(new C3502ql(e83Var, 9), continuation);
                return objCollect4 == CoroutineSingletons.COROUTINE_SUSPENDED ? objCollect4 : xfaVar;
            default:
                Object objCollect5 = i93Var.collect(new C3502ql(e83Var, 15), continuation);
                return objCollect5 == CoroutineSingletons.COROUTINE_SUSPENDED ? objCollect5 : xfaVar;
        }
    }
}
