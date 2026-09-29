package com.lingq.feature.language;

import kotlin.AbstractC3193b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import p000.c32;
import p000.pm4;
import p000.qm4;
import p000.t66;
import p000.ui3;
import p000.un1;
import p000.xfa;
import p000.zi3;

/* JADX INFO: loaded from: classes3.dex */
@c32(m4290c = "com.lingq.feature.language.LanguageSelectorScreenKt$LanguageSelectorRoute$3$1", m4291f = "LanguageSelectorScreen.kt", m4292l = {}, m4293m = "invokeSuspend", m4294v = 2)
final class LanguageSelectorScreenKt$LanguageSelectorRoute$3$1 extends SuspendLambda implements zi3 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ ui3 f26316a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ ui3 f26317b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ t66 f26318c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LanguageSelectorScreenKt$LanguageSelectorRoute$3$1(ui3 ui3Var, ui3 ui3Var2, t66 t66Var, Continuation continuation) {
        super(2, continuation);
        this.f26316a = ui3Var;
        this.f26317b = ui3Var2;
        this.f26318c = t66Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new LanguageSelectorScreenKt$LanguageSelectorRoute$3$1(this.f26316a, this.f26317b, this.f26318c, continuation);
    }

    @Override // p000.zi3
    public final Object invoke(Object obj, Object obj2) throws Throwable {
        LanguageSelectorScreenKt$LanguageSelectorRoute$3$1 languageSelectorScreenKt$LanguageSelectorRoute$3$1 = (LanguageSelectorScreenKt$LanguageSelectorRoute$3$1) create((un1) obj, (Continuation) obj2);
        xfa xfaVar = xfa.f68157a;
        languageSelectorScreenKt$LanguageSelectorRoute$3$1.invokeSuspend(xfaVar);
        return xfaVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        AbstractC3193b.m15359b(obj);
        if (((qm4) this.f26318c.getValue()) instanceof pm4) {
            this.f26316a.mo0a();
            this.f26317b.mo0a();
        }
        return xfa.f68157a;
    }
}
