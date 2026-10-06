package p000;

import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.widget.TextView;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class ahs {
    /* JADX INFO: renamed from: a */
    static int m696a(TextView textView) {
        return textView.getBreakStrategy();
    }

    /* JADX INFO: renamed from: b */
    static int m697b(TextView textView) {
        return textView.getHyphenationFrequency();
    }

    /* JADX INFO: renamed from: c */
    static ColorStateList m698c(TextView textView) {
        return textView.getCompoundDrawableTintList();
    }

    /* JADX INFO: renamed from: d */
    static PorterDuff.Mode m699d(TextView textView) {
        return textView.getCompoundDrawableTintMode();
    }

    /* JADX INFO: renamed from: e */
    static void m700e(TextView textView, int i) {
        textView.setBreakStrategy(i);
    }

    /* JADX INFO: renamed from: f */
    public static void m701f(TextView textView, ColorStateList colorStateList) {
        textView.setCompoundDrawableTintList(colorStateList);
    }

    /* JADX INFO: renamed from: g */
    public static void m702g(TextView textView, PorterDuff.Mode mode) {
        textView.setCompoundDrawableTintMode(mode);
    }

    /* JADX INFO: renamed from: h */
    static void m703h(TextView textView, int i) {
        textView.setHyphenationFrequency(i);
    }
}
