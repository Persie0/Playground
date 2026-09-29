package kotlinx.coroutines.flow;

import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import p000.c32;

/* JADX INFO: loaded from: classes3.dex */
@c32(m4290c = "kotlinx.coroutines.flow.FlowKt__LimitKt$take$2$1", m4291f = "Limit.kt", m4292l = {59, 61}, m4293m = "emit", m4294v = 1)
final class FlowKt__LimitKt$take$2$1$emit$1 extends ContinuationImpl {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f47896a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ C3227g f47897b;

    /* JADX INFO: renamed from: c */
    public int f47898c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FlowKt__LimitKt$take$2$1$emit$1(C3227g c3227g, Continuation continuation) {
        super(continuation);
        this.f47897b = c3227g;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.f47896a = obj;
        this.f47898c |= Integer.MIN_VALUE;
        return this.f47897b.emit(null, this);
    }
}
