package androidx.glance.session;

import kotlin.coroutines.jvm.internal.ContinuationImpl;
import p000.c32;

/* JADX INFO: loaded from: classes2.dex */
@c32(m4290c = "androidx.glance.session.TimerScopeKt", m4291f = "TimerScope.kt", m4292l = {145}, m4293m = "withTimerOrNull", m4294v = 1)
final class TimerScopeKt$withTimerOrNull$1<T> extends ContinuationImpl {

    /* JADX INFO: renamed from: a */
    public Object f6252a;

    /* JADX INFO: renamed from: b */
    public /* synthetic */ Object f6253b;

    /* JADX INFO: renamed from: c */
    public int f6254c;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.f6253b = obj;
        this.f6254c |= Integer.MIN_VALUE;
        return AbstractC0693a.m2491c(null, null, this);
    }
}
