package com.lingq.feature.review;

import kotlin.coroutines.jvm.internal.ContinuationImpl;
import p000.c32;

/* JADX INFO: loaded from: classes3.dex */
@c32(m4290c = "com.lingq.feature.review.ReviewComposeViewModel", m4291f = "ReviewComposeViewModel.kt", m4292l = {281}, m4293m = "renderUnscrambleActivity", m4294v = 2)
final class ReviewComposeViewModel$renderUnscrambleActivity$1 extends ContinuationImpl {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f31731a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ C2751b f31732b;

    /* JADX INFO: renamed from: c */
    public int f31733c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ReviewComposeViewModel$renderUnscrambleActivity$1(C2751b c2751b, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.f31732b = c2751b;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.f31731a = obj;
        this.f31733c |= Integer.MIN_VALUE;
        return this.f31732b.m9575g3(null, this);
    }
}
