package com.lingq.core.data.workers;

import kotlin.coroutines.jvm.internal.ContinuationImpl;
import p000.c32;

/* JADX INFO: loaded from: classes2.dex */
@c32(m4290c = "com.lingq.core.data.workers.NotificationMarkAsReadWorker", m4291f = "NotificationMarkAsReadWorker.kt", m4292l = {29}, m4293m = "doWork", m4294v = 2)
final class NotificationMarkAsReadWorker$doWork$1 extends ContinuationImpl {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f16774a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ NotificationMarkAsReadWorker f16775b;

    /* JADX INFO: renamed from: c */
    public int f16776c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public NotificationMarkAsReadWorker$doWork$1(NotificationMarkAsReadWorker notificationMarkAsReadWorker, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.f16775b = notificationMarkAsReadWorker;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.f16774a = obj;
        this.f16776c |= Integer.MIN_VALUE;
        return this.f16775b.mo2213d(this);
    }
}
