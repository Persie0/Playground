package com.lingq.core.domain.lesson;

import com.lingq.core.domain.model.audio.DownloadItem;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import p000.c32;

/* JADX INFO: loaded from: classes2.dex */
@c32(m4290c = "com.lingq.core.domain.lesson.GenerateLessonAudioUseCase", m4291f = "GenerateLessonAudioUseCase.kt", m4292l = {114, 122}, m4293m = "finalizeDownload", m4294v = 2)
final class GenerateLessonAudioUseCase$finalizeDownload$1 extends ContinuationImpl {

    /* JADX INFO: renamed from: a */
    public DownloadItem f18653a;

    /* JADX INFO: renamed from: b */
    public /* synthetic */ Object f18654b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ C1381c f18655c;

    /* JADX INFO: renamed from: d */
    public int f18656d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GenerateLessonAudioUseCase$finalizeDownload$1(C1381c c1381c, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.f18655c = c1381c;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.f18654b = obj;
        this.f18656d |= Integer.MIN_VALUE;
        return this.f18655c.m7990a(null, null, null, this);
    }
}
