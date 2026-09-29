package p000;

import android.animation.TimeInterpolator;
import android.content.res.ColorStateList;
import android.content.res.Configuration;
import android.graphics.Color;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Typeface;
import android.os.Build;
import android.text.Layout;
import android.text.StaticLayout;
import android.text.TextPaint;
import android.text.TextUtils;
import android.util.Log;
import android.view.Gravity;
import com.google.android.material.internal.StaticLayoutBuilderCompat$StaticLayoutBuilderCompatException;
import com.google.android.material.textfield.TextInputLayout;

/* JADX INFO: loaded from: classes2.dex */
public final class c51 {

    /* JADX INFO: renamed from: B */
    public CharSequence f9510B;

    /* JADX INFO: renamed from: C */
    public CharSequence f9511C;

    /* JADX INFO: renamed from: D */
    public boolean f9512D;

    /* JADX INFO: renamed from: F */
    public float f9514F;

    /* JADX INFO: renamed from: G */
    public float f9515G;

    /* JADX INFO: renamed from: H */
    public float f9516H;

    /* JADX INFO: renamed from: I */
    public float f9517I;

    /* JADX INFO: renamed from: J */
    public float f9518J;

    /* JADX INFO: renamed from: K */
    public int f9519K;

    /* JADX INFO: renamed from: L */
    public int f9520L;

    /* JADX INFO: renamed from: M */
    public int[] f9521M;

    /* JADX INFO: renamed from: N */
    public boolean f9522N;

    /* JADX INFO: renamed from: O */
    public final TextPaint f9523O;

    /* JADX INFO: renamed from: P */
    public final TextPaint f9524P;

    /* JADX INFO: renamed from: Q */
    public TimeInterpolator f9525Q;

    /* JADX INFO: renamed from: R */
    public TimeInterpolator f9526R;

    /* JADX INFO: renamed from: S */
    public float f9527S;

    /* JADX INFO: renamed from: T */
    public float f9528T;

    /* JADX INFO: renamed from: U */
    public float f9529U;

    /* JADX INFO: renamed from: V */
    public ColorStateList f9530V;

    /* JADX INFO: renamed from: W */
    public float f9531W;

    /* JADX INFO: renamed from: X */
    public float f9532X;

    /* JADX INFO: renamed from: Y */
    public float f9533Y;

    /* JADX INFO: renamed from: Z */
    public StaticLayout f9534Z;

    /* JADX INFO: renamed from: a */
    public final TextInputLayout f9535a;

    /* JADX INFO: renamed from: a0 */
    public float f9536a0;

    /* JADX INFO: renamed from: b */
    public float f9537b;

    /* JADX INFO: renamed from: b0 */
    public float f9538b0;

    /* JADX INFO: renamed from: c */
    public final Rect f9539c;

    /* JADX INFO: renamed from: c0 */
    public float f9540c0;

    /* JADX INFO: renamed from: d */
    public final Rect f9541d;

    /* JADX INFO: renamed from: d0 */
    public CharSequence f9542d0;

    /* JADX INFO: renamed from: e */
    public final RectF f9543e;

    /* JADX INFO: renamed from: j */
    public ColorStateList f9553j;

    /* JADX INFO: renamed from: k */
    public ColorStateList f9555k;

    /* JADX INFO: renamed from: k0 */
    public boolean f9556k0;

    /* JADX INFO: renamed from: l */
    public int f9557l;

    /* JADX INFO: renamed from: m */
    public float f9558m;

    /* JADX INFO: renamed from: n */
    public float f9559n;

    /* JADX INFO: renamed from: o */
    public float f9560o;

    /* JADX INFO: renamed from: p */
    public float f9561p;

    /* JADX INFO: renamed from: q */
    public float f9562q;

    /* JADX INFO: renamed from: r */
    public float f9563r;

    /* JADX INFO: renamed from: s */
    public Typeface f9564s;

    /* JADX INFO: renamed from: t */
    public Typeface f9565t;

    /* JADX INFO: renamed from: u */
    public Typeface f9566u;

    /* JADX INFO: renamed from: v */
    public Typeface f9567v;

    /* JADX INFO: renamed from: w */
    public Typeface f9568w;

    /* JADX INFO: renamed from: x */
    public Typeface f9569x;

    /* JADX INFO: renamed from: y */
    public Typeface f9570y;

    /* JADX INFO: renamed from: z */
    public pm0 f9571z;

    /* JADX INFO: renamed from: f */
    public int f9545f = 16;

    /* JADX INFO: renamed from: g */
    public int f9547g = 16;

