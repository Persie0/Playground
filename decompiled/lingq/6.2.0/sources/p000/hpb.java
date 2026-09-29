package p000;

import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.view.MenuItem;
import androidx.compose.runtime.internal.C0282a;

/* JADX INFO: loaded from: classes2.dex */
public abstract class hpb {

    /* JADX INFO: renamed from: a */
    public static final C0282a f42752a = new C0282a(-1836273417, false, new nd1(0));

    /* JADX INFO: renamed from: b */
    public static final C0282a f42753b = new C0282a(752503191, false, new nd1(1));

    /* JADX INFO: renamed from: c */
    public static final C0282a f42754c = new C0282a(1296356685, false, new ld1(18));

    /* JADX INFO: renamed from: d */
    public static final C0282a f42755d = new C0282a(-285477244, false, new ld1(19));

    /* JADX INFO: renamed from: e */
    public static final C0282a f42756e = new C0282a(1991773674, false, new ld1(20));

    /* JADX INFO: renamed from: f */
    public static final C0282a f42757f = new C0282a(-108803157, false, new ld1(21));

    /* JADX INFO: renamed from: g */
    public static final C0282a f42758g = new C0282a(-450320905, false, new ld1(22));

    /* JADX INFO: renamed from: h */
    public static final C0282a f42759h = new C0282a(339015243, false, new ld1(23));

    /* JADX INFO: renamed from: i */
    public static final C0282a f42760i = new C0282a(795253871, false, new ld1(24));

    /* JADX INFO: renamed from: a */
    public static void m13422a(MenuItem menuItem, char c, int i) {
        menuItem.setAlphabeticShortcut(c, i);
    }

    /* JADX INFO: renamed from: b */
    public static void m13423b(MenuItem menuItem, CharSequence charSequence) {
        menuItem.setContentDescription(charSequence);
    }

    /* JADX INFO: renamed from: c */
    public static void m13424c(MenuItem menuItem, ColorStateList colorStateList) {
        menuItem.setIconTintList(colorStateList);
    }

    /* JADX INFO: renamed from: d */
    public static void m13425d(MenuItem menuItem, PorterDuff.Mode mode) {
        menuItem.setIconTintMode(mode);
    }

    /* JADX INFO: renamed from: e */
    public static void m13426e(MenuItem menuItem, char c, int i) {
        menuItem.setNumericShortcut(c, i);
    }

    /* JADX INFO: renamed from: f */
    public static void m13427f(MenuItem menuItem, CharSequence charSequence) {
        menuItem.setTooltipText(charSequence);
    }
}
