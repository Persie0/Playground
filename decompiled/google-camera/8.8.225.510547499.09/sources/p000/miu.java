package p000;

import android.animation.TimeInterpolator;
import android.content.res.ColorStateList;
import android.content.res.Configuration;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Typeface;
import android.text.Layout;
import android.text.StaticLayout;
import android.text.TextDirectionHeuristics;
import android.text.TextPaint;
import android.text.TextUtils;
import android.util.Log;
import android.view.Gravity;
import android.view.View;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class miu {

    /* JADX INFO: renamed from: A */
    public final TextPaint f40642A;

    /* JADX INFO: renamed from: B */
    public TimeInterpolator f40643B;

    /* JADX INFO: renamed from: C */
    public TimeInterpolator f40644C;

    /* JADX INFO: renamed from: D */
    public float f40645D;

    /* JADX INFO: renamed from: G */
    public bzm f40648G;

    /* JADX INFO: renamed from: H */
    public bzm f40649H;

    /* JADX INFO: renamed from: I */
    private final RectF f40650I;

    /* JADX INFO: renamed from: K */
    private float f40652K;

    /* JADX INFO: renamed from: L */
    private float f40653L;

    /* JADX INFO: renamed from: M */
    private float f40654M;

    /* JADX INFO: renamed from: N */
    private float f40655N;

    /* JADX INFO: renamed from: O */
    private float f40656O;

    /* JADX INFO: renamed from: P */
    private float f40657P;

    /* JADX INFO: renamed from: Q */
    private Typeface f40658Q;

    /* JADX INFO: renamed from: R */
    private boolean f40659R;

    /* JADX INFO: renamed from: S */
    private float f40660S;

    /* JADX INFO: renamed from: T */
    private float f40661T;

    /* JADX INFO: renamed from: U */
    private float f40662U;

    /* JADX INFO: renamed from: V */
    private float f40663V;

    /* JADX INFO: renamed from: W */
    private float f40664W;

    /* JADX INFO: renamed from: X */
    private int f40665X;

    /* JADX INFO: renamed from: Y */
    private final TextPaint f40666Y;

    /* JADX INFO: renamed from: Z */
    private float f40667Z;

    /* JADX INFO: renamed from: a */
    public final View f40668a;

    /* JADX INFO: renamed from: aa */
    private float f40669aa;

    /* JADX INFO: renamed from: ab */
    private float f40670ab;

    /* JADX INFO: renamed from: ac */
    private ColorStateList f40671ac;

    /* JADX INFO: renamed from: ad */
    private float f40672ad;

    /* JADX INFO: renamed from: ae */
    private float f40673ae;

    /* JADX INFO: renamed from: af */
    private float f40674af;

    /* JADX INFO: renamed from: ag */
    private ColorStateList f40675ag;

    /* JADX INFO: renamed from: ah */
    private float f40676ah;

    /* JADX INFO: renamed from: ai */
    private float f40677ai;

    /* JADX INFO: renamed from: aj */
    private StaticLayout f40678aj;

    /* JADX INFO: renamed from: ak */
    private float f40679ak;

    /* JADX INFO: renamed from: al */
    private float f40680al;

    /* JADX INFO: renamed from: am */
    private float f40681am;

    /* JADX INFO: renamed from: an */
    private CharSequence f40682an;

    /* JADX INFO: renamed from: b */
    public float f40683b;

    /* JADX INFO: renamed from: c */
    public boolean f40684c;

    /* JADX INFO: renamed from: d */
    public float f40685d;

    /* JADX INFO: renamed from: e */
    public float f40686e;

    /* JADX INFO: renamed from: f */
    public int f40687f;

    /* JADX INFO: renamed from: g */
    public final Rect f40688g;

    /* JADX INFO: renamed from: h */
    public final Rect f40689h;

    /* JADX INFO: renamed from: l */
    public ColorStateList f40693l;

    /* JADX INFO: renamed from: m */
    public ColorStateList f40694m;

    /* JADX INFO: renamed from: n */
    public int f40695n;

    /* JADX INFO: renamed from: o */
    public Typeface f40696o;

    /* JADX INFO: renamed from: p */
    public Typeface f40697p;

    /* JADX INFO: renamed from: q */
    public Typeface f40698q;

    /* JADX INFO: renamed from: r */
    public Typeface f40699r;

    /* JADX INFO: renamed from: s */
    public Typeface f40700s;

    /* JADX INFO: renamed from: t */
    public Typeface f40701t;

    /* JADX INFO: renamed from: v */
    public CharSequence f40703v;

    /* JADX INFO: renamed from: w */
    public CharSequence f40704w;

    /* JADX INFO: renamed from: y */
    public int[] f40706y;

    /* JADX INFO: renamed from: z */
    public boolean f40707z;

    /* JADX INFO: renamed from: i */
    public int f40690i = 16;

    /* JADX INFO: renamed from: j */
    public int f40691j = 16;

    /* JADX INFO: renamed from: k */
    public float f40692k = 15.0f;

    /* JADX INFO: renamed from: J */
    private float f40651J = 15.0f;

    /* JADX INFO: renamed from: u */
    public TextUtils.TruncateAt f40702u = TextUtils.TruncateAt.END;

    /* JADX INFO: renamed from: x */
    public boolean f40705x = true;

    /* JADX INFO: renamed from: E */
    public int f40646E = 1;

    /* JADX INFO: renamed from: F */
    public float f40647F = 1.0f;

    public miu(View view) {
        this.f40668a = view;
        TextPaint textPaint = new TextPaint(129);
        this.f40666Y = textPaint;
        this.f40642A = new TextPaint(textPaint);
        this.f40689h = new Rect();
        this.f40688g = new Rect();
        this.f40650I = new RectF();
        this.f40686e = m16427a();
        m16431e(view.getContext().getResources().getConfiguration());
    }

    /* JADX INFO: renamed from: j */
    public static boolean m16418j(Rect rect, int i, int i2, int i3, int i4) {
        return rect.left == i && rect.top == i2 && rect.right == i3 && rect.bottom == i4;
    }

    /* JADX INFO: renamed from: k */
    private static float m16419k(float f, float f2, float f3, TimeInterpolator timeInterpolator) {
        if (timeInterpolator != null) {
            f3 = timeInterpolator.getInterpolation(f3);
        }
        TimeInterpolator timeInterpolator2 = mfs.f40383a;
        return f + (f3 * (f2 - f));
    }

    /* JADX INFO: renamed from: l */
    private static int m16420l(int i, int i2, float f) {
        float f2 = 1.0f - f;
        return Color.argb(Math.round((Color.alpha(i) * f2) + (Color.alpha(i2) * f)), Math.round((Color.red(i) * f2) + (Color.red(i2) * f)), Math.round((Color.green(i) * f2) + (Color.green(i2) * f)), Math.round((Color.blue(i) * f2) + (Color.blue(i2) * f)));
    }

    /* JADX INFO: renamed from: m */
    private final int m16421m(ColorStateList colorStateList) {
        if (colorStateList == null) {
            return 0;
        }
        int[] iArr = this.f40706y;
        return iArr != null ? colorStateList.getColorForState(iArr, 0) : colorStateList.getDefaultColor();
    }

    /* JADX WARN: Code duplicated, block: B:89:0x013c A[Catch: mja -> 0x01a3, TryCatch #0 {mja -> 0x01a3, blocks: (B:83:0x0125, B:94:0x0148, B:98:0x015b, B:100:0x0162, B:101:0x0168, B:104:0x0174, B:105:0x0176, B:107:0x0182, B:109:0x0187, B:111:0x018c, B:112:0x018f, B:114:0x0196, B:116:0x019b, B:117:0x019e, B:108:0x0185, B:84:0x012a, B:85:0x0132, B:86:0x0135, B:89:0x013c, B:90:0x013f, B:87:0x0138, B:91:0x0142), top: B:123:0x0123 }] */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r14v10 */
    /* JADX WARN: Type inference failed for: r14v11 */
    /* JADX WARN: Type inference failed for: r14v12, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r14v21 */
    /* JADX WARN: Type inference failed for: r14v22 */
    /* JADX WARN: Type inference failed for: r14v23, types: [boolean] */
    /* JADX WARN: Type inference failed for: r14v25 */
    /* JADX INFO: renamed from: n */
    private final void m16422n(float f, boolean z) {
        float f2;
        float f3;
        Typeface typeface;
        boolean z2;
        StaticLayout staticLayoutBuild;
        Layout.Alignment alignment;
        if (this.f40703v == null) {
            return;
        }
        float fWidth = this.f40689h.width();
        float fWidth2 = this.f40688g.width();
        if (m16424p(f, 1.0f)) {
            f2 = this.f40651J;
            f3 = this.f40676ah;
            this.f40660S = 1.0f;
            typeface = this.f40696o;
        } else {
            float f4 = this.f40692k;
            float f5 = this.f40645D;
            Typeface typeface2 = this.f40699r;
            if (m16424p(f, 0.0f)) {
                this.f40660S = 1.0f;
            } else {
                this.f40660S = m16419k(this.f40692k, this.f40651J, f, this.f40644C) / this.f40692k;
            }
            float f6 = this.f40651J / this.f40692k;
            float f7 = fWidth2 * f6;
            if (z) {
                fWidth = fWidth2;
                f2 = f4;
                f3 = f5;
                typeface = typeface2;
            } else {
                fWidth = f7 > fWidth ? Math.min(fWidth / f6, fWidth2) : fWidth2;
                f2 = f4;
                f3 = f5;
                typeface = typeface2;
            }
        }
        if (fWidth > 0.0f) {
            float f8 = this.f40661T;
            float f9 = this.f40677ai;
            Typeface typeface3 = this.f40658Q;
            StaticLayout staticLayout = this.f40678aj;
            z2 = (f8 == f2 && f9 == f3 && !(staticLayout != null && (fWidth > ((float) staticLayout.getWidth()) ? 1 : (fWidth == ((float) staticLayout.getWidth()) ? 0 : -1)) != 0) && typeface3 == typeface && !this.f40707z) ? false : true;
            this.f40661T = f2;
            this.f40677ai = f3;
            this.f40658Q = typeface;
            this.f40707z = false;
            this.f40666Y.setLinearText(this.f40660S != 1.0f);
        } else {
            z2 = false;
        }
        if (this.f40704w == null || z2) {
            this.f40666Y.setTextSize(this.f40661T);
            this.f40666Y.setTypeface(this.f40658Q);
            this.f40666Y.setLetterSpacing(this.f40677ai);
            CharSequence charSequence = this.f40703v;
            int iM442c = afc.m442c(this.f40668a);
            boolean z3 = this.f40705x;
            ?? r14 = iM442c == 1 ? 1 : 0;
            if (z3) {
                lqc lqcVar = r14 != 0 ? adz.f185b : adz.f184a;
                int length = charSequence.length();
                if (charSequence == null || length < 0 || charSequence.length() - length < 0) {
                    throw new IllegalArgumentException();
                }
                char c = 2;
                for (int i = 0; i < length && c == 2; i++) {
                    switch (Character.getDirectionality(charSequence.charAt(i))) {
                        case 0:
                        case 14:
                        case 15:
                            c = 1;
                            break;
                        case 1:
                        case 2:
                        case 16:
                        case 17:
                            c = 0;
                            break;
                        default:
                            c = 2;
                            break;
                    }
                }
                switch (c) {
                    case 0:
                        r14 = 1;
                        break;
                    case 1:
                        r14 = 0;
                        break;
                    default:
                        r14 = lqcVar.f38949a;
                        break;
                }
            }
            this.f40659R = r14;
            int i2 = m16425q() ? this.f40646E : 1;
            try {
                if (i2 != 1) {
                    switch (Gravity.getAbsoluteGravity(this.f40690i, r14) & 7) {
                        case 1:
                            alignment = Layout.Alignment.ALIGN_CENTER;
                            break;
                        case 5:
                            if (this.f40659R) {
                                alignment = Layout.Alignment.ALIGN_NORMAL;
                            } else {
                                alignment = Layout.Alignment.ALIGN_OPPOSITE;
                            }
                            break;
                        default:
                            if (this.f40659R) {
                                alignment = Layout.Alignment.ALIGN_OPPOSITE;
                            } else {
                                alignment = Layout.Alignment.ALIGN_NORMAL;
                            }
                            break;
                    }
                } else {
                    alignment = Layout.Alignment.ALIGN_NORMAL;
                    i2 = 1;
                }
                CharSequence charSequenceEllipsize = this.f40703v;
                TextPaint textPaint = this.f40666Y;
                int i3 = (int) fWidth;
                int length2 = charSequenceEllipsize.length();
                TextUtils.TruncateAt truncateAt = this.f40702u;
                float f10 = this.f40647F;
                if (charSequenceEllipsize == null) {
                    charSequenceEllipsize = "";
                }
                int iMax = Math.max(0, i3);
                if (i2 == 1) {
                    charSequenceEllipsize = TextUtils.ellipsize(charSequenceEllipsize, textPaint, iMax, truncateAt);
                    i2 = 1;
                }
                int iMin = Math.min(charSequenceEllipsize.length(), length2);
                if (r14 != 0 && i2 == 1) {
                    alignment = Layout.Alignment.ALIGN_OPPOSITE;
                }
                StaticLayout.Builder builderObtain = StaticLayout.Builder.obtain(charSequenceEllipsize, 0, iMin, textPaint, iMax);
                builderObtain.setAlignment(alignment);
                builderObtain.setIncludePad(false);
                builderObtain.setTextDirection(r14 != 0 ? TextDirectionHeuristics.RTL : TextDirectionHeuristics.LTR);
                if (truncateAt != null) {
                    builderObtain.setEllipsize(truncateAt);
                }
                builderObtain.setMaxLines(i2);
                if (f10 != 1.0f) {
                    builderObtain.setLineSpacing(0.0f, f10);
                }
                if (i2 > 1) {
                    builderObtain.setHyphenationFrequency(1);
                }
                staticLayoutBuild = builderObtain.build();
            } catch (mja e) {
                Log.e("CollapsingTextHelper", e.getCause().getMessage(), e);
                staticLayoutBuild = null;
            }
            abf.m90c(staticLayoutBuild);
            this.f40678aj = staticLayoutBuild;
            this.f40704w = staticLayoutBuild.getText();
        }
    }

    /* JADX INFO: renamed from: o */
    private final void m16423o(float f) {
        m16422n(f, false);
        afb.m426g(this.f40668a);
    }

    /* JADX INFO: renamed from: p */
    private static boolean m16424p(float f, float f2) {
        return Math.abs(f - f2) < 1.0E-5f;
    }

    /* JADX INFO: renamed from: q */
    private final boolean m16425q() {
        if (this.f40646E > 1) {
            return !this.f40659R || this.f40684c;
        }
        return false;
    }

    /* JADX INFO: renamed from: r */
    private static final float m16426r(TextPaint textPaint, CharSequence charSequence) {
        return textPaint.measureText(charSequence, 0, charSequence.length());
    }

    /* JADX INFO: renamed from: a */
    public final float m16427a() {
        float f = this.f40685d;
        return f + ((1.0f - f) * 0.5f);
    }

    /* JADX INFO: renamed from: b */
    public final int m16428b() {
        return m16421m(this.f40694m);
    }

    /* JADX INFO: renamed from: c */
    public final void m16429c() {
        float f;
        float f2 = this.f40683b;
        if (this.f40684c) {
            this.f40650I.set(f2 < this.f40686e ? this.f40688g : this.f40689h);
        } else {
            this.f40650I.left = m16419k(this.f40688g.left, this.f40689h.left, f2, this.f40643B);
            this.f40650I.top = m16419k(this.f40652K, this.f40653L, f2, this.f40643B);
            this.f40650I.right = m16419k(this.f40688g.right, this.f40689h.right, f2, this.f40643B);
            this.f40650I.bottom = m16419k(this.f40688g.bottom, this.f40689h.bottom, f2, this.f40643B);
        }
        if (!this.f40684c) {
            this.f40656O = m16419k(this.f40654M, this.f40655N, f2, this.f40643B);
            this.f40657P = m16419k(this.f40652K, this.f40653L, f2, this.f40643B);
            m16423o(f2);
            f = f2;
        } else if (f2 < this.f40686e) {
            this.f40656O = this.f40654M;
            this.f40657P = this.f40652K;
            m16423o(0.0f);
            f = 0.0f;
        } else {
            this.f40656O = this.f40655N;
            this.f40657P = this.f40653L - Math.max(0, this.f40687f);
            m16423o(1.0f);
            f = 1.0f;
        }
        this.f40680al = 1.0f - m16419k(0.0f, 1.0f, 1.0f - f2, mfs.f40384b);
        afb.m426g(this.f40668a);
        this.f40681am = m16419k(1.0f, 0.0f, f2, mfs.f40384b);
        afb.m426g(this.f40668a);
        ColorStateList colorStateList = this.f40694m;
        ColorStateList colorStateList2 = this.f40693l;
        if (colorStateList != colorStateList2) {
            this.f40666Y.setColor(m16420l(m16421m(colorStateList2), m16428b(), f));
        } else {
            this.f40666Y.setColor(m16428b());
        }
        float f3 = this.f40676ah;
        float f4 = this.f40645D;
        if (f3 != f4) {
            this.f40666Y.setLetterSpacing(m16419k(f4, f3, f2, mfs.f40384b));
        } else {
            this.f40666Y.setLetterSpacing(f3);
        }
        this.f40662U = m16419k(this.f40672ad, this.f40667Z, f2, null);
        this.f40663V = m16419k(this.f40673ae, this.f40669aa, f2, null);
        this.f40664W = m16419k(this.f40674af, this.f40670ab, f2, null);
        int iM16420l = m16420l(m16421m(this.f40675ag), m16421m(this.f40671ac), f2);
        this.f40665X = iM16420l;
        this.f40666Y.setShadowLayer(this.f40662U, this.f40663V, this.f40664W, iM16420l);
        if (this.f40684c) {
            int alpha = this.f40666Y.getAlpha();
            float f5 = this.f40686e;
            this.f40666Y.setAlpha((int) ((f2 <= f5 ? mfs.m16340a(1.0f, 0.0f, this.f40685d, f5, f2) : mfs.m16340a(0.0f, 1.0f, f5, 1.0f, f2)) * alpha));
        }
        afb.m426g(this.f40668a);
    }

    /* JADX INFO: renamed from: d */
    public final void m16430d(Canvas canvas) {
        int iSave = canvas.save();
        if (this.f40704w == null || this.f40650I.width() <= 0.0f || this.f40650I.height() <= 0.0f) {
            return;
        }
        this.f40666Y.setTextSize(this.f40661T);
        float f = this.f40656O;
        float f2 = this.f40657P;
        float f3 = this.f40660S;
        if (f3 != 1.0f && !this.f40684c) {
            canvas.scale(f3, f3, f, f2);
        }
        if (!m16425q() || (this.f40684c && this.f40683b <= this.f40686e)) {
            canvas.translate(f, f2);
            this.f40678aj.draw(canvas);
        } else {
            float lineStart = this.f40656O - this.f40678aj.getLineStart(0);
            int alpha = this.f40666Y.getAlpha();
            canvas.translate(lineStart, f2);
            if (!this.f40684c) {
                this.f40666Y.setAlpha((int) (this.f40681am * alpha));
                TextPaint textPaint = this.f40666Y;
                textPaint.setShadowLayer(this.f40662U, this.f40663V, this.f40664W, kxk.m15023p(this.f40665X, textPaint.getAlpha()));
                this.f40678aj.draw(canvas);
            }
            if (!this.f40684c) {
                this.f40666Y.setAlpha((int) (this.f40680al * alpha));
            }
            TextPaint textPaint2 = this.f40666Y;
            textPaint2.setShadowLayer(this.f40662U, this.f40663V, this.f40664W, kxk.m15023p(this.f40665X, textPaint2.getAlpha()));
            int lineBaseline = this.f40678aj.getLineBaseline(0);
            CharSequence charSequence = this.f40682an;
            float f4 = lineBaseline;
            canvas.drawText(charSequence, 0, charSequence.length(), 0.0f, f4, this.f40666Y);
            this.f40666Y.setShadowLayer(this.f40662U, this.f40663V, this.f40664W, this.f40665X);
            if (!this.f40684c) {
                String strTrim = this.f40682an.toString().trim();
                String strSubstring = strTrim.endsWith("…") ? strTrim.substring(0, strTrim.length() - 1) : strTrim;
                this.f40666Y.setAlpha(alpha);
                canvas.drawText(strSubstring, 0, Math.min(this.f40678aj.getLineEnd(0), strSubstring.length()), 0.0f, f4, (Paint) this.f40666Y);
            }
        }
        canvas.restoreToCount(iSave);
    }

    /* JADX INFO: renamed from: e */
    public final void m16431e(Configuration configuration) {
        Typeface typeface = this.f40698q;
        if (typeface != null) {
            this.f40697p = mkv.m16538b(configuration, typeface);
        }
        Typeface typeface2 = this.f40701t;
        if (typeface2 != null) {
            this.f40700s = mkv.m16538b(configuration, typeface2);
        }
        Typeface typeface3 = this.f40697p;
        if (typeface3 == null) {
            typeface3 = this.f40698q;
        }
        this.f40696o = typeface3;
        Typeface typeface4 = this.f40700s;
        if (typeface4 == null) {
            typeface4 = this.f40701t;
        }
        this.f40699r = typeface4;
        m16433g(true);
    }

    /* JADX INFO: renamed from: f */
    public final void m16432f() {
        m16433g(false);
    }

    /* JADX INFO: renamed from: g */
    public final void m16433g(boolean z) {
        StaticLayout staticLayout;
        if (this.f40668a.getHeight() <= 0 || this.f40668a.getWidth() <= 0) {
            if (!z) {
                return;
            } else {
                z = true;
            }
        }
        m16422n(1.0f, z);
        CharSequence charSequence = this.f40704w;
        if (charSequence != null && (staticLayout = this.f40678aj) != null) {
            this.f40682an = TextUtils.ellipsize(charSequence, this.f40666Y, staticLayout.getWidth(), this.f40702u);
        }
        CharSequence charSequence2 = this.f40682an;
        float fM16426r = 0.0f;
        if (charSequence2 != null) {
            this.f40679ak = m16426r(this.f40666Y, charSequence2);
        } else {
            this.f40679ak = 0.0f;
        }
        int absoluteGravity = Gravity.getAbsoluteGravity(this.f40691j, this.f40659R ? 1 : 0);
        switch (absoluteGravity & 112) {
            case 48:
                this.f40653L = this.f40689h.top;
                break;
            case 80:
                this.f40653L = this.f40689h.bottom + this.f40666Y.ascent();
                break;
            default:
                this.f40653L = this.f40689h.centerY() - ((this.f40666Y.descent() - this.f40666Y.ascent()) / 2.0f);
                break;
        }
        switch (absoluteGravity & 8388615) {
            case 1:
                this.f40655N = this.f40689h.centerX() - (this.f40679ak / 2.0f);
                break;
            case 5:
                this.f40655N = this.f40689h.right - this.f40679ak;
                break;
            default:
                this.f40655N = this.f40689h.left;
                break;
        }
        m16422n(0.0f, z);
        StaticLayout staticLayout2 = this.f40678aj;
        float height = staticLayout2 != null ? staticLayout2.getHeight() : 0.0f;
        StaticLayout staticLayout3 = this.f40678aj;
        if (staticLayout3 == null || this.f40646E <= 1) {
            CharSequence charSequence3 = this.f40704w;
            if (charSequence3 != null) {
                fM16426r = m16426r(this.f40666Y, charSequence3);
            }
        } else {
            fM16426r = staticLayout3.getWidth();
        }
        StaticLayout staticLayout4 = this.f40678aj;
        this.f40695n = staticLayout4 != null ? staticLayout4.getLineCount() : 0;
        int absoluteGravity2 = Gravity.getAbsoluteGravity(this.f40690i, this.f40659R ? 1 : 0);
        switch (absoluteGravity2 & 112) {
            case 48:
                this.f40652K = this.f40688g.top;
                break;
            case 80:
                this.f40652K = (this.f40688g.bottom - height) + this.f40666Y.descent();
                break;
            default:
                this.f40652K = this.f40688g.centerY() - (height / 2.0f);
                break;
        }
        switch (absoluteGravity2 & 8388615) {
            case 1:
                this.f40654M = this.f40688g.centerX() - (fM16426r / 2.0f);
                break;
            case 5:
                this.f40654M = this.f40688g.right - fM16426r;
                break;
            default:
                this.f40654M = this.f40688g.left;
                break;
        }
        m16423o(this.f40683b);
        m16429c();
    }

    /* JADX INFO: renamed from: h */
    public final void m16434h(int i) {
        mkp mkpVar = new mkp(this.f40668a.getContext(), i);
        ColorStateList colorStateList = mkpVar.f40858i;
        if (colorStateList != null) {
            this.f40694m = colorStateList;
        }
        float f = mkpVar.f40859j;
        if (f != 0.0f) {
            this.f40651J = f;
        }
        ColorStateList colorStateList2 = mkpVar.f40850a;
        if (colorStateList2 != null) {
            this.f40671ac = colorStateList2;
        }
        this.f40669aa = mkpVar.f40854e;
        this.f40670ab = mkpVar.f40855f;
        this.f40667Z = mkpVar.f40856g;
        this.f40676ah = mkpVar.f40857h;
        bzm bzmVar = this.f40649H;
        if (bzmVar != null) {
            bzmVar.m3221d();
        }
        this.f40649H = new bzm(new mit(this, 1), mkpVar.m16486a());
        mkpVar.m16488d(this.f40668a.getContext(), this.f40649H);
        m16432f();
    }

    /* JADX INFO: renamed from: i */
    public final void m16435i(int i) {
        mkp mkpVar = new mkp(this.f40668a.getContext(), i);
        ColorStateList colorStateList = mkpVar.f40858i;
        if (colorStateList != null) {
            this.f40693l = colorStateList;
        }
        float f = mkpVar.f40859j;
        if (f != 0.0f) {
            this.f40692k = f;
        }
        ColorStateList colorStateList2 = mkpVar.f40850a;
        if (colorStateList2 != null) {
            this.f40675ag = colorStateList2;
        }
        this.f40673ae = mkpVar.f40854e;
        this.f40674af = mkpVar.f40855f;
        this.f40672ad = mkpVar.f40856g;
        this.f40645D = mkpVar.f40857h;
        bzm bzmVar = this.f40648G;
        if (bzmVar != null) {
            bzmVar.m3221d();
        }
        this.f40648G = new bzm(new mit(this, 0), mkpVar.m16486a());
        mkpVar.m16488d(this.f40668a.getContext(), this.f40648G);
        m16432f();
    }
}
