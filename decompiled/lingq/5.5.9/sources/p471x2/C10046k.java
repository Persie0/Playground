package p471x2;

import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.view.MenuItem;

/* JADX INFO: renamed from: x2.k */
/* JADX INFO: loaded from: classes.dex */
public final class C10046k {
    /* JADX INFO: renamed from: a */
    public static int m18822a(MenuItem menuItem) {
        return menuItem.getAlphabeticModifiers();
    }

    /* JADX INFO: renamed from: b */
    public static CharSequence m18823b(MenuItem menuItem) {
        return menuItem.getContentDescription();
    }

    /* JADX INFO: renamed from: c */
    public static ColorStateList m18824c(MenuItem menuItem) {
        return menuItem.getIconTintList();
    }

    /* JADX INFO: renamed from: d */
    public static PorterDuff.Mode m18825d(MenuItem menuItem) {
        return menuItem.getIconTintMode();
    }

    /* JADX INFO: renamed from: e */
    public static int m18826e(MenuItem menuItem) {
        return menuItem.getNumericModifiers();
    }

    /* JADX INFO: renamed from: f */
    public static CharSequence m18827f(MenuItem menuItem) {
        return menuItem.getTooltipText();
    }

    /* JADX INFO: renamed from: g */
    public static MenuItem m18828g(MenuItem menuItem, char c10, int i10) {
        return menuItem.setAlphabeticShortcut(c10, i10);
    }

    /* JADX INFO: renamed from: h */
    public static MenuItem m18829h(MenuItem menuItem, CharSequence charSequence) {
        return menuItem.setContentDescription(charSequence);
    }

    /* JADX INFO: renamed from: i */
    public static MenuItem m18830i(MenuItem menuItem, ColorStateList colorStateList) {
        return menuItem.setIconTintList(colorStateList);
    }

    /* JADX INFO: renamed from: j */
    public static MenuItem m18831j(MenuItem menuItem, PorterDuff.Mode mode) {
        return menuItem.setIconTintMode(mode);
    }

    /* JADX INFO: renamed from: k */
    public static MenuItem m18832k(MenuItem menuItem, char c10, int i10) {
        return menuItem.setNumericShortcut(c10, i10);
    }

    /* JADX INFO: renamed from: l */
    public static MenuItem m18833l(MenuItem menuItem, char c10, char c11, int i10, int i11) {
        return menuItem.setShortcut(c10, c11, i10, i11);
    }

    /* JADX INFO: renamed from: m */
    public static MenuItem m18834m(MenuItem menuItem, CharSequence charSequence) {
        return menuItem.setTooltipText(charSequence);
    }
}
