package p000;

import android.icu.text.DecimalFormatSymbols;
import android.text.PrecomputedText;
import android.widget.TextView;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class aht {
    /* JADX INFO: renamed from: a */
    static PrecomputedText.Params m704a(TextView textView) {
        return textView.getTextMetricsParams();
    }

    /* JADX INFO: renamed from: b */
    public static void m705b(TextView textView, int i) {
        textView.setFirstBaselineToTopHeight(i);
    }

    /* JADX INFO: renamed from: c */
    static String[] m706c(DecimalFormatSymbols decimalFormatSymbols) {
        return decimalFormatSymbols.getDigitStrings();
    }
}
