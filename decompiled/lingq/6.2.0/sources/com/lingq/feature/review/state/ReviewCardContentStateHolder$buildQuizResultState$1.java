package com.lingq.feature.review.state;

import com.lingq.core.domain.model.lesson.LessonCard;
import java.util.List;
import java.util.Map;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import p000.c32;
import p000.nb8;

/* JADX INFO: loaded from: classes3.dex */
@c32(m4290c = "com.lingq.feature.review.state.ReviewCardContentStateHolder", m4291f = "ReviewCardContentStateHolder.kt", m4292l = {608}, m4293m = "buildQuizResultState", m4294v = 2)
final class ReviewCardContentStateHolder$buildQuizResultState$1 extends ContinuationImpl {

    /* JADX INFO: renamed from: a */
    public LessonCard f32576a;

    /* JADX INFO: renamed from: b */
    public nb8 f32577b;

    /* JADX INFO: renamed from: c */
    public Map f32578c;

    /* JADX INFO: renamed from: d */
    public List f32579d;

    /* JADX INFO: renamed from: e */
    public String f32580e;

    /* JADX INFO: renamed from: f */
    public boolean f32581f;

    /* JADX INFO: renamed from: g */
    public /* synthetic */ Object f32582g;

    /* JADX INFO: renamed from: h */
    public final /* synthetic */ C2761a f32583h;

    /* JADX INFO: renamed from: i */
    public int f32584i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ReviewCardContentStateHolder$buildQuizResultState$1(C2761a c2761a, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.f32583h = c2761a;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.f32582g = obj;
        this.f32584i |= Integer.MIN_VALUE;
        return this.f32583h.m9623g(null, null, null, null, null, false, this);
    }
}
