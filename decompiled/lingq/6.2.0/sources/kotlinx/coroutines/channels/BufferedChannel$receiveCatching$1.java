package kotlinx.coroutines.channels;

import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import p000.c32;
import p000.ju0;

/* JADX INFO: loaded from: classes.dex */
@c32(m4290c = "kotlinx.coroutines.channels.BufferedChannel", m4291f = "BufferedChannel.kt", m4292l = {736}, m4293m = "receiveCatching-JP2dKIU$suspendImpl", m4294v = 1)
final class BufferedChannel$receiveCatching$1<E> extends ContinuationImpl {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f47768a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ C3211a f47769b;

    /* JADX INFO: renamed from: c */
    public int f47770c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BufferedChannel$receiveCatching$1(C3211a c3211a, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.f47769b = c3211a;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.f47768a = obj;
        this.f47770c |= Integer.MIN_VALUE;
        Object objM15449J = C3211a.m15449J(this.f47769b, this);
        return objM15449J == CoroutineSingletons.COROUTINE_SUSPENDED ? objM15449J : new ju0(objM15449J);
    }
}
