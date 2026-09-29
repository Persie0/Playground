package androidx.glance.session;

import kotlin.coroutines.jvm.internal.ContinuationImpl;
import p000.c32;

/* JADX INFO: loaded from: classes2.dex */
@c32(m4290c = "androidx.glance.session.SessionManagerImpl$scope$1", m4291f = "SessionManager.kt", m4292l = {156, 159}, m4293m = "recreateOrClose", m4294v = 1)
final class SessionManagerImpl$scope$1$recreateOrClose$1 extends ContinuationImpl {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f6151a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ C0697e f6152b;

    /* JADX INFO: renamed from: c */
    public int f6153c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SessionManagerImpl$scope$1$recreateOrClose$1(C0697e c0697e, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.f6152b = c0697e;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.f6151a = obj;
        this.f6153c |= Integer.MIN_VALUE;
        return this.f6152b.m2495b(null, this);
    }
}
