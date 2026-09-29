package p000;

import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;

/* JADX INFO: loaded from: classes.dex */
public final class zv8 implements e83 {

    /* JADX INFO: renamed from: a */
    public final yv8 f72284a;

    public zv8(ll7 ll7Var) {
        this.f72284a = ll7Var;
    }

    @Override // p000.e83
    public final Object emit(Object obj, Continuation continuation) {
        Object objMo4678m = this.f72284a.mo4678m(obj, continuation);
        return objMo4678m == CoroutineSingletons.COROUTINE_SUSPENDED ? objMo4678m : xfa.f68157a;
    }
}
