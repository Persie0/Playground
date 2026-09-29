package p000;

import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;

/* JADX INFO: loaded from: classes.dex */
public final class i83 implements c83 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f43680a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ Object f43681b;

    public /* synthetic */ i83(Object obj, int i) {
        this.f43680a = i;
        this.f43681b = obj;
    }

    @Override // p000.c83
    public final Object collect(e83 e83Var, Continuation continuation) throws Throwable {
        int i = this.f43680a;
        xfa xfaVar = xfa.f68157a;
        Object obj = this.f43681b;
        switch (i) {
            case 0:
                Object objCollect = ((m83) obj).collect(new C3502ql(e83Var, 6), continuation);
                return objCollect == CoroutineSingletons.COROUTINE_SUSPENDED ? objCollect : xfaVar;
            default:
                Object objEmit = e83Var.emit(obj, continuation);
                return objEmit == CoroutineSingletons.COROUTINE_SUSPENDED ? objEmit : xfaVar;
        }
    }
}
