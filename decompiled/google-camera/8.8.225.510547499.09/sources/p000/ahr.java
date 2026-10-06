package p000;

import android.graphics.drawable.Drawable;
import android.view.View;
import android.widget.TextView;
import java.util.Locale;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class ahr {
    /* JADX INFO: renamed from: a */
    static int m688a(View view) {
        return view.getLayoutDirection();
    }

    /* JADX INFO: renamed from: b */
    static int m689b(View view) {
        return view.getTextDirection();
    }

    /* JADX INFO: renamed from: c */
    static Locale m690c(TextView textView) {
        return textView.getTextLocale();
    }

    /* JADX INFO: renamed from: d */
    public static void m691d(TextView textView, Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        textView.setCompoundDrawablesRelative(drawable, drawable2, drawable3, drawable4);
    }

    /* JADX INFO: renamed from: e */
    static void m692e(TextView textView, int i, int i2, int i3, int i4) {
        textView.setCompoundDrawablesRelativeWithIntrinsicBounds(i, i2, i3, i4);
    }

    /* JADX INFO: renamed from: f */
    static void m693f(TextView textView, Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        textView.setCompoundDrawablesRelativeWithIntrinsicBounds(drawable, drawable2, drawable3, drawable4);
    }

    /* JADX INFO: renamed from: g */
    static void m694g(View view, int i) {
        view.setTextDirection(i);
    }

    /* JADX INFO: renamed from: h */
    public static Drawable[] m695h(TextView textView) {
        return textView.getCompoundDrawablesRelative();
    }
}
