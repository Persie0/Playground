package com.google.android.material.bottomappbar;

import ae.C0062b;
import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.widget.ActionMenuView;
import androidx.appcompat.widget.Toolbar;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.customview.view.AbsSavedState;
import com.google.android.material.behavior.HideBottomViewOnScrollBehavior;
import com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton;
import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.linguist.R;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.List;
import java.util.WeakHashMap;
import p177ic.C6308a;
import p221kc.C6654a;
import p221kc.C6655b;
import p221kc.C6656c;
import p221kc.C6657d;
import p221kc.C6658e;
import p221kc.C6659f;
import p326q.C8452h;
import p329q2.C8488a;
import p471x2.C10029b0;
import p471x2.C10049l0;
import p507yc.C10347n;
import p531zc.C10477a;

/* JADX INFO: loaded from: classes.dex */
public final class BottomAppBar extends Toolbar implements CoordinatorLayout.InterfaceC0767b {

    /* JADX INFO: renamed from: E0 */
    public static final /* synthetic */ int f14794E0 = 0;

    /* JADX INFO: renamed from: A0 */
    public boolean f14795A0;

    /* JADX INFO: renamed from: B0 */
    public int f14796B0;

    /* JADX INFO: renamed from: C0 */
    public boolean f14797C0;

    /* JADX INFO: renamed from: D0 */
    public Behavior f14798D0;

    /* JADX INFO: renamed from: s0 */
    public Integer f14799s0;

    /* JADX INFO: renamed from: t0 */
    public Animator f14800t0;

    /* JADX INFO: renamed from: u0 */
    public Animator f14801u0;

    /* JADX INFO: renamed from: v0 */
    public int f14802v0;

    /* JADX INFO: renamed from: w0 */
    public int f14803w0;

    /* JADX INFO: renamed from: x0 */
    public int f14804x0;

    /* JADX INFO: renamed from: y0 */
    public int f14805y0;

    /* JADX INFO: renamed from: z0 */
    public int f14806z0;

    public static class Behavior extends HideBottomViewOnScrollBehavior<BottomAppBar> {

        /* JADX INFO: renamed from: j */
        public final Rect f14807j;

        /* JADX INFO: renamed from: k */
        public WeakReference<BottomAppBar> f14808k;

        /* JADX INFO: renamed from: l */
        public int f14809l;

        /* JADX INFO: renamed from: m */
        public final ViewOnLayoutChangeListenerC2954a f14810m;

        /* JADX INFO: renamed from: com.google.android.material.bottomappbar.BottomAppBar$Behavior$a */
        public class ViewOnLayoutChangeListenerC2954a implements View.OnLayoutChangeListener {
            public ViewOnLayoutChangeListenerC2954a() {
            }

            /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
            @Override // android.view.View.OnLayoutChangeListener
            public final void onLayoutChange(View view, int i10, int i11, int i12, int i13, int i14, int i15, int i16, int i17) {
                Behavior behavior = Behavior.this;
                BottomAppBar bottomAppBar = behavior.f14808k.get();
                if (bottomAppBar == null || !((view instanceof FloatingActionButton) || (view instanceof ExtendedFloatingActionButton))) {
                    view.removeOnLayoutChangeListener(this);
                    return;
                }
                int height = view.getHeight();
                if (view instanceof FloatingActionButton) {
                    FloatingActionButton floatingActionButton = (FloatingActionButton) view;
                    behavior.f14807j.set(0, 0, floatingActionButton.getMeasuredWidth(), floatingActionButton.getMeasuredHeight());
                    throw null;
                }
                CoordinatorLayout.C0771f c0771f = (CoordinatorLayout.C0771f) view.getLayoutParams();
                if (behavior.f14809l == 0) {
                    if (bottomAppBar.f14804x0 == 1) {
                        ((ViewGroup.MarginLayoutParams) c0771f).bottomMargin = bottomAppBar.getBottomInset() + (bottomAppBar.getResources().getDimensionPixelOffset(R.dimen.mtrl_bottomappbar_fab_bottom_margin) - ((view.getMeasuredHeight() - height) / 2));
                    }
                    ((ViewGroup.MarginLayoutParams) c0771f).leftMargin = bottomAppBar.getLeftInset();
                    ((ViewGroup.MarginLayoutParams) c0771f).rightMargin = bottomAppBar.getRightInset();
                    if (C10347n.m19365e(view)) {
                        ((ViewGroup.MarginLayoutParams) c0771f).leftMargin += 0;
                    } else {
                        ((ViewGroup.MarginLayoutParams) c0771f).rightMargin += 0;
                    }
                }
                int i18 = BottomAppBar.f14794E0;
                bottomAppBar.m8596C();
                throw null;
            }
        }

