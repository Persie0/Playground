package com.lingq.core.domain.lesson;

import com.lingq.core.domain.model.lesson.ReaderBookmarkMode;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import p000.c32;

/* JADX INFO: loaded from: classes2.dex */
@c32(m4290c = "com.lingq.core.domain.lesson.SetLessonBookmarkReaderModeUseCase", m4291f = "LessonBookmarkReaderModeUseCases.kt", m4292l = {24, 30}, m4293m = "invoke", m4294v = 2)
final class SetLessonBookmarkReaderModeUseCase$invoke$1 extends ContinuationImpl {

    /* JADX INFO: renamed from: a */
    public int f18707a;

    /* JADX INFO: renamed from: b */
    public ReaderBookmarkMode f18708b;

    /* JADX INFO: renamed from: c */
    public /* synthetic */ Object f18709c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ C1382d f18710d;

    /* JADX INFO: renamed from: e */
    public int f18711e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SetLessonBookmarkReaderModeUseCase$invoke$1(C1382d c1382d, Continuation continuation) {
        super(continuation);
        this.f18710d = c1382d;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.f18709c = obj;
        this.f18711e |= Integer.MIN_VALUE;
        return this.f18710d.m7993b(0, null, this);
    }
}
