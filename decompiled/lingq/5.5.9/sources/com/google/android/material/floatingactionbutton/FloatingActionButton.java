package com.google.android.material.floatingactionbutton;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Matrix;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.util.Log;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import androidx.appcompat.widget.C0319i;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.google.android.material.appbar.AppBarLayout;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import com.google.android.material.stateful.ExtendableSavedState;
import com.linguist.R;
import gd.C5772k;
import gd.InterfaceC5776o;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.WeakHashMap;
import p117fd.InterfaceC5508b;
import p153hc.C6031a;
import p177ic.C6314g;
import p221kc.C6655b;
import p221kc.C6658e;
import p456wc.InterfaceC9899a;
import p471x2.C10029b0;
import p471x2.C10049l0;
import p481xc.C10168c;
import p481xc.ViewTreeObserverOnPreDrawListenerC10167b;
import p507yc.C10336c;
import p507yc.C10349p;

/* JADX INFO: loaded from: classes.dex */
public final class FloatingActionButton extends C10349p implements InterfaceC9899a, InterfaceC5776o, CoordinatorLayout.InterfaceC0767b {

    /* JADX INFO: renamed from: b */
    public ColorStateList f15236b;

    /* JADX INFO: renamed from: c */
    public PorterDuff.Mode f15237c;

    /* JADX INFO: renamed from: d */
    public ColorStateList f15238d;

    /* JADX INFO: renamed from: e */
    public PorterDuff.Mode f15239e;

    /* JADX INFO: renamed from: f */
    public ColorStateList f15240f;

    /* JADX INFO: renamed from: g */
    public int f15241g;

    /* JADX INFO: renamed from: h */
    public int f15242h;

    /* JADX INFO: renamed from: i */
    public int f15243i;

    /* JADX INFO: renamed from: j */
    public boolean f15244j;

    /* JADX INFO: renamed from: k */
    public C10168c f15245k;

    public static class BaseBehavior<T extends FloatingActionButton> extends CoordinatorLayout.AbstractC0768c<T> {

        /* JADX INFO: renamed from: a */
        public Rect f15246a;

        /* JADX INFO: renamed from: b */
        public final boolean f15247b;

        public BaseBehavior() {
            this.f15247b = true;
        }

        public BaseBehavior(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C6031a.f35663m);
            this.f15247b = typedArrayObtainStyledAttributes.getBoolean(0, true);
            typedArrayObtainStyledAttributes.recycle();
        }

        /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
        @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.AbstractC0768c
        /* JADX INFO: renamed from: a */
        public final boolean mo2935a(View view) {
            ((FloatingActionButton) view).getLeft();
            throw null;
        }

        @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.AbstractC0768c
        /* JADX INFO: renamed from: c */
        public final void mo2937c(CoordinatorLayout.C0771f c0771f) {
            if (c0771f.f5557h == 0) {
                c0771f.f5557h = 80;
            }
        }

        @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.AbstractC0768c
        /* JADX INFO: renamed from: d */
        public final boolean mo2938d(CoordinatorLayout coordinatorLayout, View view, View view2) {
            FloatingActionButton floatingActionButton = (FloatingActionButton) view;
            if (view2 instanceof AppBarLayout) {
                m8771t(coordinatorLayout, (AppBarLayout) view2, floatingActionButton);
            } else {
                ViewGroup.LayoutParams layoutParams = view2.getLayoutParams();
                if (layoutParams instanceof CoordinatorLayout.C0771f ? ((CoordinatorLayout.C0771f) layoutParams).f5550a instanceof BottomSheetBehavior : false) {
                    m8772u(view2, floatingActionButton);
                }
            }
            return false;
        }

