package com.lingq.p020ui;

import kotlin.AbstractC3193b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import p000.c32;
import p000.ui3;
import p000.un1;
import p000.xfa;
import p000.zi3;

/* JADX INFO: loaded from: classes3.dex */
@c32(m4290c = "com.lingq.ui.RatingPromptOverlayKt$RatingPromptOverlay$2$1", m4291f = "RatingPromptOverlay.kt", m4292l = {}, m4293m = "invokeSuspend", m4294v = 2)
final class RatingPromptOverlayKt$RatingPromptOverlay$2$1 extends SuspendLambda implements zi3 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ ui3 f34162a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RatingPromptOverlayKt$RatingPromptOverlay$2$1(ui3 ui3Var, Continuation continuation) {
        super(2, continuation);
        this.f34162a = ui3Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new RatingPromptOverlayKt$RatingPromptOverlay$2$1(this.f34162a, continuation);
    }

    @Override // p000.zi3
    public final Object invoke(Object obj, Object obj2) throws Throwable {
        RatingPromptOverlayKt$RatingPromptOverlay$2$1 ratingPromptOverlayKt$RatingPromptOverlay$2$1 = (RatingPromptOverlayKt$RatingPromptOverlay$2$1) create((un1) obj, (Continuation) obj2);
        xfa xfaVar = xfa.f68157a;
        ratingPromptOverlayKt$RatingPromptOverlay$2$1.invokeSuspend(xfaVar);
        return xfaVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        AbstractC3193b.m15359b(obj);
        this.f34162a.mo0a();
        return xfa.f68157a;
    }
}
