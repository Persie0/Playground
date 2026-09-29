package com.lingq.feature.reader.stats;

import com.lingq.core.domain.model.lesson.LessonCompleteData;
import com.lingq.core.domain.model.lesson.LessonCompleteNext;
import com.lingq.core.domain.model.lesson.LessonReference;
import com.lingq.core.domain.model.library.LessonInfo;
import kotlin.AbstractC3193b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import p000.bj3;
import p000.c32;
import p000.cl9;
import p000.xfa;

/* JADX INFO: loaded from: classes2.dex */
@c32(m4290c = "com.lingq.feature.reader.stats.LessonCompleteViewModel$nextLessonReference$1", m4291f = "LessonCompleteViewModel.kt", m4292l = {}, m4293m = "invokeSuspend", m4294v = 2)
final class LessonCompleteViewModel$nextLessonReference$1 extends SuspendLambda implements bj3 {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ LessonCompleteData f30612a;

    /* JADX INFO: renamed from: b */
    public /* synthetic */ LessonCompleteNext f30613b;

    /* JADX INFO: renamed from: c */
    public /* synthetic */ LessonInfo f30614c;

    @Override // p000.bj3
    /* JADX INFO: renamed from: e */
    public final Object mo825e(Object obj, Object obj2, Object obj3, Object obj4) {
        LessonCompleteViewModel$nextLessonReference$1 lessonCompleteViewModel$nextLessonReference$1 = new LessonCompleteViewModel$nextLessonReference$1(4, (Continuation) obj4);
        lessonCompleteViewModel$nextLessonReference$1.f30612a = (LessonCompleteData) obj;
        lessonCompleteViewModel$nextLessonReference$1.f30613b = (LessonCompleteNext) obj2;
        lessonCompleteViewModel$nextLessonReference$1.f30614c = (LessonInfo) obj3;
        return lessonCompleteViewModel$nextLessonReference$1.invokeSuspend(xfa.f68157a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        LessonReference lessonReference;
        LessonCompleteData lessonCompleteData = this.f30612a;
        LessonCompleteNext lessonCompleteNext = this.f30613b;
        LessonInfo lessonInfo = this.f30614c;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        AbstractC3193b.m15359b(obj);
        if (lessonCompleteData != null && (lessonReference = lessonCompleteData.f19220q) != null) {
            return lessonReference;
        }
        if (lessonInfo == null) {
            if (lessonCompleteNext != null) {
                return new LessonReference(lessonCompleteNext.f19222a, 0, (String) null, false, (Integer) null, lessonCompleteNext.f19225d, lessonCompleteNext.f19223b, lessonCompleteNext.f19224c, (Integer) null, lessonCompleteNext.f19227f, lessonCompleteNext.f19228g, 282);
            }
            return null;
        }
        int i = lessonInfo.f19365a;
        int i2 = lessonInfo.f19358N;
        String str = lessonInfo.f19373i;
        Boolean bool = lessonInfo.f19364T;
        boolean zBooleanValue = bool != null ? bool.booleanValue() : false;
        String str2 = lessonInfo.f19346B;
        return new LessonReference(i, i2, str, zBooleanValue, str2 != null ? cl9.m4844a0(str2) : null, lessonInfo.f19370f, lessonInfo.f19366b, lessonInfo.f19368d, Integer.valueOf(lessonInfo.f19371g), lessonInfo.f19356L, lessonInfo.f19357M);
    }
}
