package p000;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.util.TypedValue;
import com.google.android.apps.camera.bottombar.C0100R;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class mjb {

    /* JADX INFO: renamed from: a */
    private static final int[] f40720a = {C0100R.attr.colorPrimary};

    /* JADX INFO: renamed from: b */
    private static final int[] f40721b = {C0100R.attr.colorPrimaryVariant};

    /* JADX INFO: renamed from: a */
    public static TypedArray m16438a(Context context, AttributeSet attributeSet, int[] iArr, int i, int i2, int... iArr2) {
        m16439b(context, attributeSet, i, i2);
        m16440c(context, attributeSet, iArr, i, i2, iArr2);
        return context.obtainStyledAttributes(attributeSet, iArr, i, i2);
    }

    /* JADX INFO: renamed from: b */
    public static void m16439b(Context context, AttributeSet attributeSet, int i, int i2) {
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, miy.f40718b, i, i2);
        boolean z = typedArrayObtainStyledAttributes.getBoolean(1, false);
        typedArrayObtainStyledAttributes.recycle();
        if (z) {
            TypedValue typedValue = new TypedValue();
            if (!context.getTheme().resolveAttribute(C0100R.attr.isMaterialTheme, typedValue, true) || (typedValue.type == 18 && typedValue.data == 0)) {
                m16442e(context, f40721b, "Theme.MaterialComponents");
            }
        }
        m16442e(context, f40720a, "Theme.AppCompat");
    }

    /* JADX INFO: renamed from: c */
    public static void m16440c(Context context, AttributeSet attributeSet, int[] iArr, int i, int i2, int... iArr2) {
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, miy.f40718b, i, i2);
        boolean z = false;
        if (!typedArrayObtainStyledAttributes.getBoolean(2, false)) {
            typedArrayObtainStyledAttributes.recycle();
            return;
        }
        if (iArr2.length != 0) {
            TypedArray typedArrayObtainStyledAttributes2 = context.obtainStyledAttributes(attributeSet, iArr, i, i2);
            int i3 = 0;
            while (true) {
                if (i3 > 0) {
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
        } else if (typedArrayObtainStyledAttributes.getResourceId(0, -1) != -1) {
            z = true;
        }
        typedArrayObtainStyledAttributes.recycle();
        if (!z) {
            throw new IllegalArgumentException("This component requires that you specify a valid TextAppearance attribute. Update your app theme to inherit from Theme.MaterialComponents (or a descendant).");
        }
    }

    /* JADX INFO: renamed from: d */
    public static boolean m16441d(Context context) {
        return lij.m15396D(context, C0100R.attr.isMaterial3Theme, false);
    }

    /* JADX INFO: renamed from: e */
    private static void m16442e(Context context, int[] iArr, String str) {
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(iArr);
        for (int i = 0; i <= 0; i++) {
            if (!typedArrayObtainStyledAttributes.hasValue(i)) {
                typedArrayObtainStyledAttributes.recycle();
                throw new IllegalArgumentException("The style on this component requires your app theme to be " + str + " (or a descendant).");
            }
        }
        typedArrayObtainStyledAttributes.recycle();
    }
}
