package com.lingq.feature.edit.components;

import kotlin.AbstractC3193b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import p000.c32;
import p000.t66;
import p000.un1;
import p000.vv9;
import p000.xfa;
import p000.zi3;

/* JADX INFO: loaded from: classes2.dex */
@c32(m4290c = "com.lingq.feature.edit.components.SentenceEditTextFieldKt$SentenceEditTextField$1$1", m4291f = "SentenceEditTextField.kt", m4292l = {}, m4293m = "invokeSuspend", m4294v = 2)
final class SentenceEditTextFieldKt$SentenceEditTextField$1$1 extends SuspendLambda implements zi3 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ String f25960a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ t66 f25961b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ t66 f25962c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SentenceEditTextFieldKt$SentenceEditTextField$1$1(String str, t66 t66Var, t66 t66Var2, Continuation continuation) {
        super(2, continuation);
        this.f25960a = str;
        this.f25961b = t66Var;
        this.f25962c = t66Var2;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new SentenceEditTextFieldKt$SentenceEditTextField$1$1(this.f25960a, this.f25961b, this.f25962c, continuation);
    }

    @Override // p000.zi3
    public final Object invoke(Object obj, Object obj2) throws Throwable {
        SentenceEditTextFieldKt$SentenceEditTextField$1$1 sentenceEditTextFieldKt$SentenceEditTextField$1$1 = (SentenceEditTextFieldKt$SentenceEditTextField$1$1) create((un1) obj, (Continuation) obj2);
        xfa xfaVar = xfa.f68157a;
        sentenceEditTextFieldKt$SentenceEditTextField$1$1.invokeSuspend(xfaVar);
        return xfaVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        AbstractC3193b.m15359b(obj);
        if (!((Boolean) this.f25961b.getValue()).booleanValue()) {
            this.f25962c.setValue(new vv9(this.f25960a, 6, 0L));
        }
        return xfa.f68157a;
    }
}
