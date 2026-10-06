package p000;

import android.widget.TextView;

/* JADX INFO: renamed from: jn */
/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public class C0747jn {
    /* JADX INFO: renamed from: a */
    static int m13381a(TextView textView) {
        return textView.getAutoSizeStepGranularity();
    }

    /* JADX INFO: renamed from: b */
    static void m13382b(TextView textView, int i, int i2, int i3, int i4) {
        textView.setAutoSizeTextTypeUniformWithConfiguration(i, i2, i3, i4);
    }

    /* JADX INFO: renamed from: c */
    static void m13383c(TextView textView, int[] iArr, int i) {
        textView.setAutoSizeTextTypeUniformWithPresetSizes(iArr, i);
    }

    /* JADX INFO: renamed from: d */
    static boolean m13384d(TextView textView, String str) {
        return textView.setFontVariationSettings(str);
    }
}
