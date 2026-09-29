package p000;

import android.R;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Color;
import android.util.AttributeSet;
import android.util.Log;
import android.util.TypedValue;
import android.view.View;
import androidx.appcompat.R$styleable;

/* JADX INFO: loaded from: classes.dex */
public abstract class oz9 {

    /* JADX INFO: renamed from: a */
    public static final ThreadLocal f55332a = new ThreadLocal();

    /* JADX INFO: renamed from: b */
    public static final int[] f55333b = {-16842910};

    /* JADX INFO: renamed from: c */
    public static final int[] f55334c = {R.attr.state_focused};

    /* JADX INFO: renamed from: d */
    public static final int[] f55335d = {R.attr.state_pressed};

    /* JADX INFO: renamed from: e */
    public static final int[] f55336e = {R.attr.state_checked};

    /* JADX INFO: renamed from: f */
    public static final int[] f55337f = new int[0];

    /* JADX INFO: renamed from: g */
    public static final int[] f55338g = new int[1];

    /* JADX INFO: renamed from: a */
    public static void m18842a(View view, Context context) {
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(R$styleable.AppCompatTheme);
        try {
            if (!typedArrayObtainStyledAttributes.hasValue(R$styleable.AppCompatTheme_windowActionBar)) {
                Log.e("ThemeUtils", "View " + view.getClass() + " is an AppCompat widget that can only be used with a Theme.AppCompat theme (or descendant).");
            }
        } finally {
            typedArrayObtainStyledAttributes.recycle();
        }
    }

    /* JADX INFO: renamed from: b */
    public static int m18843b(Context context, int i) {
        ColorStateList colorStateListM18845d = m18845d(context, i);
        if (colorStateListM18845d != null && colorStateListM18845d.isStateful()) {
            return colorStateListM18845d.getColorForState(f55333b, colorStateListM18845d.getDefaultColor());
        }
        ThreadLocal threadLocal = f55332a;
        TypedValue typedValue = (TypedValue) threadLocal.get();
        if (typedValue == null) {
            typedValue = new TypedValue();
            threadLocal.set(typedValue);
        }
        context.getTheme().resolveAttribute(R.attr.disabledAlpha, typedValue, true);
        float f = typedValue.getFloat();
        int iM18844c = m18844c(context, i);
        return ya1.m25016i(iM18844c, Math.round(Color.alpha(iM18844c) * f));
    }

    /* JADX INFO: renamed from: c */
    public static int m18844c(Context context, int i) {
        int[] iArr = f55338g;
        iArr[0] = i;
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes((AttributeSet) null, iArr);
        try {
            return typedArrayObtainStyledAttributes.getColor(0, 0);
        } finally {
            typedArrayObtainStyledAttributes.recycle();
        }
    }

    /* JADX INFO: renamed from: d */
    public static ColorStateList m18845d(Context context, int i) {
        ColorStateList colorStateList;
        int resourceId;
        int[] iArr = f55338g;
        iArr[0] = i;
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes((AttributeSet) null, iArr);
        try {
            if (!typedArrayObtainStyledAttributes.hasValue(0) || (resourceId = typedArrayObtainStyledAttributes.getResourceId(0, 0)) == 0 || (colorStateList = do7.m10540p(context, resourceId)) == null) {
                colorStateList = typedArrayObtainStyledAttributes.getColorStateList(0);
            }
            return colorStateList;
        } finally {
            typedArrayObtainStyledAttributes.recycle();
        }
    }
}
