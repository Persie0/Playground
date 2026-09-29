package p000;

import android.R;
import android.content.Context;
import android.content.res.ColorStateList;
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
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.TypedValue;
import com.google.android.material.chip.Chip;
import com.google.android.material.focus.FocusRingDrawable;
import java.lang.ref.WeakReference;
import java.util.Arrays;

/* JADX INFO: loaded from: classes2.dex */
public final class f11 extends fs5 implements Drawable.Callback, zt9 {

    /* JADX INFO: renamed from: k1 */
    public static final int[] f38171k1 = {R.attr.state_enabled};

    /* JADX INFO: renamed from: l1 */
    public static final ShapeDrawable f38172l1 = new ShapeDrawable(new OvalShape());

    /* JADX INFO: renamed from: A0 */
    public s36 f38173A0;

    /* JADX INFO: renamed from: B0 */
    public float f38174B0;

    /* JADX INFO: renamed from: C0 */
    public float f38175C0;

    /* JADX INFO: renamed from: D0 */
    public float f38176D0;

    /* JADX INFO: renamed from: E0 */
    public float f38177E0;

    /* JADX INFO: renamed from: F0 */
    public float f38178F0;

    /* JADX INFO: renamed from: G0 */
    public float f38179G0;

    /* JADX INFO: renamed from: H0 */
    public float f38180H0;

    /* JADX INFO: renamed from: I0 */
    public float f38181I0;

    /* JADX INFO: renamed from: J0 */
    public final Context f38182J0;

    /* JADX INFO: renamed from: K0 */
    public final Paint f38183K0;

    /* JADX INFO: renamed from: L0 */
    public final Paint.FontMetrics f38184L0;

    /* JADX INFO: renamed from: M0 */
    public final RectF f38185M0;

    /* JADX INFO: renamed from: N0 */
    public final PointF f38186N0;

    /* JADX INFO: renamed from: O0 */
    public final Path f38187O0;

    /* JADX INFO: renamed from: P0 */
    public final au9 f38188P0;

    /* JADX INFO: renamed from: Q0 */
    public int f38189Q0;

    /* JADX INFO: renamed from: R0 */
    public int f38190R0;

    /* JADX INFO: renamed from: S0 */
    public int f38191S0;

    /* JADX INFO: renamed from: T0 */
    public int f38192T0;

    /* JADX INFO: renamed from: U0 */
    public int f38193U0;

    /* JADX INFO: renamed from: V0 */
    public int f38194V0;

    /* JADX INFO: renamed from: W0 */
    public boolean f38195W0;

    /* JADX INFO: renamed from: X0 */
    public int f38196X0;

    /* JADX INFO: renamed from: Y0 */
    public int f38197Y0;

    /* JADX INFO: renamed from: Z0 */
    public ColorFilter f38198Z0;

    /* JADX INFO: renamed from: a1 */
    public PorterDuffColorFilter f38199a1;

    /* JADX INFO: renamed from: b1 */
    public ColorStateList f38200b1;

    /* JADX INFO: renamed from: c0 */
    public ColorStateList f38201c0;

    /* JADX INFO: renamed from: c1 */
    public PorterDuff.Mode f38202c1;

    /* JADX INFO: renamed from: d0 */
    public ColorStateList f38203d0;

    /* JADX INFO: renamed from: d1 */
    public int[] f38204d1;

    /* JADX INFO: renamed from: e0 */
    public float f38205e0;

    /* JADX INFO: renamed from: e1 */
    public ColorStateList f38206e1;

    /* JADX INFO: renamed from: f0 */
    public float f38207f0;

    /* JADX INFO: renamed from: f1 */
    public WeakReference f38208f1;

    /* JADX INFO: renamed from: g0 */
    public ColorStateList f38209g0;

    /* JADX INFO: renamed from: g1 */
    public TextUtils.TruncateAt f38210g1;

    /* JADX INFO: renamed from: h0 */
    public float f38211h0;

    /* JADX INFO: renamed from: h1 */
    public boolean f38212h1;

    /* JADX INFO: renamed from: i0 */
    public ColorStateList f38213i0;

    /* JADX INFO: renamed from: i1 */
    public int f38214i1;

    /* JADX INFO: renamed from: j0 */
    public CharSequence f38215j0;

    /* JADX INFO: renamed from: j1 */
    public boolean f38216j1;

    /* JADX INFO: renamed from: k0 */
    public boolean f38217k0;

    /* JADX INFO: renamed from: l0 */
    public Drawable f38218l0;

    /* JADX INFO: renamed from: m0 */
    public ColorStateList f38219m0;

