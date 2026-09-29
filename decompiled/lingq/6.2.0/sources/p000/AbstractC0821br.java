package p000;

import android.widget.TextView;

/* JADX INFO: renamed from: br */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC0821br {
    /* JADX INFO: renamed from: a */
    public static int m4111a(TextView textView) {
        return textView.getAutoSizeStepGranularity();
    }

    /* JADX INFO: renamed from: b */
    public static void m4112b(TextView textView, int i, int i2, int i3, int i4) {
        textView.setAutoSizeTextTypeUniformWithConfiguration(i, i2, i3, i4);
    }

    /* JADX INFO: renamed from: c */
    public static void m4113c(TextView textView, int[] iArr, int i) {
        textView.setAutoSizeTextTypeUniformWithPresetSizes(iArr, i);
    }

    /* JADX INFO: renamed from: d */
    public static boolean m4114d(TextView textView, String str) {
        return textView.setFontVariationSettings(str);
    }
}
