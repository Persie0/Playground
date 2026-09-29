package com.lingq.feature.reader.shared.p018ui.components;

import kotlin.AbstractC3193b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import p000.c32;
import p000.qc9;
import p000.t66;
import p000.un1;
import p000.xfa;
import p000.zi3;

/* JADX INFO: loaded from: classes3.dex */
@c32(m4290c = "com.lingq.feature.reader.shared.ui.components.LessonProgressBarKt$LessonProgressBar$10$1", m4291f = "LessonProgressBar.kt", m4292l = {}, m4293m = "invokeSuspend", m4294v = 2)
final class LessonProgressBarKt$LessonProgressBar$10$1 extends SuspendLambda implements zi3 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ boolean f30381a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ int f30382b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ t66 f30383c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ qc9 f30384d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LessonProgressBarKt$LessonProgressBar$10$1(boolean z, int i, t66 t66Var, qc9 qc9Var, Continuation continuation) {
        super(2, continuation);
        this.f30381a = z;
        this.f30382b = i;
        this.f30383c = t66Var;
        this.f30384d = qc9Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new LessonProgressBarKt$LessonProgressBar$10$1(this.f30381a, this.f30382b, this.f30383c, this.f30384d, continuation);
    }

    @Override // p000.zi3
    public final Object invoke(Object obj, Object obj2) throws Throwable {
        LessonProgressBarKt$LessonProgressBar$10$1 lessonProgressBarKt$LessonProgressBar$10$1 = (LessonProgressBarKt$LessonProgressBar$10$1) create((un1) obj, (Continuation) obj2);
        xfa xfaVar = xfa.f68157a;
        lessonProgressBarKt$LessonProgressBar$10$1.invokeSuspend(xfaVar);
        return xfaVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        AbstractC3193b.m15359b(obj);
        if (!this.f30381a && !((Boolean) this.f30383c.getValue()).booleanValue()) {
            this.f30384d.m19862i(this.f30382b);
        }
        return xfa.f68157a;
    }
}