    /* JADX INFO: renamed from: h */
    public float f9549h = 15.0f;

    /* JADX INFO: renamed from: i */
    public float f9551i = 15.0f;

    /* JADX INFO: renamed from: A */
    public final TextUtils.TruncateAt f9509A = TextUtils.TruncateAt.END;

    /* JADX INFO: renamed from: E */
    public final boolean f9513E = true;

    /* JADX INFO: renamed from: e0 */
    public int f9544e0 = 1;

    /* JADX INFO: renamed from: f0 */
    public int f9546f0 = 1;

    /* JADX INFO: renamed from: g0 */
    public final float f9548g0 = 1.0f;

    /* JADX INFO: renamed from: h0 */
    public final int f9550h0 = 1;

    /* JADX INFO: renamed from: i0 */
    public int f9552i0 = -1;

    /* JADX INFO: renamed from: j0 */
    public int f9554j0 = -1;

    public c51(TextInputLayout textInputLayout) {
        this.f9535a = textInputLayout;
        TextPaint textPaint = new TextPaint(129);
        this.f9523O = textPaint;
        this.f9524P = new TextPaint(textPaint);
        this.f9541d = new Rect();
        this.f9539c = new Rect();
        this.f9543e = new RectF();
        m4322i(textInputLayout.getContext().getResources().getConfiguration());
    }

    /* JADX INFO: renamed from: a */
    public static int m4314a(int i, float f, int i2) {
        float f2 = 1.0f - f;
        return Color.argb(Math.round((Color.alpha(i2) * f) + (Color.alpha(i) * f2)), Math.round((Color.red(i2) * f) + (Color.red(i) * f2)), Math.round((Color.green(i2) * f) + (Color.green(i) * f2)), Math.round((Color.blue(i2) * f) + (Color.blue(i) * f2)));
    }

    /* JADX INFO: renamed from: h */
    public static float m4315h(float f, float f2, float f3, TimeInterpolator timeInterpolator) {
        if (timeInterpolator != null) {
            f3 = timeInterpolator.getInterpolation(f3);
        }
        return AbstractC0853cn.m4878a(f, f2, f3);
    }

    /* JADX INFO: renamed from: b */
    public final void m4316b() {
        float f = this.f9537b;
        Rect rect = this.f9539c;
        float f2 = rect.left;
        Rect rect2 = this.f9541d;
        float fM4315h = m4315h(f2, rect2.left, f, this.f9525Q);
        RectF rectF = this.f9543e;
        rectF.left = fM4315h;
        rectF.top = m4315h(this.f9558m, this.f9559n, f, this.f9525Q);
        rectF.right = m4315h(rect.right, rect2.right, f, this.f9525Q);
        rectF.bottom = m4315h(rect.bottom, rect2.bottom, f, this.f9525Q);
        this.f9562q = m4315h(this.f9560o, this.f9561p, f, this.f9525Q);
        this.f9563r = m4315h(this.f9558m, this.f9559n, f, this.f9525Q);
        m4318d(f, false);
        TextInputLayout textInputLayout = this.f9535a;
        textInputLayout.postInvalidateOnAnimation();
        float f3 = this.f9531W;
        float f4 = this.f9532X;
        TextPaint textPaint = this.f9523O;
        if (f3 != f4) {
            textPaint.setLetterSpacing(m4315h(f4, f3, f, AbstractC0853cn.f10297b));
        } else {
            textPaint.setLetterSpacing(f3);
        }
        qz2 qz2Var = AbstractC0853cn.f10297b;
        this.f9538b0 = 1.0f - m4315h(0.0f, 1.0f, 1.0f - f, qz2Var);
        textInputLayout.postInvalidateOnAnimation();
        this.f9540c0 = m4315h(1.0f, 0.0f, f, qz2Var);
        textInputLayout.postInvalidateOnAnimation();
        ColorStateList colorStateList = this.f9555k;
        ColorStateList colorStateList2 = this.f9553j;
        if (colorStateList != colorStateList2) {
            textPaint.setColor(m4314a(m4321g(colorStateList2), f, m4321g(this.f9555k)));
        } else {
            textPaint.setColor(m4321g(colorStateList));
        }
        this.f9516H = AbstractC0853cn.m4878a(0.0f, this.f9527S, f);
        this.f9517I = AbstractC0853cn.m4878a(0.0f, this.f9528T, f);
        this.f9518J = AbstractC0853cn.m4878a(0.0f, this.f9529U, f);
        int iM4314a = m4314a(0, f, m4321g(this.f9530V));
        this.f9519K = iM4314a;
        textPaint.setShadowLayer(this.f9516H, this.f9517I, this.f9518J, iM4314a);
        textInputLayout.postInvalidateOnAnimation();
    }

