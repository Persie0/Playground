package com.lingq.core.data.workers;

import kotlin.coroutines.jvm.internal.ContinuationImpl;
import p000.c32;

/* JADX INFO: loaded from: classes2.dex */
@c32(m4290c = "com.lingq.core.data.workers.LessonEditSentenceWorker", m4291f = "LessonEditSentenceWorker.kt", m4292l = {34}, m4293m = "doWork", m4294v = 2)
final class LessonEditSentenceWorker$doWork$1 extends ContinuationImpl {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f16731a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ LessonEditSentenceWorker f16732b;

    /* JADX INFO: renamed from: c */
    public int f16733c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LessonEditSentenceWorker$doWork$1(LessonEditSentenceWorker lessonEditSentenceWorker, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.f16732b = lessonEditSentenceWorker;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.f16731a = obj;
        this.f16733c |= Integer.MIN_VALUE;
        return this.f16732b.mo2213d(this);
    }
}
