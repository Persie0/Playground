package com.lingq.feature.reader.content.domain;

import java.util.List;
import kotlin.AbstractC3193b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import p000.c32;
import p000.dj3;
import p000.tx4;
import p000.xfa;

/* JADX INFO: loaded from: classes2.dex */
@c32(m4290c = "com.lingq.feature.reader.content.domain.LessonTextProvider$observeLessonTextData$baseInputsFlow$2", m4291f = "LessonTextProvider.kt", m4292l = {}, m4293m = "invokeSuspend", m4294v = 2)
final class LessonTextProvider$observeLessonTextData$baseInputsFlow$2 extends SuspendLambda implements dj3 {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ List f27971a;

    /* JADX INFO: renamed from: b */
    public /* synthetic */ boolean f27972b;

    /* JADX INFO: renamed from: c */
    public /* synthetic */ String f27973c;

    /* JADX INFO: renamed from: d */
    public /* synthetic */ boolean f27974d;

    /* JADX INFO: renamed from: e */
    public /* synthetic */ boolean f27975e;

    public LessonTextProvider$observeLessonTextData$baseInputsFlow$2(Continuation continuation) {
        super(6, continuation);
    }

    @Override // p000.dj3
    /* JADX INFO: renamed from: h */
    public final Object mo1290h(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6) {
        boolean zBooleanValue = ((Boolean) obj2).booleanValue();
        boolean zBooleanValue2 = ((Boolean) obj4).booleanValue();
        boolean zBooleanValue3 = ((Boolean) obj5).booleanValue();
        LessonTextProvider$observeLessonTextData$baseInputsFlow$2 lessonTextProvider$observeLessonTextData$baseInputsFlow$2 = new LessonTextProvider$observeLessonTextData$baseInputsFlow$2((Continuation) obj6);
        lessonTextProvider$observeLessonTextData$baseInputsFlow$2.f27971a = (List) obj;
        lessonTextProvider$observeLessonTextData$baseInputsFlow$2.f27972b = zBooleanValue;
        lessonTextProvider$observeLessonTextData$baseInputsFlow$2.f27973c = (String) obj3;
        lessonTextProvider$observeLessonTextData$baseInputsFlow$2.f27974d = zBooleanValue2;
        lessonTextProvider$observeLessonTextData$baseInputsFlow$2.f27975e = zBooleanValue3;
        return lessonTextProvider$observeLessonTextData$baseInputsFlow$2.invokeSuspend(xfa.f68157a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        List list = this.f27971a;
        boolean z = this.f27972b;
        String str = this.f27973c;
        boolean z2 = this.f27974d;
        boolean z3 = this.f27975e;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        AbstractC3193b.m15359b(obj);
        return new tx4(list, z, str, z2, z3);
    }
}
