package kotlinx.coroutines;

import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.internal.Ref$ObjectRef;
import p000.c32;

/* JADX INFO: loaded from: classes.dex */
@c32(m4290c = "kotlinx.coroutines.TimeoutKt", m4291f = "Timeout.kt", m4292l = {156}, m4293m = "withTimeoutOrNull", m4294v = 1)
final class TimeoutKt$withTimeoutOrNull$1<T> extends ContinuationImpl {

    /* JADX INFO: renamed from: a */
    public Ref$ObjectRef f47760a;

    /* JADX INFO: renamed from: b */
    public /* synthetic */ Object f47761b;

    /* JADX INFO: renamed from: c */
    public int f47762c;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.f47761b = obj;
        this.f47762c |= Integer.MIN_VALUE;
        return AbstractC3208a.m15447n(0L, null, this);
    }
}
