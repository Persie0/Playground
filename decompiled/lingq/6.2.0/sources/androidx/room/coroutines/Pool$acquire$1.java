package androidx.room.coroutines;

import kotlin.coroutines.jvm.internal.ContinuationImpl;
import p000.c32;

/* JADX INFO: loaded from: classes2.dex */
@c32(m4290c = "androidx.room.coroutines.Pool", m4291f = "ConnectionPoolImpl.kt", m4292l = {253}, m4293m = "acquire")
final class Pool$acquire$1 extends ContinuationImpl {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f6883a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ C0743d f6884b;

    /* JADX INFO: renamed from: c */
    public int f6885c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Pool$acquire$1(C0743d c0743d, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.f6884b = c0743d;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.f6883a = obj;
        this.f6885c |= Integer.MIN_VALUE;
        return this.f6884b.m2819a(this);
    }
}
