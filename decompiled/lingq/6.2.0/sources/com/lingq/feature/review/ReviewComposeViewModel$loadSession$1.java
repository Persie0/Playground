package com.lingq.feature.review;

import kotlin.coroutines.jvm.internal.ContinuationImpl;
import p000.c32;

/* JADX INFO: loaded from: classes3.dex */
@c32(m4290c = "com.lingq.feature.review.ReviewComposeViewModel", m4291f = "ReviewComposeViewModel.kt", m4292l = {165, 172}, m4293m = "loadSession", m4294v = 2)
final class ReviewComposeViewModel$loadSession$1 extends ContinuationImpl {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f31712a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ C2751b f31713b;

    /* JADX INFO: renamed from: c */
    public int f31714c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ReviewComposeViewModel$loadSession$1(C2751b c2751b, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.f31713b = c2751b;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.f31712a = obj;
        this.f31714c |= Integer.MIN_VALUE;
        return C2751b.m9564V2(this.f31713b, null, this);
    }
}
