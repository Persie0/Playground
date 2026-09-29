package com.lingq.feature.review.state;

import com.lingq.core.domain.model.lesson.LessonCard;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import p000.c32;
import p000.nb8;

/* JADX INFO: loaded from: classes3.dex */
@c32(m4290c = "com.lingq.feature.review.state.ReviewCardContentStateHolder", m4291f = "ReviewCardContentStateHolder.kt", m4292l = {112, 120, 126, 128}, m4293m = "renderActivity", m4294v = 2)
final class ReviewCardContentStateHolder$renderActivity$1 extends ContinuationImpl {

    /* JADX INFO: renamed from: a */
    public nb8 f32603a;

    /* JADX INFO: renamed from: b */
    public LessonCard f32604b;

    /* JADX INFO: renamed from: c */
    public C2761a f32605c;

    /* JADX INFO: renamed from: d */
    public boolean f32606d;

    /* JADX INFO: renamed from: e */
    public /* synthetic */ Object f32607e;

    /* JADX INFO: renamed from: f */
    public final /* synthetic */ C2761a f32608f;

    /* JADX INFO: renamed from: g */
    public int f32609g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ReviewCardContentStateHolder$renderActivity$1(C2761a c2761a, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.f32608f = c2761a;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.f32607e = obj;
        this.f32609g |= Integer.MIN_VALUE;
        return this.f32608f.m9631o(null, false, this);
    }
}
