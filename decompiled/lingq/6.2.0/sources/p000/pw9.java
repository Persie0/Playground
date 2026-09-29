package p000;

import android.graphics.Paint;
import android.graphics.Rect;
import android.os.Build;
import android.os.Trace;
import android.text.BoringLayout;
import android.text.Layout;
import android.text.SpannableString;
import android.text.Spanned;
import android.text.StaticLayout;
import android.text.TextDirectionHeuristic;
import android.text.TextPaint;
import android.text.TextUtils;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
public final class pw9 {

    /* JADX INFO: renamed from: a */
    public final TextPaint f56914a;

    /* JADX INFO: renamed from: b */
    public final TextUtils.TruncateAt f56915b;

    /* JADX INFO: renamed from: c */
    public final boolean f56916c;

    /* JADX INFO: renamed from: d */
    public final boolean f56917d;

    /* JADX INFO: renamed from: e */
    public gh1 f56918e;

    /* JADX INFO: renamed from: f */
    public final Layout f56919f;

    /* JADX INFO: renamed from: g */
    public final int f56920g;

    /* JADX INFO: renamed from: h */
    public final int f56921h;

    /* JADX INFO: renamed from: i */
    public final int f56922i;

    /* JADX INFO: renamed from: j */
    public final float f56923j;

    /* JADX INFO: renamed from: k */
    public final float f56924k;

    /* JADX INFO: renamed from: l */
    public final boolean f56925l;

    /* JADX INFO: renamed from: m */
    public final Paint.FontMetricsInt f56926m;

    /* JADX INFO: renamed from: n */
    public final int f56927n;

    /* JADX INFO: renamed from: o */
    public final sc5[] f56928o;

    /* JADX INFO: renamed from: p */
    public final Rect f56929p = new Rect();

    /* JADX INFO: renamed from: q */
    public w41 f56930q;

