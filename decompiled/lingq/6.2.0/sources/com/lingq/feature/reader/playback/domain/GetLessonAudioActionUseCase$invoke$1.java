package com.lingq.feature.reader.playback.domain;

import kotlin.coroutines.jvm.internal.ContinuationImpl;
import p000.c32;

/* JADX INFO: loaded from: classes3.dex */
@c32(m4290c = "com.lingq.feature.reader.playback.domain.GetLessonAudioActionUseCase", m4291f = "GetLessonAudioActionUseCase.kt", m4292l = {22}, m4293m = "invoke", m4294v = 2)
final class GetLessonAudioActionUseCase$invoke$1 extends ContinuationImpl {

    /* JADX INFO: renamed from: a */
    public String f29790a;

    /* JADX INFO: renamed from: b */
    public int f29791b;

    /* JADX INFO: renamed from: c */
    public boolean f29792c;

    /* JADX INFO: renamed from: d */
    public /* synthetic */ Object f29793d;

    /* JADX INFO: renamed from: e */
    public final /* synthetic */ C2466a f29794e;

    /* JADX INFO: renamed from: f */
    public int f29795f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GetLessonAudioActionUseCase$invoke$1(C2466a c2466a, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.f29794e = c2466a;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.f29793d = obj;
        this.f29795f |= Integer.MIN_VALUE;
        return this.f29794e.m9368a(0, null, null, this, false);
    }
}
