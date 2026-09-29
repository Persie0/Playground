package com.lingq.feature.reader.old;

import com.lingq.core.domain.model.lesson.Lesson;
import com.lingq.core.domain.model.lesson.LessonPromotedCourse;
import com.lingq.core.domain.model.library.LibraryItem;
import kotlin.AbstractC3193b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import p000.aj3;
import p000.c32;
import p000.tn7;
import p000.xfa;

/* JADX INFO: loaded from: classes3.dex */
@c32(m4290c = "com.lingq.feature.reader.old.ReaderViewModel$promotedCourse$1", m4291f = "ReaderViewModel.kt", m4292l = {}, m4293m = "invokeSuspend", m4294v = 2)
final class ReaderViewModel$promotedCourse$1 extends SuspendLambda implements aj3 {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Lesson f29019a;

    /* JADX INFO: renamed from: b */
    public /* synthetic */ LibraryItem f29020b;

    @Override // p000.aj3
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        ReaderViewModel$promotedCourse$1 readerViewModel$promotedCourse$1 = new ReaderViewModel$promotedCourse$1(3, (Continuation) obj3);
        readerViewModel$promotedCourse$1.f29019a = (Lesson) obj;
        readerViewModel$promotedCourse$1.f29020b = (LibraryItem) obj2;
        return readerViewModel$promotedCourse$1.invokeSuspend(xfa.f68157a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        String str;
        Lesson lesson = this.f29019a;
        LibraryItem libraryItem = this.f29020b;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        AbstractC3193b.m15359b(obj);
        LessonPromotedCourse lessonPromotedCourse = lesson.f19132B;
        if (lessonPromotedCourse == null) {
            return null;
        }
        String str2 = lesson.f19150i;
        String str3 = "";
        if (str2 == null) {
            str2 = "";
        }
        if (libraryItem != null && (str = libraryItem.f19436h) != null) {
            str3 = str;
        }
        return new tn7(str2, str3, lessonPromotedCourse);
    }
}
