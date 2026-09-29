package kotlinx.coroutines.flow.internal;

import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import p000.c32;

/* JADX INFO: loaded from: classes.dex */
@c32(m4290c = "kotlinx.coroutines.flow.internal.ChannelFlowTransformLatest$flowCollect$3$1", m4291f = "Merge.kt", m4292l = {26}, m4293m = "emit", m4294v = 1)
final class ChannelFlowTransformLatest$flowCollect$3$1$emit$1 extends ContinuationImpl {

    /* JADX INFO: renamed from: a */
    public Object f48093a;

    /* JADX INFO: renamed from: b */
    public /* synthetic */ Object f48094b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ C3234d f48095c;

    /* JADX INFO: renamed from: d */
    public int f48096d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ChannelFlowTransformLatest$flowCollect$3$1$emit$1(C3234d c3234d, Continuation continuation) {
        super(continuation);
        this.f48095c = c3234d;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.f48094b = obj;
        this.f48096d |= Integer.MIN_VALUE;
        return this.f48095c.emit(null, this);
    }
}
