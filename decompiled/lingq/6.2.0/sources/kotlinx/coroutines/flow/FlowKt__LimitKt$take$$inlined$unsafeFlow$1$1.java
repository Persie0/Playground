package kotlinx.coroutines.flow;

import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import p000.C3540rl;
import p000.c32;

/* JADX INFO: loaded from: classes3.dex */
@c32(m4290c = "kotlinx.coroutines.flow.FlowKt__LimitKt$take$$inlined$unsafeFlow$1", m4291f = "Limit.kt", m4292l = {115}, m4293m = "collect", m4294v = 1)
public final class FlowKt__LimitKt$take$$inlined$unsafeFlow$1$1 extends ContinuationImpl {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f47892a;

    /* JADX INFO: renamed from: b */
    public int f47893b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ C3540rl f47894c;

    /* JADX INFO: renamed from: d */
    public Object f47895d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FlowKt__LimitKt$take$$inlined$unsafeFlow$1$1(C3540rl c3540rl, Continuation continuation) {
        super(continuation);
        this.f47894c = c3540rl;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.f47892a = obj;
        this.f47893b |= Integer.MIN_VALUE;
        return this.f47894c.collect(null, this);
    }
}
