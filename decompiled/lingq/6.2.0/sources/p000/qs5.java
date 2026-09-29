package p000;

import android.R;
import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import androidx.appcompat.R$attr;

/* JADX INFO: loaded from: classes.dex */
public abstract class qs5 {

    /* JADX INFO: renamed from: a */
    public static final int[] f58140a = {R.attr.theme, R$attr.theme};

    /* JADX INFO: renamed from: b */
    public static final int[] f58141b = {com.google.android.material.R$attr.materialThemeOverlay};

    /* JADX INFO: renamed from: a */
    public static Context m20140a(int i, int i2, Context context, AttributeSet attributeSet, int[] iArr) {
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, f58141b, i, i2);
        int[] iArr2 = {typedArrayObtainStyledAttributes.getResourceId(0, 0)};
        typedArrayObtainStyledAttributes.recycle();
        int i3 = iArr2[0];
        boolean z = (context instanceof wl1) && ((wl1) context).f66989a == i3;
        if (i3 == 0 || z) {
            return context;
        }
        wl1 wl1Var = new wl1(context, i3);
        int length = iArr.length;
        int[] iArr3 = new int[length];
        if (iArr.length > 0) {
            TypedArray typedArrayObtainStyledAttributes2 = context.obtainStyledAttributes(attributeSet, iArr, i, i2);
            for (int i4 = 0; i4 < iArr.length; i4++) {
                iArr3[i4] = typedArrayObtainStyledAttributes2.getResourceId(i4, 0);
            }
            typedArrayObtainStyledAttributes2.recycle();
        }
        for (int i5 = 0; i5 < length; i5++) {
            int i6 = iArr3[i5];
            if (i6 != 0) {
                wl1Var.getTheme().applyStyle(i6, true);
            }
        }
        TypedArray typedArrayObtainStyledAttributes3 = context.obtainStyledAttributes(attributeSet, f58140a);
        int resourceId = typedArrayObtainStyledAttributes3.getResourceId(0, 0);
        int resourceId2 = typedArrayObtainStyledAttributes3.getResourceId(1, 0);
        typedArrayObtainStyledAttributes3.recycle();
        if (resourceId == 0) {
            resourceId = resourceId2;
        }
        if (resourceId != 0) {
            wl1Var.getTheme().applyStyle(resourceId, true);
        }
        return wl1Var;
    }

    /* JADX INFO: renamed from: b */
    public static Context m20141b(Context context, AttributeSet attributeSet, int i, int i2) {
        return m20140a(i, i2, context, attributeSet, new int[0]);
    }
}
