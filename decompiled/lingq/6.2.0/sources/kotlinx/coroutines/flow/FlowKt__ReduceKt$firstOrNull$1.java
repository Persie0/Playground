package kotlinx.coroutines.flow;

import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.internal.Ref$ObjectRef;
import p000.c32;
import p000.q83;

/* JADX INFO: loaded from: classes.dex */
@c32(m4290c = "kotlinx.coroutines.flow.FlowKt__ReduceKt", m4291f = "Reduce.kt", m4292l = {179}, m4293m = "firstOrNull", m4294v = 1)
final class FlowKt__ReduceKt$firstOrNull$1<T> extends ContinuationImpl {

    /* JADX INFO: renamed from: a */
    public Ref$ObjectRef f47925a;

    /* JADX INFO: renamed from: b */
    public q83 f47926b;

    /* JADX INFO: renamed from: c */
    public /* synthetic */ Object f47927c;

    /* JADX INFO: renamed from: d */
    public int f47928d;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.f47927c = obj;
        this.f47928d |= Integer.MIN_VALUE;
        return AbstractC3224d.m15542u(null, this);
    }
}
