package com.lingq.core.domain.lesson;

import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import p000.c32;
import p000.ij2;

/* JADX INFO: loaded from: classes2.dex */
@c32(m4290c = "com.lingq.core.domain.lesson.ObserveLessonBookmarkReaderModeUseCase$invoke$$inlined$map$1$2", m4291f = "LessonBookmarkReaderModeUseCases.kt", m4292l = {217}, m4293m = "emit", m4294v = 2)
public final class ObserveLessonBookmarkReaderModeUseCase$invoke$$inlined$map$1$2$1 extends ContinuationImpl {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f18695a;

    /* JADX INFO: renamed from: b */
    public int f18696b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ ij2 f18697c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ObserveLessonBookmarkReaderModeUseCase$invoke$$inlined$map$1$2$1(ij2 ij2Var, Continuation continuation) {
        super(continuation);
        this.f18697c = ij2Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.f18695a = obj;
        this.f18696b |= Integer.MIN_VALUE;
        return this.f18697c.emit(null, this);
    }
}
