package com.lingq.feature.review.state;

import com.lingq.core.domain.model.lesson.LessonCard;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import p000.c32;
import p000.db8;
import p000.sc8;

/* JADX INFO: loaded from: classes3.dex */
@c32(m4290c = "com.lingq.feature.review.state.ReviewCardContentStateHolder", m4291f = "ReviewCardContentStateHolder.kt", m4292l = {656, 668}, m4293m = "loadClozeTest", m4294v = 2)
final class ReviewCardContentStateHolder$loadClozeTest$1 extends ContinuationImpl {

    /* JADX INFO: renamed from: a */
    public LessonCard f32592a;

    /* JADX INFO: renamed from: b */
    public db8 f32593b;

    /* JADX INFO: renamed from: c */
    public sc8 f32594c;

    /* JADX INFO: renamed from: d */
    public /* synthetic */ Object f32595d;

    /* JADX INFO: renamed from: e */
    public final /* synthetic */ C2761a f32596e;

    /* JADX INFO: renamed from: f */
    public int f32597f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ReviewCardContentStateHolder$loadClozeTest$1(C2761a c2761a, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.f32596e = c2761a;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.f32595d = obj;
        this.f32597f |= Integer.MIN_VALUE;
        return this.f32596e.m9629m(null, null, this);
    }
}
