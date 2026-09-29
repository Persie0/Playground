package com.lingq.core.data.workers;

import kotlin.coroutines.jvm.internal.ContinuationImpl;
import p000.c32;

/* JADX INFO: loaded from: classes2.dex */
@c32(m4290c = "com.lingq.core.data.workers.LessonPlaylistOrderWorker", m4291f = "LessonPlaylistOrderWorker.kt", m4292l = {30}, m4293m = "doWork", m4294v = 2)
final class LessonPlaylistOrderWorker$doWork$1 extends ContinuationImpl {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f16739a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ LessonPlaylistOrderWorker f16740b;

    /* JADX INFO: renamed from: c */
    public int f16741c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LessonPlaylistOrderWorker$doWork$1(LessonPlaylistOrderWorker lessonPlaylistOrderWorker, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.f16740b = lessonPlaylistOrderWorker;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.f16739a = obj;
        this.f16741c |= Integer.MIN_VALUE;
        return this.f16740b.mo2213d(this);
    }
}
