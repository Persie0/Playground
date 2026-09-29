package androidx.room.coroutines;

import kotlin.coroutines.jvm.internal.ContinuationImpl;
import p000.c32;

/* JADX INFO: loaded from: classes2.dex */
@c32(m4290c = "androidx.room.coroutines.PooledConnectionImpl", m4291f = "ConnectionPoolImpl.kt", m4292l = {464, 468, 482, 482, 482}, m4293m = "transaction")
final class PooledConnectionImpl$transaction$1<R> extends ContinuationImpl {

    /* JADX INFO: renamed from: a */
    public Object f6906a;

    /* JADX INFO: renamed from: b */
    public Throwable f6907b;

    /* JADX INFO: renamed from: c */
    public int f6908c;

    /* JADX INFO: renamed from: d */
    public /* synthetic */ Object f6909d;

    /* JADX INFO: renamed from: e */
    public final /* synthetic */ C0744e f6910e;

    /* JADX INFO: renamed from: f */
    public int f6911f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PooledConnectionImpl$transaction$1(C0744e c0744e, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.f6910e = c0744e;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.f6909d = obj;
        this.f6911f |= Integer.MIN_VALUE;
        return this.f6910e.m2826g(null, null, this);
    }
}
