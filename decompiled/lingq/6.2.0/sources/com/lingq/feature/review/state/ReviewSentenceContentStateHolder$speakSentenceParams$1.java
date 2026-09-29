package com.lingq.feature.review.state;

import com.lingq.core.domain.model.lesson.LessonTranslationSentence;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import p000.c32;

/* JADX INFO: loaded from: classes3.dex */
@c32(m4290c = "com.lingq.feature.review.state.ReviewSentenceContentStateHolder", m4291f = "ReviewSentenceContentStateHolder.kt", m4292l = {238}, m4293m = "speakSentenceParams", m4294v = 2)
final class ReviewSentenceContentStateHolder$speakSentenceParams$1 extends ContinuationImpl {

    /* JADX INFO: renamed from: a */
    public int f32640a;

    /* JADX INFO: renamed from: b */
    public LessonTranslationSentence f32641b;

    /* JADX INFO: renamed from: c */
    public double f32642c;

    /* JADX INFO: renamed from: d */
    public double f32643d;

    /* JADX INFO: renamed from: e */
    public /* synthetic */ Object f32644e;

    /* JADX INFO: renamed from: f */
    public final /* synthetic */ C2763c f32645f;

    /* JADX INFO: renamed from: g */
    public int f32646g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ReviewSentenceContentStateHolder$speakSentenceParams$1(C2763c c2763c, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.f32645f = c2763c;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.f32644e = obj;
        this.f32646g |= Integer.MIN_VALUE;
        return this.f32645f.m9641g(0, this);
    }
}
