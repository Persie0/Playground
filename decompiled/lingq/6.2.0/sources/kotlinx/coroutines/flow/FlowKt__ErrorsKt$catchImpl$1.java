package kotlinx.coroutines.flow;

import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.internal.Ref$ObjectRef;
import p000.c32;

/* JADX INFO: loaded from: classes.dex */
@c32(m4290c = "kotlinx.coroutines.flow.FlowKt__ErrorsKt", m4291f = "Errors.kt", m4292l = {152}, m4293m = "catchImpl", m4294v = 1)
final class FlowKt__ErrorsKt$catchImpl$1<T> extends ContinuationImpl {

    /* JADX INFO: renamed from: a */
    public Ref$ObjectRef f47868a;

    /* JADX INFO: renamed from: b */
    public /* synthetic */ Object f47869b;

    /* JADX INFO: renamed from: c */
    public int f47870c;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.f47869b = obj;
        this.f47870c |= Integer.MIN_VALUE;
        return AbstractC3224d.m15527f(null, null, this);
    }
}
