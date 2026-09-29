package p507yc;

import android.animation.Animator;
import android.animation.ValueAnimator;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import java.util.HashMap;
import p406u4.AbstractC9409f0;
import p406u4.C9425n0;

/* JADX INFO: renamed from: yc.i */
/* JADX INFO: loaded from: classes.dex */
public final class C10342i extends AbstractC9409f0 {

    /* JADX INFO: renamed from: yc.i$a */
    public class a implements ValueAnimator.AnimatorUpdateListener {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ TextView f52046a;

        public a(TextView textView) {
            this.f52046a = textView;
        }

        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
        public final void onAnimationUpdate(ValueAnimator valueAnimator) {
            float fFloatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
            TextView textView = this.f52046a;
            textView.setScaleX(fFloatValue);
            textView.setScaleY(fFloatValue);
        }
    }

    @Override // p406u4.AbstractC9409f0
    /* JADX INFO: renamed from: h */
    public final void mo17761h(C9425n0 c9425n0) {
        View view = c9425n0.f48373b;
        if (view instanceof TextView) {
            c9425n0.f48372a.put("android:textscale:scale", Float.valueOf(((TextView) view).getScaleX()));
        }
    }

    @Override // p406u4.AbstractC9409f0
    /* JADX INFO: renamed from: k */
    public final void mo17762k(C9425n0 c9425n0) {
        View view = c9425n0.f48373b;
        if (view instanceof TextView) {
            c9425n0.f48372a.put("android:textscale:scale", Float.valueOf(((TextView) view).getScaleX()));
        }
    }

    @Override // p406u4.AbstractC9409f0
    /* JADX INFO: renamed from: p */
    public final Animator mo17763p(ViewGroup viewGroup, C9425n0 c9425n0, C9425n0 c9425n1) {
        ValueAnimator valueAnimatorOfFloat = null;
        if (c9425n0 != null && c9425n1 != null && (c9425n0.f48373b instanceof TextView)) {
            View view = c9425n1.f48373b;
            if (view instanceof TextView) {
                TextView textView = (TextView) view;
                HashMap map = c9425n0.f48372a;
                HashMap map2 = c9425n1.f48372a;
                float fFloatValue = 1.0f;
                float fFloatValue2 = map.get("android:textscale:scale") != null ? ((Float) map.get("android:textscale:scale")).floatValue() : 1.0f;
                if (map2.get("android:textscale:scale") != null) {
                    fFloatValue = ((Float) map2.get("android:textscale:scale")).floatValue();
                }
                if (fFloatValue2 == fFloatValue) {
                    return null;
                }
                valueAnimatorOfFloat = ValueAnimator.ofFloat(fFloatValue2, fFloatValue);
                valueAnimatorOfFloat.addUpdateListener(new a(textView));
            }
        }
        return valueAnimatorOfFloat;
    }
}
