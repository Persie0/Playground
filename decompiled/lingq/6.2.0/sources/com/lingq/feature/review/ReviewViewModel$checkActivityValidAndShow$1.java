package com.lingq.feature.review;

import kotlin.coroutines.jvm.internal.ContinuationImpl;
import p000.c32;
import p000.nb8;

/* JADX INFO: loaded from: classes3.dex */
@c32(m4290c = "com.lingq.feature.review.ReviewViewModel", m4291f = "ReviewViewModel.kt", m4292l = {533}, m4293m = "checkActivityValidAndShow", m4294v = 2)
final class ReviewViewModel$checkActivityValidAndShow$1 extends ContinuationImpl {

    /* JADX INFO: renamed from: a */
    public nb8 f31873a;

    /* JADX INFO: renamed from: b */
    public /* synthetic */ Object f31874b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ C2758f f31875c;

    /* JADX INFO: renamed from: d */
    public int f31876d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ReviewViewModel$checkActivityValidAndShow$1(C2758f c2758f, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.f31875c = c2758f;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.f31874b = obj;
        this.f31876d |= Integer.MIN_VALUE;
        return C2758f.m9602V2(this.f31875c, null, this);
    }
}
