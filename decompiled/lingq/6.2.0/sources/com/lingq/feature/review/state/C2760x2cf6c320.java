package com.lingq.feature.review.state;

import com.lingq.core.domain.model.lesson.LessonCard;
import java.util.List;
import java.util.Map;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import p000.c32;

/* JADX INFO: renamed from: com.lingq.feature.review.state.ReviewCardContentStateHolder$buildFlashcardReverseQuestionState$1 */
/* JADX INFO: loaded from: classes3.dex */
@c32(m4290c = "com.lingq.feature.review.state.ReviewCardContentStateHolder", m4291f = "ReviewCardContentStateHolder.kt", m4292l = {428}, m4293m = "buildFlashcardReverseQuestionState", m4294v = 2)
final class C2760x2cf6c320 extends ContinuationImpl {

    /* JADX INFO: renamed from: a */
    public LessonCard f32563a;

    /* JADX INFO: renamed from: b */
    public Map f32564b;

    /* JADX INFO: renamed from: c */
    public List f32565c;

    /* JADX INFO: renamed from: d */
    public /* synthetic */ Object f32566d;

    /* JADX INFO: renamed from: e */
    public final /* synthetic */ C2761a f32567e;

    /* JADX INFO: renamed from: f */
    public int f32568f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2760x2cf6c320(C2761a c2761a, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.f32567e = c2761a;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.f32566d = obj;
        this.f32568f |= Integer.MIN_VALUE;
        return this.f32567e.m9621e(null, null, null, this);
    }
}
