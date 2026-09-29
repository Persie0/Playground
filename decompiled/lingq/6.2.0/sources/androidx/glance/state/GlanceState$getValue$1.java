package androidx.glance.state;

import kotlin.coroutines.jvm.internal.ContinuationImpl;
import p000.c32;

/* JADX INFO: loaded from: classes2.dex */
@c32(m4290c = "androidx.glance.state.GlanceState", m4291f = "GlanceStateDefinition.kt", m4292l = {112, 112}, m4293m = "getValue", m4294v = 1)
final class GlanceState$getValue$1<T> extends ContinuationImpl {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f6298a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ C0703a f6299b;

    /* JADX INFO: renamed from: c */
    public int f6300c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GlanceState$getValue$1(C0703a c0703a, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.f6299b = c0703a;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.f6298a = obj;
        this.f6300c |= Integer.MIN_VALUE;
        return this.f6299b.m2504c(null, null, null, this);
    }
}
