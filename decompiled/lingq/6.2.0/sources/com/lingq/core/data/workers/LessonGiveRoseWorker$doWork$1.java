package com.lingq.core.data.workers;

import kotlin.coroutines.jvm.internal.ContinuationImpl;
import p000.c32;

/* JADX INFO: loaded from: classes2.dex */
@c32(m4290c = "com.lingq.core.data.workers.LessonGiveRoseWorker", m4291f = "LessonGiveRoseWorker.kt", m4292l = {33}, m4293m = "doWork", m4294v = 2)
final class LessonGiveRoseWorker$doWork$1 extends ContinuationImpl {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f16735a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ LessonGiveRoseWorker f16736b;

    /* JADX INFO: renamed from: c */
    public int f16737c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LessonGiveRoseWorker$doWork$1(LessonGiveRoseWorker lessonGiveRoseWorker, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.f16736b = lessonGiveRoseWorker;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.f16735a = obj;
        this.f16737c |= Integer.MIN_VALUE;
        return this.f16736b.mo2213d(this);
    }
}
