package p000;

import android.graphics.Paint;
import android.text.style.LineHeightSpan;

/* JADX INFO: loaded from: classes.dex */
public final class sc5 implements LineHeightSpan {

    /* JADX INFO: renamed from: a */
    public final float f60670a;

    /* JADX INFO: renamed from: b */
    public final int f60671b;

    /* JADX INFO: renamed from: c */
    public final boolean f60672c;

    /* JADX INFO: renamed from: d */
    public final boolean f60673d;

    /* JADX INFO: renamed from: e */
    public final float f60674e;

    /* JADX INFO: renamed from: f */
    public final int f60675f;

    /* JADX INFO: renamed from: g */
    public int f60676g = Integer.MIN_VALUE;

    /* JADX INFO: renamed from: h */
    public int f60677h = Integer.MIN_VALUE;

    /* JADX INFO: renamed from: i */
    public int f60678i = Integer.MIN_VALUE;

    /* JADX INFO: renamed from: j */
    public int f60679j = Integer.MIN_VALUE;

    /* JADX INFO: renamed from: k */
    public int f60680k;

    /* JADX INFO: renamed from: l */
    public int f60681l;

    public sc5(float f, int i, boolean z, boolean z2, float f2, int i2) {
        this.f60670a = f;
        this.f60671b = i;
        this.f60672c = z;
        this.f60673d = z2;
        this.f60674e = f2;
        this.f60675f = i2;
        if ((0.0f > f2 || f2 > 1.0f) && f2 != -1.0f) {
            j54.m14290c("topRatio should be in [0..1] range or -1");
        }
    }

    @Override // android.text.style.LineHeightSpan
    public final void chooseHeight(CharSequence charSequence, int i, int i2, int i3, int i4, Paint.FontMetricsInt fontMetricsInt) {
        double dCeil;
        int i5 = fontMetricsInt.descent;
        int i6 = fontMetricsInt.ascent;
        if (i5 - i6 <= 0) {
            return;
        }
        boolean z = i == 0;
        boolean z2 = i2 == this.f60671b;
        int i7 = this.f60675f;
        boolean z3 = this.f60673d;
        boolean z4 = this.f60672c;
        if (z && z2 && z4 && z3 && i7 != 2) {
            return;
        }
        if (this.f60676g == Integer.MIN_VALUE) {
            int i8 = i5 - i6;
            int iCeil = (int) Math.ceil(this.f60670a);
            int i9 = iCeil - i8;
            if (i7 != 1 || i9 > 0) {
                float fAbs = this.f60674e;
                if (fAbs == -1.0f) {
                    fAbs = Math.abs(fontMetricsInt.ascent) / (fontMetricsInt.descent - fontMetricsInt.ascent);
                }
                if (i9 <= 0) {
                    dCeil = Math.ceil(i9 * fAbs);
                } else {
                    dCeil = Math.ceil((1.0f - fAbs) * i9);
                }
                int i10 = (int) dCeil;
                int i11 = fontMetricsInt.descent;
                int i12 = i10 + i11;
                this.f60678i = i12;
                int i13 = i12 - iCeil;
                this.f60677h = i13;
                if (i7 == 0 || i9 >= 0) {
                    if (z4) {
                        i13 = fontMetricsInt.ascent;
                    }
                    this.f60676g = i13;
                    if (z3) {
                        i12 = i11;
                    }
                    this.f60679j = i12;
                    this.f60680k = fontMetricsInt.ascent - i13;
                    this.f60681l = i12 - i11;
                } else if (i7 == 2) {
                    int i14 = fontMetricsInt.ascent;
                    this.f60676g = z4 ? Math.max(i14, i13) : Math.min(i14, i13);
                    int i15 = fontMetricsInt.descent;
                    int i16 = this.f60678i;
                    this.f60679j = z3 ? Math.min(i15, i16) : Math.max(i15, i16);
                    this.f60680k = 0;
                    this.f60681l = 0;
                }
            } else {
                int i17 = fontMetricsInt.ascent;
                this.f60677h = i17;
                int i18 = fontMetricsInt.descent;
                this.f60678i = i18;
                this.f60676g = i17;
                this.f60679j = i18;
                this.f60680k = 0;
                this.f60681l = 0;
            }
        }
        fontMetricsInt.ascent = z ? this.f60676g : this.f60677h;
        fontMetricsInt.descent = z2 ? this.f60679j : this.f60678i;
    }
}
