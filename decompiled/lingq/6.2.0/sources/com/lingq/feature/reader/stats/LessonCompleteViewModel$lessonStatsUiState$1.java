package com.lingq.feature.reader.stats;

import com.lingq.core.domain.model.lesson.LessonCompleteData;
import com.lingq.core.domain.model.lesson.LessonStats;
import kotlin.AbstractC3193b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import p000.c32;
import p000.cj3;
import p000.pj9;
import p000.qj9;
import p000.s65;
import p000.vs3;
import p000.xfa;

/* JADX INFO: loaded from: classes2.dex */
@c32(m4290c = "com.lingq.feature.reader.stats.LessonCompleteViewModel$lessonStatsUiState$1", m4291f = "LessonCompleteViewModel.kt", m4292l = {}, m4293m = "invokeSuspend", m4294v = 2)
final class LessonCompleteViewModel$lessonStatsUiState$1 extends SuspendLambda implements cj3 {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ LessonCompleteData f30583a;

    /* JADX INFO: renamed from: b */
    public /* synthetic */ LessonStats f30584b;

    /* JADX INFO: renamed from: c */
    public /* synthetic */ qj9 f30585c;

    /* JADX INFO: renamed from: d */
    public /* synthetic */ vs3 f30586d;

    @Override // p000.cj3
    /* JADX INFO: renamed from: i */
    public final Object mo1291i(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        LessonCompleteViewModel$lessonStatsUiState$1 lessonCompleteViewModel$lessonStatsUiState$1 = new LessonCompleteViewModel$lessonStatsUiState$1(5, (Continuation) obj5);
        lessonCompleteViewModel$lessonStatsUiState$1.f30583a = (LessonCompleteData) obj;
        lessonCompleteViewModel$lessonStatsUiState$1.f30584b = (LessonStats) obj2;
        lessonCompleteViewModel$lessonStatsUiState$1.f30585c = (qj9) obj3;
        lessonCompleteViewModel$lessonStatsUiState$1.f30586d = (vs3) obj4;
        return lessonCompleteViewModel$lessonStatsUiState$1.invokeSuspend(xfa.f68157a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        LessonCompleteData lessonCompleteData = this.f30583a;
        LessonStats lessonStats = this.f30584b;
        qj9 qj9Var = this.f30585c;
        vs3 vs3Var = this.f30586d;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        AbstractC3193b.m15359b(obj);
        int i = qj9Var instanceof pj9 ? ((pj9) qj9Var).f56324a.f36356d : 1;
        double d = lessonCompleteData.f19208e;
        double d2 = ((double) lessonCompleteData.f19211h) * d;
        double d3 = lessonCompleteData.f19209f;
        return new s65(vs3Var, d2, d, d3 * ((double) lessonCompleteData.f19210g), d3, lessonStats != null ? new Integer((int) lessonStats.f19269c) : null, lessonStats != null ? new Integer((int) lessonStats.f19270d) : null, lessonStats != null ? new Integer((int) lessonStats.f19272f) : null, i, lessonStats != null ? new Double(lessonStats.f19274h) : null, lessonStats != null ? new Double(lessonStats.f19275i) : null);
    }
}
