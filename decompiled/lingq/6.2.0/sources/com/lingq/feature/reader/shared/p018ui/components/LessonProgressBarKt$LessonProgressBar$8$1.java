package com.lingq.feature.reader.shared.p018ui.components;

import kotlin.AbstractC3193b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.AbstractC3208a;
import p000.C3386nv;
import p000.c32;
import p000.t66;
import p000.un1;
import p000.xfa;
import p000.zi3;

/* JADX INFO: loaded from: classes3.dex */
@c32(m4290c = "com.lingq.feature.reader.shared.ui.components.LessonProgressBarKt$LessonProgressBar$8$1", m4291f = "LessonProgressBar.kt", m4292l = {190}, m4293m = "invokeSuspend", m4294v = 2)
final class LessonProgressBarKt$LessonProgressBar$8$1 extends SuspendLambda implements zi3 {

    /* JADX INFO: renamed from: a */
    public int f30393a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ boolean f30394b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ t66 f30395c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LessonProgressBarKt$LessonProgressBar$8$1(boolean z, t66 t66Var, Continuation continuation) {
        super(2, continuation);
        this.f30394b = z;
        this.f30395c = t66Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new LessonProgressBarKt$LessonProgressBar$8$1(this.f30394b, this.f30395c, continuation);
    }

    @Override // p000.zi3
    public final Object invoke(Object obj, Object obj2) {
        return ((LessonProgressBarKt$LessonProgressBar$8$1) create((un1) obj, (Continuation) obj2)).invokeSuspend(xfa.f68157a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.f30393a;
        t66 t66Var = this.f30395c;
        if (i == 0) {
            AbstractC3193b.m15359b(obj);
            if (this.f30394b) {
                t66Var.setValue(Boolean.TRUE);
            } else {
                this.f30393a = 1;
                if (AbstractC3208a.m15437d(600L, this) == coroutineSingletons) {
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
        t66Var.setValue(Boolean.FALSE);
        return xfa.f68157a;
    }
}