    /* JADX WARN: Code duplicated, block: B:57:0x012a  */
    /* JADX WARN: Code duplicated, block: B:74:0x0161  */
    /* JADX WARN: Code duplicated, block: B:86:0x0178  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r15v10 */
    /* JADX WARN: Type inference failed for: r15v12 */
    /* JADX WARN: Type inference failed for: r15v18 */
    /* JADX WARN: Type inference failed for: r25v1, types: [boolean] */
    /* JADX WARN: Type inference failed for: r8v10 */
    /* JADX WARN: Type inference failed for: r8v12 */
    /* JADX WARN: Type inference failed for: r8v16 */
    /* JADX WARN: Type inference failed for: r8v38 */
    /* JADX WARN: Type inference failed for: r8v39 */
    public pw9(CharSequence charSequence, float f, TextPaint textPaint, int i, TextUtils.TruncateAt truncateAt, int i2, boolean z, int i3, int i4, int i5, int i6, int i7, int i8, hq4 hq4Var) {
        int i9;
        TextDirectionHeuristic textDirectionHeuristic;
        Layout layoutM19049s;
        sc5[] sc5VarArr;
        int i10;
        int i11;
        int i12;
        int i13;
        char c;
        long j;
        int i14;
        int i15;
        int i16;
        long jM22328a;
        ?? r8;
        boolean zIsFallbackLineSpacingEnabled;
        int topPadding;
        boolean zIsFallbackLineSpacingEnabled2;
        long jM22328a2;
        int i17;
        Paint.FontMetricsInt fontMetricsInt;
        int i18;
        this.f56914a = textPaint;
        this.f56915b = truncateAt;
        this.f56916c = z;
        int length = charSequence.length();
        TextDirectionHeuristic textDirectionHeuristicM22329b = tw9.m22329b(i2);
        Layout.Alignment alignment = ls9.f50082a;
        Layout.Alignment alignment2 = i != 0 ? i != 1 ? i != 2 ? i != 3 ? i != 4 ? Layout.Alignment.ALIGN_NORMAL : ls9.f50083b : ls9.f50082a : Layout.Alignment.ALIGN_CENTER : Layout.Alignment.ALIGN_OPPOSITE : Layout.Alignment.ALIGN_NORMAL;
        boolean z2 = (charSequence instanceof Spanned) && ((Spanned) charSequence).nextSpanTransition(-1, length, pa0.class) < length;
        Trace.beginSection("TextLayout:initLayout");
        try {
            BoringLayout.Metrics metricsM13430a = hq4Var.m13430a();
            double d = f;
            int iCeil = (int) Math.ceil(d);
            if (metricsM13430a == null || hq4Var.m13432c() > f || z2) {
                this.f56925l = false;
                i9 = i3;
                textDirectionHeuristic = textDirectionHeuristicM22329b;
                layoutM19049s = pb1.m19049s(charSequence, textPaint, iCeil, charSequence.length(), textDirectionHeuristic, alignment2, i9, truncateAt, (int) Math.ceil(d), i8, z, i4, i5, i6, i7);
            } else {
                this.f56925l = true;
                if (iCeil < 0) {
                    j54.m14288a("negative width");
                }
                if (iCeil < 0) {
                    j54.m14288a("negative ellipsized width");
                }
                layoutM19049s = Build.VERSION.SDK_INT >= 33 ? AbstractC3634u3.m22417h(charSequence, textPaint, iCeil, alignment2, metricsM13430a, z, truncateAt, iCeil) : new BoringLayout(charSequence, textPaint, iCeil, alignment2, 1.0f, 0.0f, metricsM13430a, z, truncateAt, iCeil);
                i9 = i3;
                textDirectionHeuristic = textDirectionHeuristicM22329b;
            }
            this.f56919f = layoutM19049s;
            Trace.endSection();
            int iMin = Math.min(layoutM19049s.getLineCount(), i9);
            this.f56920g = iMin;
            int i19 = iMin - 1;
            this.f56917d = iMin >= i9 && (layoutM19049s.getEllipsisCount(i19) > 0 || layoutM19049s.getLineEnd(i19) != charSequence.length());
            if (layoutM19049s.getText() instanceof Spanned) {
                CharSequence text = layoutM19049s.getText();
                text.getClass();
                if (xwc.m24733F((Spanned) text, sc5.class) || layoutM19049s.getText().length() <= 0) {
                    CharSequence text2 = layoutM19049s.getText();
                    text2.getClass();
                    i10 = 0;
                    sc5VarArr = (sc5[]) ((Spanned) text2).getSpans(0, layoutM19049s.getText().length(), sc5.class);
                } else {
                    sc5VarArr = null;
                    i10 = 0;
                }
            } else {
                sc5VarArr = null;
                i10 = 0;
            }
            this.f56928o = sc5VarArr;
            if (sc5VarArr == null) {
                i11 = 2;
                i12 = i10;
            } else {
                sc5 sc5Var = sc5VarArr.length == 0 ? null : sc5VarArr[i10];
                if (sc5Var != null) {
                    if (sc5Var.f60672c) {
                        i11 = 2;
                        i18 = sc5Var.f60675f == 2 ? 1 : i18;
                        i12 = i18;
                    } else {
                        i11 = 2;
                    }
                    i18 = i10;
                    i12 = i18;
                } else {
                    i11 = 2;
                    i12 = i10;
                }
            }
            if (sc5VarArr == null) {
                i13 = i10;
            } else {
                sc5 sc5Var2 = sc5VarArr.length == 0 ? null : sc5VarArr[i10];
                if (sc5Var2 != null && sc5Var2.f60673d && sc5Var2.f60675f == i11) {
                    i13 = 1;
                } else {
                    i13 = i10;
                }
            }
            if (i12 == 0 || i13 == 0) {
                long jM22328a3 = tw9.f63023b;
                if (z) {
                    c = ' ';
                    j = 4294967295L;
                    i14 = 1;
                    i15 = 33;
                } else {
                    if (this.f56925l) {
                        BoringLayout boringLayout = (BoringLayout) layoutM19049s;
                        i15 = 33;
                        if (Build.VERSION.SDK_INT >= 33) {
                            zIsFallbackLineSpacingEnabled2 = boringLayout.isFallbackLineSpacingEnabled();
                        } else {
                            r8 = i10;
                        }
                    } else {
                        i15 = 33;
                        StaticLayout staticLayout = (StaticLayout) layoutM19049s;
                        if (Build.VERSION.SDK_INT >= 33) {
                            zIsFallbackLineSpacingEnabled = staticLayout.isFallbackLineSpacingEnabled();
                        } else {
                            r8 = 1;
                        }
                    }
                    if (r8 != 0) {
                        r8 = zIsFallbackLineSpacingEnabled;
                        c = ' ';
                        j = 4294967295L;
                        i14 = 1;
                    } else {
                        r8 = zIsFallbackLineSpacingEnabled;
                        TextPaint paint = layoutM19049s.getPaint();
                        CharSequence text3 = layoutM19049s.getText();
                        c = ' ';
                        Rect rectM15220n = AbstractC3184kh.m15220n(paint, text3, layoutM19049s.getLineStart(i10), layoutM19049s.getLineEnd(i10));
                        int lineAscent = layoutM19049s.getLineAscent(i10);
                        j = 4294967295L;
                        int i20 = rectM15220n.top;
                        if (i20 < lineAscent) {
                            r8 = zIsFallbackLineSpacingEnabled2;
                            topPadding = lineAscent - i20;
                        } else {
                            r8 = zIsFallbackLineSpacingEnabled2;
                            topPadding = layoutM19049s.getTopPadding();
                        }
                        i14 = 1;
                        rectM15220n = iMin != 1 ? AbstractC3184kh.m15220n(paint, text3, layoutM19049s.getLineStart(i19), layoutM19049s.getLineEnd(i19)) : rectM15220n;
                        int lineDescent = layoutM19049s.getLineDescent(i19);
                        int i21 = rectM15220n.bottom;
                        int bottomPadding = i21 > lineDescent ? i21 - lineDescent : layoutM19049s.getBottomPadding();
                        if (topPadding != 0 || bottomPadding != 0) {
                            jM22328a3 = tw9.m22328a(topPadding, bottomPadding);
                        }
                    }
                }
                int i22 = i12 != 0 ? i10 : (int) (jM22328a3 >> c);
                if (i13 != 0) {
                    r8 = zIsFallbackLineSpacingEnabled2;
                    r8 = zIsFallbackLineSpacingEnabled2;
                    i16 = i10;
                } else {
                    r8 = zIsFallbackLineSpacingEnabled2;
                    r8 = zIsFallbackLineSpacingEnabled2;
                    i16 = (int) (jM22328a3 & j);
                }
                jM22328a = tw9.m22328a(i22, i16);
            } else {
                jM22328a = tw9.f63023b;
                c = ' ';
                j = 4294967295L;
                i14 = 1;
                i15 = 33;
            }
            if (sc5VarArr != null) {
                int length2 = sc5VarArr.length;
                int iMax = i10;
                int iMax2 = iMax;
                for (int i23 = iMax2; i23 < length2; i23++) {
                    sc5 sc5Var3 = sc5VarArr[i23];
                    int i24 = sc5Var3.f60680k;
                    iMax = i24 < 0 ? Math.max(iMax, Math.abs(i24)) : iMax;
                    int i25 = sc5Var3.f60681l;
                    if (i25 < 0) {
                        iMax2 = Math.max(iMax, Math.abs(i25));
                    }
                }
                jM22328a2 = (iMax == 0 && iMax2 == 0) ? tw9.f63023b : tw9.m22328a(iMax, iMax2);
            } else {
                jM22328a2 = tw9.f63023b;
            }
            this.f56921h = Math.max((int) (jM22328a >> c), (int) (jM22328a2 >> c));
            this.f56922i = Math.max((int) (jM22328a & j), (int) (jM22328a2 & j));
            TextPaint textPaint2 = this.f56914a;
            sc5[] sc5VarArr2 = this.f56928o;
            int i26 = this.f56920g - i14;
            Layout layout = this.f56919f;
            if (layout.getLineStart(i26) != layout.getLineEnd(i26) || sc5VarArr2 == null || sc5VarArr2.length == 0) {
                i17 = i10;
                fontMetricsInt = null;
            } else {
                SpannableString spannableString = new SpannableString("\u200b");
                sc5 sc5Var4 = (sc5) AbstractC3550rv.m20838f0(sc5VarArr2);
                spannableString.setSpan(new sc5(sc5Var4.f60670a, spannableString.length(), (i26 == 0 || !sc5Var4.f60673d) ? sc5Var4.f60673d : i10, sc5Var4.f60673d, sc5Var4.f60674e, sc5Var4.f60675f), i10, spannableString.length(), i15);
                i17 = i10;
                StaticLayout staticLayoutM19049s = pb1.m19049s(spannableString, textPaint2, Integer.MAX_VALUE, spannableString.length(), textDirectionHeuristic, zp4.f71936a, Integer.MAX_VALUE, null, Integer.MAX_VALUE, 0, this.f56916c, 0, 0, 0, 0);
                fontMetricsInt = new Paint.FontMetricsInt();
                fontMetricsInt.ascent = staticLayoutM19049s.getLineAscent(i17);
                fontMetricsInt.descent = staticLayoutM19049s.getLineDescent(i17);
                fontMetricsInt.top = staticLayoutM19049s.getLineTop(i17);
                fontMetricsInt.bottom = staticLayoutM19049s.getLineBottom(i17);
            }
            this.f56927n = fontMetricsInt != null ? fontMetricsInt.bottom - ((int) m19551h(i19)) : i17;
            this.f56926m = fontMetricsInt;
            Layout layout2 = this.f56919f;
            this.f56923j = d32.m10014L(layout2, i19, layout2.getPaint());
            Layout layout3 = this.f56919f;
            this.f56924k = d32.m10015M(layout3, i19, layout3.getPaint());
        } catch (Throwable th) {
            Trace.endSection();
            throw th;
        }
    }

