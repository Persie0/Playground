package p329q2;

import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.ColorFilter;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.DrawableContainer;
import android.graphics.drawable.InsetDrawable;
import android.util.AttributeSet;
import java.io.IOException;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

/* JADX INFO: renamed from: q2.a */
/* JADX INFO: loaded from: classes.dex */
public final class C8488a {

    /* JADX INFO: renamed from: q2.a$a */
    public static class a {
        /* JADX INFO: renamed from: a */
        public static int m16558a(Drawable drawable) {
            return drawable.getAlpha();
        }

        /* JADX INFO: renamed from: b */
        public static Drawable m16559b(DrawableContainer.DrawableContainerState drawableContainerState, int i10) {
            return drawableContainerState.getChild(i10);
        }

        /* JADX INFO: renamed from: c */
        public static Drawable m16560c(InsetDrawable insetDrawable) {
            return insetDrawable.getDrawable();
        }

        /* JADX INFO: renamed from: d */
        public static boolean m16561d(Drawable drawable) {
            return drawable.isAutoMirrored();
        }

        /* JADX INFO: renamed from: e */
        public static void m16562e(Drawable drawable, boolean z10) {
            drawable.setAutoMirrored(z10);
        }
    }

    /* JADX INFO: renamed from: q2.a$b */
    public static class b {
        /* JADX INFO: renamed from: a */
        public static void m16563a(Drawable drawable, Resources.Theme theme) {
            drawable.applyTheme(theme);
        }

        /* JADX INFO: renamed from: b */
        public static boolean m16564b(Drawable drawable) {
            return drawable.canApplyTheme();
        }

        /* JADX INFO: renamed from: c */
        public static ColorFilter m16565c(Drawable drawable) {
            return drawable.getColorFilter();
        }

        /* JADX INFO: renamed from: d */
        public static void m16566d(Drawable drawable, Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet, Resources.Theme theme) throws XmlPullParserException, IOException {
            drawable.inflate(resources, xmlPullParser, attributeSet, theme);
        }

        /* JADX INFO: renamed from: e */
        public static void m16567e(Drawable drawable, float f3, float f10) {
            drawable.setHotspot(f3, f10);
        }

        /* JADX INFO: renamed from: f */
        public static void m16568f(Drawable drawable, int i10, int i11, int i12, int i13) {
            drawable.setHotspotBounds(i10, i11, i12, i13);
        }

        /* JADX INFO: renamed from: g */
        public static void m16569g(Drawable drawable, int i10) {
            drawable.setTint(i10);
        }

        /* JADX INFO: renamed from: h */
        public static void m16570h(Drawable drawable, ColorStateList colorStateList) {
            drawable.setTintList(colorStateList);
        }

        /* JADX INFO: renamed from: i */
        public static void m16571i(Drawable drawable, PorterDuff.Mode mode) {
            drawable.setTintMode(mode);
        }
    }

    /* JADX INFO: renamed from: q2.a$c */
    public static class c {
        /* JADX INFO: renamed from: a */
        public static int m16572a(Drawable drawable) {
            return drawable.getLayoutDirection();
        }

        /* JADX INFO: renamed from: b */
        public static boolean m16573b(Drawable drawable, int i10) {
            return drawable.setLayoutDirection(i10);
        }
    }

    /* JADX INFO: renamed from: a */
    public static void m16555a(Drawable drawable, int i10) {
        b.m16569g(drawable, i10);
    }

    /* JADX INFO: renamed from: b */
    public static void m16556b(Drawable drawable, ColorStateList colorStateList) {
        b.m16570h(drawable, colorStateList);
    }

    /* JADX INFO: renamed from: c */
    public static void m16557c(Drawable drawable, PorterDuff.Mode mode) {
        b.m16571i(drawable, mode);
    }
}
