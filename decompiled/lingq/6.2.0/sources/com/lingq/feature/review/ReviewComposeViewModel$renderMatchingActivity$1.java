package com.lingq.feature.review;

import kotlin.coroutines.jvm.internal.ContinuationImpl;
import p000.c32;

/* JADX INFO: loaded from: classes3.dex */
@c32(m4290c = "com.lingq.feature.review.ReviewComposeViewModel", m4291f = "ReviewComposeViewModel.kt", m4292l = {248}, m4293m = "renderMatchingActivity", m4294v = 2)
final class ReviewComposeViewModel$renderMatchingActivity$1 extends ContinuationImpl {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f31722a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ C2751b f31723b;

    /* JADX INFO: renamed from: c */
    public int f31724c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ReviewComposeViewModel$renderMatchingActivity$1(C2751b c2751b, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.f31723b = c2751b;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.f31722a = obj;
        this.f31724c |= Integer.MIN_VALUE;
        return this.f31723b.m9572d3(null, this);
    }
}
