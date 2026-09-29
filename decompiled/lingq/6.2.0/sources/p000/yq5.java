package p000;

import android.animation.ValueAnimator;
import com.google.android.material.card.MaterialCardView;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class yq5 implements ValueAnimator.AnimatorUpdateListener {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f70291a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ MaterialCardView f70292b;

    public /* synthetic */ yq5(MaterialCardView materialCardView, int i) {
        this.f70291a = i;
        this.f70292b = materialCardView;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        int i = this.f70291a;
        MaterialCardView materialCardView = this.f70292b;
        switch (i) {
            case 0:
                valueAnimator.getClass();
                materialCardView.invalidate();
                break;
            default:
                valueAnimator.getClass();
                materialCardView.invalidate();
                break;
        }
    }
}
