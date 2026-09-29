package androidx.compose.p017ui.text.android;

import android.graphics.Paint;
import android.graphics.Rect;
import android.os.Trace;
import android.text.BoringLayout;
import android.text.Layout;
import android.text.SpannableString;
import android.text.Spanned;
import android.text.StaticLayout;
import android.text.TextDirectionHeuristic;
import android.text.TextPaint;
import android.text.TextUtils;
import cm.InterfaceC2041a;
import dm.C5207g;
import kotlin.C6740a;
import kotlin.LazyThreadSafetyMode;
import kotlin.Pair;
import kotlin.collections.C6744b;
import p253m1.C7455b;
import p253m1.C7458e;
import p253m1.C7459f;
import p253m1.C7460g;
import p253m1.C7466m;
import p253m1.C7469p;
import p253m1.C7471r;
import p285o1.C7888a;
import p285o1.C7891d;
import p285o1.C7895h;
import p388t1.C9177c;
import sl.InterfaceC9070c;

/* JADX INFO: renamed from: androidx.compose.ui.text.android.a */
/* JADX INFO: loaded from: classes.dex */
public final class C0690a {

    /* JADX INFO: renamed from: a */
    public final boolean f4541a;

    /* JADX INFO: renamed from: b */
    public final boolean f4542b;

    /* JADX INFO: renamed from: c */
    public final boolean f4543c;

    /* JADX INFO: renamed from: d */
    public final Layout f4544d;

    /* JADX INFO: renamed from: e */
    public final int f4545e;

    /* JADX INFO: renamed from: f */
    public final int f4546f;

    /* JADX INFO: renamed from: g */
    public final int f4547g;

    /* JADX INFO: renamed from: h */
    public final float f4548h;

    /* JADX INFO: renamed from: i */
    public final float f4549i;

    /* JADX INFO: renamed from: j */
    public final Paint.FontMetricsInt f4550j;

    /* JADX INFO: renamed from: k */
    public final int f4551k;

    /* JADX INFO: renamed from: l */
    public final C7895h[] f4552l;

    /* JADX INFO: renamed from: m */
    public final Rect f4553m;

    /* JADX INFO: renamed from: n */
    public final InterfaceC9070c f4554n;

