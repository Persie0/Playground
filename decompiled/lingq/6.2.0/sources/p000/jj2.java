package p000;

import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;

/* JADX INFO: loaded from: classes2.dex */
public final class jj2 implements c83 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f45605a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ c83 f45606b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ int f45607c;

    public /* synthetic */ jj2(c83 c83Var, int i, int i2) {
        this.f45605a = i2;
        this.f45606b = c83Var;
        this.f45607c = i;
    }

    @Override // p000.c83
    public final Object collect(e83 e83Var, Continuation continuation) {
        int i = this.f45605a;
        xfa xfaVar = xfa.f68157a;
        int i2 = this.f45607c;
        c83 c83Var = this.f45606b;
        switch (i) {
            case 0:
                Object objCollect = c83Var.collect(new ij2(e83Var, i2, 0), continuation);
                return objCollect == CoroutineSingletons.COROUTINE_SUSPENDED ? objCollect : xfaVar;
            case 1:
                Object objCollect2 = c83Var.collect(new ij2(e83Var, i2, 1), continuation);
                return objCollect2 == CoroutineSingletons.COROUTINE_SUSPENDED ? objCollect2 : xfaVar;
            case 2:
                Object objCollect3 = c83Var.collect(new ij2(e83Var, i2, 2), continuation);
                return objCollect3 == CoroutineSingletons.COROUTINE_SUSPENDED ? objCollect3 : xfaVar;
            default:
                Object objCollect4 = c83Var.collect(new ij2(e83Var, i2, 3), continuation);
                return objCollect4 == CoroutineSingletons.COROUTINE_SUSPENDED ? objCollect4 : xfaVar;
        }
    }
}
