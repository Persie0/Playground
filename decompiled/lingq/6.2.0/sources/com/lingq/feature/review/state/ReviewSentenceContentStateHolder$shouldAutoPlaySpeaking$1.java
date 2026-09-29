package com.lingq.feature.review.state;

import kotlin.coroutines.jvm.internal.ContinuationImpl;
import p000.c32;

/* JADX INFO: loaded from: classes3.dex */
@c32(m4290c = "com.lingq.feature.review.state.ReviewSentenceContentStateHolder", m4291f = "ReviewSentenceContentStateHolder.kt", m4292l = {232}, m4293m = "shouldAutoPlaySpeaking", m4294v = 2)
final class ReviewSentenceContentStateHolder$shouldAutoPlaySpeaking$1 extends ContinuationImpl {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f32637a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ C2763c f32638b;

    /* JADX INFO: renamed from: c */
    public int f32639c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ReviewSentenceContentStateHolder$shouldAutoPlaySpeaking$1(C2763c c2763c, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.f32638b = c2763c;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.f32637a = obj;
        this.f32639c |= Integer.MIN_VALUE;
        return this.f32638b.m9640f(false, this);
    }
}
