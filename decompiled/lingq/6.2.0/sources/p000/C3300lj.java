package p000;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.os.Build;
import android.text.Layout;
import android.text.SegmentFinder;
import android.text.Spannable;
import android.text.SpannableString;
import android.text.Spanned;
import android.text.TextPaint;
import android.text.TextUtils;
import java.util.ArrayList;
import java.util.List;
import kotlin.collections.EmptyList;

/* JADX INFO: renamed from: lj */
/* JADX INFO: loaded from: classes.dex */
public final class C3300lj {

    /* JADX INFO: renamed from: a */
    public final C3462pj f49725a;

    /* JADX INFO: renamed from: b */
    public final int f49726b;

    /* JADX INFO: renamed from: c */
    public final long f49727c;

    /* JADX INFO: renamed from: d */
    public final pw9 f49728d;

    /* JADX INFO: renamed from: e */
    public final CharSequence f49729e;

    /* JADX INFO: renamed from: f */
    public final List f49730f;

    /* JADX WARN: Code duplicated, block: B:100:0x012c  */
    /* JADX WARN: Code duplicated, block: B:101:0x012f  */
    /* JADX WARN: Code duplicated, block: B:104:0x0143  */
    /* JADX WARN: Code duplicated, block: B:106:0x014e  */
    /* JADX WARN: Code duplicated, block: B:118:0x019a  */
    /* JADX WARN: Code duplicated, block: B:138:0x01d3 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:142:0x0211  */
    /* JADX WARN: Code duplicated, block: B:143:0x0214  */
    /* JADX WARN: Code duplicated, block: B:145:0x022e  */
    /* JADX WARN: Code duplicated, block: B:147:0x0248  */
    /* JADX WARN: Code duplicated, block: B:149:0x024c A[LOOP:1: B:148:0x024a->B:149:0x024c, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:152:0x0279  */
    /* JADX WARN: Code duplicated, block: B:153:0x027d  */
    /* JADX WARN: Code duplicated, block: B:155:0x0295  */
    /* JADX WARN: Code duplicated, block: B:157:0x02ab  */
    /* JADX WARN: Code duplicated, block: B:158:0x02ad  */
    /* JADX WARN: Code duplicated, block: B:161:0x02b8  */
    /* JADX WARN: Code duplicated, block: B:164:0x02cd  */
    /* JADX WARN: Code duplicated, block: B:167:0x02d6  */
    /* JADX WARN: Code duplicated, block: B:168:0x02d8  */
    /* JADX WARN: Code duplicated, block: B:170:0x02db A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:172:0x02df  */
    /* JADX WARN: Code duplicated, block: B:195:0x0341  */
    /* JADX WARN: Code duplicated, block: B:197:0x0358  */
    /* JADX WARN: Code duplicated, block: B:199:0x036b  */
    /* JADX WARN: Code duplicated, block: B:200:0x0377  */
    /* JADX WARN: Code duplicated, block: B:201:0x038a  */
    /* JADX WARN: Code duplicated, block: B:202:0x0393  */
    /* JADX WARN: Code duplicated, block: B:203:0x0398  */
    /* JADX WARN: Code duplicated, block: B:214:0x033b A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:72:0x00e6  */
    /* JADX WARN: Code duplicated, block: B:84:0x0101  */
    /* JADX WARN: Code duplicated, block: B:93:0x011a  */
    /* JADX WARN: Code duplicated, block: B:95:0x0123  */
    /* JADX WARN: Code duplicated, block: B:97:0x0126  */
    /* JADX WARN: Code duplicated, block: B:98:0x0129  */
    /* JADX WARN: Instruction removed from duplicated block: B:147:0x0248, please report this as an issue */
    /* JADX WARN: Instruction removed from duplicated block: B:153:0x027d, please report this as an issue */
    public C3300lj(C3462pj c3462pj, int i, int i2, long j) {
        int i3;
        int i4;
        int i5;
        int i6;
        char c;
        TextUtils.TruncateAt truncateAt;
        TextUtils.TruncateAt truncateAt2;
        pw9 pw9VarM16238a;
        int i7;
        int i8;
        C3300lj c3300lj;
        int i9;
        int i10;
        Layout layout;
        Spanned spanned;
        j39[] j39VarArr;
        CharSequence charSequence;
        Spanned spanned2;
        ArrayList arrayList;
        int i11;
        List list;
        int spanEnd;
        int iM19550g;
        boolean z;
        boolean z2;
        boolean z3;
        e28 e28Var;
        float fM19554k;
        int iM19763c;
        float fM19553j;
        int iM19763c2;
        pw9 pw9Var;
        float fM19547d;
        int iM19762b;
        float fM19552i;
        float fM19762b;
        float fM19547d2;
        int i12;
        int i13;
        this.f49725a = c3462pj;
        this.f49726b = i;
        this.f49727c = j;
        if (bk1.m3802j(j) != 0 || bk1.m3803k(j) != 0) {
            j54.m14288a("Setting Constraints.minWidth and Constraints.minHeight is not supported, these should be the default zero values instead.");
        }
        if (i < 1) {
            j54.m14288a("maxLines should be greater than 0");
        }
        vx9 vx9Var = c3462pj.f56285b;
        CharSequence charSequence2 = c3462pj.f56291h;
        if (i2 == 2) {
            i3 = 0;
            if (!zx9.m25846a(vx9Var.f66065a.f42271h, d32.m10018P(0)) && !zx9.m25846a(vx9Var.f66065a.f42271h, zx9.f72359c) && (i13 = vx9Var.f66066b.f45012a) != 0 && i13 != 5 && i13 != 4 && charSequence2.length() != 0) {
                Spannable spannableString = charSequence2 instanceof Spannable ? (Spannable) charSequence2 : null;
                spannableString = spannableString == null ? new SpannableString(charSequence2) : spannableString;
                if (!xwc.m24733F(spannableString, m34.class)) {
                    spannableString.setSpan(new m34(), spannableString.length() - 1, spannableString.length() - 1, 33);
                }
                charSequence2 = spannableString;
            }
        } else {
            i3 = 0;
        }
        CharSequence charSequence3 = charSequence2;
        this.f49729e = charSequence3;
        j37 j37Var = vx9Var.f66066b;
        he9 he9Var = vx9Var.f66065a;
        int i14 = j37Var.f45012a;
        int i15 = 3;
        int i16 = i14 == 1 ? 3 : i14 == 2 ? 4 : i14 == 3 ? 2 : (i14 != 5 && i14 == 6) ? 1 : i3;
        int i17 = i14 == 4 ? 1 : i3;
        int i18 = j37Var.f45019h == 2 ? Build.VERSION.SDK_INT <= 32 ? 2 : 4 : i3;
        int i19 = j37Var.f45018g;
        int i20 = i19 & 255;
        if (i20 == 1) {
            i4 = i3;
        } else if (i20 == 2) {
            i4 = 1;
        } else if (i20 == 3) {
            i4 = 2;
        } else {
            i4 = i3;
        }
        int i21 = (i19 >> 8) & 255;
        if (i21 == 1) {
            i15 = i3;
        } else if (i21 == 2) {
            i15 = 1;
        } else if (i21 == 3) {
            i15 = 2;
        } else if (i21 != 4) {
            i15 = i3;
        }
        int i22 = (i19 >> 16) & 255;
        if (i22 != 1) {
            i5 = 2;
            i6 = i22 == 2 ? 1 : i6;
            if (i2 == i5) {
                truncateAt2 = TextUtils.TruncateAt.END;
            } else {
                if (i2 == 5) {
                    if (i2 == 4) {
                        truncateAt2 = TextUtils.TruncateAt.START;
                    } else {
                        c = ' ';
                        truncateAt = null;
                    }
                    pw9VarM16238a = m16238a(i16, i17, truncateAt, i, i18, i4, i15, i6, charSequence3);
                    Layout layout2 = pw9VarM16238a.f56919f;
                    i7 = i16;
                    if (Build.VERSION.SDK_INT < 35 || c3462pj.f56290g.getLetterSpacing() == 0.0f || (!(i2 == 4 || i2 == 5) || layout2.getEllipsisCount(0) <= 0)) {
                        i8 = 2;
                        c3300lj = this;
                        i9 = i;
                        i10 = i7;
                    } else {
                        int ellipsisStart = layout2.getEllipsisStart(0);
                        i8 = 2;
                        CharSequence[] charSequenceArr = {charSequence3.subSequence(0, ellipsisStart), "…", charSequence3.subSequence(layout2.getEllipsisCount(0) + ellipsisStart, charSequence3.length())};
                        c3300lj = this;
                        i9 = i;
                        i10 = i7;
                        pw9VarM16238a = c3300lj.m16238a(i10, i17, truncateAt, i9, i18, i4, i15, i6, TextUtils.concat(charSequenceArr));
                    }
                    int i23 = pw9VarM16238a.f56920g;
                    if (i2 == i8 || pw9VarM16238a.m19544a() <= bk1.m3800h(j) || i9 <= 1) {
                        c3300lj.f49728d = pw9VarM16238a;
                    } else {
                        int iM3800h = bk1.m3800h(j);
                        int i24 = 0;
                        while (true) {
                            if (i24 >= i23) {
                                i24 = i23;
                                break;
                            } else if (pw9VarM16238a.m19548e(i24) > iM3800h) {
                                break;
                            } else {
                                i24++;
                            }
                        }
                        if (i24 >= 0 && i24 != c3300lj.f49726b) {
                            pw9VarM16238a = c3300lj.m16238a(i10, i17, truncateAt, i24 < 1 ? 1 : i24, i18, i4, i15, i6, c3300lj.f49729e);
                        }
                        c3300lj.f49728d = pw9VarM16238a;
                    }
                    c3300lj.f49725a.f56290g.m4828c(he9Var.f42264a.mo24174b(), (((long) Float.floatToRawIntBits(c3300lj.m16239b())) & 4294967295L) | (((long) Float.floatToRawIntBits(c3300lj.m16241d())) << c), he9Var.f42264a.mo24175c());
                    layout = c3300lj.f49728d.f56919f;
                    if (layout.getText() instanceof Spanned) {
                        CharSequence text = layout.getText();
                        text.getClass();
                        spanned = (Spanned) text;
                        if (spanned.nextSpanTransition(-1, spanned.length(), j39.class) != spanned.length()) {
                            CharSequence text2 = layout.getText();
                            text2.getClass();
                            j39VarArr = (j39[]) ((Spanned) text2).getSpans(0, layout.getText().length(), j39.class);
                        } else {
                            j39VarArr = null;
                        }
                    } else {
                        j39VarArr = null;
                    }
                    if (j39VarArr != null) {
                        for (j39 j39Var : j39VarArr) {
                            ((xc9) j39Var.f45023c).setValue(new x89((((long) Float.floatToRawIntBits(c3300lj.m16239b())) & 4294967295L) | (((long) Float.floatToRawIntBits(c3300lj.m16241d())) << c)));
                        }
                    }
                    charSequence = c3300lj.f49729e;
                    if (charSequence instanceof Spanned) {
                        spanned2 = (Spanned) charSequence;
                        Object[] spans = spanned2.getSpans(0, charSequence.length(), q87.class);
                        arrayList = new ArrayList(spans.length);
                        for (Object obj : spans) {
                            q87 q87Var = (q87) obj;
                            int spanStart = spanned2.getSpanStart(q87Var);
                            spanEnd = spanned2.getSpanEnd(q87Var);
                            iM19550g = c3300lj.f49728d.m19550g(spanStart);
                            if (iM19550g >= c3300lj.f49726b) {
                                z = true;
                            } else {
                                z = false;
                            }
                            if (c3300lj.f49728d.f56919f.getEllipsisCount(iM19550g) > 0 || spanEnd <= c3300lj.f49728d.f56919f.getEllipsisStart(iM19550g) + c3300lj.f49728d.f56919f.getLineStart(iM19550g)) {
                                z2 = false;
                            } else {
                                z2 = true;
                            }
                            if (spanEnd > c3300lj.f49728d.m19549f(iM19550g)) {
                                z3 = true;
                            } else {
                                z3 = false;
                            }
                            if (z2 && !z3 && !z) {
                                boolean z4 = c3300lj.f49728d.f56919f.getParagraphDirection(iM19550g) == 1;
                                boolean zIsRtlCharAt = c3300lj.f49728d.f56919f.isRtlCharAt(spanStart);
                                if (!z4 || zIsRtlCharAt) {
                                    if (z4 && zIsRtlCharAt) {
                                        fM19553j = c3300lj.f49728d.m19554k(spanStart, false);
                                        iM19763c2 = q87Var.m19763c();
                                    } else {
                                        pw9 pw9Var2 = c3300lj.f49728d;
                                        if (zIsRtlCharAt) {
                                            fM19553j = pw9Var2.m19553j(spanStart, false);
                                            iM19763c2 = q87Var.m19763c();
                                        } else {
                                            fM19554k = pw9Var2.m19554k(spanStart, false);
                                            iM19763c = q87Var.m19763c();
                                        }
                                    }
                                    fM19554k = fM19553j - iM19763c2;
                                    pw9Var = c3300lj.f49728d;
                                    switch (q87Var.f57392g) {
                                        case 0:
                                            fM19547d = pw9Var.m19547d(iM19550g);
                                            iM19762b = q87Var.m19762b();
                                            fM19552i = fM19547d - iM19762b;
                                            e28Var = new e28(fM19554k, fM19552i, fM19553j, q87Var.m19762b() + fM19552i);
                                            break;
                                        case 1:
                                            fM19552i = pw9Var.m19552i(iM19550g);
                                            e28Var = new e28(fM19554k, fM19552i, fM19553j, q87Var.m19762b() + fM19552i);
                                            break;
                                        case 2:
                                            fM19547d = pw9Var.m19548e(iM19550g);
                                            iM19762b = q87Var.m19762b();
                                            fM19552i = fM19547d - iM19762b;
                                            e28Var = new e28(fM19554k, fM19552i, fM19553j, q87Var.m19762b() + fM19552i);
                                            break;
                                        case 3:
                                            fM19552i = ((pw9Var.m19548e(iM19550g) + pw9Var.m19552i(iM19550g)) - q87Var.m19762b()) / 2.0f;
                                            e28Var = new e28(fM19554k, fM19552i, fM19553j, q87Var.m19762b() + fM19552i);
                                            break;
                                        case 4:
                                            fM19762b = q87Var.m19761a().ascent;
                                            fM19547d2 = pw9Var.m19547d(iM19550g);
                                            fM19552i = fM19547d2 + fM19762b;
                                            e28Var = new e28(fM19554k, fM19552i, fM19553j, q87Var.m19762b() + fM19552i);
                                            break;
                                        case 5:
                                            fM19547d = pw9Var.m19547d(iM19550g) + q87Var.m19761a().descent;
                                            iM19762b = q87Var.m19762b();
                                            fM19552i = fM19547d - iM19762b;
                                            e28Var = new e28(fM19554k, fM19552i, fM19553j, q87Var.m19762b() + fM19552i);
                                            break;
                                        case 6:
                                            Paint.FontMetricsInt fontMetricsIntM19761a = q87Var.m19761a();
                                            fM19762b = ((fontMetricsIntM19761a.ascent + fontMetricsIntM19761a.descent) - q87Var.m19762b()) / 2;
                                            fM19547d2 = pw9Var.m19547d(iM19550g);
                                            fM19552i = fM19547d2 + fM19762b;
                                            e28Var = new e28(fM19554k, fM19552i, fM19553j, q87Var.m19762b() + fM19552i);
                                            break;
                                        default:
                                            C3386nv.m17633t("unexpected verticalAlignment");
                                            throw null;
                                    }
                                } else {
                                    fM19554k = c3300lj.f49728d.m19553j(spanStart, false);
                                    iM19763c = q87Var.m19763c();
                                }
                                fM19553j = iM19763c + fM19554k;
                                pw9Var = c3300lj.f49728d;
                                switch (q87Var.f57392g) {
                                    case 0:
                                        fM19547d = pw9Var.m19547d(iM19550g);
                                        iM19762b = q87Var.m19762b();
                                        fM19552i = fM19547d - iM19762b;
                                        e28Var = new e28(fM19554k, fM19552i, fM19553j, q87Var.m19762b() + fM19552i);
                                        break;
                                    case 1:
                                        fM19552i = pw9Var.m19552i(iM19550g);
                                        e28Var = new e28(fM19554k, fM19552i, fM19553j, q87Var.m19762b() + fM19552i);
                                        break;
                                    case 2:
                                        fM19547d = pw9Var.m19548e(iM19550g);
                                        iM19762b = q87Var.m19762b();
                                        fM19552i = fM19547d - iM19762b;
                                        e28Var = new e28(fM19554k, fM19552i, fM19553j, q87Var.m19762b() + fM19552i);
                                        break;
                                    case 3:
                                        fM19552i = ((pw9Var.m19548e(iM19550g) + pw9Var.m19552i(iM19550g)) - q87Var.m19762b()) / 2.0f;
                                        e28Var = new e28(fM19554k, fM19552i, fM19553j, q87Var.m19762b() + fM19552i);
                                        break;
                                    case 4:
                                        fM19762b = q87Var.m19761a().ascent;
                                        fM19547d2 = pw9Var.m19547d(iM19550g);
                                        fM19552i = fM19547d2 + fM19762b;
                                        e28Var = new e28(fM19554k, fM19552i, fM19553j, q87Var.m19762b() + fM19552i);
                                        break;
                                    case 5:
                                        fM19547d = pw9Var.m19547d(iM19550g) + q87Var.m19761a().descent;
                                        iM19762b = q87Var.m19762b();
                                        fM19552i = fM19547d - iM19762b;
                                        e28Var = new e28(fM19554k, fM19552i, fM19553j, q87Var.m19762b() + fM19552i);
                                        break;
                                    case 6:
                                        Paint.FontMetricsInt fontMetricsIntM19761a2 = q87Var.m19761a();
                                        fM19762b = ((fontMetricsIntM19761a2.ascent + fontMetricsIntM19761a2.descent) - q87Var.m19762b()) / 2;
                                        fM19547d2 = pw9Var.m19547d(iM19550g);
                                        fM19552i = fM19547d2 + fM19762b;
                                        e28Var = new e28(fM19554k, fM19552i, fM19553j, q87Var.m19762b() + fM19552i);
                                        break;
                                    default:
                                        C3386nv.m17633t("unexpected verticalAlignment");
                                        throw null;
                                }
                            }
                            arrayList.add(e28Var);
                        }
                        list = arrayList;
                    } else {
                        list = EmptyList.f47638a;
                    }
                    c3300lj.f49730f = list;
                }
                truncateAt2 = TextUtils.TruncateAt.MIDDLE;
            }
            c = ' ';
            truncateAt = truncateAt2;
            pw9VarM16238a = m16238a(i16, i17, truncateAt, i, i18, i4, i15, i6, charSequence3);
            Layout layout3 = pw9VarM16238a.f56919f;
            i7 = i16;
            if (Build.VERSION.SDK_INT < 35) {
                i8 = 2;
                c3300lj = this;
                i9 = i;
                i10 = i7;
            } else {
                i8 = 2;
                c3300lj = this;
                i9 = i;
                i10 = i7;
            }
            int i25 = pw9VarM16238a.f56920g;
            if (i2 == i8) {
            }
            c3300lj.f49728d = pw9VarM16238a;
            c3300lj.f49725a.f56290g.m4828c(he9Var.f42264a.mo24174b(), (((long) Float.floatToRawIntBits(c3300lj.m16239b())) & 4294967295L) | (((long) Float.floatToRawIntBits(c3300lj.m16241d())) << c), he9Var.f42264a.mo24175c());
            layout = c3300lj.f49728d.f56919f;
            if (layout.getText() instanceof Spanned) {
                j39VarArr = null;
            } else {
                CharSequence text3 = layout.getText();
                text3.getClass();
                spanned = (Spanned) text3;
                if (spanned.nextSpanTransition(-1, spanned.length(), j39.class) != spanned.length()) {
                    CharSequence text4 = layout.getText();
                    text4.getClass();
                    j39VarArr = (j39[]) ((Spanned) text4).getSpans(0, layout.getText().length(), j39.class);
                } else {
                    j39VarArr = null;
                }
            }
            if (j39VarArr != null) {
                while (i12 < r2) {
                    ((xc9) j39Var.f45023c).setValue(new x89((((long) Float.floatToRawIntBits(c3300lj.m16239b())) & 4294967295L) | (((long) Float.floatToRawIntBits(c3300lj.m16241d())) << c)));
                }
            }
            charSequence = c3300lj.f49729e;
            if (charSequence instanceof Spanned) {
                list = EmptyList.f47638a;
            } else {
                spanned2 = (Spanned) charSequence;
                Object[] spans2 = spanned2.getSpans(0, charSequence.length(), q87.class);
                arrayList = new ArrayList(spans2.length);
                while (i11 < r4) {
                    q87 q87Var2 = (q87) obj;
                    int spanStart2 = spanned2.getSpanStart(q87Var2);
                    spanEnd = spanned2.getSpanEnd(q87Var2);
                    iM19550g = c3300lj.f49728d.m19550g(spanStart2);
                    if (iM19550g >= c3300lj.f49726b) {
                        z = true;
                    } else {
                        z = false;
                    }
                    if (c3300lj.f49728d.f56919f.getEllipsisCount(iM19550g) > 0) {
                        z2 = false;
                    } else {
                        z2 = false;
                    }
                    if (spanEnd > c3300lj.f49728d.m19549f(iM19550g)) {
                        z3 = true;
                    } else {
                        z3 = false;
                    }
                    e28Var = z2 ? null : null;
                    arrayList.add(e28Var);
                }
                list = arrayList;
            }
            c3300lj.f49730f = list;
        }
        i5 = 2;
        i6 = i3;
        if (i2 == i5) {
            truncateAt2 = TextUtils.TruncateAt.END;
        } else {
            if (i2 == 5) {
                if (i2 == 4) {
                    truncateAt2 = TextUtils.TruncateAt.START;
                } else {
                    c = ' ';
                    truncateAt = null;
                }
                pw9VarM16238a = m16238a(i16, i17, truncateAt, i, i18, i4, i15, i6, charSequence3);
                Layout layout4 = pw9VarM16238a.f56919f;
                i7 = i16;
                if (Build.VERSION.SDK_INT < 35) {
                    i8 = 2;
                    c3300lj = this;
                    i9 = i;
                    i10 = i7;
                } else {
                    i8 = 2;
                    c3300lj = this;
                    i9 = i;
                    i10 = i7;
                }
                int i26 = pw9VarM16238a.f56920g;
                if (i2 == i8) {
                }
                c3300lj.f49728d = pw9VarM16238a;
                c3300lj.f49725a.f56290g.m4828c(he9Var.f42264a.mo24174b(), (((long) Float.floatToRawIntBits(c3300lj.m16239b())) & 4294967295L) | (((long) Float.floatToRawIntBits(c3300lj.m16241d())) << c), he9Var.f42264a.mo24175c());
                layout = c3300lj.f49728d.f56919f;
                if (layout.getText() instanceof Spanned) {
                    j39VarArr = null;
                } else {
                    CharSequence text5 = layout.getText();
                    text5.getClass();
                    spanned = (Spanned) text5;
                    if (spanned.nextSpanTransition(-1, spanned.length(), j39.class) != spanned.length()) {
                        CharSequence text6 = layout.getText();
                        text6.getClass();
                        j39VarArr = (j39[]) ((Spanned) text6).getSpans(0, layout.getText().length(), j39.class);
                    } else {
                        j39VarArr = null;
                    }
                }
                if (j39VarArr != null) {
                    while (i12 < r2) {
                        ((xc9) j39Var.f45023c).setValue(new x89((((long) Float.floatToRawIntBits(c3300lj.m16239b())) & 4294967295L) | (((long) Float.floatToRawIntBits(c3300lj.m16241d())) << c)));
                    }
                }
                charSequence = c3300lj.f49729e;
                if (charSequence instanceof Spanned) {
                    list = EmptyList.f47638a;
                } else {
                    spanned2 = (Spanned) charSequence;
                    Object[] spans3 = spanned2.getSpans(0, charSequence.length(), q87.class);
                    arrayList = new ArrayList(spans3.length);
                    while (i11 < r4) {
                        q87 q87Var3 = (q87) obj;
                        int spanStart3 = spanned2.getSpanStart(q87Var3);
                        spanEnd = spanned2.getSpanEnd(q87Var3);
                        iM19550g = c3300lj.f49728d.m19550g(spanStart3);
                        if (iM19550g >= c3300lj.f49726b) {
                            z = true;
                        } else {
                            z = false;
                        }
                        if (c3300lj.f49728d.f56919f.getEllipsisCount(iM19550g) > 0) {
                            z2 = false;
                        } else {
                            z2 = false;
                        }
                        if (spanEnd > c3300lj.f49728d.m19549f(iM19550g)) {
                            z3 = true;
                        } else {
                            z3 = false;
                        }
                        if (z2) {
                        }
                        arrayList.add(e28Var);
                    }
                    list = arrayList;
                }
                c3300lj.f49730f = list;
            }
            truncateAt2 = TextUtils.TruncateAt.MIDDLE;
        }
        c = ' ';
        truncateAt = truncateAt2;
        pw9VarM16238a = m16238a(i16, i17, truncateAt, i, i18, i4, i15, i6, charSequence3);
        Layout layout5 = pw9VarM16238a.f56919f;
        i7 = i16;
        if (Build.VERSION.SDK_INT < 35) {
            i8 = 2;
            c3300lj = this;
            i9 = i;
            i10 = i7;
        } else {
            i8 = 2;
            c3300lj = this;
            i9 = i;
            i10 = i7;
        }
        int i27 = pw9VarM16238a.f56920g;
        if (i2 == i8) {
        }
        c3300lj.f49728d = pw9VarM16238a;
        c3300lj.f49725a.f56290g.m4828c(he9Var.f42264a.mo24174b(), (((long) Float.floatToRawIntBits(c3300lj.m16239b())) & 4294967295L) | (((long) Float.floatToRawIntBits(c3300lj.m16241d())) << c), he9Var.f42264a.mo24175c());
        layout = c3300lj.f49728d.f56919f;
        if (layout.getText() instanceof Spanned) {
            j39VarArr = null;
        } else {
            CharSequence text7 = layout.getText();
            text7.getClass();
            spanned = (Spanned) text7;
            if (spanned.nextSpanTransition(-1, spanned.length(), j39.class) != spanned.length()) {
                CharSequence text8 = layout.getText();
                text8.getClass();
                j39VarArr = (j39[]) ((Spanned) text8).getSpans(0, layout.getText().length(), j39.class);
            } else {
                j39VarArr = null;
            }
        }
        if (j39VarArr != null) {
            while (i12 < r2) {
                ((xc9) j39Var.f45023c).setValue(new x89((((long) Float.floatToRawIntBits(c3300lj.m16239b())) & 4294967295L) | (((long) Float.floatToRawIntBits(c3300lj.m16241d())) << c)));
            }
        }
        charSequence = c3300lj.f49729e;
        if (charSequence instanceof Spanned) {
            list = EmptyList.f47638a;
        } else {
            spanned2 = (Spanned) charSequence;
            Object[] spans4 = spanned2.getSpans(0, charSequence.length(), q87.class);
            arrayList = new ArrayList(spans4.length);
            while (i11 < r4) {
                q87 q87Var4 = (q87) obj;
                int spanStart4 = spanned2.getSpanStart(q87Var4);
                spanEnd = spanned2.getSpanEnd(q87Var4);
                iM19550g = c3300lj.f49728d.m19550g(spanStart4);
                if (iM19550g >= c3300lj.f49726b) {
                    z = true;
                } else {
                    z = false;
                }
                if (c3300lj.f49728d.f56919f.getEllipsisCount(iM19550g) > 0) {
                    z2 = false;
                } else {
                    z2 = false;
                }
                if (spanEnd > c3300lj.f49728d.m19549f(iM19550g)) {
                    z3 = true;
                } else {
                    z3 = false;
                }
                if (z2) {
                }
                arrayList.add(e28Var);
            }
            list = arrayList;
        }
        c3300lj.f49730f = list;
    }

