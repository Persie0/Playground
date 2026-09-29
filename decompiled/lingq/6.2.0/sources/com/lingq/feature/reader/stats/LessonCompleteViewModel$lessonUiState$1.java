package com.lingq.feature.reader.stats;

import com.lingq.core.domain.model.lesson.LessonCompleteData;
import com.lingq.core.domain.model.library.LessonInfo;
import kotlin.AbstractC3193b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import p000.bj3;
import p000.c32;
import p000.xfa;
import p000.y65;

/* JADX INFO: loaded from: classes3.dex */
@c32(m4290c = "com.lingq.feature.reader.stats.LessonCompleteViewModel$lessonUiState$1", m4291f = "LessonCompleteViewModel.kt", m4292l = {}, m4293m = "invokeSuspend", m4294v = 2)
final class LessonCompleteViewModel$lessonUiState$1 extends SuspendLambda implements bj3 {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ LessonCompleteData f30587a;

    /* JADX INFO: renamed from: b */
    public /* synthetic */ int f30588b;

    /* JADX INFO: renamed from: c */
    public /* synthetic */ LessonInfo f30589c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ C2535j f30590d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LessonCompleteViewModel$lessonUiState$1(C2535j c2535j, Continuation continuation) {
        super(4, continuation);
        this.f30590d = c2535j;
    }

    @Override // p000.bj3
    /* JADX INFO: renamed from: e */
    public final Object mo825e(Object obj, Object obj2, Object obj3, Object obj4) {
        int iIntValue = ((Number) obj2).intValue();
        LessonCompleteViewModel$lessonUiState$1 lessonCompleteViewModel$lessonUiState$1 = new LessonCompleteViewModel$lessonUiState$1(this.f30590d, (Continuation) obj4);
        lessonCompleteViewModel$lessonUiState$1.f30587a = (LessonCompleteData) obj;
        lessonCompleteViewModel$lessonUiState$1.f30588b = iIntValue;
        lessonCompleteViewModel$lessonUiState$1.f30589c = (LessonInfo) obj3;
        return lessonCompleteViewModel$lessonUiState$1.invokeSuspend(xfa.f68157a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        String str;
        String str2;
        String str3;
        LessonCompleteData lessonCompleteData = this.f30587a;
        int i = this.f30588b;
        LessonInfo lessonInfo = this.f30589c;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        AbstractC3193b.m15359b(obj);
        boolean z = lessonCompleteData.f19213j;
        boolean z2 = i > 0;
        String str4 = (lessonInfo == null || (str3 = lessonInfo.f19366b) == null) ? "" : str3;
        if (lessonInfo == null || (str = lessonInfo.f19390z) == null) {
            str = lessonInfo != null ? lessonInfo.f19368d : null;
        }
        return new y65(z, z2, str4, (lessonInfo == null || (str2 = lessonInfo.f19373i) == null) ? "" : str2, str, this.f30590d.f30818b.mo4589b2(), lessonCompleteData.f19215l != null);
    }
}
