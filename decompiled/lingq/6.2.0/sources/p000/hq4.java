package p000;

import android.os.Build;
import android.text.BoringLayout;
import android.text.Layout;
import android.text.SpannableString;
import android.text.Spanned;
import android.text.TextDirectionHeuristic;
import android.text.TextPaint;
import android.text.style.CharacterStyle;
import android.text.style.MetricAffectingSpan;

/* JADX INFO: loaded from: classes.dex */
public final class hq4 {

    /* JADX INFO: renamed from: a */
    public final CharSequence f42770a;

    /* JADX INFO: renamed from: b */
    public final TextPaint f42771b;

    /* JADX INFO: renamed from: c */
    public final int f42772c;

    /* JADX INFO: renamed from: d */
    public float f42773d = Float.NaN;

    /* JADX INFO: renamed from: e */
    public float f42774e = Float.NaN;

    /* JADX INFO: renamed from: f */
    public BoringLayout.Metrics f42775f;

    /* JADX INFO: renamed from: g */
    public boolean f42776g;

    /* JADX INFO: renamed from: h */
    public CharSequence f42777h;

    public hq4(CharSequence charSequence, TextPaint textPaint, int i) {
        this.f42770a = charSequence;
        this.f42771b = textPaint;
        this.f42772c = i;
    }

    /* JADX INFO: renamed from: a */
    public final BoringLayout.Metrics m13430a() {
        BoringLayout.Metrics metricsIsBoring;
        if (!this.f42776g) {
            TextDirectionHeuristic textDirectionHeuristicM22329b = tw9.m22329b(this.f42772c);
            int i = Build.VERSION.SDK_INT;
            CharSequence charSequence = this.f42770a;
            TextPaint textPaint = this.f42771b;
            if (i >= 33) {
                metricsIsBoring = BoringLayout.isBoring(charSequence, textPaint, textDirectionHeuristicM22329b, true, null);
            } else {
                metricsIsBoring = !textDirectionHeuristicM22329b.isRtl(charSequence, 0, charSequence.length()) ? BoringLayout.isBoring(charSequence, textPaint, null) : null;
            }
            this.f42775f = metricsIsBoring;
            this.f42776g = true;
        }
        return this.f42775f;
    }

    /* JADX INFO: renamed from: b */
    public final CharSequence m13431b() {
        CharSequence charSequence = this.f42777h;
        if (charSequence != null) {
            charSequence.getClass();
            return charSequence;
        }
        CharSequence charSequence2 = this.f42770a;
        if (charSequence2 instanceof Spanned) {
            Spanned spanned = (Spanned) charSequence2;
            if (xwc.m24733F(spanned, CharacterStyle.class)) {
                CharacterStyle[] characterStyleArr = (CharacterStyle[]) spanned.getSpans(0, charSequence2.length(), CharacterStyle.class);
                if (characterStyleArr != null && characterStyleArr.length != 0) {
                    SpannableString spannableString = null;
                    for (CharacterStyle characterStyle : characterStyleArr) {
                        if (!(characterStyle instanceof MetricAffectingSpan)) {
                            if (spannableString == null) {
                                spannableString = new SpannableString(charSequence2);
                            }
                            spannableString.removeSpan(characterStyle);
                        }
                    }
                    if (spannableString != null) {
                        charSequence2 = spannableString;
                    }
                }
            }
        }
        this.f42777h = charSequence2;
        return charSequence2;
    }

    /* JADX WARN: Code duplicated, block: B:22:0x0051  */
    /* JADX WARN: Code duplicated, block: B:25:0x005a  */
    /* JADX INFO: renamed from: c */
    public final float m13432c() {
        if (!Float.isNaN(this.f42773d)) {
            return this.f42773d;
        }
        BoringLayout.Metrics metricsM13430a = m13430a();
        float fCeil = metricsM13430a != null ? metricsM13430a.width : -1;
        TextPaint textPaint = this.f42771b;
        if (fCeil < 0.0f) {
            fCeil = (float) Math.ceil(Layout.getDesiredWidth(m13431b(), 0, m13431b().length(), textPaint));
        }
        if (fCeil != 0.0f) {
            CharSequence charSequence = this.f42770a;
            if (charSequence instanceof Spanned) {
                Spanned spanned = (Spanned) charSequence;
                if (xwc.m24733F(spanned, p75.class) || xwc.m24733F(spanned, o75.class)) {
                    fCeil += 0.5f;
                } else if (textPaint.getLetterSpacing() != 0.0f) {
                    fCeil += 0.5f;
                }
            } else if (textPaint.getLetterSpacing() != 0.0f) {
                fCeil += 0.5f;
            }
        }
        this.f42773d = fCeil;
        return fCeil;
    }
}
