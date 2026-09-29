package com.google.android.material.internal;

import android.animation.TimeInterpolator;
import android.content.res.ColorStateList;
import android.content.res.Configuration;
import android.graphics.Bitmap;
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
import android.view.View;
import android.view.animation.LinearInterpolator;
import androidx.activity.result.C0204c;
import java.util.WeakHashMap;
import p072dd.C5148a;
import p072dd.C5153f;
import p177ic.C6308a;
import p378s3.C8953b;
import p426v2.C9632f;
import p471x2.C10029b0;
import p471x2.C10049l0;

/* JADX INFO: renamed from: com.google.android.material.internal.a */
/* JADX INFO: loaded from: classes.dex */
public final class C3040a {

    /* JADX INFO: renamed from: A */
    public CharSequence f15358A;

    /* JADX INFO: renamed from: B */
    public CharSequence f15359B;

    /* JADX INFO: renamed from: C */
    public boolean f15360C;

    /* JADX INFO: renamed from: E */
    public Bitmap f15362E;

    /* JADX INFO: renamed from: F */
    public float f15363F;

    /* JADX INFO: renamed from: G */
    public float f15364G;

    /* JADX INFO: renamed from: H */
    public float f15365H;

    /* JADX INFO: renamed from: I */
    public float f15366I;

    /* JADX INFO: renamed from: J */
    public float f15367J;

    /* JADX INFO: renamed from: K */
    public int f15368K;

    /* JADX INFO: renamed from: L */
    public int[] f15369L;

    /* JADX INFO: renamed from: M */
    public boolean f15370M;

    /* JADX INFO: renamed from: N */
    public final TextPaint f15371N;

    /* JADX INFO: renamed from: O */
    public final TextPaint f15372O;

    /* JADX INFO: renamed from: P */
    public TimeInterpolator f15373P;

    /* JADX INFO: renamed from: Q */
    public TimeInterpolator f15374Q;

    /* JADX INFO: renamed from: R */
    public float f15375R;

    /* JADX INFO: renamed from: S */
    public float f15376S;

    /* JADX INFO: renamed from: T */
    public float f15377T;

    /* JADX INFO: renamed from: U */
    public ColorStateList f15378U;

    /* JADX INFO: renamed from: V */
    public float f15379V;

    /* JADX INFO: renamed from: W */
    public float f15380W;

    /* JADX INFO: renamed from: X */
    public float f15381X;

    /* JADX INFO: renamed from: Y */
    public StaticLayout f15382Y;

    /* JADX INFO: renamed from: Z */
    public float f15383Z;

    /* JADX INFO: renamed from: a */
    public final View f15384a;

    /* JADX INFO: renamed from: a0 */
    public float f15385a0;

    /* JADX INFO: renamed from: b */
    public float f15386b;

    /* JADX INFO: renamed from: b0 */
    public float f15387b0;

    /* JADX INFO: renamed from: c */
    public final Rect f15388c;

    /* JADX INFO: renamed from: c0 */
    public CharSequence f15389c0;

    /* JADX INFO: renamed from: d */
    public final Rect f15390d;

    /* JADX INFO: renamed from: e */
    public final RectF f15392e;

    /* JADX INFO: renamed from: j */
    public ColorStateList f15399j;

    /* JADX INFO: renamed from: k */
    public ColorStateList f15400k;

    /* JADX INFO: renamed from: l */
    public float f15401l;

    /* JADX INFO: renamed from: m */
    public float f15402m;

    /* JADX INFO: renamed from: n */
    public float f15403n;

    /* JADX INFO: renamed from: o */
    public float f15404o;

    /* JADX INFO: renamed from: p */
    public float f15405p;

    /* JADX INFO: renamed from: q */
    public float f15406q;

    /* JADX INFO: renamed from: r */
    public Typeface f15407r;

    /* JADX INFO: renamed from: s */
    public Typeface f15408s;

    /* JADX INFO: renamed from: t */
    public Typeface f15409t;

    /* JADX INFO: renamed from: u */
    public Typeface f15410u;

    /* JADX INFO: renamed from: v */
    public Typeface f15411v;

    /* JADX INFO: renamed from: w */
    public Typeface f15412w;

    /* JADX INFO: renamed from: x */
    public Typeface f15413x;

    /* JADX INFO: renamed from: y */
    public C5148a f15414y;

    /* JADX INFO: renamed from: f */
    public int f15394f = 16;

    /* JADX INFO: renamed from: g */
    public int f15396g = 16;

    /* JADX INFO: renamed from: h */
    public float f15397h = 15.0f;

    /* JADX INFO: renamed from: i */
    public float f15398i = 15.0f;

