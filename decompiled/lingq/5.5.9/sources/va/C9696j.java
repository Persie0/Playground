package va;

import android.animation.ValueAnimator;
import com.android.installreferrer.api.InstallReferrerClient;
import com.google.android.material.internal.CheckableImageButton;
import p240ld.C7304d;

/* JADX INFO: renamed from: va.j */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C9696j implements ValueAnimator.AnimatorUpdateListener {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f49628a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ Object f49629b;

    public /* synthetic */ C9696j(int i10, Object obj) {
        this.f49628a = i10;
        this.f49629b = obj;
    }

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        int i10 = this.f49628a;
        Object obj = this.f49629b;
        switch (i10) {
            case InstallReferrerClient.InstallReferrerResponse.f10530OK /* 0 */:
                C9701o c9701o = (C9701o) obj;
                c9701o.getClass();
                c9701o.m18206b(((Float) valueAnimator.getAnimatedValue()).floatValue());
                break;
            default:
                C7304d c7304d = (C7304d) obj;
                c7304d.getClass();
                float fFloatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                CheckableImageButton checkableImageButton = c7304d.f40954d;
                checkableImageButton.setScaleX(fFloatValue);
                checkableImageButton.setScaleY(fFloatValue);
                break;
        }
    }
}
