package kotlinx.coroutines.flow;

import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import p000.c32;

/* JADX INFO: loaded from: classes.dex */
@c32(m4290c = "kotlinx.coroutines.flow.FlowKt__LimitKt$drop$2$1", m4291f = "Limit.kt", m4292l = {22}, m4293m = "emit", m4294v = 1)
final class FlowKt__LimitKt$drop$2$1$emit$1 extends ContinuationImpl {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f47882a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ C3226f f47883b;

    /* JADX INFO: renamed from: c */
    public int f47884c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FlowKt__LimitKt$drop$2$1$emit$1(C3226f c3226f, Continuation continuation) {
        super(continuation);
        this.f47883b = c3226f;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.f47882a = obj;
        this.f47884c |= Integer.MIN_VALUE;
        return this.f47883b.emit(null, this);
    }
}