    /* JADX INFO: renamed from: z */
    public final TextUtils.TruncateAt f15415z = TextUtils.TruncateAt.END;

    /* JADX INFO: renamed from: D */
    public final boolean f15361D = true;

    /* JADX INFO: renamed from: d0 */
    public final int f15391d0 = 1;

    /* JADX INFO: renamed from: e0 */
    public final float f15393e0 = 1.0f;

    /* JADX INFO: renamed from: f0 */
    public final int f15395f0 = 1;

    public C3040a(View view) {
        this.f15384a = view;
        TextPaint textPaint = new TextPaint(129);
        this.f15371N = textPaint;
        this.f15372O = new TextPaint(textPaint);
        this.f15390d = new Rect();
        this.f15388c = new Rect();
        this.f15392e = new RectF();
        m8801g(view.getContext().getResources().getConfiguration());
    }

    /* JADX INFO: renamed from: a */
    public static int m8795a(float f3, int i10, int i11) {
        float f10 = 1.0f - f3;
        return Color.argb(Math.round((Color.alpha(i11) * f3) + (Color.alpha(i10) * f10)), Math.round((Color.red(i11) * f3) + (Color.red(i10) * f10)), Math.round((Color.green(i11) * f3) + (Color.green(i10) * f10)), Math.round((Color.blue(i11) * f3) + (Color.blue(i10) * f10)));
    }

    /* JADX INFO: renamed from: f */
    public static float m8796f(float f3, float f10, float f11, TimeInterpolator timeInterpolator) {
        if (timeInterpolator != null) {
            f11 = timeInterpolator.getInterpolation(f11);
        }
        LinearInterpolator linearInterpolator = C6308a.f36523a;
        return C0204c.m845d(f10, f3, f11, f3);
    }

    /* JADX INFO: renamed from: b */
    public final boolean m8797b(CharSequence charSequence) {
        WeakHashMap<View, C10049l0> weakHashMap = C10029b0.f50993a;
        boolean zM18108b = true;
        if (C10029b0.e.m18686d(this.f15384a) != 1) {
            zM18108b = false;
        }
        if (this.f15361D) {
            zM18108b = (zM18108b ? C9632f.f49324d : C9632f.f49323c).m18108b(charSequence, charSequence.length());
        }
        return zM18108b;
    }

    /* JADX INFO: renamed from: c */
    public final void m8798c(float f3, boolean z10) {
        float f10;
        float f11;
        Typeface typeface;
        boolean z11;
        StaticLayout staticLayoutM8794a;
        Layout.Alignment alignment;
        if (this.f15358A == null) {
            return;
        }
        float fWidth = this.f15390d.width();
        float fWidth2 = this.f15388c.width();
        if (Math.abs(f3 - 1.0f) < 1.0E-5f) {
            f10 = this.f15398i;
            f11 = this.f15379V;
            this.f15363F = 1.0f;
            typeface = this.f15407r;
        } else {
            float f12 = this.f15397h;
            float f13 = this.f15380W;
            Typeface typeface2 = this.f15410u;
            if (Math.abs(f3 - 0.0f) < 1.0E-5f) {
                this.f15363F = 1.0f;
            } else {
                this.f15363F = m8796f(this.f15397h, this.f15398i, f3, this.f15374Q) / this.f15397h;
            }
            float f14 = this.f15398i / this.f15397h;
            fWidth = (!z10 && fWidth2 * f14 > fWidth) ? Math.min(fWidth / f14, fWidth2) : fWidth2;
            f10 = f12;
            f11 = f13;
            typeface = typeface2;
        }
        TextPaint textPaint = this.f15371N;
        if (fWidth > 0.0f) {
            boolean z12 = this.f15364G != f10;
            boolean z13 = this.f15381X != f11;
            boolean z14 = this.f15413x != typeface;
            StaticLayout staticLayout = this.f15382Y;
            boolean z15 = z12 || z13 || (staticLayout != null && (fWidth > ((float) staticLayout.getWidth()) ? 1 : (fWidth == ((float) staticLayout.getWidth()) ? 0 : -1)) != 0) || z14 || this.f15370M;
            this.f15364G = f10;
            this.f15381X = f11;
            this.f15413x = typeface;
            this.f15370M = false;
            textPaint.setLinearText(this.f15363F != 1.0f);
            z11 = z15;
        } else {
            z11 = false;
        }
        if (this.f15359B != null && !z11) {
            return;
        }
        textPaint.setTextSize(this.f15364G);
        textPaint.setTypeface(this.f15413x);
        textPaint.setLetterSpacing(this.f15381X);
        boolean zM8797b = m8797b(this.f15358A);
        this.f15360C = zM8797b;
        int i10 = this.f15391d0;
        if (!(i10 > 1 && !zM8797b)) {
            i10 = 1;
        }
        try {
            if (i10 == 1) {
                alignment = Layout.Alignment.ALIGN_NORMAL;
            } else {
                int absoluteGravity = Gravity.getAbsoluteGravity(this.f15394f, zM8797b ? 1 : 0) & 7;
                if (absoluteGravity == 1) {
                    alignment = Layout.Alignment.ALIGN_CENTER;
                } else if (absoluteGravity != 5) {
                    alignment = this.f15360C ? Layout.Alignment.ALIGN_OPPOSITE : Layout.Alignment.ALIGN_NORMAL;
                } else {
                    alignment = this.f15360C ? Layout.Alignment.ALIGN_NORMAL : Layout.Alignment.ALIGN_OPPOSITE;
                }
            }
            StaticLayoutBuilderCompat staticLayoutBuilderCompat = new StaticLayoutBuilderCompat(this.f15358A, textPaint, (int) fWidth);
            staticLayoutBuilderCompat.f15356l = this.f15415z;
            staticLayoutBuilderCompat.f15355k = zM8797b;
            staticLayoutBuilderCompat.f15349e = alignment;
            staticLayoutBuilderCompat.f15354j = false;
            staticLayoutBuilderCompat.f15350f = i10;
            float f15 = this.f15393e0;
            staticLayoutBuilderCompat.f15351g = 0.0f;
            staticLayoutBuilderCompat.f15352h = f15;
            staticLayoutBuilderCompat.f15353i = this.f15395f0;
            staticLayoutM8794a = staticLayoutBuilderCompat.m8794a();
        } catch (StaticLayoutBuilderCompat.StaticLayoutBuilderCompatException e10) {
            Log.e("CollapsingTextHelper", e10.getCause().getMessage(), e10);
            staticLayoutM8794a = null;
        }
        staticLayoutM8794a.getClass();
        this.f15382Y = staticLayoutM8794a;
        this.f15359B = staticLayoutM8794a.getText();
    }

