package androidx.glance.session;

import kotlin.coroutines.jvm.internal.ContinuationImpl;
import p000.c32;

/* JADX INFO: loaded from: classes2.dex */
@c32(m4290c = "androidx.glance.session.WorkManagerProxy$Companion$Default$1", m4291f = "SessionManager.kt", m4292l = {211}, m4293m = "workerIsRunningOrEnqueued", m4294v = 1)
final class WorkManagerProxy$Companion$Default$1$workerIsRunningOrEnqueued$1 extends ContinuationImpl {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f6255a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ C0702j f6256b;

    /* JADX INFO: renamed from: c */
    public int f6257c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public WorkManagerProxy$Companion$Default$1$workerIsRunningOrEnqueued$1(C0702j c0702j, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.f6256b = c0702j;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.f6255a = obj;
        this.f6257c |= Integer.MIN_VALUE;
        return this.f6256b.m2501a(null, null, this);
    }
}