    /* JADX INFO: renamed from: c */
    public final boolean m4317c(CharSequence charSequence) {
        boolean z = this.f9535a.getLayoutDirection() == 1;
        if (this.f9513E) {
            return (z ? wt9.f67286d : wt9.f67285c).m13222c(charSequence, charSequence.length());
        }
        return z;
    }

    /* JADX INFO: renamed from: d */
    public final void m4318d(float f, boolean z) {
        float f2;
        Typeface typeface;
        float f3;
        if (this.f9510B == null) {
            return;
        }
        float fWidth = this.f9541d.width();
        float fWidth2 = this.f9539c.width();
        if (Math.abs(f - 1.0f) < 1.0E-5f) {
            f2 = m4328o() ? this.f9551i : this.f9549h;
            f3 = m4328o() ? this.f9531W : this.f9532X;
            this.f9514F = m4328o() ? 1.0f : m4315h(this.f9549h, this.f9551i, f, this.f9526R) / this.f9549h;
            if (!m4328o()) {
                fWidth = fWidth2;
            }
            typeface = this.f9564s;
            fWidth2 = fWidth;
        } else {
            f2 = this.f9549h;
            float f4 = this.f9532X;
            typeface = this.f9567v;
            if (Math.abs(f - 0.0f) < 1.0E-5f) {
                this.f9514F = 1.0f;
            } else {
                this.f9514F = m4315h(this.f9549h, this.f9551i, f, this.f9526R) / this.f9549h;
            }
            float f5 = this.f9551i / this.f9549h;
            float f6 = fWidth2 * f5;
            if (!z && f6 > fWidth && m4328o()) {
                fWidth2 = Math.min(fWidth / f5, fWidth2);
            }
            f3 = f4;
        }
        int i = f < 0.5f ? this.f9544e0 : this.f9546f0;
        TextPaint textPaint = this.f9523O;
        boolean z2 = false;
        if (fWidth2 > 0.0f) {
            boolean z3 = this.f9515G != f2;
            boolean z4 = this.f9533Y != f3;
            boolean z5 = this.f9570y != typeface;
            StaticLayout staticLayout = this.f9534Z;
            boolean z6 = z3 || z4 || (staticLayout != null && (fWidth2 > ((float) staticLayout.getWidth()) ? 1 : (fWidth2 == ((float) staticLayout.getWidth()) ? 0 : -1)) != 0) || z5 || (this.f9520L != i) || this.f9522N;
            this.f9515G = f2;
            this.f9533Y = f3;
            this.f9570y = typeface;
            this.f9522N = false;
            this.f9520L = i;
            textPaint.setLinearText(this.f9514F != 1.0f);
            z2 = z6;
        }
        if (this.f9511C == null || z2) {
            textPaint.setTextSize(this.f9515G);
            textPaint.setTypeface(this.f9570y);
            textPaint.setLetterSpacing(this.f9533Y);
            boolean zM4317c = m4317c(this.f9510B);
            this.f9512D = zM4317c;
            StaticLayout staticLayoutM4319e = m4319e(fWidth2 * (m4328o() ? 1.0f : this.f9514F), ((this.f9544e0 > 1 || this.f9546f0 > 1) && !zM4317c) ? i : 1, textPaint, this.f9510B, this.f9512D);
            this.f9534Z = staticLayoutM4319e;
            this.f9511C = staticLayoutM4319e.getText();
        }
    }

