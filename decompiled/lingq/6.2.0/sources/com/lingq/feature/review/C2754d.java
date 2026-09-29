package com.lingq.feature.review;

import com.lingq.core.domain.model.lesson.LessonCard;
import com.lingq.core.domain.model.status.TokenStatus;
import p000.bh4;
import p000.lda;
import p000.vi3;
import p000.wfb;
import p000.xfa;
import p000.y7d;

/* JADX INFO: renamed from: com.lingq.feature.review.d */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class C2754d implements vi3 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ ReviewSessionCompleteFragment f32414a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ LessonCard f32415b;

    public /* synthetic */ C2754d(ReviewSessionCompleteFragment reviewSessionCompleteFragment, LessonCard lessonCard) {
        this.f32414a = reviewSessionCompleteFragment;
        this.f32415b = lessonCard;
    }

    @Override // p000.vi3
    public final Object invoke(Object obj) {
        TokenStatus tokenStatus = (TokenStatus) obj;
        bh4[] bh4VarArr = ReviewSessionCompleteFragment.f31753G0;
        tokenStatus.getClass();
        C2757e c2757eM9534S0 = this.f32414a.m9534S0();
        wfb.m23926u(lda.m16103C(c2757eM9534S0), null, null, new ReviewSessionCompleteViewModel$updateCardStatus$1(y7d.m24986e(tokenStatus), c2757eM9534S0, this.f32415b, null), 3);
        return xfa.f68157a;
    }
}
