package kotlinx.coroutines.flow;

import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.internal.Ref$ObjectRef;
import p000.c32;

/* JADX INFO: loaded from: classes.dex */
@c32(m4290c = "kotlinx.coroutines.flow.FlowKt__TransformKt$runningFold$1$1", m4291f = "Transform.kt", m4292l = {105, 106}, m4293m = "emit", m4294v = 1)
final class FlowKt__TransformKt$runningFold$1$1$emit$1 extends ContinuationImpl {

    /* JADX INFO: renamed from: a */
    public Ref$ObjectRef f47955a;

    /* JADX INFO: renamed from: b */
    public /* synthetic */ Object f47956b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ C3223c f47957c;

    /* JADX INFO: renamed from: d */
    public int f47958d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FlowKt__TransformKt$runningFold$1$1$emit$1(C3223c c3223c, Continuation continuation) {
        super(continuation);
        this.f47957c = c3223c;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.f47956b = obj;
        this.f47958d |= Integer.MIN_VALUE;
        return this.f47957c.emit(null, this);
    }
}
