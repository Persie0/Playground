package p406u4;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import java.util.HashMap;

/* JADX INFO: renamed from: u4.g */
/* JADX INFO: loaded from: classes.dex */
public final class C9410g extends AbstractC9409f0 {

    /* JADX INFO: renamed from: Y */
    public static final String[] f48308Y = {"android:changeScroll:x", "android:changeScroll:y"};

    public C9410g(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    /* JADX INFO: renamed from: S */
    public final void m17811S(C9425n0 c9425n0) {
        HashMap map = c9425n0.f48372a;
        View view = c9425n0.f48373b;
        map.put("android:changeScroll:x", Integer.valueOf(view.getScrollX()));
        map.put("android:changeScroll:y", Integer.valueOf(view.getScrollY()));
    }

    @Override // p406u4.AbstractC9409f0
    /* JADX INFO: renamed from: h */
    public final void mo17761h(C9425n0 c9425n0) {
        m17811S(c9425n0);
    }

    @Override // p406u4.AbstractC9409f0
    /* JADX INFO: renamed from: k */
    public final void mo17762k(C9425n0 c9425n0) {
        m17811S(c9425n0);
    }

    @Override // p406u4.AbstractC9409f0
    /* JADX INFO: renamed from: p */
    public final Animator mo17763p(ViewGroup viewGroup, C9425n0 c9425n0, C9425n0 c9425n1) {
        ObjectAnimator objectAnimatorOfInt;
        ObjectAnimator objectAnimatorOfInt2 = null;
        if (c9425n0 == null || c9425n1 == null) {
            return null;
        }
        HashMap map = c9425n0.f48372a;
        int iIntValue = ((Integer) map.get("android:changeScroll:x")).intValue();
        HashMap map2 = c9425n1.f48372a;
        int iIntValue2 = ((Integer) map2.get("android:changeScroll:x")).intValue();
        int iIntValue3 = ((Integer) map.get("android:changeScroll:y")).intValue();
        int iIntValue4 = ((Integer) map2.get("android:changeScroll:y")).intValue();
        View view = c9425n1.f48373b;
        if (iIntValue != iIntValue2) {
            view.setScrollX(iIntValue);
            objectAnimatorOfInt = ObjectAnimator.ofInt(view, "scrollX", iIntValue, iIntValue2);
        } else {
            objectAnimatorOfInt = null;
        }
        if (iIntValue3 != iIntValue4) {
            view.setScrollY(iIntValue3);
            objectAnimatorOfInt2 = ObjectAnimator.ofInt(view, "scrollY", iIntValue3, iIntValue4);
        }
        boolean z10 = C9423m0.f48365a;
        if (objectAnimatorOfInt == null) {
            return objectAnimatorOfInt2;
        }
        if (objectAnimatorOfInt2 == null) {
            return objectAnimatorOfInt;
        }
        AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.playTogether(objectAnimatorOfInt, objectAnimatorOfInt2);
        return animatorSet;
    }

    @Override // p406u4.AbstractC9409f0
    /* JADX INFO: renamed from: y */
    public final String[] mo17764y() {
        return f48308Y;
    }
}