    /* JADX INFO: renamed from: a */
    public final pw9 m16238a(int i, int i2, TextUtils.TruncateAt truncateAt, int i3, int i4, int i5, int i6, int i7, CharSequence charSequence) {
        a97 a97Var;
        float fM16241d = m16241d();
        C3462pj c3462pj = this.f49725a;
        C0851cl c0851cl = c3462pj.f56290g;
        int i8 = c3462pj.f56295l;
        hq4 hq4Var = c3462pj.f56292i;
        vx9 vx9Var = c3462pj.f56285b;
        C3337mj c3337mj = AbstractC3374nj.f52788a;
        i97 i97Var = vx9Var.f66067c;
        return new pw9(charSequence, fM16241d, c0851cl, i, truncateAt, i8, (i97Var == null || (a97Var = i97Var.f43743b) == null) ? false : a97Var.f382a, i3, i5, i6, i7, i4, i2, hq4Var);
    }

    /* JADX INFO: renamed from: b */
    public final float m16239b() {
        return this.f49728d.m19544a();
    }

    /* JADX WARN: Code duplicated, block: B:40:0x00c4  */
    /* JADX WARN: Type inference failed for: r10v23, types: [qi] */
    /* JADX INFO: renamed from: c */
    public final long m16240c(e28 e28Var, int i, zv9 zv9Var) {
        int i2;
        int[] rangeForRect;
        SegmentFinder segmentFinderM19163l;
        RectF rectFM3982w0 = bna.m3982w0(e28Var);
        int i3 = 0;
        boolean z = i != 0 && i == 1;
        final C3186kj c3186kj = new C3186kj(zv9Var, i3);
        pw9 pw9Var = this.f49728d;
        TextPaint textPaint = pw9Var.f56914a;
        Layout layout = pw9Var.f56919f;
        if (Build.VERSION.SDK_INT >= 34) {
            if (z) {
                segmentFinderM19163l = new C3008fo(new qfa(layout.getText(), pw9Var.m19555l()));
            } else {
                AbstractC3461pi.m19165n();
                segmentFinderM19163l = AbstractC3461pi.m19163l(AbstractC3461pi.m19162k(layout.getText(), textPaint));
            }
            rangeForRect = layout.getRangeForRect(rectFM3982w0, segmentFinderM19163l, new Layout.TextInclusionStrategy() { // from class: qi
                @Override // android.text.Layout.TextInclusionStrategy
                public final boolean isSegmentInside(RectF rectF, RectF rectF2) {
                    return ((Boolean) c3186kj.invoke(rectF, rectF2)).booleanValue();
                }
            });
        } else {
            w41 w41VarM19546c = pw9Var.m19546c();
            bu8 qfaVar = z ? new qfa(layout.getText(), pw9Var.m19555l()) : new bl2(layout.getText(), textPaint);
            int lineForVertical = layout.getLineForVertical((int) rectFM3982w0.top);
            if (rectFM3982w0.top <= pw9Var.m19548e(lineForVertical) || (lineForVertical = lineForVertical + 1) < pw9Var.f56920g) {
                int i4 = lineForVertical;
                int lineForVertical2 = layout.getLineForVertical((int) rectFM3982w0.bottom);
                if (lineForVertical2 != 0 || rectFM3982w0.bottom >= pw9Var.m19552i(0)) {
                    int iM14110x = AbstractC3122is.m14110x(pw9Var, layout, w41VarM19546c, i4, rectFM3982w0, qfaVar, c3186kj, true);
                    while (true) {
                        i2 = i4;
                        if (iM14110x != -1 || i2 >= lineForVertical2) {
                            break;
                        }
                        i4 = i2 + 1;
                        iM14110x = AbstractC3122is.m14110x(pw9Var, layout, w41VarM19546c, i4, rectFM3982w0, qfaVar, c3186kj, true);
                    }
                    if (iM14110x == -1) {
                        rangeForRect = null;
                    } else {
                        int i5 = lineForVertical2;
                        int iM14110x2 = AbstractC3122is.m14110x(pw9Var, layout, w41VarM19546c, i5, rectFM3982w0, qfaVar, c3186kj, false);
                        while (iM14110x2 == -1 && i2 < i5) {
                            i5--;
                            iM14110x2 = AbstractC3122is.m14110x(pw9Var, layout, w41VarM19546c, i5, rectFM3982w0, qfaVar, c3186kj, false);
                        }
                        if (iM14110x2 == -1) {
                            rangeForRect = null;
                        } else {
                            rangeForRect = new int[]{qfaVar.mo3850f(iM14110x + 1), qfaVar.mo3853i(iM14110x2 - 1)};
                        }
                    }
                } else {
                    rangeForRect = null;
                }
            } else {
                rangeForRect = null;
            }
        }
        return rangeForRect == null ? cx9.f34692b : eh0.m11127g(rangeForRect[0], rangeForRect[1]);
    }

