package com.lingq.feature.review.state;

import com.lingq.core.domain.model.lesson.LessonCard;
import java.util.List;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import p000.c32;
import p000.nb8;

/* JADX INFO: loaded from: classes3.dex */
@c32(m4290c = "com.lingq.feature.review.state.ReviewCardContentStateHolder", m4291f = "ReviewCardContentStateHolder.kt", m4292l = {519, 520, 529, 532, 534}, m4293m = "buildCardResultState", m4294v = 2)
final class ReviewCardContentStateHolder$buildCardResultState$1 extends ContinuationImpl {

    /* JADX INFO: renamed from: a */
    public nb8 f32543a;

    /* JADX INFO: renamed from: b */
    public LessonCard f32544b;

    /* JADX INFO: renamed from: c */
    public List f32545c;

    /* JADX INFO: renamed from: d */
    public boolean f32546d;

    /* JADX INFO: renamed from: e */
    public /* synthetic */ Object f32547e;

    /* JADX INFO: renamed from: f */
    public final /* synthetic */ C2761a f32548f;

    /* JADX INFO: renamed from: g */
    public int f32549g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ReviewCardContentStateHolder$buildCardResultState$1(C2761a c2761a, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.f32548f = c2761a;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.f32547e = obj;
        this.f32549g |= Integer.MIN_VALUE;
        return this.f32548f.m9618b(null, null, false, this);
    }
}
