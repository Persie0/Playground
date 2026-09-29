package com.google.android.material.floatingactionbutton;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.ContextThemeWrapper;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.google.android.material.R$attr;
import com.google.android.material.R$style;
import com.google.android.material.R$styleable;
import com.google.android.material.appbar.AppBarLayout;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import com.google.android.material.button.MaterialButton;
import java.util.ArrayList;
import java.util.Iterator;
import p000.C3156jq;
import p000.C3340mm;
import p000.C3386nv;
import p000.dy9;
import p000.gv5;
import p000.gx2;
import p000.hc2;
import p000.hi8;
import p000.hm1;
import p000.hx2;
import p000.im1;
import p000.ix2;
import p000.lm1;
import p000.qs5;
import p000.r39;
import p000.r90;
import p000.s36;
import p000.s90;
import p000.ux5;
import p000.vj6;

/* JADX INFO: loaded from: classes2.dex */
public class ExtendedFloatingActionButton extends MaterialButton implements hm1 {

    /* JADX INFO: renamed from: G0 */
    public static final int f12953G0 = R$style.Widget_MaterialComponents_ExtendedFloatingActionButton_Icon;

    /* JADX INFO: renamed from: H0 */
    public static final r90 f12954H0 = new r90(Float.class, "width", 6);

    /* JADX INFO: renamed from: I0 */
    public static final r90 f12955I0 = new r90(Float.class, "height", 7);

    /* JADX INFO: renamed from: J0 */
    public static final r90 f12956J0 = new r90(Float.class, "paddingStart", 8);

    /* JADX INFO: renamed from: K0 */
    public static final r90 f12957K0 = new r90(Float.class, "paddingEnd", 9);

    /* JADX INFO: renamed from: A0 */
    public boolean f12958A0;

    /* JADX INFO: renamed from: B0 */
    public boolean f12959B0;

    /* JADX INFO: renamed from: C0 */
    public boolean f12960C0;

    /* JADX INFO: renamed from: D0 */
    public ColorStateList f12961D0;

    /* JADX INFO: renamed from: E0 */
    public int f12962E0;

    /* JADX INFO: renamed from: F0 */
    public int f12963F0;

    /* JADX INFO: renamed from: q0 */
    public int f12964q0;

    /* JADX INFO: renamed from: r0 */
    public boolean f12965r0;

    /* JADX INFO: renamed from: s0 */
    public final gx2 f12966s0;

    /* JADX INFO: renamed from: t0 */
    public final gx2 f12967t0;

    /* JADX INFO: renamed from: u0 */
    public final ix2 f12968u0;

    /* JADX INFO: renamed from: v0 */
    public final hx2 f12969v0;

    /* JADX INFO: renamed from: w0 */
    public int f12970w0;

    /* JADX INFO: renamed from: x0 */
    public int f12971x0;

    /* JADX INFO: renamed from: y0 */
    public int f12972y0;

    /* JADX INFO: renamed from: z0 */
    public final ExtendedFloatingActionButtonBehavior f12973z0;

