package p000;

import com.lingq.core.datastore.C1372e;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;

/* JADX INFO: loaded from: classes.dex */
public final class u2b implements c83 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f63331a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ c83 f63332b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ C1372e f63333c;

    public /* synthetic */ u2b(c83 c83Var, C1372e c1372e, int i) {
        this.f63331a = i;
        this.f63332b = c83Var;
        this.f63333c = c1372e;
    }

    @Override // p000.c83
    public final Object collect(e83 e83Var, Continuation continuation) {
        int i = this.f63331a;
        xfa xfaVar = xfa.f68157a;
        C1372e c1372e = this.f63333c;
        c83 c83Var = this.f63332b;
        switch (i) {
            case 0:
                Object objCollect = c83Var.collect(new t2b(e83Var, c1372e, 0), continuation);
                return objCollect == CoroutineSingletons.COROUTINE_SUSPENDED ? objCollect : xfaVar;
            case 1:
                Object objCollect2 = c83Var.collect(new v2b(e83Var, c1372e, 0), continuation);
                return objCollect2 == CoroutineSingletons.COROUTINE_SUSPENDED ? objCollect2 : xfaVar;
            case 2:
                Object objCollect3 = c83Var.collect(new t2b(e83Var, c1372e, 1), continuation);
                return objCollect3 == CoroutineSingletons.COROUTINE_SUSPENDED ? objCollect3 : xfaVar;
            default:
                Object objCollect4 = c83Var.collect(new v2b(e83Var, c1372e, 1), continuation);
                return objCollect4 == CoroutineSingletons.COROUTINE_SUSPENDED ? objCollect4 : xfaVar;
        }
    }
}
