package kotlinx.coroutines.flow;

import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import p000.C3502ql;
import p000.c32;

/* JADX INFO: loaded from: classes.dex */
@c32(m4290c = "kotlinx.coroutines.flow.FlowKt__TransformKt$filterNotNull$$inlined$unsafeTransform$1$2", m4291f = "Transform.kt", m4292l = {217}, m4293m = "emit", m4294v = 1)
public final class FlowKt__TransformKt$filterNotNull$$inlined$unsafeTransform$1$2$1 extends ContinuationImpl {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f47940a;

    /* JADX INFO: renamed from: b */
    public int f47941b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ C3502ql f47942c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FlowKt__TransformKt$filterNotNull$$inlined$unsafeTransform$1$2$1(C3502ql c3502ql, Continuation continuation) {
        super(continuation);
        this.f47942c = c3502ql;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.f47940a = obj;
        this.f47941b |= Integer.MIN_VALUE;
        return this.f47942c.emit(null, this);
    }
}
