package p000;

import android.animation.ObjectAnimator;
import android.content.Context;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.InsetDrawable;
import android.view.View;
import android.view.animation.LinearInterpolator;
import com.google.android.apps.camera.bottombar.C0100R;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class idn {

    /* JADX INFO: renamed from: a */
    public final View f30474a;

    /* JADX INFO: renamed from: b */
    private final Context f30475b;

    /* JADX INFO: renamed from: c */
    private final int f30476c;

    /* JADX INFO: renamed from: d */
    private final int f30477d;

    /* JADX INFO: renamed from: e */
    private final Rect f30478e = new Rect();

    public idn(Context context, View view) {
        this.f30475b = context;
        this.f30474a = view;
        this.f30476c = context.getResources().getInteger(C0100R.integer.hide_notification_dot_animation_delay);
        this.f30477d = context.getResources().getInteger(C0100R.integer.hide_notification_dot_animation_duration);
    }

    /* JADX INFO: renamed from: a */
    public final void m11120a(boolean z) {
        Drawable foreground = this.f30474a.getForeground();
        if (!z || foreground == null) {
            this.f30474a.setForeground(null);
            return;
        }
        ObjectAnimator objectAnimatorOfInt = ObjectAnimator.ofInt(foreground, "alpha", 255, 0);
        objectAnimatorOfInt.setInterpolator(new LinearInterpolator());
        objectAnimatorOfInt.addUpdateListener(new ibw(this, 4));
        objectAnimatorOfInt.setDuration(this.f30477d);
        objectAnimatorOfInt.setStartDelay(this.f30476c);
        objectAnimatorOfInt.addListener(new idm(this));
        objectAnimatorOfInt.start();
    }

    /* JADX INFO: renamed from: b */
    public final void m11121b() {
        Rect rect = new Rect(this.f30474a.getLeft(), this.f30474a.getTop(), this.f30474a.getRight(), this.f30474a.getBottom());
        Drawable drawable = this.f30475b.getDrawable(C0100R.drawable.notification_dot);
        int intrinsicWidth = this.f30474a.getResources().getConfiguration().getLayoutDirection() == 1 ? 0 : drawable.getIntrinsicWidth() / 2;
        this.f30474a.setForeground(new InsetDrawable(drawable, ((rect.width() - drawable.getIntrinsicWidth()) - this.f30478e.right) + intrinsicWidth, this.f30478e.top, this.f30478e.right - intrinsicWidth, (rect.height() - drawable.getIntrinsicHeight()) - this.f30478e.top));
    }

    /* JADX INFO: renamed from: c */
    public final void m11122c(int i, int i2, int i3) {
        this.f30478e.set(i, i2, i3, 0);
    }
}
