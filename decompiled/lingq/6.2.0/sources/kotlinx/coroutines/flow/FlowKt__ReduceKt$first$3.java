package kotlinx.coroutines.flow;

import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.internal.Ref$ObjectRef;
import p000.c32;
import p000.r83;

/* JADX INFO: loaded from: classes.dex */
@c32(m4290c = "kotlinx.coroutines.flow.FlowKt__ReduceKt", m4291f = "Reduce.kt", m4292l = {179}, m4293m = "first", m4294v = 1)
final class FlowKt__ReduceKt$first$3<T> extends ContinuationImpl {

    /* JADX INFO: renamed from: a */
    public Ref$ObjectRef f47921a;

    /* JADX INFO: renamed from: b */
    public r83 f47922b;

    /* JADX INFO: renamed from: c */
    public /* synthetic */ Object f47923c;

    /* JADX INFO: renamed from: d */
    public int f47924d;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.f47923c = obj;
        this.f47924d |= Integer.MIN_VALUE;
        return AbstractC3224d.m15540s(null, null, this);
    }
}
