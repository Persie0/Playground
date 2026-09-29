package p426v2;

import android.os.Build;
import android.support.v4.media.session.C0166e;
import android.text.PrecomputedText;
import android.text.Spannable;
import android.text.TextDirectionHeuristic;
import android.text.TextPaint;
import android.text.TextUtils;
import android.text.style.MetricAffectingSpan;
import androidx.activity.result.C0204c;
import androidx.compose.p017ui.platform.C0653p1;
import p003a2.C0009a;
import p007a6.C0024c;
import p446w2.C9804b;

/* JADX INFO: renamed from: v2.d */
/* JADX INFO: loaded from: classes.dex */
public final class C9630d implements Spannable {

    /* JADX INFO: renamed from: v2.d$a */
    public static final class a {

        /* JADX INFO: renamed from: a */
        public final TextPaint f49317a;

        /* JADX INFO: renamed from: b */
        public final TextDirectionHeuristic f49318b;

        /* JADX INFO: renamed from: c */
        public final int f49319c;

        /* JADX INFO: renamed from: d */
        public final int f49320d;

        public a(PrecomputedText.Params params) {
            this.f49317a = params.getTextPaint();
            this.f49318b = params.getTextDirection();
            this.f49319c = params.getBreakStrategy();
            this.f49320d = params.getHyphenationFrequency();
        }

        public a(TextPaint textPaint, TextDirectionHeuristic textDirectionHeuristic, int i10, int i11) {
            if (Build.VERSION.SDK_INT >= 29) {
                C0024c.m73B();
                C0653p1.m2435i(textPaint).setBreakStrategy(i10).setHyphenationFrequency(i11).setTextDirection(textDirectionHeuristic).build();
            }
            this.f49317a = textPaint;
            this.f49318b = textDirectionHeuristic;
            this.f49319c = i10;
            this.f49320d = i11;
        }

        /* JADX INFO: renamed from: a */
        public final boolean m18105a(a aVar) {
            if (this.f49319c == aVar.f49319c && this.f49320d == aVar.f49320d) {
                TextPaint textPaint = this.f49317a;
                if (textPaint.getTextSize() != aVar.f49317a.getTextSize()) {
                    return false;
                }
                float textScaleX = textPaint.getTextScaleX();
                TextPaint textPaint2 = aVar.f49317a;
                if (textScaleX != textPaint2.getTextScaleX() || textPaint.getTextSkewX() != textPaint2.getTextSkewX() || textPaint.getLetterSpacing() != textPaint2.getLetterSpacing() || !TextUtils.equals(textPaint.getFontFeatureSettings(), textPaint2.getFontFeatureSettings()) || textPaint.getFlags() != textPaint2.getFlags() || !textPaint.getTextLocales().equals(textPaint2.getTextLocales())) {
                    return false;
                }
                if (textPaint.getTypeface() == null) {
                    if (textPaint2.getTypeface() != null) {
                        return false;
                    }
                } else if (!textPaint.getTypeface().equals(textPaint2.getTypeface())) {
                    return false;
                }
                return true;
            }
            return false;
        }

        public final boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return m18105a(aVar) && this.f49318b == aVar.f49318b;
        }

        public final int hashCode() {
            TextPaint textPaint = this.f49317a;
            return C9804b.m18287b(Float.valueOf(textPaint.getTextSize()), Float.valueOf(textPaint.getTextScaleX()), Float.valueOf(textPaint.getTextSkewX()), Float.valueOf(textPaint.getLetterSpacing()), Integer.valueOf(textPaint.getFlags()), textPaint.getTextLocales(), textPaint.getTypeface(), Boolean.valueOf(textPaint.isElegantTextHeight()), this.f49318b, Integer.valueOf(this.f49319c), Integer.valueOf(this.f49320d));
        }

        public final String toString() {
            StringBuilder sb2 = new StringBuilder("{");
            StringBuilder sb3 = new StringBuilder("textSize=");
            TextPaint textPaint = this.f49317a;
            sb3.append(textPaint.getTextSize());
            sb2.append(sb3.toString());
            sb2.append(", textScaleX=" + textPaint.getTextScaleX());
            sb2.append(", textSkewX=" + textPaint.getTextSkewX());
            sb2.append(", letterSpacing=" + textPaint.getLetterSpacing());
            sb2.append(", elegantTextHeight=" + textPaint.isElegantTextHeight());
            sb2.append(", textLocale=" + textPaint.getTextLocales());
            sb2.append(", typeface=" + textPaint.getTypeface());
            sb2.append(", variationSettings=" + textPaint.getFontVariationSettings());
            sb2.append(", textDir=" + this.f49318b);
            sb2.append(", breakStrategy=" + this.f49319c);
            sb2.append(", hyphenationFrequency=" + this.f49320d);
            sb2.append("}");
            return sb2.toString();
        }
    }

    @Override // java.lang.CharSequence
    public final char charAt(int i10) {
        throw null;
    }

    @Override // android.text.Spanned
    public final int getSpanEnd(Object obj) {
        throw null;
    }

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    @Override // android.text.Spanned
    public final int getSpanFlags(Object obj) {
        throw null;
    }

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    @Override // android.text.Spanned
    public final int getSpanStart(Object obj) {
        throw null;
    }

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    @Override // android.text.Spanned
    public final <T> T[] getSpans(int i10, int i11, Class<T> cls) {
        if (Build.VERSION.SDK_INT < 29) {
            throw null;
        }
        C0166e.m774u(i10, i11, cls);
        throw null;
    }

    @Override // java.lang.CharSequence
    public final int length() {
        throw null;
    }

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    @Override // android.text.Spanned
    public final int nextSpanTransition(int i10, int i11, Class cls) {
        throw null;
    }

    @Override // android.text.Spannable
    public final void removeSpan(Object obj) {
        if (obj instanceof MetricAffectingSpan) {
            throw new IllegalArgumentException("MetricAffectingSpan can not be removed from PrecomputedText.");
        }
        if (Build.VERSION.SDK_INT < 29) {
            throw null;
        }
        C0204c.m862v(obj);
        throw null;
    }

    /* JADX WARN: Unreachable blocks removed: 2, instructions: 2 */
    @Override // android.text.Spannable
    public final void setSpan(Object obj, int i10, int i11, int i12) {
        if (obj instanceof MetricAffectingSpan) {
            throw new IllegalArgumentException("MetricAffectingSpan can not be set to PrecomputedText.");
        }
        if (Build.VERSION.SDK_INT < 29) {
            throw null;
        }
        C0009a.m31t(obj, i10, i11, i12);
        throw null;
    }

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    @Override // java.lang.CharSequence
    public final CharSequence subSequence(int i10, int i11) {
        throw null;
    }

    @Override // java.lang.CharSequence
    public final String toString() {
        throw null;
    }
}
