package com.lingq.feature.edit;

import kotlin.AbstractC3193b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import p000.c32;
import p000.r15;
import p000.un1;
import p000.vi3;
import p000.w15;
import p000.xfa;
import p000.zi3;

/* JADX INFO: loaded from: classes2.dex */
@c32(m4290c = "com.lingq.feature.edit.LessonEditRouteKt$LessonEditRoute$1$1", m4291f = "LessonEditRoute.kt", m4292l = {}, m4293m = "invokeSuspend", m4294v = 2)
final class LessonEditRouteKt$LessonEditRoute$1$1 extends SuspendLambda implements zi3 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ w15 f25857a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ vi3 f25858b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LessonEditRouteKt$LessonEditRoute$1$1(w15 w15Var, vi3 vi3Var, Continuation continuation) {
        super(2, continuation);
        this.f25857a = w15Var;
        this.f25858b = vi3Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new LessonEditRouteKt$LessonEditRoute$1$1(this.f25857a, this.f25858b, continuation);
    }

    @Override // p000.zi3
    public final Object invoke(Object obj, Object obj2) throws Throwable {
        LessonEditRouteKt$LessonEditRoute$1$1 lessonEditRouteKt$LessonEditRoute$1$1 = (LessonEditRouteKt$LessonEditRoute$1$1) create((un1) obj, (Continuation) obj2);
        xfa xfaVar = xfa.f68157a;
        lessonEditRouteKt$LessonEditRoute$1$1.invokeSuspend(xfaVar);
        return xfaVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        AbstractC3193b.m15359b(obj);
        if (this.f25857a.f66221c) {
            this.f25858b.invoke(r15.f58485a);
        }
        return xfa.f68157a;
    }
}
