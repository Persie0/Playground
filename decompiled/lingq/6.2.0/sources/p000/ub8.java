package p000;

import android.view.View;
import com.lingq.core.domain.model.lesson.LessonCard;
import com.lingq.core.domain.model.lesson.TokenType;
import com.lingq.core.token.TokenPopupData;
import com.lingq.feature.review.C2758f;
import com.lingq.feature.review.activities.ReviewActivityResultFragment;

/* JADX INFO: loaded from: classes3.dex */
public final class ub8 implements View.OnClickListener {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f63670a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ ReviewActivityResultFragment f63671b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ LessonCard f63672c;

    public /* synthetic */ ub8(ReviewActivityResultFragment reviewActivityResultFragment, LessonCard lessonCard, int i) {
        this.f63670a = i;
        this.f63671b = reviewActivityResultFragment;
        this.f63672c = lessonCard;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        int i = this.f63670a;
        LessonCard lessonCard = this.f63672c;
        ReviewActivityResultFragment reviewActivityResultFragment = this.f63671b;
        switch (i) {
            case 0:
                bh4[] bh4VarArr = ReviewActivityResultFragment.f32067H0;
                sca.m21224J0(reviewActivityResultFragment.m9548U0(), lessonCard.f19178a, false, 12);
                break;
            default:
                bh4[] bh4VarArr2 = ReviewActivityResultFragment.f32067H0;
                C2758f c2758fM9546S0 = reviewActivityResultFragment.m9546S0();
                String str = lessonCard.f19178a;
                c2758fM9546S0.f32507c.mo8738E1(new TokenPopupData(str, vz1.m23609O(str, reviewActivityResultFragment.m9548U0().f32369b.mo4589b2()), TokenType.CardType, 0, 0, null, null, null, null, 0, null, false, 0, 0, null, 0, 0, 0, 0, false, null, null, false, 8388600, null));
                break;
        }
    }
}
