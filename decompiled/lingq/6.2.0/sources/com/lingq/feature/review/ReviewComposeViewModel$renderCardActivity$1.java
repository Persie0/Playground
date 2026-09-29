package com.lingq.feature.review;

import kotlin.coroutines.jvm.internal.ContinuationImpl;
import p000.c32;
import p000.nb8;

/* JADX INFO: loaded from: classes3.dex */
@c32(m4290c = "com.lingq.feature.review.ReviewComposeViewModel", m4291f = "ReviewComposeViewModel.kt", m4292l = {226, 229, 242}, m4293m = "renderCardActivity", m4294v = 2)
final class ReviewComposeViewModel$renderCardActivity$1 extends ContinuationImpl {

    /* JADX INFO: renamed from: a */
    public nb8 f31718a;

    /* JADX INFO: renamed from: b */
    public /* synthetic */ Object f31719b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ C2751b f31720c;

    /* JADX INFO: renamed from: d */
    public int f31721d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ReviewComposeViewModel$renderCardActivity$1(C2751b c2751b, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.f31720c = c2751b;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.f31719b = obj;
        this.f31721d |= Integer.MIN_VALUE;
        return this.f31720c.m9570b3(null, this);
    }
}
