package p285o1;

import android.graphics.Paint;
import android.text.style.LineHeightSpan;
import dm.C5207g;

/* JADX INFO: renamed from: o1.h */
/* JADX INFO: loaded from: classes.dex */
public final class C7895h implements LineHeightSpan {

    /* JADX INFO: renamed from: a */
    public final float f43009a;

    /* JADX INFO: renamed from: b */
    public final int f43010b = 0;

    /* JADX INFO: renamed from: c */
    public final int f43011c;

    /* JADX INFO: renamed from: d */
    public final boolean f43012d;

    /* JADX INFO: renamed from: e */
    public final boolean f43013e;

    /* JADX INFO: renamed from: f */
    public final float f43014f;

    /* JADX INFO: renamed from: g */
    public int f43015g;

    /* JADX INFO: renamed from: h */
    public int f43016h;

    /* JADX INFO: renamed from: i */
    public int f43017i;

    /* JADX INFO: renamed from: j */
    public int f43018j;

    /* JADX INFO: renamed from: k */
    public int f43019k;

    /* JADX INFO: renamed from: l */
    public int f43020l;

    /* JADX WARN: Code duplicated, block: B:14:0x0039  */
    public C7895h(float f3, int i10, boolean z10, boolean z11, float f10) {
        this.f43009a = f3;
        boolean z12 = false;
        this.f43011c = i10;
        this.f43012d = z10;
        this.f43013e = z11;
        this.f43014f = f10;
        if (!(0.0f <= f10 && f10 <= 1.0f)) {
            z12 = (f10 > (-1.0f) ? 1 : (f10 == (-1.0f) ? 0 : -1)) == 0 ? true : z12;
        }
        if (!z12) {
            throw new IllegalStateException("topRatio should be in [0..1] range or -1".toString());
        }
    }

    @Override // android.text.style.LineHeightSpan
    public final void chooseHeight(CharSequence charSequence, int i10, int i11, int i12, int i13, Paint.FontMetricsInt fontMetricsInt) {
        double dCeil;
        C5207g.m11111f(charSequence, "text");
        C5207g.m11111f(fontMetricsInt, "fontMetricsInt");
        if (fontMetricsInt.descent - fontMetricsInt.ascent <= 0) {
            return;
        }
        boolean z10 = true;
        boolean z11 = i10 == this.f43010b;
        boolean z12 = i11 == this.f43011c;
        boolean z13 = this.f43013e;
        boolean z14 = this.f43012d;
        if (z11 && z12 && z14 && z13) {
            return;
        }
        if (z11) {
            int i14 = fontMetricsInt.descent - fontMetricsInt.ascent;
            int iCeil = (int) Math.ceil(this.f43009a);
            int i15 = iCeil - i14;
            float fAbs = this.f43014f;
            if (fAbs != -1.0f) {
                z10 = false;
            }
            if (z10) {
                fAbs = Math.abs(fontMetricsInt.ascent) / (fontMetricsInt.descent - fontMetricsInt.ascent);
            }
            if (i15 <= 0) {
                dCeil = Math.ceil(i15 * fAbs);
            } else {
                dCeil = Math.ceil((1.0f - fAbs) * i15);
            }
            int i16 = fontMetricsInt.descent;
            int i17 = ((int) dCeil) + i16;
            this.f43017i = i17;
            int i18 = i17 - iCeil;
            this.f43016h = i18;
            if (z14) {
                i18 = fontMetricsInt.ascent;
            }
            this.f43015g = i18;
            if (z13) {
                i17 = i16;
            }
            this.f43018j = i17;
            this.f43019k = fontMetricsInt.ascent - i18;
            this.f43020l = i17 - i16;
        }
        fontMetricsInt.ascent = z11 ? this.f43015g : this.f43016h;
        fontMetricsInt.descent = z12 ? this.f43018j : this.f43017i;
    }
}