    /* JADX INFO: renamed from: a */
    public final int m19544a() {
        boolean z = this.f56917d;
        Layout layout = this.f56919f;
        return (z ? layout.getLineBottom(this.f56920g - 1) : layout.getHeight()) + this.f56921h + this.f56922i + this.f56927n;
    }

    /* JADX INFO: renamed from: b */
    public final float m19545b(int i) {
        if (i == this.f56920g - 1) {
            return this.f56923j + this.f56924k;
        }
        return 0.0f;
    }

    /* JADX INFO: renamed from: c */
    public final w41 m19546c() {
        w41 w41Var = this.f56930q;
        if (w41Var != null) {
            return w41Var;
        }
        w41 w41Var2 = new w41();
        w41Var2.f66365a = this.f56919f;
        ArrayList arrayList = new ArrayList();
        int length = 0;
        do {
            int iM23388k0 = vk9.m23388k0(((Layout) w41Var2.f66365a).getText(), '\n', length, 4);
            length = iM23388k0 < 0 ? ((Layout) w41Var2.f66365a).getText().length() : iM23388k0 + 1;
            arrayList.add(Integer.valueOf(length));
        } while (length < ((Layout) w41Var2.f66365a).getText().length());
        w41Var2.f66366b = arrayList;
        int size = arrayList.size();
        ArrayList arrayList2 = new ArrayList(size);
        for (int i = 0; i < size; i++) {
            arrayList2.add(null);
        }
        w41Var2.f66367c = arrayList2;
        w41Var2.f66368d = new boolean[((ArrayList) w41Var2.f66366b).size()];
        ((ArrayList) w41Var2.f66366b).size();
        this.f56930q = w41Var2;
        return w41Var2;
    }

