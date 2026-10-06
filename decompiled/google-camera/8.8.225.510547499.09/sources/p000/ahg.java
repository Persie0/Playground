package p000;

import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.widget.CompoundButton;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class ahg {
    /* JADX INFO: renamed from: a */
    public static ColorStateList m665a(CompoundButton compoundButton) {
        return compoundButton.getButtonTintList();
    }

    /* JADX INFO: renamed from: b */
    public static PorterDuff.Mode m666b(CompoundButton compoundButton) {
        return compoundButton.getButtonTintMode();
    }

    /* JADX INFO: renamed from: c */
    public static void m667c(CompoundButton compoundButton, ColorStateList colorStateList) {
        compoundButton.setButtonTintList(colorStateList);
    }

    /* JADX INFO: renamed from: d */
    public static void m668d(CompoundButton compoundButton, PorterDuff.Mode mode) {
        compoundButton.setButtonTintMode(mode);
    }
}
