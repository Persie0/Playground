package kotlinx.coroutines.flow;

import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import p000.c32;

/* JADX INFO: loaded from: classes.dex */
@c32(m4290c = "kotlinx.coroutines.flow.FlowKt__ErrorsKt$catchImpl$2", m4291f = "Errors.kt", m4292l = {154}, m4293m = "emit", m4294v = 1)
final class FlowKt__ErrorsKt$catchImpl$2$emit$1 extends ContinuationImpl {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f47871a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ C3226f f47872b;

    /* JADX INFO: renamed from: c */
    public int f47873c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FlowKt__ErrorsKt$catchImpl$2$emit$1(C3226f c3226f, Continuation continuation) {
        super(continuation);
        this.f47872b = c3226f;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.f47871a = obj;
        this.f47873c |= Integer.MIN_VALUE;
        return this.f47872b.emit(null, this);
    }
}
