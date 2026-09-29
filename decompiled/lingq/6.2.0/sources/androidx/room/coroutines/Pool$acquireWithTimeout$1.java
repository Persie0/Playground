package androidx.room.coroutines;

import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.internal.Ref$ObjectRef;
import p000.c32;
import p000.ui3;

/* JADX INFO: loaded from: classes2.dex */
@c32(m4290c = "androidx.room.coroutines.Pool", m4291f = "ConnectionPoolImpl.kt", m4292l = {231}, m4293m = "acquireWithTimeout-KLykuaI")
final class Pool$acquireWithTimeout$1 extends ContinuationImpl {

    /* JADX INFO: renamed from: a */
    public long f6886a;

    /* JADX INFO: renamed from: b */
    public ui3 f6887b;

    /* JADX INFO: renamed from: c */
    public Ref$ObjectRef f6888c;

    /* JADX INFO: renamed from: d */
    public /* synthetic */ Object f6889d;

    /* JADX INFO: renamed from: e */
    public final /* synthetic */ C0743d f6890e;

    /* JADX INFO: renamed from: f */
    public int f6891f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Pool$acquireWithTimeout$1(C0743d c0743d, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.f6890e = c0743d;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.f6889d = obj;
        this.f6891f |= Integer.MIN_VALUE;
        return this.f6890e.m2820b(0L, null, this);
    }
}
