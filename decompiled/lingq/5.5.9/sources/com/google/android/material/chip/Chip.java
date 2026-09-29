package com.google.android.material.chip;

import ae.C0062b;
import android.R;
import android.annotation.SuppressLint;
import android.annotation.TargetApi;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.InsetDrawable;
import android.graphics.drawable.RippleDrawable;
import android.os.Bundle;
import android.support.v4.media.AbstractC0140a;
import android.text.TextPaint;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.Log;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.PointerIcon;
import android.view.View;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.Checkable;
import android.widget.CompoundButton;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatCheckBox;
import gd.C5772k;
import gd.InterfaceC5776o;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Locale;
import java.util.WeakHashMap;
import md.C7542a;
import p072dd.C5150c;
import p072dd.C5151d;
import p084e3.AbstractC5363a;
import p093ed.C5397a;
import p104f.C5452a;
import p153hc.C6031a;
import p177ic.C6314g;
import p254m2.C7472a;
import p329q2.C8488a;
import p329q2.InterfaceC8491d;
import p337qc.C8518a;
import p337qc.C8519b;
import p337qc.C8520c;
import p426v2.C9627a;
import p426v2.C9633g;
import p471x2.C10029b0;
import p471x2.C10049l0;
import p497y2.C10284f;
import p507yc.C10341h;
import p507yc.C10344k;
import p507yc.C10347n;
import p507yc.InterfaceC10339f;

/* JADX INFO: loaded from: classes.dex */
public class Chip extends AppCompatCheckBox implements C2988a.a, InterfaceC5776o, Checkable {

    /* JADX INFO: renamed from: R */
    public static final Rect f15010R = new Rect();

    /* JADX INFO: renamed from: S */
    public static final int[] f15011S = {R.attr.state_selected};

    /* JADX INFO: renamed from: T */
    public static final int[] f15012T = {R.attr.state_checkable};

    /* JADX INFO: renamed from: H */
    public boolean f15013H;

    /* JADX INFO: renamed from: I */
    public boolean f15014I;

    /* JADX INFO: renamed from: J */
    public int f15015J;

    /* JADX INFO: renamed from: K */
    public int f15016K;

    /* JADX INFO: renamed from: L */
    public CharSequence f15017L;

    /* JADX INFO: renamed from: M */
    public final C2987b f15018M;

    /* JADX INFO: renamed from: N */
    public boolean f15019N;

    /* JADX INFO: renamed from: O */
    public final Rect f15020O;

    /* JADX INFO: renamed from: P */
    public final RectF f15021P;

    /* JADX INFO: renamed from: Q */
    public final C2986a f15022Q;

    /* JADX INFO: renamed from: e */
    public C2988a f15023e;

    /* JADX INFO: renamed from: f */
    public InsetDrawable f15024f;

    /* JADX INFO: renamed from: g */
    public RippleDrawable f15025g;

    /* JADX INFO: renamed from: h */
    public View.OnClickListener f15026h;

    /* JADX INFO: renamed from: i */
    public CompoundButton.OnCheckedChangeListener f15027i;

    /* JADX INFO: renamed from: j */
    public boolean f15028j;

    /* JADX INFO: renamed from: k */
    public boolean f15029k;

    /* JADX INFO: renamed from: l */
    public boolean f15030l;

    /* JADX INFO: renamed from: com.google.android.material.chip.Chip$a */
    public class C2986a extends AbstractC0140a {
        public C2986a() {
        }

        @Override // android.support.v4.media.AbstractC0140a
        /* JADX INFO: renamed from: X */
        public final void mo586X(int i10) {
        }

        @Override // android.support.v4.media.AbstractC0140a
        /* JADX INFO: renamed from: Y */
        public final void mo587Y(Typeface typeface, boolean z10) {
            Chip chip = Chip.this;
            C2988a c2988a = chip.f15023e;
            chip.setText(c2988a.f15066Y0 ? c2988a.f15067Z : chip.getText());
            chip.requestLayout();
            chip.invalidate();
        }
    }

    /* JADX INFO: renamed from: com.google.android.material.chip.Chip$b */
    public class C2987b extends AbstractC5363a {
        public C2987b(Chip chip) {
            super(chip);
        }

        @Override // p084e3.AbstractC5363a
        /* JADX INFO: renamed from: n */
        public final int mo8680n(float f3, float f10) {
            Rect rect = Chip.f15010R;
            Chip chip = Chip.this;
            return (chip.m8675e() && chip.getCloseIconTouchBounds().contains(f3, f10)) ? 1 : 0;
        }

        @Override // p084e3.AbstractC5363a
        /* JADX INFO: renamed from: o */
        public final void mo8681o(ArrayList arrayList) {
            boolean z10 = false;
            arrayList.add(0);
            Rect rect = Chip.f15010R;
            Chip chip = Chip.this;
            if (chip.m8675e()) {
                C2988a c2988a = chip.f15023e;
                if (c2988a != null && c2988a.f15075f0) {
                    z10 = true;
                }
                if (z10 && chip.f15026h != null) {
                    arrayList.add(1);
                }
            }
        }

        @Override // p084e3.AbstractC5363a
        /* JADX INFO: renamed from: s */
        public final boolean mo8682s(int i10, int i11, Bundle bundle) {
            boolean z10 = false;
            if (i11 == 16) {
                Chip chip = Chip.this;
                if (i10 == 0) {
                    return chip.performClick();
                }
                if (i10 == 1) {
                    chip.playSoundEffect(0);
                    View.OnClickListener onClickListener = chip.f15026h;
                    if (onClickListener != null) {
                        onClickListener.onClick(chip);
                        z10 = true;
                    }
                    if (chip.f15019N) {
                        chip.f15018M.m11512x(1, 1);
                    }
                }
            }
            return z10;
        }

        @Override // p084e3.AbstractC5363a
        /* JADX INFO: renamed from: t */
        public final void mo8683t(C10284f c10284f) {
            Chip chip = Chip.this;
            C2988a c2988a = chip.f15023e;
            boolean z10 = c2988a != null && c2988a.f15081l0;
            AccessibilityNodeInfo accessibilityNodeInfo = c10284f.f51739a;
            accessibilityNodeInfo.setCheckable(z10);
            accessibilityNodeInfo.setClickable(chip.isClickable());
            c10284f.m19264i(chip.getAccessibilityClassName());
            c10284f.m19270o(chip.getText());
        }

        @Override // p084e3.AbstractC5363a
        /* JADX INFO: renamed from: u */
        public final void mo8684u(int i10, C10284f c10284f) {
            AccessibilityNodeInfo accessibilityNodeInfo = c10284f.f51739a;
            CharSequence charSequence = "";
            if (i10 != 1) {
                c10284f.m19267l(charSequence);
                accessibilityNodeInfo.setBoundsInParent(Chip.f15010R);
                return;
            }
            Chip chip = Chip.this;
            CharSequence closeIconContentDescription = chip.getCloseIconContentDescription();
            if (closeIconContentDescription != null) {
                c10284f.m19267l(closeIconContentDescription);
            } else {
                CharSequence text = chip.getText();
                Context context = chip.getContext();
                Object[] objArr = new Object[1];
                objArr[0] = TextUtils.isEmpty(text) ? "" : text;
                c10284f.m19267l(context.getString(com.linguist.R.string.mtrl_chip_close_icon_content_description, objArr).trim());
            }
            accessibilityNodeInfo.setBoundsInParent(chip.getCloseIconTouchBoundsInt());
            c10284f.m19257b(C10284f.a.f51742e);
            accessibilityNodeInfo.setEnabled(chip.isEnabled());
        }

        @Override // p084e3.AbstractC5363a
        /* JADX INFO: renamed from: v */
        public final void mo8685v(int i10, boolean z10) {
            if (i10 == 1) {
                Chip chip = Chip.this;
                chip.f15013H = z10;
                chip.refreshDrawableState();
            }
        }
    }

