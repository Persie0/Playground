package p000;

import com.lingq.core.settings.review.C1880a;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;

/* JADX INFO: loaded from: classes2.dex */
public final class bg8 implements c83 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f8513a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ n83 f8514b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ C1880a f8515c;

    public /* synthetic */ bg8(n83 n83Var, C1880a c1880a, int i) {
        this.f8513a = i;
        this.f8514b = n83Var;
        this.f8515c = c1880a;
    }

    @Override // p000.c83
    public final Object collect(e83 e83Var, Continuation continuation) throws Throwable {
        int i = this.f8513a;
        xfa xfaVar = xfa.f68157a;
        C1880a c1880a = this.f8515c;
        n83 n83Var = this.f8514b;
        switch (i) {
            case 0:
                Object objCollect = n83Var.collect(new ag8(e83Var, c1880a, 0), continuation);
                return objCollect == CoroutineSingletons.COROUTINE_SUSPENDED ? objCollect : xfaVar;
            default:
                Object objCollect2 = n83Var.collect(new ag8(e83Var, c1880a, 3), continuation);
                return objCollect2 == CoroutineSingletons.COROUTINE_SUSPENDED ? objCollect2 : xfaVar;
        }
    }
}
