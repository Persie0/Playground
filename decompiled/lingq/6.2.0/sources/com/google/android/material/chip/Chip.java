package com.google.android.material.chip;

import android.R;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.InsetDrawable;
import android.graphics.drawable.RippleDrawable;
import android.text.TextPaint;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.Log;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.PointerIcon;
import android.view.View;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.Checkable;
import android.widget.CompoundButton;
import android.widget.TextView;
import androidx.datastore.preferences.protobuf.DescriptorProtos;
import com.google.android.material.R$attr;
import com.google.android.material.R$style;
import com.google.android.material.R$styleable;
import com.google.android.material.focus.FocusRingDrawable;
import java.lang.ref.WeakReference;
import java.util.Locale;
import p000.AbstractC3184kh;
import p000.C3083hp;
import p000.C3386nv;
import p000.a11;
import p000.as5;
import p000.au9;
import p000.b11;
import p000.bna;
import p000.c11;
import p000.do7;
import p000.dta;
import p000.dy9;
import p000.f11;
import p000.hg0;
import p000.ic0;
import p000.pb1;
import p000.qs5;
import p000.r39;
import p000.s36;
import p000.t49;
import p000.us9;
import p000.wt9;
import p000.xwc;

/* JADX INFO: loaded from: classes2.dex */
public class Chip extends C3083hp implements t49, Checkable {

    /* JADX INFO: renamed from: R */
    public static final int f12852R = R$style.Widget_MaterialComponents_Chip_Action;

    /* JADX INFO: renamed from: S */
    public static final Rect f12853S = new Rect();

    /* JADX INFO: renamed from: T */
    public static final int[] f12854T = {R.attr.state_selected};

    /* JADX INFO: renamed from: U */
    public static final int[] f12855U = {R.attr.state_checkable};

    /* JADX INFO: renamed from: H */
    public boolean f12856H;

    /* JADX INFO: renamed from: I */
    public boolean f12857I;

    /* JADX INFO: renamed from: J */
    public int f12858J;

    /* JADX INFO: renamed from: K */
    public int f12859K;

    /* JADX INFO: renamed from: L */
    public CharSequence f12860L;

    /* JADX INFO: renamed from: M */
    public final c11 f12861M;

    /* JADX INFO: renamed from: N */
    public boolean f12862N;

    /* JADX INFO: renamed from: O */
    public final Rect f12863O;

    /* JADX INFO: renamed from: P */
    public final RectF f12864P;

    /* JADX INFO: renamed from: Q */
    public final a11 f12865Q;

    /* JADX INFO: renamed from: e */
    public f11 f12866e;

    /* JADX INFO: renamed from: f */
    public InsetDrawable f12867f;

    /* JADX INFO: renamed from: g */
    public RippleDrawable f12868g;

    /* JADX INFO: renamed from: h */
    public View.OnClickListener f12869h;

    /* JADX INFO: renamed from: i */
    public CompoundButton.OnCheckedChangeListener f12870i;

    /* JADX INFO: renamed from: j */
    public boolean f12871j;

    /* JADX INFO: renamed from: k */
    public boolean f12872k;

    /* JADX INFO: renamed from: l */
    public boolean f12873l;

