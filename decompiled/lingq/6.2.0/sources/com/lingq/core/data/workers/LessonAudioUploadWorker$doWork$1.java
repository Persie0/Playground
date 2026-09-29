package com.lingq.core.data.workers;

import kotlin.coroutines.jvm.internal.ContinuationImpl;
import p000.c32;

/* JADX INFO: loaded from: classes2.dex */
@c32(m4290c = "com.lingq.core.data.workers.LessonAudioUploadWorker", m4291f = "LessonAudioUploadWorker.kt", m4292l = {30}, m4293m = "doWork", m4294v = 2)
final class LessonAudioUploadWorker$doWork$1 extends ContinuationImpl {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f16711a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ LessonAudioUploadWorker f16712b;

    /* JADX INFO: renamed from: c */
    public int f16713c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LessonAudioUploadWorker$doWork$1(LessonAudioUploadWorker lessonAudioUploadWorker, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.f16712b = lessonAudioUploadWorker;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.f16711a = obj;
        this.f16713c |= Integer.MIN_VALUE;
        return this.f16712b.mo2213d(this);
    }
}