    public Chip(Context context, AttributeSet attributeSet) {
        int resourceId;
        int resourceId2;
        int resourceId3;
        super(C7542a.m15048a(context, attributeSet, com.linguist.R.attr.chipStyle, com.linguist.R.style.Widget_MaterialComponents_Chip_Action), attributeSet, com.linguist.R.attr.chipStyle);
        this.f15020O = new Rect();
        this.f15021P = new RectF();
        this.f15022Q = new C2986a();
        Context context2 = getContext();
        if (attributeSet != null) {
            if (attributeSet.getAttributeValue("http://schemas.android.com/apk/res/android", "background") != null) {
                Log.w("Chip", "Do not set the background; Chip manages its own background drawable.");
            }
            if (attributeSet.getAttributeValue("http://schemas.android.com/apk/res/android", "drawableLeft") != null) {
                throw new UnsupportedOperationException("Please set left drawable using R.attr#chipIcon.");
            }
            if (attributeSet.getAttributeValue("http://schemas.android.com/apk/res/android", "drawableStart") != null) {
                throw new UnsupportedOperationException("Please set start drawable using R.attr#chipIcon.");
            }
            if (attributeSet.getAttributeValue("http://schemas.android.com/apk/res/android", "drawableEnd") != null) {
                throw new UnsupportedOperationException("Please set end drawable using R.attr#closeIcon.");
            }
            if (attributeSet.getAttributeValue("http://schemas.android.com/apk/res/android", "drawableRight") != null) {
                throw new UnsupportedOperationException("Please set end drawable using R.attr#closeIcon.");
            }
            if (!attributeSet.getAttributeBooleanValue("http://schemas.android.com/apk/res/android", "singleLine", true) || attributeSet.getAttributeIntValue("http://schemas.android.com/apk/res/android", "lines", 1) != 1 || attributeSet.getAttributeIntValue("http://schemas.android.com/apk/res/android", "minLines", 1) != 1 || attributeSet.getAttributeIntValue("http://schemas.android.com/apk/res/android", "maxLines", 1) != 1) {
                throw new UnsupportedOperationException("Chip does not support multi-line text");
            }
            if (attributeSet.getAttributeIntValue("http://schemas.android.com/apk/res/android", "gravity", 8388627) != 8388627) {
                Log.w("Chip", "Chip text must be vertically center and start aligned");
            }
        }
        C2988a c2988a = new C2988a(context2, attributeSet);
        Context context3 = c2988a.f15095z0;
        int[] iArr = C6031a.f35658h;
        TypedArray typedArrayM19357d = C10344k.m19357d(context3, attributeSet, iArr, com.linguist.R.attr.chipStyle, com.linguist.R.style.Widget_MaterialComponents_Chip_Action, new int[0]);
        c2988a.f15070a1 = typedArrayM19357d.hasValue(37);
        Context context4 = c2988a.f15095z0;
        ColorStateList colorStateListM10925a = C5150c.m10925a(context4, typedArrayM19357d, 24);
        if (c2988a.f15053S != colorStateListM10925a) {
            c2988a.f15053S = colorStateListM10925a;
            c2988a.onStateChange(c2988a.getState());
        }
        ColorStateList colorStateListM10925a2 = C5150c.m10925a(context4, typedArrayM19357d, 11);
        if (c2988a.f15055T != colorStateListM10925a2) {
            c2988a.f15055T = colorStateListM10925a2;
            c2988a.onStateChange(c2988a.getState());
        }
        float dimension = typedArrayM19357d.getDimension(19, 0.0f);
        if (c2988a.f15057U != dimension) {
            c2988a.f15057U = dimension;
            c2988a.invalidateSelf();
            c2988a.m8689B();
        }
        if (typedArrayM19357d.hasValue(12)) {
            c2988a.m8695H(typedArrayM19357d.getDimension(12, 0.0f));
        }
        c2988a.m8700M(C5150c.m10925a(context4, typedArrayM19357d, 22));
        c2988a.m8701N(typedArrayM19357d.getDimension(23, 0.0f));
        c2988a.m8710W(C5150c.m10925a(context4, typedArrayM19357d, 36));
        String text = typedArrayM19357d.getText(5);
        text = text == null ? "" : text;
        boolean zEquals = TextUtils.equals(c2988a.f15067Z, text);
        C10341h c10341h = c2988a.f15040F0;
        if (!zEquals) {
            c2988a.f15067Z = text;
            c10341h.f52042d = true;
            c2988a.invalidateSelf();
            c2988a.m8689B();
        }
        C6314g c6314gM12939a = null;
        C5151d c5151d = (!typedArrayM19357d.hasValue(0) || (resourceId3 = typedArrayM19357d.getResourceId(0, 0)) == 0) ? null : new C5151d(context4, resourceId3);
        c5151d.f33137k = typedArrayM19357d.getDimension(1, c5151d.f33137k);
        c10341h.m19353b(c5151d, context4);
        int i10 = typedArrayM19357d.getInt(3, 0);
        if (i10 == 1) {
            c2988a.f15064X0 = TextUtils.TruncateAt.START;
        } else if (i10 == 2) {
            c2988a.f15064X0 = TextUtils.TruncateAt.MIDDLE;
        } else if (i10 == 3) {
            c2988a.f15064X0 = TextUtils.TruncateAt.END;
        }
        c2988a.m8699L(typedArrayM19357d.getBoolean(18, false));
        if (attributeSet != null && attributeSet.getAttributeValue("http://schemas.android.com/apk/res-auto", "chipIconEnabled") != null && attributeSet.getAttributeValue("http://schemas.android.com/apk/res-auto", "chipIconVisible") == null) {
            c2988a.m8699L(typedArrayM19357d.getBoolean(15, false));
        }
        c2988a.m8696I(C5150c.m10928d(context4, typedArrayM19357d, 14));
        if (typedArrayM19357d.hasValue(17)) {
            c2988a.m8698K(C5150c.m10925a(context4, typedArrayM19357d, 17));
        }
        c2988a.m8697J(typedArrayM19357d.getDimension(16, -1.0f));
        c2988a.m8707T(typedArrayM19357d.getBoolean(31, false));
        if (attributeSet != null && attributeSet.getAttributeValue("http://schemas.android.com/apk/res-auto", "closeIconEnabled") != null && attributeSet.getAttributeValue("http://schemas.android.com/apk/res-auto", "closeIconVisible") == null) {
            c2988a.m8707T(typedArrayM19357d.getBoolean(26, false));
        }
        c2988a.m8702O(C5150c.m10928d(context4, typedArrayM19357d, 25));
        c2988a.m8706S(C5150c.m10925a(context4, typedArrayM19357d, 30));
        c2988a.m8704Q(typedArrayM19357d.getDimension(28, 0.0f));
        c2988a.m8691D(typedArrayM19357d.getBoolean(6, false));
        c2988a.m8694G(typedArrayM19357d.getBoolean(10, false));
        if (attributeSet != null && attributeSet.getAttributeValue("http://schemas.android.com/apk/res-auto", "checkedIconEnabled") != null && attributeSet.getAttributeValue("http://schemas.android.com/apk/res-auto", "checkedIconVisible") == null) {
            c2988a.m8694G(typedArrayM19357d.getBoolean(8, false));
        }
        c2988a.m8692E(C5150c.m10928d(context4, typedArrayM19357d, 7));
        if (typedArrayM19357d.hasValue(9)) {
            c2988a.m8693F(C5150c.m10925a(context4, typedArrayM19357d, 9));
        }
        c2988a.f15085p0 = (!typedArrayM19357d.hasValue(39) || (resourceId2 = typedArrayM19357d.getResourceId(39, 0)) == 0) ? null : C6314g.m12939a(resourceId2, context4);
        if (typedArrayM19357d.hasValue(33) && (resourceId = typedArrayM19357d.getResourceId(33, 0)) != 0) {
            c6314gM12939a = C6314g.m12939a(resourceId, context4);
        }
        c2988a.f15086q0 = c6314gM12939a;
        float dimension2 = typedArrayM19357d.getDimension(21, 0.0f);
        if (c2988a.f15087r0 != dimension2) {
            c2988a.f15087r0 = dimension2;
            c2988a.invalidateSelf();
            c2988a.m8689B();
        }
        c2988a.m8709V(typedArrayM19357d.getDimension(35, 0.0f));
        c2988a.m8708U(typedArrayM19357d.getDimension(34, 0.0f));
        float dimension3 = typedArrayM19357d.getDimension(41, 0.0f);
        if (c2988a.f15090u0 != dimension3) {
            c2988a.f15090u0 = dimension3;
            c2988a.invalidateSelf();
            c2988a.m8689B();
        }
        float dimension4 = typedArrayM19357d.getDimension(40, 0.0f);
        if (c2988a.f15091v0 != dimension4) {
            c2988a.f15091v0 = dimension4;
            c2988a.invalidateSelf();
            c2988a.m8689B();
        }
        c2988a.m8705R(typedArrayM19357d.getDimension(29, 0.0f));
        c2988a.m8703P(typedArrayM19357d.getDimension(27, 0.0f));
        float dimension5 = typedArrayM19357d.getDimension(13, 0.0f);
        if (c2988a.f15094y0 != dimension5) {
            c2988a.f15094y0 = dimension5;
            c2988a.invalidateSelf();
            c2988a.m8689B();
        }
        c2988a.f15068Z0 = typedArrayM19357d.getDimensionPixelSize(4, Integer.MAX_VALUE);
        typedArrayM19357d.recycle();
        TypedArray typedArrayM19357d2 = C10344k.m19357d(context2, attributeSet, iArr, com.linguist.R.attr.chipStyle, com.linguist.R.style.Widget_MaterialComponents_Chip_Action, new int[0]);
        this.f15014I = typedArrayM19357d2.getBoolean(32, false);
        this.f15016K = (int) Math.ceil(typedArrayM19357d2.getDimension(20, (float) Math.ceil(C10347n.m19362b(48, getContext()))));
        typedArrayM19357d2.recycle();
        setChipDrawable(c2988a);
        c2988a.m12140l(C10029b0.i.m18715i(this));
        TypedArray typedArrayM19357d3 = C10344k.m19357d(context2, attributeSet, iArr, com.linguist.R.attr.chipStyle, com.linguist.R.style.Widget_MaterialComponents_Chip_Action, new int[0]);
        boolean zHasValue = typedArrayM19357d3.hasValue(37);
        typedArrayM19357d3.recycle();
        this.f15018M = new C2987b(this);
        m8676f();
        if (!zHasValue) {
            setOutlineProvider(new C8519b(this));
        }
        setChecked(this.f15028j);
        setText(c2988a.f15067Z);
        setEllipsize(c2988a.f15064X0);
        m8679i();
        if (!this.f15023e.f15066Y0) {
            setLines(1);
            setHorizontallyScrolling(true);
        }
        setGravity(8388627);
        m8678h();
        if (this.f15014I) {
            setMinHeight(this.f15016K);
        }
        this.f15015J = C10029b0.e.m18686d(this);
        super.setOnCheckedChangeListener(new C8518a(0, this));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public RectF getCloseIconTouchBounds() {
        RectF rectF = this.f15021P;
        rectF.setEmpty();
        if (m8675e() && this.f15026h != null) {
            C2988a c2988a = this.f15023e;
            Rect bounds = c2988a.getBounds();
            rectF.setEmpty();
            if (c2988a.m8713Z()) {
                float f3 = c2988a.f15094y0 + c2988a.f15093x0 + c2988a.f15079j0 + c2988a.f15092w0 + c2988a.f15091v0;
                if (C8488a.c.m16572a(c2988a) == 0) {
                    float f10 = bounds.right;
                    rectF.right = f10;
                    rectF.left = f10 - f3;
                } else {
                    float f11 = bounds.left;
                    rectF.left = f11;
                    rectF.right = f11 + f3;
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
        int i10 = (int) closeIconTouchBounds.left;
        int i11 = (int) closeIconTouchBounds.top;
        int i12 = (int) closeIconTouchBounds.right;
        int i13 = (int) closeIconTouchBounds.bottom;
        Rect rect = this.f15020O;
        rect.set(i10, i11, i12, i13);
        return rect;
    }

    private C5151d getTextAppearance() {
        C2988a c2988a = this.f15023e;
        if (c2988a != null) {
            return c2988a.f15040F0.f52044f;
        }
        return null;
    }

    private void setCloseIconHovered(boolean z10) {
        if (this.f15030l != z10) {
            this.f15030l = z10;
            refreshDrawableState();
        }
    }

    private void setCloseIconPressed(boolean z10) {
        if (this.f15029k != z10) {
            this.f15029k = z10;
            refreshDrawableState();
        }
    }

    @Override // com.google.android.material.chip.C2988a.a
    /* JADX INFO: renamed from: a */
    public final void mo8673a() {
        m8674d(this.f15016K);
        requestLayout();
        invalidateOutline();
    }

    /* JADX INFO: renamed from: d */
    public final void m8674d(int i10) {
        this.f15016K = i10;
        if (!this.f15014I) {
            InsetDrawable insetDrawable = this.f15024f;
            if (insetDrawable == null) {
                int[] iArr = C5397a.f33812a;
                m8677g();
            } else if (insetDrawable != null) {
                this.f15024f = null;
                setMinWidth(0);
                setMinHeight((int) getChipMinHeight());
                int[] iArr2 = C5397a.f33812a;
                m8677g();
                return;
            }
            return;
        }
        int iMax = Math.max(0, i10 - ((int) this.f15023e.f15057U));
        int iMax2 = Math.max(0, i10 - this.f15023e.getIntrinsicWidth());
        if (iMax2 <= 0 && iMax <= 0) {
            InsetDrawable insetDrawable2 = this.f15024f;
            if (insetDrawable2 == null) {
                int[] iArr3 = C5397a.f33812a;
                m8677g();
                return;
            } else {
                if (insetDrawable2 != null) {
                    this.f15024f = null;
                    setMinWidth(0);
                    setMinHeight((int) getChipMinHeight());
                    int[] iArr4 = C5397a.f33812a;
                    m8677g();
                    return;
                }
                return;
            }
        }
        int i11 = iMax2 > 0 ? iMax2 / 2 : 0;
        int i12 = iMax > 0 ? iMax / 2 : 0;
        if (this.f15024f != null) {
            Rect rect = new Rect();
            this.f15024f.getPadding(rect);
            if (rect.top == i12 && rect.bottom == i12 && rect.left == i11 && rect.right == i11) {
                int[] iArr5 = C5397a.f33812a;
                m8677g();
                return;
            }
        }
        if (getMinHeight() != i10) {
            setMinHeight(i10);
        }
        if (getMinWidth() != i10) {
            setMinWidth(i10);
        }
        this.f15024f = new InsetDrawable((Drawable) this.f15023e, i11, i12, i11, i12);
        int[] iArr6 = C5397a.f33812a;
        m8677g();
    }

    @Override // android.view.View
    public final boolean dispatchHoverEvent(MotionEvent motionEvent) {
        if (this.f15019N) {
            return this.f15018M.m11507m(motionEvent) || super.dispatchHoverEvent(motionEvent);
        }
        return super.dispatchHoverEvent(motionEvent);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v1 */
    /* JADX WARN: Type inference failed for: r4v11 */
    /* JADX WARN: Type inference failed for: r4v12 */
    /* JADX WARN: Type inference failed for: r4v13 */
    /* JADX WARN: Type inference failed for: r4v14 */
    /* JADX WARN: Type inference failed for: r4v15 */
    /* JADX WARN: Type inference failed for: r4v16 */
    /* JADX WARN: Type inference failed for: r4v2 */
    /* JADX WARN: Type inference failed for: r4v3 */
    /* JADX WARN: Type inference failed for: r4v4 */
    /* JADX WARN: Type inference failed for: r4v7 */
    @Override // android.view.View
    public final boolean dispatchKeyEvent(KeyEvent keyEvent) {
        ?? M11509q;
        if (!this.f15019N) {
            return super.dispatchKeyEvent(keyEvent);
        }
        C2987b c2987b = this.f15018M;
        c2987b.getClass();
        int i10 = 0;
        if (keyEvent.getAction() != 1) {
            int keyCode = keyEvent.getKeyCode();
            if (keyCode != 61) {
                int i11 = 66;
                if (keyCode != 66) {
                    switch (keyCode) {
                        case 19:
                        case 20:
                        case 21:
                        case 22:
                            M11509q = i10;
                            if (keyEvent.hasNoModifiers()) {
                                if (keyCode == 19) {
                                    i11 = 33;
                                } else if (keyCode == 21) {
                                    i11 = 17;
                                } else if (keyCode != 22) {
                                    i11 = 130;
                                }
                                int repeatCount = keyEvent.getRepeatCount() + 1;
                                boolean z10 = false;
                                for (int i12 = i10; i12 < repeatCount && c2987b.m11509q(i11, null); i12++) {
                                    z10 = true;
                                }
                                M11509q = z10;
                            }
                            break;
                        case 23:
                            break;
                        default:
                            M11509q = i10;
                            break;
                    }
                } else {
                    M11509q = i10;
                }
                M11509q = i10;
                if (keyEvent.hasNoModifiers() && keyEvent.getRepeatCount() == 0) {
                    int i13 = c2987b.f33701l;
                    if (i13 != Integer.MIN_VALUE) {
                        M11509q = i10;
                        c2987b.mo8682s(i13, 16, null);
                    }
                    M11509q = i10;
                    M11509q = 1;
                }
            } else if (keyEvent.hasNoModifiers()) {
                M11509q = i10;
                M11509q = c2987b.m11509q(2, null);
            } else if (keyEvent.hasModifiers(1)) {
                M11509q = i10;
                M11509q = i10;
                M11509q = c2987b.m11509q(1, null);
            }
        }
        if (M11509q == 0 || c2987b.f33701l == Integer.MIN_VALUE) {
            return super.dispatchKeyEvent(keyEvent);
        }
        return true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v0, types: [int] */
    /* JADX WARN: Type inference failed for: r2v1, types: [int] */
    /* JADX WARN: Type inference failed for: r2v10 */
    /* JADX WARN: Type inference failed for: r2v11 */
    /* JADX WARN: Type inference failed for: r2v12 */
    /* JADX WARN: Type inference failed for: r2v13 */
    /* JADX WARN: Type inference failed for: r2v14 */
    /* JADX WARN: Type inference failed for: r2v15 */
    /* JADX WARN: Type inference failed for: r2v16 */
    /* JADX WARN: Type inference failed for: r2v17 */
    /* JADX WARN: Type inference failed for: r2v2, types: [int] */
    /* JADX WARN: Type inference failed for: r2v3, types: [int] */
    /* JADX WARN: Type inference failed for: r2v4, types: [int] */
    @Override // androidx.appcompat.widget.AppCompatCheckBox, android.widget.CompoundButton, android.widget.TextView, android.view.View
    public final void drawableStateChanged() {
        ?? r10;
        int i10;
        super.drawableStateChanged();
        C2988a c2988a = this.f15023e;
        boolean zM8690C = false;
        if (c2988a != null && C2988a.m8686A(c2988a.f15076g0)) {
            C2988a c2988a2 = this.f15023e;
            ?? IsEnabled = isEnabled();
            if (this.f15013H) {
                r10 = IsEnabled;
                r10 = IsEnabled + 1;
            }
            r10 = IsEnabled;
            ?? r11 = r10;
            if (this.f15030l) {
                r11 = r10 + 1;
            }
            ?? r12 = r11;
            if (this.f15029k) {
                r12 = r11 + 1;
            }
            int i11 = r12;
            if (isChecked()) {
                i11 = r12 + 1;
            }
            int[] iArr = new int[i11];
            if (isEnabled()) {
                iArr[0] = 16842910;
                i10 = 1;
            } else {
                i10 = 0;
            }
            if (this.f15013H) {
                iArr[i10] = 16842908;
                i10++;
            }
            if (this.f15030l) {
                iArr[i10] = 16843623;
                i10++;
            }
            if (this.f15029k) {
                iArr[i10] = 16842919;
                i10++;
            }
            if (isChecked()) {
                iArr[i10] = 16842913;
            }
            if (!Arrays.equals(c2988a2.f15056T0, iArr)) {
                c2988a2.f15056T0 = iArr;
                if (c2988a2.m8713Z()) {
                    zM8690C = c2988a2.m8690C(c2988a2.getState(), iArr);
                }
            }
        }
        if (zM8690C) {
            invalidate();
        }
    }

    /* JADX WARN: Code duplicated, block: B:12:0x001b  */
    /* JADX INFO: renamed from: e */
    public final boolean m8675e() {
        C2988a c2988a = this.f15023e;
        if (c2988a != null) {
            Object objM16578b = c2988a.f15076g0;
            if (objM16578b != null) {
                if (objM16578b instanceof InterfaceC8491d) {
                    objM16578b = ((InterfaceC8491d) objM16578b).m16578b();
                }
                if (objM16578b != null) {
                    return true;
                }
            } else {
                objM16578b = null;
            }
            if (objM16578b != null) {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: f */
    public final void m8676f() {
        if (m8675e()) {
            C2988a c2988a = this.f15023e;
            if ((c2988a != null && c2988a.f15075f0) && this.f15026h != null) {
                C10029b0.m18658n(this, this.f15018M);
                this.f15019N = true;
                return;
            }
        }
        C10029b0.m18658n(this, null);
        this.f15019N = false;
    }

    /* JADX INFO: renamed from: g */
    public final void m8677g() {
        this.f15025g = new RippleDrawable(C5397a.m11561c(this.f15023e.f15065Y), getBackgroundDrawable(), null);
        C2988a c2988a = this.f15023e;
        if (c2988a.f15058U0) {
            c2988a.f15058U0 = false;
            c2988a.f15060V0 = null;
            c2988a.onStateChange(c2988a.getState());
        }
        RippleDrawable rippleDrawable = this.f15025g;
        WeakHashMap<View, C10049l0> weakHashMap = C10029b0.f50993a;
        C10029b0.d.m18680q(this, rippleDrawable);
        m8678h();
    }

    @Override // android.widget.CheckBox, android.widget.CompoundButton, android.widget.Button, android.widget.TextView, android.view.View
    public CharSequence getAccessibilityClassName() {
        if (!TextUtils.isEmpty(this.f15017L)) {
            return this.f15017L;
        }
        C2988a c2988a = this.f15023e;
        if (!(c2988a != null && c2988a.f15081l0)) {
            return isClickable() ? "android.widget.Button" : "android.view.View";
        }
        ViewParent parent = getParent();
        if (!(parent instanceof C8520c)) {
            return "android.widget.Button";
        }
        ((C8520c) parent).getClass();
        throw null;
    }

    public Drawable getBackgroundDrawable() {
        Drawable drawable = this.f15024f;
        if (drawable == null) {
            drawable = this.f15023e;
        }
        return drawable;
    }

    public Drawable getCheckedIcon() {
        C2988a c2988a = this.f15023e;
        if (c2988a != null) {
            return c2988a.f15083n0;
        }
        return null;
    }

    public ColorStateList getCheckedIconTint() {
        C2988a c2988a = this.f15023e;
        if (c2988a != null) {
            return c2988a.f15084o0;
        }
        return null;
    }

    public ColorStateList getChipBackgroundColor() {
        C2988a c2988a = this.f15023e;
        if (c2988a != null) {
            return c2988a.f15055T;
        }
        return null;
    }

    public float getChipCornerRadius() {
        C2988a c2988a = this.f15023e;
        if (c2988a != null) {
            return Math.max(0.0f, c2988a.m8718y());
        }
        return 0.0f;
    }

    public Drawable getChipDrawable() {
        return this.f15023e;
    }

    public float getChipEndPadding() {
        C2988a c2988a = this.f15023e;
        if (c2988a != null) {
            return c2988a.f15094y0;
        }
        return 0.0f;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v2, types: [android.graphics.drawable.Drawable] */
    public Drawable getChipIcon() {
        Object objM16578b;
        C2988a c2988a = this.f15023e;
        if (c2988a == null || (objM16578b = c2988a.f15071b0) == null) {
            return null;
        }
        if (objM16578b instanceof InterfaceC8491d) {
            objM16578b = ((InterfaceC8491d) objM16578b).m16578b();
        }
        return objM16578b;
    }

    public float getChipIconSize() {
        C2988a c2988a = this.f15023e;
        if (c2988a != null) {
            return c2988a.f15073d0;
        }
        return 0.0f;
    }

    public ColorStateList getChipIconTint() {
        C2988a c2988a = this.f15023e;
        if (c2988a != null) {
            return c2988a.f15072c0;
        }
        return null;
    }

    public float getChipMinHeight() {
        C2988a c2988a = this.f15023e;
        if (c2988a != null) {
            return c2988a.f15057U;
        }
        return 0.0f;
    }

    public float getChipStartPadding() {
        C2988a c2988a = this.f15023e;
        if (c2988a != null) {
            return c2988a.f15087r0;
        }
        return 0.0f;
    }

    public ColorStateList getChipStrokeColor() {
        C2988a c2988a = this.f15023e;
        if (c2988a != null) {
            return c2988a.f15061W;
        }
        return null;
    }

    public float getChipStrokeWidth() {
        C2988a c2988a = this.f15023e;
        if (c2988a != null) {
            return c2988a.f15063X;
        }
        return 0.0f;
    }

    @Deprecated
    public CharSequence getChipText() {
        return getText();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v0 */
    /* JADX WARN: Type inference failed for: r1v1, types: [android.graphics.drawable.Drawable] */
    /* JADX WARN: Type inference failed for: r1v3 */
    /* JADX WARN: Type inference failed for: r1v4 */
    public Drawable getCloseIcon() {
        Object obj;
        Object objM16578b;
        C2988a c2988a = this.f15023e;
        ?? r10 = 0;
        r10 = 0;
        if (c2988a != null && (obj = c2988a.f15076g0) != null) {
            if (obj instanceof InterfaceC8491d) {
                objM16578b = obj;
                objM16578b = ((InterfaceC8491d) obj).m16578b();
            }
            objM16578b = obj;
            r10 = objM16578b;
        }
        return r10;
    }

    public CharSequence getCloseIconContentDescription() {
        C2988a c2988a = this.f15023e;
        if (c2988a != null) {
            return c2988a.f15080k0;
        }
        return null;
    }

    public float getCloseIconEndPadding() {
        C2988a c2988a = this.f15023e;
        if (c2988a != null) {
            return c2988a.f15093x0;
        }
        return 0.0f;
    }

    public float getCloseIconSize() {
        C2988a c2988a = this.f15023e;
        if (c2988a != null) {
            return c2988a.f15079j0;
        }
        return 0.0f;
    }

    public float getCloseIconStartPadding() {
        C2988a c2988a = this.f15023e;
        if (c2988a != null) {
            return c2988a.f15092w0;
        }
        return 0.0f;
    }

    public ColorStateList getCloseIconTint() {
        C2988a c2988a = this.f15023e;
        if (c2988a != null) {
            return c2988a.f15078i0;
        }
        return null;
    }

    @Override // android.widget.TextView
    public TextUtils.TruncateAt getEllipsize() {
        C2988a c2988a = this.f15023e;
        if (c2988a != null) {
            return c2988a.f15064X0;
        }
        return null;
    }

    @Override // android.widget.TextView, android.view.View
    public final void getFocusedRect(Rect rect) {
        if (this.f15019N) {
            C2987b c2987b = this.f15018M;
            if (c2987b.f33701l != 1) {
                if (c2987b.f33700k == 1) {
                }
            }
            rect.set(getCloseIconTouchBoundsInt());
            return;
        }
        super.getFocusedRect(rect);
    }

    public C6314g getHideMotionSpec() {
        C2988a c2988a = this.f15023e;
        if (c2988a != null) {
            return c2988a.f15086q0;
        }
        return null;
    }

    public float getIconEndPadding() {
        C2988a c2988a = this.f15023e;
        if (c2988a != null) {
            return c2988a.f15089t0;
        }
        return 0.0f;
    }

    public float getIconStartPadding() {
        C2988a c2988a = this.f15023e;
        if (c2988a != null) {
            return c2988a.f15088s0;
        }
        return 0.0f;
    }

    public ColorStateList getRippleColor() {
        C2988a c2988a = this.f15023e;
        if (c2988a != null) {
            return c2988a.f15065Y;
        }
        return null;
    }

    public C5772k getShapeAppearanceModel() {
        return this.f15023e.f34857a.f34870a;
    }

    public C6314g getShowMotionSpec() {
        C2988a c2988a = this.f15023e;
        if (c2988a != null) {
            return c2988a.f15085p0;
        }
        return null;
    }

    public float getTextEndPadding() {
        C2988a c2988a = this.f15023e;
        if (c2988a != null) {
            return c2988a.f15091v0;
        }
        return 0.0f;
    }

    public float getTextStartPadding() {
        C2988a c2988a = this.f15023e;
        if (c2988a != null) {
            return c2988a.f15090u0;
        }
        return 0.0f;
    }

    /* JADX INFO: renamed from: h */
    public final void m8678h() {
        if (!TextUtils.isEmpty(getText())) {
            C2988a c2988a = this.f15023e;
            if (c2988a == null) {
                return;
            }
            int iM8717x = (int) (c2988a.m8717x() + c2988a.f15094y0 + c2988a.f15091v0);
            C2988a c2988a2 = this.f15023e;
            int iM8716w = (int) (c2988a2.m8716w() + c2988a2.f15087r0 + c2988a2.f15090u0);
            if (this.f15024f != null) {
                Rect rect = new Rect();
                this.f15024f.getPadding(rect);
                iM8716w += rect.left;
                iM8717x += rect.right;
            }
            int paddingTop = getPaddingTop();
            int paddingBottom = getPaddingBottom();
            WeakHashMap<View, C10049l0> weakHashMap = C10029b0.f50993a;
            C10029b0.e.m18693k(this, iM8716w, paddingTop, iM8717x, paddingBottom);
        }
    }

    /* JADX INFO: renamed from: i */
    public final void m8679i() {
        TextPaint paint = getPaint();
        C2988a c2988a = this.f15023e;
        if (c2988a != null) {
            paint.drawableState = c2988a.getState();
        }
        C5151d textAppearance = getTextAppearance();
        if (textAppearance != null) {
            textAppearance.m10934e(getContext(), paint, this.f15022Q);
        }
    }

    @Override // android.widget.TextView, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        C0062b.m338c2(this, this.f15023e);
    }

    @Override // android.widget.CompoundButton, android.widget.TextView, android.view.View
    public final int[] onCreateDrawableState(int i10) {
        int[] iArrOnCreateDrawableState = super.onCreateDrawableState(i10 + 2);
        if (isChecked()) {
            View.mergeDrawableStates(iArrOnCreateDrawableState, f15011S);
        }
        C2988a c2988a = this.f15023e;
        if (c2988a != null && c2988a.f15081l0) {
            View.mergeDrawableStates(iArrOnCreateDrawableState, f15012T);
        }
        return iArrOnCreateDrawableState;
    }

    @Override // android.widget.TextView, android.view.View
    public final void onFocusChanged(boolean z10, int i10, Rect rect) {
        super.onFocusChanged(z10, i10, rect);
        if (this.f15019N) {
            C2987b c2987b = this.f15018M;
            int i11 = c2987b.f33701l;
            if (i11 != Integer.MIN_VALUE) {
                c2987b.m11504j(i11);
            }
            if (z10) {
                c2987b.m11509q(i10, rect);
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
        int i10;
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setClassName(getAccessibilityClassName());
        C2988a c2988a = this.f15023e;
        accessibilityNodeInfo.setCheckable(c2988a != null && c2988a.f15081l0);
        accessibilityNodeInfo.setClickable(isClickable());
        if (getParent() instanceof C8520c) {
            C8520c c8520c = (C8520c) getParent();
            int iIntValue = -1;
            if (!c8520c.f52027c) {
                i10 = -1;
                break;
            }
            int i11 = 0;
            i10 = 0;
            while (true) {
                if (i11 >= c8520c.getChildCount()) {
                    i10 = -1;
                    break;
                }
                View childAt = c8520c.getChildAt(i11);
                if (childAt instanceof Chip) {
                    if (!(c8520c.getChildAt(i11).getVisibility() == 0)) {
                        continue;
                    } else if (((Chip) childAt) == this) {
                        break;
                    } else {
                        i10++;
                    }
                }
                i11++;
            }
            Object tag = getTag(com.linguist.R.id.row_index_key);
            if (tag instanceof Integer) {
                iIntValue = ((Integer) tag).intValue();
            }
            accessibilityNodeInfo.setCollectionItemInfo((AccessibilityNodeInfo.CollectionItemInfo) C10284f.c.m19275a(iIntValue, 1, i10, 1, isChecked()).f51760a);
        }
    }

    @Override // android.widget.Button, android.widget.TextView, android.view.View
    @TargetApi(24)
    public final PointerIcon onResolvePointerIcon(MotionEvent motionEvent, int i10) {
        if (getCloseIconTouchBounds().contains(motionEvent.getX(), motionEvent.getY()) && isEnabled()) {
            return PointerIcon.getSystemIcon(getContext(), 1002);
        }
        return null;
    }

    @Override // android.widget.TextView, android.view.View
    @TargetApi(17)
    public final void onRtlPropertiesChanged(int i10) {
        super.onRtlPropertiesChanged(i10);
        if (this.f15015J != i10) {
            this.f15015J = i10;
            m8678h();
        }
    }

    @Override // android.widget.TextView, android.view.View
    @SuppressLint({"ClickableViewAccessibility"})
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        boolean z10;
        int actionMasked = motionEvent.getActionMasked();
        boolean zContains = getCloseIconTouchBounds().contains(motionEvent.getX(), motionEvent.getY());
        if (actionMasked != 0) {
            if (actionMasked != 1) {
                if (actionMasked != 2) {
                    if (actionMasked != 3) {
                    }
                } else if (this.f15029k) {
                    if (!zContains) {
                        setCloseIconPressed(false);
                    }
                    z10 = true;
                }
                z10 = false;
            } else {
                if (this.f15029k) {
                    playSoundEffect(0);
                    View.OnClickListener onClickListener = this.f15026h;
                    if (onClickListener != null) {
                        onClickListener.onClick(this);
                    }
                    if (this.f15019N) {
                        this.f15018M.m11512x(1, 1);
                    }
                    z10 = true;
                }
                setCloseIconPressed(false);
            }
            z10 = false;
            setCloseIconPressed(false);
        } else {
            if (zContains) {
                setCloseIconPressed(true);
                z10 = true;
            }
            z10 = false;
        }
        return z10 || super.onTouchEvent(motionEvent);
    }

    public void setAccessibilityClassName(CharSequence charSequence) {
        this.f15017L = charSequence;
    }

    @Override // android.view.View
    public void setBackground(Drawable drawable) {
        if (drawable == getBackgroundDrawable() || drawable == this.f15025g) {
            super.setBackground(drawable);
        } else {
            Log.w("Chip", "Do not set the background; Chip manages its own background drawable.");
        }
    }

    @Override // android.view.View
    public void setBackgroundColor(int i10) {
        Log.w("Chip", "Do not set the background color; Chip manages its own background drawable.");
    }

    @Override // androidx.appcompat.widget.AppCompatCheckBox, android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
        if (drawable == getBackgroundDrawable() || drawable == this.f15025g) {
            super.setBackgroundDrawable(drawable);
        } else {
            Log.w("Chip", "Do not set the background drawable; Chip manages its own background drawable.");
        }
    }

    @Override // androidx.appcompat.widget.AppCompatCheckBox, android.view.View
    public void setBackgroundResource(int i10) {
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

    public void setCheckable(boolean z10) {
        C2988a c2988a = this.f15023e;
        if (c2988a != null) {
            c2988a.m8691D(z10);
        }
    }

    public void setCheckableResource(int i10) {
        C2988a c2988a = this.f15023e;
        if (c2988a != null) {
            c2988a.m8691D(c2988a.f15095z0.getResources().getBoolean(i10));
        }
    }

    @Override // android.widget.CompoundButton, android.widget.Checkable
    public void setChecked(boolean z10) {
        C2988a c2988a = this.f15023e;
        if (c2988a == null) {
            this.f15028j = z10;
        } else {
            if (c2988a.f15081l0) {
                super.setChecked(z10);
            }
        }
    }

    public void setCheckedIcon(Drawable drawable) {
        C2988a c2988a = this.f15023e;
        if (c2988a != null) {
            c2988a.m8692E(drawable);
        }
    }

    @Deprecated
    public void setCheckedIconEnabled(boolean z10) {
        setCheckedIconVisible(z10);
    }

    @Deprecated
    public void setCheckedIconEnabledResource(int i10) {
        setCheckedIconVisible(i10);
    }

    public void setCheckedIconResource(int i10) {
        C2988a c2988a = this.f15023e;
        if (c2988a != null) {
            c2988a.m8692E(C5452a.m11672a(c2988a.f15095z0, i10));
        }
    }

    public void setCheckedIconTint(ColorStateList colorStateList) {
        C2988a c2988a = this.f15023e;
        if (c2988a != null) {
            c2988a.m8693F(colorStateList);
        }
    }

    public void setCheckedIconTintResource(int i10) {
        C2988a c2988a = this.f15023e;
        if (c2988a != null) {
            c2988a.m8693F(C7472a.m14842b(i10, c2988a.f15095z0));
        }
    }

    public void setCheckedIconVisible(int i10) {
        C2988a c2988a = this.f15023e;
        if (c2988a != null) {
            c2988a.m8694G(c2988a.f15095z0.getResources().getBoolean(i10));
        }
    }

    public void setCheckedIconVisible(boolean z10) {
        C2988a c2988a = this.f15023e;
        if (c2988a != null) {
            c2988a.m8694G(z10);
        }
    }

    public void setChipBackgroundColor(ColorStateList colorStateList) {
        C2988a c2988a = this.f15023e;
        if (c2988a != null && c2988a.f15055T != colorStateList) {
            c2988a.f15055T = colorStateList;
            c2988a.onStateChange(c2988a.getState());
        }
    }

    public void setChipBackgroundColorResource(int i10) {
        ColorStateList colorStateListM14842b;
        C2988a c2988a = this.f15023e;
        if (c2988a != null && c2988a.f15055T != (colorStateListM14842b = C7472a.m14842b(i10, c2988a.f15095z0))) {
            c2988a.f15055T = colorStateListM14842b;
            c2988a.onStateChange(c2988a.getState());
        }
    }

    @Deprecated
    public void setChipCornerRadius(float f3) {
        C2988a c2988a = this.f15023e;
        if (c2988a != null) {
            c2988a.m8695H(f3);
        }
    }

    @Deprecated
    public void setChipCornerRadiusResource(int i10) {
        C2988a c2988a = this.f15023e;
        if (c2988a != null) {
            c2988a.m8695H(c2988a.f15095z0.getResources().getDimension(i10));
        }
    }

    public void setChipDrawable(C2988a c2988a) {
        C2988a c2988a2 = this.f15023e;
        if (c2988a2 != c2988a) {
            if (c2988a2 != null) {
                c2988a2.f15062W0 = new WeakReference<>(null);
            }
            this.f15023e = c2988a;
            c2988a.f15066Y0 = false;
            c2988a.f15062W0 = new WeakReference<>(this);
            m8674d(this.f15016K);
        }
    }

    public void setChipEndPadding(float f3) {
        C2988a c2988a = this.f15023e;
        if (c2988a != null && c2988a.f15094y0 != f3) {
            c2988a.f15094y0 = f3;
            c2988a.invalidateSelf();
            c2988a.m8689B();
        }
    }

    public void setChipEndPaddingResource(int i10) {
        C2988a c2988a = this.f15023e;
        if (c2988a != null) {
            float dimension = c2988a.f15095z0.getResources().getDimension(i10);
            if (c2988a.f15094y0 != dimension) {
                c2988a.f15094y0 = dimension;
                c2988a.invalidateSelf();
                c2988a.m8689B();
            }
        }
    }

    public void setChipIcon(Drawable drawable) {
        C2988a c2988a = this.f15023e;
        if (c2988a != null) {
            c2988a.m8696I(drawable);
        }
    }

    @Deprecated
    public void setChipIconEnabled(boolean z10) {
        setChipIconVisible(z10);
    }

    @Deprecated
    public void setChipIconEnabledResource(int i10) {
        setChipIconVisible(i10);
    }

    public void setChipIconResource(int i10) {
        C2988a c2988a = this.f15023e;
        if (c2988a != null) {
            c2988a.m8696I(C5452a.m11672a(c2988a.f15095z0, i10));
        }
    }

    public void setChipIconSize(float f3) {
        C2988a c2988a = this.f15023e;
        if (c2988a != null) {
            c2988a.m8697J(f3);
        }
    }

    public void setChipIconSizeResource(int i10) {
        C2988a c2988a = this.f15023e;
        if (c2988a != null) {
            c2988a.m8697J(c2988a.f15095z0.getResources().getDimension(i10));
        }
    }

    public void setChipIconTint(ColorStateList colorStateList) {
        C2988a c2988a = this.f15023e;
        if (c2988a != null) {
            c2988a.m8698K(colorStateList);
        }
    }

    public void setChipIconTintResource(int i10) {
        C2988a c2988a = this.f15023e;
        if (c2988a != null) {
            c2988a.m8698K(C7472a.m14842b(i10, c2988a.f15095z0));
        }
    }

    public void setChipIconVisible(int i10) {
        C2988a c2988a = this.f15023e;
        if (c2988a != null) {
            c2988a.m8699L(c2988a.f15095z0.getResources().getBoolean(i10));
        }
    }

    public void setChipIconVisible(boolean z10) {
        C2988a c2988a = this.f15023e;
        if (c2988a != null) {
            c2988a.m8699L(z10);
        }
    }

    public void setChipMinHeight(float f3) {
        C2988a c2988a = this.f15023e;
        if (c2988a == null || c2988a.f15057U == f3) {
            return;
        }
        c2988a.f15057U = f3;
        c2988a.invalidateSelf();
        c2988a.m8689B();
    }

    public void setChipMinHeightResource(int i10) {
        C2988a c2988a = this.f15023e;
        if (c2988a != null) {
            float dimension = c2988a.f15095z0.getResources().getDimension(i10);
            if (c2988a.f15057U != dimension) {
                c2988a.f15057U = dimension;
                c2988a.invalidateSelf();
                c2988a.m8689B();
            }
        }
    }

    public void setChipStartPadding(float f3) {
        C2988a c2988a = this.f15023e;
        if (c2988a != null && c2988a.f15087r0 != f3) {
            c2988a.f15087r0 = f3;
            c2988a.invalidateSelf();
            c2988a.m8689B();
        }
    }

    public void setChipStartPaddingResource(int i10) {
        C2988a c2988a = this.f15023e;
        if (c2988a != null) {
            float dimension = c2988a.f15095z0.getResources().getDimension(i10);
            if (c2988a.f15087r0 != dimension) {
                c2988a.f15087r0 = dimension;
                c2988a.invalidateSelf();
                c2988a.m8689B();
            }
        }
    }

    public void setChipStrokeColor(ColorStateList colorStateList) {
        C2988a c2988a = this.f15023e;
        if (c2988a != null) {
            c2988a.m8700M(colorStateList);
        }
    }

    public void setChipStrokeColorResource(int i10) {
        C2988a c2988a = this.f15023e;
        if (c2988a != null) {
            c2988a.m8700M(C7472a.m14842b(i10, c2988a.f15095z0));
        }
    }

    public void setChipStrokeWidth(float f3) {
        C2988a c2988a = this.f15023e;
        if (c2988a != null) {
            c2988a.m8701N(f3);
        }
    }

    public void setChipStrokeWidthResource(int i10) {
        C2988a c2988a = this.f15023e;
        if (c2988a != null) {
            c2988a.m8701N(c2988a.f15095z0.getResources().getDimension(i10));
        }
    }

    @Deprecated
    public void setChipText(CharSequence charSequence) {
        setText(charSequence);
    }

    @Deprecated
    public void setChipTextResource(int i10) {
        setText(getResources().getString(i10));
    }

    public void setCloseIcon(Drawable drawable) {
        C2988a c2988a = this.f15023e;
        if (c2988a != null) {
            c2988a.m8702O(drawable);
        }
        m8676f();
    }

    public void setCloseIconContentDescription(CharSequence charSequence) {
        C2988a c2988a = this.f15023e;
        if (c2988a == null || c2988a.f15080k0 == charSequence) {
            return;
        }
        String str = C9627a.f49305d;
        Locale locale = Locale.getDefault();
        int i10 = C9633g.f49328a;
        boolean z10 = true;
        if (C9633g.a.m18109a(locale) != 1) {
            z10 = false;
        }
        C9627a c9627a = z10 ? C9627a.f49308g : C9627a.f49307f;
        c2988a.f15080k0 = c9627a.m18097c(charSequence, c9627a.f49311c);
        c2988a.invalidateSelf();
    }

    @Deprecated
    public void setCloseIconEnabled(boolean z10) {
        setCloseIconVisible(z10);
    }

    @Deprecated
    public void setCloseIconEnabledResource(int i10) {
        setCloseIconVisible(i10);
    }

    public void setCloseIconEndPadding(float f3) {
        C2988a c2988a = this.f15023e;
        if (c2988a != null) {
            c2988a.m8703P(f3);
        }
    }

    public void setCloseIconEndPaddingResource(int i10) {
        C2988a c2988a = this.f15023e;
        if (c2988a != null) {
            c2988a.m8703P(c2988a.f15095z0.getResources().getDimension(i10));
        }
    }

    public void setCloseIconResource(int i10) {
        C2988a c2988a = this.f15023e;
        if (c2988a != null) {
            c2988a.m8702O(C5452a.m11672a(c2988a.f15095z0, i10));
        }
        m8676f();
    }

    public void setCloseIconSize(float f3) {
        C2988a c2988a = this.f15023e;
        if (c2988a != null) {
            c2988a.m8704Q(f3);
        }
    }

    public void setCloseIconSizeResource(int i10) {
        C2988a c2988a = this.f15023e;
        if (c2988a != null) {
            c2988a.m8704Q(c2988a.f15095z0.getResources().getDimension(i10));
        }
    }

    public void setCloseIconStartPadding(float f3) {
        C2988a c2988a = this.f15023e;
        if (c2988a != null) {
            c2988a.m8705R(f3);
        }
    }

    public void setCloseIconStartPaddingResource(int i10) {
        C2988a c2988a = this.f15023e;
        if (c2988a != null) {
            c2988a.m8705R(c2988a.f15095z0.getResources().getDimension(i10));
        }
    }

    public void setCloseIconTint(ColorStateList colorStateList) {
        C2988a c2988a = this.f15023e;
        if (c2988a != null) {
            c2988a.m8706S(colorStateList);
        }
    }

    public void setCloseIconTintResource(int i10) {
        C2988a c2988a = this.f15023e;
        if (c2988a != null) {
            c2988a.m8706S(C7472a.m14842b(i10, c2988a.f15095z0));
        }
    }

    public void setCloseIconVisible(int i10) {
        setCloseIconVisible(getResources().getBoolean(i10));
    }

    public void setCloseIconVisible(boolean z10) {
        C2988a c2988a = this.f15023e;
        if (c2988a != null) {
            c2988a.m8707T(z10);
        }
        m8676f();
    }

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    @Override // androidx.appcompat.widget.AppCompatCheckBox, android.widget.TextView
    public final void setCompoundDrawables(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        if (drawable != null) {
            throw new UnsupportedOperationException("Please set start drawable using R.attr#chipIcon.");
        }
        if (drawable3 != null) {
            throw new UnsupportedOperationException("Please set end drawable using R.attr#closeIcon.");
        }
        super.setCompoundDrawables(drawable, drawable2, drawable3, drawable4);
    }

    /* JADX WARN: Unreachable blocks removed: 2, instructions: 2 */
    @Override // androidx.appcompat.widget.AppCompatCheckBox, android.widget.TextView
    public final void setCompoundDrawablesRelative(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        if (drawable != null) {
            throw new UnsupportedOperationException("Please set start drawable using R.attr#chipIcon.");
        }
        if (drawable3 != null) {
            throw new UnsupportedOperationException("Please set end drawable using R.attr#closeIcon.");
        }
        super.setCompoundDrawablesRelative(drawable, drawable2, drawable3, drawable4);
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawablesRelativeWithIntrinsicBounds(int i10, int i11, int i12, int i13) {
        if (i10 != 0) {
            throw new UnsupportedOperationException("Please set start drawable using R.attr#chipIcon.");
        }
        if (i12 != 0) {
            throw new UnsupportedOperationException("Please set end drawable using R.attr#closeIcon.");
        }
        super.setCompoundDrawablesRelativeWithIntrinsicBounds(i10, i11, i12, i13);
    }

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    @Override // android.widget.TextView
    public final void setCompoundDrawablesRelativeWithIntrinsicBounds(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        if (drawable != null) {
            throw new UnsupportedOperationException("Please set start drawable using R.attr#chipIcon.");
        }
        if (drawable3 != null) {
            throw new UnsupportedOperationException("Please set end drawable using R.attr#closeIcon.");
        }
        super.setCompoundDrawablesRelativeWithIntrinsicBounds(drawable, drawable2, drawable3, drawable4);
    }

    /* JADX WARN: Unreachable blocks removed: 2, instructions: 2 */
    @Override // android.widget.TextView
    public final void setCompoundDrawablesWithIntrinsicBounds(int i10, int i11, int i12, int i13) {
        if (i10 != 0) {
            throw new UnsupportedOperationException("Please set start drawable using R.attr#chipIcon.");
        }
        if (i12 != 0) {
            throw new UnsupportedOperationException("Please set end drawable using R.attr#closeIcon.");
        }
        super.setCompoundDrawablesWithIntrinsicBounds(i10, i11, i12, i13);
    }

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    @Override // android.widget.TextView
    public final void setCompoundDrawablesWithIntrinsicBounds(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        if (drawable != null) {
            throw new UnsupportedOperationException("Please set left drawable using R.attr#chipIcon.");
        }
        if (drawable3 != null) {
            throw new UnsupportedOperationException("Please set right drawable using R.attr#closeIcon.");
        }
        super.setCompoundDrawablesWithIntrinsicBounds(drawable, drawable2, drawable3, drawable4);
    }

    @Override // android.view.View
    public void setElevation(float f3) {
        super.setElevation(f3);
        C2988a c2988a = this.f15023e;
        if (c2988a != null) {
            c2988a.m12140l(f3);
        }
    }

    @Override // android.widget.TextView
    public void setEllipsize(TextUtils.TruncateAt truncateAt) {
        if (this.f15023e == null) {
            return;
        }
        if (truncateAt == TextUtils.TruncateAt.MARQUEE) {
            throw new UnsupportedOperationException("Text within a chip are not allowed to scroll.");
        }
        super.setEllipsize(truncateAt);
        C2988a c2988a = this.f15023e;
        if (c2988a != null) {
            c2988a.f15064X0 = truncateAt;
        }
    }

    public void setEnsureMinTouchTargetSize(boolean z10) {
        this.f15014I = z10;
        m8674d(this.f15016K);
    }

    @Override // android.widget.TextView
    public void setGravity(int i10) {
        if (i10 != 8388627) {
            Log.w("Chip", "Chip text must be vertically center and start aligned");
        } else {
            super.setGravity(i10);
        }
    }

    public void setHideMotionSpec(C6314g c6314g) {
        C2988a c2988a = this.f15023e;
        if (c2988a != null) {
            c2988a.f15086q0 = c6314g;
        }
    }

    public void setHideMotionSpecResource(int i10) {
        C2988a c2988a = this.f15023e;
        if (c2988a != null) {
            c2988a.f15086q0 = C6314g.m12939a(i10, c2988a.f15095z0);
        }
    }

    public void setIconEndPadding(float f3) {
        C2988a c2988a = this.f15023e;
        if (c2988a != null) {
            c2988a.m8708U(f3);
        }
    }

    public void setIconEndPaddingResource(int i10) {
        C2988a c2988a = this.f15023e;
        if (c2988a != null) {
            c2988a.m8708U(c2988a.f15095z0.getResources().getDimension(i10));
        }
    }

    public void setIconStartPadding(float f3) {
        C2988a c2988a = this.f15023e;
        if (c2988a != null) {
            c2988a.m8709V(f3);
        }
    }

    public void setIconStartPaddingResource(int i10) {
        C2988a c2988a = this.f15023e;
        if (c2988a != null) {
            c2988a.m8709V(c2988a.f15095z0.getResources().getDimension(i10));
        }
    }

    public void setInternalOnCheckedChangeListener(InterfaceC10339f<Chip> interfaceC10339f) {
    }

    @Override // android.view.View
    public void setLayoutDirection(int i10) {
        if (this.f15023e == null) {
            return;
        }
        super.setLayoutDirection(i10);
    }

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    @Override // android.widget.TextView
    public void setLines(int i10) {
        if (i10 > 1) {
            throw new UnsupportedOperationException("Chip does not support multi-line text");
        }
        super.setLines(i10);
    }

    @Override // android.widget.TextView
    public void setMaxLines(int i10) {
        if (i10 > 1) {
            throw new UnsupportedOperationException("Chip does not support multi-line text");
        }
        super.setMaxLines(i10);
    }

    @Override // android.widget.TextView
    public void setMaxWidth(int i10) {
        super.setMaxWidth(i10);
        C2988a c2988a = this.f15023e;
        if (c2988a != null) {
            c2988a.f15068Z0 = i10;
        }
    }

    @Override // android.widget.TextView
    public void setMinLines(int i10) {
        if (i10 > 1) {
            throw new UnsupportedOperationException("Chip does not support multi-line text");
        }
        super.setMinLines(i10);
    }

    @Override // android.widget.CompoundButton
    public void setOnCheckedChangeListener(CompoundButton.OnCheckedChangeListener onCheckedChangeListener) {
        this.f15027i = onCheckedChangeListener;
    }

    public void setOnCloseIconClickListener(View.OnClickListener onClickListener) {
        this.f15026h = onClickListener;
        m8676f();
    }

    public void setRippleColor(ColorStateList colorStateList) {
        C2988a c2988a = this.f15023e;
        if (c2988a != null) {
            c2988a.m8710W(colorStateList);
        }
        if (this.f15023e.f15058U0) {
            return;
        }
        m8677g();
    }

    public void setRippleColorResource(int i10) {
        C2988a c2988a = this.f15023e;
        if (c2988a != null) {
            c2988a.m8710W(C7472a.m14842b(i10, c2988a.f15095z0));
            if (this.f15023e.f15058U0) {
                return;
            }
            m8677g();
        }
    }

    @Override // gd.InterfaceC5776o
    public void setShapeAppearanceModel(C5772k c5772k) {
        this.f15023e.setShapeAppearanceModel(c5772k);
    }

    public void setShowMotionSpec(C6314g c6314g) {
        C2988a c2988a = this.f15023e;
        if (c2988a != null) {
            c2988a.f15085p0 = c6314g;
        }
    }

    public void setShowMotionSpecResource(int i10) {
        C2988a c2988a = this.f15023e;
        if (c2988a != null) {
            c2988a.f15085p0 = C6314g.m12939a(i10, c2988a.f15095z0);
        }
    }

    @Override // android.widget.TextView
    public void setSingleLine(boolean z10) {
        if (!z10) {
            throw new UnsupportedOperationException("Chip does not support multi-line text");
        }
        super.setSingleLine(z10);
    }

    @Override // android.widget.TextView
    public final void setText(CharSequence charSequence, TextView.BufferType bufferType) {
        C2988a c2988a = this.f15023e;
        if (c2988a == null) {
            return;
        }
        if (charSequence == null) {
            charSequence = "";
        }
        super.setText(c2988a.f15066Y0 ? null : charSequence, bufferType);
        C2988a c2988a2 = this.f15023e;
        if (c2988a2 != null && !TextUtils.equals(c2988a2.f15067Z, charSequence)) {
            c2988a2.f15067Z = charSequence;
            c2988a2.f15040F0.f52042d = true;
            c2988a2.invalidateSelf();
            c2988a2.m8689B();
        }
    }

    @Override // android.widget.TextView
    public void setTextAppearance(int i10) {
        super.setTextAppearance(i10);
        C2988a c2988a = this.f15023e;
        if (c2988a != null) {
            Context context = c2988a.f15095z0;
            c2988a.f15040F0.m19353b(new C5151d(context, i10), context);
        }
        m8679i();
    }

    @Override // android.widget.TextView
    public final void setTextAppearance(Context context, int i10) {
        super.setTextAppearance(context, i10);
        C2988a c2988a = this.f15023e;
        if (c2988a != null) {
            Context context2 = c2988a.f15095z0;
            c2988a.f15040F0.m19353b(new C5151d(context2, i10), context2);
        }
        m8679i();
    }

    public void setTextAppearance(C5151d c5151d) {
        C2988a c2988a = this.f15023e;
        if (c2988a != null) {
            c2988a.f15040F0.m19353b(c5151d, c2988a.f15095z0);
        }
        m8679i();
    }

    public void setTextAppearanceResource(int i10) {
        setTextAppearance(getContext(), i10);
    }

    public void setTextEndPadding(float f3) {
        C2988a c2988a = this.f15023e;
        if (c2988a == null || c2988a.f15091v0 == f3) {
            return;
        }
        c2988a.f15091v0 = f3;
        c2988a.invalidateSelf();
        c2988a.m8689B();
    }

    public void setTextEndPaddingResource(int i10) {
        C2988a c2988a = this.f15023e;
        if (c2988a != null) {
            float dimension = c2988a.f15095z0.getResources().getDimension(i10);
            if (c2988a.f15091v0 != dimension) {
                c2988a.f15091v0 = dimension;
                c2988a.invalidateSelf();
                c2988a.m8689B();
            }
        }
    }

    @Override // android.widget.TextView
    public final void setTextSize(int i10, float f3) {
        super.setTextSize(i10, f3);
        C2988a c2988a = this.f15023e;
        if (c2988a != null) {
            float fApplyDimension = TypedValue.applyDimension(i10, f3, getResources().getDisplayMetrics());
            C10341h c10341h = c2988a.f15040F0;
            C5151d c5151d = c10341h.f52044f;
            if (c5151d != null) {
                c5151d.f33137k = fApplyDimension;
                c10341h.f52039a.setTextSize(fApplyDimension);
                c2988a.mo8572a();
            }
        }
        m8679i();
    }

    public void setTextStartPadding(float f3) {
        C2988a c2988a = this.f15023e;
        if (c2988a == null || c2988a.f15090u0 == f3) {
            return;
        }
        c2988a.f15090u0 = f3;
        c2988a.invalidateSelf();
        c2988a.m8689B();
    }

    public void setTextStartPaddingResource(int i10) {
        C2988a c2988a = this.f15023e;
        if (c2988a != null) {
            float dimension = c2988a.f15095z0.getResources().getDimension(i10);
            if (c2988a.f15090u0 != dimension) {
                c2988a.f15090u0 = dimension;
                c2988a.invalidateSelf();
                c2988a.m8689B();
            }
        }
    }
}
