package p093ed;

import android.R;
import android.content.res.ColorStateList;
import android.graphics.Color;
import android.os.Build;
import android.util.Log;
import android.util.StateSet;
import p312p2.C8169a;

/* JADX INFO: renamed from: ed.a */
/* JADX INFO: loaded from: classes.dex */
public final class C5397a {

    /* JADX INFO: renamed from: a */
    public static final int[] f33812a = {R.attr.state_pressed};

    /* JADX INFO: renamed from: b */
    public static final int[] f33813b = {R.attr.state_focused};

    /* JADX INFO: renamed from: c */
    public static final int[] f33814c = {R.attr.state_selected, R.attr.state_pressed};

    /* JADX INFO: renamed from: d */
    public static final int[] f33815d = {R.attr.state_selected};

    /* JADX INFO: renamed from: e */
    public static final int[] f33816e = {R.attr.state_enabled, R.attr.state_pressed};

    /* JADX INFO: renamed from: f */
    public static final String f33817f = C5397a.class.getSimpleName();

    /* JADX INFO: renamed from: a */
    public static ColorStateList m11559a(ColorStateList colorStateList) {
        int[] iArr = f33813b;
        return new ColorStateList(new int[][]{f33815d, iArr, StateSet.NOTHING}, new int[]{m11560b(colorStateList, f33814c), m11560b(colorStateList, iArr), m11560b(colorStateList, f33812a)});
    }

    /* JADX INFO: renamed from: b */
    public static int m11560b(ColorStateList colorStateList, int[] iArr) {
        int colorForState = colorStateList != null ? colorStateList.getColorForState(iArr, colorStateList.getDefaultColor()) : 0;
        return C8169a.m16216h(colorForState, Math.min(Color.alpha(colorForState) * 2, 255));
    }

    /* JADX INFO: renamed from: c */
    public static ColorStateList m11561c(ColorStateList colorStateList) {
        if (colorStateList == null) {
            return ColorStateList.valueOf(0);
        }
        if (Build.VERSION.SDK_INT <= 27 && Color.alpha(colorStateList.getDefaultColor()) == 0 && Color.alpha(colorStateList.getColorForState(f33816e, 0)) != 0) {
            Log.w(f33817f, "Use a non-transparent color for the default color as it will be used to finish ripple animations.");
        }
        return colorStateList;
    }

    /* JADX INFO: renamed from: d */
    public static boolean m11562d(int[] iArr) {
        boolean z10 = false;
        boolean z11 = false;
        boolean z12 = false;
        for (int i10 : iArr) {
            if (i10 == 16842910) {
                z11 = true;
            } else if (i10 == 16842908 || i10 == 16842919 || i10 == 16843623) {
                z12 = true;
            }
        }
        if (z11 && z12) {
            z10 = true;
        }
        return z10;
    }
}
