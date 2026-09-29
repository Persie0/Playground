package androidx.room.coroutines;

import kotlin.coroutines.jvm.internal.ContinuationImpl;
import p000.c32;
import p000.ni1;
import p000.vi3;

/* JADX INFO: loaded from: classes2.dex */
@c32(m4290c = "androidx.room.coroutines.PooledConnectionImpl", m4291f = "ConnectionPoolImpl.kt", m4292l = {640}, m4293m = "usePrepared")
final class PooledConnectionImpl$usePrepared$1<R> extends ContinuationImpl {

    /* JADX INFO: renamed from: a */
    public String f6912a;

    /* JADX INFO: renamed from: b */
    public vi3 f6913b;

    /* JADX INFO: renamed from: c */
    public ni1 f6914c;

    /* JADX INFO: renamed from: d */
    public /* synthetic */ Object f6915d;

    /* JADX INFO: renamed from: e */
    public final /* synthetic */ C0744e f6916e;

    /* JADX INFO: renamed from: f */
    public int f6917f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PooledConnectionImpl$usePrepared$1(C0744e c0744e, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.f6916e = c0744e;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.f6915d = obj;
        this.f6917f |= Integer.MIN_VALUE;
        return this.f6916e.mo2817d(null, null, this);
    }
}
