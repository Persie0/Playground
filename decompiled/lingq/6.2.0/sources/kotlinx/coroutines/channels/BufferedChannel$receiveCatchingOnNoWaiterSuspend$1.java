package kotlinx.coroutines.channels;

import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import p000.c32;
import p000.ju0;

/* JADX INFO: loaded from: classes.dex */
@c32(m4290c = "kotlinx.coroutines.channels.BufferedChannel", m4291f = "BufferedChannel.kt", m4292l = {3093}, m4293m = "receiveCatchingOnNoWaiterSuspend-GKJJFZk", m4294v = 1)
final class BufferedChannel$receiveCatchingOnNoWaiterSuspend$1 extends ContinuationImpl {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f47771a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ C3211a f47772b;

    /* JADX INFO: renamed from: c */
    public int f47773c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BufferedChannel$receiveCatchingOnNoWaiterSuspend$1(C3211a c3211a, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.f47772b = c3211a;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        this.f47771a = obj;
        this.f47773c |= Integer.MIN_VALUE;
        Object objM15461K = this.f47772b.m15461K(null, 0, 0L, this);
        return objM15461K == CoroutineSingletons.COROUTINE_SUSPENDED ? objM15461K : new ju0(objM15461K);
    }
}
