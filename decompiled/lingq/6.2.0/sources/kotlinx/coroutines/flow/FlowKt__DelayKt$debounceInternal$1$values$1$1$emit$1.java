package kotlinx.coroutines.flow;

import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import p000.c32;

/* JADX INFO: loaded from: classes.dex */
@c32(m4290c = "kotlinx.coroutines.flow.FlowKt__DelayKt$debounceInternal$1$values$1$1", m4291f = "Delay.kt", m4292l = {204}, m4293m = "emit", m4294v = 1)
final class FlowKt__DelayKt$debounceInternal$1$values$1$1$emit$1 extends ContinuationImpl {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f47845a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ C3225e f47846b;

    /* JADX INFO: renamed from: c */
    public int f47847c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FlowKt__DelayKt$debounceInternal$1$values$1$1$emit$1(C3225e c3225e, Continuation continuation) {
        super(continuation);
        this.f47846b = c3225e;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.f47845a = obj;
        this.f47847c |= Integer.MIN_VALUE;
        return this.f47846b.emit(null, this);
    }
}
