package com.lingq.feature.reader.simplify;

import com.lingq.core.domain.model.lesson.Lesson;
import com.lingq.core.domain.model.lesson.LessonSimplifiedOf;
import com.lingq.core.domain.model.lesson.LessonsSimplified;
import kotlin.AbstractC3193b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import p000.aj3;
import p000.c32;
import p000.xfa;

/* JADX INFO: loaded from: classes3.dex */
@c32(m4290c = "com.lingq.feature.reader.simplify.ReaderSimplifyStateHolder$simplifyAction$1$lessonTo$2", m4291f = "ReaderSimplifyStateHolder.kt", m4292l = {}, m4293m = "invokeSuspend", m4294v = 2)
final class ReaderSimplifyStateHolder$simplifyAction$1$lessonTo$2 extends SuspendLambda implements aj3 {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Lesson f30453a;

    /* JADX INFO: renamed from: b */
    public /* synthetic */ LessonsSimplified f30454b;

    @Override // p000.aj3
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        ReaderSimplifyStateHolder$simplifyAction$1$lessonTo$2 readerSimplifyStateHolder$simplifyAction$1$lessonTo$2 = new ReaderSimplifyStateHolder$simplifyAction$1$lessonTo$2(3, (Continuation) obj3);
        readerSimplifyStateHolder$simplifyAction$1$lessonTo$2.f30453a = (Lesson) obj;
        readerSimplifyStateHolder$simplifyAction$1$lessonTo$2.f30454b = (LessonsSimplified) obj2;
        return readerSimplifyStateHolder$simplifyAction$1$lessonTo$2.invokeSuspend(xfa.f68157a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Lesson lesson = this.f30453a;
        LessonsSimplified lessonsSimplified = this.f30454b;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        AbstractC3193b.m15359b(obj);
        LessonSimplifiedOf lessonSimplifiedOf = lesson.f19137G;
        if (lessonSimplifiedOf != null) {
            return new Integer(lessonSimplifiedOf.f19266c);
        }
        if (lessonsSimplified != null) {
            return lessonsSimplified.f19330b;
        }
        return null;
    }
}
