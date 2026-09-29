package com.google.android.material.chip;

import android.R;
import android.annotation.TargetApi;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Outline;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PointF;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.RippleDrawable;
import android.graphics.drawable.ShapeDrawable;
import android.graphics.drawable.shapes.OvalShape;
import android.text.SpannableStringBuilder;
import android.text.TextPaint;
import android.text.TextUtils;
import android.util.AttributeSet;
import gd.C5768g;
import gd.C5773l;
import java.lang.ref.WeakReference;
import java.util.Arrays;
import p072dd.C5151d;
import p093ed.C5397a;
import p177ic.C6314g;
import p312p2.C8169a;
import p329q2.C8488a;
import p329q2.InterfaceC8491d;
import p507yc.C10341h;
import p507yc.C10347n;

/* JADX INFO: renamed from: com.google.android.material.chip.a */
/* JADX INFO: loaded from: classes.dex */
public final class C2988a extends C5768g implements Drawable.Callback, C10341h.b {

    /* JADX INFO: renamed from: b1 */
    public static final int[] f15033b1 = {R.attr.state_enabled};

    /* JADX INFO: renamed from: c1 */
    public static final ShapeDrawable f15034c1 = new ShapeDrawable(new OvalShape());

    /* JADX INFO: renamed from: A0 */
    public final Paint f15035A0;

    /* JADX INFO: renamed from: B0 */
    public final Paint.FontMetrics f15036B0;

    /* JADX INFO: renamed from: C0 */
    public final RectF f15037C0;

    /* JADX INFO: renamed from: D0 */
    public final PointF f15038D0;

    /* JADX INFO: renamed from: E0 */
    public final Path f15039E0;

    /* JADX INFO: renamed from: F0 */
    public final C10341h f15040F0;

    /* JADX INFO: renamed from: G0 */
    public int f15041G0;

    /* JADX INFO: renamed from: H0 */
    public int f15042H0;

    /* JADX INFO: renamed from: I0 */
    public int f15043I0;

    /* JADX INFO: renamed from: J0 */
    public int f15044J0;

    /* JADX INFO: renamed from: K0 */
    public int f15045K0;

    /* JADX INFO: renamed from: L0 */
    public int f15046L0;

    /* JADX INFO: renamed from: M0 */
    public boolean f15047M0;

    /* JADX INFO: renamed from: N0 */
    public int f15048N0;

    /* JADX INFO: renamed from: O0 */
    public int f15049O0;

    /* JADX INFO: renamed from: P0 */
    public ColorFilter f15050P0;

    /* JADX INFO: renamed from: Q0 */
    public PorterDuffColorFilter f15051Q0;

    /* JADX INFO: renamed from: R0 */
    public ColorStateList f15052R0;

    /* JADX INFO: renamed from: S */
    public ColorStateList f15053S;

    /* JADX INFO: renamed from: S0 */
    public PorterDuff.Mode f15054S0;

    /* JADX INFO: renamed from: T */
    public ColorStateList f15055T;

    /* JADX INFO: renamed from: T0 */
    public int[] f15056T0;

    /* JADX INFO: renamed from: U */
    public float f15057U;

    /* JADX INFO: renamed from: U0 */
    public boolean f15058U0;

    /* JADX INFO: renamed from: V */
    public float f15059V;

    /* JADX INFO: renamed from: V0 */
    public ColorStateList f15060V0;

    /* JADX INFO: renamed from: W */
    public ColorStateList f15061W;

    /* JADX INFO: renamed from: W0 */
    public WeakReference<a> f15062W0;

    /* JADX INFO: renamed from: X */
    public float f15063X;

    /* JADX INFO: renamed from: X0 */
    public TextUtils.TruncateAt f15064X0;

    /* JADX INFO: renamed from: Y */
    public ColorStateList f15065Y;

    /* JADX INFO: renamed from: Y0 */
    public boolean f15066Y0;

    /* JADX INFO: renamed from: Z */
    public CharSequence f15067Z;

    /* JADX INFO: renamed from: Z0 */
    public int f15068Z0;

    /* JADX INFO: renamed from: a0 */
    public boolean f15069a0;

    /* JADX INFO: renamed from: a1 */
    public boolean f15070a1;

    /* JADX INFO: renamed from: b0 */
    public Drawable f15071b0;

    /* JADX INFO: renamed from: c0 */
    public ColorStateList f15072c0;

    /* JADX INFO: renamed from: d0 */
    public float f15073d0;

    /* JADX INFO: renamed from: e0 */
    public boolean f15074e0;

    /* JADX INFO: renamed from: f0 */
    public boolean f15075f0;

    /* JADX INFO: renamed from: g0 */
    public Drawable f15076g0;

    /* JADX INFO: renamed from: h0 */
    public RippleDrawable f15077h0;

    /* JADX INFO: renamed from: i0 */
    public ColorStateList f15078i0;

    /* JADX INFO: renamed from: j0 */
    public float f15079j0;

    /* JADX INFO: renamed from: k0 */
    public SpannableStringBuilder f15080k0;

    /* JADX INFO: renamed from: l0 */
    public boolean f15081l0;

    /* JADX INFO: renamed from: m0 */
    public boolean f15082m0;