    /* JADX WARN: Illegal instructions before constructor call */
    public Chip(Context context, AttributeSet attributeSet, int i) {
        int resourceId;
        int i2 = f12852R;
        super(qs5.m20141b(context, attributeSet, i, i2), attributeSet, i);
        this.f12863O = new Rect();
        this.f12864P = new RectF();
        this.f12865Q = new a11(this);
        Context context2 = getContext();
        us9 us9Var = null;
        if (attributeSet != null) {
            if (attributeSet.getAttributeValue("http://schemas.android.com/apk/res/android", "background") != null) {
                Log.w("Chip", "Do not set the background; Chip manages its own background drawable.");
            }
            if (attributeSet.getAttributeValue("http://schemas.android.com/apk/res/android", "drawableLeft") != null) {
                C3386nv.m17636w("Please set left drawable using R.attr#chipIcon.");
                throw null;
            }
            if (attributeSet.getAttributeValue("http://schemas.android.com/apk/res/android", "drawableStart") != null) {
                C3386nv.m17636w("Please set start drawable using R.attr#chipIcon.");
                throw null;
            }
            if (attributeSet.getAttributeValue("http://schemas.android.com/apk/res/android", "drawableEnd") != null) {
                C3386nv.m17636w("Please set end drawable using R.attr#closeIcon.");
                throw null;
            }
            if (attributeSet.getAttributeValue("http://schemas.android.com/apk/res/android", "drawableRight") != null) {
                C3386nv.m17636w("Please set end drawable using R.attr#closeIcon.");
                throw null;
            }
            if (!attributeSet.getAttributeBooleanValue("http://schemas.android.com/apk/res/android", "singleLine", true) || attributeSet.getAttributeIntValue("http://schemas.android.com/apk/res/android", "lines", 1) != 1 || attributeSet.getAttributeIntValue("http://schemas.android.com/apk/res/android", "minLines", 1) != 1 || attributeSet.getAttributeIntValue("http://schemas.android.com/apk/res/android", "maxLines", 1) != 1) {
                C3386nv.m17636w("Chip does not support multi-line text");
                throw null;
            }
            if (attributeSet.getAttributeIntValue("http://schemas.android.com/apk/res/android", "gravity", 8388627) != 8388627) {
                Log.w("Chip", "Chip text must be vertically center and start aligned");
            }
        }
        f11 f11Var = new f11(context2, attributeSet, i);
        TypedArray typedArrayM10751d = dy9.m10751d(f11Var.f38182J0, attributeSet, R$styleable.Chip, i, i2, new int[0]);
        f11Var.f38216j1 = typedArrayM10751d.hasValue(R$styleable.Chip_shapeAppearance);
        int i3 = R$styleable.Chip_chipSurfaceColor;
        Context context3 = f11Var.f38182J0;
        ColorStateList colorStateListM19054x = pb1.m19054x(context3, typedArrayM10751d, i3);
        if (f11Var.f38201c0 != colorStateListM19054x) {
            f11Var.f38201c0 = colorStateListM19054x;
            f11Var.onStateChange(f11Var.getState());
        }
        ColorStateList colorStateListM19054x2 = pb1.m19054x(context3, typedArrayM10751d, R$styleable.Chip_chipBackgroundColor);
        if (f11Var.f38203d0 != colorStateListM19054x2) {
            f11Var.f38203d0 = colorStateListM19054x2;
            f11Var.onStateChange(f11Var.getState());
        }
        float dimension = typedArrayM10751d.getDimension(R$styleable.Chip_chipMinHeight, 0.0f);
        if (f11Var.f38205e0 != dimension) {
            f11Var.f38205e0 = dimension;
            f11Var.invalidateSelf();
            f11Var.m11457M();
        }
        if (typedArrayM10751d.hasValue(R$styleable.Chip_chipCornerRadius)) {
            f11Var.m11463S(typedArrayM10751d.getDimension(R$styleable.Chip_chipCornerRadius, 0.0f));
        }
        f11Var.m11468X(pb1.m19054x(context3, typedArrayM10751d, R$styleable.Chip_chipStrokeColor));
        f11Var.m11469Y(typedArrayM10751d.getDimension(R$styleable.Chip_chipStrokeWidth, 0.0f));
        f11Var.m11480i0(pb1.m19054x(context3, typedArrayM10751d, R$styleable.Chip_rippleColor));
        String text = typedArrayM10751d.getText(R$styleable.Chip_android_text);
        text = text == null ? "" : text;
        boolean zEquals = TextUtils.equals(f11Var.f38215j0, text);
        au9 au9Var = f11Var.f38188P0;
        if (!zEquals) {
            f11Var.f38215j0 = text;
            au9Var.f7527e = true;
            f11Var.invalidateSelf();
            f11Var.m11457M();
        }
        int i4 = R$styleable.Chip_android_textAppearance;
        if (typedArrayM10751d.hasValue(i4) && (resourceId = typedArrayM10751d.getResourceId(i4, 0)) != 0) {
            us9Var = new us9(context3, resourceId);
        }
        us9Var.f64309l = typedArrayM10751d.getDimension(R$styleable.Chip_android_textSize, us9Var.f64309l);
        int i5 = R$styleable.Chip_fontVariationSettings;
        i5 = typedArrayM10751d.hasValue(i5) ? i5 : R$styleable.Chip_android_fontVariationSettings;
        if (typedArrayM10751d.hasValue(i5)) {
            us9Var.f64300c = typedArrayM10751d.getString(i5);
        }
        au9Var.m3068c(us9Var, context3);
        int i6 = typedArrayM10751d.getInt(R$styleable.Chip_android_ellipsize, 0);
        if (i6 == 1) {
            f11Var.f38210g1 = TextUtils.TruncateAt.START;
        } else if (i6 == 2) {
            f11Var.f38210g1 = TextUtils.TruncateAt.MIDDLE;
        } else if (i6 == 3) {
            f11Var.f38210g1 = TextUtils.TruncateAt.END;
        }
        f11Var.m11467W(typedArrayM10751d.getBoolean(R$styleable.Chip_chipIconVisible, false));
        if (attributeSet != null && attributeSet.getAttributeValue("http://schemas.android.com/apk/res-auto", "chipIconEnabled") != null && attributeSet.getAttributeValue("http://schemas.android.com/apk/res-auto", "chipIconVisible") == null) {
            f11Var.m11467W(typedArrayM10751d.getBoolean(R$styleable.Chip_chipIconEnabled, false));
        }
        f11Var.m11464T(pb1.m19013A(context3, typedArrayM10751d, R$styleable.Chip_chipIcon));
        if (typedArrayM10751d.hasValue(R$styleable.Chip_chipIconTint)) {
            f11Var.m11466V(pb1.m19054x(context3, typedArrayM10751d, R$styleable.Chip_chipIconTint));
        }
        f11Var.m11465U(typedArrayM10751d.getDimension(R$styleable.Chip_chipIconSize, -1.0f));
        f11Var.m11477f0(typedArrayM10751d.getBoolean(R$styleable.Chip_closeIconVisible, false));
        if (attributeSet != null && attributeSet.getAttributeValue("http://schemas.android.com/apk/res-auto", "closeIconEnabled") != null && attributeSet.getAttributeValue("http://schemas.android.com/apk/res-auto", "closeIconVisible") == null) {
            f11Var.m11477f0(typedArrayM10751d.getBoolean(R$styleable.Chip_closeIconEnabled, false));
        }
        f11Var.m11470Z(pb1.m19013A(context3, typedArrayM10751d, R$styleable.Chip_closeIcon));
        f11Var.m11476e0(pb1.m19054x(context3, typedArrayM10751d, R$styleable.Chip_closeIconTint));
        f11Var.m11473b0(typedArrayM10751d.getDimension(R$styleable.Chip_closeIconSize, 0.0f));
        f11Var.m11459O(typedArrayM10751d.getBoolean(R$styleable.Chip_android_checkable, false));
        f11Var.m11462R(typedArrayM10751d.getBoolean(R$styleable.Chip_checkedIconVisible, false));
        if (attributeSet != null && attributeSet.getAttributeValue("http://schemas.android.com/apk/res-auto", "checkedIconEnabled") != null && attributeSet.getAttributeValue("http://schemas.android.com/apk/res-auto", "checkedIconVisible") == null) {
            f11Var.m11462R(typedArrayM10751d.getBoolean(R$styleable.Chip_checkedIconEnabled, false));
        }
        f11Var.m11460P(pb1.m19013A(context3, typedArrayM10751d, R$styleable.Chip_checkedIcon));
        if (typedArrayM10751d.hasValue(R$styleable.Chip_checkedIconTint)) {
            f11Var.m11461Q(pb1.m19054x(context3, typedArrayM10751d, R$styleable.Chip_checkedIconTint));
        }
        f11Var.f38232z0 = s36.m21047a(context3, typedArrayM10751d, R$styleable.Chip_showMotionSpec);
        f11Var.f38173A0 = s36.m21047a(context3, typedArrayM10751d, R$styleable.Chip_hideMotionSpec);
        float dimension2 = typedArrayM10751d.getDimension(R$styleable.Chip_chipStartPadding, 0.0f);
        if (f11Var.f38174B0 != dimension2) {
            f11Var.f38174B0 = dimension2;
            f11Var.invalidateSelf();
            f11Var.m11457M();
        }
        f11Var.m11479h0(typedArrayM10751d.getDimension(R$styleable.Chip_iconStartPadding, 0.0f));
        f11Var.m11478g0(typedArrayM10751d.getDimension(R$styleable.Chip_iconEndPadding, 0.0f));
        float dimension3 = typedArrayM10751d.getDimension(R$styleable.Chip_textStartPadding, 0.0f);
        if (f11Var.f38177E0 != dimension3) {
            f11Var.f38177E0 = dimension3;
            f11Var.invalidateSelf();
            f11Var.m11457M();
        }
        float dimension4 = typedArrayM10751d.getDimension(R$styleable.Chip_textEndPadding, 0.0f);
        if (f11Var.f38178F0 != dimension4) {
            f11Var.f38178F0 = dimension4;
            f11Var.invalidateSelf();
            f11Var.m11457M();
        }
        f11Var.m11474c0(typedArrayM10751d.getDimension(R$styleable.Chip_closeIconStartPadding, 0.0f));
        f11Var.m11472a0(typedArrayM10751d.getDimension(R$styleable.Chip_closeIconEndPadding, 0.0f));
        float dimension5 = typedArrayM10751d.getDimension(R$styleable.Chip_chipEndPadding, 0.0f);
        if (f11Var.f38181I0 != dimension5) {
            f11Var.f38181I0 = dimension5;
            f11Var.invalidateSelf();
            f11Var.m11457M();
        }
        f11Var.f38214i1 = typedArrayM10751d.getDimensionPixelSize(R$styleable.Chip_android_maxWidth, Integer.MAX_VALUE);
        typedArrayM10751d.recycle();
        int[] iArr = R$styleable.Chip;
        dy9.m10748a(context2, attributeSet, i, i2);
        dy9.m10749b(context2, attributeSet, iArr, i, i2, new int[0]);
        TypedArray typedArrayObtainStyledAttributes = context2.obtainStyledAttributes(attributeSet, iArr, i, i2);
        this.f12857I = typedArrayObtainStyledAttributes.getBoolean(R$styleable.Chip_ensureMinTouchTargetSize, false);
        this.f12859K = (int) Math.ceil(typedArrayObtainStyledAttributes.getDimension(R$styleable.Chip_chipMinTouchTargetSize, xwc.m24750W(context2)));
        typedArrayObtainStyledAttributes.recycle();
        setChipDrawable(f11Var);
        f11Var.m12075s(getElevation());
        int[] iArr2 = R$styleable.Chip;
        dy9.m10748a(context2, attributeSet, i, i2);
        dy9.m10749b(context2, attributeSet, iArr2, i, i2, new int[0]);
        TypedArray typedArrayObtainStyledAttributes2 = context2.obtainStyledAttributes(attributeSet, iArr2, i, i2);
        boolean zHasValue = typedArrayObtainStyledAttributes2.hasValue(R$styleable.Chip_shapeAppearance);
        typedArrayObtainStyledAttributes2.recycle();
        this.f12861M = new c11(this, this);
        m6103e();
        if (!zHasValue) {
            setOutlineProvider(new b11(this));
        }
        setChecked(this.f12871j);
        setText(f11Var.f38215j0);
        setEllipsize(f11Var.f38210g1);
        m6106h();
        if (!this.f12866e.f38212h1) {
            setLines(1);
            setHorizontallyScrolling(true);
        }
        setGravity(8388627);
        m6105g();
        if (this.f12857I) {
            setMinHeight(this.f12859K);
        }
        this.f12858J = getLayoutDirection();
        super.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() { // from class: z01
            @Override // android.widget.CompoundButton.OnCheckedChangeListener
            public final void onCheckedChanged(CompoundButton compoundButton, boolean z) {
                CompoundButton.OnCheckedChangeListener onCheckedChangeListener = this.f70723a.f12870i;
                if (onCheckedChangeListener != null) {
                    onCheckedChangeListener.onCheckedChanged(compoundButton, z);
                }
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public RectF getCloseIconTouchBounds() {
        RectF rectF = this.f12864P;
        rectF.setEmpty();
        if (m6102d() && this.f12869h != null) {
            f11 f11Var = this.f12866e;
            Rect bounds = f11Var.getBounds();
            rectF.setEmpty();
            if (f11Var.m11483l0()) {
                float f = f11Var.f38181I0 + f11Var.f38180H0 + f11Var.f38226t0 + f11Var.f38179G0 + f11Var.f38178F0;
                if (f11Var.getLayoutDirection() == 0) {
                    float f2 = bounds.right;
                    rectF.right = f2;
                    rectF.left = f2 - f;
                } else {
                    float f3 = bounds.left;
                    rectF.left = f3;
                    rectF.right = f3 + f;
                }
                rectF.top = bounds.top;
                rectF.bottom = bounds.bottom;
            }
        }
        return rectF;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public Rect getCloseIconTouchBoundsInt() {
        RectF closeIconTouchBounds = getCloseIconTouchBounds();
        int i = (int) closeIconTouchBounds.left;
        int i2 = (int) closeIconTouchBounds.top;
        int i3 = (int) closeIconTouchBounds.right;
        int i4 = (int) closeIconTouchBounds.bottom;
        Rect rect = this.f12863O;
        rect.set(i, i2, i3, i4);
        return rect;
    }

    private us9 getTextAppearance() {
        f11 f11Var = this.f12866e;
        if (f11Var != null) {
            return f11Var.f38188P0.f7529g;
        }
        return null;
    }

    private void setCloseIconHovered(boolean z) {
        if (this.f12873l != z) {
            this.f12873l = z;
            refreshDrawableState();
        }
    }

    private void setCloseIconPressed(boolean z) {
        if (this.f12872k != z) {
            this.f12872k = z;
            refreshDrawableState();
        }
    }

    /* JADX INFO: renamed from: c */
    public final void m6101c(int i) {
        this.f12859K = i;
        if (!this.f12857I) {
            InsetDrawable insetDrawable = this.f12867f;
            if (insetDrawable == null) {
                m6104f();
                return;
            } else {
                if (insetDrawable != null) {
                    this.f12867f = null;
                    setMinWidth(0);
                    setMinHeight((int) getChipMinHeight());
                    m6104f();
                    return;
                }
                return;
            }
        }
        int iMax = Math.max(0, i - ((int) this.f12866e.f38205e0));
        int iMax2 = Math.max(0, i - this.f12866e.getIntrinsicWidth());
        if (iMax2 <= 0 && iMax <= 0) {
            InsetDrawable insetDrawable2 = this.f12867f;
            if (insetDrawable2 == null) {
                m6104f();
                return;
            } else {
                if (insetDrawable2 != null) {
                    this.f12867f = null;
                    setMinWidth(0);
                    setMinHeight((int) getChipMinHeight());
                    m6104f();
                    return;
                }
                return;
            }
        }
        int i2 = iMax2 > 0 ? iMax2 / 2 : 0;
        int i3 = iMax > 0 ? iMax / 2 : 0;
        if (this.f12867f != null) {
            Rect rect = new Rect();
            this.f12867f.getPadding(rect);
            if (rect.top == i3 && rect.bottom == i3 && rect.left == i2 && rect.right == i2) {
                m6104f();
                return;
            }
        }
        if (getMinHeight() != i) {
            setMinHeight(i);
        }
        if (getMinWidth() != i) {
            setMinWidth(i);
        }
        this.f12867f = new InsetDrawable((Drawable) this.f12866e, i2, i3, i2, i3);
        m6104f();
    }

    /* JADX INFO: renamed from: d */
    public final boolean m6102d() {
        f11 f11Var = this.f12866e;
        if (f11Var == null) {
            return false;
        }
        Drawable drawable = f11Var.f38223q0;
        if (drawable == null) {
            drawable = null;
        }
        return drawable != null;
    }

    @Override // android.view.View
    public final boolean dispatchHoverEvent(MotionEvent motionEvent) {
        if (this.f12862N) {
            return this.f12861M.m24719m(motionEvent) || super.dispatchHoverEvent(motionEvent);
        }
        return super.dispatchHoverEvent(motionEvent);
    }

    /* JADX WARN: Code duplicated, block: B:31:0x0057  */
    /* JADX WARN: Code duplicated, block: B:37:0x0067  */
    @Override // android.view.View
    public final boolean dispatchKeyEvent(KeyEvent keyEvent) {
        int i;
        if (!this.f12862N) {
            return super.dispatchKeyEvent(keyEvent);
        }
        c11 c11Var = this.f12861M;
        c11Var.getClass();
        boolean zM24720p = false;
        int i2 = 0;
        zM24720p = false;
        zM24720p = false;
        zM24720p = false;
        zM24720p = false;
        zM24720p = false;
        if (keyEvent.getAction() != 1) {
            int keyCode = keyEvent.getKeyCode();
            if (keyCode != 61) {
                int i3 = 66;
                if (keyCode != 66) {
                    switch (keyCode) {
                        case 19:
                        case 20:
                        case 21:
                        case 22:
                            if (keyEvent.hasNoModifiers()) {
                                if (keyCode == 19) {
                                    i3 = 33;
                                } else if (keyCode == 21) {
                                    i3 = 17;
                                } else if (keyCode != 22) {
                                    i3 = 130;
                                }
                                int repeatCount = keyEvent.getRepeatCount() + 1;
                                boolean z = false;
                                while (i2 < repeatCount && c11Var.m24720p(i3, null)) {
                                    i2++;
                                    z = true;
                                }
                                zM24720p = z;
                            }
                            break;
                        case DescriptorProtos.FileOptions.DEPRECATED_FIELD_NUMBER /* 23 */:
                            if (keyEvent.hasNoModifiers() && keyEvent.getRepeatCount() == 0) {
                                i = c11Var.f68901l;
                                if (i != Integer.MIN_VALUE) {
                                    c11Var.mo4269r(i, 16, null);
                                }
                                zM24720p = true;
                            }
                            break;
                    }
                } else if (keyEvent.hasNoModifiers()) {
                    i = c11Var.f68901l;
                    if (i != Integer.MIN_VALUE) {
                        c11Var.mo4269r(i, 16, null);
                    }
                    zM24720p = true;
                }
            } else if (keyEvent.hasNoModifiers()) {
                zM24720p = c11Var.m24720p(2, null);
            } else if (keyEvent.hasModifiers(1)) {
                zM24720p = c11Var.m24720p(1, null);
            }
        }
        if (!zM24720p || c11Var.f68901l == Integer.MIN_VALUE) {
            return super.dispatchKeyEvent(keyEvent);
        }
        return true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v0, types: [boolean, int] */
    @Override // p000.C3083hp, android.widget.CompoundButton, android.widget.TextView, android.view.View
    public final void drawableStateChanged() {
        int i;
        super.drawableStateChanged();
        f11 f11Var = this.f12866e;
        boolean zM11475d0 = false;
        int i2 = 0;
        zM11475d0 = false;
        if (f11Var != null && f11.m11450L(f11Var.f38223q0)) {
            f11 f11Var2 = this.f12866e;
            ?? IsEnabled = isEnabled();
            if (this.f12856H) {
                i = IsEnabled;
                i = IsEnabled + 1;
            }
            i = IsEnabled;
            int i3 = i;
            if (this.f12873l) {
                i3 = i + 1;
            }
            int i4 = i3;
            if (this.f12872k) {
                i4 = i3 + 1;
            }
            int i5 = i4;
            if (isChecked()) {
                i5 = i4 + 1;
            }
            int[] iArr = new int[i5];
            if (isEnabled()) {
                iArr[0] = 16842910;
                i2 = 1;
            }
            if (this.f12856H) {
                iArr[i2] = 16842908;
                i2++;
            }
            if (this.f12873l) {
                iArr[i2] = 16843623;
                i2++;
            }
            if (this.f12872k) {
                iArr[i2] = 16842919;
                i2++;
            }
            if (isChecked()) {
                iArr[i2] = 16842913;
            }
            zM11475d0 = f11Var2.m11475d0(iArr);
        }
        if (zM11475d0) {
            invalidate();
        }
    }

    /* JADX INFO: renamed from: e */
    public final void m6103e() {
        f11 f11Var;
        if (!m6102d() || (f11Var = this.f12866e) == null || !f11Var.f38222p0 || this.f12869h == null) {
            dta.m10640k(this, null);
            this.f12862N = false;
        } else {
            dta.m10640k(this, this.f12861M);
            this.f12862N = true;
        }
    }

    /* JADX INFO: renamed from: f */
    public final void m6104f() {
        RippleDrawable rippleDrawable = new RippleDrawable(do7.m10516C(this.f12866e.f38213i0), getBackgroundDrawable(), null);
        FocusRingDrawable.m6147f(getContext(), rippleDrawable, this.f12866e);
        this.f12868g = rippleDrawable;
        this.f12866e.getClass();
        setBackground(this.f12868g);
        m6105g();
    }

    /* JADX INFO: renamed from: g */
    public final void m6105g() {
        f11 f11Var;
        if (TextUtils.isEmpty(getText()) || (f11Var = this.f12866e) == null) {
            return;
        }
        int iM11455I = (int) (f11Var.m11455I() + f11Var.f38181I0 + f11Var.f38178F0);
        f11 f11Var2 = this.f12866e;
        int iM11454H = (int) (f11Var2.m11454H() + f11Var2.f38174B0 + f11Var2.f38177E0);
        if (this.f12867f != null) {
            Rect rect = new Rect();
            this.f12867f.getPadding(rect);
            iM11454H += rect.left;
            iM11455I += rect.right;
        }
        setPaddingRelative(iM11454H, getPaddingTop(), iM11455I, getPaddingBottom());
    }

    @Override // android.widget.CheckBox, android.widget.CompoundButton, android.widget.Button, android.widget.TextView, android.view.View
    public CharSequence getAccessibilityClassName() {
        if (!TextUtils.isEmpty(this.f12860L)) {
            return this.f12860L;
        }
        f11 f11Var = this.f12866e;
        if (f11Var == null || !f11Var.f38228v0) {
            return isClickable() ? "android.widget.Button" : "android.view.View";
        }
        getParent();
        return "android.widget.Button";
    }

    public Drawable getBackgroundDrawable() {
        InsetDrawable insetDrawable = this.f12867f;
        return insetDrawable == null ? this.f12866e : insetDrawable;
    }

    public Drawable getCheckedIcon() {
        f11 f11Var = this.f12866e;
        if (f11Var != null) {
            return f11Var.f38230x0;
        }
        return null;
    }

    public ColorStateList getCheckedIconTint() {
        f11 f11Var = this.f12866e;
        if (f11Var != null) {
            return f11Var.f38231y0;
        }
        return null;
    }

    public ColorStateList getChipBackgroundColor() {
        f11 f11Var = this.f12866e;
        if (f11Var != null) {
            return f11Var.f38203d0;
        }
        return null;
    }

    public float getChipCornerRadius() {
        f11 f11Var = this.f12866e;
        if (f11Var != null) {
            return Math.max(0.0f, f11Var.m11456J());
        }
        return 0.0f;
    }

    public Drawable getChipDrawable() {
        return this.f12866e;
    }

    public float getChipEndPadding() {
        f11 f11Var = this.f12866e;
        if (f11Var != null) {
            return f11Var.f38181I0;
        }
        return 0.0f;
    }

    public Drawable getChipIcon() {
        Drawable drawable;
        f11 f11Var = this.f12866e;
        if (f11Var == null || (drawable = f11Var.f38218l0) == null) {
            return null;
        }
        return drawable;
    }

    public float getChipIconSize() {
        f11 f11Var = this.f12866e;
        if (f11Var != null) {
            return f11Var.f38220n0;
        }
        return 0.0f;
    }

    public ColorStateList getChipIconTint() {
        f11 f11Var = this.f12866e;
        if (f11Var != null) {
            return f11Var.f38219m0;
        }
        return null;
    }

    public float getChipMinHeight() {
        f11 f11Var = this.f12866e;
        if (f11Var != null) {
            return f11Var.f38205e0;
        }
        return 0.0f;
    }

    public float getChipStartPadding() {
        f11 f11Var = this.f12866e;
        if (f11Var != null) {
            return f11Var.f38174B0;
        }
        return 0.0f;
    }

    public ColorStateList getChipStrokeColor() {
        f11 f11Var = this.f12866e;
        if (f11Var != null) {
            return f11Var.f38209g0;
        }
        return null;
    }

    public float getChipStrokeWidth() {
        f11 f11Var = this.f12866e;
        if (f11Var != null) {
            return f11Var.f38211h0;
        }
        return 0.0f;
    }

    @Deprecated
    public CharSequence getChipText() {
        return getText();
    }

    public Drawable getCloseIcon() {
        Drawable drawable;
        f11 f11Var = this.f12866e;
        if (f11Var == null || (drawable = f11Var.f38223q0) == null) {
            return null;
        }
        return drawable;
    }

    public CharSequence getCloseIconContentDescription() {
        f11 f11Var = this.f12866e;
        if (f11Var != null) {
            return f11Var.f38227u0;
        }
        return null;
    }

    public float getCloseIconEndPadding() {
        f11 f11Var = this.f12866e;
        if (f11Var != null) {
            return f11Var.f38180H0;
        }
        return 0.0f;
    }

    public float getCloseIconSize() {
        f11 f11Var = this.f12866e;
        if (f11Var != null) {
            return f11Var.f38226t0;
        }
        return 0.0f;
    }

    public float getCloseIconStartPadding() {
        f11 f11Var = this.f12866e;
        if (f11Var != null) {
            return f11Var.f38179G0;
        }
        return 0.0f;
    }

    public ColorStateList getCloseIconTint() {
        f11 f11Var = this.f12866e;
        if (f11Var != null) {
            return f11Var.f38225s0;
        }
        return null;
    }

    @Override // android.widget.TextView
    public TextUtils.TruncateAt getEllipsize() {
        f11 f11Var = this.f12866e;
        if (f11Var != null) {
            return f11Var.f38210g1;
        }
        return null;
    }

    @Override // android.widget.TextView, android.view.View
    public final void getFocusedRect(Rect rect) {
        if (this.f12862N) {
            c11 c11Var = this.f12861M;
            if (c11Var.f68901l == 1 || c11Var.f68900k == 1) {
                rect.set(getCloseIconTouchBoundsInt());
                return;
            }
        }
        super.getFocusedRect(rect);
    }

    @Override // android.widget.TextView
    public String getFontVariationSettings() {
        f11 f11Var = this.f12866e;
        if (f11Var == null) {
            return super.getFontVariationSettings();
        }
        us9 us9Var = f11Var.f38188P0.f7529g;
        if (us9Var != null) {
            return us9Var.f64300c;
        }
        return null;
    }

    public s36 getHideMotionSpec() {
        f11 f11Var = this.f12866e;
        if (f11Var != null) {
            return f11Var.f38173A0;
        }
        return null;
    }

    public float getIconEndPadding() {
        f11 f11Var = this.f12866e;
        if (f11Var != null) {
            return f11Var.f38176D0;
        }
        return 0.0f;
    }

    public float getIconStartPadding() {
        f11 f11Var = this.f12866e;
        if (f11Var != null) {
            return f11Var.f38175C0;
        }
        return 0.0f;
    }

    public ColorStateList getRippleColor() {
        f11 f11Var = this.f12866e;
        if (f11Var != null) {
            return f11Var.f38213i0;
        }
        return null;
    }

    public r39 getShapeAppearanceModel() {
        return this.f12866e.m12067k();
    }

    public s36 getShowMotionSpec() {
        f11 f11Var = this.f12866e;
        if (f11Var != null) {
            return f11Var.f38232z0;
        }
        return null;
    }

    public float getTextEndPadding() {
        f11 f11Var = this.f12866e;
        if (f11Var != null) {
            return f11Var.f38178F0;
        }
        return 0.0f;
    }

    public float getTextStartPadding() {
        f11 f11Var = this.f12866e;
        if (f11Var != null) {
            return f11Var.f38177E0;
        }
        return 0.0f;
    }

    /* JADX INFO: renamed from: h */
    public final void m6106h() {
        TextPaint paint = getPaint();
        f11 f11Var = this.f12866e;
        if (f11Var != null) {
            paint.drawableState = f11Var.getState();
        }
        us9 textAppearance = getTextAppearance();
        if (textAppearance != null) {
            textAppearance.m22903d(getContext(), paint, this.f12865Q);
        }
    }

    @Override // android.widget.TextView, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        AbstractC3184kh.m15200G(this, this.f12866e);
    }

    @Override // android.widget.CompoundButton, android.widget.TextView, android.view.View
    public final int[] onCreateDrawableState(int i) {
        int[] iArrOnCreateDrawableState = super.onCreateDrawableState(i + 2);
        if (isChecked()) {
            View.mergeDrawableStates(iArrOnCreateDrawableState, f12854T);
        }
        f11 f11Var = this.f12866e;
        if (f11Var != null && f11Var.f38228v0) {
            View.mergeDrawableStates(iArrOnCreateDrawableState, f12855U);
        }
        return iArrOnCreateDrawableState;
    }

    @Override // android.widget.TextView, android.view.View
    public final void onFocusChanged(boolean z, int i, Rect rect) {
        super.onFocusChanged(z, i, rect);
        if (this.f12862N) {
            c11 c11Var = this.f12861M;
            int i2 = c11Var.f68901l;
            if (i2 != Integer.MIN_VALUE) {
                c11Var.m24716j(i2);
            }
            if (z) {
                c11Var.m24720p(i, rect);
            }
        }
    }

    @Override // android.view.View
    public final boolean onHoverEvent(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 7) {
            setCloseIconHovered(getCloseIconTouchBounds().contains(motionEvent.getX(), motionEvent.getY()));
        } else if (actionMasked == 10) {
            setCloseIconHovered(false);
        }
        return super.onHoverEvent(motionEvent);
    }

    @Override // android.view.View
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setClassName(getAccessibilityClassName());
        f11 f11Var = this.f12866e;
        accessibilityNodeInfo.setCheckable(f11Var != null && f11Var.f38228v0);
        accessibilityNodeInfo.setClickable(isClickable());
        getParent();
    }

    @Override // android.widget.Button, android.widget.TextView, android.view.View
    public final PointerIcon onResolvePointerIcon(MotionEvent motionEvent, int i) {
        return (getCloseIconTouchBounds().contains(motionEvent.getX(), motionEvent.getY()) && isEnabled()) ? PointerIcon.getSystemIcon(getContext(), 1002) : super.onResolvePointerIcon(motionEvent, i);
    }

    @Override // android.widget.TextView, android.view.View
    public final void onRtlPropertiesChanged(int i) {
        super.onRtlPropertiesChanged(i);
        if (this.f12858J != i) {
            this.f12858J = i;
            m6105g();
        }
    }

    @Override // android.widget.TextView, android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        boolean z;
        int actionMasked = motionEvent.getActionMasked();
        boolean zContains = getCloseIconTouchBounds().contains(motionEvent.getX(), motionEvent.getY());
        if (actionMasked != 0) {
            if (actionMasked != 1) {
                if (actionMasked != 2) {
                    if (actionMasked != 3) {
                    }
                } else if (this.f12872k) {
                    if (!zContains) {
                        setCloseIconPressed(false);
                    }
                    z = true;
                }
                z = false;
            } else {
                if (this.f12872k) {
                    playSoundEffect(0);
                    View.OnClickListener onClickListener = this.f12869h;
                    if (onClickListener != null) {
                        onClickListener.onClick(this);
                    }
                    if (this.f12862N) {
                        this.f12861M.m24723w(1, 1);
                    }
                    z = true;
                }
                setCloseIconPressed(false);
            }
            z = false;
            setCloseIconPressed(false);
        } else if (zContains) {
            setCloseIconPressed(true);
            z = true;
        } else {
            z = false;
        }
        return z || super.onTouchEvent(motionEvent);
    }

    public void setAccessibilityClassName(CharSequence charSequence) {
        this.f12860L = charSequence;
    }

    @Override // android.view.View
    public void setBackground(Drawable drawable) {
        if (drawable == getBackgroundDrawable() || drawable == this.f12868g) {
            super.setBackground(drawable);
        } else {
            Log.w("Chip", "Do not set the background; Chip manages its own background drawable.");
        }
    }

    @Override // android.view.View
    public void setBackgroundColor(int i) {
        Log.w("Chip", "Do not set the background color; Chip manages its own background drawable.");
    }

    @Override // p000.C3083hp, android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
        if (drawable == getBackgroundDrawable() || drawable == this.f12868g) {
            super.setBackgroundDrawable(drawable);
        } else {
            Log.w("Chip", "Do not set the background drawable; Chip manages its own background drawable.");
        }
    }

