package com.lingq.feature.review.domain;

import kotlin.coroutines.jvm.internal.ContinuationImpl;
import p000.c32;

/* JADX INFO: loaded from: classes3.dex */
@c32(m4290c = "com.lingq.feature.review.domain.ReviewSettingsProvider", m4291f = "ReviewSettingsProvider.kt", m4292l = {65, 66, 67, 68, 69}, m4293m = "flashcardReverseFrontSettings", m4294v = 2)
final class ReviewSettingsProvider$flashcardReverseFrontSettings$1 extends ContinuationImpl {

    /* JADX INFO: renamed from: a */
    public boolean f32457a;

    /* JADX INFO: renamed from: b */
    public boolean f32458b;

    /* JADX INFO: renamed from: c */
    public boolean f32459c;

    /* JADX INFO: renamed from: d */
    public boolean f32460d;

    /* JADX INFO: renamed from: e */
    public /* synthetic */ Object f32461e;

    /* JADX INFO: renamed from: f */
    public final /* synthetic */ C2755a f32462f;

    /* JADX INFO: renamed from: g */
    public int f32463g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ReviewSettingsProvider$flashcardReverseFrontSettings$1(C2755a c2755a, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.f32462f = c2755a;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.f32461e = obj;
        this.f32463g |= Integer.MIN_VALUE;
        return this.f32462f.m9598e(this);
    }
}
