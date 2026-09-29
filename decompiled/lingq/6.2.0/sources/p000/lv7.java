package p000;

import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;

/* JADX INFO: loaded from: classes3.dex */
public final class lv7 implements c83 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ c83 f50193a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ boolean f50194b;

    public lv7(c18 c18Var, boolean z) {
        this.f50193a = c18Var;
        this.f50194b = z;
    }

    @Override // p000.c83
    public final Object collect(e83 e83Var, Continuation continuation) {
        Object objCollect = this.f50193a.collect(new kv7(e83Var, this.f50194b), continuation);
        return objCollect == CoroutineSingletons.COROUTINE_SUSPENDED ? objCollect : xfa.f68157a;
    }
}
