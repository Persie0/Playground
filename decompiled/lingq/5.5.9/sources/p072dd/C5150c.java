package p072dd;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.util.TypedValue;
import androidx.appcompat.widget.C0300b1;
import p104f.C5452a;
import p254m2.C7472a;

/* JADX INFO: renamed from: dd.c */
/* JADX INFO: loaded from: classes.dex */
public final class C5150c {
    /* JADX INFO: renamed from: a */
    public static ColorStateList m10925a(Context context, TypedArray typedArray, int i10) {
        int resourceId;
        ColorStateList colorStateListM14842b;
        return (!typedArray.hasValue(i10) || (resourceId = typedArray.getResourceId(i10, 0)) == 0 || (colorStateListM14842b = C7472a.m14842b(resourceId, context)) == null) ? typedArray.getColorStateList(i10) : colorStateListM14842b;
    }

    /* JADX INFO: renamed from: b */
    public static ColorStateList m10926b(Context context, C0300b1 c0300b1, int i10) {
        int iM1120i;
        ColorStateList colorStateListM14842b;
        return (!c0300b1.m1123l(i10) || (iM1120i = c0300b1.m1120i(i10, 0)) == 0 || (colorStateListM14842b = C7472a.m14842b(iM1120i, context)) == null) ? c0300b1.m1113b(i10) : colorStateListM14842b;
    }

    /* JADX INFO: renamed from: c */
    public static int m10927c(Context context, TypedArray typedArray, int i10, int i11) {
        TypedValue typedValue = new TypedValue();
        if (typedArray.getValue(i10, typedValue) && typedValue.type == 2) {
            TypedArray typedArrayObtainStyledAttributes = context.getTheme().obtainStyledAttributes(new int[]{typedValue.data});
            int dimensionPixelSize = typedArrayObtainStyledAttributes.getDimensionPixelSize(0, i11);
            typedArrayObtainStyledAttributes.recycle();
            return dimensionPixelSize;
        }
        return typedArray.getDimensionPixelSize(i10, i11);
    }

    /* JADX INFO: renamed from: d */
    public static Drawable m10928d(Context context, TypedArray typedArray, int i10) {
        int resourceId;
        Drawable drawableM11672a;
        return (!typedArray.hasValue(i10) || (resourceId = typedArray.getResourceId(i10, 0)) == 0 || (drawableM11672a = C5452a.m11672a(context, resourceId)) == null) ? typedArray.getDrawable(i10) : drawableM11672a;
    }

    /* JADX INFO: renamed from: e */
    public static boolean m10929e(Context context) {
        return context.getResources().getConfiguration().fontScale >= 1.3f;
    }
}
