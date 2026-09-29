package p000;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.util.TypedValue;
import androidx.appcompat.R$attr;
import com.google.android.material.R$styleable;

/* JADX INFO: loaded from: classes.dex */
public abstract class dy9 {

    /* JADX INFO: renamed from: a */
    public static final int[] f36426a = {R$attr.colorPrimary};

    /* JADX INFO: renamed from: b */
    public static final int[] f36427b = {com.google.android.material.R$attr.colorPrimaryVariant};

    /* JADX INFO: renamed from: a */
    public static void m10748a(Context context, AttributeSet attributeSet, int i, int i2) {
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R$styleable.ThemeEnforcement, i, i2);
        boolean z = typedArrayObtainStyledAttributes.getBoolean(R$styleable.ThemeEnforcement_enforceMaterialTheme, false);
        typedArrayObtainStyledAttributes.recycle();
        if (z) {
            TypedValue typedValue = new TypedValue();
            if (!context.getTheme().resolveAttribute(com.google.android.material.R$attr.isMaterialTheme, typedValue, true) || (typedValue.type == 18 && typedValue.data == 0)) {
                m10750c(context, f36427b, "Theme.MaterialComponents");
            }
        }
        m10750c(context, f36426a, "Theme.AppCompat");
    }

    /* JADX INFO: renamed from: b */
    public static void m10749b(Context context, AttributeSet attributeSet, int[] iArr, int i, int i2, int... iArr2) {
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R$styleable.ThemeEnforcement, i, i2);
        boolean z = false;
        if (!typedArrayObtainStyledAttributes.getBoolean(R$styleable.ThemeEnforcement_enforceTextAppearance, false)) {
            typedArrayObtainStyledAttributes.recycle();
            return;
        }
        if (iArr2.length != 0) {
            TypedArray typedArrayObtainStyledAttributes2 = context.obtainStyledAttributes(attributeSet, iArr, i, i2);
            int length = iArr2.length;
            int i3 = 0;
            while (true) {
                if (i3 >= length) {
                    typedArrayObtainStyledAttributes2.recycle();
                    z = true;
                    break;
                } else {
                    if (typedArrayObtainStyledAttributes2.getResourceId(iArr2[i3], -1) == -1) {
                        typedArrayObtainStyledAttributes2.recycle();
                        break;
                    }
                    i3++;
                }
            }
        } else if (typedArrayObtainStyledAttributes.getResourceId(R$styleable.ThemeEnforcement_android_textAppearance, -1) != -1) {
            z = true;
            break;
        }
        typedArrayObtainStyledAttributes.recycle();
        if (z) {
            return;
        }
        C3386nv.m17626m("This component requires that you specify a valid TextAppearance attribute. Update your app theme to inherit from Theme.MaterialComponents (or a descendant).");
    }

    /* JADX INFO: renamed from: c */
    public static void m10750c(Context context, int[] iArr, String str) {
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(iArr);
        for (int i = 0; i < iArr.length; i++) {
            if (!typedArrayObtainStyledAttributes.hasValue(i)) {
                typedArrayObtainStyledAttributes.recycle();
                C3386nv.m17626m(wq1.m24118n("The style on this component requires your app theme to be ", str, " (or a descendant)."));
                return;
            }
        }
        typedArrayObtainStyledAttributes.recycle();
    }

    /* JADX INFO: renamed from: d */
    public static TypedArray m10751d(Context context, AttributeSet attributeSet, int[] iArr, int i, int i2, int... iArr2) {
        m10748a(context, attributeSet, i, i2);
        m10749b(context, attributeSet, iArr, i, i2, iArr2);
        return context.obtainStyledAttributes(attributeSet, iArr, i, i2);
    }

    /* JADX INFO: renamed from: e */
    public static sq5 m10752e(Context context, AttributeSet attributeSet, int[] iArr, int i, int i2, int... iArr2) {
        m10748a(context, attributeSet, i, i2);
        m10749b(context, attributeSet, iArr, i, i2, iArr2);
        return new sq5(17, context, context.obtainStyledAttributes(attributeSet, iArr, i, i2));
    }
}