    /* JADX WARN: Illegal instructions before constructor call */
    public ExtendedFloatingActionButton(Context context, AttributeSet attributeSet, int i) {
        int i2 = f12953G0;
        super(qs5.m20141b(context, attributeSet, i, i2), attributeSet, i);
        this.f12964q0 = 0;
        this.f12965r0 = true;
        vj6 vj6Var = new vj6(3);
        ix2 ix2Var = new ix2(this, vj6Var);
        this.f12968u0 = ix2Var;
        hx2 hx2Var = new hx2(this, vj6Var);
        this.f12969v0 = hx2Var;
        this.f12958A0 = true;
        this.f12959B0 = false;
        this.f12960C0 = false;
        Context context2 = getContext();
        this.f12973z0 = new ExtendedFloatingActionButtonBehavior(context2, attributeSet);
        TypedArray typedArrayM10751d = dy9.m10751d(context2, attributeSet, R$styleable.ExtendedFloatingActionButton, i, i2, new int[0]);
        s36 s36VarM21047a = s36.m21047a(context2, typedArrayM10751d, R$styleable.ExtendedFloatingActionButton_showMotionSpec);
        s36 s36VarM21047a2 = s36.m21047a(context2, typedArrayM10751d, R$styleable.ExtendedFloatingActionButton_hideMotionSpec);
        s36 s36VarM21047a3 = s36.m21047a(context2, typedArrayM10751d, R$styleable.ExtendedFloatingActionButton_extendMotionSpec);
        s36 s36VarM21047a4 = s36.m21047a(context2, typedArrayM10751d, R$styleable.ExtendedFloatingActionButton_shrinkMotionSpec);
        this.f12970w0 = typedArrayM10751d.getDimensionPixelSize(R$styleable.ExtendedFloatingActionButton_collapsedSize, -1);
        int i3 = typedArrayM10751d.getInt(R$styleable.ExtendedFloatingActionButton_extendStrategy, 1);
        this.f12971x0 = getPaddingStart();
        this.f12972y0 = getPaddingEnd();
        vj6 vj6Var2 = new vj6(3);
        vj6 vj6Var3 = new vj6(this, 14);
        C3156jq c3156jq = new C3156jq(this, vj6Var3, false);
        gx2 gx2Var = new gx2(this, vj6Var2, i3 != 1 ? i3 != 2 ? new gv5(this, c3156jq, vj6Var3) : c3156jq : vj6Var3, true);
        this.f12967t0 = gx2Var;
        gx2 gx2Var2 = new gx2(this, vj6Var2, new hi8(this, 15), false);
        this.f12966s0 = gx2Var2;
        ix2Var.f60551f = s36VarM21047a;
        hx2Var.f60551f = s36VarM21047a2;
        gx2Var.f60551f = s36VarM21047a3;
        gx2Var2.f60551f = s36VarM21047a4;
        typedArrayM10751d.recycle();
        TypedArray typedArrayObtainStyledAttributes = context2.obtainStyledAttributes(attributeSet, R$styleable.MaterialShape, i, i2);
        int resourceId = typedArrayObtainStyledAttributes.getResourceId(R$styleable.MaterialShape_shapeAppearance, 0);
        int resourceId2 = typedArrayObtainStyledAttributes.getResourceId(R$styleable.MaterialShape_shapeAppearanceOverlay, 0);
        typedArrayObtainStyledAttributes.recycle();
        ContextThemeWrapper contextThemeWrapper = new ContextThemeWrapper(context2, resourceId);
        if (resourceId2 != 0) {
            contextThemeWrapper.getTheme().applyStyle(resourceId2, true);
        }
        setShapeAppearanceModel(r39.m20282i(contextThemeWrapper.obtainStyledAttributes(R$styleable.ShapeAppearance), r39.f58561m).m19627a());
        this.f12961D0 = getTextColors();
    }

