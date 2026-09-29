package androidx.room.coroutines;

import kotlin.coroutines.jvm.internal.ContinuationImpl;
import p000.c32;
import p000.ni1;

/* JADX INFO: loaded from: classes2.dex */
@c32(m4290c = "androidx.room.coroutines.PooledConnectionImpl", m4291f = "ConnectionPoolImpl.kt", m4292l = {629}, m4293m = "endTransaction")
final class PooledConnectionImpl$endTransaction$1 extends ContinuationImpl {

    /* JADX INFO: renamed from: a */
    public boolean f6901a;

    /* JADX INFO: renamed from: b */
    public ni1 f6902b;

    /* JADX INFO: renamed from: c */
    public /* synthetic */ Object f6903c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ C0744e f6904d;

    /* JADX INFO: renamed from: e */
    public int f6905e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PooledConnectionImpl$endTransaction$1(C0744e c0744e, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.f6904d = c0744e;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.f6903c = obj;
        this.f6905e |= Integer.MIN_VALUE;
        return this.f6904d.m2825f(false, this);
    }
}
