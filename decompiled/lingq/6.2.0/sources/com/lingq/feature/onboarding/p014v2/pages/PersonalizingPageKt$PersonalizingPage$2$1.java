package com.lingq.feature.onboarding.p014v2.pages;

import androidx.compose.animation.core.C0059a;
import kotlin.AbstractC3193b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import p000.c32;
import p000.sc9;
import p000.un1;
import p000.xfa;
import p000.zi3;

/* JADX INFO: loaded from: classes3.dex */
@c32(m4290c = "com.lingq.feature.onboarding.v2.pages.PersonalizingPageKt$PersonalizingPage$2$1", m4291f = "PersonalizingPage.kt", m4292l = {}, m4293m = "invokeSuspend", m4294v = 2)
final class PersonalizingPageKt$PersonalizingPage$2$1 extends SuspendLambda implements zi3 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ C0059a f27494a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ sc9 f27495b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ sc9 f27496c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PersonalizingPageKt$PersonalizingPage$2$1(C0059a c0059a, sc9 sc9Var, sc9 sc9Var2, Continuation continuation) {
        super(2, continuation);
        this.f27494a = c0059a;
        this.f27495b = sc9Var;
        this.f27496c = sc9Var2;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new PersonalizingPageKt$PersonalizingPage$2$1(this.f27494a, this.f27495b, this.f27496c, continuation);
    }

    @Override // p000.zi3
    public final Object invoke(Object obj, Object obj2) throws Throwable {
        PersonalizingPageKt$PersonalizingPage$2$1 personalizingPageKt$PersonalizingPage$2$1 = (PersonalizingPageKt$PersonalizingPage$2$1) create((un1) obj, (Continuation) obj2);
        xfa xfaVar = xfa.f68157a;
        personalizingPageKt$PersonalizingPage$2$1.invokeSuspend(xfaVar);
        return xfaVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        int i;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        AbstractC3193b.m15359b(obj);
        int iFloatValue = (int) (((Number) this.f27494a.m745d()).floatValue() * 100.0f);
        sc9 sc9Var = this.f27495b;
        sc9Var.m21223i(iFloatValue);
        if (sc9Var.m21222h() >= 90) {
            i = 4;
        } else if (sc9Var.m21222h() >= 60) {
            i = 3;
        } else if (sc9Var.m21222h() >= 30) {
            i = 2;
        } else {
            i = sc9Var.m21222h() >= 10 ? 1 : 0;
        }
        this.f27496c.m21223i(i);
        return xfa.f68157a;
    }
}
