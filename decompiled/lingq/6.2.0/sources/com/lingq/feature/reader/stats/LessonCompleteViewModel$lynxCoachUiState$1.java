package com.lingq.feature.reader.stats;

import kotlin.AbstractC3193b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import p000.c32;
import p000.cj3;
import p000.jn5;
import p000.xfa;

/* JADX INFO: loaded from: classes3.dex */
@c32(m4290c = "com.lingq.feature.reader.stats.LessonCompleteViewModel$lynxCoachUiState$1", m4291f = "LessonCompleteViewModel.kt", m4292l = {}, m4293m = "invokeSuspend", m4294v = 2)
final class LessonCompleteViewModel$lynxCoachUiState$1 extends SuspendLambda implements cj3 {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ boolean f30602a;

    /* JADX INFO: renamed from: b */
    public /* synthetic */ boolean f30603b;

    /* JADX INFO: renamed from: c */
    public /* synthetic */ String f30604c;

    /* JADX INFO: renamed from: d */
    public /* synthetic */ boolean f30605d;

    @Override // p000.cj3
    /* JADX INFO: renamed from: i */
    public final Object mo1291i(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        boolean zBooleanValue = ((Boolean) obj).booleanValue();
        boolean zBooleanValue2 = ((Boolean) obj2).booleanValue();
        boolean zBooleanValue3 = ((Boolean) obj4).booleanValue();
        LessonCompleteViewModel$lynxCoachUiState$1 lessonCompleteViewModel$lynxCoachUiState$1 = new LessonCompleteViewModel$lynxCoachUiState$1(5, (Continuation) obj5);
        lessonCompleteViewModel$lynxCoachUiState$1.f30602a = zBooleanValue;
        lessonCompleteViewModel$lynxCoachUiState$1.f30603b = zBooleanValue2;
        lessonCompleteViewModel$lynxCoachUiState$1.f30604c = (String) obj3;
        lessonCompleteViewModel$lynxCoachUiState$1.f30605d = zBooleanValue3;
        return lessonCompleteViewModel$lynxCoachUiState$1.invokeSuspend(xfa.f68157a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        boolean z = this.f30602a;
        boolean z2 = this.f30603b;
        String str = this.f30604c;
        boolean z3 = this.f30605d;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        AbstractC3193b.m15359b(obj);
        return new jn5(str, z, z2, z3);
    }
}
