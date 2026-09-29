package com.lingq.core.data.workers;

import kotlin.coroutines.jvm.internal.ContinuationImpl;
import p000.c32;

/* JADX INFO: loaded from: classes2.dex */
@c32(m4290c = "com.lingq.core.data.workers.CourseReportWorker", m4291f = "CourseReportWorker.kt", m4292l = {29}, m4293m = "doWork", m4294v = 2)
final class CourseReportWorker$doWork$1 extends ContinuationImpl {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f16637a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ CourseReportWorker f16638b;

    /* JADX INFO: renamed from: c */
    public int f16639c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CourseReportWorker$doWork$1(CourseReportWorker courseReportWorker, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.f16638b = courseReportWorker;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.f16637a = obj;
        this.f16639c |= Integer.MIN_VALUE;
        return this.f16638b.mo2213d(this);
    }
}