    @Override // p000.C3083hp, android.view.View
    public void setBackgroundResource(int i) {
        Log.w("Chip", "Do not set the background resource; Chip manages its own background drawable.");
    }

    @Override // android.view.View
    public void setBackgroundTintList(ColorStateList colorStateList) {
        Log.w("Chip", "Do not set the background tint list; Chip manages its own background drawable.");
    }

    @Override // android.view.View
    public void setBackgroundTintMode(PorterDuff.Mode mode) {
        Log.w("Chip", "Do not set the background tint mode; Chip manages its own background drawable.");
    }

    public void setCheckable(boolean z) {
        f11 f11Var = this.f12866e;
        if (f11Var != null) {
            f11Var.m11459O(z);
        }
    }

    public void setCheckableResource(int i) {
        f11 f11Var = this.f12866e;
        if (f11Var != null) {
            f11Var.m11459O(f11Var.f38182J0.getResources().getBoolean(i));
        }
    }

    @Override // android.widget.CompoundButton, android.widget.Checkable
    public void setChecked(boolean z) {
        f11 f11Var = this.f12866e;
        if (f11Var == null) {
            this.f12871j = z;
        } else if (f11Var.f38228v0) {
            super.setChecked(z);
        }
    }

    public void setCheckedIcon(Drawable drawable) {
        f11 f11Var = this.f12866e;
        if (f11Var != null) {
            f11Var.m11460P(drawable);
        }
    }