    /* JADX INFO: renamed from: d */
    public final float m8799d() {
        TextPaint textPaint = this.f15372O;
        textPaint.setTextSize(this.f15398i);
        textPaint.setTypeface(this.f15407r);
        textPaint.setLetterSpacing(this.f15379V);
        return -textPaint.ascent();
    }

    /* JADX INFO: renamed from: e */
    public final int m8800e(ColorStateList colorStateList) {
        if (colorStateList == null) {
            return 0;
        }
        int[] iArr = this.f15369L;
        return iArr != null ? colorStateList.getColorForState(iArr, 0) : colorStateList.getDefaultColor();
    }

    /* JADX INFO: renamed from: g */
    public final void m8801g(Configuration configuration) {
        if (Build.VERSION.SDK_INT >= 31) {
            Typeface typeface = this.f15409t;
            if (typeface != null) {
                this.f15408s = C5153f.m10937a(configuration, typeface);
            }
            Typeface typeface2 = this.f15412w;
            if (typeface2 != null) {
                this.f15411v = C5153f.m10937a(configuration, typeface2);
            }
            Typeface typeface3 = this.f15408s;
            if (typeface3 == null) {
                typeface3 = this.f15409t;
            }
            this.f15407r = typeface3;
            Typeface typeface4 = this.f15411v;
            if (typeface4 == null) {
                typeface4 = this.f15412w;
            }
            this.f15410u = typeface4;
            m8802h(true);
        }
    }

