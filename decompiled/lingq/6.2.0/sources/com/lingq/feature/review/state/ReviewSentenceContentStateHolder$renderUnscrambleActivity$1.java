package com.lingq.feature.review.state;

import kotlin.coroutines.jvm.internal.ContinuationImpl;
import p000.c32;
import p000.mb8;

/* JADX INFO: loaded from: classes3.dex */
@c32(m4290c = "com.lingq.feature.review.state.ReviewSentenceContentStateHolder", m4291f = "ReviewSentenceContentStateHolder.kt", m4292l = {99, 101}, m4293m = "renderUnscrambleActivity", m4294v = 2)
final class ReviewSentenceContentStateHolder$renderUnscrambleActivity$1 extends ContinuationImpl {

    /* JADX INFO: renamed from: a */
    public mb8 f32631a;

    /* JADX INFO: renamed from: b */
    public C2763c f32632b;

    /* JADX INFO: renamed from: c */
    public int f32633c;

    /* JADX INFO: renamed from: d */
    public /* synthetic */ Object f32634d;

    /* JADX INFO: renamed from: e */
    public final /* synthetic */ C2763c f32635e;

    /* JADX INFO: renamed from: f */
    public int f32636f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ReviewSentenceContentStateHolder$renderUnscrambleActivity$1(C2763c c2763c, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.f32635e = c2763c;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.f32634d = obj;
        this.f32636f |= Integer.MIN_VALUE;
        return this.f32635e.m9638d(null, 0, this);
    }
}