    @Deprecated
    public void setCheckedIconEnabled(boolean z) {
        setCheckedIconVisible(z);
    }

    @Deprecated
    public void setCheckedIconEnabledResource(int i) {
        setCheckedIconVisible(i);
    }

    public void setCheckedIconResource(int i) {
        f11 f11Var = this.f12866e;
        if (f11Var != null) {
            f11Var.m11460P(bna.m3932U(f11Var.f38182J0, i));
        }
    }

    public void setCheckedIconTint(ColorStateList colorStateList) {
        f11 f11Var = this.f12866e;
        if (f11Var != null) {
            f11Var.m11461Q(colorStateList);
        }
    }

    public void setCheckedIconTintResource(int i) {
        f11 f11Var = this.f12866e;
        if (f11Var != null) {
            f11Var.m11461Q(do7.m10540p(f11Var.f38182J0, i));
        }
    }

    public void setCheckedIconVisible(int i) {
        f11 f11Var = this.f12866e;
        if (f11Var != null) {
            f11Var.m11462R(f11Var.f38182J0.getResources().getBoolean(i));
        }
    }

    public void setChipBackgroundColor(ColorStateList colorStateList) {
        f11 f11Var = this.f12866e;
        if (f11Var == null || f11Var.f38203d0 == colorStateList) {
            return;
        }
        f11Var.f38203d0 = colorStateList;
        f11Var.onStateChange(f11Var.getState());
    }

