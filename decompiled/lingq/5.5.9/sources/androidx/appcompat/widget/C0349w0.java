package androidx.appcompat.widget;

import android.R;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Color;
import android.util.AttributeSet;
import android.util.Log;
import android.util.TypedValue;
import android.view.View;
import p058d.C4999a;
import p254m2.C7472a;
import p312p2.C8169a;

/* JADX INFO: renamed from: androidx.appcompat.widget.w0 */
/* JADX INFO: loaded from: classes.dex */
public final class C0349w0 {

    /* JADX INFO: renamed from: a */
    public static final ThreadLocal<TypedValue> f1366a = new ThreadLocal<>();

    /* JADX INFO: renamed from: b */
    public static final int[] f1367b = {-16842910};

    /* JADX INFO: renamed from: c */
    public static final int[] f1368c = {R.attr.state_focused};

    /* JADX INFO: renamed from: d */
    public static final int[] f1369d = {R.attr.state_pressed};

    /* JADX INFO: renamed from: e */
    public static final int[] f1370e = {R.attr.state_checked};

    /* JADX INFO: renamed from: f */
    public static final int[] f1371f = new int[0];

    /* JADX INFO: renamed from: g */
    public static final int[] f1372g = new int[1];

    /* JADX INFO: renamed from: a */
    public static void m1279a(Context context, View view) {
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(C4999a.f32596j);
        try {
            if (!typedArrayObtainStyledAttributes.hasValue(117)) {
                Log.e("ThemeUtils", "View " + view.getClass() + " is an AppCompat widget that can only be used with a Theme.AppCompat theme (or descendant).");
            }
            typedArrayObtainStyledAttributes.recycle();
        } catch (Throwable th2) {
            typedArrayObtainStyledAttributes.recycle();
            throw th2;
        }
    }

    /* JADX INFO: renamed from: b */
    public static int m1280b(int i10, Context context) {
        ColorStateList colorStateListM1282d = m1282d(i10, context);
        if (colorStateListM1282d != null && colorStateListM1282d.isStateful()) {
            return colorStateListM1282d.getColorForState(f1367b, colorStateListM1282d.getDefaultColor());
        }
        ThreadLocal<TypedValue> threadLocal = f1366a;
        TypedValue typedValue = threadLocal.get();
        if (typedValue == null) {
            typedValue = new TypedValue();
            threadLocal.set(typedValue);
        }
        context.getTheme().resolveAttribute(R.attr.disabledAlpha, typedValue, true);
        float f3 = typedValue.getFloat();
        int iM1281c = m1281c(i10, context);
        return C8169a.m16216h(iM1281c, Math.round(Color.alpha(iM1281c) * f3));
    }

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    /* JADX INFO: renamed from: c */
    public static int m1281c(int i10, Context context) {
        int[] iArr = f1372g;
        iArr[0] = i10;
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes((AttributeSet) null, iArr);
        try {
            int color = typedArrayObtainStyledAttributes.getColor(0, 0);
            typedArrayObtainStyledAttributes.recycle();
            return color;
        } catch (Throwable th2) {
            typedArrayObtainStyledAttributes.recycle();
            throw th2;
        }
    }

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    /* JADX INFO: renamed from: d */
    public static ColorStateList m1282d(int i10, Context context) {
        ColorStateList colorStateList;
        int resourceId;
        int[] iArr = f1372g;
        iArr[0] = i10;
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes((AttributeSet) null, iArr);
        try {
            if (!typedArrayObtainStyledAttributes.hasValue(0) || (resourceId = typedArrayObtainStyledAttributes.getResourceId(0, 0)) == 0 || (colorStateList = C7472a.m14842b(resourceId, context)) == null) {
                colorStateList = typedArrayObtainStyledAttributes.getColorStateList(0);
            }
            return colorStateList;
        } finally {
            typedArrayObtainStyledAttributes.recycle();
        }
    }
}