    /* JADX INFO: renamed from: n0 */
    public Drawable f15083n0;

    /* JADX INFO: renamed from: o0 */
    public ColorStateList f15084o0;

    /* JADX INFO: renamed from: p0 */
    public C6314g f15085p0;

    /* JADX INFO: renamed from: q0 */
    public C6314g f15086q0;

    /* JADX INFO: renamed from: r0 */
    public float f15087r0;

    /* JADX INFO: renamed from: s0 */
    public float f15088s0;

    /* JADX INFO: renamed from: t0 */
    public float f15089t0;

    /* JADX INFO: renamed from: u0 */
    public float f15090u0;

    /* JADX INFO: renamed from: v0 */
    public float f15091v0;

    /* JADX INFO: renamed from: w0 */
    public float f15092w0;

    /* JADX INFO: renamed from: x0 */
    public float f15093x0;

    /* JADX INFO: renamed from: y0 */
    public float f15094y0;

    /* JADX INFO: renamed from: z0 */
    public final Context f15095z0;

    /* JADX INFO: renamed from: com.google.android.material.chip.a$a */
    public interface a {
        /* JADX INFO: renamed from: a */
        void mo8673a();
    }

    public C2988a(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, com.linguist.R.attr.chipStyle, com.linguist.R.style.Widget_MaterialComponents_Chip_Action);
        this.f15059V = -1.0f;
        this.f15035A0 = new Paint(1);
        this.f15036B0 = new Paint.FontMetrics();
        this.f15037C0 = new RectF();
        this.f15038D0 = new PointF();
        this.f15039E0 = new Path();
        this.f15049O0 = 255;
        this.f15054S0 = PorterDuff.Mode.SRC_IN;
        this.f15062W0 = new WeakReference<>(null);
        m12138j(context);
        this.f15095z0 = context;
        C10341h c10341h = new C10341h(this);
        this.f15040F0 = c10341h;
        this.f15067Z = "";
        c10341h.f52039a.density = context.getResources().getDisplayMetrics().density;
        int[] iArr = f15033b1;
        setState(iArr);
        if (!Arrays.equals(this.f15056T0, iArr)) {
            this.f15056T0 = iArr;
            if (m8713Z()) {
                m8690C(getState(), iArr);
            }
        }
        this.f15066Y0 = true;
        int[] iArr2 = C5397a.f33812a;
        f15034c1.setTint(-1);
    }

    /* JADX INFO: renamed from: A */
    public static boolean m8686A(Drawable drawable) {
        return drawable != null && drawable.isStateful();
    }

    /* JADX INFO: renamed from: a0 */
    public static void m8687a0(Drawable drawable) {
        if (drawable != null) {
            drawable.setCallback(null);
        }
    }

    /* JADX INFO: renamed from: z */
    public static boolean m8688z(ColorStateList colorStateList) {
        return colorStateList != null && colorStateList.isStateful();
    }

    /* JADX INFO: renamed from: B */
    public final void m8689B() {
        a aVar = this.f15062W0.get();
        if (aVar != null) {
            aVar.mo8673a();
        }
    }

    /* JADX INFO: renamed from: C */
    public final boolean m8690C(int[] iArr, int[] iArr2) {
        boolean z10;
        boolean z11;
        ColorStateList colorStateList;
        boolean zOnStateChange = super.onStateChange(iArr);
        ColorStateList colorStateList2 = this.f15053S;
        int iM12132d = m12132d(colorStateList2 != null ? colorStateList2.getColorForState(iArr, this.f15041G0) : 0);
        boolean state = true;
        if (this.f15041G0 != iM12132d) {
            this.f15041G0 = iM12132d;
            zOnStateChange = true;
        }
        ColorStateList colorStateList3 = this.f15055T;
        int iM12132d2 = m12132d(colorStateList3 != null ? colorStateList3.getColorForState(iArr, this.f15042H0) : 0);
        if (this.f15042H0 != iM12132d2) {
            this.f15042H0 = iM12132d2;
            zOnStateChange = true;
        }
        int iM16215g = C8169a.m16215g(iM12132d2, iM12132d);
        if ((this.f15043I0 != iM16215g) | (this.f34857a.f34872c == null)) {
            this.f15043I0 = iM16215g;
            m12141m(ColorStateList.valueOf(iM16215g));
            zOnStateChange = true;
        }
        ColorStateList colorStateList4 = this.f15061W;
        int colorForState = colorStateList4 != null ? colorStateList4.getColorForState(iArr, this.f15044J0) : 0;
        if (this.f15044J0 != colorForState) {
            this.f15044J0 = colorForState;
            zOnStateChange = true;
        }
        int colorForState2 = (this.f15060V0 == null || !C5397a.m11562d(iArr)) ? 0 : this.f15060V0.getColorForState(iArr, this.f15045K0);
        if (this.f15045K0 != colorForState2) {
            this.f15045K0 = colorForState2;
            if (this.f15058U0) {
                zOnStateChange = true;
            }
        }
        C5151d c5151d = this.f15040F0.f52044f;
        int colorForState3 = (c5151d == null || (colorStateList = c5151d.f33136j) == null) ? 0 : colorStateList.getColorForState(iArr, this.f15046L0);
        if (this.f15046L0 != colorForState3) {
            this.f15046L0 = colorForState3;
            zOnStateChange = true;
        }
        int[] state2 = getState();
        if (state2 != null) {
            int length = state2.length;
            int i10 = 0;
            while (true) {
                if (i10 >= length) {
                    z10 = false;
                    break;
                }
                if (state2[i10] == 16842912) {
                    z10 = true;
                    break;
                }
                i10++;
            }
        } else {
            z10 = false;
            break;
        }
        boolean z12 = z10 && this.f15081l0;
        if (this.f15047M0 == z12 || this.f15083n0 == null) {
            z11 = false;
        } else {
            float fM8716w = m8716w();
            this.f15047M0 = z12;
            if (fM8716w != m8716w()) {
                zOnStateChange = true;
                z11 = true;
            } else {
                z11 = false;
                zOnStateChange = true;
            }
        }
        ColorStateList colorStateList5 = this.f15052R0;
        int colorForState4 = colorStateList5 != null ? colorStateList5.getColorForState(iArr, this.f15048N0) : 0;
        if (this.f15048N0 != colorForState4) {
            this.f15048N0 = colorForState4;
            ColorStateList colorStateList6 = this.f15052R0;
            PorterDuff.Mode mode = this.f15054S0;
            this.f15051Q0 = (colorStateList6 == null || mode == null) ? null : new PorterDuffColorFilter(colorStateList6.getColorForState(getState(), 0), mode);
        } else {
            state = zOnStateChange;
        }
        if (m8686A(this.f15071b0)) {
            state |= this.f15071b0.setState(iArr);
        }
        if (m8686A(this.f15083n0)) {
            state |= this.f15083n0.setState(iArr);
        }
        if (m8686A(this.f15076g0)) {
            int[] iArr3 = new int[iArr.length + iArr2.length];
            System.arraycopy(iArr, 0, iArr3, 0, iArr.length);
            System.arraycopy(iArr2, 0, iArr3, iArr.length, iArr2.length);
            state |= this.f15076g0.setState(iArr3);
        }
        int[] iArr4 = C5397a.f33812a;
        if (m8686A(this.f15077h0)) {
            state |= this.f15077h0.setState(iArr2);
        }
        if (state) {
            invalidateSelf();
        }
        if (z11) {
            m8689B();
        }
        return state;
    }

    /* JADX INFO: renamed from: D */
    public final void m8691D(boolean z10) {
        if (this.f15081l0 != z10) {
            this.f15081l0 = z10;
            float fM8716w = m8716w();
            if (!z10 && this.f15047M0) {
                this.f15047M0 = false;
            }
            float fM8716w2 = m8716w();
            invalidateSelf();
            if (fM8716w != fM8716w2) {
                m8689B();
            }
        }
    }

    /* JADX INFO: renamed from: E */
    public final void m8692E(Drawable drawable) {
        if (this.f15083n0 != drawable) {
            float fM8716w = m8716w();
            this.f15083n0 = drawable;
            float fM8716w2 = m8716w();
            m8687a0(this.f15083n0);
            m8714u(this.f15083n0);
            invalidateSelf();
            if (fM8716w != fM8716w2) {
                m8689B();
            }
        }
    }

    /* JADX INFO: renamed from: F */
    public final void m8693F(ColorStateList colorStateList) {
        if (this.f15084o0 != colorStateList) {
            this.f15084o0 = colorStateList;
            if (this.f15082m0 && this.f15083n0 != null && this.f15081l0) {
                C8488a.b.m16570h(this.f15083n0, colorStateList);
            }
            onStateChange(getState());
        }
    }

    /* JADX INFO: renamed from: G */
    public final void m8694G(boolean z10) {
        if (this.f15082m0 != z10) {
            boolean zM8711X = m8711X();
            this.f15082m0 = z10;
            boolean zM8711X2 = m8711X();
            if (zM8711X != zM8711X2) {
                if (zM8711X2) {
                    m8714u(this.f15083n0);
                } else {
                    m8687a0(this.f15083n0);
                }
                invalidateSelf();
                m8689B();
            }
        }
    }

    @Deprecated
    /* JADX INFO: renamed from: H */
    public final void m8695H(float f3) {
        if (this.f15059V != f3) {
            this.f15059V = f3;
            setShapeAppearanceModel(this.f34857a.f34870a.m12153e(f3));
        }
    }

    /* JADX WARN: Code duplicated, block: B:10:0x001a  */
    /* JADX WARN: Code duplicated, block: B:12:0x0020  */
    /* JADX WARN: Code duplicated, block: B:15:0x0037  */
    /* JADX WARN: Code duplicated, block: B:18:0x0044  */
    /* JADX WARN: Code duplicated, block: B:20:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:21:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v3, types: [android.graphics.drawable.Drawable] */
    /* JADX WARN: Type inference failed for: r0v7 */
    /* JADX WARN: Type inference failed for: r0v8 */
    /* JADX INFO: renamed from: I */
    public final void m8696I(Drawable drawable) {
        Object obj;
        ?? M16578b;
        float fM8716w;
        float fM8716w2;
        Object obj2 = this.f15071b0;
        Drawable drawableMutate = null;
        if (obj2 != null) {
            if (obj2 instanceof InterfaceC8491d) {
                M16578b = ((InterfaceC8491d) obj2).m16578b();
            }
            if (M16578b != drawable) {
                obj = obj2;
                return;
            }
            fM8716w = m8716w();
            if (drawable != null) {
                obj = obj2;
                drawableMutate = drawable.mutate();
            }
            obj = obj2;
            this.f15071b0 = drawableMutate;
            fM8716w2 = m8716w();
            m8687a0(M16578b);
            if (m8712Y()) {
                m8714u(this.f15071b0);
            }
            invalidateSelf();
            if (fM8716w != fM8716w2) {
                m8689B();
            }
        }
        obj = null;
        obj = obj2;
        M16578b = obj;
        if (M16578b != drawable) {
            obj = obj2;
            return;
        }
        fM8716w = m8716w();
        if (drawable != null) {
            obj = obj2;
            drawableMutate = drawable.mutate();
        }
        obj = obj2;
        this.f15071b0 = drawableMutate;
        fM8716w2 = m8716w();
        m8687a0(M16578b);
        if (m8712Y()) {
            m8714u(this.f15071b0);
        }
        invalidateSelf();
        if (fM8716w != fM8716w2) {
            m8689B();
        }
    }

    /* JADX INFO: renamed from: J */
    public final void m8697J(float f3) {
        if (this.f15073d0 != f3) {
            float fM8716w = m8716w();
            this.f15073d0 = f3;
            float fM8716w2 = m8716w();
            invalidateSelf();
            if (fM8716w != fM8716w2) {
                m8689B();
            }
        }
    }

    /* JADX INFO: renamed from: K */
    public final void m8698K(ColorStateList colorStateList) {
        this.f15074e0 = true;
        if (this.f15072c0 != colorStateList) {
            this.f15072c0 = colorStateList;
            if (m8712Y()) {
                C8488a.b.m16570h(this.f15071b0, colorStateList);
            }
            onStateChange(getState());
        }
    }

    /* JADX INFO: renamed from: L */
    public final void m8699L(boolean z10) {
        if (this.f15069a0 != z10) {
            boolean zM8712Y = m8712Y();
            this.f15069a0 = z10;
            boolean zM8712Y2 = m8712Y();
            if (zM8712Y != zM8712Y2) {
                if (zM8712Y2) {
                    m8714u(this.f15071b0);
                } else {
                    m8687a0(this.f15071b0);
                }
                invalidateSelf();
                m8689B();
            }
        }
    }

    /* JADX INFO: renamed from: M */
    public final void m8700M(ColorStateList colorStateList) {
        if (this.f15061W != colorStateList) {
            this.f15061W = colorStateList;
            if (this.f15070a1) {
                m12145q(colorStateList);
            }
            onStateChange(getState());
        }
    }

    /* JADX INFO: renamed from: N */
    public final void m8701N(float f3) {
        if (this.f15063X != f3) {
            this.f15063X = f3;
            this.f15035A0.setStrokeWidth(f3);
            if (this.f15070a1) {
                this.f34857a.f34880k = f3;
                invalidateSelf();
            }
            invalidateSelf();
        }
    }

    /* JADX WARN: Code duplicated, block: B:10:0x001b  */
    /* JADX WARN: Code duplicated, block: B:12:0x0022  */
    /* JADX WARN: Code duplicated, block: B:15:0x004d  */
    /* JADX WARN: Code duplicated, block: B:18:0x005d  */
    /* JADX WARN: Code duplicated, block: B:20:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:21:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v3, types: [android.graphics.drawable.Drawable] */
    /* JADX WARN: Type inference failed for: r0v7 */
    /* JADX WARN: Type inference failed for: r0v8 */
    /* JADX INFO: renamed from: O */
    public final void m8702O(Drawable drawable) {
        Object obj;
        ?? M16578b;
        float fM8717x;
        float fM8717x2;
        Object obj2 = this.f15076g0;
        Drawable drawableMutate = null;
        if (obj2 != null) {
            if (obj2 instanceof InterfaceC8491d) {
                M16578b = ((InterfaceC8491d) obj2).m16578b();
            }
            if (M16578b != drawable) {
                obj = obj2;
                return;
            }
            fM8717x = m8717x();
            if (drawable != null) {
                obj = obj2;
                drawableMutate = drawable.mutate();
            }
            obj = obj2;
            this.f15076g0 = drawableMutate;
            int[] iArr = C5397a.f33812a;
            this.f15077h0 = new RippleDrawable(C5397a.m11561c(this.f15065Y), this.f15076g0, f15034c1);
            fM8717x2 = m8717x();
            m8687a0(M16578b);
            if (m8713Z()) {
                m8714u(this.f15076g0);
            }
            invalidateSelf();
            if (fM8717x != fM8717x2) {
                m8689B();
            }
        }
        obj = null;
        obj = obj2;
        M16578b = obj;
        if (M16578b != drawable) {
            obj = obj2;
            return;
        }
        fM8717x = m8717x();
        if (drawable != null) {
            obj = obj2;
            drawableMutate = drawable.mutate();
        }
        obj = obj2;
        this.f15076g0 = drawableMutate;
        int[] iArr2 = C5397a.f33812a;
        this.f15077h0 = new RippleDrawable(C5397a.m11561c(this.f15065Y), this.f15076g0, f15034c1);
        fM8717x2 = m8717x();
        m8687a0(M16578b);
        if (m8713Z()) {
            m8714u(this.f15076g0);
        }
        invalidateSelf();
        if (fM8717x != fM8717x2) {
            m8689B();
        }
    }

    /* JADX INFO: renamed from: P */
    public final void m8703P(float f3) {
        if (this.f15093x0 != f3) {
            this.f15093x0 = f3;
            invalidateSelf();
            if (m8713Z()) {
                m8689B();
            }
        }
    }

    /* JADX INFO: renamed from: Q */
    public final void m8704Q(float f3) {
        if (this.f15079j0 != f3) {
            this.f15079j0 = f3;
            invalidateSelf();
            if (m8713Z()) {
                m8689B();
            }
        }
    }

    /* JADX INFO: renamed from: R */
    public final void m8705R(float f3) {
        if (this.f15092w0 != f3) {
            this.f15092w0 = f3;
            invalidateSelf();
            if (m8713Z()) {
                m8689B();
            }
        }
    }

    /* JADX INFO: renamed from: S */
    public final void m8706S(ColorStateList colorStateList) {
        if (this.f15078i0 != colorStateList) {
            this.f15078i0 = colorStateList;
            if (m8713Z()) {
                C8488a.b.m16570h(this.f15076g0, colorStateList);
            }
            onStateChange(getState());
        }
    }

    /* JADX INFO: renamed from: T */
    public final void m8707T(boolean z10) {
        if (this.f15075f0 != z10) {
            boolean zM8713Z = m8713Z();
            this.f15075f0 = z10;
            boolean zM8713Z2 = m8713Z();
            if (zM8713Z != zM8713Z2) {
                if (zM8713Z2) {
                    m8714u(this.f15076g0);
                } else {
                    m8687a0(this.f15076g0);
                }
                invalidateSelf();
                m8689B();
            }
        }
    }

    /* JADX INFO: renamed from: U */
    public final void m8708U(float f3) {
        if (this.f15089t0 != f3) {
            float fM8716w = m8716w();
            this.f15089t0 = f3;
            float fM8716w2 = m8716w();
            invalidateSelf();
            if (fM8716w != fM8716w2) {
                m8689B();
            }
        }
    }

    /* JADX INFO: renamed from: V */
    public final void m8709V(float f3) {
        if (this.f15088s0 != f3) {
            float fM8716w = m8716w();
            this.f15088s0 = f3;
            float fM8716w2 = m8716w();
            invalidateSelf();
            if (fM8716w != fM8716w2) {
                m8689B();
            }
        }
    }

    /* JADX INFO: renamed from: W */
    public final void m8710W(ColorStateList colorStateList) {
        if (this.f15065Y != colorStateList) {
            this.f15065Y = colorStateList;
            this.f15060V0 = this.f15058U0 ? C5397a.m11561c(colorStateList) : null;
            onStateChange(getState());
        }
    }

    /* JADX INFO: renamed from: X */
    public final boolean m8711X() {
        return this.f15082m0 && this.f15083n0 != null && this.f15047M0;
    }

    /* JADX INFO: renamed from: Y */
    public final boolean m8712Y() {
        return this.f15069a0 && this.f15071b0 != null;
    }

    /* JADX INFO: renamed from: Z */
    public final boolean m8713Z() {
        return this.f15075f0 && this.f15076g0 != null;
    }

    @Override // gd.C5768g, p507yc.C10341h.b
    /* JADX INFO: renamed from: a */
    public final void mo8572a() {
        m8689B();
        invalidateSelf();
    }

    @Override // gd.C5768g, android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        int i10;
        RectF rectF;
        int i11;
        int i12;
        int i13;
        RectF rectF2;
        int iSave;
        Rect bounds = getBounds();
        if (bounds.isEmpty() || (i10 = this.f15049O0) == 0) {
            return;
        }
        int iSaveLayerAlpha = i10 < 255 ? canvas.saveLayerAlpha(bounds.left, bounds.top, bounds.right, bounds.bottom, i10) : 0;
        boolean z10 = this.f15070a1;
        Paint paint = this.f15035A0;
        RectF rectF3 = this.f15037C0;
        if (!z10) {
            paint.setColor(this.f15041G0);
            paint.setStyle(Paint.Style.FILL);
            rectF3.set(bounds);
            canvas.drawRoundRect(rectF3, m8718y(), m8718y(), paint);
        }
        if (!this.f15070a1) {
            paint.setColor(this.f15042H0);
            paint.setStyle(Paint.Style.FILL);
            ColorFilter colorFilter = this.f15050P0;
            if (colorFilter == null) {
                colorFilter = this.f15051Q0;
            }
            paint.setColorFilter(colorFilter);
            rectF3.set(bounds);
            canvas.drawRoundRect(rectF3, m8718y(), m8718y(), paint);
        }
        if (this.f15070a1) {
            super.draw(canvas);
        }
        if (this.f15063X > 0.0f && !this.f15070a1) {
            paint.setColor(this.f15044J0);
            paint.setStyle(Paint.Style.STROKE);
            if (!this.f15070a1) {
                ColorFilter colorFilter2 = this.f15050P0;
                if (colorFilter2 == null) {
                    colorFilter2 = this.f15051Q0;
                }
                paint.setColorFilter(colorFilter2);
            }
            float f3 = bounds.left;
            float f10 = this.f15063X / 2.0f;
            rectF3.set(f3 + f10, bounds.top + f10, bounds.right - f10, bounds.bottom - f10);
            float f11 = this.f15059V - (this.f15063X / 2.0f);
            canvas.drawRoundRect(rectF3, f11, f11, paint);
        }
        paint.setColor(this.f15045K0);
        paint.setStyle(Paint.Style.FILL);
        rectF3.set(bounds);
        if (this.f15070a1) {
            RectF rectF4 = new RectF(bounds);
            Path path = this.f15039E0;
            C5773l c5773l = this.f34852M;
            C5768g.b bVar = this.f34857a;
            c5773l.m12161a(bVar.f34870a, bVar.f34879j, rectF4, this.f34851L, path);
            m12134f(canvas, paint, path, this.f34857a.f34870a, m12136h());
        } else {
            canvas.drawRoundRect(rectF3, m8718y(), m8718y(), paint);
        }
        if (m8712Y()) {
            m8715v(bounds, rectF3);
            float f12 = rectF3.left;
            float f13 = rectF3.top;
            canvas.translate(f12, f13);
            this.f15071b0.setBounds(0, 0, (int) rectF3.width(), (int) rectF3.height());
            this.f15071b0.draw(canvas);
            canvas.translate(-f12, -f13);
        }
        if (m8711X()) {
            m8715v(bounds, rectF3);
            float f14 = rectF3.left;
            float f15 = rectF3.top;
            canvas.translate(f14, f15);
            this.f15083n0.setBounds(0, 0, (int) rectF3.width(), (int) rectF3.height());
            this.f15083n0.draw(canvas);
            canvas.translate(-f14, -f15);
        }
        if (!this.f15066Y0 || this.f15067Z == null) {
            rectF = rectF3;
            i11 = iSaveLayerAlpha;
            i12 = 0;
            i13 = 255;
        } else {
            PointF pointF = this.f15038D0;
            pointF.set(0.0f, 0.0f);
            Paint.Align align = Paint.Align.LEFT;
            CharSequence charSequence = this.f15067Z;
            C10341h c10341h = this.f15040F0;
            if (charSequence != null) {
                float fM8716w = m8716w() + this.f15087r0 + this.f15090u0;
                if (C8488a.c.m16572a(this) == 0) {
                    pointF.x = bounds.left + fM8716w;
                    align = Paint.Align.LEFT;
                } else {
                    pointF.x = bounds.right - fM8716w;
                    align = Paint.Align.RIGHT;
                }
                float fCenterY = bounds.centerY();
                TextPaint textPaint = c10341h.f52039a;
                Paint.FontMetrics fontMetrics = this.f15036B0;
                textPaint.getFontMetrics(fontMetrics);
                pointF.y = fCenterY - ((fontMetrics.descent + fontMetrics.ascent) / 2.0f);
            }
            rectF3.setEmpty();
            if (this.f15067Z != null) {
                float fM8716w2 = m8716w() + this.f15087r0 + this.f15090u0;
                float fM8717x = m8717x() + this.f15094y0 + this.f15091v0;
                if (C8488a.c.m16572a(this) == 0) {
                    rectF3.left = bounds.left + fM8716w2;
                    rectF3.right = bounds.right - fM8717x;
                } else {
                    rectF3.left = bounds.left + fM8717x;
                    rectF3.right = bounds.right - fM8716w2;
                }
                rectF3.top = bounds.top;
                rectF3.bottom = bounds.bottom;
            }
            C5151d c5151d = c10341h.f52044f;
            TextPaint textPaint2 = c10341h.f52039a;
            if (c5151d != null) {
                textPaint2.drawableState = getState();
                c10341h.f52044f.m10934e(this.f15095z0, textPaint2, c10341h.f52040b);
            }
            textPaint2.setTextAlign(align);
            boolean z11 = Math.round(c10341h.m19352a(this.f15067Z.toString())) > Math.round(rectF3.width());
            if (z11) {
                iSave = canvas.save();
                canvas.clipRect(rectF3);
            } else {
                iSave = 0;
            }
            CharSequence charSequenceEllipsize = this.f15067Z;
            if (z11 && this.f15064X0 != null) {
                charSequenceEllipsize = TextUtils.ellipsize(charSequenceEllipsize, textPaint2, rectF3.width(), this.f15064X0);
            }
            CharSequence charSequence2 = charSequenceEllipsize;
            int length = charSequence2.length();
            float f16 = pointF.x;
            float f17 = pointF.y;
            rectF = rectF3;
            i11 = iSaveLayerAlpha;
            i12 = 0;
            i13 = 255;
            canvas.drawText(charSequence2, 0, length, f16, f17, textPaint2);
            if (z11) {
                canvas.restoreToCount(iSave);
            }
        }
        if (m8713Z()) {
            rectF.setEmpty();
            if (m8713Z()) {
                float f18 = this.f15094y0 + this.f15093x0;
                if (C8488a.c.m16572a(this) == 0) {
                    float f19 = bounds.right - f18;
                    rectF2 = rectF;
                    rectF2.right = f19;
                    rectF2.left = f19 - this.f15079j0;
                } else {
                    rectF2 = rectF;
                    float f20 = bounds.left + f18;
                    rectF2.left = f20;
                    rectF2.right = f20 + this.f15079j0;
                }
                float fExactCenterY = bounds.exactCenterY();
                float f21 = this.f15079j0;
                float f22 = fExactCenterY - (f21 / 2.0f);
                rectF2.top = f22;
                rectF2.bottom = f22 + f21;
            } else {
                rectF2 = rectF;
            }
            float f23 = rectF2.left;
            float f24 = rectF2.top;
            canvas.translate(f23, f24);
            this.f15076g0.setBounds(i12, i12, (int) rectF2.width(), (int) rectF2.height());
            int[] iArr = C5397a.f33812a;
            this.f15077h0.setBounds(this.f15076g0.getBounds());
            this.f15077h0.jumpToCurrentState();
            this.f15077h0.draw(canvas);
            canvas.translate(-f23, -f24);
        }
        if (this.f15049O0 < i13) {
            canvas.restoreToCount(i11);
        }
    }

    @Override // gd.C5768g, android.graphics.drawable.Drawable
    public final int getAlpha() {
        return this.f15049O0;
    }

    @Override // android.graphics.drawable.Drawable
    public final ColorFilter getColorFilter() {
        return this.f15050P0;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicHeight() {
        return (int) this.f15057U;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicWidth() {
        return Math.min(Math.round(m8717x() + this.f15040F0.m19352a(this.f15067Z.toString()) + m8716w() + this.f15087r0 + this.f15090u0 + this.f15091v0 + this.f15094y0), this.f15068Z0);
    }

    @Override // gd.C5768g, android.graphics.drawable.Drawable
    public final int getOpacity() {
        return -3;
    }

    @Override // gd.C5768g, android.graphics.drawable.Drawable
    @TargetApi(21)
    public final void getOutline(Outline outline) {
        if (this.f15070a1) {
            super.getOutline(outline);
            return;
        }
        Rect bounds = getBounds();
        if (bounds.isEmpty()) {
            outline.setRoundRect(0, 0, getIntrinsicWidth(), (int) this.f15057U, this.f15059V);
        } else {
            outline.setRoundRect(bounds, this.f15059V);
        }
        outline.setAlpha(this.f15049O0 / 255.0f);
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public final void invalidateDrawable(Drawable drawable) {
        Drawable.Callback callback = getCallback();
        if (callback != null) {
            callback.invalidateDrawable(this);
        }
    }

    @Override // gd.C5768g, android.graphics.drawable.Drawable
    public final boolean isStateful() {
        ColorStateList colorStateList;
        if (m8688z(this.f15053S) || m8688z(this.f15055T) || m8688z(this.f15061W)) {
            return true;
        }
        if (this.f15058U0 && m8688z(this.f15060V0)) {
            return true;
        }
        C5151d c5151d = this.f15040F0.f52044f;
        if ((c5151d == null || (colorStateList = c5151d.f33136j) == null || !colorStateList.isStateful()) ? false : true) {
            return true;
        }
        return (this.f15082m0 && this.f15083n0 != null && this.f15081l0) || m8686A(this.f15071b0) || m8686A(this.f15083n0) || m8688z(this.f15052R0);
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean onLayoutDirectionChanged(int i10) {
        boolean zOnLayoutDirectionChanged = super.onLayoutDirectionChanged(i10);
        if (m8712Y()) {
            zOnLayoutDirectionChanged |= C8488a.c.m16573b(this.f15071b0, i10);
        }
        if (m8711X()) {
            zOnLayoutDirectionChanged |= C8488a.c.m16573b(this.f15083n0, i10);
        }
        if (m8713Z()) {
            zOnLayoutDirectionChanged |= C8488a.c.m16573b(this.f15076g0, i10);
        }
        if (!zOnLayoutDirectionChanged) {
            return true;
        }
        invalidateSelf();
        return true;
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean onLevelChange(int i10) {
        boolean zOnLevelChange = super.onLevelChange(i10);
        if (m8712Y()) {
            zOnLevelChange |= this.f15071b0.setLevel(i10);
        }
        if (m8711X()) {
            zOnLevelChange |= this.f15083n0.setLevel(i10);
        }
        if (m8713Z()) {
            zOnLevelChange |= this.f15076g0.setLevel(i10);
        }
        if (zOnLevelChange) {
            invalidateSelf();
        }
        return zOnLevelChange;
    }

    @Override // gd.C5768g, android.graphics.drawable.Drawable, p507yc.C10341h.b
    public final boolean onStateChange(int[] iArr) {
        if (this.f15070a1) {
            super.onStateChange(iArr);
        }
        return m8690C(iArr, this.f15056T0);
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public final void scheduleDrawable(Drawable drawable, Runnable runnable, long j10) {
        Drawable.Callback callback = getCallback();
        if (callback != null) {
            callback.scheduleDrawable(this, runnable, j10);
        }
    }

    @Override // gd.C5768g, android.graphics.drawable.Drawable
    public final void setAlpha(int i10) {
        if (this.f15049O0 != i10) {
            this.f15049O0 = i10;
            invalidateSelf();
        }
    }

    @Override // gd.C5768g, android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
        if (this.f15050P0 != colorFilter) {
            this.f15050P0 = colorFilter;
            invalidateSelf();
        }
    }

    @Override // gd.C5768g, android.graphics.drawable.Drawable
    public final void setTintList(ColorStateList colorStateList) {
        if (this.f15052R0 != colorStateList) {
            this.f15052R0 = colorStateList;
            onStateChange(getState());
        }
    }

    @Override // gd.C5768g, android.graphics.drawable.Drawable
    public final void setTintMode(PorterDuff.Mode mode) {
        if (this.f15054S0 != mode) {
            this.f15054S0 = mode;
            ColorStateList colorStateList = this.f15052R0;
            this.f15051Q0 = (colorStateList == null || mode == null) ? null : new PorterDuffColorFilter(colorStateList.getColorForState(getState(), 0), mode);
            invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean setVisible(boolean z10, boolean z11) {
        boolean visible = super.setVisible(z10, z11);
        if (m8712Y()) {
            visible |= this.f15071b0.setVisible(z10, z11);
        }
        if (m8711X()) {
            visible |= this.f15083n0.setVisible(z10, z11);
        }
        if (m8713Z()) {
            visible |= this.f15076g0.setVisible(z10, z11);
        }
        if (visible) {
            invalidateSelf();
        }
        return visible;
    }

    /* JADX INFO: renamed from: u */
    public final void m8714u(Drawable drawable) {
        if (drawable == null) {
            return;
        }
        drawable.setCallback(this);
        C8488a.c.m16573b(drawable, C8488a.c.m16572a(this));
        drawable.setLevel(getLevel());
        drawable.setVisible(isVisible(), false);
        if (drawable == this.f15076g0) {
            if (drawable.isStateful()) {
                drawable.setState(this.f15056T0);
            }
            C8488a.b.m16570h(drawable, this.f15078i0);
        } else {
            Drawable drawable2 = this.f15071b0;
            if (drawable == drawable2 && this.f15074e0) {
                C8488a.b.m16570h(drawable2, this.f15072c0);
            }
            if (drawable.isStateful()) {
                drawable.setState(getState());
            }
        }
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public final void unscheduleDrawable(Drawable drawable, Runnable runnable) {
        Drawable.Callback callback = getCallback();
        if (callback != null) {
            callback.unscheduleDrawable(this, runnable);
        }
    }

    /* JADX WARN: Code duplicated, block: B:28:0x0087 A[PHI: r1
      0x0087: PHI (r1v10 float) = (r1v9 float), (r1v9 float), (r1v17 float) binds: [B:23:0x0062, B:24:0x0064, B:26:0x007f] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX INFO: renamed from: v */
    public final void m8715v(Rect rect, RectF rectF) {
        float intrinsicHeight;
        rectF.setEmpty();
        if (m8712Y() || m8711X()) {
            float f3 = this.f15087r0 + this.f15088s0;
            Drawable drawable = this.f15047M0 ? this.f15083n0 : this.f15071b0;
            float intrinsicWidth = this.f15073d0;
            if (intrinsicWidth <= 0.0f && drawable != null) {
                intrinsicWidth = drawable.getIntrinsicWidth();
            }
            if (C8488a.c.m16572a(this) == 0) {
                float f10 = rect.left + f3;
                rectF.left = f10;
                rectF.right = f10 + intrinsicWidth;
            } else {
                float f11 = rect.right - f3;
                rectF.right = f11;
                rectF.left = f11 - intrinsicWidth;
            }
            Drawable drawable2 = this.f15047M0 ? this.f15083n0 : this.f15071b0;
            float fCeil = this.f15073d0;
            if (fCeil > 0.0f || drawable2 == null) {
                intrinsicHeight = fCeil;
            } else {
                fCeil = (float) Math.ceil(C10347n.m19362b(24, this.f15095z0));
                if (drawable2.getIntrinsicHeight() <= fCeil) {
                    intrinsicHeight = drawable2.getIntrinsicHeight();
                } else {
                    intrinsicHeight = fCeil;
                }
            }
            float fExactCenterY = rect.exactCenterY() - (intrinsicHeight / 2.0f);
            rectF.top = fExactCenterY;
            rectF.bottom = fExactCenterY + intrinsicHeight;
        }
    }

    /* JADX INFO: renamed from: w */
    public final float m8716w() {
        if (!m8712Y() && !m8711X()) {
            return 0.0f;
        }
        float f3 = this.f15088s0;
        Drawable drawable = this.f15047M0 ? this.f15083n0 : this.f15071b0;
        float intrinsicWidth = this.f15073d0;
        if (intrinsicWidth <= 0.0f && drawable != null) {
            intrinsicWidth = drawable.getIntrinsicWidth();
        }
        return intrinsicWidth + f3 + this.f15089t0;
    }

    /* JADX INFO: renamed from: x */
    public final float m8717x() {
        if (m8713Z()) {
            return this.f15092w0 + this.f15079j0 + this.f15093x0;
        }
        return 0.0f;
    }

    /* JADX INFO: renamed from: y */
    public final float m8718y() {
        return this.f15070a1 ? m12137i() : this.f15059V;
    }
}
