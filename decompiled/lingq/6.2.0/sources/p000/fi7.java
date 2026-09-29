package p000;

import android.text.PrecomputedText;
import android.text.TextDirectionHeuristic;
import android.text.TextPaint;
import android.text.TextUtils;
import java.util.Objects;

/* JADX INFO: loaded from: classes2.dex */
public final class fi7 {

    /* JADX INFO: renamed from: a */
    public final TextPaint f39148a;

    /* JADX INFO: renamed from: b */
    public final TextDirectionHeuristic f39149b;

    /* JADX INFO: renamed from: c */
    public final int f39150c;

    /* JADX INFO: renamed from: d */
    public final int f39151d;

    public fi7(PrecomputedText.Params params) {
        this.f39148a = params.getTextPaint();
        this.f39149b = params.getTextDirection();
        this.f39150c = params.getBreakStrategy();
        this.f39151d = params.getHyphenationFrequency();
    }

    /* JADX INFO: renamed from: a */
    public final int m11856a() {
        return this.f39150c;
    }

    /* JADX INFO: renamed from: b */
    public final int m11857b() {
        return this.f39151d;
    }

    /* JADX INFO: renamed from: c */
    public final TextDirectionHeuristic m11858c() {
        return this.f39149b;
    }

    /* JADX INFO: renamed from: d */
    public final TextPaint m11859d() {
        return this.f39148a;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof fi7)) {
            return false;
        }
        fi7 fi7Var = (fi7) obj;
        int i = fi7Var.f39150c;
        TextPaint textPaint = fi7Var.f39148a;
        if (this.f39150c == i && this.f39151d == fi7Var.f39151d) {
            TextPaint textPaint2 = this.f39148a;
            return textPaint2.getTextSize() == textPaint.getTextSize() && textPaint2.getTextScaleX() == textPaint.getTextScaleX() && textPaint2.getTextSkewX() == textPaint.getTextSkewX() && textPaint2.getLetterSpacing() == textPaint.getLetterSpacing() && TextUtils.equals(textPaint2.getFontFeatureSettings(), textPaint.getFontFeatureSettings()) && textPaint2.getFlags() == textPaint.getFlags() && textPaint2.getTextLocales().equals(textPaint.getTextLocales()) && (textPaint2.getTypeface() != null ? textPaint2.getTypeface().equals(textPaint.getTypeface()) : textPaint.getTypeface() == null) && this.f39149b == fi7Var.f39149b;
        }
        return false;
    }

    public final int hashCode() {
        TextPaint textPaint = this.f39148a;
        return Objects.hash(Float.valueOf(textPaint.getTextSize()), Float.valueOf(textPaint.getTextScaleX()), Float.valueOf(textPaint.getTextSkewX()), Float.valueOf(textPaint.getLetterSpacing()), Integer.valueOf(textPaint.getFlags()), textPaint.getTextLocales(), textPaint.getTypeface(), Boolean.valueOf(textPaint.isElegantTextHeight()), this.f39149b, Integer.valueOf(this.f39150c), Integer.valueOf(this.f39151d));
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("{");
        StringBuilder sb2 = new StringBuilder("textSize=");
        TextPaint textPaint = this.f39148a;
        sb2.append(textPaint.getTextSize());
        sb.append(sb2.toString());
        sb.append(", textScaleX=" + textPaint.getTextScaleX());
        sb.append(", textSkewX=" + textPaint.getTextSkewX());
        sb.append(", letterSpacing=" + textPaint.getLetterSpacing());
        sb.append(", elegantTextHeight=" + textPaint.isElegantTextHeight());
        sb.append(", textLocale=" + textPaint.getTextLocales());
        sb.append(", typeface=" + textPaint.getTypeface());
        sb.append(", variationSettings=" + textPaint.getFontVariationSettings());
        sb.append(", textDir=" + this.f39149b);
        sb.append(", breakStrategy=" + this.f39150c);
        sb.append(", hyphenationFrequency=" + this.f39151d);
        sb.append("}");
        return sb.toString();
    }
}
