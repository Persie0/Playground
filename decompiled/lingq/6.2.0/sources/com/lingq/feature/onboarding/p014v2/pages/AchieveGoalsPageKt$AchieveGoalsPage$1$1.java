package com.lingq.feature.onboarding.p014v2.pages;

import kotlin.AbstractC3193b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import p000.c32;
import p000.t66;
import p000.ui3;
import p000.un1;
import p000.xfa;
import p000.zi3;

/* JADX INFO: loaded from: classes3.dex */
@c32(m4290c = "com.lingq.feature.onboarding.v2.pages.AchieveGoalsPageKt$AchieveGoalsPage$1$1", m4291f = "AchieveGoalsPage.kt", m4292l = {}, m4293m = "invokeSuspend", m4294v = 2)
final class AchieveGoalsPageKt$AchieveGoalsPage$1$1 extends SuspendLambda implements zi3 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ boolean f27483a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ ui3 f27484b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ t66 f27485c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AchieveGoalsPageKt$AchieveGoalsPage$1$1(boolean z, ui3 ui3Var, t66 t66Var, Continuation continuation) {
        super(2, continuation);
        this.f27483a = z;
        this.f27484b = ui3Var;
        this.f27485c = t66Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new AchieveGoalsPageKt$AchieveGoalsPage$1$1(this.f27483a, this.f27484b, this.f27485c, continuation);
    }

    @Override // p000.zi3
    public final Object invoke(Object obj, Object obj2) throws Throwable {
        AchieveGoalsPageKt$AchieveGoalsPage$1$1 achieveGoalsPageKt$AchieveGoalsPage$1$1 = (AchieveGoalsPageKt$AchieveGoalsPage$1$1) create((un1) obj, (Continuation) obj2);
        xfa xfaVar = xfa.f68157a;
        achieveGoalsPageKt$AchieveGoalsPage$1$1.invokeSuspend(xfaVar);
        return xfaVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        AbstractC3193b.m15359b(obj);
        if (this.f27483a) {
            t66 t66Var = this.f27485c;
            if (((Boolean) t66Var.getValue()).booleanValue()) {
                t66Var.setValue(Boolean.FALSE);
                this.f27484b.mo0a();
            }
        }
        return xfa.f68157a;
    }
}
