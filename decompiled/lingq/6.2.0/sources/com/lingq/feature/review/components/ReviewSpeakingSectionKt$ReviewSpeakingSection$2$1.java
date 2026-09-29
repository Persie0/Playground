package com.lingq.feature.review.components;

import android.content.Intent;
import android.speech.SpeechRecognizer;
import kotlin.AbstractC3193b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import p000.c32;
import p000.fg8;
import p000.t66;
import p000.un1;
import p000.xfa;
import p000.zi3;

/* JADX INFO: loaded from: classes3.dex */
@c32(m4290c = "com.lingq.feature.review.components.ReviewSpeakingSectionKt$ReviewSpeakingSection$2$1", m4291f = "ReviewSpeakingSection.kt", m4292l = {}, m4293m = "invokeSuspend", m4294v = 2)
final class ReviewSpeakingSectionKt$ReviewSpeakingSection$2$1 extends SuspendLambda implements zi3 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ SpeechRecognizer f32411a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ t66 f32412b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ fg8 f32413c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ReviewSpeakingSectionKt$ReviewSpeakingSection$2$1(SpeechRecognizer speechRecognizer, t66 t66Var, fg8 fg8Var, Continuation continuation) {
        super(2, continuation);
        this.f32411a = speechRecognizer;
        this.f32412b = t66Var;
        this.f32413c = fg8Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new ReviewSpeakingSectionKt$ReviewSpeakingSection$2$1(this.f32411a, this.f32412b, this.f32413c, continuation);
    }

    @Override // p000.zi3
    public final Object invoke(Object obj, Object obj2) throws Throwable {
        ReviewSpeakingSectionKt$ReviewSpeakingSection$2$1 reviewSpeakingSectionKt$ReviewSpeakingSection$2$1 = (ReviewSpeakingSectionKt$ReviewSpeakingSection$2$1) create((un1) obj, (Continuation) obj2);
        xfa xfaVar = xfa.f68157a;
        reviewSpeakingSectionKt$ReviewSpeakingSection$2$1.invokeSuspend(xfaVar);
        return xfaVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        AbstractC3193b.m15359b(obj);
        t66 t66Var = this.f32412b;
        boolean zBooleanValue = ((Boolean) t66Var.getValue()).booleanValue();
        xfa xfaVar = xfa.f68157a;
        if (!zBooleanValue) {
            return xfaVar;
        }
        t66Var.setValue(Boolean.FALSE);
        Intent intent = new Intent("android.speech.action.RECOGNIZE_SPEECH");
        intent.putExtra("android.speech.extra.LANGUAGE_MODEL", "free_form");
        intent.putExtra("android.speech.extra.PARTIAL_RESULTS", true);
        fg8 fg8Var = this.f32413c;
        intent.putExtra("android.speech.extra.LANGUAGE", fg8Var.f39079c);
        intent.putExtra("android.speech.extra.PROMPT", fg8Var.f39077a.f68136c);
        this.f32411a.startListening(intent);
        return xfaVar;
    }
}