        @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.AbstractC0768c
        /* JADX INFO: renamed from: h */
        public final boolean mo2942h(CoordinatorLayout coordinatorLayout, View view, int i10) {
            FloatingActionButton floatingActionButton = (FloatingActionButton) view;
            ArrayList arrayListM2923d = coordinatorLayout.m2923d(floatingActionButton);
            int size = arrayListM2923d.size();
            for (int i11 = 0; i11 < size; i11++) {
                View view2 = (View) arrayListM2923d.get(i11);
                if (!(view2 instanceof AppBarLayout)) {
                    ViewGroup.LayoutParams layoutParams = view2.getLayoutParams();
                    if ((layoutParams instanceof CoordinatorLayout.C0771f ? ((CoordinatorLayout.C0771f) layoutParams).f5550a instanceof BottomSheetBehavior : false) && m8772u(view2, floatingActionButton)) {
                        break;
                    }
                } else {
                    if (m8771t(coordinatorLayout, (AppBarLayout) view2, floatingActionButton)) {
                        break;
                    }
                }
            }
            coordinatorLayout.m2928q(floatingActionButton, i10);
            return true;
        }

        /* JADX INFO: renamed from: s */
        public final boolean m8770s(View view, FloatingActionButton floatingActionButton) {
            CoordinatorLayout.C0771f c0771f = (CoordinatorLayout.C0771f) floatingActionButton.getLayoutParams();
            if (this.f15247b && c0771f.f5555f == view.getId() && floatingActionButton.getUserSetVisibility() == 0) {
                return true;
            }
            return false;
        }

        /* JADX INFO: renamed from: t */
        public final boolean m8771t(CoordinatorLayout coordinatorLayout, AppBarLayout appBarLayout, FloatingActionButton floatingActionButton) {
            if (!m8770s(appBarLayout, floatingActionButton)) {
                return false;
            }
            if (this.f15246a == null) {
                this.f15246a = new Rect();
            }
            Rect rect = this.f15246a;
            ThreadLocal<Matrix> threadLocal = C10336c.f52023a;
            rect.set(0, 0, appBarLayout.getWidth(), appBarLayout.getHeight());
            C10336c.m19350b(coordinatorLayout, appBarLayout, rect);
            if (rect.bottom <= appBarLayout.getMinimumHeightForVisibleOverlappingContent()) {
                floatingActionButton.m8765g(null, false);
            } else {
                floatingActionButton.m8769k(null, false);
            }
            return true;
        }