    /* JADX WARN: Code duplicated, block: B:40:0x0108  */
    /* JADX WARN: Code duplicated, block: B:79:0x027d  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v2 */
    /* JADX WARN: Type inference failed for: r0v3, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v32 */
    /* JADX WARN: Type inference failed for: r51v1, types: [boolean] */
    /* JADX WARN: Type inference failed for: r5v12 */
    /* JADX WARN: Type inference failed for: r5v14 */
    /* JADX WARN: Type inference failed for: r5v17 */
    public C0690a(CharSequence charSequence, float f3, C9177c c9177c, int i10, TextUtils.TruncateAt truncateAt, int i11, int i12, int i13, int i14, int i15, int i16, int i17, C7460g c7460g) {
        int i18;
        Layout layoutM14838a;
        int i19;
        ?? r10;
        C7895h[] c7895hArr;
        Pair pair;
        C5207g.m11111f(charSequence, "charSequence");
        C5207g.m11111f(c9177c, "textPaint");
        C5207g.m11111f(c7460g, "layoutIntrinsics");
        this.f4541a = true;
        this.f4542b = true;
        this.f4553m = new Rect();
        int length = charSequence.length();
        TextDirectionHeuristic textDirectionHeuristicM14839a = C7471r.m14839a(i11);
        Layout.Alignment alignment = C7469p.f41317a;
        Layout.Alignment alignment2 = i10 != 0 ? i10 != 1 ? i10 != 2 ? i10 != 3 ? i10 != 4 ? Layout.Alignment.ALIGN_NORMAL : C7469p.f41318b : C7469p.f41317a : Layout.Alignment.ALIGN_CENTER : Layout.Alignment.ALIGN_OPPOSITE : Layout.Alignment.ALIGN_NORMAL;
        boolean z10 = (charSequence instanceof Spanned) && ((Spanned) charSequence).nextSpanTransition(-1, length, C7888a.class) < length;
        Trace.beginSection("TextLayout:initLayout");
        try {
            BoringLayout.Metrics metricsM14831a = c7460g.m14831a();
            double d10 = f3;
            int iCeil = (int) Math.ceil(d10);
            if (metricsM14831a == null || c7460g.m14832b() > f3 || z10) {
                i18 = 1;
                layoutM14838a = C7466m.m14838a(charSequence, 0, charSequence.length(), c9177c, iCeil, textDirectionHeuristicM14839a, alignment2, i12, truncateAt, (int) Math.ceil(d10), 1.0f, 0.0f, i17, true, true, i13, i14, i15, i16, null, null);
                i19 = 0;
            } else {
                layoutM14838a = C7455b.m14826a(charSequence, c9177c, iCeil, metricsM14831a, alignment2, true, true, truncateAt, iCeil);
                i19 = 0;
                i18 = 1;
            }
            this.f4544d = layoutM14838a;
            Trace.endSection();
            int iMin = Math.min(layoutM14838a.getLineCount(), i12);
            this.f4545e = iMin;
            if (iMin < i12) {
                r10 = i19;
            } else {
                int i20 = iMin - 1;
                if (layoutM14838a.getEllipsisCount(i20) > 0 || layoutM14838a.getLineEnd(i20) != charSequence.length()) {
                    r10 = i18;
                } else {
                    r10 = i19;
                }
            }
            this.f4543c = r10;
            Pair pair2 = new Pair(Integer.valueOf(i19), Integer.valueOf(i19));
            if (m2580h() instanceof Spanned) {
                c7895hArr = (C7895h[]) ((Spanned) m2580h()).getSpans(i19, m2580h().length(), C7895h.class);
                C5207g.m11110e(c7895hArr, "lineHeightStyleSpans");
                if ((c7895hArr.length == 0 ? i18 : i19) != 0) {
                    c7895hArr = new C7895h[i19];
                }
            } else {
                c7895hArr = new C7895h[i19];
            }
            this.f4552l = c7895hArr;
            int length2 = c7895hArr.length;
            int i21 = i19;
            int iMax = i21;
            int iMax2 = iMax;
            while (i21 < length2) {
                C7895h c7895h = c7895hArr[i21];
                int i22 = c7895h.f43019k;
                iMax = i22 < 0 ? Math.max(iMax, Math.abs(i22)) : iMax;
                int i23 = c7895h.f43020l;
                if (i23 < 0) {
                    iMax2 = Math.max(iMax, Math.abs(i23));
                }
                i21++;
            }
            Pair<Integer, Integer> pair3 = (iMax == 0 && iMax2 == 0) ? C7471r.f41321b : new Pair<>(Integer.valueOf(iMax), Integer.valueOf(iMax2));
            this.f4546f = Math.max(((Number) pair2.f38012a).intValue(), pair3.f38012a.intValue());
            this.f4547g = Math.max(((Number) pair2.f38013b).intValue(), pair3.f38013b.intValue());
            C7895h[] c7895hArr2 = this.f4552l;
            int i24 = this.f4545e - 1;
            Layout layout = this.f4544d;
            if (layout.getLineStart(i24) != layout.getLineEnd(i24)) {
                pair = new Pair(null, Integer.valueOf(i19));
            } else {
                if (((c7895hArr2.length != 0 ? i19 : i18) ^ 1) != 0) {
                    SpannableString spannableString = new SpannableString("\u200b");
                    C7895h c7895h2 = (C7895h) C6744b.m13379k0(c7895hArr2);
                    spannableString.setSpan(new C7895h(c7895h2.f43009a, spannableString.length(), (i24 == 0 || !c7895h2.f43013e) ? c7895h2.f43013e : i19, c7895h2.f43013e, c7895h2.f43014f), i19, spannableString.length(), 33);
                    StaticLayout staticLayoutM14838a = C7466m.m14838a(spannableString, 0, spannableString.length(), c9177c, Integer.MAX_VALUE, textDirectionHeuristicM14839a, C7458e.f41278a, Integer.MAX_VALUE, null, Integer.MAX_VALUE, 1.0f, 0.0f, 0, this.f4541a, this.f4542b, 0, 0, 0, 0, null, null);
                    Paint.FontMetricsInt fontMetricsInt = new Paint.FontMetricsInt();
                    fontMetricsInt.ascent = staticLayoutM14838a.getLineAscent(i19);
                    fontMetricsInt.descent = staticLayoutM14838a.getLineDescent(i19);
                    fontMetricsInt.top = staticLayoutM14838a.getLineTop(i19);
                    int lineBottom = staticLayoutM14838a.getLineBottom(i19);
                    fontMetricsInt.bottom = lineBottom;
                    pair = new Pair(fontMetricsInt, Integer.valueOf(lineBottom - ((int) (m2575c(i24) - m2577e(i24)))));
                } else {
                    pair = new Pair(null, Integer.valueOf(i19));
                }
            }
            this.f4550j = (Paint.FontMetricsInt) pair.f38012a;
            this.f4551k = ((Number) pair.f38013b).intValue();
            Layout layout2 = this.f4544d;
            int i25 = this.f4545e - 1;
            TextPaint paint = layout2.getPaint();
            C5207g.m11110e(paint, "this.paint");
            this.f4548h = C7891d.m15658a(layout2, i25, paint);
            Layout layout3 = this.f4544d;
            int i26 = this.f4545e - 1;
            TextPaint paint2 = layout3.getPaint();
            C5207g.m11110e(paint2, "this.paint");
            this.f4549i = C7891d.m15659b(layout3, i26, paint2);
            this.f4554n = C6740a.m13373b(LazyThreadSafetyMode.NONE, new InterfaceC2041a<C7459f>() { // from class: androidx.compose.ui.text.android.TextLayout$layoutHelper$2
                {
                    super(0);
                }

                @Override // cm.InterfaceC2041a
                /* JADX INFO: renamed from: E */
                public final C7459f mo807E() {
                    return new C7459f(this.f4540b.f4544d);
                }
            });
        } catch (Throwable th2) {
            Trace.endSection();
            throw th2;
        }
    }

