package com.lingq.feature.review.state;

import kotlin.coroutines.jvm.internal.ContinuationImpl;
import p000.c32;
import p000.ec8;

/* JADX INFO: loaded from: classes3.dex */
@c32(m4290c = "com.lingq.feature.review.state.ReviewSessionStateHolder", m4291f = "ReviewSessionStateHolder.kt", m4292l = {203, 211, 215, 216}, m4293m = "fetchCards", m4294v = 2)
final class ReviewSessionStateHolder$fetchCards$1 extends ContinuationImpl {

    /* JADX INFO: renamed from: a */
    public boolean f32670a;

    /* JADX INFO: renamed from: b */
    public ec8 f32671b;

    /* JADX INFO: renamed from: c */
    public int f32672c;

    /* JADX INFO: renamed from: d */
    public int f32673d;

    /* JADX INFO: renamed from: e */
    public /* synthetic */ Object f32674e;

    /* JADX INFO: renamed from: f */
    public final /* synthetic */ C2764d f32675f;

    /* JADX INFO: renamed from: g */
    public int f32676g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ReviewSessionStateHolder$fetchCards$1(C2764d c2764d, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.f32675f = c2764d;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.f32674e = obj;
        this.f32676g |= Integer.MIN_VALUE;
        return this.f32675f.m9646d(false, null, this);
    }
}
