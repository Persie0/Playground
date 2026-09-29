package p406u4;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ObjectAnimator;
import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import java.util.WeakHashMap;
import p286o2.C7911k;
import p471x2.C10029b0;
import p471x2.C10049l0;

/* JADX INFO: renamed from: u4.m */
/* JADX INFO: loaded from: classes.dex */
public final class C9422m extends AbstractC9447y0 {

    /* JADX INFO: renamed from: u4.m$a */
    public static class a extends AnimatorListenerAdapter {

        /* JADX INFO: renamed from: a */
        public final View f48363a;

        /* JADX INFO: renamed from: b */
        public boolean f48364b = false;

        public a(View view) {
            this.f48363a = view;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public final void onAnimationEnd(Animator animator) {
            View view = this.f48363a;
            C9433r0.m17831b(view, 1.0f);
            if (this.f48364b) {
                view.setLayerType(0, null);
            }
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public final void onAnimationStart(Animator animator) {
            WeakHashMap<View, C10049l0> weakHashMap = C10029b0.f50993a;
            View view = this.f48363a;
            if (C10029b0.d.m18671h(view) && view.getLayerType() == 0) {
                this.f48364b = true;
                view.setLayerType(2, null);
            }
        }
    }

    public C9422m() {
    }

    public C9422m(int i10) {
        if ((i10 & (-4)) != 0) {
            throw new IllegalArgumentException("Only MODE_IN and MODE_OUT flags are allowed");
        }
        this.f48431Y = i10;
    }

    @SuppressLint({"RestrictedApi"})
    public C9422m(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C9407e0.f48264e);
        int iM15688f = C7911k.m15688f(typedArrayObtainStyledAttributes, (XmlResourceParser) attributeSet, "fadingMode", 0, this.f48431Y);
        if ((iM15688f & (-4)) != 0) {
            throw new IllegalArgumentException("Only MODE_IN and MODE_OUT flags are allowed");
        }
        this.f48431Y = iM15688f;
        typedArrayObtainStyledAttributes.recycle();
    }

    @Override // p406u4.AbstractC9447y0
    /* JADX INFO: renamed from: V */
    public final Animator mo16372V(ViewGroup viewGroup, View view, C9425n0 c9425n0, C9425n0 c9425n1) {
        Float f3;
        float f10 = 0.0f;
        float fFloatValue = (c9425n0 == null || (f3 = (Float) c9425n0.f48372a.get("android:fade:transitionAlpha")) == null) ? 0.0f : f3.floatValue();
        if (fFloatValue != 1.0f) {
            f10 = fFloatValue;
        }
        return m17825X(view, f10, 1.0f);
    }

    @Override // p406u4.AbstractC9447y0
    /* JADX INFO: renamed from: W */
    public final Animator mo16373W(ViewGroup viewGroup, View view, C9425n0 c9425n0) {
        Float f3;
        C9433r0.f48403a.getClass();
        return m17825X(view, (c9425n0 == null || (f3 = (Float) c9425n0.f48372a.get("android:fade:transitionAlpha")) == null) ? 1.0f : f3.floatValue(), 0.0f);
    }

    /* JADX INFO: renamed from: X */
    public final ObjectAnimator m17825X(View view, float f3, float f10) {
        if (f3 == f10) {
            return null;
        }
        C9433r0.m17831b(view, f3);
        ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(view, C9433r0.f48404b, f10);
        objectAnimatorOfFloat.addListener(new a(view));
        mo17791b(new C9420l(view));
        return objectAnimatorOfFloat;
    }

    @Override // p406u4.AbstractC9447y0, p406u4.AbstractC9409f0
    /* JADX INFO: renamed from: k */
    public final void mo17762k(C9425n0 c9425n0) {
        m17843S(c9425n0);
        c9425n0.f48372a.put("android:fade:transitionAlpha", Float.valueOf(C9433r0.f48403a.mo17833E(c9425n0.f48373b)));
    }
}
