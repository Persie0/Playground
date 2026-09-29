package kotlinx.coroutines.flow;

import kotlin.coroutines.jvm.internal.ContinuationImpl;
import p000.c32;

/* JADX INFO: loaded from: classes3.dex */
@c32(m4290c = "kotlinx.coroutines.flow.FlowKt__LimitKt", m4291f = "Limit.kt", m4292l = {71}, m4293m = "emitAbort$FlowKt__LimitKt", m4294v = 1)
final class FlowKt__LimitKt$emitAbort$1<T> extends ContinuationImpl {

    /* JADX INFO: renamed from: a */
    public Object f47889a;

    /* JADX INFO: renamed from: b */
    public /* synthetic */ Object f47890b;

    /* JADX INFO: renamed from: c */
    public int f47891c;

    public FlowKt__LimitKt$emitAbort$1(ContinuationImpl continuationImpl) {
        super(continuationImpl);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.f47890b = obj;
        this.f47891c |= Integer.MIN_VALUE;
        return AbstractC3224d.m15522a(null, null, null, this);
    }
}
