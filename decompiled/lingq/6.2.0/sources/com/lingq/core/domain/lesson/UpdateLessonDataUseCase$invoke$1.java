package com.lingq.core.domain.lesson;

import kotlin.coroutines.jvm.internal.ContinuationImpl;
import p000.c32;

/* JADX INFO: loaded from: classes2.dex */
@c32(m4290c = "com.lingq.core.domain.lesson.UpdateLessonDataUseCase", m4291f = "UpdateLessonDataUseCase.kt", m4292l = {14}, m4293m = "invoke", m4294v = 2)
final class UpdateLessonDataUseCase$invoke$1 extends ContinuationImpl {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f18719a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ C1380b f18720b;

    /* JADX INFO: renamed from: c */
    public int f18721c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public UpdateLessonDataUseCase$invoke$1(C1380b c1380b, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.f18720b = c1380b;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.f18719a = obj;
        this.f18721c |= Integer.MIN_VALUE;
        return this.f18720b.m7989c(0, null, this);
    }
}
