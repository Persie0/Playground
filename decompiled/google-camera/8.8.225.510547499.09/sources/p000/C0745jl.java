package p000;

import android.graphics.drawable.Drawable;
import android.widget.TextView;
import java.util.Locale;

/* JADX INFO: renamed from: jl */
/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class C0745jl {
    /* JADX INFO: renamed from: a */
    static void m13329a(TextView textView, Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        textView.setCompoundDrawablesRelativeWithIntrinsicBounds(drawable, drawable2, drawable3, drawable4);
    }

    /* JADX INFO: renamed from: b */
    static void m13330b(TextView textView, Locale locale) {
        textView.setTextLocale(locale);
    }

    /* JADX INFO: renamed from: c */
    static Drawable[] m13331c(TextView textView) {
        return textView.getCompoundDrawablesRelative();
    }
}
