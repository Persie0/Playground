package androidx.glance.session;

import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.sync.C3248a;
import p000.c32;

/* JADX INFO: loaded from: classes2.dex */
@c32(m4290c = "androidx.glance.session.SessionManagerImpl", m4291f = "SessionManager.kt", m4292l = {233, 170}, m4293m = "runWithLock$suspendImpl", m4294v = 1)
final class SessionManagerImpl$runWithLock$1<T> extends ContinuationImpl {

    /* JADX INFO: renamed from: a */
    public Object f6141a;

    /* JADX INFO: renamed from: b */
    public SuspendLambda f6142b;

    /* JADX INFO: renamed from: c */
    public C3248a f6143c;

    /* JADX INFO: renamed from: d */
    public /* synthetic */ Object f6144d;

    /* JADX INFO: renamed from: e */
    public final /* synthetic */ C0698f f6145e;

    /* JADX INFO: renamed from: f */
    public int f6146f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SessionManagerImpl$runWithLock$1(C0698f c0698f, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.f6145e = c0698f;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.f6144d = obj;
        this.f6146f |= Integer.MIN_VALUE;
        return C0698f.m2497b(this.f6145e, null, this);
    }
}
