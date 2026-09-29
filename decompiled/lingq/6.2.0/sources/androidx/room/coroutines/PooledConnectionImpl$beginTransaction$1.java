package androidx.room.coroutines;

import androidx.room.Transactor$SQLiteTransactionType;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import p000.c32;
import p000.ni1;

/* JADX INFO: loaded from: classes2.dex */
@c32(m4290c = "androidx.room.coroutines.PooledConnectionImpl", m4291f = "ConnectionPoolImpl.kt", m4292l = {629}, m4293m = "beginTransaction")
final class PooledConnectionImpl$beginTransaction$1 extends ContinuationImpl {

    /* JADX INFO: renamed from: a */
    public Transactor$SQLiteTransactionType f6896a;

    /* JADX INFO: renamed from: b */
    public ni1 f6897b;

    /* JADX INFO: renamed from: c */
    public /* synthetic */ Object f6898c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ C0744e f6899d;

    /* JADX INFO: renamed from: e */
    public int f6900e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PooledConnectionImpl$beginTransaction$1(C0744e c0744e, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.f6899d = c0744e;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.f6898c = obj;
        this.f6900e |= Integer.MIN_VALUE;
        return this.f6899d.m2824e(null, this);
    }
}
