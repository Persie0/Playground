package p507yc;

import android.content.Context;
import android.content.res.TypedArray;
import android.support.v4.media.C0141b;
import android.util.AttributeSet;
import android.util.TypedValue;
import androidx.appcompat.widget.C0300b1;
import com.linguist.R;
import p153hc.C6031a;

/* JADX INFO: renamed from: yc.k */
/* JADX INFO: loaded from: classes.dex */
public final class C10344k {

    /* JADX INFO: renamed from: a */
    public static final int[] f52047a = {R.attr.colorPrimary};

    /* JADX INFO: renamed from: b */
    public static final int[] f52048b = {R.attr.colorPrimaryVariant};

    /* JADX INFO: renamed from: a */
    public static void m19354a(Context context, AttributeSet attributeSet, int i10, int i11) {
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C6031a.f35649R, i10, i11);
        boolean z10 = typedArrayObtainStyledAttributes.getBoolean(1, false);
        typedArrayObtainStyledAttributes.recycle();
        if (z10) {
            TypedValue typedValue = new TypedValue();
            if (!context.getTheme().resolveAttribute(R.attr.isMaterialTheme, typedValue, true) || (typedValue.type == 18 && typedValue.data == 0)) {
                m19356c(context, f52048b, "Theme.MaterialComponents");
            }
        }
        m19356c(context, f52047a, "Theme.AppCompat");
    }

    /* JADX INFO: renamed from: b */
    public static void m19355b(Context context, AttributeSet attributeSet, int[] iArr, int i10, int i11, int... iArr2) {
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C6031a.f35649R, i10, i11);
        boolean z10 = false;
        if (!typedArrayObtainStyledAttributes.getBoolean(2, false)) {
            typedArrayObtainStyledAttributes.recycle();
            return;
        }
        if (iArr2.length != 0) {
            TypedArray typedArrayObtainStyledAttributes2 = context.obtainStyledAttributes(attributeSet, iArr, i10, i11);
            int length = iArr2.length;
            int i12 = 0;
            while (true) {
                if (i12 >= length) {
                    typedArrayObtainStyledAttributes2.recycle();
                    z10 = true;
                    break;
                } else {
                    if (typedArrayObtainStyledAttributes2.getResourceId(iArr2[i12], -1) == -1) {
                        typedArrayObtainStyledAttributes2.recycle();
                        break;
                    }
                    i12++;
                }
            }
        } else if (typedArrayObtainStyledAttributes.getResourceId(0, -1) != -1) {
            z10 = true;
            break;
        }
        typedArrayObtainStyledAttributes.recycle();
        if (!z10) {
            throw new IllegalArgumentException("This component requires that you specify a valid TextAppearance attribute. Update your app theme to inherit from Theme.MaterialComponents (or a descendant).");
        }
    }

    /* JADX WARN: Code duplicated, block: B:11:0x0022 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:12:0x0023  */
    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    /* JADX INFO: renamed from: c */
    public static void m19356c(Context context, int[] iArr, String str) {
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(iArr);
        boolean z10 = false;
        for (int i10 = 0; i10 < iArr.length; i10++) {
            if (!typedArrayObtainStyledAttributes.hasValue(i10)) {
                typedArrayObtainStyledAttributes.recycle();
                if (z10) {
                    throw new IllegalArgumentException(C0141b.m611g("The style on this component requires your app theme to be ", str, " (or a descendant)."));
                }
            }
        }
        typedArrayObtainStyledAttributes.recycle();
        z10 = true;
        if (z10) {
            throw new IllegalArgumentException(C0141b.m611g("The style on this component requires your app theme to be ", str, " (or a descendant)."));
        }
    }

    /* JADX INFO: renamed from: d */
    public static TypedArray m19357d(Context context, AttributeSet attributeSet, int[] iArr, int i10, int i11, int... iArr2) {
        m19354a(context, attributeSet, i10, i11);
        m19355b(context, attributeSet, iArr, i10, i11, iArr2);
        return context.obtainStyledAttributes(attributeSet, iArr, i10, i11);
    }

    /* JADX INFO: renamed from: e */
    public static C0300b1 m19358e(Context context, AttributeSet attributeSet, int[] iArr, int i10, int i11, int... iArr2) {
        m19354a(context, attributeSet, i10, i11);
        m19355b(context, attributeSet, iArr, i10, i11, iArr2);
        return new C0300b1(context, context.obtainStyledAttributes(attributeSet, iArr, i10, i11));
    }
}
