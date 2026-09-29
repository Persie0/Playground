package com.lingq.feature.review.state;

import com.lingq.core.domain.model.lesson.LessonCard;
import java.util.List;
import java.util.Map;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import p000.c32;

/* JADX INFO: loaded from: classes3.dex */
@c32(m4290c = "com.lingq.feature.review.state.ReviewCardContentStateHolder", m4291f = "ReviewCardContentStateHolder.kt", m4292l = {575}, m4293m = "buildFlashcardReverseResultState", m4294v = 2)
final class ReviewCardContentStateHolder$buildFlashcardReverseResultState$1 extends ContinuationImpl {

    /* JADX INFO: renamed from: a */
    public LessonCard f32569a;

    /* JADX INFO: renamed from: b */
    public Map f32570b;

    /* JADX INFO: renamed from: c */
    public List f32571c;

    /* JADX INFO: renamed from: d */
    public String f32572d;

    /* JADX INFO: renamed from: e */
    public /* synthetic */ Object f32573e;

    /* JADX INFO: renamed from: f */
    public final /* synthetic */ C2761a f32574f;

    /* JADX INFO: renamed from: g */
    public int f32575g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ReviewCardContentStateHolder$buildFlashcardReverseResultState$1(C2761a c2761a, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.f32574f = c2761a;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.f32573e = obj;
        this.f32575g |= Integer.MIN_VALUE;
        return this.f32574f.m9622f(null, null, null, null, this);
    }
}