    /* JADX WARN: Code duplicated, block: B:29:0x0043  */
    /* JADX WARN: Code duplicated, block: B:31:0x0049  */
    /* JADX WARN: Code duplicated, block: B:32:0x004b  */
    /* JADX WARN: Code duplicated, block: B:34:0x0051  */
    /* JADX WARN: Code duplicated, block: B:35:0x005a  */
    /* JADX WARN: Code duplicated, block: B:39:0x0083 A[LOOP:0: B:37:0x007d->B:39:0x0083, LOOP_END] */
    /* JADX INFO: renamed from: y */
    public static void m6139y(ExtendedFloatingActionButton extendedFloatingActionButton, int i) {
        s90 s90Var;
        AnimatorSet animatorSetMo12951a;
        Iterator it;
        ViewGroup.LayoutParams layoutParams;
        if (i == 0) {
            s90Var = extendedFloatingActionButton.f12968u0;
        } else if (i == 1) {
            s90Var = extendedFloatingActionButton.f12969v0;
        } else if (i == 2) {
            s90Var = extendedFloatingActionButton.f12966s0;
        } else {
            if (i != 3) {
                C3386nv.m17633t(ux5.m22988k(i, "Unknown strategy type: "));
                return;
            }
            s90Var = extendedFloatingActionButton.f12967t0;
        }
        if (s90Var.mo12956h()) {
            return;
        }
        if (extendedFloatingActionButton.f12965r0) {
            if (!extendedFloatingActionButton.isLaidOut()) {
                int visibility = extendedFloatingActionButton.getVisibility();
                int i2 = extendedFloatingActionButton.f12964q0;
                if (visibility == 0 ? i2 == 1 : i2 != 2) {
                    if (extendedFloatingActionButton.f12960C0) {
                        if (!extendedFloatingActionButton.isInEditMode()) {
                            if (i == 2) {
                                layoutParams = extendedFloatingActionButton.getLayoutParams();
                                if (layoutParams != null) {
                                    extendedFloatingActionButton.f12962E0 = layoutParams.width;
                                    extendedFloatingActionButton.f12963F0 = layoutParams.height;
                                } else {
                                    extendedFloatingActionButton.f12962E0 = extendedFloatingActionButton.getWidth();
                                    extendedFloatingActionButton.f12963F0 = extendedFloatingActionButton.getHeight();
                                }
                            }
                            extendedFloatingActionButton.measure(0, 0);
                            animatorSetMo12951a = s90Var.mo12951a();
                            animatorSetMo12951a.addListener(new C3340mm(s90Var, 4));
                            it = s90Var.f60548c.iterator();
                            while (it.hasNext()) {
                                animatorSetMo12951a.addListener((Animator.AnimatorListener) it.next());
                            }
                            animatorSetMo12951a.start();
                            return;
                        }
                    }
                }
            } else if (!extendedFloatingActionButton.isInEditMode()) {
                if (i == 2) {
                    layoutParams = extendedFloatingActionButton.getLayoutParams();
                    if (layoutParams != null) {
                        extendedFloatingActionButton.f12962E0 = layoutParams.width;
                        extendedFloatingActionButton.f12963F0 = layoutParams.height;
                    } else {
                        extendedFloatingActionButton.f12962E0 = extendedFloatingActionButton.getWidth();
                        extendedFloatingActionButton.f12963F0 = extendedFloatingActionButton.getHeight();
                    }
                }
                extendedFloatingActionButton.measure(0, 0);
                animatorSetMo12951a = s90Var.mo12951a();
                animatorSetMo12951a.addListener(new C3340mm(s90Var, 4));
                it = s90Var.f60548c.iterator();
                while (it.hasNext()) {
                    animatorSetMo12951a.addListener((Animator.AnimatorListener) it.next());
                }
                animatorSetMo12951a.start();
                return;
            }
        }
        s90Var.mo12955g();
    }

    /* JADX INFO: renamed from: A */
    public final void m6140A() {
        CharSequence text;
        if (this.f12958A0 || !isClickable()) {
            text = null;
        } else {
            text = getText();
            if (TextUtils.isEmpty(text)) {
                text = getContentDescription();
            }
        }
        if (TextUtils.equals(getTooltipText(), text)) {
            return;
        }
        setTooltipText(text);
    }

    @Override // android.widget.Button, android.widget.TextView, android.view.View
    public CharSequence getAccessibilityClassName() {
        return "com.google.android.material.floatingactionbutton.FloatingActionButton";
    }

    @Override // p000.hm1
    public im1 getBehavior() {
        return this.f12973z0;
    }

    public int getCollapsedPadding() {
        return (getCollapsedSize() - getIconSize()) / 2;
    }

    public int getCollapsedSize() {
        int i = this.f12970w0;
        if (i >= 0) {
            return i;
        }
        return getIconSize() + (Math.min(getPaddingStart(), getPaddingEnd()) * 2);
    }

    public int getCurrentOriginalTextColor() {
        return this.f12961D0.getColorForState(getDrawableState(), 0);
    }

    public s36 getExtendMotionSpec() {
        return this.f12967t0.f60551f;
    }

    public s36 getHideMotionSpec() {
        return this.f12969v0.f60551f;
    }

    public ColorStateList getOriginalTextColor() {
        return this.f12961D0;
    }

    public s36 getShowMotionSpec() {
        return this.f12968u0.f60551f;
    }

    public s36 getShrinkMotionSpec() {
        return this.f12966s0.f60551f;
    }

