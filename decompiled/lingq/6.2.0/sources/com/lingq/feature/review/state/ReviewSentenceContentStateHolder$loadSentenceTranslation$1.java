package com.lingq.feature.review.state;

import kotlin.coroutines.jvm.internal.ContinuationImpl;
import p000.c32;

/* JADX INFO: loaded from: classes3.dex */
@c32(m4290c = "com.lingq.feature.review.state.ReviewSentenceContentStateHolder", m4291f = "ReviewSentenceContentStateHolder.kt", m4292l = {328, 333, 340}, m4293m = "loadSentenceTranslation", m4294v = 2)
final class ReviewSentenceContentStateHolder$loadSentenceTranslation$1 extends ContinuationImpl {

    /* JADX INFO: renamed from: a */
    public int f32619a;

    /* JADX INFO: renamed from: b */
    public int f32620b;

    /* JADX INFO: renamed from: c */
    public /* synthetic */ Object f32621c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ C2763c f32622d;

    /* JADX INFO: renamed from: e */
    public int f32623e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ReviewSentenceContentStateHolder$loadSentenceTranslation$1(C2763c c2763c, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.f32622d = c2763c;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.f32621c = obj;
        this.f32623e |= Integer.MIN_VALUE;
        return this.f32622d.m9636b(0, 0, this);
    }
}
