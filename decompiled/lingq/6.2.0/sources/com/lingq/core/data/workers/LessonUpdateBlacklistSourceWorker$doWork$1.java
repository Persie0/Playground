package com.lingq.core.data.workers;

import androidx.datastore.preferences.protobuf.DescriptorProtos;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import p000.c32;

/* JADX INFO: loaded from: classes2.dex */
@c32(m4290c = "com.lingq.core.data.workers.LessonUpdateBlacklistSourceWorker", m4291f = "LessonUpdateBlacklistSourceWorker.kt", m4292l = {DescriptorProtos.FileOptions.CC_ENABLE_ARENAS_FIELD_NUMBER}, m4293m = "doWork", m4294v = 2)
final class LessonUpdateBlacklistSourceWorker$doWork$1 extends ContinuationImpl {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f16755a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ LessonUpdateBlacklistSourceWorker f16756b;

    /* JADX INFO: renamed from: c */
    public int f16757c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LessonUpdateBlacklistSourceWorker$doWork$1(LessonUpdateBlacklistSourceWorker lessonUpdateBlacklistSourceWorker, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.f16756b = lessonUpdateBlacklistSourceWorker;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.f16755a = obj;
        this.f16757c |= Integer.MIN_VALUE;
        return this.f16756b.mo2213d(this);
    }
}