        public Behavior() {
            this.f14810m = new ViewOnLayoutChangeListenerC2954a();
            this.f14807j = new Rect();
        }

        public Behavior(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            this.f14810m = new ViewOnLayoutChangeListenerC2954a();
            this.f14807j = new Rect();
        }

        /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
        @Override // com.google.android.material.behavior.HideBottomViewOnScrollBehavior, androidx.coordinatorlayout.widget.CoordinatorLayout.AbstractC0768c
        /* JADX INFO: renamed from: h */
        public final boolean mo2942h(CoordinatorLayout coordinatorLayout, View view, int i10) {
            BottomAppBar bottomAppBar = (BottomAppBar) view;
            this.f14808k = new WeakReference<>(bottomAppBar);
            int i11 = BottomAppBar.f14794E0;
            View viewM8598x = bottomAppBar.m8598x();
            if (viewM8598x != null) {
                WeakHashMap<View, C10049l0> weakHashMap = C10029b0.f50993a;
                if (!C10029b0.g.m18699c(viewM8598x)) {
                    CoordinatorLayout.C0771f c0771f = (CoordinatorLayout.C0771f) viewM8598x.getLayoutParams();
                    c0771f.f5553d = 17;
                    int i12 = bottomAppBar.f14804x0;
                    if (i12 == 1) {
                        c0771f.f5553d = 49;
                    }
                    if (i12 == 0) {
                        c0771f.f5553d |= 80;
                    }
                    this.f14809l = ((ViewGroup.MarginLayoutParams) ((CoordinatorLayout.C0771f) viewM8598x.getLayoutParams())).bottomMargin;
                    if (viewM8598x instanceof FloatingActionButton) {
                        FloatingActionButton floatingActionButton = (FloatingActionButton) viewM8598x;
                        if (floatingActionButton.getShowMotionSpec() == null) {
                            floatingActionButton.setShowMotionSpecResource(R.animator.mtrl_fab_show_motion_spec);
                        }
                        if (floatingActionButton.getHideMotionSpec() == null) {
                            floatingActionButton.setHideMotionSpecResource(R.animator.mtrl_fab_hide_motion_spec);
                        }
                        floatingActionButton.m8761c();
                        floatingActionButton.m8762d(new C6658e(bottomAppBar));
                        floatingActionButton.m8763e();
                    }
                    viewM8598x.addOnLayoutChangeListener(this.f14810m);
                    bottomAppBar.m8596C();
                    throw null;
                }
            }
            coordinatorLayout.m2928q(bottomAppBar, i10);
            super.mo2942h(coordinatorLayout, bottomAppBar, i10);
            return false;
        }

        @Override // com.google.android.material.behavior.HideBottomViewOnScrollBehavior, androidx.coordinatorlayout.widget.CoordinatorLayout.AbstractC0768c
        /* JADX INFO: renamed from: p */
        public final boolean mo2950p(CoordinatorLayout coordinatorLayout, View view, View view2, View view3, int i10, int i11) {
            BottomAppBar bottomAppBar = (BottomAppBar) view;
            return bottomAppBar.getHideOnScroll() && super.mo2950p(coordinatorLayout, bottomAppBar, view2, view3, i10, i11);
        }
    }

    public static class SavedState extends AbsSavedState {
        public static final Parcelable.Creator<SavedState> CREATOR = new C2955a();

        /* JADX INFO: renamed from: c */
        public int f14812c;

