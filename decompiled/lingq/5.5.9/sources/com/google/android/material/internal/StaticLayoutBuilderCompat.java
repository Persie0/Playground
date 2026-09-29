package com.google.android.material.internal;

import android.text.Layout;
import android.text.StaticLayout;
import android.text.TextDirectionHeuristics;
import android.text.TextPaint;
import android.text.TextUtils;

/* JADX INFO: loaded from: classes.dex */
public final class StaticLayoutBuilderCompat {

    /* JADX INFO: renamed from: a */
    public CharSequence f15345a;

    /* JADX INFO: renamed from: b */
    public final TextPaint f15346b;

    /* JADX INFO: renamed from: c */
    public final int f15347c;

    /* JADX INFO: renamed from: d */
    public int f15348d;

    /* JADX INFO: renamed from: k */
    public boolean f15355k;

    /* JADX INFO: renamed from: e */
    public Layout.Alignment f15349e = Layout.Alignment.ALIGN_NORMAL;

    /* JADX INFO: renamed from: f */
    public int f15350f = Integer.MAX_VALUE;

    /* JADX INFO: renamed from: g */
    public float f15351g = 0.0f;

    /* JADX INFO: renamed from: h */
    public float f15352h = 1.0f;

    /* JADX INFO: renamed from: i */
    public int f15353i = 1;

    /* JADX INFO: renamed from: j */
    public boolean f15354j = true;

    /* JADX INFO: renamed from: l */
    public TextUtils.TruncateAt f15356l = null;

    public static class StaticLayoutBuilderCompatException extends Exception {
    }

    public StaticLayoutBuilderCompat(CharSequence charSequence, TextPaint textPaint, int i10) {
        this.f15345a = charSequence;
        this.f15346b = textPaint;
        this.f15347c = i10;
        this.f15348d = charSequence.length();
    }

    /* JADX INFO: renamed from: a */
    public final StaticLayout m8794a() throws StaticLayoutBuilderCompatException {
        if (this.f15345a == null) {
            this.f15345a = "";
        }
        int iMax = Math.max(0, this.f15347c);
        CharSequence charSequenceEllipsize = this.f15345a;
        int i10 = this.f15350f;
        TextPaint textPaint = this.f15346b;
        if (i10 == 1) {
            charSequenceEllipsize = TextUtils.ellipsize(charSequenceEllipsize, textPaint, iMax, this.f15356l);
        }
        int iMin = Math.min(charSequenceEllipsize.length(), this.f15348d);
        this.f15348d = iMin;
        if (this.f15355k && this.f15350f == 1) {
            this.f15349e = Layout.Alignment.ALIGN_OPPOSITE;
        }
        StaticLayout.Builder builderObtain = StaticLayout.Builder.obtain(charSequenceEllipsize, 0, iMin, textPaint, iMax);
        builderObtain.setAlignment(this.f15349e);
        builderObtain.setIncludePad(this.f15354j);
        builderObtain.setTextDirection(this.f15355k ? TextDirectionHeuristics.RTL : TextDirectionHeuristics.LTR);
        TextUtils.TruncateAt truncateAt = this.f15356l;
        if (truncateAt != null) {
            builderObtain.setEllipsize(truncateAt);
        }
        builderObtain.setMaxLines(this.f15350f);
        float f3 = this.f15351g;
        if (f3 != 0.0f || this.f15352h != 1.0f) {
            builderObtain.setLineSpacing(f3, this.f15352h);
        }
        if (this.f15350f > 1) {
            builderObtain.setHyphenationFrequency(this.f15353i);
        }
        return builderObtain.build();
    }
}
