package com.lingq.core.domain.lesson;

import androidx.datastore.preferences.protobuf.DescriptorProtos;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import p000.c32;
import p000.c83;

/* JADX INFO: loaded from: classes2.dex */
@c32(m4290c = "com.lingq.core.domain.lesson.GetLessonDownloadStateUseCase", m4291f = "GetLessonDownloadStateUseCase.kt", m4292l = {DescriptorProtos.FileOptions.JAVA_STRING_CHECK_UTF8_FIELD_NUMBER, 28}, m4293m = "invoke", m4294v = 2)
final class GetLessonDownloadStateUseCase$invoke$1 extends ContinuationImpl {

    /* JADX INFO: renamed from: a */
    public String f18671a;

    /* JADX INFO: renamed from: b */
    public c83 f18672b;

    /* JADX INFO: renamed from: c */
    public int f18673c;

    /* JADX INFO: renamed from: d */
    public /* synthetic */ Object f18674d;

    /* JADX INFO: renamed from: e */
    public final /* synthetic */ C1380b f18675e;

    /* JADX INFO: renamed from: f */
    public int f18676f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GetLessonDownloadStateUseCase$invoke$1(C1380b c1380b, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.f18675e = c1380b;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.f18674d = obj;
        this.f18676f |= Integer.MIN_VALUE;
        return this.f18675e.m7989c(0, null, this);
    }
}