    /* JADX INFO: renamed from: e */
    public final StaticLayout m4319e(float f, int i, TextPaint textPaint, CharSequence charSequence, boolean z) {
        Layout.Alignment alignment;
        StaticLayout staticLayoutM22737a = null;
        try {
            if (i == 1) {
                alignment = Layout.Alignment.ALIGN_NORMAL;
            } else {
                int absoluteGravity = Gravity.getAbsoluteGravity(this.f9545f, this.f9512D ? 1 : 0) & 7;
                if (absoluteGravity != 1) {
                    boolean z2 = this.f9512D;
                    if (absoluteGravity != 5) {
                        alignment = z2 ? Layout.Alignment.ALIGN_OPPOSITE : Layout.Alignment.ALIGN_NORMAL;
                    } else {
                        alignment = z2 ? Layout.Alignment.ALIGN_NORMAL : Layout.Alignment.ALIGN_OPPOSITE;
                    }
                } else {
                    alignment = Layout.Alignment.ALIGN_CENTER;
                }
            }
            uh9 uh9Var = new uh9(charSequence, textPaint, (int) f);
            uh9Var.f63946l = this.f9509A;
            uh9Var.f63945k = z;
            uh9Var.f63939e = alignment;
            uh9Var.f63944j = false;
            uh9Var.f63940f = i;
            float f2 = this.f9548g0;
            uh9Var.f63941g = 0.0f;
            uh9Var.f63942h = f2;
            uh9Var.f63943i = this.f9550h0;
            uh9Var.f63947m = null;
            staticLayoutM22737a = uh9Var.m22737a();
        } catch (StaticLayoutBuilderCompat$StaticLayoutBuilderCompatException e) {
            Log.e("CollapsingTextHelper", e.getCause().getMessage(), e);
        }
        staticLayoutM22737a.getClass();
        return staticLayoutM22737a;
    }

    /* JADX INFO: renamed from: f */
    public final float m4320f() {
        int i = this.f9552i0;
        if (i != -1) {
            return i;
        }
        float f = this.f9551i;
        TextPaint textPaint = this.f9524P;
        textPaint.setTextSize(f);
        textPaint.setTypeface(this.f9564s);
        textPaint.setLetterSpacing(this.f9531W);
        return -textPaint.ascent();
    }

    /* JADX INFO: renamed from: g */
    public final int m4321g(ColorStateList colorStateList) {
        if (colorStateList == null) {
            return 0;
        }
        int[] iArr = this.f9521M;
        return iArr != null ? colorStateList.getColorForState(iArr, 0) : colorStateList.getDefaultColor();
    }

    /* JADX INFO: renamed from: i */
    public final void m4322i(Configuration configuration) {
        if (Build.VERSION.SDK_INT >= 31) {
            Typeface typeface = this.f9566u;
            if (typeface != null) {
                this.f9565t = yda.m25095b(configuration, typeface);
            }
            Typeface typeface2 = this.f9569x;
            if (typeface2 != null) {
                this.f9568w = yda.m25095b(configuration, typeface2);
            }
            Typeface typeface3 = this.f9565t;
            if (typeface3 == null) {
                typeface3 = this.f9566u;
            }
            this.f9564s = typeface3;
            Typeface typeface4 = this.f9568w;
            if (typeface4 == null) {
                typeface4 = this.f9569x;
            }
            this.f9567v = typeface4;
            m4323j(true);
        }
    }

