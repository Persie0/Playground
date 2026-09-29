package p240ld;

import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.widget.ImageView;
import com.google.android.material.internal.CheckableImageButton;
import com.google.android.material.textfield.TextInputLayout;
import java.util.Arrays;
import java.util.WeakHashMap;
import p329q2.C8488a;
import p471x2.C10029b0;
import p471x2.C10049l0;

/* JADX INFO: renamed from: ld.n */
/* JADX INFO: loaded from: classes.dex */
public final class C7314n {
    /* JADX INFO: renamed from: a */
    public static void m14717a(TextInputLayout textInputLayout, CheckableImageButton checkableImageButton, ColorStateList colorStateList, PorterDuff.Mode mode) {
        Drawable drawable = checkableImageButton.getDrawable();
        if (drawable != null) {
            drawable = drawable.mutate();
            if (colorStateList == null || !colorStateList.isStateful()) {
                C8488a.b.m16570h(drawable, colorStateList);
            } else {
                int[] drawableState = textInputLayout.getDrawableState();
                int[] drawableState2 = checkableImageButton.getDrawableState();
                int length = drawableState.length;
                int[] iArrCopyOf = Arrays.copyOf(drawableState, drawableState.length + drawableState2.length);
                System.arraycopy(drawableState2, 0, iArrCopyOf, length, drawableState2.length);
                C8488a.b.m16570h(drawable, ColorStateList.valueOf(colorStateList.getColorForState(iArrCopyOf, colorStateList.getDefaultColor())));
            }
            if (mode != null) {
                C8488a.b.m16571i(drawable, mode);
            }
        }
        if (checkableImageButton.getDrawable() != drawable) {
            checkableImageButton.setImageDrawable(drawable);
        }
    }

    /* JADX INFO: renamed from: b */
    public static ImageView.ScaleType m14718b(int i10) {
        if (i10 == 0) {
            return ImageView.ScaleType.FIT_XY;
        }
        if (i10 == 1) {
            return ImageView.ScaleType.FIT_START;
        }
        if (i10 == 2) {
            return ImageView.ScaleType.FIT_CENTER;
        }
        if (i10 == 3) {
            return ImageView.ScaleType.FIT_END;
        }
        if (i10 != 5) {
            return i10 != 6 ? ImageView.ScaleType.CENTER : ImageView.ScaleType.CENTER_INSIDE;
        }
        return ImageView.ScaleType.CENTER_CROP;
    }

    /* JADX INFO: renamed from: c */
    public static void m14719c(TextInputLayout textInputLayout, CheckableImageButton checkableImageButton, ColorStateList colorStateList) {
        Drawable drawable = checkableImageButton.getDrawable();
        if (checkableImageButton.getDrawable() != null && colorStateList != null && colorStateList.isStateful()) {
            int[] drawableState = textInputLayout.getDrawableState();
            int[] drawableState2 = checkableImageButton.getDrawableState();
            int length = drawableState.length;
            int[] iArrCopyOf = Arrays.copyOf(drawableState, drawableState.length + drawableState2.length);
            System.arraycopy(drawableState2, 0, iArrCopyOf, length, drawableState2.length);
            int colorForState = colorStateList.getColorForState(iArrCopyOf, colorStateList.getDefaultColor());
            Drawable drawableMutate = drawable.mutate();
            C8488a.b.m16570h(drawableMutate, ColorStateList.valueOf(colorForState));
            checkableImageButton.setImageDrawable(drawableMutate);
        }
    }

    /* JADX INFO: renamed from: d */
    public static void m14720d(CheckableImageButton checkableImageButton, View.OnLongClickListener onLongClickListener) {
        WeakHashMap<View, C10049l0> weakHashMap = C10029b0.f50993a;
        boolean zM18663a = C10029b0.c.m18663a(checkableImageButton);
        boolean z10 = false;
        boolean z11 = onLongClickListener != null;
        if (zM18663a || z11) {
            z10 = true;
        }
        checkableImageButton.setFocusable(z10);
        checkableImageButton.setClickable(zM18663a);
        checkableImageButton.setPressable(zM18663a);
        checkableImageButton.setLongClickable(z11);
        C10029b0.d.m18682s(checkableImageButton, z10 ? 1 : 2);
    }
}
