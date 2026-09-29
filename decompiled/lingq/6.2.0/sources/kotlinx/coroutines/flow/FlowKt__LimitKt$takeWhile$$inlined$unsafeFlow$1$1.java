package kotlinx.coroutines.flow;

import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import p000.c32;
import p000.n83;
import p000.o83;

/* JADX INFO: loaded from: classes.dex */
@c32(m4290c = "kotlinx.coroutines.flow.FlowKt__LimitKt$takeWhile$$inlined$unsafeFlow$1", m4291f = "Limit.kt", m4292l = {123}, m4293m = "collect", m4294v = 1)
public final class FlowKt__LimitKt$takeWhile$$inlined$unsafeFlow$1$1 extends ContinuationImpl {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f47899a;

    /* JADX INFO: renamed from: b */
    public int f47900b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ n83 f47901c;

    /* JADX INFO: renamed from: d */
    public o83 f47902d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FlowKt__LimitKt$takeWhile$$inlined$unsafeFlow$1$1(n83 n83Var, Continuation continuation) {
        super(continuation);
        this.f47901c = n83Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.f47899a = obj;
        this.f47900b |= Integer.MIN_VALUE;
        return this.f47901c.collect(null, this);
    }
}
