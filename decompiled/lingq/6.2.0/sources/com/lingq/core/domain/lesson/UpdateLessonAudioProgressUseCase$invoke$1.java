package com.lingq.core.domain.lesson;

import kotlin.coroutines.jvm.internal.ContinuationImpl;
import p000.c32;

/* JADX INFO: loaded from: classes2.dex */
@c32(m4290c = "com.lingq.core.domain.lesson.UpdateLessonAudioProgressUseCase", m4291f = "UpdateLessonAudioProgressUseCase.kt", m4292l = {18, 20, 21}, m4293m = "invoke", m4294v = 2)
final class UpdateLessonAudioProgressUseCase$invoke$1 extends ContinuationImpl {

    /* JADX INFO: renamed from: a */
    public String f18712a;

    /* JADX INFO: renamed from: b */
    public Integer f18713b;

    /* JADX INFO: renamed from: c */
    public int f18714c;

    /* JADX INFO: renamed from: d */
    public long f18715d;

    /* JADX INFO: renamed from: e */
    public /* synthetic */ Object f18716e;

    /* JADX INFO: renamed from: f */
    public final /* synthetic */ C1385g f18717f;

    /* JADX INFO: renamed from: g */
    public int f18718g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public UpdateLessonAudioProgressUseCase$invoke$1(C1385g c1385g, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.f18717f = c1385g;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.f18716e = obj;
        this.f18718g |= Integer.MIN_VALUE;
        return this.f18717f.m7996a(null, 0, 0L, null, this);
    }
}