    public void setChipBackgroundColorResource(int i) {
        ColorStateList colorStateListM10540p;
        f11 f11Var = this.f12866e;
        if (f11Var == null || f11Var.f38203d0 == (colorStateListM10540p = do7.m10540p(f11Var.f38182J0, i))) {
            return;
        }
        f11Var.f38203d0 = colorStateListM10540p;
        f11Var.onStateChange(f11Var.getState());
    }

    @Deprecated
    public void setChipCornerRadius(float f) {
        f11 f11Var = this.f12866e;
        if (f11Var != null) {
            f11Var.m11463S(f);
        }
    }

    @Deprecated
    public void setChipCornerRadiusResource(int i) {
        f11 f11Var = this.f12866e;
        if (f11Var != null) {
            f11Var.m11463S(f11Var.f38182J0.getResources().getDimension(i));
        }
    }

    public void setChipDrawable(f11 f11Var) {
        f11 f11Var2 = this.f12866e;
        if (f11Var2 != f11Var) {
            if (f11Var2 != null) {
                f11Var2.f38208f1 = new WeakReference(null);
            }
            this.f12866e = f11Var;
            f11Var.f38212h1 = false;
            f11Var.f38208f1 = new WeakReference(this);
            m6101c(this.f12859K);
        }
    }

