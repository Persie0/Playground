package p000;

import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;

/* JADX INFO: loaded from: classes2.dex */
public final class dx0 implements c83 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f36350a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ c83 f36351b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ String f36352c;

    public /* synthetic */ dx0(c83 c83Var, String str, int i) {
        this.f36350a = i;
        this.f36351b = c83Var;
        this.f36352c = str;
    }

    @Override // p000.c83
    public final Object collect(e83 e83Var, Continuation continuation) {
        int i = this.f36350a;
        xfa xfaVar = xfa.f68157a;
        String str = this.f36352c;
        c83 c83Var = this.f36351b;
        switch (i) {
            case 0:
                Object objCollect = c83Var.collect(new cx0(e83Var, str, 0), continuation);
                return objCollect == CoroutineSingletons.COROUTINE_SUSPENDED ? objCollect : xfaVar;
            default:
                Object objCollect2 = c83Var.collect(new cx0(e83Var, str, 1), continuation);
                return objCollect2 == CoroutineSingletons.COROUTINE_SUSPENDED ? objCollect2 : xfaVar;
        }
    }
}
