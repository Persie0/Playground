package com.lingq.core.data.workers;

import kotlin.coroutines.jvm.internal.ContinuationImpl;
import p000.c32;

/* JADX INFO: loaded from: classes2.dex */
@c32(m4290c = "com.lingq.core.data.workers.LessonDeleteRoseWorker", m4291f = "LessonDeleteRoseWorker.kt", m4292l = {25}, m4293m = "doWork", m4294v = 2)
final class LessonDeleteRoseWorker$doWork$1 extends ContinuationImpl {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f16727a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ LessonDeleteRoseWorker f16728b;

    /* JADX INFO: renamed from: c */
    public int f16729c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LessonDeleteRoseWorker$doWork$1(LessonDeleteRoseWorker lessonDeleteRoseWorker, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.f16728b = lessonDeleteRoseWorker;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.f16727a = obj;
        this.f16729c |= Integer.MIN_VALUE;
        return this.f16728b.mo2213d(this);
    }
}
