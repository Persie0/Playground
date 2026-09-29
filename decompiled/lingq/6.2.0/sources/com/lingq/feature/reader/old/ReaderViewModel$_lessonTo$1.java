package com.lingq.feature.reader.old;

import com.lingq.core.domain.model.lesson.Lesson;
import com.lingq.core.domain.model.lesson.LessonsSimplified;
import kotlin.AbstractC3193b;
import kotlin.Pair;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import p000.aj3;
import p000.c32;
import p000.xfa;

/* JADX INFO: loaded from: classes3.dex */
@c32(m4290c = "com.lingq.feature.reader.old.ReaderViewModel$_lessonTo$1", m4291f = "ReaderViewModel.kt", m4292l = {}, m4293m = "invokeSuspend", m4294v = 2)
final class ReaderViewModel$_lessonTo$1 extends SuspendLambda implements aj3 {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Lesson f28897a;

    /* JADX INFO: renamed from: b */
    public /* synthetic */ LessonsSimplified f28898b;

    @Override // p000.aj3
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        ReaderViewModel$_lessonTo$1 readerViewModel$_lessonTo$1 = new ReaderViewModel$_lessonTo$1(3, (Continuation) obj3);
        readerViewModel$_lessonTo$1.f28897a = (Lesson) obj;
        readerViewModel$_lessonTo$1.f28898b = (LessonsSimplified) obj2;
        return readerViewModel$_lessonTo$1.invokeSuspend(xfa.f68157a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Lesson lesson = this.f28897a;
        LessonsSimplified lessonsSimplified = this.f28898b;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        AbstractC3193b.m15359b(obj);
        return new Pair(lesson, lessonsSimplified);
    }
}
