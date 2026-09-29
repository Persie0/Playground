package com.lingq.core.data.workers;

import kotlin.coroutines.jvm.internal.ContinuationImpl;
import p000.c32;

/* JADX INFO: loaded from: classes2.dex */
@c32(m4290c = "com.lingq.core.data.workers.LessonDeleteFavoriteWorker", m4291f = "LessonDeleteFavoriteWorker.kt", m4292l = {30}, m4293m = "doWork", m4294v = 2)
final class LessonDeleteFavoriteWorker$doWork$1 extends ContinuationImpl {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f16723a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ LessonDeleteFavoriteWorker f16724b;

    /* JADX INFO: renamed from: c */
    public int f16725c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LessonDeleteFavoriteWorker$doWork$1(LessonDeleteFavoriteWorker lessonDeleteFavoriteWorker, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.f16724b = lessonDeleteFavoriteWorker;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.f16723a = obj;
        this.f16725c |= Integer.MIN_VALUE;
        return this.f16724b.mo2213d(this);
    }
}
