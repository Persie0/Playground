package p000;

import android.animation.Animator;
import android.animation.ObjectAnimator;
import android.animation.PropertyValuesHolder;
import android.util.Property;
import android.view.View;
import android.view.ViewGroup;

/* JADX INFO: loaded from: classes.dex */
public final class mm8 implements iwa {

    /* JADX INFO: renamed from: b */
    public final boolean f51533b;

    /* JADX INFO: renamed from: a */
    public float f51532a = 0.8f;

    /* JADX INFO: renamed from: c */
    public boolean f51534c = true;

    public mm8(boolean z) {
        this.f51533b = z;
    }

    /* JADX INFO: renamed from: c */
    public static ObjectAnimator m16923c(View view, float f, float f2) {
        float scaleX = view.getScaleX();
        float scaleY = view.getScaleY();
        ObjectAnimator objectAnimatorOfPropertyValuesHolder = ObjectAnimator.ofPropertyValuesHolder(view, PropertyValuesHolder.ofFloat((Property<?, Float>) View.SCALE_X, scaleX * f, scaleX * f2), PropertyValuesHolder.ofFloat((Property<?, Float>) View.SCALE_Y, f * scaleY, f2 * scaleY));
        objectAnimatorOfPropertyValuesHolder.addListener(new lm8(view, scaleX, scaleY));
        return objectAnimatorOfPropertyValuesHolder;
    }

    @Override // p000.iwa
    /* JADX INFO: renamed from: a */
    public final Animator mo11002a(View view, ViewGroup viewGroup) {
        if (this.f51534c) {
            return this.f51533b ? m16923c(view, 1.0f, 1.1f) : m16923c(view, 1.0f, this.f51532a);
        }
        return null;
    }

    @Override // p000.iwa
    /* JADX INFO: renamed from: b */
    public final Animator mo11003b(View view, ViewGroup viewGroup) {
        return this.f51533b ? m16923c(view, this.f51532a, 1.0f) : m16923c(view, 1.1f, 1.0f);
    }
}
