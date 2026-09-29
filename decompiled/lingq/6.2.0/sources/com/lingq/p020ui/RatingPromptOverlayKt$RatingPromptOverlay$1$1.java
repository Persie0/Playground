package com.lingq.p020ui;

import kotlin.AbstractC3193b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import p000.c32;
import p000.un1;
import p000.vi3;
import p000.xfa;
import p000.yq7;
import p000.zi3;

/* JADX INFO: loaded from: classes.dex */
@c32(m4290c = "com.lingq.ui.RatingPromptOverlayKt$RatingPromptOverlay$1$1", m4291f = "RatingPromptOverlay.kt", m4292l = {}, m4293m = "invokeSuspend", m4294v = 2)
final class RatingPromptOverlayKt$RatingPromptOverlay$1$1 extends SuspendLambda implements zi3 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ yq7 f34160a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ vi3 f34161b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RatingPromptOverlayKt$RatingPromptOverlay$1$1(yq7 yq7Var, vi3 vi3Var, Continuation continuation) {
        super(2, continuation);
        this.f34160a = yq7Var;
        this.f34161b = vi3Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new RatingPromptOverlayKt$RatingPromptOverlay$1$1(this.f34160a, this.f34161b, continuation);
    }

    @Override // p000.zi3
    public final Object invoke(Object obj, Object obj2) throws Throwable {
        RatingPromptOverlayKt$RatingPromptOverlay$1$1 ratingPromptOverlayKt$RatingPromptOverlay$1$1 = (RatingPromptOverlayKt$RatingPromptOverlay$1$1) create((un1) obj, (Continuation) obj2);
        xfa xfaVar = xfa.f68157a;
        ratingPromptOverlayKt$RatingPromptOverlay$1$1.invokeSuspend(xfaVar);
        return xfaVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        AbstractC3193b.m15359b(obj);
        yq7 yq7Var = this.f34160a;
        if (yq7Var.f70296c) {
            this.f34161b.invoke(Boolean.valueOf(yq7Var.f70297d));
        }
        return xfa.f68157a;
    }
}