    /* JADX INFO: renamed from: a */
    public final int m2573a() {
        boolean z10 = this.f4543c;
        Layout layout = this.f4544d;
        return (z10 ? layout.getLineBottom(this.f4545e - 1) : layout.getHeight()) + this.f4546f + this.f4547g + this.f4551k;
    }

    /* JADX INFO: renamed from: b */
    public final float m2574b(int i10) {
        Paint.FontMetricsInt fontMetricsInt;
        return this.f4546f + ((i10 != this.f4545e + (-1) || (fontMetricsInt = this.f4550j) == null) ? this.f4544d.getLineBaseline(i10) : m2577e(i10) - fontMetricsInt.ascent);
    }

    /* JADX INFO: renamed from: c */
    public final float m2575c(int i10) {
        Paint.FontMetricsInt fontMetricsInt;
        int i11 = this.f4545e;
        int i12 = i11 - 1;
        Layout layout = this.f4544d;
        if (i10 != i12 || (fontMetricsInt = this.f4550j) == null) {
            return this.f4546f + layout.getLineBottom(i10) + (i10 == i11 + (-1) ? this.f4547g : 0);
        }
        return layout.getLineBottom(i10 - 1) + fontMetricsInt.bottom;
    }

    /* JADX INFO: renamed from: d */
    public final int m2576d(int i10) {
        return this.f4544d.getLineForOffset(i10);
    }

    /* JADX INFO: renamed from: e */
    public final float m2577e(int i10) {
        return this.f4544d.getLineTop(i10) + (i10 == 0 ? 0 : this.f4546f);
    }

    /* JADX INFO: renamed from: f */
    public final float m2578f(int i10, boolean z10) {
        return (m2576d(i10) == this.f4545e + (-1) ? this.f4548h + this.f4549i : 0.0f) + ((C7459f) this.f4554n.getValue()).m14829a(i10, true, z10);
    }

    /* JADX INFO: renamed from: g */
    public final float m2579g(int i10, boolean z10) {
        return (m2576d(i10) == this.f4545e + (-1) ? this.f4548h + this.f4549i : 0.0f) + ((C7459f) this.f4554n.getValue()).m14829a(i10, false, z10);
    }

    /* JADX INFO: renamed from: h */
    public final CharSequence m2580h() {
        CharSequence text = this.f4544d.getText();
        C5207g.m11110e(text, "layout.text");
        return text;
    }
}