    /* JADX INFO: renamed from: d */
    public final float m19547d(int i) {
        Paint.FontMetricsInt fontMetricsInt;
        return this.f56921h + ((i != this.f56920g + (-1) || (fontMetricsInt = this.f56926m) == null) ? this.f56919f.getLineBaseline(i) : m19552i(i) - fontMetricsInt.ascent);
    }

    /* JADX INFO: renamed from: e */
    public final float m19548e(int i) {
        Paint.FontMetricsInt fontMetricsInt;
        int i2 = this.f56920g;
        int i3 = i2 - 1;
        Layout layout = this.f56919f;
        if (i != i3 || (fontMetricsInt = this.f56926m) == null) {
            return this.f56921h + layout.getLineBottom(i) + (i == i2 + (-1) ? this.f56922i : 0);
        }
        return layout.getLineBottom(i - 1) + fontMetricsInt.bottom;
    }

    /* JADX INFO: renamed from: f */
    public final int m19549f(int i) {
        ThreadLocal threadLocal = tw9.f63022a;
        Layout layout = this.f56919f;
        return (layout.getEllipsisCount(i) <= 0 || this.f56915b != TextUtils.TruncateAt.END) ? layout.getLineEnd(i) : layout.getText().length();
    }

    /* JADX INFO: renamed from: g */
    public final int m19550g(int i) {
        int i2 = this.f56920g;
        if (i2 <= 0) {
            return 0;
        }
        int lineForOffset = this.f56919f.getLineForOffset(i);
        int i3 = i2 - 1;
        return lineForOffset > i3 ? i3 : lineForOffset;
    }

    /* JADX INFO: renamed from: h */
    public final float m19551h(int i) {
        return m19548e(i) - m19552i(i);
    }

    /* JADX INFO: renamed from: i */
    public final float m19552i(int i) {
        return this.f56919f.getLineTop(i) + (i == 0 ? 0 : this.f56921h);
    }

    /* JADX INFO: renamed from: j */
    public final float m19553j(int i, boolean z) {
        return m19545b(m19550g(i)) + m19546c().m23729q(i, true, z);
    }

    /* JADX INFO: renamed from: k */
    public final float m19554k(int i, boolean z) {
        return m19545b(m19550g(i)) + m19546c().m23729q(i, false, z);
    }

    /* JADX INFO: renamed from: l */
    public final gh1 m19555l() {
        gh1 gh1Var = this.f56918e;
        if (gh1Var != null) {
            return gh1Var;
        }
        Layout layout = this.f56919f;
        gh1 gh1Var2 = new gh1(layout.getText(), layout.getText().length(), this.f56914a.getTextLocale());
        this.f56918e = gh1Var2;
        return gh1Var2;
    }
}
