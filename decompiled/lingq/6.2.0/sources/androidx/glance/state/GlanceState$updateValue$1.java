package androidx.glance.state;

import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import p000.c32;

/* JADX INFO: loaded from: classes2.dex */
@c32(m4290c = "androidx.glance.state.GlanceState", m4291f = "GlanceStateDefinition.kt", m4292l = {119, 119}, m4293m = "updateValue", m4294v = 1)
final class GlanceState$updateValue$1<T> extends ContinuationImpl {

    /* JADX INFO: renamed from: a */
    public SuspendLambda f6301a;

    /* JADX INFO: renamed from: b */
    public /* synthetic */ Object f6302b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ C0703a f6303c;

    /* JADX INFO: renamed from: d */
    public int f6304d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GlanceState$updateValue$1(C0703a c0703a, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.f6303c = c0703a;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.f6302b = obj;
        this.f6304d |= Integer.MIN_VALUE;
        return this.f6303c.m2505d(null, null, null, null, this);
    }
}
