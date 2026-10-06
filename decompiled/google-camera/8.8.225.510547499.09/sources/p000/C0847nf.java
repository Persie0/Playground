package p000;

import android.R;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Color;
import android.util.Log;
import android.util.TypedValue;
import android.view.View;
import androidx.wear.ambient.AmbientDelegate;

/* JADX INFO: renamed from: nf */
/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class C0847nf {

    /* JADX INFO: renamed from: f */
    private static final ThreadLocal f42166f = new ThreadLocal();

    /* JADX INFO: renamed from: a */
    static final int[] f42161a = {-16842910};

    /* JADX INFO: renamed from: b */
    static final int[] f42162b = {R.attr.state_focused};

    /* JADX INFO: renamed from: c */
    static final int[] f42163c = {R.attr.state_pressed};

    /* JADX INFO: renamed from: d */
    static final int[] f42164d = {R.attr.state_checked};

    /* JADX INFO: renamed from: e */
    static final int[] f42165e = new int[0];

    /* JADX INFO: renamed from: g */
    private static final int[] f42167g = new int[1];

    /* JADX INFO: renamed from: a */
    public static int m17432a(Context context, int i) {
        ColorStateList colorStateListM17434c = m17434c(context, i);
        if (colorStateListM17434c != null && colorStateListM17434c.isStateful()) {
            return colorStateListM17434c.getColorForState(f42161a, colorStateListM17434c.getDefaultColor());
        }
        ThreadLocal threadLocal = f42166f;
        TypedValue typedValue = (TypedValue) threadLocal.get();
        if (typedValue == null) {
            typedValue = new TypedValue();
            threadLocal.set(typedValue);
        }
        context.getTheme().resolveAttribute(R.attr.disabledAlpha, typedValue, true);
        float f = typedValue.getFloat();
        int iM17433b = m17433b(context, i);
        return acp.m212d(iM17433b, Math.round(Color.alpha(iM17433b) * f));
    }

    /* JADX INFO: renamed from: b */
    public static int m17433b(Context context, int i) {
        int[] iArr = f42167g;
        iArr[0] = i;
        AmbientDelegate ambientDelegateM1567C = AmbientDelegate.m1567C(context, null, iArr);
        try {
            return ((TypedArray) ambientDelegateM1567C.f1686b).getColor(0, 0);
        } finally {
            ambientDelegateM1567C.m1622y();
        }
    }

    /* JADX INFO: renamed from: c */
    public static ColorStateList m17434c(Context context, int i) {
        int[] iArr = f42167g;
        iArr[0] = i;
        AmbientDelegate ambientDelegateM1567C = AmbientDelegate.m1567C(context, null, iArr);
        try {
            return ambientDelegateM1567C.m1617t(0);
        } finally {
            ambientDelegateM1567C.m1622y();
        }
    }

    /* JADX INFO: renamed from: d */
    public static void m17435d(View view, Context context) {
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(C0193fr.f23266j);
        try {
            if (!typedArrayObtainStyledAttributes.hasValue(117)) {
                Log.e("ThemeUtils", "View " + view.getClass() + " is an AppCompat widget that can only be used with a Theme.AppCompat theme (or descendant).");
            }
        } finally {
            typedArrayObtainStyledAttributes.recycle();
        }
    }
}