    /* JADX INFO: renamed from: n0 */
    public float f38220n0;

    /* JADX INFO: renamed from: o0 */
    public boolean f38221o0;

    /* JADX INFO: renamed from: p0 */
    public boolean f38222p0;

    /* JADX INFO: renamed from: q0 */
    public Drawable f38223q0;

    /* JADX INFO: renamed from: r0 */
    public RippleDrawable f38224r0;

    /* JADX INFO: renamed from: s0 */
    public ColorStateList f38225s0;

    /* JADX INFO: renamed from: t0 */
    public float f38226t0;

    /* JADX INFO: renamed from: u0 */
    public SpannableStringBuilder f38227u0;

    /* JADX INFO: renamed from: v0 */
    public boolean f38228v0;

    /* JADX INFO: renamed from: w0 */
    public boolean f38229w0;

    /* JADX INFO: renamed from: x0 */
    public Drawable f38230x0;

    /* JADX INFO: renamed from: y0 */
    public ColorStateList f38231y0;

    /* JADX INFO: renamed from: z0 */
    public s36 f38232z0;

    public f11(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i, Chip.f12852R);
        this.f38207f0 = -1.0f;
        this.f38183K0 = new Paint(1);
        this.f38184L0 = new Paint.FontMetrics();
        this.f38185M0 = new RectF();
        this.f38186N0 = new PointF();
        this.f38187O0 = new Path();
        this.f38197Y0 = 255;
        this.f38202c1 = PorterDuff.Mode.SRC_IN;
        this.f38208f1 = new WeakReference(null);
        m12072p(context);
        this.f38182J0 = context;
        au9 au9Var = new au9(this);
        this.f38188P0 = au9Var;
        this.f38215j0 = "";
        au9Var.f7523a.density = context.getResources().getDisplayMetrics().density;
        int[] iArr = f38171k1;
        setState(iArr);
        m11475d0(iArr);
        this.f38212h1 = true;
        f38172l1.setTint(-1);
    }

    /* JADX INFO: renamed from: K */
    public static boolean m11449K(ColorStateList colorStateList) {
        return colorStateList != null && colorStateList.isStateful();
    }

    /* JADX INFO: renamed from: L */
    public static boolean m11450L(Drawable drawable) {
        return drawable != null && drawable.isStateful();
    }

    /* JADX INFO: renamed from: m0 */
    public static void m11451m0(Drawable drawable) {
        if (drawable != null) {
            drawable.setCallback(null);
        }
    }

    /* JADX INFO: renamed from: F */
    public final void m11452F(Drawable drawable) {
        if (drawable == null) {
            return;
        }
        drawable.setCallback(this);
        drawable.setLayoutDirection(getLayoutDirection());
        drawable.setLevel(getLevel());
        drawable.setVisible(isVisible(), false);
        if (drawable == this.f38223q0) {
            drawable.setTintList(this.f38225s0);
            if (drawable.isStateful()) {
                drawable.setState(this.f38204d1);
                return;
            }
            return;
        }
        Drawable drawable2 = this.f38218l0;
        if (drawable == drawable2 && this.f38221o0) {
            drawable2.setTintList(this.f38219m0);
        }
        if (drawable.isStateful()) {
            drawable.setState(getState());
        }
    }

    /* JADX INFO: renamed from: G */
    public final void m11453G(Rect rect, RectF rectF) {
        rectF.setEmpty();
        if (m11482k0() || m11481j0()) {
            float f = this.f38174B0 + this.f38175C0;
            Drawable drawable = this.f38195W0 ? this.f38230x0 : this.f38218l0;
            float intrinsicWidth = this.f38220n0;
            if (intrinsicWidth <= 0.0f && drawable != null) {
                intrinsicWidth = drawable.getIntrinsicWidth();
            }
            if (getLayoutDirection() == 0) {
                float f2 = rect.left + f;
                rectF.left = f2;
                rectF.right = f2 + intrinsicWidth;
            } else {
                float f3 = rect.right - f;
                rectF.right = f3;
                rectF.left = f3 - intrinsicWidth;
            }
            Drawable drawable2 = this.f38195W0 ? this.f38230x0 : this.f38218l0;
            float fCeil = this.f38220n0;
            if (fCeil <= 0.0f && drawable2 != null) {
                fCeil = (float) Math.ceil(TypedValue.applyDimension(1, 24.0f, this.f38182J0.getResources().getDisplayMetrics()));
                if (drawable2.getIntrinsicHeight() <= fCeil) {
                    fCeil = drawable2.getIntrinsicHeight();
                }
            }
            float fExactCenterY = rect.exactCenterY() - (fCeil / 2.0f);
            rectF.top = fExactCenterY;
            rectF.bottom = fExactCenterY + fCeil;
        }
    }

    /* JADX INFO: renamed from: H */
    public final float m11454H() {
        if (!m11482k0() && !m11481j0()) {
            return 0.0f;
        }
        float f = this.f38175C0;
        Drawable drawable = this.f38195W0 ? this.f38230x0 : this.f38218l0;
        float intrinsicWidth = this.f38220n0;
        if (intrinsicWidth <= 0.0f && drawable != null) {
            intrinsicWidth = drawable.getIntrinsicWidth();
        }
        return intrinsicWidth + f + this.f38176D0;
    }

    /* JADX INFO: renamed from: I */
    public final float m11455I() {
        if (m11483l0()) {
            return this.f38179G0 + this.f38226t0 + this.f38180H0;
        }
        return 0.0f;
    }

    /* JADX INFO: renamed from: J */
    public final float m11456J() {
        return this.f38216j1 ? m12069m() : this.f38207f0;
    }

    /* JADX INFO: renamed from: M */
    public final void m11457M() {
        Chip chip = (Chip) this.f38208f1.get();
        if (chip != null) {
            chip.m6101c(chip.f12859K);
            chip.requestLayout();
            chip.invalidateOutline();
        }
    }

    /* JADX WARN: Code duplicated, block: B:54:0x009e  */
    /* JADX INFO: renamed from: N */
    public final boolean m11458N(int[] iArr, int[] iArr2) {
        int colorForState;
        boolean z;
        boolean z2;
        ColorStateList colorStateList;
        boolean zOnStateChange = super.onStateChange(iArr);
        ColorStateList colorStateList2 = this.f38201c0;
        int iM12061e = m12061e(colorStateList2 != null ? colorStateList2.getColorForState(iArr, this.f38189Q0) : 0);
        boolean state = true;
        if (this.f38189Q0 != iM12061e) {
            this.f38189Q0 = iM12061e;
            zOnStateChange = true;
        }
        ColorStateList colorStateList3 = this.f38203d0;
        int iM12061e2 = m12061e(colorStateList3 != null ? colorStateList3.getColorForState(iArr, this.f38190R0) : 0);
        if (this.f38190R0 != iM12061e2) {
            this.f38190R0 = iM12061e2;
            zOnStateChange = true;
        }
        int iM25014g = ya1.m25014g(iM12061e2, iM12061e);
        if ((this.f38191S0 != iM25014g) | (this.f39578b.f36162c == null)) {
            this.f38191S0 = iM25014g;
            m12076t(ColorStateList.valueOf(iM25014g));
            zOnStateChange = true;
        }
        ColorStateList colorStateList4 = this.f38209g0;
        int colorForState2 = colorStateList4 != null ? colorStateList4.getColorForState(iArr, this.f38192T0) : 0;
        if (this.f38192T0 != colorForState2) {
            this.f38192T0 = colorForState2;
            zOnStateChange = true;
        }
        if (this.f38206e1 != null) {
            boolean z3 = false;
            boolean z4 = false;
            for (int i : iArr) {
                if (i == 16842910) {
                    z3 = true;
                } else if (i == 16842908 || i == 16842919 || i == 16843623) {
                    z4 = true;
                }
            }
            if (z3 && z4) {
                colorForState = this.f38206e1.getColorForState(iArr, this.f38193U0);
            } else {
                colorForState = 0;
            }
        } else {
            colorForState = 0;
        }
        if (this.f38193U0 != colorForState) {
            this.f38193U0 = colorForState;
        }
        us9 us9Var = this.f38188P0.f7529g;
        int colorForState3 = (us9Var == null || (colorStateList = us9Var.f64308k) == null) ? 0 : colorStateList.getColorForState(iArr, this.f38194V0);
        if (this.f38194V0 != colorForState3) {
            this.f38194V0 = colorForState3;
            zOnStateChange = true;
        }
        int[] state2 = getState();
        if (state2 == null) {
            z = false;
            break;
        }
        int length = state2.length;
        int i2 = 0;
        while (true) {
            if (i2 < length) {
                if (state2[i2] == 16842912) {
                    if (this.f38228v0) {
                        z = true;
                        break;
                    }
                } else {
                    i2++;
                }
            }
            z = false;
            break;
        }
        if (this.f38195W0 == z || this.f38230x0 == null) {
            z2 = false;
        } else {
            float fM11454H = m11454H();
            this.f38195W0 = z;
            if (fM11454H != m11454H()) {
                zOnStateChange = true;
                z2 = true;
            } else {
                z2 = false;
                zOnStateChange = true;
            }
        }
        ColorStateList colorStateList5 = this.f38200b1;
        int colorForState4 = colorStateList5 != null ? colorStateList5.getColorForState(iArr, this.f38196X0) : 0;
        if (this.f38196X0 != colorForState4) {
            this.f38196X0 = colorForState4;
            ColorStateList colorStateList6 = this.f38200b1;
            PorterDuff.Mode mode = this.f38202c1;
            this.f38199a1 = (colorStateList6 == null || mode == null) ? null : new PorterDuffColorFilter(colorStateList6.getColorForState(getState(), 0), mode);
        } else {
            state = zOnStateChange;
        }
        if (m11450L(this.f38218l0)) {
            state |= this.f38218l0.setState(iArr);
        }
        if (m11450L(this.f38230x0)) {
            state |= this.f38230x0.setState(iArr);
        }
        if (m11450L(this.f38223q0)) {
            int[] iArr3 = new int[iArr.length + iArr2.length];
            System.arraycopy(iArr, 0, iArr3, 0, iArr.length);
            System.arraycopy(iArr2, 0, iArr3, iArr.length, iArr2.length);
            state |= this.f38223q0.setState(iArr3);
        }
        if (m11450L(this.f38224r0)) {
            state |= this.f38224r0.setState(iArr2);
        }
        if (state) {
            invalidateSelf();
        }
        if (z2) {
            m11457M();
        }
        return state;
    }

    /* JADX INFO: renamed from: O */
    public final void m11459O(boolean z) {
        if (this.f38228v0 != z) {
            this.f38228v0 = z;
            float fM11454H = m11454H();
            if (!z && this.f38195W0) {
                this.f38195W0 = false;
            }
            float fM11454H2 = m11454H();
            invalidateSelf();
            if (fM11454H != fM11454H2) {
                m11457M();
            }
        }
    }

    /* JADX INFO: renamed from: P */
    public final void m11460P(Drawable drawable) {
        if (this.f38230x0 != drawable) {
            float fM11454H = m11454H();
            this.f38230x0 = drawable;
            float fM11454H2 = m11454H();
            m11451m0(this.f38230x0);
            m11452F(this.f38230x0);
            invalidateSelf();
            if (fM11454H != fM11454H2) {
                m11457M();
            }
        }
    }

    /* JADX INFO: renamed from: Q */
    public final void m11461Q(ColorStateList colorStateList) {
        Drawable drawable;
        if (this.f38231y0 != colorStateList) {
            this.f38231y0 = colorStateList;
            if (this.f38229w0 && (drawable = this.f38230x0) != null && this.f38228v0) {
                drawable.setTintList(colorStateList);
            }
            onStateChange(getState());
        }
    }

    /* JADX INFO: renamed from: R */
    public final void m11462R(boolean z) {
        if (this.f38229w0 != z) {
            boolean zM11481j0 = m11481j0();
            this.f38229w0 = z;
            boolean zM11481j1 = m11481j0();
            if (zM11481j0 != zM11481j1) {
                Drawable drawable = this.f38230x0;
                if (zM11481j1) {
                    m11452F(drawable);
                } else {
                    m11451m0(drawable);
                }
                invalidateSelf();
                m11457M();
            }
        }
    }

    /* JADX INFO: renamed from: S */
    public final void m11463S(float f) {
        if (this.f38207f0 != f) {
            this.f38207f0 = f;
            setShapeAppearanceModel(m12067k().mo13917a(f));
        }
    }

    /* JADX INFO: renamed from: T */
    public final void m11464T(Drawable drawable) {
        Drawable drawable2 = this.f38218l0;
        if (drawable2 == null) {
            drawable2 = null;
        }
        if (drawable2 != drawable) {
            float fM11454H = m11454H();
            this.f38218l0 = drawable != null ? drawable.mutate() : null;
            float fM11454H2 = m11454H();
            m11451m0(drawable2);
            if (m11482k0()) {
                m11452F(this.f38218l0);
            }
            invalidateSelf();
            if (fM11454H != fM11454H2) {
                m11457M();
            }
        }
    }

    /* JADX INFO: renamed from: U */
    public final void m11465U(float f) {
        if (this.f38220n0 != f) {
            float fM11454H = m11454H();
            this.f38220n0 = f;
            float fM11454H2 = m11454H();
            invalidateSelf();
            if (fM11454H != fM11454H2) {
                m11457M();
            }
        }
    }

    /* JADX INFO: renamed from: V */
    public final void m11466V(ColorStateList colorStateList) {
        this.f38221o0 = true;
        if (this.f38219m0 != colorStateList) {
            this.f38219m0 = colorStateList;
            if (m11482k0()) {
                this.f38218l0.setTintList(colorStateList);
            }
            onStateChange(getState());
        }
    }

    /* JADX INFO: renamed from: W */
    public final void m11467W(boolean z) {
        if (this.f38217k0 != z) {
            boolean zM11482k0 = m11482k0();
            this.f38217k0 = z;
            boolean zM11482k1 = m11482k0();
            if (zM11482k0 != zM11482k1) {
                Drawable drawable = this.f38218l0;
                if (zM11482k1) {
                    m11452F(drawable);
                } else {
                    m11451m0(drawable);
                }
                invalidateSelf();
                m11457M();
            }
        }
    }

    /* JADX INFO: renamed from: X */
    public final void m11468X(ColorStateList colorStateList) {
        if (this.f38209g0 != colorStateList) {
            this.f38209g0 = colorStateList;
            if (this.f38216j1) {
                m12081y(colorStateList);
            }
            onStateChange(getState());
        }
    }

    /* JADX INFO: renamed from: Y */
    public final void m11469Y(float f) {
        if (this.f38211h0 != f) {
            this.f38211h0 = f;
            this.f38183K0.setStrokeWidth(f);
            if (this.f38216j1) {
                m12053A(f);
            }
            invalidateSelf();
        }
    }

    /* JADX INFO: renamed from: Z */
    public final void m11470Z(Drawable drawable) {
        Drawable drawable2 = this.f38223q0;
        if (drawable2 == null) {
            drawable2 = null;
        }
        if (drawable2 != drawable) {
            float fM11455I = m11455I();
            this.f38223q0 = drawable != null ? drawable.mutate() : null;
            RippleDrawable rippleDrawable = new RippleDrawable(do7.m10516C(this.f38213i0), this.f38223q0, f38172l1);
            FocusRingDrawable.m6147f(this.f38182J0, rippleDrawable, null);
            this.f38224r0 = rippleDrawable;
            float fM11455I2 = m11455I();
            m11451m0(drawable2);
            if (m11483l0()) {
                m11452F(this.f38223q0);
            }
            invalidateSelf();
            if (fM11455I != fM11455I2) {
                m11457M();
            }
        }
    }

    @Override // p000.fs5, p000.zt9
    /* JADX INFO: renamed from: a */
    public final void mo11471a() {
        m11457M();
        invalidateSelf();
    }

    /* JADX INFO: renamed from: a0 */
    public final void m11472a0(float f) {
        if (this.f38180H0 != f) {
            this.f38180H0 = f;
            invalidateSelf();
            if (m11483l0()) {
                m11457M();
            }
        }
    }

    /* JADX INFO: renamed from: b0 */
    public final void m11473b0(float f) {
        if (this.f38226t0 != f) {
            this.f38226t0 = f;
            invalidateSelf();
            if (m11483l0()) {
                m11457M();
            }
        }
    }

    /* JADX INFO: renamed from: c0 */
    public final void m11474c0(float f) {
        if (this.f38179G0 != f) {
            this.f38179G0 = f;
            invalidateSelf();
            if (m11483l0()) {
                m11457M();
            }
        }
    }

    /* JADX INFO: renamed from: d0 */
    public final boolean m11475d0(int[] iArr) {
        if (Arrays.equals(this.f38204d1, iArr)) {
            return false;
        }
        this.f38204d1 = iArr;
        if (m11483l0()) {
            return m11458N(getState(), iArr);
        }
        return false;
    }

    /* JADX WARN: Failed to calculate best type for var: r0v12 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r0v12 ??, new type: float
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:147)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:125)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$2(TypeInferenceVisitor.java:103)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:103)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
    Caused by: java.lang.NullPointerException
     */
    /* JADX WARN: Failed to calculate best type for var: r0v13 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r0v13 ??, new type: float
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:147)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:125)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$2(TypeInferenceVisitor.java:103)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:103)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
    Caused by: java.lang.NullPointerException
     */
    /* JADX WARN: Failed to calculate best type for var: r0v14 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r0v14 ??, new type: float
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:147)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:125)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$2(TypeInferenceVisitor.java:103)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:103)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
    Caused by: java.lang.NullPointerException
     */
    /* JADX WARN: Failed to calculate best type for var: r11v0 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r11v0 ??, new type: android.graphics.RectF
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.calculateFromBounds(FixTypesVisitor.java:159)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.setBestType(FixTypesVisitor.java:136)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.deduceType(FixTypesVisitor.java:241)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryDeduceTypes(FixTypesVisitor.java:224)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
    Caused by: java.lang.NullPointerException
     */
    /* JADX WARN: Failed to calculate best type for var: r11v0 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r11v0 ??, new type: android.graphics.RectF
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:147)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:125)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$2(TypeInferenceVisitor.java:103)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:103)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
    Caused by: java.lang.NullPointerException
     */
    /* JADX WARN: Failed to calculate best type for var: r1v1 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r1v1 ??, new type: android.graphics.Canvas
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.calculateFromBounds(FixTypesVisitor.java:159)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.setBestType(FixTypesVisitor.java:136)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.deduceType(FixTypesVisitor.java:241)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryDeduceTypes(FixTypesVisitor.java:224)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
    Caused by: java.lang.NullPointerException
     */
    /* JADX WARN: Failed to calculate best type for var: r1v1 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r1v1 ??, new type: android.graphics.Canvas
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:147)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:125)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$2(TypeInferenceVisitor.java:103)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:103)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
    Caused by: java.lang.NullPointerException
     */
    /* JADX WARN: Failed to calculate best type for var: r1v10 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r1v10 ??, new type: android.graphics.Canvas
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:147)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:125)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$2(TypeInferenceVisitor.java:103)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:103)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
    Caused by: java.lang.NullPointerException
     */
    /* JADX WARN: Failed to calculate best type for var: r1v2 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r1v2 ??, new type: android.graphics.Canvas
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.calculateFromBounds(FixTypesVisitor.java:159)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.setBestType(FixTypesVisitor.java:136)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.deduceType(FixTypesVisitor.java:241)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryDeduceTypes(FixTypesVisitor.java:224)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
    Caused by: java.lang.NullPointerException
     */
    /* JADX WARN: Failed to calculate best type for var: r1v3 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r1v3 ??, new type: android.graphics.Canvas
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.calculateFromBounds(FixTypesVisitor.java:159)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.setBestType(FixTypesVisitor.java:136)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.deduceType(FixTypesVisitor.java:241)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryDeduceTypes(FixTypesVisitor.java:224)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
    Caused by: java.lang.NullPointerException
     */
    /* JADX WARN: Failed to calculate best type for var: r1v5 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r1v5 ??, new type: android.graphics.Canvas
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:147)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:125)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$2(TypeInferenceVisitor.java:103)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:103)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
    Caused by: java.lang.NullPointerException
     */
    /* JADX WARN: Failed to calculate best type for var: r22v0 'this'  ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r22v0 'this'  ??, new type: f11
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:147)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:125)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$2(TypeInferenceVisitor.java:103)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:103)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
    Caused by: java.lang.NullPointerException
     */
    /* JADX WARN: Failed to calculate best type for var: r2v10 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r2v10 ??, new type: float
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:147)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:125)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$2(TypeInferenceVisitor.java:103)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:103)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
    Caused by: java.lang.NullPointerException
     */
    /* JADX WARN: Failed to calculate best type for var: r3v13 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r3v13 ??, new type: android.graphics.drawable.RippleDrawable
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.calculateFromBounds(FixTypesVisitor.java:159)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.setBestType(FixTypesVisitor.java:136)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.deduceType(FixTypesVisitor.java:241)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryDeduceTypes(FixTypesVisitor.java:224)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
    Caused by: java.lang.NullPointerException
     */
    /* JADX WARN: Failed to calculate best type for var: r3v14 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r3v14 ??, new type: float
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:147)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:125)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$2(TypeInferenceVisitor.java:103)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:103)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
    Caused by: java.lang.NullPointerException
     */
    /* JADX WARN: Failed to calculate best type for var: r3v54 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r3v54 ??, new type: android.graphics.drawable.Drawable
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:147)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:125)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$2(TypeInferenceVisitor.java:103)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:103)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
    Caused by: java.lang.NullPointerException
     */
    /* JADX WARN: Failed to calculate best type for var: r3v56 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r3v56 ??, new type: android.graphics.drawable.Drawable
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:147)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:125)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$2(TypeInferenceVisitor.java:103)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:103)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
    Caused by: java.lang.NullPointerException
     */
    /* JADX WARN: Failed to calculate best type for var: r7v0 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r7v0 ??, new type: android.graphics.Rect
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.calculateFromBounds(FixTypesVisitor.java:159)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.setBestType(FixTypesVisitor.java:136)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.deduceType(FixTypesVisitor.java:241)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryDeduceTypes(FixTypesVisitor.java:224)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
    Caused by: java.lang.NullPointerException
     */
    /* JADX WARN: Failed to calculate best type for var: r7v0 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r7v0 ??, new type: android.graphics.Rect
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:147)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:125)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$2(TypeInferenceVisitor.java:103)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:103)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
    Caused by: java.lang.NullPointerException
     */
    /* JADX WARN: Failed to set immutable type for var: r22v0 'this'  ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r22v0 'this'  ??, new type: f11
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.applyWithWiderIgnSame(TypeUpdate.java:73)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setImmutableType(TypeInferenceVisitor.java:111)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$1(TypeInferenceVisitor.java:102)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:102)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
    Caused by: java.lang.NullPointerException
     */
    /*  JADX ERROR: Types fix failed
        jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r3v13 ??, new type: android.graphics.drawable.LayerDrawable
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.applyWithWiderAllow(TypeUpdate.java:66)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryWiderObjects(FixTypesVisitor.java:795)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.deduceType(FixTypesVisitor.java:249)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryDeduceTypes(FixTypesVisitor.java:224)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
        Caused by: java.lang.NullPointerException
        */
    @Override // p000.fs5, android.graphics.drawable.Drawable
    public final void draw(android.graphics.Canvas r23) {
        /*
            Method dump skipped, instruction units count: 728
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.f11.draw(android.graphics.Canvas):void");
    }

    /* JADX INFO: renamed from: e0 */
    public final void m11476e0(ColorStateList colorStateList) {
        if (this.f38225s0 != colorStateList) {
            this.f38225s0 = colorStateList;
            if (m11483l0()) {
                this.f38223q0.setTintList(colorStateList);
            }
            onStateChange(getState());
        }
    }

    /* JADX INFO: renamed from: f0 */
    public final void m11477f0(boolean z) {
        if (this.f38222p0 != z) {
            boolean zM11483l0 = m11483l0();
            this.f38222p0 = z;
            boolean zM11483l1 = m11483l0();
            if (zM11483l0 != zM11483l1) {
                Drawable drawable = this.f38223q0;
                if (zM11483l1) {
                    m11452F(drawable);
                } else {
                    m11451m0(drawable);
                }
                invalidateSelf();
                m11457M();
            }
        }
    }

    /* JADX INFO: renamed from: g0 */
    public final void m11478g0(float f) {
        if (this.f38176D0 != f) {
            float fM11454H = m11454H();
            this.f38176D0 = f;
            float fM11454H2 = m11454H();
            invalidateSelf();
            if (fM11454H != fM11454H2) {
                m11457M();
            }
        }
    }

    @Override // p000.fs5, android.graphics.drawable.Drawable
    public final int getAlpha() {
        return this.f38197Y0;
    }

    @Override // android.graphics.drawable.Drawable
    public final ColorFilter getColorFilter() {
        return this.f38198Z0;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicHeight() {
        return (int) this.f38205e0;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicWidth() {
        return Math.min(Math.round(m11455I() + this.f38188P0.m3066a(this.f38215j0.toString()) + m11454H() + this.f38174B0 + this.f38177E0 + this.f38178F0 + this.f38181I0), this.f38214i1);
    }

    @Override // p000.fs5, android.graphics.drawable.Drawable
    public final int getOpacity() {
        return -3;
    }

    @Override // p000.fs5, android.graphics.drawable.Drawable
    public final void getOutline(Outline outline) {
        Outline outline2;
        if (this.f38216j1) {
            super.getOutline(outline);
            return;
        }
        Rect bounds = getBounds();
        if (bounds.isEmpty()) {
            outline2 = outline;
            outline2.setRoundRect(0, 0, getIntrinsicWidth(), (int) this.f38205e0, this.f38207f0);
        } else {
            outline.setRoundRect(bounds, this.f38207f0);
            outline2 = outline;
        }
        outline2.setAlpha(this.f38197Y0 / 255.0f);
    }

    /* JADX INFO: renamed from: h0 */
    public final void m11479h0(float f) {
        if (this.f38175C0 != f) {
            float fM11454H = m11454H();
            this.f38175C0 = f;
            float fM11454H2 = m11454H();
            invalidateSelf();
            if (fM11454H != fM11454H2) {
                m11457M();
            }
        }
    }

    /* JADX INFO: renamed from: i0 */
    public final void m11480i0(ColorStateList colorStateList) {
        if (this.f38213i0 != colorStateList) {
            this.f38213i0 = colorStateList;
            this.f38206e1 = null;
            onStateChange(getState());
        }
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public final void invalidateDrawable(Drawable drawable) {
        Drawable.Callback callback = getCallback();
        if (callback != null) {
            callback.invalidateDrawable(this);
        }
    }

    @Override // p000.fs5, android.graphics.drawable.Drawable
    public final boolean isStateful() {
        ColorStateList colorStateList;
        if (m11449K(this.f38201c0) || m11449K(this.f38203d0) || m11449K(this.f38209g0)) {
            return true;
        }
        us9 us9Var = this.f38188P0.f7529g;
        if (us9Var == null || (colorStateList = us9Var.f64308k) == null || !colorStateList.isStateful()) {
            return (this.f38229w0 && this.f38230x0 != null && this.f38228v0) || m11450L(this.f38218l0) || m11450L(this.f38230x0) || m11449K(this.f38200b1);
        }
        return true;
    }

    /* JADX INFO: renamed from: j0 */
    public final boolean m11481j0() {
        return this.f38229w0 && this.f38230x0 != null && this.f38195W0;
    }

    /* JADX INFO: renamed from: k0 */
    public final boolean m11482k0() {
        return this.f38217k0 && this.f38218l0 != null;
    }

    /* JADX INFO: renamed from: l0 */
    public final boolean m11483l0() {
        return this.f38222p0 && this.f38223q0 != null;
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean onLayoutDirectionChanged(int i) {
        boolean zOnLayoutDirectionChanged = super.onLayoutDirectionChanged(i);
        if (m11482k0()) {
            zOnLayoutDirectionChanged |= this.f38218l0.setLayoutDirection(i);
        }
        if (m11481j0()) {
            zOnLayoutDirectionChanged |= this.f38230x0.setLayoutDirection(i);
        }
        if (m11483l0()) {
            zOnLayoutDirectionChanged |= this.f38223q0.setLayoutDirection(i);
        }
        if (!zOnLayoutDirectionChanged) {
            return true;
        }
        invalidateSelf();
        return true;
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean onLevelChange(int i) {
        boolean zOnLevelChange = super.onLevelChange(i);
        if (m11482k0()) {
            zOnLevelChange |= this.f38218l0.setLevel(i);
        }
        if (m11481j0()) {
            zOnLevelChange |= this.f38230x0.setLevel(i);
        }
        if (m11483l0()) {
            zOnLevelChange |= this.f38223q0.setLevel(i);
        }
        if (zOnLevelChange) {
            invalidateSelf();
        }
        return zOnLevelChange;
    }

    @Override // p000.fs5, android.graphics.drawable.Drawable, p000.zt9
    public final boolean onStateChange(int[] iArr) {
        if (this.f38216j1) {
            super.onStateChange(iArr);
        }
        return m11458N(iArr, this.f38204d1);
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public final void scheduleDrawable(Drawable drawable, Runnable runnable, long j) {
        Drawable.Callback callback = getCallback();
        if (callback != null) {
            callback.scheduleDrawable(this, runnable, j);
        }
    }

    @Override // p000.fs5, android.graphics.drawable.Drawable
    public final void setAlpha(int i) {
        if (this.f38197Y0 != i) {
            this.f38197Y0 = i;
            invalidateSelf();
        }
    }

    @Override // p000.fs5, android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
        if (this.f38198Z0 != colorFilter) {
            this.f38198Z0 = colorFilter;
            invalidateSelf();
        }
    }

    @Override // p000.fs5, android.graphics.drawable.Drawable
    public final void setTintList(ColorStateList colorStateList) {
        if (this.f38200b1 != colorStateList) {
            this.f38200b1 = colorStateList;
            onStateChange(getState());
        }
    }

    @Override // p000.fs5, android.graphics.drawable.Drawable
    public final void setTintMode(PorterDuff.Mode mode) {
        if (this.f38202c1 != mode) {
            this.f38202c1 = mode;
            ColorStateList colorStateList = this.f38200b1;
            this.f38199a1 = (colorStateList == null || mode == null) ? null : new PorterDuffColorFilter(colorStateList.getColorForState(getState(), 0), mode);
            invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean setVisible(boolean z, boolean z2) {
        boolean visible = super.setVisible(z, z2);
        if (m11482k0()) {
            visible |= this.f38218l0.setVisible(z, z2);
        }
        if (m11481j0()) {
            visible |= this.f38230x0.setVisible(z, z2);
        }
        if (m11483l0()) {
            visible |= this.f38223q0.setVisible(z, z2);
        }
        if (visible) {
            invalidateSelf();
        }
        return visible;
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public final void unscheduleDrawable(Drawable drawable, Runnable runnable) {
        Drawable.Callback callback = getCallback();
        if (callback != null) {
            callback.unscheduleDrawable(this, runnable);
        }
    }
}
