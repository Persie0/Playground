package com.lingq.core.data.workers;

import kotlin.coroutines.jvm.internal.ContinuationImpl;
import p000.c32;

/* JADX INFO: loaded from: classes2.dex */
@c32(m4290c = "com.lingq.core.data.workers.LessonBookmarkWorker", m4291f = "LessonBookmarkWorker.kt", m4292l = {34}, m4293m = "doWork", m4294v = 2)
final class LessonBookmarkWorker$doWork$1 extends ContinuationImpl {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f16715a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ LessonBookmarkWorker f16716b;

    /* JADX INFO: renamed from: c */
    public int f16717c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LessonBookmarkWorker$doWork$1(LessonBookmarkWorker lessonBookmarkWorker, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.f16716b = lessonBookmarkWorker;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.f16715a = obj;
        this.f16717c |= Integer.MIN_VALUE;
        return this.f16716b.mo2213d(this);
    }
}
