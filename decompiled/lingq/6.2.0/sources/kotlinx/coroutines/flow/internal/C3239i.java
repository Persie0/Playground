package kotlinx.coroutines.flow.internal;

import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import p000.aj3;
import p000.c83;
import p000.e83;
import p000.g83;
import p000.pfa;
import p000.xfa;

/* JADX INFO: renamed from: kotlinx.coroutines.flow.internal.i */
/* JADX INFO: loaded from: classes.dex */
public final class C3239i implements c83 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ aj3 f48145a;

    public C3239i(aj3 aj3Var) {
        this.f48145a = aj3Var;
    }

    @Override // p000.c83
    public final Object collect(e83 e83Var, Continuation continuation) {
        FlowCoroutineKt$scopedFlow$1$1 flowCoroutineKt$scopedFlow$1$1 = new FlowCoroutineKt$scopedFlow$1$1(this.f48145a, e83Var, null);
        g83 g83Var = new g83(continuation.getContext(), continuation);
        Object objM19112b = pfa.m19112b(g83Var, true, g83Var, flowCoroutineKt$scopedFlow$1$1);
        return objM19112b == CoroutineSingletons.COROUTINE_SUSPENDED ? objM19112b : xfa.f68157a;
    }
}
