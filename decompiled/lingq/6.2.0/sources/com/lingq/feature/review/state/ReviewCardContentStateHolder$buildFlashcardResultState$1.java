package com.lingq.feature.review.state;

import com.lingq.core.domain.model.lesson.LessonCard;
import java.util.List;
import java.util.Map;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import p000.c32;

/* JADX INFO: loaded from: classes3.dex */
@c32(m4290c = "com.lingq.feature.review.state.ReviewCardContentStateHolder", m4291f = "ReviewCardContentStateHolder.kt", m4292l = {544}, m4293m = "buildFlashcardResultState", m4294v = 2)
final class ReviewCardContentStateHolder$buildFlashcardResultState$1 extends ContinuationImpl {

    /* JADX INFO: renamed from: a */
    public LessonCard f32556a;

    /* JADX INFO: renamed from: b */
    public Map f32557b;

    /* JADX INFO: renamed from: c */
    public List f32558c;

    /* JADX INFO: renamed from: d */
    public String f32559d;

    /* JADX INFO: renamed from: e */
    public /* synthetic */ Object f32560e;

    /* JADX INFO: renamed from: f */
    public final /* synthetic */ C2761a f32561f;

    /* JADX INFO: renamed from: g */
    public int f32562g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ReviewCardContentStateHolder$buildFlashcardResultState$1(C2761a c2761a, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.f32561f = c2761a;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.f32560e = obj;
        this.f32562g |= Integer.MIN_VALUE;
        return this.f32561f.m9620d(null, null, null, null, this);
    }
}
