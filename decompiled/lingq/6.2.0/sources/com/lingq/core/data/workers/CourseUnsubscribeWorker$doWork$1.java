package com.lingq.core.data.workers;

import kotlin.coroutines.jvm.internal.ContinuationImpl;
import p000.c32;

/* JADX INFO: loaded from: classes2.dex */
@c32(m4290c = "com.lingq.core.data.workers.CourseUnsubscribeWorker", m4291f = "CourseUnsubscribeWorker.kt", m4292l = {22}, m4293m = "doWork", m4294v = 2)
final class CourseUnsubscribeWorker$doWork$1 extends ContinuationImpl {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f16645a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ CourseUnsubscribeWorker f16646b;

    /* JADX INFO: renamed from: c */
    public int f16647c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CourseUnsubscribeWorker$doWork$1(CourseUnsubscribeWorker courseUnsubscribeWorker, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.f16646b = courseUnsubscribeWorker;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.f16645a = obj;
        this.f16647c |= Integer.MIN_VALUE;
        return this.f16646b.mo2213d(this);
    }
}
