package com.lingq.core.data.workers;

import kotlin.coroutines.jvm.internal.ContinuationImpl;
import p000.c32;

/* JADX INFO: loaded from: classes2.dex */
@c32(m4290c = "com.lingq.core.data.workers.LessonReportWorker", m4291f = "LessonReportWorker.kt", m4292l = {30}, m4293m = "doWork", m4294v = 2)
final class LessonReportWorker$doWork$1 extends ContinuationImpl {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f16743a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ LessonReportWorker f16744b;

    /* JADX INFO: renamed from: c */
    public int f16745c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LessonReportWorker$doWork$1(LessonReportWorker lessonReportWorker, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.f16744b = lessonReportWorker;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.f16743a = obj;
        this.f16745c |= Integer.MIN_VALUE;
        return this.f16744b.mo2213d(this);
    }
}
