package com.lingq.feature.review.domain;

import kotlin.coroutines.jvm.internal.ContinuationImpl;
import p000.c32;

/* JADX INFO: loaded from: classes3.dex */
@c32(m4290c = "com.lingq.feature.review.domain.ReviewSettingsProvider", m4291f = "ReviewSettingsProvider.kt", m4292l = {14}, m4293m = "shouldShuffleCards", m4294v = 2)
final class ReviewSettingsProvider$shouldShuffleCards$1 extends ContinuationImpl {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f32464a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ C2755a f32465b;

    /* JADX INFO: renamed from: c */
    public int f32466c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ReviewSettingsProvider$shouldShuffleCards$1(C2755a c2755a, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.f32465b = c2755a;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.f32464a = obj;
        this.f32466c |= Integer.MIN_VALUE;
        return this.f32465b.m9600g(this);
    }
}
