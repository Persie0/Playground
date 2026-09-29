package com.lingq.feature.review.state;

import kotlin.coroutines.jvm.internal.ContinuationImpl;
import p000.c32;

/* JADX INFO: loaded from: classes3.dex */
@c32(m4290c = "com.lingq.feature.review.state.ReviewMatchingContentStateHolder", m4291f = "ReviewMatchingContentStateHolder.kt", m4292l = {38}, m4293m = "renderMatchingActivity", m4294v = 2)
final class ReviewMatchingContentStateHolder$renderMatchingActivity$1 extends ContinuationImpl {

    /* JADX INFO: renamed from: a */
    public C2762b f32615a;

    /* JADX INFO: renamed from: b */
    public /* synthetic */ Object f32616b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ C2762b f32617c;

    /* JADX INFO: renamed from: d */
    public int f32618d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ReviewMatchingContentStateHolder$renderMatchingActivity$1(C2762b c2762b, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.f32617c = c2762b;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.f32616b = obj;
        this.f32618d |= Integer.MIN_VALUE;
        return this.f32617c.m9634a(null, this);
    }
}