        /* JADX INFO: renamed from: u */
        public final boolean m8772u(View view, FloatingActionButton floatingActionButton) {
            if (!m8770s(view, floatingActionButton)) {
                return false;
            }
            if (view.getTop() < (floatingActionButton.getHeight() / 2) + ((ViewGroup.MarginLayoutParams) ((CoordinatorLayout.C0771f) floatingActionButton.getLayoutParams())).topMargin) {
                floatingActionButton.m8765g(null, false);
            } else {
                floatingActionButton.m8769k(null, false);
            }
            return true;
        }
    }

    public static class Behavior extends BaseBehavior<FloatingActionButton> {
        public Behavior() {
        }

        public Behavior(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
        }
    }

    /* JADX INFO: renamed from: com.google.android.material.floatingactionbutton.FloatingActionButton$a */
    public static abstract class AbstractC3029a {
        /* JADX INFO: renamed from: a */
        public void mo8773a(FloatingActionButton floatingActionButton) {
        }

        /* JADX INFO: renamed from: b */
        public void mo8774b() {
        }
    }

    /* JADX INFO: renamed from: com.google.android.material.floatingactionbutton.FloatingActionButton$b */
    public class C3030b implements InterfaceC5508b {
        public C3030b() {
        }
    }

    /* JADX INFO: renamed from: com.google.android.material.floatingactionbutton.FloatingActionButton$c */
    public class C3031c<T extends FloatingActionButton> implements C3035d.f {
        public C3031c(FloatingActionButton floatingActionButton) {
        }

        /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
        @Override // com.google.android.material.floatingactionbutton.C3035d.f
        /* JADX INFO: renamed from: a */
        public final void mo8775a() {
            throw null;
        }

        @Override // com.google.android.material.floatingactionbutton.C3035d.f
        /* JADX INFO: renamed from: b */
        public final void mo8776b() {
            throw null;
        }

        public final boolean equals(Object obj) {
            if (!(obj instanceof C3031c)) {
                return false;
            }
            ((C3031c) obj).getClass();
            throw null;
        }

        public final int hashCode() {
            throw null;
        }
    }

    private C3035d getImpl() {
        if (this.f15245k == null) {
            this.f15245k = new C10168c(this, new C3030b());
        }
        return this.f15245k;
    }

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    @Override // p456wc.InterfaceC9899a
    /* JADX INFO: renamed from: a */
    public final boolean mo8760a() {
        throw null;
    }

    /* JADX INFO: renamed from: c */
    public final void m8761c() {
        C3035d impl = getImpl();
        if (impl.f15283o == null) {
            impl.f15283o = new ArrayList<>();
        }
        impl.f15283o.add(null);
    }

    /* JADX INFO: renamed from: d */
    public final void m8762d(C6658e c6658e) {
        C3035d impl = getImpl();
        if (impl.f15282n == null) {
            impl.f15282n = new ArrayList<>();
        }
        impl.f15282n.add(c6658e);
    }

    @Override // android.widget.ImageView, android.view.View
    public final void drawableStateChanged() {
        super.drawableStateChanged();
        getImpl().mo8785i(getDrawableState());
    }

    /* JADX INFO: renamed from: e */
    public final void m8763e() {
        C3035d impl = getImpl();
        C3031c c3031c = new C3031c(this);
        if (impl.f15284p == null) {
            impl.f15284p = new ArrayList<>();
        }
        impl.f15284p.add(c3031c);
    }

    /* JADX INFO: renamed from: f */
    public final int m8764f(int i10) {
        int i11 = this.f15242h;
        if (i11 != 0) {
            return i11;
        }
        Resources resources = getResources();
        if (i10 != -1) {
            return i10 != 1 ? resources.getDimensionPixelSize(R.dimen.design_fab_size_normal) : resources.getDimensionPixelSize(R.dimen.design_fab_size_mini);
        }
        return Math.max(resources.getConfiguration().screenWidthDp, resources.getConfiguration().screenHeightDp) < 470 ? m8764f(1) : m8764f(0);
    }

    /* JADX INFO: renamed from: g */
    public final void m8765g(C6655b c6655b, boolean z10) {
        C3035d impl = getImpl();
        C3032a c3032a = c6655b == null ? null : new C3032a(this, c6655b);
        boolean z11 = true;
        if (impl.f15285q.getVisibility() != 0 ? impl.f15281m != 2 : impl.f15281m == 1) {
            return;
        }
        Animator animator = impl.f15275g;
        if (animator != null) {
            animator.cancel();
        }
        WeakHashMap<View, C10049l0> weakHashMap = C10029b0.f50993a;
        FloatingActionButton floatingActionButton = impl.f15285q;
        if (!C10029b0.g.m18699c(floatingActionButton) || floatingActionButton.isInEditMode()) {
            z11 = false;
        }
        if (!z11) {
            floatingActionButton.m19367b(z10 ? 8 : 4, z10);
            if (c3032a != null) {
                c3032a.f15249a.mo8773a(c3032a.f15250b);
            }
            return;
        }
        C6314g c6314g = impl.f15277i;
        AnimatorSet animatorSetM8779b = c6314g != null ? impl.m8779b(c6314g, 0.0f, 0.0f, 0.0f) : impl.m8780c(0.0f, 0.4f, 0.4f, C3035d.f15258A, C3035d.f15259B);
        animatorSetM8779b.addListener(new C3033b(impl, z10, c3032a));
        ArrayList<Animator.AnimatorListener> arrayList = impl.f15283o;
        if (arrayList != null) {
            Iterator<Animator.AnimatorListener> it = arrayList.iterator();
            while (it.hasNext()) {
                animatorSetM8779b.addListener(it.next());
            }
        }
        animatorSetM8779b.start();
    }

    @Override // android.view.View
    public ColorStateList getBackgroundTintList() {
        return this.f15236b;
    }

    @Override // android.view.View
    public PorterDuff.Mode getBackgroundTintMode() {
        return this.f15237c;
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.InterfaceC0767b
    public CoordinatorLayout.AbstractC0768c<FloatingActionButton> getBehavior() {
        return new Behavior();
    }

    public float getCompatElevation() {
        return getImpl().mo8781e();
    }

    public float getCompatHoveredFocusedTranslationZ() {
        return getImpl().f15273e;
    }

    public float getCompatPressedTranslationZ() {
        return getImpl().f15274f;
    }

    public Drawable getContentBackground() {
        getImpl().getClass();
        return null;
    }

    public int getCustomSize() {
        return this.f15242h;
    }

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    public int getExpandedComponentIdHint() {
        throw null;
    }

    public C6314g getHideMotionSpec() {
        return getImpl().f15277i;
    }

    @Deprecated
    public int getRippleColor() {
        ColorStateList colorStateList = this.f15240f;
        if (colorStateList != null) {
            return colorStateList.getDefaultColor();
        }
        return 0;
    }

    public ColorStateList getRippleColorStateList() {
        return this.f15240f;
    }

    public C5772k getShapeAppearanceModel() {
        C5772k c5772k = getImpl().f15269a;
        c5772k.getClass();
        return c5772k;
    }

    public C6314g getShowMotionSpec() {
        return getImpl().f15276h;
    }

    public int getSize() {
        return this.f15241g;
    }

    public int getSizeDimension() {
        return m8764f(this.f15241g);
    }

    public ColorStateList getSupportBackgroundTintList() {
        return getBackgroundTintList();
    }

    public PorterDuff.Mode getSupportBackgroundTintMode() {
        return getBackgroundTintMode();
    }

    public ColorStateList getSupportImageTintList() {
        return this.f15238d;
    }

    public PorterDuff.Mode getSupportImageTintMode() {
        return this.f15239e;
    }

    public boolean getUseCompatPadding() {
        return this.f15244j;
    }

    /* JADX INFO: renamed from: h */
    public final boolean m8766h() {
        C3035d impl = getImpl();
        if (impl.f15285q.getVisibility() == 0) {
            if (impl.f15281m != 1) {
                return false;
            }
        } else if (impl.f15281m == 2) {
            return false;
        }
        return true;
    }

    /* JADX WARN: Code restructure failed: missing block: B:9:0x001f, code lost:
    
        if (r6.f15281m != 1) goto L7;
     */
    /* JADX INFO: renamed from: i */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean m8767i() {
        C3035d impl = getImpl();
        if (impl.f15285q.getVisibility() != 0) {
            if (impl.f15281m == 2) {
                return true;
            }
            return false;
        }
    }

    /* JADX INFO: renamed from: j */
    public final void m8768j() {
        Drawable drawable = getDrawable();
        if (drawable == null) {
            return;
        }
        ColorStateList colorStateList = this.f15238d;
        if (colorStateList == null) {
            drawable.clearColorFilter();
            return;
        }
        int colorForState = colorStateList.getColorForState(getDrawableState(), 0);
        PorterDuff.Mode mode = this.f15239e;
        if (mode == null) {
            mode = PorterDuff.Mode.SRC_IN;
        }
        drawable.mutate().setColorFilter(C0319i.m1202c(colorForState, mode));
    }

    @Override // android.widget.ImageView, android.view.View
    public final void jumpDrawablesToCurrentState() {
        super.jumpDrawablesToCurrentState();
        getImpl().mo8783g();
    }

    /* JADX WARN: Code duplicated, block: B:12:0x0024  */
    /* JADX INFO: renamed from: k */
    public final void m8769k(C6655b.a aVar, boolean z10) {
        boolean z11;
        C3035d impl = getImpl();
        C3032a c3032a = aVar == null ? null : new C3032a(this, aVar);
        boolean z12 = true;
        if (impl.f15285q.getVisibility() != 0) {
            if (impl.f15281m == 2) {
                z11 = true;
            } else {
                z11 = false;
            }
        } else if (impl.f15281m != 1) {
            z11 = true;
        } else {
            z11 = false;
        }
        if (z11) {
            return;
        }
        Animator animator = impl.f15275g;
        if (animator != null) {
            animator.cancel();
        }
        boolean z13 = impl.f15276h == null;
        WeakHashMap<View, C10049l0> weakHashMap = C10029b0.f50993a;
        FloatingActionButton floatingActionButton = impl.f15285q;
        if (!C10029b0.g.m18699c(floatingActionButton) || floatingActionButton.isInEditMode()) {
            z12 = false;
        }
        Matrix matrix = impl.f15290v;
        if (!z12) {
            floatingActionButton.m19367b(0, z10);
            floatingActionButton.setAlpha(1.0f);
            floatingActionButton.setScaleY(1.0f);
            floatingActionButton.setScaleX(1.0f);
            impl.f15279k = 1.0f;
            impl.m8778a(1.0f, matrix);
            floatingActionButton.setImageMatrix(matrix);
            if (c3032a != null) {
                c3032a.f15249a.mo8774b();
                return;
            }
            return;
        }
        if (floatingActionButton.getVisibility() != 0) {
            floatingActionButton.setAlpha(0.0f);
            floatingActionButton.setScaleY(z13 ? 0.4f : 0.0f);
            floatingActionButton.setScaleX(z13 ? 0.4f : 0.0f);
            float f3 = z13 ? 0.4f : 0.0f;
            impl.f15279k = f3;
            impl.m8778a(f3, matrix);
            floatingActionButton.setImageMatrix(matrix);
        }
        C6314g c6314g = impl.f15276h;
        AnimatorSet animatorSetM8779b = c6314g != null ? impl.m8779b(c6314g, 1.0f, 1.0f, 1.0f) : impl.m8780c(1.0f, 1.0f, 1.0f, C3035d.f15267y, C3035d.f15268z);
        animatorSetM8779b.addListener(new C3034c(impl, z10, c3032a));
        ArrayList<Animator.AnimatorListener> arrayList = impl.f15282n;
        if (arrayList != null) {
            Iterator<Animator.AnimatorListener> it = arrayList.iterator();
            while (it.hasNext()) {
                animatorSetM8779b.addListener(it.next());
            }
        }
        animatorSetM8779b.start();
    }

    @Override // android.widget.ImageView, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        C3035d impl = getImpl();
        impl.getClass();
        if (!(impl instanceof C10168c)) {
            ViewTreeObserver viewTreeObserver = impl.f15285q.getViewTreeObserver();
            if (impl.f15291w == null) {
                impl.f15291w = new ViewTreeObserverOnPreDrawListenerC10167b(impl);
            }
            viewTreeObserver.addOnPreDrawListener(impl.f15291w);
        }
    }

    @Override // android.widget.ImageView, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        C3035d impl = getImpl();
        ViewTreeObserver viewTreeObserver = impl.f15285q.getViewTreeObserver();
        ViewTreeObserverOnPreDrawListenerC10167b viewTreeObserverOnPreDrawListenerC10167b = impl.f15291w;
        if (viewTreeObserverOnPreDrawListenerC10167b != null) {
            viewTreeObserver.removeOnPreDrawListener(viewTreeObserverOnPreDrawListenerC10167b);
            impl.f15291w = null;
        }
    }

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    @Override // android.widget.ImageView, android.view.View
    public final void onMeasure(int i10, int i11) {
        int sizeDimension = (getSizeDimension() - this.f15243i) / 2;
        getImpl().m8790n();
        throw null;
    }

    @Override // android.view.View
    public final void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof ExtendableSavedState)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        ExtendableSavedState extendableSavedState = (ExtendableSavedState) parcelable;
        super.onRestoreInstanceState(extendableSavedState.f5635a);
        extendableSavedState.f15603c.getOrDefault("expandableWidgetHelper", null).getClass();
        throw null;
    }

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    @Override // android.view.View
    public final Parcelable onSaveInstanceState() {
        Parcelable parcelableOnSaveInstanceState = super.onSaveInstanceState();
        if (parcelableOnSaveInstanceState == null) {
            parcelableOnSaveInstanceState = new Bundle();
        }
        new ExtendableSavedState(parcelableOnSaveInstanceState);
        throw null;
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        if (motionEvent.getAction() == 0) {
            WeakHashMap<View, C10049l0> weakHashMap = C10029b0.f50993a;
            if (C10029b0.g.m18699c(this)) {
                getWidth();
                getHeight();
                throw null;
            }
        }
        return super.onTouchEvent(motionEvent);
    }

    @Override // android.view.View
    public void setBackgroundColor(int i10) {
        Log.i("FloatingActionButton", "Setting a custom background is not supported.");
    }

    @Override // android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
        Log.i("FloatingActionButton", "Setting a custom background is not supported.");
    }

    @Override // android.view.View
    public void setBackgroundResource(int i10) {
        Log.i("FloatingActionButton", "Setting a custom background is not supported.");
    }

    @Override // android.view.View
    public void setBackgroundTintList(ColorStateList colorStateList) {
        if (this.f15236b != colorStateList) {
            this.f15236b = colorStateList;
            getImpl().getClass();
        }
    }

    @Override // android.view.View
    public void setBackgroundTintMode(PorterDuff.Mode mode) {
        if (this.f15237c != mode) {
            this.f15237c = mode;
            getImpl().getClass();
        }
    }

    public void setCompatElevation(float f3) {
        C3035d impl = getImpl();
        if (impl.f15272d != f3) {
            impl.f15272d = f3;
            impl.mo8786j(f3, impl.f15273e, impl.f15274f);
        }
    }

    public void setCompatElevationResource(int i10) {
        setCompatElevation(getResources().getDimension(i10));
    }

    public void setCompatHoveredFocusedTranslationZ(float f3) {
        C3035d impl = getImpl();
        if (impl.f15273e != f3) {
            impl.f15273e = f3;
            impl.mo8786j(impl.f15272d, f3, impl.f15274f);
        }
    }

    public void setCompatHoveredFocusedTranslationZResource(int i10) {
        setCompatHoveredFocusedTranslationZ(getResources().getDimension(i10));
    }

    public void setCompatPressedTranslationZ(float f3) {
        C3035d impl = getImpl();
        if (impl.f15274f != f3) {
            impl.f15274f = f3;
            impl.mo8786j(impl.f15272d, impl.f15273e, f3);
        }
    }

    public void setCompatPressedTranslationZResource(int i10) {
        setCompatPressedTranslationZ(getResources().getDimension(i10));
    }

    public void setCustomSize(int i10) {
        if (i10 < 0) {
            throw new IllegalArgumentException("Custom size must be non-negative");
        }
        if (i10 != this.f15242h) {
            this.f15242h = i10;
            requestLayout();
        }
    }

    @Override // android.view.View
    public void setElevation(float f3) {
        super.setElevation(f3);
        getImpl().getClass();
    }

    public void setEnsureMinTouchTargetSize(boolean z10) {
        if (z10 != getImpl().f15270b) {
            getImpl().f15270b = z10;
            requestLayout();
        }
    }

    public void setExpandedComponentIdHint(int i10) {
        throw null;
    }

    public void setHideMotionSpec(C6314g c6314g) {
        getImpl().f15277i = c6314g;
    }

    public void setHideMotionSpecResource(int i10) {
        setHideMotionSpec(C6314g.m12939a(i10, getContext()));
    }

    @Override // android.widget.ImageView
    public void setImageDrawable(Drawable drawable) {
        if (getDrawable() != drawable) {
            super.setImageDrawable(drawable);
            C3035d impl = getImpl();
            float f3 = impl.f15279k;
            impl.f15279k = f3;
            Matrix matrix = impl.f15290v;
            impl.m8778a(f3, matrix);
            impl.f15285q.setImageMatrix(matrix);
            if (this.f15238d != null) {
                m8768j();
            }
        }
    }

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    @Override // android.widget.ImageView
    public void setImageResource(int i10) {
        throw null;
    }

    public void setMaxImageSize(int i10) {
        this.f15243i = i10;
        C3035d impl = getImpl();
        if (impl.f15280l != i10) {
            impl.f15280l = i10;
            float f3 = impl.f15279k;
            impl.f15279k = f3;
            Matrix matrix = impl.f15290v;
            impl.m8778a(f3, matrix);
            impl.f15285q.setImageMatrix(matrix);
        }
    }

    public void setRippleColor(int i10) {
        setRippleColor(ColorStateList.valueOf(i10));
    }

    public void setRippleColor(ColorStateList colorStateList) {
        if (this.f15240f != colorStateList) {
            this.f15240f = colorStateList;
            getImpl().mo8788l();
        }
    }

    @Override // android.view.View
    public void setScaleX(float f3) {
        super.setScaleX(f3);
        ArrayList<C3035d.f> arrayList = getImpl().f15284p;
        if (arrayList != null) {
            Iterator<C3035d.f> it = arrayList.iterator();
            while (it.hasNext()) {
                it.next().mo8776b();
            }
        }
    }

    @Override // android.view.View
    public void setScaleY(float f3) {
        super.setScaleY(f3);
        ArrayList<C3035d.f> arrayList = getImpl().f15284p;
        if (arrayList != null) {
            Iterator<C3035d.f> it = arrayList.iterator();
            while (it.hasNext()) {
                it.next().mo8776b();
            }
        }
    }

    public void setShadowPaddingEnabled(boolean z10) {
        C3035d impl = getImpl();
        impl.f15271c = z10;
        impl.m8790n();
        throw null;
    }

    @Override // gd.InterfaceC5776o
    public void setShapeAppearanceModel(C5772k c5772k) {
        getImpl().f15269a = c5772k;
    }

    public void setShowMotionSpec(C6314g c6314g) {
        getImpl().f15276h = c6314g;
    }

    public void setShowMotionSpecResource(int i10) {
        setShowMotionSpec(C6314g.m12939a(i10, getContext()));
    }

    public void setSize(int i10) {
        this.f15242h = 0;
        if (i10 != this.f15241g) {
            this.f15241g = i10;
            requestLayout();
        }
    }

    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        setBackgroundTintList(colorStateList);
    }

    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        setBackgroundTintMode(mode);
    }

    public void setSupportImageTintList(ColorStateList colorStateList) {
        if (this.f15238d != colorStateList) {
            this.f15238d = colorStateList;
            m8768j();
        }
    }

    public void setSupportImageTintMode(PorterDuff.Mode mode) {
        if (this.f15239e != mode) {
            this.f15239e = mode;
            m8768j();
        }
    }

    @Override // android.view.View
    public void setTranslationX(float f3) {
        super.setTranslationX(f3);
        getImpl().m8787k();
    }

    @Override // android.view.View
    public void setTranslationY(float f3) {
        super.setTranslationY(f3);
        getImpl().m8787k();
    }

    @Override // android.view.View
    public void setTranslationZ(float f3) {
        super.setTranslationZ(f3);
        getImpl().m8787k();
    }

    public void setUseCompatPadding(boolean z10) {
        if (this.f15244j != z10) {
            this.f15244j = z10;
            getImpl().mo8784h();
        }
    }

    @Override // p507yc.C10349p, android.widget.ImageView, android.view.View
    public void setVisibility(int i10) {
        super.setVisibility(i10);
    }
}