    /* JADX INFO: renamed from: h */
    public final void m8802h(boolean z10) {
        float fMeasureText;
        StaticLayout staticLayout;
        View view = this.f15384a;
        if ((view.getHeight() <= 0 || view.getWidth() <= 0) && !z10) {
            return;
        }
        m8798c(1.0f, z10);
        CharSequence charSequence = this.f15359B;
        TextPaint textPaint = this.f15371N;
        if (charSequence != null && (staticLayout = this.f15382Y) != null) {
            this.f15389c0 = TextUtils.ellipsize(charSequence, textPaint, staticLayout.getWidth(), this.f15415z);
        }
        CharSequence charSequence2 = this.f15389c0;
        if (charSequence2 != null) {
            this.f15383Z = textPaint.measureText(charSequence2, 0, charSequence2.length());
        } else {
            this.f15383Z = 0.0f;
        }
        int absoluteGravity = Gravity.getAbsoluteGravity(this.f15396g, this.f15360C ? 1 : 0);
        int i10 = absoluteGravity & 112;
        Rect rect = this.f15390d;
        if (i10 == 48) {
            this.f15402m = rect.top;
        } else if (i10 != 80) {
            this.f15402m = rect.centerY() - ((textPaint.descent() - textPaint.ascent()) / 2.0f);
        } else {
            this.f15402m = textPaint.ascent() + rect.bottom;
        }
        int i11 = absoluteGravity & 8388615;
        if (i11 == 1) {
            this.f15404o = rect.centerX() - (this.f15383Z / 2.0f);
        } else if (i11 != 5) {
            this.f15404o = rect.left;
        } else {
            this.f15404o = rect.right - this.f15383Z;
        }
        m8798c(0.0f, z10);
        StaticLayout staticLayout2 = this.f15382Y;
        float height = staticLayout2 != null ? staticLayout2.getHeight() : 0.0f;
        StaticLayout staticLayout3 = this.f15382Y;
        if (staticLayout3 == null || this.f15391d0 <= 1) {
            CharSequence charSequence3 = this.f15359B;
            fMeasureText = charSequence3 != null ? textPaint.measureText(charSequence3, 0, charSequence3.length()) : 0.0f;
        } else {
            fMeasureText = staticLayout3.getWidth();
        }
        StaticLayout staticLayout4 = this.f15382Y;
        if (staticLayout4 != null) {
            staticLayout4.getLineCount();
        }
        int absoluteGravity2 = Gravity.getAbsoluteGravity(this.f15394f, this.f15360C ? 1 : 0);
        int i12 = absoluteGravity2 & 112;
        Rect rect2 = this.f15388c;
        if (i12 == 48) {
            this.f15401l = rect2.top;
        } else if (i12 != 80) {
            this.f15401l = rect2.centerY() - (height / 2.0f);
        } else {
            this.f15401l = textPaint.descent() + (rect2.bottom - height);
        }
        int i13 = absoluteGravity2 & 8388615;
        if (i13 == 1) {
            this.f15403n = rect2.centerX() - (fMeasureText / 2.0f);
        } else if (i13 != 5) {
            this.f15403n = rect2.left;
        } else {
            this.f15403n = rect2.right - fMeasureText;
        }
        Bitmap bitmap = this.f15362E;
        if (bitmap != null) {
            bitmap.recycle();
            this.f15362E = null;
        }
        m8806l(this.f15386b);
        float f3 = this.f15386b;
        float fM8796f = m8796f(rect2.left, rect.left, f3, this.f15373P);
        RectF rectF = this.f15392e;
        rectF.left = fM8796f;
        rectF.top = m8796f(this.f15401l, this.f15402m, f3, this.f15373P);
        rectF.right = m8796f(rect2.right, rect.right, f3, this.f15373P);
        rectF.bottom = m8796f(rect2.bottom, rect.bottom, f3, this.f15373P);
        this.f15405p = m8796f(this.f15403n, this.f15404o, f3, this.f15373P);
        this.f15406q = m8796f(this.f15401l, this.f15402m, f3, this.f15373P);
        m8806l(f3);
        C8953b c8953b = C6308a.f36524b;
        this.f15385a0 = 1.0f - m8796f(0.0f, 1.0f, 1.0f - f3, c8953b);
        WeakHashMap<View, C10049l0> weakHashMap = C10029b0.f50993a;
        C10029b0.d.m18674k(view);
        this.f15387b0 = m8796f(1.0f, 0.0f, f3, c8953b);
        C10029b0.d.m18674k(view);
        ColorStateList colorStateList = this.f15400k;
        ColorStateList colorStateList2 = this.f15399j;
        if (colorStateList != colorStateList2) {
            textPaint.setColor(m8795a(f3, m8800e(colorStateList2), m8800e(this.f15400k)));
        } else {
            textPaint.setColor(m8800e(colorStateList));
        }
        float f10 = this.f15379V;
        float f11 = this.f15380W;
        if (f10 != f11) {
            textPaint.setLetterSpacing(m8796f(f11, f10, f3, c8953b));
        } else {
            textPaint.setLetterSpacing(f10);
        }
        this.f15365H = m8796f(0.0f, this.f15375R, f3, null);
        this.f15366I = m8796f(0.0f, this.f15376S, f3, null);
        this.f15367J = m8796f(0.0f, this.f15377T, f3, null);
        int iM8795a = m8795a(f3, m8800e(null), m8800e(this.f15378U));
        this.f15368K = iM8795a;
        textPaint.setShadowLayer(this.f15365H, this.f15366I, this.f15367J, iM8795a);
        C10029b0.d.m18674k(view);
    }

