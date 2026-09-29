package com.lingq.feature.review;

import kotlin.coroutines.jvm.internal.ContinuationImpl;
import p000.c32;

/* JADX INFO: loaded from: classes3.dex */
@c32(m4290c = "com.lingq.feature.review.ReviewComposeViewModel", m4291f = "ReviewComposeViewModel.kt", m4292l = {261, 275}, m4293m = "renderSpeakingActivity", m4294v = 2)
final class ReviewComposeViewModel$renderSpeakingActivity$1 extends ContinuationImpl {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f31728a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ C2751b f31729b;

    /* JADX INFO: renamed from: c */
    public int f31730c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ReviewComposeViewModel$renderSpeakingActivity$1(C2751b c2751b, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.f31729b = c2751b;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.f31728a = obj;
        this.f31730c |= Integer.MIN_VALUE;
        return this.f31729b.m9574f3(null, this);
    }
}
