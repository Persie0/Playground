package com.lingq.core.data.workers;

import androidx.datastore.preferences.protobuf.DescriptorProtos;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import p000.c32;

/* JADX INFO: loaded from: classes2.dex */
@c32(m4290c = "com.lingq.core.data.workers.LessonAddFavoriteWorker", m4291f = "LessonAddFavoriteWorker.kt", m4292l = {DescriptorProtos.FileOptions.CC_ENABLE_ARENAS_FIELD_NUMBER}, m4293m = "doWork", m4294v = 2)
final class LessonAddFavoriteWorker$doWork$1 extends ContinuationImpl {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f16707a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ LessonAddFavoriteWorker f16708b;

    /* JADX INFO: renamed from: c */
    public int f16709c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LessonAddFavoriteWorker$doWork$1(LessonAddFavoriteWorker lessonAddFavoriteWorker, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.f16708b = lessonAddFavoriteWorker;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.f16707a = obj;
        this.f16709c |= Integer.MIN_VALUE;
        return this.f16708b.mo2213d(this);
    }
}
