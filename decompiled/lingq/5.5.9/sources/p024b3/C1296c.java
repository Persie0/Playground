package p024b3;

import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.widget.CompoundButton;

/* JADX INFO: renamed from: b3.c */
/* JADX INFO: loaded from: classes.dex */
public final class C1296c {
    /* JADX INFO: renamed from: a */
    public static ColorStateList m4804a(CompoundButton compoundButton) {
        return compoundButton.getButtonTintList();
    }

    /* JADX INFO: renamed from: b */
    public static PorterDuff.Mode m4805b(CompoundButton compoundButton) {
        return compoundButton.getButtonTintMode();
    }

    /* JADX INFO: renamed from: c */
    public static void m4806c(CompoundButton compoundButton, ColorStateList colorStateList) {
        compoundButton.setButtonTintList(colorStateList);
    }

    /* JADX INFO: renamed from: d */
    public static void m4807d(CompoundButton compoundButton, PorterDuff.Mode mode) {
        compoundButton.setButtonTintMode(mode);
    }
}
