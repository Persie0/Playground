package com.lingq.feature.reader.shared.p018ui.components;

import kotlin.AbstractC3193b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.AbstractC3208a;
import p000.C3386nv;
import p000.c32;
import p000.qc9;
import p000.t66;
import p000.un1;
import p000.xfa;
import p000.zi3;

/* JADX INFO: loaded from: classes3.dex */
@c32(m4290c = "com.lingq.feature.reader.shared.ui.components.LessonProgressBarKt$LessonProgressBar$11$1", m4291f = "LessonProgressBar.kt", m4292l = {218}, m4293m = "invokeSuspend", m4294v = 2)
final class LessonProgressBarKt$LessonProgressBar$11$1 extends SuspendLambda implements zi3 {

    /* JADX INFO: renamed from: a */
    public int f30385a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ boolean f30386b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ int f30387c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ t66 f30388d;

    /* JADX INFO: renamed from: e */
    public final /* synthetic */ qc9 f30389e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LessonProgressBarKt$LessonProgressBar$11$1(boolean z, int i, t66 t66Var, qc9 qc9Var, Continuation continuation) {
        super(2, continuation);
        this.f30386b = z;
        this.f30387c = i;
        this.f30388d = t66Var;
        this.f30389e = qc9Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new LessonProgressBarKt$LessonProgressBar$11$1(this.f30386b, this.f30387c, this.f30388d, this.f30389e, continuation);
    }

    @Override // p000.zi3
    public final Object invoke(Object obj, Object obj2) {
        return ((LessonProgressBarKt$LessonProgressBar$11$1) create((un1) obj, (Continuation) obj2)).invokeSuspend(xfa.f68157a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.f30385a;
        t66 t66Var = this.f30388d;
        boolean z = this.f30386b;
        if (i == 0) {
            AbstractC3193b.m15359b(obj);
            if (!z && ((Boolean) t66Var.getValue()).booleanValue()) {
                this.f30385a = 1;
                if (AbstractC3208a.m15437d(100L, this) == coroutineSingletons) {
                    return coroutineSingletons;
                }
            }
            return xfa.f68157a;
        }
        if (i != 1) {
            C3386nv.m17633t("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        AbstractC3193b.m15359b(obj);
        if (!z) {
            t66Var.setValue(Boolean.FALSE);
            this.f30389e.m19862i(this.f30387c);
        }
        return xfa.f68157a;
    }
}
