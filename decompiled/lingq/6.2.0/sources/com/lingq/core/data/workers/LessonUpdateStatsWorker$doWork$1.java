package com.lingq.core.data.workers;

import androidx.datastore.preferences.protobuf.DescriptorProtos;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import p000.c32;

/* JADX INFO: loaded from: classes2.dex */
@c32(m4290c = "com.lingq.core.data.workers.LessonUpdateStatsWorker", m4291f = "LessonUpdateStatsWorker.kt", m4292l = {DescriptorProtos.FileOptions.CSHARP_NAMESPACE_FIELD_NUMBER}, m4293m = "doWork", m4294v = 2)
final class LessonUpdateStatsWorker$doWork$1 extends ContinuationImpl {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f16759a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ LessonUpdateStatsWorker f16760b;

    /* JADX INFO: renamed from: c */
    public int f16761c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LessonUpdateStatsWorker$doWork$1(LessonUpdateStatsWorker lessonUpdateStatsWorker, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.f16760b = lessonUpdateStatsWorker;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.f16759a = obj;
        this.f16761c |= Integer.MIN_VALUE;
        return this.f16760b.mo2213d(this);
    }
}
