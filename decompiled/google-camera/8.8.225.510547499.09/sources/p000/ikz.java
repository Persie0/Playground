package p000;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.view.animation.Interpolator;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class ikz {

    /* JADX INFO: renamed from: a */
    public int f31417a;

    /* JADX INFO: renamed from: b */
    private final Interpolator f31418b;

    /* JADX INFO: renamed from: c */
    private final AnimatorSet f31419c = new AnimatorSet();

    /* JADX INFO: renamed from: d */
    private AnimatorSet.Builder f31420d;

    private ikz(int i, Interpolator interpolator) {
        this.f31417a = i;
        this.f31418b = interpolator;
    }

    /* JADX INFO: renamed from: b */
    public static ikz m11416b(int i, Interpolator interpolator) {
        return new ikz(i, interpolator);
    }

    /* JADX INFO: renamed from: a */
    public final AnimatorSet m11417a() {
        return this.f31419c.clone();
    }

    /* JADX INFO: renamed from: c */
    public final void m11418c(Object obj, String str, float f, float f2) {
        ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(obj, str, f, f2);
        objectAnimatorOfFloat.setDuration(this.f31417a);
        objectAnimatorOfFloat.setInterpolator(this.f31418b);
        AnimatorSet.Builder builder = this.f31420d;
        if (builder == null) {
            this.f31420d = this.f31419c.play(objectAnimatorOfFloat);
        } else {
            builder.with(objectAnimatorOfFloat);
        }
    }

    /* JADX INFO: renamed from: d */
    public final void m11419d(Object obj, String str, int i, int i2) {
        ObjectAnimator objectAnimatorOfArgb = ObjectAnimator.ofArgb(obj, str, i, i2);
        objectAnimatorOfArgb.setDuration(this.f31417a);
        objectAnimatorOfArgb.setInterpolator(this.f31418b);
        AnimatorSet.Builder builder = this.f31420d;
        if (builder == null) {
            this.f31420d = this.f31419c.play(objectAnimatorOfArgb);
        } else {
            builder.with(objectAnimatorOfArgb);
        }
    }
}
