package kotlinx.coroutines.flow;

import kotlin.coroutines.jvm.internal.ContinuationImpl;
import p000.c32;

/* JADX INFO: loaded from: classes.dex */
@c32(m4290c = "kotlinx.coroutines.flow.FlowKt__EmittersKt", m4291f = "Emitters.kt", m4292l = {210}, m4293m = "invokeSafely$FlowKt__EmittersKt", m4294v = 1)
final class FlowKt__EmittersKt$invokeSafely$1<T> extends ContinuationImpl {

    /* JADX INFO: renamed from: a */
    public Throwable f47848a;

    /* JADX INFO: renamed from: b */
    public /* synthetic */ Object f47849b;

    /* JADX INFO: renamed from: c */
    public int f47850c;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.f47849b = obj;
        this.f47850c |= Integer.MIN_VALUE;
        return AbstractC3224d.m15523b(null, null, null, this);
    }
}
