package p000;

import android.animation.Animator;
import android.animation.ObjectAnimator;
import android.animation.PropertyValuesHolder;
import android.util.Property;
import android.view.View;
import com.google.android.apps.camera.optionsbar.view.OptionsMenuContainer;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class ggb {

    /* JADX INFO: renamed from: a */
    public final View f24638a;

    /* JADX INFO: renamed from: b */
    private final ilk f24639b;

    /* JADX INFO: renamed from: c */
    private final boolean f24640c;

    /* JADX INFO: renamed from: d */
    private final int f24641d;

    /* JADX INFO: renamed from: e */
    private final View f24642e;

    public ggb(OptionsMenuContainer optionsMenuContainer, boolean z, View view) {
        View viewM4235b = optionsMenuContainer.m4235b();
        viewM4235b.getClass();
        this.f24638a = viewM4235b;
        this.f24639b = optionsMenuContainer.f6824b;
        this.f24640c = z;
        this.f24642e = view;
        this.f24641d = true != z ? 4 : 0;
    }

    /* JADX INFO: renamed from: a */
    public final Animator m9202a() {
        int width;
        ilk ilkVar = ilk.PORTRAIT;
        switch (this.f24639b.ordinal()) {
            case 1:
                width = (ill.m11435f(this.f24642e)[0] - ill.m11435f(this.f24638a)[0]) + ((this.f24642e.getWidth() - this.f24638a.getWidth()) / 2);
                break;
            case 2:
                width = -((ill.m11435f(this.f24642e)[0] - ill.m11435f(this.f24638a)[0]) + ((this.f24642e.getWidth() - this.f24638a.getWidth()) / 2));
                break;
            default:
                width = (ill.m11435f(this.f24642e)[1] - ill.m11435f(this.f24638a)[1]) + ((this.f24642e.getHeight() - this.f24638a.getHeight()) / 2);
                break;
        }
        float f = true != this.f24640c ? 0.0f : 1.0f;
        float f2 = 1.0f - f;
        float f3 = width;
        ObjectAnimator objectAnimatorOfPropertyValuesHolder = ObjectAnimator.ofPropertyValuesHolder(this.f24638a, PropertyValuesHolder.ofFloat((Property<?, Float>) View.ALPHA, f2, f), PropertyValuesHolder.ofFloat((Property<?, Float>) View.SCALE_X, f2, f), PropertyValuesHolder.ofFloat((Property<?, Float>) View.SCALE_Y, f2, f), PropertyValuesHolder.ofFloat((Property<?, Float>) View.TRANSLATION_Y, (1.0f - f2) * f3, f3 * f2));
        objectAnimatorOfPropertyValuesHolder.setDuration(250L);
        objectAnimatorOfPropertyValuesHolder.setInterpolator(new akf());
        objectAnimatorOfPropertyValuesHolder.addListener(new iln(this.f24638a, this.f24641d));
        objectAnimatorOfPropertyValuesHolder.addListener(jvh.m13544B(new fvi(this, 11)));
        if (this.f24640c) {
            objectAnimatorOfPropertyValuesHolder.addListener(jvh.m13545C(new fvi(this, 12)));
        }
        return objectAnimatorOfPropertyValuesHolder;
    }
}
