package com.lingq.feature.review;

import kotlin.coroutines.jvm.internal.ContinuationImpl;
import p000.c32;

/* JADX INFO: loaded from: classes3.dex */
@c32(m4290c = "com.lingq.feature.review.ReviewComposeViewModel", m4291f = "ReviewComposeViewModel.kt", m4292l = {294}, m4293m = "renderSessionComplete", m4294v = 2)
final class ReviewComposeViewModel$renderSessionComplete$1 extends ContinuationImpl {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f31725a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ C2751b f31726b;

    /* JADX INFO: renamed from: c */
    public int f31727c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ReviewComposeViewModel$renderSessionComplete$1(C2751b c2751b, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.f31726b = c2751b;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.f31725a = obj;
        this.f31727c |= Integer.MIN_VALUE;
        return this.f31726b.m9573e3(this);
    }
}
