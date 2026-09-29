package com.lingq.feature.review.state;

import com.lingq.core.domain.model.lesson.LessonCard;
import java.util.List;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import p000.c32;
import p000.nb8;
import p000.sc8;

/* JADX INFO: loaded from: classes3.dex */
@c32(m4290c = "com.lingq.feature.review.state.ReviewCardContentStateHolder", m4291f = "ReviewCardContentStateHolder.kt", m4292l = {341, 342, 345, 348}, m4293m = "buildCardQuestionState", m4294v = 2)
final class ReviewCardContentStateHolder$buildCardQuestionState$1 extends ContinuationImpl {

    /* JADX INFO: renamed from: a */
    public nb8 f32535a;

    /* JADX INFO: renamed from: b */
    public LessonCard f32536b;

    /* JADX INFO: renamed from: c */
    public sc8 f32537c;

    /* JADX INFO: renamed from: d */
    public List f32538d;

    /* JADX INFO: renamed from: e */
    public boolean f32539e;

    /* JADX INFO: renamed from: f */
    public /* synthetic */ Object f32540f;

    /* JADX INFO: renamed from: g */
    public final /* synthetic */ C2761a f32541g;

    /* JADX INFO: renamed from: h */
    public int f32542h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ReviewCardContentStateHolder$buildCardQuestionState$1(C2761a c2761a, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.f32541g = c2761a;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.f32540f = obj;
        this.f32542h |= Integer.MIN_VALUE;
        return this.f32541g.m9617a(null, null, null, false, this);
    }
}
