package p000;

import android.app.Activity;
import android.content.res.Resources;
import android.graphics.Insets;
import android.graphics.Path;
import android.graphics.RectF;
import android.util.TypedValue;
import android.view.DisplayCutout;
import android.view.View;
import android.view.WindowInsets;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class ill {

    /* JADX INFO: renamed from: a */
    private static final nbh f31450a = nbh.m17259h("com/google/android/apps/camera/uiutils/UiUtils");

    /* JADX INFO: renamed from: a */
    public static float m11430a(float f) {
        return f * 0.0624f;
    }

    /* JADX INFO: renamed from: b */
    public static int m11431b(float f) {
        return Math.round(TypedValue.applyDimension(1, f, Resources.getSystem().getDisplayMetrics()));
    }

    /* JADX INFO: renamed from: c */
    public static int m11432c(Activity activity, WindowInsets windowInsets) {
        if (activity.isInMultiWindowMode() && kay.m13890c(activity.getWindowManager().getDefaultDisplay()) != kay.CLOCKWISE_0) {
            return 0;
        }
        Insets insets = windowInsets.getInsets(WindowInsets.Type.navigationBars());
        return Math.max(insets.bottom, Math.max(insets.left, insets.right));
    }

    /* JADX INFO: renamed from: d */
    public static boolean m11433d(View view) {
        if (view.getRootWindowInsets() != null) {
            return view.getRootWindowInsets().getDisplayCutout() != null;
        }
        ((nbe) ((nbe) f31450a.m17251b()).mo17276G((char) 4304)).mo17290o("WindowInsets is null. Not able to check cutouts status!");
        return false;
    }

    /* JADX INFO: renamed from: e */
    public static int[] m11434e(View view) {
        int[] iArr = {0, 0};
        DisplayCutout cutout = view.getDisplay().getCutout();
        if (cutout != null) {
            Path cutoutPath = cutout.getCutoutPath();
            RectF rectF = new RectF();
            if (cutoutPath != null) {
                cutoutPath.computeBounds(rectF, true);
                if (view.getDisplay().getRotation() == 3) {
                    iArr[0] = (int) (cutout.getBoundingRectRight().right - rectF.centerX());
                    iArr[1] = (int) rectF.centerY();
                } else if (view.getDisplay().getRotation() == 1) {
                    float width = view.getWidth();
                    iArr[0] = (int) rectF.centerX();
                    float f = width / 2.0f;
                    iArr[1] = (((float) ((int) rectF.top)) >= f || rectF.bottom <= f) ? (int) (cutout.getBoundingRectLeft().bottom - rectF.centerY()) : (int) rectF.centerY();
                } else {
                    iArr[0] = (int) rectF.centerX();
                    iArr[1] = (int) rectF.centerY();
                }
            }
        }
        return iArr;
    }

    /* JADX INFO: renamed from: f */
    public static int[] m11435f(View view) {
        int[] iArr = new int[2];
        view.getLocationOnScreen(iArr);
        return iArr;
    }
}
