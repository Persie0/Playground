package kotlinx.coroutines.flow;

import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import p000.c32;

/* JADX INFO: loaded from: classes.dex */
@c32(m4290c = "kotlinx.coroutines.flow.DistinctFlowImpl$collect$2", m4291f = "Distinct.kt", m4292l = {73}, m4293m = "emit", m4294v = 1)
final class DistinctFlowImpl$collect$2$emit$1 extends ContinuationImpl {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f47808a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ C3223c f47809b;

    /* JADX INFO: renamed from: c */
    public int f47810c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DistinctFlowImpl$collect$2$emit$1(C3223c c3223c, Continuation continuation) {
        super(continuation);
        this.f47809b = c3223c;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.f47808a = obj;
        this.f47810c |= Integer.MIN_VALUE;
        return this.f47809b.emit(null, this);
    }
}
