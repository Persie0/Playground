package com.lingq.feature.review.activities;

import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import p000.c32;
import p000.o08;

/* JADX INFO: renamed from: com.lingq.feature.review.activities.ReviewActivitySpeakingViewModel$3$invokeSuspend$$inlined$filterNot$1$2$1 */
/* JADX INFO: loaded from: classes3.dex */
@c32(m4290c = "com.lingq.feature.review.activities.ReviewActivitySpeakingViewModel$3$invokeSuspend$$inlined$filterNot$1$2", m4291f = "ReviewActivitySpeakingViewModel.kt", m4292l = {217}, m4293m = "emit", m4294v = 2)
public final class C2716xcea316ee extends ContinuationImpl {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f32186a;

    /* JADX INFO: renamed from: b */
    public int f32187b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ o08 f32188c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2716xcea316ee(o08 o08Var, Continuation continuation) {
        super(continuation);
        this.f32188c = o08Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.f32186a = obj;
        this.f32187b |= Integer.MIN_VALUE;
        return this.f32188c.emit(null, this);
    }
}