    public void setChipEndPadding(float f) {
        f11 f11Var = this.f12866e;
        if (f11Var == null || f11Var.f38181I0 == f) {
            return;
        }
        f11Var.f38181I0 = f;
        f11Var.invalidateSelf();
        f11Var.m11457M();
    }

    public void setChipEndPaddingResource(int i) {
        f11 f11Var = this.f12866e;
        if (f11Var != null) {
            float dimension = f11Var.f38182J0.getResources().getDimension(i);
            if (f11Var.f38181I0 != dimension) {
                f11Var.f38181I0 = dimension;
                f11Var.invalidateSelf();
                f11Var.m11457M();
            }
        }
    }

    public void setChipIcon(Drawable drawable) {
        f11 f11Var = this.f12866e;
        if (f11Var != null) {
            f11Var.m11464T(drawable);
        }
    }

    @Deprecated
    public void setChipIconEnabled(boolean z) {
        setChipIconVisible(z);
    }

    @Deprecated
    public void setChipIconEnabledResource(int i) {
        setChipIconVisible(i);
    }

    public void setChipIconResource(int i) {
        f11 f11Var = this.f12866e;
        if (f11Var != null) {
            f11Var.m11464T(bna.m3932U(f11Var.f38182J0, i));
        }
    }

    public void setChipIconSize(float f) {
        f11 f11Var = this.f12866e;
        if (f11Var != null) {
            f11Var.m11465U(f);
        }
    }

    public void setChipIconSizeResource(int i) {
        f11 f11Var = this.f12866e;
        if (f11Var != null) {
            f11Var.m11465U(f11Var.f38182J0.getResources().getDimension(i));
        }
    }

    public void setChipIconTint(ColorStateList colorStateList) {
        f11 f11Var = this.f12866e;
        if (f11Var != null) {
            f11Var.m11466V(colorStateList);
        }
    }

    public void setChipIconTintResource(int i) {
        f11 f11Var = this.f12866e;
        if (f11Var != null) {
            f11Var.m11466V(do7.m10540p(f11Var.f38182J0, i));
        }
    }

    public void setChipIconVisible(int i) {
        f11 f11Var = this.f12866e;
        if (f11Var != null) {
            f11Var.m11467W(f11Var.f38182J0.getResources().getBoolean(i));
        }
    }

    public void setChipMinHeight(float f) {
        f11 f11Var = this.f12866e;
        if (f11Var == null || f11Var.f38205e0 == f) {
            return;
        }
        f11Var.f38205e0 = f;
        f11Var.invalidateSelf();
        f11Var.m11457M();
    }

    public void setChipMinHeightResource(int i) {
        f11 f11Var = this.f12866e;
        if (f11Var != null) {
            float dimension = f11Var.f38182J0.getResources().getDimension(i);
            if (f11Var.f38205e0 != dimension) {
                f11Var.f38205e0 = dimension;
                f11Var.invalidateSelf();
                f11Var.m11457M();
            }
        }
    }

    public void setChipStartPadding(float f) {
        f11 f11Var = this.f12866e;
        if (f11Var == null || f11Var.f38174B0 == f) {
            return;
        }
        f11Var.f38174B0 = f;
        f11Var.invalidateSelf();
        f11Var.m11457M();
    }

    public void setChipStartPaddingResource(int i) {
        f11 f11Var = this.f12866e;
        if (f11Var != null) {
            float dimension = f11Var.f38182J0.getResources().getDimension(i);
            if (f11Var.f38174B0 != dimension) {
                f11Var.f38174B0 = dimension;
                f11Var.invalidateSelf();
                f11Var.m11457M();
            }
        }
    }

    public void setChipStrokeColor(ColorStateList colorStateList) {
        f11 f11Var = this.f12866e;
        if (f11Var != null) {
            f11Var.m11468X(colorStateList);
        }
    }

    public void setChipStrokeColorResource(int i) {
        f11 f11Var = this.f12866e;
        if (f11Var != null) {
            f11Var.m11468X(do7.m10540p(f11Var.f38182J0, i));
        }
    }

    public void setChipStrokeWidth(float f) {
        f11 f11Var = this.f12866e;
        if (f11Var != null) {
            f11Var.m11469Y(f);
        }
    }

    public void setChipStrokeWidthResource(int i) {
        f11 f11Var = this.f12866e;
        if (f11Var != null) {
            f11Var.m11469Y(f11Var.f38182J0.getResources().getDimension(i));
        }
    }

    @Deprecated
    public void setChipText(CharSequence charSequence) {
        setText(charSequence);
    }

