package androidx.room.coroutines;

import kotlin.coroutines.jvm.internal.ContinuationImpl;
import p000.c32;

/* JADX INFO: loaded from: classes.dex */
@c32(m4290c = "androidx.room.coroutines.PassthroughConnection", m4291f = "PassthroughConnectionPool.kt", m4292l = {127}, m4293m = "transaction")
final class PassthroughConnection$transaction$1<R> extends ContinuationImpl {

    /* JADX INFO: renamed from: a */
    public int f6864a;

    /* JADX INFO: renamed from: b */
    public /* synthetic */ Object f6865b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ C0741b f6866c;

    /* JADX INFO: renamed from: d */
    public int f6867d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PassthroughConnection$transaction$1(C0741b c0741b, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.f6866c = c0741b;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.f6865b = obj;
        this.f6867d |= Integer.MIN_VALUE;
        return this.f6866c.m2818e(null, null, this);
    }
}
