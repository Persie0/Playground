package kotlinx.coroutines.flow;

import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import p000.c32;
import p000.r83;

/* JADX INFO: loaded from: classes.dex */
@c32(m4290c = "kotlinx.coroutines.flow.FlowKt__ReduceKt$first$$inlined$collectWhile$2", m4291f = "Reduce.kt", m4292l = {142}, m4293m = "emit", m4294v = 1)
public final class FlowKt__ReduceKt$first$$inlined$collectWhile$2$1 extends ContinuationImpl {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f47913a;

    /* JADX INFO: renamed from: b */
    public int f47914b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ r83 f47915c;

    /* JADX INFO: renamed from: d */
    public Object f47916d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FlowKt__ReduceKt$first$$inlined$collectWhile$2$1(r83 r83Var, Continuation continuation) {
        super(continuation);
        this.f47915c = r83Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.f47913a = obj;
        this.f47914b |= Integer.MIN_VALUE;
        return this.f47915c.emit(null, this);
    }
}
