package com.lingq.feature.review.state;

import kotlin.coroutines.jvm.internal.ContinuationImpl;
import p000.c32;
import p000.lb8;

/* JADX INFO: loaded from: classes3.dex */
@c32(m4290c = "com.lingq.feature.review.state.ReviewSentenceContentStateHolder", m4291f = "ReviewSentenceContentStateHolder.kt", m4292l = {80, 82}, m4293m = "renderSpeakingActivity", m4294v = 2)
final class ReviewSentenceContentStateHolder$renderSpeakingActivity$1 extends ContinuationImpl {

    /* JADX INFO: renamed from: a */
    public lb8 f32624a;

    /* JADX INFO: renamed from: b */
    public C2763c f32625b;

    /* JADX INFO: renamed from: c */
    public int f32626c;

    /* JADX INFO: renamed from: d */
    public boolean f32627d;

    /* JADX INFO: renamed from: e */
    public /* synthetic */ Object f32628e;

    /* JADX INFO: renamed from: f */
    public final /* synthetic */ C2763c f32629f;

    /* JADX INFO: renamed from: g */
    public int f32630g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ReviewSentenceContentStateHolder$renderSpeakingActivity$1(C2763c c2763c, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.f32629f = c2763c;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.f32628e = obj;
        this.f32630g |= Integer.MIN_VALUE;
        return this.f32629f.m9637c(null, 0, false, this);
    }
}
