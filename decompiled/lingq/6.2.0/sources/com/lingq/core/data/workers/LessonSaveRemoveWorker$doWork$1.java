package com.lingq.core.data.workers;

import kotlin.coroutines.jvm.internal.ContinuationImpl;
import p000.c32;

/* JADX INFO: loaded from: classes2.dex */
@c32(m4290c = "com.lingq.core.data.workers.LessonSaveRemoveWorker", m4291f = "LessonSaveRemoveWorker.kt", m4292l = {34}, m4293m = "doWork", m4294v = 2)
final class LessonSaveRemoveWorker$doWork$1 extends ContinuationImpl {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f16747a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ LessonSaveRemoveWorker f16748b;

    /* JADX INFO: renamed from: c */
    public int f16749c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LessonSaveRemoveWorker$doWork$1(LessonSaveRemoveWorker lessonSaveRemoveWorker, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.f16748b = lessonSaveRemoveWorker;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.f16747a = obj;
        this.f16749c |= Integer.MIN_VALUE;
        return this.f16748b.mo2213d(this);
    }
}
