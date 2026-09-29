package p000;

import android.view.View;
import com.lingq.core.domain.model.lesson.LessonCard;
import com.lingq.core.domain.model.lesson.TokenType;
import com.lingq.core.domain.model.token.TokenControllerType;
import com.lingq.core.token.TokenPopupData;
import com.lingq.feature.review.C2754d;
import com.lingq.feature.review.C2758f;
import com.lingq.feature.review.ReviewSessionCompleteFragment;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class ue8 implements h90 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ ReviewSessionCompleteFragment f63812a;

    public /* synthetic */ ue8(ReviewSessionCompleteFragment reviewSessionCompleteFragment) {
        this.f63812a = reviewSessionCompleteFragment;
    }

    @Override // p000.h90
    /* JADX INFO: renamed from: a */
    public void mo10699a(Object obj) {
        LessonCard lessonCard = (LessonCard) obj;
        bh4[] bh4VarArr = ReviewSessionCompleteFragment.f31753G0;
        lessonCard.getClass();
        ReviewSessionCompleteFragment reviewSessionCompleteFragment = this.f63812a;
        C2758f c2758fM9533R0 = reviewSessionCompleteFragment.m9533R0();
        String str = lessonCard.f19178a;
        c2758fM9533R0.f32507c.mo8738E1(new TokenPopupData(str, vz1.m23609O(str, reviewSessionCompleteFragment.m9534S0().f32472b.mo4589b2()), TokenType.CardType, 0, 0, null, null, null, null, 0, null, false, 0, 0, null, 0, 0, 0, 0, false, null, null, false, 8388600, null));
    }

    /* JADX INFO: renamed from: b */
    public void m22715b(LessonCard lessonCard, View view) {
        bh4[] bh4VarArr = ReviewSessionCompleteFragment.f31753G0;
        ReviewSessionCompleteFragment reviewSessionCompleteFragment = this.f63812a;
        new p33((vs3) reviewSessionCompleteFragment.m9534S0().f32480j.getValue(), view, TokenControllerType.Review, new C2754d(reviewSessionCompleteFragment, lessonCard));
    }
}
