package p000;

import android.R;
import android.graphics.Insets;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build;

/* JADX INFO: loaded from: classes.dex */
public abstract class wl2 {

    /* JADX INFO: renamed from: a */
    public static final int[] f66994a = {R.attr.state_checked};

    /* JADX INFO: renamed from: b */
    public static final int[] f66995b = new int[0];

    /* JADX INFO: renamed from: c */
    public static final Rect f66996c = new Rect();

    /* JADX INFO: renamed from: a */
    public static void m24046a(Drawable drawable) {
        String name = drawable.getClass().getName();
        if (Build.VERSION.SDK_INT >= 31 || !"android.graphics.drawable.ColorStateListDrawable".equals(name)) {
            return;
        }
        int[] state = drawable.getState();
        if (state == null || state.length == 0) {
            drawable.setState(f66994a);
        } else {
            drawable.setState(f66995b);
        }
        drawable.setState(state);
    }

    /* JADX INFO: renamed from: b */
    public static Rect m24047b(Drawable drawable) {
        Insets insetsM22192a = tl2.m22192a(drawable);
        return new Rect(insetsM22192a.left, insetsM22192a.top, insetsM22192a.right, insetsM22192a.bottom);
    }

    /* JADX INFO: renamed from: c */
    public static PorterDuff.Mode m24048c(int i, PorterDuff.Mode mode) {
        if (i == 3) {
            return PorterDuff.Mode.SRC_OVER;
        }
        if (i == 5) {
            return PorterDuff.Mode.SRC_IN;
        }
        if (i == 9) {
            return PorterDuff.Mode.SRC_ATOP;
        }
        switch (i) {
            case 14:
                return PorterDuff.Mode.MULTIPLY;
            case 15:
                return PorterDuff.Mode.SCREEN;
            case 16:
                return PorterDuff.Mode.ADD;
            default:
                return mode;
        }
    }
}