        /* JADX INFO: renamed from: d */
        public boolean f14813d;

        /* JADX INFO: renamed from: com.google.android.material.bottomappbar.BottomAppBar$SavedState$a */
        public class C2955a implements Parcelable.ClassLoaderCreator<SavedState> {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                return new SavedState(parcel, null);
            }

            @Override // android.os.Parcelable.ClassLoaderCreator
            public final SavedState createFromParcel(Parcel parcel, ClassLoader classLoader) {
                return new SavedState(parcel, classLoader);
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i10) {
                return new SavedState[i10];
            }
        }

        public SavedState(Parcel parcel, ClassLoader classLoader) {
            super(parcel, classLoader);
            this.f14812c = parcel.readInt();
            this.f14813d = parcel.readInt() != 0;
        }

        public SavedState(Toolbar.SavedState savedState) {
            super(savedState);
        }

        @Override // androidx.customview.view.AbsSavedState, android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i10) {
            parcel.writeParcelable(this.f5635a, i10);
            parcel.writeInt(this.f14812c);
            parcel.writeInt(this.f14813d ? 1 : 0);
        }
    }

    /* JADX INFO: renamed from: com.google.android.material.bottomappbar.BottomAppBar$a */
    public class RunnableC2956a implements Runnable {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ ActionMenuView f14814a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ int f14815b;

        /* JADX INFO: renamed from: c */
        public final /* synthetic */ boolean f14816c;

        public RunnableC2956a(ActionMenuView actionMenuView, int i10, boolean z10) {
            this.f14814a = actionMenuView;
            this.f14815b = i10;
            this.f14816c = z10;
        }

        @Override // java.lang.Runnable
        public final void run() {
            int i10 = this.f14815b;
            boolean z10 = this.f14816c;
            BottomAppBar bottomAppBar = BottomAppBar.this;
            ActionMenuView actionMenuView = this.f14814a;
            actionMenuView.setTranslationX(bottomAppBar.m8599y(actionMenuView, i10, z10));
        }
    }

    private ActionMenuView getActionMenuView() {
        for (int i10 = 0; i10 < getChildCount(); i10++) {
            View childAt = getChildAt(i10);
            if (childAt instanceof ActionMenuView) {
                return (ActionMenuView) childAt;
            }
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public int getBottomInset() {
        return 0;
    }

    private int getFabAlignmentAnimationDuration() {
        return C10477a.m19428c(R.attr.motionDurationLong2, getContext(), 300);
    }

    private float getFabTranslationX() {
        return m8600z(this.f14802v0);
    }

    private float getFabTranslationY() {
        if (this.f14804x0 == 1) {
            return -getTopEdgeTreatment().f37736c;
        }
        View viewM8598x = m8598x();
        return viewM8598x != null ? (-((getMeasuredHeight() + getBottomInset()) - viewM8598x.getMeasuredHeight())) / 2 : 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public int getLeftInset() {
        return 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public int getRightInset() {
        return 0;
    }

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    private C6659f getTopEdgeTreatment() {
        throw null;
    }

    /* JADX INFO: renamed from: B */
    public final boolean m8595B() {
        View viewM8598x = m8598x();
        FloatingActionButton floatingActionButton = viewM8598x instanceof FloatingActionButton ? (FloatingActionButton) viewM8598x : null;
        return floatingActionButton != null && floatingActionButton.m8767i();
    }

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    /* JADX INFO: renamed from: C */
    public final void m8596C() {
        C6659f topEdgeTreatment = getTopEdgeTreatment();
        getFabTranslationX();
        topEdgeTreatment.getClass();
        if (this.f14797C0) {
            m8595B();
        }
        throw null;
    }

    /* JADX INFO: renamed from: D */
    public final void m8597D(ActionMenuView actionMenuView, int i10, boolean z10, boolean z11) {
        RunnableC2956a runnableC2956a = new RunnableC2956a(actionMenuView, i10, z10);
        if (z11) {
            actionMenuView.post(runnableC2956a);
        } else {
            runnableC2956a.run();
        }
    }

    public ColorStateList getBackgroundTint() {
        throw null;
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.InterfaceC0767b
    public Behavior getBehavior() {
        if (this.f14798D0 == null) {
            this.f14798D0 = new Behavior();
        }
        return this.f14798D0;
    }

    public float getCradleVerticalOffset() {
        return getTopEdgeTreatment().f37736c;
    }

    public int getFabAlignmentMode() {
        return this.f14802v0;
    }

    public int getFabAlignmentModeEndMargin() {
        return this.f14805y0;
    }

    public int getFabAnchorMode() {
        return this.f14804x0;
    }

    public int getFabAnimationMode() {
        return this.f14803w0;
    }

    public float getFabCradleMargin() {
        return getTopEdgeTreatment().f37735b;
    }

    public float getFabCradleRoundedCornerRadius() {
        return getTopEdgeTreatment().f37734a;
    }

    public boolean getHideOnScroll() {
        return this.f14795A0;
    }

    public int getMenuAlignmentMode() {
        return this.f14806z0;
    }

    @Override // androidx.appcompat.widget.Toolbar, android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        C0062b.m338c2(this, null);
        throw null;
    }

    @Override // androidx.appcompat.widget.Toolbar, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        super.onLayout(z10, i10, i11, i12, i13);
        if (z10) {
            Animator animator = this.f14801u0;
            if (animator != null) {
                animator.cancel();
            }
            Animator animator2 = this.f14800t0;
            if (animator2 != null) {
                animator2.cancel();
            }
            m8596C();
            throw null;
        }
        ActionMenuView actionMenuView = getActionMenuView();
        if (actionMenuView == null || this.f14801u0 != null) {
            return;
        }
        actionMenuView.setAlpha(1.0f);
        if (m8595B()) {
            m8597D(actionMenuView, this.f14802v0, this.f14797C0, false);
        } else {
            m8597D(actionMenuView, 0, false, false);
        }
    }

    @Override // androidx.appcompat.widget.Toolbar, android.view.View
    public final void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof SavedState)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        SavedState savedState = (SavedState) parcelable;
        super.onRestoreInstanceState(savedState.f5635a);
        this.f14802v0 = savedState.f14812c;
        this.f14797C0 = savedState.f14813d;
    }

    @Override // androidx.appcompat.widget.Toolbar, android.view.View
    public final Parcelable onSaveInstanceState() {
        SavedState savedState = new SavedState((Toolbar.SavedState) super.onSaveInstanceState());
        savedState.f14812c = this.f14802v0;
        savedState.f14813d = this.f14797C0;
        return savedState;
    }

    public void setBackgroundTint(ColorStateList colorStateList) {
        C8488a.b.m16570h(null, colorStateList);
    }

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    public void setCradleVerticalOffset(float f3) {
        if (f3 != getCradleVerticalOffset()) {
            C6659f topEdgeTreatment = getTopEdgeTreatment();
            if (f3 >= 0.0f) {
                topEdgeTreatment.f37736c = f3;
                throw null;
            }
            topEdgeTreatment.getClass();
            throw new IllegalArgumentException("cradleVerticalOffset must be positive.");
        }
    }

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    @Override // android.view.View
    public void setElevation(float f3) {
        throw null;
    }

    public void setFabAlignmentMode(int i10) {
        int i11;
        this.f14796B0 = 0;
        boolean z10 = this.f14797C0;
        WeakHashMap<View, C10049l0> weakHashMap = C10029b0.f50993a;
        if (C10029b0.g.m18699c(this)) {
            Animator animator = this.f14801u0;
            if (animator != null) {
                animator.cancel();
            }
            ArrayList arrayList = new ArrayList();
            if (m8595B()) {
                i11 = i10;
            } else {
                z10 = false;
                i11 = 0;
            }
            ActionMenuView actionMenuView = getActionMenuView();
            if (actionMenuView != null) {
                float fabAlignmentAnimationDuration = getFabAlignmentAnimationDuration();
                ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(actionMenuView, "alpha", 1.0f);
                objectAnimatorOfFloat.setDuration((long) (0.8f * fabAlignmentAnimationDuration));
                if (Math.abs(actionMenuView.getTranslationX() - m8599y(actionMenuView, i11, z10)) > 1.0f) {
                    ObjectAnimator objectAnimatorOfFloat2 = ObjectAnimator.ofFloat(actionMenuView, "alpha", 0.0f);
                    objectAnimatorOfFloat2.setDuration((long) (fabAlignmentAnimationDuration * 0.2f));
                    objectAnimatorOfFloat2.addListener(new C6657d(this, actionMenuView, i11, z10));
                    AnimatorSet animatorSet = new AnimatorSet();
                    animatorSet.playSequentially(objectAnimatorOfFloat2, objectAnimatorOfFloat);
                    arrayList.add(animatorSet);
                } else if (actionMenuView.getAlpha() < 1.0f) {
                    arrayList.add(objectAnimatorOfFloat);
                }
            }
            AnimatorSet animatorSet2 = new AnimatorSet();
            animatorSet2.playTogether(arrayList);
            this.f14801u0 = animatorSet2;
            animatorSet2.addListener(new C6656c(this));
            this.f14801u0.start();
        } else {
            int i12 = this.f14796B0;
            if (i12 != 0) {
                this.f14796B0 = 0;
                getMenu().clear();
                mo1059k(i12);
            }
        }
        if (this.f14802v0 != i10) {
            if (C10029b0.g.m18699c(this)) {
                Animator animator2 = this.f14800t0;
                if (animator2 != null) {
                    animator2.cancel();
                }
                ArrayList arrayList2 = new ArrayList();
                FloatingActionButton floatingActionButton = null;
                if (this.f14803w0 == 1) {
                    View viewM8598x = m8598x();
                    if (viewM8598x instanceof FloatingActionButton) {
                        floatingActionButton = (FloatingActionButton) viewM8598x;
                    }
                    ObjectAnimator objectAnimatorOfFloat3 = ObjectAnimator.ofFloat(floatingActionButton, "translationX", m8600z(i10));
                    objectAnimatorOfFloat3.setDuration(getFabAlignmentAnimationDuration());
                    arrayList2.add(objectAnimatorOfFloat3);
                } else {
                    View viewM8598x2 = m8598x();
                    if (viewM8598x2 instanceof FloatingActionButton) {
                        floatingActionButton = (FloatingActionButton) viewM8598x2;
                    }
                    if (floatingActionButton != null && !floatingActionButton.m8766h()) {
                        floatingActionButton.m8765g(new C6655b(this, i10), true);
                    }
                }
                AnimatorSet animatorSet3 = new AnimatorSet();
                animatorSet3.playTogether(arrayList2);
                animatorSet3.setInterpolator(C10477a.m19429d(getContext(), R.attr.motionEasingEmphasizedInterpolator, C6308a.f36523a));
                this.f14800t0 = animatorSet3;
                animatorSet3.addListener(new C6654a(this));
                this.f14800t0.start();
            }
        }
        this.f14802v0 = i10;
    }

    public void setFabAlignmentModeEndMargin(int i10) {
        if (this.f14805y0 == i10) {
            return;
        }
        this.f14805y0 = i10;
        m8596C();
        throw null;
    }

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    public void setFabAnchorMode(int i10) {
        this.f14804x0 = i10;
        m8596C();
        throw null;
    }

    public void setFabAnimationMode(int i10) {
        this.f14803w0 = i10;
    }

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    public void setFabCornerSize(float f3) {
        if (f3 == getTopEdgeTreatment().f37737d) {
            return;
        }
        getTopEdgeTreatment().f37737d = f3;
        throw null;
    }

    public void setFabCradleMargin(float f3) {
        if (f3 == getFabCradleMargin()) {
            return;
        }
        getTopEdgeTreatment().f37735b = f3;
        throw null;
    }

    public void setFabCradleRoundedCornerRadius(float f3) {
        if (f3 == getFabCradleRoundedCornerRadius()) {
            return;
        }
        getTopEdgeTreatment().f37734a = f3;
        throw null;
    }

    public void setHideOnScroll(boolean z10) {
        this.f14795A0 = z10;
    }

    public void setMenuAlignmentMode(int i10) {
        if (this.f14806z0 != i10) {
            this.f14806z0 = i10;
            ActionMenuView actionMenuView = getActionMenuView();
            if (actionMenuView != null) {
                m8597D(actionMenuView, this.f14802v0, m8595B(), false);
            }
        }
    }

    @Override // androidx.appcompat.widget.Toolbar
    public void setNavigationIcon(Drawable drawable) {
        if (drawable != null && this.f14799s0 != null) {
            drawable = drawable.mutate();
            C8488a.b.m16569g(drawable, this.f14799s0.intValue());
        }
        super.setNavigationIcon(drawable);
    }

    public void setNavigationIconTint(int i10) {
        this.f14799s0 = Integer.valueOf(i10);
        Drawable navigationIcon = getNavigationIcon();
        if (navigationIcon != null) {
            setNavigationIcon(navigationIcon);
        }
    }

    @Override // androidx.appcompat.widget.Toolbar
    public void setSubtitle(CharSequence charSequence) {
    }

    @Override // androidx.appcompat.widget.Toolbar
    public void setTitle(CharSequence charSequence) {
    }

    /* JADX INFO: renamed from: x */
    public final View m8598x() {
        if (!(getParent() instanceof CoordinatorLayout)) {
            return null;
        }
        CoordinatorLayout coordinatorLayout = (CoordinatorLayout) getParent();
        List list = (List) ((C8452h) coordinatorLayout.f5536b.f8004b).getOrDefault(this, null);
        ArrayList<View> arrayList = coordinatorLayout.f5538d;
        arrayList.clear();
        if (list != null) {
            arrayList.addAll(list);
        }
        for (View view : arrayList) {
            if ((view instanceof FloatingActionButton) || (view instanceof ExtendedFloatingActionButton)) {
                return view;
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: y */
    public final int m8599y(ActionMenuView actionMenuView, int i10, boolean z10) {
        int dimensionPixelOffset;
        if (this.f14806z0 == 1 || (i10 == 1 && z10)) {
            boolean zM19365e = C10347n.m19365e(this);
            int measuredWidth = zM19365e ? getMeasuredWidth() : 0;
            for (int i11 = 0; i11 < getChildCount(); i11++) {
                View childAt = getChildAt(i11);
                if ((childAt.getLayoutParams() instanceof Toolbar.C0292g) && (((Toolbar.C0292g) childAt.getLayoutParams()).f33364a & 8388615) == 8388611) {
                    if (zM19365e) {
                        measuredWidth = Math.min(measuredWidth, childAt.getLeft());
                    } else {
                        measuredWidth = Math.max(measuredWidth, childAt.getRight());
                    }
                }
            }
            int right = zM19365e ? actionMenuView.getRight() : actionMenuView.getLeft();
            if (getNavigationIcon() == null) {
                dimensionPixelOffset = getResources().getDimensionPixelOffset(R.dimen.m3_bottomappbar_horizontal_padding);
                if (!zM19365e) {
                    dimensionPixelOffset = -dimensionPixelOffset;
                }
            } else {
                dimensionPixelOffset = 0;
            }
            return measuredWidth - ((right + 0) + dimensionPixelOffset);
        }
        return 0;
    }

    /* JADX INFO: renamed from: z */
    public final float m8600z(int i10) {
        boolean zM19365e = C10347n.m19365e(this);
        int i11 = 1;
        if (i10 != 1) {
            return 0.0f;
        }
        View viewM8598x = m8598x();
        int measuredWidth = 0;
        if (this.f14805y0 != -1 && viewM8598x != null) {
            measuredWidth = 0 + (viewM8598x.getMeasuredWidth() / 2) + this.f14805y0;
        }
        int measuredWidth2 = (getMeasuredWidth() / 2) - measuredWidth;
        if (zM19365e) {
            i11 = -1;
        }
        return measuredWidth2 * i11;
    }
}
