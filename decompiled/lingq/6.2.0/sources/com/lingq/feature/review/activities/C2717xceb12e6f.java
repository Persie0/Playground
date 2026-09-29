package com.lingq.feature.review.activities;

import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import p000.c32;
import p000.o08;

/* JADX INFO: renamed from: com.lingq.feature.review.activities.ReviewActivitySpeakingViewModel$3$invokeSuspend$$inlined$filterNot$2$2$1 */
/* JADX INFO: loaded from: classes3.dex */
@c32(m4290c = "com.lingq.feature.review.activities.ReviewActivitySpeakingViewModel$3$invokeSuspend$$inlined$filterNot$2$2", m4291f = "ReviewActivitySpeakingViewModel.kt", m4292l = {217}, m4293m = "emit", m4294v = 2)
public final class C2717xceb12e6f extends ContinuationImpl {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f32189a;

    /* JADX INFO: renamed from: b */
    public int f32190b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ o08 f32191c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2717xceb12e6f(o08 o08Var, Continuation continuation) {
        super(continuation);
        this.f32191c = o08Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.f32189a = obj;
        this.f32190b |= Integer.MIN_VALUE;
        return this.f32191c.emit(null, this);
    }
}
