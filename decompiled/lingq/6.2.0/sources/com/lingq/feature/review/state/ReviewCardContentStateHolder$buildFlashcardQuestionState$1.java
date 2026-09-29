package com.lingq.feature.review.state;

import com.lingq.core.domain.model.lesson.LessonCard;
import java.util.List;
import java.util.Map;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import p000.c32;

/* JADX INFO: loaded from: classes3.dex */
@c32(m4290c = "com.lingq.feature.review.state.ReviewCardContentStateHolder", m4291f = "ReviewCardContentStateHolder.kt", m4292l = {396}, m4293m = "buildFlashcardQuestionState", m4294v = 2)
final class ReviewCardContentStateHolder$buildFlashcardQuestionState$1 extends ContinuationImpl {

    /* JADX INFO: renamed from: a */
    public LessonCard f32550a;

    /* JADX INFO: renamed from: b */
    public Map f32551b;

    /* JADX INFO: renamed from: c */
    public List f32552c;

    /* JADX INFO: renamed from: d */
    public /* synthetic */ Object f32553d;

    /* JADX INFO: renamed from: e */
    public final /* synthetic */ C2761a f32554e;

    /* JADX INFO: renamed from: f */
    public int f32555f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ReviewCardContentStateHolder$buildFlashcardQuestionState$1(C2761a c2761a, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.f32554e = c2761a;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.f32553d = obj;
        this.f32555f |= Integer.MIN_VALUE;
        return this.f32554e.m9619c(null, null, null, this);
    }
}
