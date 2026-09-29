package com.lingq.core.data.workers;

import kotlin.coroutines.jvm.internal.ContinuationImpl;
import p000.c32;

/* JADX INFO: loaded from: classes2.dex */
@c32(m4290c = "com.lingq.core.data.workers.LessonSimplifyWorker", m4291f = "LessonSimplifyWorker.kt", m4292l = {29}, m4293m = "doWork", m4294v = 2)
final class LessonSimplifyWorker$doWork$1 extends ContinuationImpl {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f16751a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ LessonSimplifyWorker f16752b;

    /* JADX INFO: renamed from: c */
    public int f16753c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LessonSimplifyWorker$doWork$1(LessonSimplifyWorker lessonSimplifyWorker, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.f16752b = lessonSimplifyWorker;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.f16751a = obj;
        this.f16753c |= Integer.MIN_VALUE;
        return this.f16752b.mo2213d(this);
    }
}
