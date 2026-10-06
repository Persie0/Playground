package com.google.android.material.button;

import android.R;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.InsetDrawable;
import android.graphics.drawable.LayerDrawable;
import android.graphics.drawable.RippleDrawable;
import android.os.Parcelable;
import android.support.v7.widget.AppCompatButton;
import android.text.Layout;
import android.text.TextPaint;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.Log;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.Button;
import android.widget.Checkable;
import android.widget.CompoundButton;
import com.google.android.apps.camera.bottombar.C0100R;
import java.util.Iterator;
import java.util.LinkedHashSet;
import p000.C0194fs;
import p000.C0266ij;
import p000.abm;
import p000.acv;
import p000.afc;
import p000.ahr;
import p000.lij;
import p000.mhe;
import p000.mhf;
import p000.mhg;
import p000.mhh;
import p000.mhi;
import p000.mjb;
import p000.mkq;
import p000.mkv;
import p000.mkx;
import p000.mlc;
import p000.mll;
import p000.mmp;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public class MaterialButton extends AppCompatButton implements Checkable, mll {

    /* JADX INFO: renamed from: b */
    private static final int[] f8131b = {R.attr.state_checkable};

    /* JADX INFO: renamed from: c */
    private static final int[] f8132c = {R.attr.state_checked};

    /* JADX INFO: renamed from: d */
    private final mhg f8133d;

    /* JADX INFO: renamed from: e */
    private final LinkedHashSet f8134e;

    /* JADX INFO: renamed from: f */
    private PorterDuff.Mode f8135f;

    /* JADX INFO: renamed from: g */
    private ColorStateList f8136g;

    /* JADX INFO: renamed from: h */
    private Drawable f8137h;

    /* JADX INFO: renamed from: i */
    private int f8138i;

    /* JADX INFO: renamed from: j */
    private int f8139j;

    /* JADX INFO: renamed from: k */
    private int f8140k;

    /* JADX INFO: renamed from: l */
    private int f8141l;

    /* JADX INFO: renamed from: m */
    private boolean f8142m;

    /* JADX INFO: renamed from: n */
    private boolean f8143n;

    /* JADX INFO: renamed from: o */
    private int f8144o;

    public MaterialButton(Context context) {
        this(context, null);
    }

    /* JADX INFO: renamed from: a */
    private final void m4819a() {
        if (m4823j()) {
            abm.m139f(this, this.f8137h, null, null);
        } else if (m4822i()) {
            abm.m139f(this, null, null, this.f8137h);
        } else if (m4824k()) {
            abm.m139f(this, null, this.f8137h, null);
        }
    }

    /* JADX INFO: renamed from: g */
    private final void m4820g(boolean z) {
        Drawable drawable = this.f8137h;
        if (drawable != null) {
            Drawable drawableMutate = drawable.mutate();
            this.f8137h = drawableMutate;
            acv.m238g(drawableMutate, this.f8136g);
            PorterDuff.Mode mode = this.f8135f;
            if (mode != null) {
                acv.m239h(this.f8137h, mode);
            }
            int intrinsicWidth = this.f8138i;
            if (intrinsicWidth == 0) {
                intrinsicWidth = this.f8137h.getIntrinsicWidth();
            }
            int intrinsicHeight = this.f8138i;
            if (intrinsicHeight == 0) {
                intrinsicHeight = this.f8137h.getIntrinsicHeight();
            }
            Drawable drawable2 = this.f8137h;
            int i = this.f8139j;
            int i2 = this.f8140k;
            drawable2.setBounds(i, i2, intrinsicWidth + i, intrinsicHeight + i2);
            this.f8137h.setVisible(true, z);
        }
        if (z) {
            m4819a();
            return;
        }
        Drawable[] drawableArrM695h = ahr.m695h(this);
        Drawable drawable3 = drawableArrM695h[0];
        Drawable drawable4 = drawableArrM695h[1];
        Drawable drawable5 = drawableArrM695h[2];
        if ((!m4823j() || drawable3 == this.f8137h) && ((!m4822i() || drawable5 == this.f8137h) && (!m4824k() || drawable4 == this.f8137h))) {
            return;
        }
        m4819a();
    }

    /* JADX WARN: Code duplicated, block: B:35:0x00ae  */
    /* JADX WARN: Code duplicated, block: B:36:0x00b1  */
    /* JADX INFO: renamed from: h */
    private final void m4821h(int i, int i2) {
        Layout.Alignment alignment;
        int iMin;
        if (this.f8137h == null || getLayout() == null) {
            return;
        }
        if (!m4823j() && !m4822i()) {
            if (m4824k()) {
                this.f8139j = 0;
                if (this.f8144o == 16) {
                    this.f8140k = 0;
                    m4820g(false);
                    return;
                }
                int intrinsicHeight = this.f8138i;
                if (intrinsicHeight == 0) {
                    intrinsicHeight = this.f8137h.getIntrinsicHeight();
                }
                if (getLineCount() > 1) {
                    iMin = getLayout().getHeight();
                } else {
                    TextPaint paint = getPaint();
                    String string = getText().toString();
                    if (getTransformationMethod() != null) {
                        string = getTransformationMethod().getTransformation(string, this).toString();
                    }
                    Rect rect = new Rect();
                    paint.getTextBounds(string, 0, string.length(), rect);
                    iMin = Math.min(rect.height(), getLayout().getHeight());
                }
                int iMax = Math.max(0, (((((i2 - iMin) - getPaddingTop()) - intrinsicHeight) - this.f8141l) - getPaddingBottom()) / 2);
                if (this.f8140k != iMax) {
                    this.f8140k = iMax;
                    m4820g(false);
                    return;
                }
                return;
            }
            return;
        }
        this.f8140k = 0;
        switch (getTextAlignment()) {
            case 1:
                switch (getGravity() & 8388615) {
                    case 1:
                        alignment = Layout.Alignment.ALIGN_CENTER;
                        break;
                    case 5:
                    case 8388613:
                        alignment = Layout.Alignment.ALIGN_OPPOSITE;
                        break;
                    default:
                        alignment = Layout.Alignment.ALIGN_NORMAL;
                        break;
                }
                break;
            case 2:
            case 5:
            default:
                alignment = Layout.Alignment.ALIGN_NORMAL;
                break;
            case 3:
            case 6:
                alignment = Layout.Alignment.ALIGN_OPPOSITE;
                break;
            case 4:
                alignment = Layout.Alignment.ALIGN_CENTER;
                break;
        }
        int i3 = this.f8144o;
        if (i3 == 1 || i3 == 3 || ((i3 == 2 && alignment == Layout.Alignment.ALIGN_NORMAL) || (this.f8144o == 4 && alignment == Layout.Alignment.ALIGN_OPPOSITE))) {
            this.f8139j = 0;
            m4820g(false);
            return;
        }
        int intrinsicWidth = this.f8138i;
        if (intrinsicWidth == 0) {
            intrinsicWidth = this.f8137h.getIntrinsicWidth();
        }
        int lineCount = getLineCount();
        float fMax = 0.0f;
        for (int i4 = 0; i4 < lineCount; i4++) {
            fMax = Math.max(fMax, getLayout().getLineWidth(i4));
        }
        int iCeil = ((((i - ((int) Math.ceil(fMax))) - afc.m443d(this)) - intrinsicWidth) - this.f8141l) - afc.m444e(this);
        if (alignment == Layout.Alignment.ALIGN_CENTER) {
            iCeil /= 2;
        }
        if ((afc.m442c(this) == 1) != (this.f8144o == 4)) {
            iCeil = -iCeil;
        }
        if (this.f8139j != iCeil) {
            this.f8139j = iCeil;
            m4820g(false);
        }
    }

    /* JADX INFO: renamed from: i */
    private final boolean m4822i() {
        int i = this.f8144o;
        return i == 3 || i == 4;
    }

    /* JADX INFO: renamed from: j */
    private final boolean m4823j() {
        int i = this.f8144o;
        return i == 1 || i == 2;
    }

    /* JADX INFO: renamed from: k */
    private final boolean m4824k() {
        int i = this.f8144o;
        return i == 16 || i == 32;
    }

    /* JADX INFO: renamed from: l */
    private final boolean m4825l() {
        mhg mhgVar = this.f8133d;
        return (mhgVar == null || mhgVar.f40503n) ? false : true;
    }

    /* JADX INFO: renamed from: b */
    final String m4826b() {
        if (TextUtils.isEmpty(null)) {
            return (true != m4830f() ? Button.class : CompoundButton.class).getName();
        }
        return null;
    }

    /* JADX INFO: renamed from: f */
    public final boolean m4830f() {
        mhg mhgVar = this.f8133d;
        return mhgVar != null && mhgVar.f40504o;
    }

    @Override // android.view.View
    public final ColorStateList getBackgroundTintList() {
        if (m4825l()) {
            return this.f8133d.f40499j;
        }
        C0266ij c0266ij = this.f1000a;
        if (c0266ij != null) {
            return c0266ij.m11390a();
        }
        return null;
    }

    @Override // android.view.View
    public final PorterDuff.Mode getBackgroundTintMode() {
        if (m4825l()) {
            return this.f8133d.f40498i;
        }
        C0266ij c0266ij = this.f1000a;
        if (c0266ij != null) {
            return c0266ij.m11391b();
        }
        return null;
    }

    @Override // android.widget.Checkable
    public final boolean isChecked() {
        return this.f8142m;
    }

    @Override // android.widget.TextView, android.view.View
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (m4825l()) {
            mkv.m16546k(this, this.f8133d.m16373a());
        }
    }

    @Override // android.widget.TextView, android.view.View
    protected final int[] onCreateDrawableState(int i) {
        int[] iArrOnCreateDrawableState = super.onCreateDrawableState(i + 2);
        if (m4830f()) {
            mergeDrawableStates(iArrOnCreateDrawableState, f8131b);
        }
        if (this.f8142m) {
            mergeDrawableStates(iArrOnCreateDrawableState, f8132c);
        }
        return iArrOnCreateDrawableState;
    }

    @Override // android.support.v7.widget.AppCompatButton, android.view.View
    public final void onInitializeAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        super.onInitializeAccessibilityEvent(accessibilityEvent);
        accessibilityEvent.setClassName(m4826b());
        accessibilityEvent.setChecked(this.f8142m);
    }

    @Override // android.support.v7.widget.AppCompatButton, android.view.View
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setClassName(m4826b());
        accessibilityNodeInfo.setCheckable(m4830f());
        accessibilityNodeInfo.setChecked(this.f8142m);
        accessibilityNodeInfo.setClickable(isClickable());
    }

    @Override // android.support.v7.widget.AppCompatButton, android.widget.TextView, android.view.View
    protected final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        m4821h(getMeasuredWidth(), getMeasuredHeight());
    }

    @Override // android.widget.TextView, android.view.View
    public final void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof mhf)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        mhf mhfVar = (mhf) parcelable;
        super.onRestoreInstanceState(mhfVar.f394d);
        setChecked(mhfVar.f40489a);
    }

    @Override // android.widget.TextView, android.view.View
    public final Parcelable onSaveInstanceState() {
        mhf mhfVar = new mhf(super.onSaveInstanceState());
        mhfVar.f40489a = this.f8142m;
        return mhfVar;
    }

    @Override // android.support.v7.widget.AppCompatButton, android.widget.TextView
    protected final void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        super.onTextChanged(charSequence, i, i2, i3);
        m4821h(getMeasuredWidth(), getMeasuredHeight());
    }

    @Override // android.view.View
    public final boolean performClick() {
        if (this.f8133d.f40505p) {
            toggle();
        }
        return super.performClick();
    }

    @Override // android.view.View
    public final void refreshDrawableState() {
        super.refreshDrawableState();
        if (this.f8137h != null) {
            if (this.f8137h.setState(getDrawableState())) {
                invalidate();
            }
        }
    }

    @Override // android.view.View
    public final void setBackground(Drawable drawable) {
        setBackgroundDrawable(drawable);
    }

    @Override // android.view.View
    public final void setBackgroundColor(int i) {
        if (!m4825l()) {
            super.setBackgroundColor(i);
            return;
        }
        mhg mhgVar = this.f8133d;
        if (mhgVar.m16373a() != null) {
            mhgVar.m16373a().setTint(i);
        }
    }

    @Override // android.support.v7.widget.AppCompatButton, android.view.View
    public final void setBackgroundDrawable(Drawable drawable) {
        if (!m4825l()) {
            super.setBackgroundDrawable(drawable);
        } else {
            if (drawable == getBackground()) {
                getBackground().setState(drawable.getState());
                return;
            }
            Log.w("MaterialButton", "MaterialButton manages its own background to control elevation, shape, color and states. Consider using backgroundTint, shapeAppearance and other attributes where available. A custom background will ignore these attributes and you should consider handling interaction states such as pressed, focused and disabled");
            this.f8133d.m16375c();
            super.setBackgroundDrawable(drawable);
        }
    }

    @Override // android.support.v7.widget.AppCompatButton, android.view.View
    public final void setBackgroundResource(int i) {
        setBackgroundDrawable(i != 0 ? C0194fs.m8752a(getContext(), i) : null);
    }

    @Override // android.view.View
    public final void setBackgroundTintList(ColorStateList colorStateList) {
        m4828d(colorStateList);
    }

    @Override // android.view.View
    public final void setBackgroundTintMode(PorterDuff.Mode mode) {
        m4829e(mode);
    }

    @Override // android.widget.Checkable
    public final void setChecked(boolean z) {
        if (m4830f() && isEnabled() && this.f8142m != z) {
            this.f8142m = z;
            refreshDrawableState();
            if (getParent() instanceof mhh) {
                throw null;
            }
            if (this.f8143n) {
                return;
            }
            this.f8143n = true;
            Iterator it = this.f8134e.iterator();
            while (it.hasNext()) {
                ((mhe) it.next()).m16370a();
            }
            this.f8143n = false;
        }
    }

    @Override // android.view.View
    public final void setElevation(float f) {
        super.setElevation(f);
        if (m4825l()) {
            this.f8133d.m16373a().m16578h(f);
        }
    }

    @Override // android.view.View
    public final void setTextAlignment(int i) {
        super.setTextAlignment(i);
        m4821h(getMeasuredWidth(), getMeasuredHeight());
    }

    @Override // android.widget.Checkable
    public final void toggle() {
        setChecked(!this.f8142m);
    }

    public MaterialButton(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, C0100R.attr.materialButtonStyle);
    }

    @Override // p000.mll
    /* JADX INFO: renamed from: c */
    public final void mo4827c(mlc mlcVar) {
        if (!m4825l()) {
            throw new IllegalStateException("Attempted to set ShapeAppearanceModel on a MaterialButton which has an overwritten background.");
        }
        this.f8133d.m16376d(mlcVar);
    }

    /* JADX INFO: renamed from: d */
    public final void m4828d(ColorStateList colorStateList) {
        if (!m4825l()) {
            C0266ij c0266ij = this.f1000a;
            if (c0266ij != null) {
                c0266ij.m11396g(colorStateList);
                return;
            }
            return;
        }
        mhg mhgVar = this.f8133d;
        if (mhgVar.f40499j != colorStateList) {
            mhgVar.f40499j = colorStateList;
            if (mhgVar.m16373a() != null) {
                acv.m238g(mhgVar.m16373a(), mhgVar.f40499j);
            }
        }
    }

    /* JADX INFO: renamed from: e */
    public final void m4829e(PorterDuff.Mode mode) {
        if (!m4825l()) {
            C0266ij c0266ij = this.f1000a;
            if (c0266ij != null) {
                c0266ij.m11397h(mode);
                return;
            }
            return;
        }
        mhg mhgVar = this.f8133d;
        if (mhgVar.f40498i != mode) {
            mhgVar.f40498i = mode;
            if (mhgVar.m16373a() == null || mhgVar.f40498i == null) {
                return;
            }
            acv.m239h(mhgVar.m16373a(), mhgVar.f40498i);
        }
    }

    public MaterialButton(Context context, AttributeSet attributeSet, int i) {
        super(mmp.m16632a(context, attributeSet, i, C0100R.style.Widget_MaterialComponents_Button), attributeSet, i);
        this.f8134e = new LinkedHashSet();
        this.f8142m = false;
        this.f8143n = false;
        Context context2 = getContext();
        TypedArray typedArrayM16438a = mjb.m16438a(context2, attributeSet, mhi.f40508a, i, C0100R.style.Widget_MaterialComponents_Button, new int[0]);
        this.f8141l = typedArrayM16438a.getDimensionPixelSize(12, 0);
        this.f8135f = lij.m15400H(typedArrayM16438a.getInt(15, -1), PorterDuff.Mode.SRC_IN);
        this.f8136g = mkv.m16540d(getContext(), typedArrayM16438a, 14);
        this.f8137h = mkv.m16541e(getContext(), typedArrayM16438a, 10);
        this.f8144o = typedArrayM16438a.getInteger(11, 1);
        this.f8138i = typedArrayM16438a.getDimensionPixelSize(13, 0);
        mhg mhgVar = new mhg(this, mlc.m16590a(context2, attributeSet, i, C0100R.style.Widget_MaterialComponents_Button).m16589a());
        this.f8133d = mhgVar;
        mhgVar.f40492c = typedArrayM16438a.getDimensionPixelOffset(1, 0);
        mhgVar.f40493d = typedArrayM16438a.getDimensionPixelOffset(2, 0);
        mhgVar.f40494e = typedArrayM16438a.getDimensionPixelOffset(3, 0);
        mhgVar.f40495f = typedArrayM16438a.getDimensionPixelOffset(4, 0);
        if (typedArrayM16438a.hasValue(8)) {
            int dimensionPixelSize = typedArrayM16438a.getDimensionPixelSize(8, -1);
            mhgVar.f40496g = dimensionPixelSize;
            mhgVar.m16376d(mhgVar.f40491b.m16594d(dimensionPixelSize));
        }
        mhgVar.f40497h = typedArrayM16438a.getDimensionPixelSize(20, 0);
        mhgVar.f40498i = lij.m15400H(typedArrayM16438a.getInt(7, -1), PorterDuff.Mode.SRC_IN);
        mhgVar.f40499j = mkv.m16540d(mhgVar.f40490a.getContext(), typedArrayM16438a, 6);
        mhgVar.f40500k = mkv.m16540d(mhgVar.f40490a.getContext(), typedArrayM16438a, 19);
        mhgVar.f40501l = mkv.m16540d(mhgVar.f40490a.getContext(), typedArrayM16438a, 16);
        mhgVar.f40504o = typedArrayM16438a.getBoolean(5, false);
        mhgVar.f40507r = typedArrayM16438a.getDimensionPixelSize(9, 0);
        mhgVar.f40505p = typedArrayM16438a.getBoolean(21, true);
        int iM444e = afc.m444e(mhgVar.f40490a);
        int paddingTop = mhgVar.f40490a.getPaddingTop();
        int iM443d = afc.m443d(mhgVar.f40490a);
        int paddingBottom = mhgVar.f40490a.getPaddingBottom();
        if (typedArrayM16438a.hasValue(0)) {
            mhgVar.m16375c();
        } else {
            MaterialButton materialButton = mhgVar.f40490a;
            mkx mkxVar = new mkx(mhgVar.f40491b);
            mkxVar.m16577g(mhgVar.f40490a.getContext());
            acv.m238g(mkxVar, mhgVar.f40499j);
            PorterDuff.Mode mode = mhgVar.f40498i;
            if (mode != null) {
                acv.m239h(mkxVar, mode);
            }
            float f = mhgVar.f40497h;
            ColorStateList colorStateList = mhgVar.f40500k;
            mkxVar.m16582l(f);
            mkxVar.m16581k(colorStateList);
            mkx mkxVar2 = new mkx(mhgVar.f40491b);
            mkxVar2.setTint(0);
            mkxVar2.m16582l(mhgVar.f40497h);
            mkxVar2.m16581k(ColorStateList.valueOf(0));
            mhgVar.f40502m = new mkx(mhgVar.f40491b);
            acv.m237f(mhgVar.f40502m, -1);
            mhgVar.f40506q = new RippleDrawable(mkq.m16490b(mhgVar.f40501l), new InsetDrawable((Drawable) new LayerDrawable(new Drawable[]{mkxVar2, mkxVar}), mhgVar.f40492c, mhgVar.f40494e, mhgVar.f40493d, mhgVar.f40495f), mhgVar.f40502m);
            super.setBackgroundDrawable(mhgVar.f40506q);
            mkx mkxVarM16373a = mhgVar.m16373a();
            if (mkxVarM16373a != null) {
                mkxVarM16373a.m16578h(mhgVar.f40507r);
                mkxVarM16373a.setState(mhgVar.f40490a.getDrawableState());
            }
        }
        afc.m449j(mhgVar.f40490a, iM444e + mhgVar.f40492c, paddingTop + mhgVar.f40494e, iM443d + mhgVar.f40493d, paddingBottom + mhgVar.f40495f);
        typedArrayM16438a.recycle();
        setCompoundDrawablePadding(this.f8141l);
        m4820g(this.f8137h != null);
    }
}
