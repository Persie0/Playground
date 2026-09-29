package androidx.glance.session;

import android.content.Context;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import p000.c32;

/* JADX INFO: loaded from: classes2.dex */
@c32(m4290c = "androidx.glance.session.SessionManagerImpl$scope$1", m4291f = "SessionManager.kt", m4292l = {122, 128}, m4293m = "startSession", m4294v = 1)
final class SessionManagerImpl$scope$1$startSession$1 extends ContinuationImpl {

    /* JADX INFO: renamed from: a */
    public Context f6154a;

    /* JADX INFO: renamed from: b */
    public /* synthetic */ Object f6155b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ C0697e f6156c;

    /* JADX INFO: renamed from: d */
    public int f6157d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SessionManagerImpl$scope$1$startSession$1(C0697e c0697e, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.f6156c = c0697e;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.f6155b = obj;
        this.f6157d |= Integer.MIN_VALUE;
        return this.f6156c.m2496c(null, null, this);
    }
}