    /* JADX INFO: renamed from: i */
    public final void m8803i(ColorStateList colorStateList) {
        if (this.f15400k == colorStateList && this.f15399j == colorStateList) {
            return;
        }
        this.f15400k = colorStateList;
        this.f15399j = colorStateList;
        m8802h(false);
    }

    /* JADX INFO: renamed from: j */
    public final boolean m8804j(Typeface typeface) {
        C5148a c5148a = this.f15414y;
        if (c5148a != null) {
            c5148a.f33126c = true;
        }
        if (this.f15409t == typeface) {
            return false;
        }
        this.f15409t = typeface;
        Typeface typefaceM10937a = C5153f.m10937a(this.f15384a.getContext().getResources().getConfiguration(), typeface);
        this.f15408s = typefaceM10937a;
        if (typefaceM10937a == null) {
            typefaceM10937a = this.f15409t;
        }
        this.f15407r = typefaceM10937a;
        return true;
    }

    /* JADX INFO: renamed from: k */
    public final void m8805k(float f3) {
        if (f3 < 0.0f) {
            f3 = 0.0f;
        } else if (f3 > 1.0f) {
            f3 = 1.0f;
        }
        if (f3 != this.f15386b) {
            this.f15386b = f3;
            Rect rect = this.f15388c;
            float f10 = rect.left;
            Rect rect2 = this.f15390d;
            float fM8796f = m8796f(f10, rect2.left, f3, this.f15373P);
            RectF rectF = this.f15392e;
            rectF.left = fM8796f;
            rectF.top = m8796f(this.f15401l, this.f15402m, f3, this.f15373P);
            rectF.right = m8796f(rect.right, rect2.right, f3, this.f15373P);
            rectF.bottom = m8796f(rect.bottom, rect2.bottom, f3, this.f15373P);
            this.f15405p = m8796f(this.f15403n, this.f15404o, f3, this.f15373P);
            this.f15406q = m8796f(this.f15401l, this.f15402m, f3, this.f15373P);
            m8806l(f3);
            C8953b c8953b = C6308a.f36524b;
            this.f15385a0 = 1.0f - m8796f(0.0f, 1.0f, 1.0f - f3, c8953b);
            WeakHashMap<View, C10049l0> weakHashMap = C10029b0.f50993a;
            View view = this.f15384a;
            C10029b0.d.m18674k(view);
            this.f15387b0 = m8796f(1.0f, 0.0f, f3, c8953b);
            C10029b0.d.m18674k(view);
            ColorStateList colorStateList = this.f15400k;
            ColorStateList colorStateList2 = this.f15399j;
            TextPaint textPaint = this.f15371N;
            if (colorStateList != colorStateList2) {
                textPaint.setColor(m8795a(f3, m8800e(colorStateList2), m8800e(this.f15400k)));
            } else {
                textPaint.setColor(m8800e(colorStateList));
            }
            float f11 = this.f15379V;
            float f12 = this.f15380W;
            if (f11 != f12) {
                textPaint.setLetterSpacing(m8796f(f12, f11, f3, c8953b));
            } else {
                textPaint.setLetterSpacing(f11);
            }
            this.f15365H = m8796f(0.0f, this.f15375R, f3, null);
            this.f15366I = m8796f(0.0f, this.f15376S, f3, null);
            this.f15367J = m8796f(0.0f, this.f15377T, f3, null);
            int iM8795a = m8795a(f3, m8800e(null), m8800e(this.f15378U));
            this.f15368K = iM8795a;
            textPaint.setShadowLayer(this.f15365H, this.f15366I, this.f15367J, iM8795a);
            C10029b0.d.m18674k(view);
        }
    }

    /* JADX INFO: renamed from: l */
    public final void m8806l(float f3) {
        m8798c(f3, false);
        WeakHashMap<View, C10049l0> weakHashMap = C10029b0.f50993a;
        C10029b0.d.m18674k(this.f15384a);
    }

    /* JADX INFO: renamed from: m */
    public final void m8807m(Typeface typeface) {
        boolean z10;
        boolean zM8804j = m8804j(typeface);
        if (this.f15412w != typeface) {
            this.f15412w = typeface;
            Typeface typefaceM10937a = C5153f.m10937a(this.f15384a.getContext().getResources().getConfiguration(), typeface);
            this.f15411v = typefaceM10937a;
            if (typefaceM10937a == null) {
                typefaceM10937a = this.f15412w;
            }
            this.f15410u = typefaceM10937a;
            z10 = true;
        } else {
            z10 = false;
        }
        if (zM8804j || z10) {
            m8802h(false);
        }
    }
}
