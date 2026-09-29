package va;

import android.animation.ValueAnimator;
import com.android.installreferrer.api.InstallReferrerClient;
import com.google.android.exoplayer2.p051ui.C2515b;
import com.google.android.material.card.MaterialCardView;
import dm.C5207g;
import p240ld.C7304d;

/* JADX INFO: renamed from: va.c */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C9689c implements ValueAnimator.AnimatorUpdateListener {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f49611a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ Object f49612b;

    public /* synthetic */ C9689c(int i10, Object obj) {
        this.f49611a = i10;
        this.f49612b = obj;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        int i10 = this.f49611a;
        Object obj = this.f49612b;
        switch (i10) {
            case InstallReferrerClient.InstallReferrerResponse.f10530OK /* 0 */:
                C2515b c2515b = (C2515b) obj;
                c2515b.getClass();
                c2515b.f13541d0 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                c2515b.invalidate(c2515b.f13534a);
                break;
            case 1:
                C7304d c7304d = (C7304d) obj;
                c7304d.getClass();
                c7304d.f40954d.setAlpha(((Float) valueAnimator.getAnimatedValue()).floatValue());
                break;
            default:
                MaterialCardView materialCardView = (MaterialCardView) obj;
                C5207g.m11111f(materialCardView, "$this_backgroundAnimation");
                C5207g.m11111f(valueAnimator, "it");
                materialCardView.invalidate();
                break;
        }
    }
}