    /* JADX INFO: renamed from: d */
    public final float m16241d() {
        return bk1.m3801i(this.f49727c);
    }

    /* JADX INFO: renamed from: e */
    public final void m16242e(ym0 ym0Var) {
        Canvas canvasM19936a = AbstractC3497qg.m19936a(ym0Var);
        pw9 pw9Var = this.f49728d;
        if (pw9Var.f56917d) {
            canvasM19936a.save();
            canvasM19936a.clipRect(0.0f, 0.0f, m16241d(), m16239b());
        }
        int i = pw9Var.f56921h;
        if (canvasM19936a.getClipBounds(pw9Var.f56929p)) {
            if (i != 0) {
                canvasM19936a.translate(0.0f, i);
            }
            ThreadLocal threadLocal = tw9.f63022a;
            Object ms9Var = threadLocal.get();
            if (ms9Var == null) {
                ms9Var = new ms9();
                threadLocal.set(ms9Var);
            }
            ms9 ms9Var2 = (ms9) ms9Var;
            ms9Var2.f51808a = canvasM19936a;
            try {
                pw9Var.f56919f.draw(ms9Var2);
                ms9Var2.f51808a = null;
                if (i != 0) {
                    canvasM19936a.translate(0.0f, (-1.0f) * i);
                }
            } catch (Throwable th) {
                ms9Var2.f51808a = null;
                throw th;
            }
        }
        if (pw9Var.f56917d) {
            canvasM19936a.restore();
        }
    }