    @Deprecated
    public void setChipTextResource(int i) {
        setText(getResources().getString(i));
    }

    public void setCloseIcon(Drawable drawable) {
        f11 f11Var = this.f12866e;
        if (f11Var != null) {
            f11Var.m11470Z(drawable);
        }
        m6103e();
    }

    public void setCloseIconContentDescription(CharSequence charSequence) {
        f11 f11Var = this.f12866e;
        if (f11Var == null || f11Var.f38227u0 == charSequence) {
            return;
        }
        String str = ic0.f43912b;
        ic0 ic0Var = TextUtils.getLayoutDirectionFromLocale(Locale.getDefault()) == 1 ? ic0.f43915e : ic0.f43914d;
        ic0Var.getClass();
        hg0 hg0Var = wt9.f67283a;
        f11Var.f38227u0 = ic0Var.m13761c(charSequence);
        f11Var.invalidateSelf();
    }

    @Deprecated
    public void setCloseIconEnabled(boolean z) {
        setCloseIconVisible(z);
    }

    @Deprecated
    public void setCloseIconEnabledResource(int i) {
        setCloseIconVisible(i);
    }

    public void setCloseIconEndPadding(float f) {
        f11 f11Var = this.f12866e;
        if (f11Var != null) {
            f11Var.m11472a0(f);
        }
    }

    public void setCloseIconEndPaddingResource(int i) {
        f11 f11Var = this.f12866e;
        if (f11Var != null) {
            f11Var.m11472a0(f11Var.f38182J0.getResources().getDimension(i));
        }
    }

    public void setCloseIconResource(int i) {
        f11 f11Var = this.f12866e;
        if (f11Var != null) {
            f11Var.m11470Z(bna.m3932U(f11Var.f38182J0, i));
        }
        m6103e();
    }

    public void setCloseIconSize(float f) {
        f11 f11Var = this.f12866e;
        if (f11Var != null) {
            f11Var.m11473b0(f);
        }
    }

    public void setCloseIconSizeResource(int i) {
        f11 f11Var = this.f12866e;
        if (f11Var != null) {
            f11Var.m11473b0(f11Var.f38182J0.getResources().getDimension(i));
        }
    }

    public void setCloseIconStartPadding(float f) {
        f11 f11Var = this.f12866e;
        if (f11Var != null) {
            f11Var.m11474c0(f);
        }
    }

    public void setCloseIconStartPaddingResource(int i) {
        f11 f11Var = this.f12866e;
        if (f11Var != null) {
            f11Var.m11474c0(f11Var.f38182J0.getResources().getDimension(i));
        }
    }

    public void setCloseIconTint(ColorStateList colorStateList) {
        f11 f11Var = this.f12866e;
        if (f11Var != null) {
            f11Var.m11476e0(colorStateList);
        }
    }

    public void setCloseIconTintResource(int i) {
        f11 f11Var = this.f12866e;
        if (f11Var != null) {
            f11Var.m11476e0(do7.m10540p(f11Var.f38182J0, i));
        }
    }

    public void setCloseIconVisible(int i) {
        setCloseIconVisible(getResources().getBoolean(i));
    }

    @Override // p000.C3083hp, android.widget.TextView
    public final void setCompoundDrawables(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        if (drawable != null) {
            C3386nv.m17636w("Please set start drawable using R.attr#chipIcon.");
        } else if (drawable3 == null) {
            super.setCompoundDrawables(drawable, drawable2, drawable3, drawable4);
        } else {
            C3386nv.m17636w("Please set end drawable using R.attr#closeIcon.");
        }
    }

