package com.lingq.core.domain.lesson;

import androidx.datastore.preferences.protobuf.DescriptorProtos;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import p000.c32;

/* JADX INFO: loaded from: classes2.dex */
@c32(m4290c = "com.lingq.core.domain.lesson.DownloadLessonUseCase", m4291f = "DownloadLessonUseCase.kt", m4292l = {DescriptorProtos.FileOptions.OBJC_CLASS_PREFIX_FIELD_NUMBER}, m4293m = "invoke", m4294v = 2)
final class DownloadLessonUseCase$invoke$1 extends ContinuationImpl {

    /* JADX INFO: renamed from: a */
    public String f18647a;

    /* JADX INFO: renamed from: b */
    public int f18648b;

    /* JADX INFO: renamed from: c */
    public boolean f18649c;

    /* JADX INFO: renamed from: d */
    public /* synthetic */ Object f18650d;

    /* JADX INFO: renamed from: e */
    public final /* synthetic */ C1380b f18651e;

    /* JADX INFO: renamed from: f */
    public int f18652f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DownloadLessonUseCase$invoke$1(C1380b c1380b, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.f18651e = c1380b;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.f18650d = obj;
        this.f18652f |= Integer.MIN_VALUE;
        return this.f18651e.m7988b(0, null, null, this, false);
    }
}
