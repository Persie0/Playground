package kotlinx.coroutines.flow;

import kotlin.coroutines.jvm.internal.ContinuationImpl;
import p000.c32;
import p000.ll7;

/* JADX INFO: loaded from: classes.dex */
@c32(m4290c = "kotlinx.coroutines.flow.CallbackFlowBuilder", m4291f = "Builders.kt", m4292l = {330}, m4293m = "collectTo", m4294v = 1)
final class CallbackFlowBuilder$collectTo$1 extends ContinuationImpl {

    /* JADX INFO: renamed from: a */
    public ll7 f47804a;

    /* JADX INFO: renamed from: b */
    public /* synthetic */ Object f47805b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ C3222b f47806c;

    /* JADX INFO: renamed from: d */
    public int f47807d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CallbackFlowBuilder$collectTo$1(C3222b c3222b, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.f47806c = c3222b;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.f47805b = obj;
        this.f47807d |= Integer.MIN_VALUE;
        return this.f47806c.mo10648d(null, this);
    }
}
