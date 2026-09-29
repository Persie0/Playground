package com.lingq.feature.review.domain;

import kotlin.coroutines.jvm.internal.ContinuationImpl;
import p000.c32;

/* JADX INFO: loaded from: classes3.dex */
@c32(m4290c = "com.lingq.feature.review.domain.ReviewSettingsProvider", m4291f = "ReviewSettingsProvider.kt", m4292l = {54, 55, 56, 57, 58, 59}, m4293m = "flashcardBackSettings", m4294v = 2)
final class ReviewSettingsProvider$flashcardBackSettings$1 extends ContinuationImpl {

    /* JADX INFO: renamed from: a */
    public boolean f32434a;

    /* JADX INFO: renamed from: b */
    public boolean f32435b;

    /* JADX INFO: renamed from: c */
    public boolean f32436c;

    /* JADX INFO: renamed from: d */
    public boolean f32437d;

    /* JADX INFO: renamed from: e */
    public boolean f32438e;

    /* JADX INFO: renamed from: f */
    public /* synthetic */ Object f32439f;

    /* JADX INFO: renamed from: g */
    public final /* synthetic */ C2755a f32440g;

    /* JADX INFO: renamed from: h */
    public int f32441h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ReviewSettingsProvider$flashcardBackSettings$1(C2755a c2755a, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.f32440g = c2755a;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.f32439f = obj;
        this.f32441h |= Integer.MIN_VALUE;
        return this.f32440g.m9595b(this);
    }
}
