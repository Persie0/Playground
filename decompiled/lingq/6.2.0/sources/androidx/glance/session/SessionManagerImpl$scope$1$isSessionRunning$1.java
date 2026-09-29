package androidx.glance.session;

import kotlin.coroutines.jvm.internal.ContinuationImpl;
import p000.c32;

/* JADX INFO: loaded from: classes2.dex */
@c32(m4290c = "androidx.glance.session.SessionManagerImpl$scope$1", m4291f = "SessionManager.kt", m4292l = {136}, m4293m = "isSessionRunning", m4294v = 1)
final class SessionManagerImpl$scope$1$isSessionRunning$1 extends ContinuationImpl {

    /* JADX INFO: renamed from: a */
    public String f6147a;

    /* JADX INFO: renamed from: b */
    public /* synthetic */ Object f6148b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ C0697e f6149c;

    /* JADX INFO: renamed from: d */
    public int f6150d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SessionManagerImpl$scope$1$isSessionRunning$1(C0697e c0697e, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.f6149c = c0697e;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.f6148b = obj;
        this.f6150d |= Integer.MIN_VALUE;
        return this.f6149c.m2494a(null, null, this);
    }
}
