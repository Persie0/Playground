package p000;

import android.graphics.Insets;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;

/* JADX INFO: renamed from: kh */
/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class C0768kh {

    /* JADX INFO: renamed from: a */
    public static final Rect f36003a = new Rect();

    /* JADX INFO: renamed from: a */
    public static PorterDuff.Mode m14230a(int i, PorterDuff.Mode mode) {
        switch (i) {
            case 3:
                return PorterDuff.Mode.SRC_OVER;
            case 5:
                return PorterDuff.Mode.SRC_IN;
            case 9:
                return PorterDuff.Mode.SRC_ATOP;
            case 14:
                return PorterDuff.Mode.MULTIPLY;
            case 15:
                return PorterDuff.Mode.SCREEN;
            case 16:
                return PorterDuff.Mode.ADD;
            default:
                return mode;
        }
    }

    /* JADX INFO: renamed from: b */
    public static Rect m14231b(Drawable drawable) {
        Insets insetsM14179a = C0767kg.m14179a(drawable);
        return new Rect(insetsM14179a.left, insetsM14179a.top, insetsM14179a.right, insetsM14179a.bottom);
    }

    /* JADX INFO: renamed from: c */
    static void m14232c(Drawable drawable) {
        drawable.getClass().getName();
    }
}