    @Override // p000.C3083hp, android.widget.TextView
    public final void setCompoundDrawablesRelative(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        if (drawable != null) {
            C3386nv.m17636w("Please set start drawable using R.attr#chipIcon.");
        } else if (drawable3 == null) {
            super.setCompoundDrawablesRelative(drawable, drawable2, drawable3, drawable4);
        } else {
            C3386nv.m17636w("Please set end drawable using R.attr#closeIcon.");
        }
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawablesRelativeWithIntrinsicBounds(int i, int i2, int i3, int i4) {
        if (i != 0) {
            C3386nv.m17636w("Please set start drawable using R.attr#chipIcon.");
        } else if (i3 == 0) {
            super.setCompoundDrawablesRelativeWithIntrinsicBounds(i, i2, i3, i4);
        } else {
            C3386nv.m17636w("Please set end drawable using R.attr#closeIcon.");
        }
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawablesWithIntrinsicBounds(int i, int i2, int i3, int i4) {
        if (i != 0) {
            C3386nv.m17636w("Please set start drawable using R.attr#chipIcon.");
        } else if (i3 == 0) {
            super.setCompoundDrawablesWithIntrinsicBounds(i, i2, i3, i4);
        } else {
            C3386nv.m17636w("Please set end drawable using R.attr#closeIcon.");
        }
    }

    @Override // android.view.View
    public void setElevation(float f) {
        super.setElevation(f);
        f11 f11Var = this.f12866e;
        if (f11Var != null) {
            f11Var.m12075s(f);
        }
    }

    @Override // android.widget.TextView
    public void setEllipsize(TextUtils.TruncateAt truncateAt) {
        if (this.f12866e == null) {
            return;
        }
        if (truncateAt == TextUtils.TruncateAt.MARQUEE) {
            C3386nv.m17636w("Text within a chip are not allowed to scroll.");
            return;
        }
        super.setEllipsize(truncateAt);
        f11 f11Var = this.f12866e;
        if (f11Var != null) {
            f11Var.f38210g1 = truncateAt;
        }
    }

    public void setEnsureMinTouchTargetSize(boolean z) {
        this.f12857I = z;
        m6101c(this.f12859K);
    }

    @Override // android.widget.TextView
    public final boolean setFontVariationSettings(String str) {
        super.setFontVariationSettings(str);
        f11 f11Var = this.f12866e;
        if (f11Var == null) {
            return false;
        }
        us9 us9Var = f11Var.f38188P0.f7529g;
        if (us9Var != null) {
            us9Var.f64300c = str;
        }
        m6106h();
        return true;
    }

    @Override // android.widget.TextView
    public void setGravity(int i) {
        if (i != 8388627) {
            Log.w("Chip", "Chip text must be vertically center and start aligned");
        } else {
            super.setGravity(i);
        }
    }

    public void setHideMotionSpec(s36 s36Var) {
        f11 f11Var = this.f12866e;
        if (f11Var != null) {
            f11Var.f38173A0 = s36Var;
        }
    }

    public void setHideMotionSpecResource(int i) {
        f11 f11Var = this.f12866e;
        if (f11Var != null) {
            f11Var.f38173A0 = s36.m21048b(f11Var.f38182J0, i);
        }
    }

    public void setIconEndPadding(float f) {
        f11 f11Var = this.f12866e;
        if (f11Var != null) {
            f11Var.m11478g0(f);
        }
    }

    public void setIconEndPaddingResource(int i) {
        f11 f11Var = this.f12866e;
        if (f11Var != null) {
            f11Var.m11478g0(f11Var.f38182J0.getResources().getDimension(i));
        }
    }

    public void setIconStartPadding(float f) {
        f11 f11Var = this.f12866e;
        if (f11Var != null) {
            f11Var.m11479h0(f);
        }
    }

    public void setIconStartPaddingResource(int i) {
        f11 f11Var = this.f12866e;
        if (f11Var != null) {
            f11Var.m11479h0(f11Var.f38182J0.getResources().getDimension(i));
        }
    }

    public void setInternalOnCheckedChangeListener(as5 as5Var) {
    }

    @Override // android.view.View
    public void setLayoutDirection(int i) {
        if (this.f12866e == null) {
            return;
        }
        super.setLayoutDirection(i);
    }

    @Override // android.widget.TextView
    public void setLines(int i) {
        if (i <= 1) {
            super.setLines(i);
        } else {
            C3386nv.m17636w("Chip does not support multi-line text");
        }
    }

    @Override // android.widget.TextView
    public void setMaxLines(int i) {
        if (i <= 1) {
            super.setMaxLines(i);
        } else {
            C3386nv.m17636w("Chip does not support multi-line text");
        }
    }

    @Override // android.widget.TextView
    public void setMaxWidth(int i) {
        super.setMaxWidth(i);
        f11 f11Var = this.f12866e;
        if (f11Var != null) {
            f11Var.f38214i1 = i;
        }
    }

    @Override // android.widget.TextView
    public void setMinLines(int i) {
        if (i <= 1) {
            super.setMinLines(i);
        } else {
            C3386nv.m17636w("Chip does not support multi-line text");
        }
    }

    @Override // android.widget.CompoundButton
    public void setOnCheckedChangeListener(CompoundButton.OnCheckedChangeListener onCheckedChangeListener) {
        this.f12870i = onCheckedChangeListener;
    }

    public void setOnCloseIconClickListener(View.OnClickListener onClickListener) {
        this.f12869h = onClickListener;
        m6103e();
    }

    public void setRippleColor(ColorStateList colorStateList) {
        f11 f11Var = this.f12866e;
        if (f11Var != null) {
            f11Var.m11480i0(colorStateList);
        }
        this.f12866e.getClass();
        m6104f();
    }

    public void setRippleColorResource(int i) {
        f11 f11Var = this.f12866e;
        if (f11Var != null) {
            f11Var.m11480i0(do7.m10540p(f11Var.f38182J0, i));
            this.f12866e.getClass();
            m6104f();
        }
    }

    @Override // p000.t49
    public void setShapeAppearanceModel(r39 r39Var) {
        this.f12866e.setShapeAppearanceModel(r39Var);
    }

    public void setShowMotionSpec(s36 s36Var) {
        f11 f11Var = this.f12866e;
        if (f11Var != null) {
            f11Var.f38232z0 = s36Var;
        }
    }

    public void setShowMotionSpecResource(int i) {
        f11 f11Var = this.f12866e;
        if (f11Var != null) {
            f11Var.f38232z0 = s36.m21048b(f11Var.f38182J0, i);
        }
    }

    @Override // android.widget.TextView
    public void setSingleLine(boolean z) {
        if (z) {
            super.setSingleLine(z);
        } else {
            C3386nv.m17636w("Chip does not support multi-line text");
        }
    }

    @Override // android.widget.TextView
    public final void setText(CharSequence charSequence, TextView.BufferType bufferType) {
        f11 f11Var = this.f12866e;
        if (f11Var == null) {
            return;
        }
        if (charSequence == null) {
            charSequence = "";
        }
        super.setText(f11Var.f38212h1 ? null : charSequence, bufferType);
        f11 f11Var2 = this.f12866e;
        if (f11Var2 == null || TextUtils.equals(f11Var2.f38215j0, charSequence)) {
            return;
        }
        f11Var2.f38215j0 = charSequence;
        f11Var2.f38188P0.f7527e = true;
        f11Var2.invalidateSelf();
        f11Var2.m11457M();
    }

    @Override // android.widget.TextView
    public final void setTextAppearance(Context context, int i) {
        super.setTextAppearance(context, i);
        f11 f11Var = this.f12866e;
        if (f11Var != null) {
            Context context2 = f11Var.f38182J0;
            f11Var.f38188P0.m3068c(new us9(context2, i), context2);
        }
        m6106h();
    }

    public void setTextAppearanceResource(int i) {
        setTextAppearance(getContext(), i);
    }

    public void setTextEndPadding(float f) {
        f11 f11Var = this.f12866e;
        if (f11Var == null || f11Var.f38178F0 == f) {
            return;
        }
        f11Var.f38178F0 = f;
        f11Var.invalidateSelf();
        f11Var.m11457M();
    }

    public void setTextEndPaddingResource(int i) {
        f11 f11Var = this.f12866e;
        if (f11Var != null) {
            float dimension = f11Var.f38182J0.getResources().getDimension(i);
            if (f11Var.f38178F0 != dimension) {
                f11Var.f38178F0 = dimension;
                f11Var.invalidateSelf();
                f11Var.m11457M();
            }
        }
    }

    @Override // android.widget.TextView
    public final void setTextSize(int i, float f) {
        super.setTextSize(i, f);
        f11 f11Var = this.f12866e;
        if (f11Var != null) {
            float fApplyDimension = TypedValue.applyDimension(i, f, getResources().getDisplayMetrics());
            au9 au9Var = f11Var.f38188P0;
            us9 us9Var = au9Var.f7529g;
            if (us9Var != null) {
                us9Var.f64309l = fApplyDimension;
                au9Var.f7523a.setTextSize(fApplyDimension);
                f11Var.mo11471a();
            }
        }
        m6106h();
    }

    public void setTextStartPadding(float f) {
        f11 f11Var = this.f12866e;
        if (f11Var == null || f11Var.f38177E0 == f) {
            return;
        }
        f11Var.f38177E0 = f;
        f11Var.invalidateSelf();
        f11Var.m11457M();
    }

    public void setTextStartPaddingResource(int i) {
        f11 f11Var = this.f12866e;
        if (f11Var != null) {
            float dimension = f11Var.f38182J0.getResources().getDimension(i);
            if (f11Var.f38177E0 != dimension) {
                f11Var.f38177E0 = dimension;
                f11Var.invalidateSelf();
                f11Var.m11457M();
            }
        }
    }

    public void setCloseIconVisible(boolean z) {
        f11 f11Var = this.f12866e;
        if (f11Var != null) {
            f11Var.m11477f0(z);
        }
        m6103e();
    }

    public void setCheckedIconVisible(boolean z) {
        f11 f11Var = this.f12866e;
        if (f11Var != null) {
            f11Var.m11462R(z);
        }
    }

    public void setChipIconVisible(boolean z) {
        f11 f11Var = this.f12866e;
        if (f11Var != null) {
            f11Var.m11467W(z);
        }
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawablesRelativeWithIntrinsicBounds(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        if (drawable != null) {
            C3386nv.m17636w("Please set start drawable using R.attr#chipIcon.");
        } else if (drawable3 == null) {
            super.setCompoundDrawablesRelativeWithIntrinsicBounds(drawable, drawable2, drawable3, drawable4);
        } else {
            C3386nv.m17636w("Please set end drawable using R.attr#closeIcon.");
        }
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawablesWithIntrinsicBounds(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        if (drawable != null) {
            C3386nv.m17636w("Please set left drawable using R.attr#chipIcon.");
        } else if (drawable3 == null) {
            super.setCompoundDrawablesWithIntrinsicBounds(drawable, drawable2, drawable3, drawable4);
        } else {
            C3386nv.m17636w("Please set right drawable using R.attr#closeIcon.");
        }
    }

    public void setTextAppearance(us9 us9Var) {
        f11 f11Var = this.f12866e;
        if (f11Var != null) {
            f11Var.f38188P0.m3068c(us9Var, f11Var.f38182J0);
        }
        m6106h();
    }

    @Override // android.widget.TextView
    public void setTextAppearance(int i) {
        super.setTextAppearance(i);
        f11 f11Var = this.f12866e;
        if (f11Var != null) {
            Context context = f11Var.f38182J0;
            f11Var.f38188P0.m3068c(new us9(context, i), context);
        }
        m6106h();
    }

    public Chip(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, R$attr.chipStyle);
    }

    public Chip(Context context) {
        this(context, null);
    }
}