    /* JADX INFO: renamed from: f */
    public final void m16243f(ym0 ym0Var, long j, l39 l39Var, rt9 rt9Var, ml2 ml2Var) {
        C0851cl c0851cl = this.f49725a.f56290g;
        int i = c0851cl.f10211c;
        c0851cl.m4829d(j);
        c0851cl.m4831f(l39Var);
        c0851cl.m4832g(rt9Var);
        c0851cl.m4830e(ml2Var);
        c0851cl.m4827b(3);
        m16242e(ym0Var);
        c0851cl.m4827b(i);
    }

    /* JADX INFO: renamed from: g */
    public final void m16244g(ym0 ym0Var, vi0 vi0Var, float f, l39 l39Var, rt9 rt9Var, ml2 ml2Var) {
        C0851cl c0851cl = this.f49725a.f56290g;
        int i = c0851cl.f10211c;
        float fM16241d = m16241d();
        c0851cl.m4828c(vi0Var, (((long) Float.floatToRawIntBits(m16239b())) & 4294967295L) | (Float.floatToRawIntBits(fM16241d) << 32), f);
        c0851cl.m4831f(l39Var);
        c0851cl.m4832g(rt9Var);
        c0851cl.m4830e(ml2Var);
        c0851cl.m4827b(3);
        m16242e(ym0Var);
        c0851cl.m4827b(i);
    }
}
