package com.lingq.feature.review.domain;

import kotlin.coroutines.jvm.internal.ContinuationImpl;
import p000.c32;

/* JADX INFO: loaded from: classes3.dex */
@c32(m4290c = "com.lingq.feature.review.domain.ReviewSettingsProvider", m4291f = "ReviewSettingsProvider.kt", m4292l = {74, 75, 76, 77, 78, 79}, m4293m = "flashcardReverseBackSettings", m4294v = 2)
final class ReviewSettingsProvider$flashcardReverseBackSettings$1 extends ContinuationImpl {

    /* JADX INFO: renamed from: a */
    public boolean f32449a;

    /* JADX INFO: renamed from: b */
    public boolean f32450b;

    /* JADX INFO: renamed from: c */
    public boolean f32451c;

    /* JADX INFO: renamed from: d */
    public boolean f32452d;

    /* JADX INFO: renamed from: e */
    public boolean f32453e;

    /* JADX INFO: renamed from: f */
    public /* synthetic */ Object f32454f;

    /* JADX INFO: renamed from: g */
    public final /* synthetic */ C2755a f32455g;

    /* JADX INFO: renamed from: h */
    public int f32456h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ReviewSettingsProvider$flashcardReverseBackSettings$1(C2755a c2755a, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.f32455g = c2755a;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.f32454f = obj;
        this.f32456h |= Integer.MIN_VALUE;
        return this.f32455g.m9597d(this);
    }
}
