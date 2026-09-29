package p000;

import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.jvm.internal.Ref$ObjectRef;
import kotlinx.coroutines.flow.C3223c;

/* JADX INFO: loaded from: classes.dex */
public final class fi2 implements c83 {

    /* JADX INFO: renamed from: a */
    public final c83 f39137a;

    /* JADX INFO: renamed from: b */
    public final zi3 f39138b;

    public fi2(c83 c83Var, zi3 zi3Var) {
        this.f39137a = c83Var;
        this.f39138b = zi3Var;
    }

    @Override // p000.c83
    public final Object collect(e83 e83Var, Continuation continuation) {
        Ref$ObjectRef ref$ObjectRef = new Ref$ObjectRef();
        ref$ObjectRef.f47718a = thb.f62314j;
        Object objCollect = this.f39137a.collect(new C3223c(this, ref$ObjectRef, e83Var), continuation);
        return objCollect == CoroutineSingletons.COROUTINE_SUSPENDED ? objCollect : xfa.f68157a;
    }
}