    /* JADX INFO: renamed from: j */
    public final void m4323j(boolean z) {
        float fMeasureText;
        TextInputLayout textInputLayout = this.f9535a;
        if ((textInputLayout.getHeight() <= 0 || textInputLayout.getWidth() <= 0) && !z) {
            return;
        }
        m4318d(1.0f, z);
        CharSequence charSequence = this.f9511C;
        TextPaint textPaint = this.f9523O;
        if (charSequence != null && this.f9534Z != null) {
            boolean zM4328o = m4328o();
            CharSequence charSequenceEllipsize = this.f9511C;
            if (zM4328o) {
                charSequenceEllipsize = TextUtils.ellipsize(charSequenceEllipsize, textPaint, this.f9534Z.getWidth(), this.f9509A);
            }
            this.f9542d0 = charSequenceEllipsize;
        }
        CharSequence charSequence2 = this.f9542d0;
        if (charSequence2 != null) {
            this.f9536a0 = textPaint.measureText(charSequence2, 0, charSequence2.length());
        } else {
            this.f9536a0 = 0.0f;
        }
        int absoluteGravity = Gravity.getAbsoluteGravity(this.f9547g, this.f9512D ? 1 : 0);
        int i = absoluteGravity & 112;
        Rect rect = this.f9541d;
        if (i == 48) {
            this.f9559n = rect.top;
        } else if (i != 80) {
            this.f9559n = rect.centerY() - ((textPaint.descent() - textPaint.ascent()) / 2.0f);
        } else {
            this.f9559n = textPaint.ascent() + rect.bottom;
        }
        int i2 = absoluteGravity & 8388615;
        if (i2 == 1) {
            this.f9561p = rect.centerX() - (this.f9536a0 / 2.0f);
        } else if (i2 != 5) {
            this.f9561p = rect.left;
        } else {
            this.f9561p = rect.right - this.f9536a0;
        }
        if (this.f9536a0 <= rect.width()) {
            float f = this.f9561p;
            float fMax = Math.max(0.0f, rect.left - f) + f;
            this.f9561p = fMax;
            this.f9561p = Math.min(0.0f, rect.right - (this.f9536a0 + fMax)) + fMax;
        }
        float f2 = this.f9551i;
        TextPaint textPaint2 = this.f9524P;
        textPaint2.setTextSize(f2);
        textPaint2.setTypeface(this.f9564s);
        textPaint2.setLetterSpacing(this.f9531W);
        if (textPaint2.descent() + (-textPaint2.ascent()) <= rect.height()) {
            float f3 = this.f9559n;
            float fMax2 = Math.max(0.0f, rect.top - f3) + f3;
            this.f9559n = fMax2;
            this.f9559n = Math.min(0.0f, rect.bottom - (m4320f() + fMax2)) + fMax2;
        }
        m4318d(0.0f, z);
        StaticLayout staticLayout = this.f9534Z;
        float height = staticLayout != null ? staticLayout.getHeight() : 0.0f;
        StaticLayout staticLayout2 = this.f9534Z;
        if (staticLayout2 == null || this.f9544e0 <= 1) {
            CharSequence charSequence3 = this.f9511C;
            fMeasureText = charSequence3 != null ? textPaint.measureText(charSequence3, 0, charSequence3.length()) : 0.0f;
        } else {
            fMeasureText = staticLayout2.getWidth();
        }
        StaticLayout staticLayout3 = this.f9534Z;
        this.f9557l = staticLayout3 != null ? staticLayout3.getLineCount() : 0;
        int absoluteGravity2 = Gravity.getAbsoluteGravity(this.f9545f, this.f9512D ? 1 : 0);
        int i3 = absoluteGravity2 & 112;
        Rect rect2 = this.f9539c;
        if (i3 == 48) {
            this.f9558m = rect2.top;
        } else if (i3 != 80) {
            this.f9558m = rect2.centerY() - (height / 2.0f);
        } else {
            this.f9558m = (rect2.bottom - height) + (this.f9556k0 ? textPaint.descent() : 0.0f);
        }
        int i4 = absoluteGravity2 & 8388615;
        if (i4 == 1) {
            this.f9560o = rect2.centerX() - (fMeasureText / 2.0f);
        } else if (i4 != 5) {
            this.f9560o = rect2.left;
        } else {
            this.f9560o = rect2.right - fMeasureText;
        }
        m4318d(this.f9537b, false);
        textInputLayout.postInvalidateOnAnimation();
        m4316b();
    }

    /* JADX INFO: renamed from: k */
    public final void m4324k(ColorStateList colorStateList) {
        if (this.f9555k == colorStateList && this.f9553j == colorStateList) {
            return;
        }
        this.f9555k = colorStateList;
        this.f9553j = colorStateList;
        m4323j(false);
    }

    /* JADX INFO: renamed from: l */
    public final boolean m4325l(Typeface typeface) {
        pm0 pm0Var = this.f9571z;
        if (pm0Var != null) {
            pm0Var.f56441c = true;
        }
        if (this.f9566u == typeface) {
            return false;
        }
        this.f9566u = typeface;
        Typeface typefaceM25095b = yda.m25095b(this.f9535a.getContext().getResources().getConfiguration(), typeface);
        this.f9565t = typefaceM25095b;
        if (typefaceM25095b == null) {
            typefaceM25095b = this.f9566u;
        }
        this.f9564s = typefaceM25095b;
        return true;
    }

    /* JADX INFO: renamed from: m */
    public final void m4326m(float f) {
        float fM21644w = AbstractC3584sr.m21644w(f, 0.0f, 1.0f);
        if (fM21644w != this.f9537b) {
            this.f9537b = fM21644w;
            m4316b();
        }
    }

    /* JADX INFO: renamed from: n */
    public final void m4327n(Typeface typeface) {
        boolean z;
        boolean zM4325l = m4325l(typeface);
        if (this.f9569x != typeface) {
            this.f9569x = typeface;
            Typeface typefaceM25095b = yda.m25095b(this.f9535a.getContext().getResources().getConfiguration(), typeface);
            this.f9568w = typefaceM25095b;
            if (typefaceM25095b == null) {
                typefaceM25095b = this.f9569x;
            }
            this.f9567v = typefaceM25095b;
            z = true;
        } else {
            z = false;
        }
        if (zM4325l || z) {
            m4323j(false);
        }
    }

    /* JADX INFO: renamed from: o */
    public final boolean m4328o() {
        return this.f9546f0 == 1;
    }
}
