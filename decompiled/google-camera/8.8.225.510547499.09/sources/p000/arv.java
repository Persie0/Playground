package p000;

import android.animation.Animator;
import android.animation.ObjectAnimator;
import android.util.Property;
import android.view.View;
import java.util.Map;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class arv extends asy {
    public arv() {
    }

    /* JADX INFO: renamed from: I */
    private static float m1903I(asq asqVar, float f) {
        Float f2;
        return (asqVar == null || (f2 = (Float) asqVar.f2260a.get("android:fade:transitionAlpha")) == null) ? f : f2.floatValue();
    }

    /* JADX INFO: renamed from: J */
    private final Animator m1904J(View view, float f, float f2) {
        if (f == f2) {
            return null;
        }
        int i = asu.f2264b;
        view.setTransitionAlpha(f);
        ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(view, (Property<View, Float>) asu.f2263a, f2);
        objectAnimatorOfFloat.addListener(new aru(view));
        m1953w(new art(view));
        return objectAnimatorOfFloat;
    }

    @Override // p000.asy, p000.asf
    /* JADX INFO: renamed from: c */
    public final void mo1901c(asq asqVar) {
        asy.m1976H(asqVar);
        Map map = asqVar.f2260a;
        View view = asqVar.f2261b;
        int i = asu.f2264b;
        map.put("android:fade:transitionAlpha", Float.valueOf(view.getTransitionAlpha()));
    }

    @Override // p000.asy
    /* JADX INFO: renamed from: e */
    public final Animator mo1905e(View view, asq asqVar) {
        float fM1903I = m1903I(asqVar, 0.0f);
        return m1904J(view, fM1903I != 1.0f ? fM1903I : 0.0f, 1.0f);
    }

    @Override // p000.asy
    /* JADX INFO: renamed from: f */
    public final Animator mo1906f(View view, asq asqVar) {
        int i = asu.f2264b;
        return m1904J(view, m1903I(asqVar, 1.0f), 0.0f);
    }

    public arv(int i) {
        this.f2282n = i;
    }
}
