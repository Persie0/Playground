package p000;

import com.lingq.core.settings.review.C1880a;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;

/* JADX INFO: loaded from: classes2.dex */
public final class cg8 implements c83 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f10019a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ n83 f10020b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ C1880a f10021c;

    public /* synthetic */ cg8(n83 n83Var, C1880a c1880a, int i) {
        this.f10019a = i;
        this.f10020b = n83Var;
        this.f10021c = c1880a;
    }

    @Override // p000.c83
    public final Object collect(e83 e83Var, Continuation continuation) throws Throwable {
        int i = this.f10019a;
        xfa xfaVar = xfa.f68157a;
        C1880a c1880a = this.f10021c;
        n83 n83Var = this.f10020b;
        switch (i) {
            case 0:
                Object objCollect = n83Var.collect(new ag8(e83Var, c1880a, 1), continuation);
                return objCollect == CoroutineSingletons.COROUTINE_SUSPENDED ? objCollect : xfaVar;
            default:
                Object objCollect2 = n83Var.collect(new ag8(e83Var, c1880a, 2), continuation);
                return objCollect2 == CoroutineSingletons.COROUTINE_SUSPENDED ? objCollect2 : xfaVar;
        }
    }
}
