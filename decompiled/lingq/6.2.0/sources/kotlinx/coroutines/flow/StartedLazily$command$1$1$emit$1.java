package kotlinx.coroutines.flow;

import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import p000.c32;

/* JADX INFO: loaded from: classes3.dex */
@c32(m4290c = "kotlinx.coroutines.flow.StartedLazily$command$1$1", m4291f = "SharingStarted.kt", m4292l = {155}, m4293m = "emit", m4294v = 1)
final class StartedLazily$command$1$1$emit$1 extends ContinuationImpl {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f48029a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ C3242j f48030b;

    /* JADX INFO: renamed from: c */
    public int f48031c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public StartedLazily$command$1$1$emit$1(C3242j c3242j, Continuation continuation) {
        super(continuation);
        this.f48030b = c3242j;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.f48029a = obj;
        this.f48031c |= Integer.MIN_VALUE;
        return this.f48030b.m15569a(0, this);
    }
}
