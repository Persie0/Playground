package com.lingq.feature.review.state;

import kotlin.coroutines.jvm.internal.ContinuationImpl;
import p000.c32;
import p000.ec8;

/* JADX INFO: loaded from: classes3.dex */
@c32(m4290c = "com.lingq.feature.review.state.ReviewSessionStateHolder", m4291f = "ReviewSessionStateHolder.kt", m4292l = {223, 232}, m4293m = "fetchLotdCards", m4294v = 2)
final class ReviewSessionStateHolder$fetchLotdCards$1 extends ContinuationImpl {

    /* JADX INFO: renamed from: a */
    public boolean f32677a;

    /* JADX INFO: renamed from: b */
    public ec8 f32678b;

    /* JADX INFO: renamed from: c */
    public /* synthetic */ Object f32679c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ C2764d f32680d;

    /* JADX INFO: renamed from: e */
    public int f32681e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ReviewSessionStateHolder$fetchLotdCards$1(C2764d c2764d, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.f32680d = c2764d;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.f32679c = obj;
        this.f32681e |= Integer.MIN_VALUE;
        return this.f32680d.m9647e(false, null, this);
    }
}
