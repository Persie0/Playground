package androidx.glance.session;

import kotlin.coroutines.jvm.internal.ContinuationImpl;
import p000.c32;

/* JADX INFO: loaded from: classes2.dex */
@c32(m4290c = "androidx.glance.session.SessionWorker", m4291f = "SessionWorker.kt", m4292l = {103, 124, 155, 151, 155, 155}, m4293m = "doWork", m4294v = 1)
final class SessionWorker$doWork$1 extends ContinuationImpl {

    /* JADX INFO: renamed from: a */
    public int f6163a;

    /* JADX INFO: renamed from: b */
    public Object f6164b;

    /* JADX INFO: renamed from: c */
    public /* synthetic */ Object f6165c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ SessionWorker f6166d;

    /* JADX INFO: renamed from: e */
    public int f6167e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SessionWorker$doWork$1(SessionWorker sessionWorker, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.f6166d = sessionWorker;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.f6165c = obj;
        this.f6167e |= Integer.MIN_VALUE;
        return this.f6166d.mo2213d(this);
    }
}
