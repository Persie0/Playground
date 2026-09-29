package com.lingq.feature.review.state;

import kotlin.coroutines.jvm.internal.ContinuationImpl;
import p000.c32;

/* JADX INFO: loaded from: classes3.dex */
@c32(m4290c = "com.lingq.feature.review.state.ReviewCardContentStateHolder", m4291f = "ReviewCardContentStateHolder.kt", m4292l = {190, 194}, m4293m = "increaseCardStatusIfEligible", m4294v = 2)
final class ReviewCardContentStateHolder$increaseCardStatusIfEligible$1 extends ContinuationImpl {

    /* JADX INFO: renamed from: a */
    public String f32588a;

    /* JADX INFO: renamed from: b */
    public /* synthetic */ Object f32589b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ C2761a f32590c;

    /* JADX INFO: renamed from: d */
    public int f32591d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ReviewCardContentStateHolder$increaseCardStatusIfEligible$1(C2761a c2761a, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.f32590c = c2761a;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.f32589b = obj;
        this.f32591d |= Integer.MIN_VALUE;
        return this.f32590c.m9628l(null, this);
    }
}