    @Override // com.google.android.material.button.MaterialButton, android.widget.TextView, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (!this.f12958A0 || !TextUtils.isEmpty(getText()) || getIcon() == null) {
            m6140A();
        } else {
            this.f12958A0 = false;
            this.f12966s0.mo12955g();
        }
    }

    public void setAnimateShowBeforeLayout(boolean z) {
        this.f12960C0 = z;
    }

    public void setAnimationEnabled(boolean z) {
        this.f12965r0 = z;
    }

    @Override // android.view.View
    public void setClickable(boolean z) {
        super.setClickable(z);
        m6140A();
    }

    public void setCollapsedSize(int i) {
        this.f12970w0 = i;
    }

    @Override // android.view.View
    public void setContentDescription(CharSequence charSequence) {
        super.setContentDescription(charSequence);
        m6140A();
    }

    public void setExtendMotionSpec(s36 s36Var) {
        this.f12967t0.f60551f = s36Var;
    }

    public void setExtendMotionSpecResource(int i) {
        setExtendMotionSpec(s36.m21048b(getContext(), i));
    }

    public void setExtended(boolean z) {
        if (this.f12958A0 == z) {
            return;
        }
        gx2 gx2Var = z ? this.f12967t0 : this.f12966s0;
        if (gx2Var.mo12956h()) {
            return;
        }
        gx2Var.mo12955g();
    }

    public void setHideMotionSpec(s36 s36Var) {
        this.f12969v0.f60551f = s36Var;
    }

    public void setHideMotionSpecResource(int i) {
        setHideMotionSpec(s36.m21048b(getContext(), i));
    }

    @Override // android.widget.TextView, android.view.View
    public final void setPadding(int i, int i2, int i3, int i4) {
        super.setPadding(i, i2, i3, i4);
        if (!this.f12958A0 || this.f12959B0) {
            return;
        }
        this.f12971x0 = getPaddingStart();
        this.f12972y0 = getPaddingEnd();
    }

    @Override // android.widget.TextView, android.view.View
    public final void setPaddingRelative(int i, int i2, int i3, int i4) {
        super.setPaddingRelative(i, i2, i3, i4);
        if (!this.f12958A0 || this.f12959B0) {
            return;
        }
        this.f12971x0 = i;
        this.f12972y0 = i3;
    }

    public void setShowMotionSpec(s36 s36Var) {
        this.f12968u0.f60551f = s36Var;
    }

    public void setShowMotionSpecResource(int i) {
        setShowMotionSpec(s36.m21048b(getContext(), i));
    }

    public void setShrinkMotionSpec(s36 s36Var) {
        this.f12966s0.f60551f = s36Var;
    }

    public void setShrinkMotionSpecResource(int i) {
        setShrinkMotionSpec(s36.m21048b(getContext(), i));
    }

    @Override // com.google.android.material.button.MaterialButton, android.widget.TextView
    public final void setText(CharSequence charSequence, TextView.BufferType bufferType) {
        super.setText(charSequence, bufferType);
        m6140A();
    }

    @Override // android.widget.TextView
    public void setTextColor(int i) {
        super.setTextColor(i);
        this.f12961D0 = getTextColors();
    }

    /* JADX INFO: renamed from: z */
    public final void m6141z(ColorStateList colorStateList) {
        super.setTextColor(colorStateList);
    }

    @Override // android.widget.TextView
    public void setTextColor(ColorStateList colorStateList) {
        super.setTextColor(colorStateList);
        this.f12961D0 = getTextColors();
    }

    public static class ExtendedFloatingActionButtonBehavior<T extends ExtendedFloatingActionButton> extends im1 {

        /* JADX INFO: renamed from: a */
        public Rect f12974a;

        /* JADX INFO: renamed from: b */
        public final boolean f12975b;

        /* JADX INFO: renamed from: c */
        public final boolean f12976c;

        public ExtendedFloatingActionButtonBehavior(Context context, AttributeSet attributeSet) {
            TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R$styleable.ExtendedFloatingActionButton_Behavior_Layout);
            this.f12975b = typedArrayObtainStyledAttributes.getBoolean(R$styleable.ExtendedFloatingActionButton_Behavior_Layout_behavior_autoHide, false);
            this.f12976c = typedArrayObtainStyledAttributes.getBoolean(R$styleable.ExtendedFloatingActionButton_Behavior_Layout_behavior_autoShrink, true);
            typedArrayObtainStyledAttributes.recycle();
        }

        @Override // p000.im1
        /* JADX INFO: renamed from: e */
        public final /* bridge */ /* synthetic */ boolean mo6142e(View view) {
            return false;
        }

        @Override // p000.im1
        /* JADX INFO: renamed from: g */
        public final void mo6044g(lm1 lm1Var) {
            if (lm1Var.f49821h == 0) {
                lm1Var.f49821h = 80;
            }
        }

        @Override // p000.im1
        /* JADX INFO: renamed from: h */
        public final boolean mo6006h(CoordinatorLayout coordinatorLayout, View view, View view2) {
            ExtendedFloatingActionButton extendedFloatingActionButton = (ExtendedFloatingActionButton) view;
            if (view2 instanceof AppBarLayout) {
                m6143w(coordinatorLayout, (AppBarLayout) view2, extendedFloatingActionButton);
            } else {
                ViewGroup.LayoutParams layoutParams = view2.getLayoutParams();
                if (layoutParams instanceof lm1 ? ((lm1) layoutParams).f49814a instanceof BottomSheetBehavior : false) {
                    m6144x(view2, extendedFloatingActionButton);
                }
            }
            return false;
        }

        @Override // p000.im1
        /* JADX INFO: renamed from: l */
        public final boolean mo5994l(CoordinatorLayout coordinatorLayout, View view, int i) {
            ExtendedFloatingActionButton extendedFloatingActionButton = (ExtendedFloatingActionButton) view;
            ArrayList arrayListM1979j = coordinatorLayout.m1979j(extendedFloatingActionButton);
            int size = arrayListM1979j.size();
            for (int i2 = 0; i2 < size; i2++) {
                View view2 = (View) arrayListM1979j.get(i2);
                if (!(view2 instanceof AppBarLayout)) {
                    ViewGroup.LayoutParams layoutParams = view2.getLayoutParams();
                    if ((layoutParams instanceof lm1 ? ((lm1) layoutParams).f49814a instanceof BottomSheetBehavior : false) && m6144x(view2, extendedFloatingActionButton)) {
                        break;
                    }
                } else {
                    if (m6143w(coordinatorLayout, (AppBarLayout) view2, extendedFloatingActionButton)) {
                        break;
                    }
                }
            }
            coordinatorLayout.m1984q(extendedFloatingActionButton, i);
            return true;
        }

        /* JADX INFO: renamed from: w */
        public final boolean m6143w(CoordinatorLayout coordinatorLayout, AppBarLayout appBarLayout, ExtendedFloatingActionButton extendedFloatingActionButton) {
            lm1 lm1Var = (lm1) extendedFloatingActionButton.getLayoutParams();
            boolean z = this.f12975b;
            boolean z2 = this.f12976c;
            if ((!z && !z2) || lm1Var.f49819f != appBarLayout.getId()) {
                return false;
            }
            if (this.f12974a == null) {
                this.f12974a = new Rect();
            }
            Rect rect = this.f12974a;
            ThreadLocal threadLocal = hc2.f42160a;
            rect.set(0, 0, appBarLayout.getWidth(), appBarLayout.getHeight());
            hc2.m13192b(coordinatorLayout, appBarLayout, rect);
            if (rect.bottom <= appBarLayout.getMinimumHeightForVisibleOverlappingContent()) {
                ExtendedFloatingActionButton.m6139y(extendedFloatingActionButton, z2 ? 2 : 1);
            } else {
                ExtendedFloatingActionButton.m6139y(extendedFloatingActionButton, z2 ? 3 : 0);
            }
            return true;
        }

        /* JADX INFO: renamed from: x */
        public final boolean m6144x(View view, ExtendedFloatingActionButton extendedFloatingActionButton) {
            lm1 lm1Var = (lm1) extendedFloatingActionButton.getLayoutParams();
            boolean z = this.f12975b;
            boolean z2 = this.f12976c;
            if ((!z && !z2) || lm1Var.f49819f != view.getId()) {
                return false;
            }
            if (view.getTop() < (extendedFloatingActionButton.getHeight() / 2) + ((ViewGroup.MarginLayoutParams) ((lm1) extendedFloatingActionButton.getLayoutParams())).topMargin) {
                ExtendedFloatingActionButton.m6139y(extendedFloatingActionButton, z2 ? 2 : 1);
            } else {
                ExtendedFloatingActionButton.m6139y(extendedFloatingActionButton, z2 ? 3 : 0);
            }
            return true;
        }

        public ExtendedFloatingActionButtonBehavior() {
            this.f12975b = false;
            this.f12976c = true;
        }
    }

    public ExtendedFloatingActionButton(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, R$attr.extendedFloatingActionButtonStyle);
    }

    public ExtendedFloatingActionButton(Context context) {
        this(context, null);
    }
}
