package com.lingq.feature.review.state;

import com.lingq.core.domain.model.lesson.LessonCard;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import p000.c32;
import p000.nb8;

/* JADX INFO: loaded from: classes3.dex */
@c32(m4290c = "com.lingq.feature.review.state.ReviewCardContentStateHolder", m4291f = "ReviewCardContentStateHolder.kt", m4292l = {303}, m4293m = "maybeAutoPlay", m4294v = 2)
final class ReviewCardContentStateHolder$maybeAutoPlay$1 extends ContinuationImpl {

    /* JADX INFO: renamed from: a */
    public nb8 f32598a;

    /* JADX INFO: renamed from: b */
    public LessonCard f32599b;

    /* JADX INFO: renamed from: c */
    public /* synthetic */ Object f32600c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ C2761a f32601d;

    /* JADX INFO: renamed from: e */
    public int f32602e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ReviewCardContentStateHolder$maybeAutoPlay$1(C2761a c2761a, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.f32601d = c2761a;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.f32600c = obj;
        this.f32602e |= Integer.MIN_VALUE;
        return this.f32601d.m9630n(null, null, this);
    }
}
