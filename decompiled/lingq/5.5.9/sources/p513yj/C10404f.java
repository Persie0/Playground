package p513yj;

import android.animation.ObjectAnimator;
import com.google.android.material.card.MaterialCardView;
import p312p2.C8169a;
import va.C9689c;
import va.C9700n;

/* JADX INFO: renamed from: yj.f */
/* JADX INFO: loaded from: classes2.dex */
public final class C10404f {
    /* JADX INFO: renamed from: a */
    public static ObjectAnimator m19392a(MaterialCardView materialCardView, int i10) {
        ObjectAnimator objectAnimatorOfArgb = ObjectAnimator.ofArgb(materialCardView, "backgroundColor", C8169a.m16216h(i10, 50));
        objectAnimatorOfArgb.setDuration(600L);
        objectAnimatorOfArgb.addUpdateListener(new C9689c(2, materialCardView));
        return objectAnimatorOfArgb;
    }

    /* JADX INFO: renamed from: b */
    public static ObjectAnimator m19393b(MaterialCardView materialCardView, int i10) {
        ObjectAnimator objectAnimatorOfArgb = ObjectAnimator.ofArgb(materialCardView, "strokeColor", i10);
        objectAnimatorOfArgb.setDuration(600L);
        objectAnimatorOfArgb.addUpdateListener(new C9700n(3, materialCardView));
        return objectAnimatorOfArgb;
    }
}
