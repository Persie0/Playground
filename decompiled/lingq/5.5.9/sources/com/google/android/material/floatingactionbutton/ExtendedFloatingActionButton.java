package com.google.android.material.floatingactionbutton;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Matrix;
import android.graphics.Rect;
import android.support.v4.media.session.C0166e;
import android.util.AttributeSet;
import android.util.Property;
import android.view.View;
import android.view.ViewGroup;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.google.android.material.appbar.AppBarLayout;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import com.google.android.material.button.MaterialButton;
import java.util.ArrayList;
import java.util.WeakHashMap;
import p153hc.C6031a;
import p177ic.C6314g;
import p471x2.C10029b0;
import p471x2.C10049l0;
import p507yc.C10336c;

/* JADX INFO: loaded from: classes.dex */
public final class ExtendedFloatingActionButton extends MaterialButton implements CoordinatorLayout.InterfaceC0767b {

    public static class ExtendedFloatingActionButtonBehavior<T extends ExtendedFloatingActionButton> extends CoordinatorLayout.AbstractC0768c<T> {

        /* JADX INFO: renamed from: a */
        public Rect f15233a;

        /* JADX INFO: renamed from: b */
        public final boolean f15234b;

        /* JADX INFO: renamed from: c */
        public final boolean f15235c;

        public ExtendedFloatingActionButtonBehavior() {
            this.f15234b = false;
            this.f15235c = true;
        }

        public ExtendedFloatingActionButtonBehavior(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C6031a.f35662l);
            this.f15234b = typedArrayObtainStyledAttributes.getBoolean(0, false);
            this.f15235c = typedArrayObtainStyledAttributes.getBoolean(1, true);
            typedArrayObtainStyledAttributes.recycle();
        }

        @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.AbstractC0768c
        /* JADX INFO: renamed from: a */
        public final /* bridge */ /* synthetic */ boolean mo2935a(View view) {
            return false;
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
            ExtendedFloatingActionButton extendedFloatingActionButton = (ExtendedFloatingActionButton) view;
            if (view2 instanceof AppBarLayout) {
                m8758s(coordinatorLayout, (AppBarLayout) view2, extendedFloatingActionButton);
            } else {
                ViewGroup.LayoutParams layoutParams = view2.getLayoutParams();
                if (layoutParams instanceof CoordinatorLayout.C0771f ? ((CoordinatorLayout.C0771f) layoutParams).f5550a instanceof BottomSheetBehavior : false) {
                    m8759t(view2, extendedFloatingActionButton);
                }
            }
            return false;
        }

        @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.AbstractC0768c
        /* JADX INFO: renamed from: h */
        public final boolean mo2942h(CoordinatorLayout coordinatorLayout, View view, int i10) {
            ExtendedFloatingActionButton extendedFloatingActionButton = (ExtendedFloatingActionButton) view;
            ArrayList arrayListM2923d = coordinatorLayout.m2923d(extendedFloatingActionButton);
            int size = arrayListM2923d.size();
            for (int i11 = 0; i11 < size; i11++) {
                View view2 = (View) arrayListM2923d.get(i11);
                if (view2 instanceof AppBarLayout) {
                    m8758s(coordinatorLayout, (AppBarLayout) view2, extendedFloatingActionButton);
                } else {
                    ViewGroup.LayoutParams layoutParams = view2.getLayoutParams();
                    if (layoutParams instanceof CoordinatorLayout.C0771f ? ((CoordinatorLayout.C0771f) layoutParams).f5550a instanceof BottomSheetBehavior : false) {
                        m8759t(view2, extendedFloatingActionButton);
                    }
                }
            }
            coordinatorLayout.m2928q(extendedFloatingActionButton, i10);
            return true;
        }

        /* JADX WARN: Unreachable blocks removed: 2, instructions: 2 */
        /* JADX INFO: renamed from: s */
        public final void m8758s(CoordinatorLayout coordinatorLayout, AppBarLayout appBarLayout, ExtendedFloatingActionButton extendedFloatingActionButton) {
            CoordinatorLayout.C0771f c0771f = (CoordinatorLayout.C0771f) extendedFloatingActionButton.getLayoutParams();
            boolean z10 = this.f15234b;
            int i10 = 1;
            boolean z11 = this.f15235c;
            int i11 = 0;
            if ((z10 || z11) && c0771f.f5555f == appBarLayout.getId()) {
                if (this.f15233a == null) {
                    this.f15233a = new Rect();
                }
                Rect rect = this.f15233a;
                ThreadLocal<Matrix> threadLocal = C10336c.f52023a;
                rect.set(0, 0, appBarLayout.getWidth(), appBarLayout.getHeight());
                C10336c.m19350b(coordinatorLayout, appBarLayout, rect);
                if (rect.bottom <= appBarLayout.getMinimumHeightForVisibleOverlappingContent()) {
                    if (z11) {
                        i10 = 2;
                    }
                    ExtendedFloatingActionButton.m8757e(extendedFloatingActionButton, i10);
                    throw null;
                }
                if (z11) {
                    i11 = 3;
                }
                ExtendedFloatingActionButton.m8757e(extendedFloatingActionButton, i11);
                throw null;
            }
        }

        /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
        /* JADX INFO: renamed from: t */
        public final void m8759t(View view, ExtendedFloatingActionButton extendedFloatingActionButton) {
            CoordinatorLayout.C0771f c0771f = (CoordinatorLayout.C0771f) extendedFloatingActionButton.getLayoutParams();
            boolean z10 = this.f15234b;
            int i10 = 0;
            boolean z11 = this.f15235c;
            if ((z10 || z11) && c0771f.f5555f == view.getId()) {
                if (view.getTop() < (extendedFloatingActionButton.getHeight() / 2) + ((ViewGroup.MarginLayoutParams) ((CoordinatorLayout.C0771f) extendedFloatingActionButton.getLayoutParams())).topMargin) {
                    ExtendedFloatingActionButton.m8757e(extendedFloatingActionButton, z11 ? 2 : 1);
                    throw null;
                }
                if (z11) {
                    i10 = 3;
                }
                ExtendedFloatingActionButton.m8757e(extendedFloatingActionButton, i10);
                throw null;
            }
        }
    }

    /* JADX INFO: renamed from: com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton$a */
    public class C3025a extends Property<View, Float> {
        public C3025a() {
            super(Float.class, "width");
        }

        @Override // android.util.Property
        public final Float get(View view) {
            return Float.valueOf(view.getLayoutParams().width);
        }

        @Override // android.util.Property
        public final void set(View view, Float f3) {
            View view2 = view;
            view2.getLayoutParams().width = f3.intValue();
            view2.requestLayout();
        }
    }

    /* JADX INFO: renamed from: com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton$b */
    public class C3026b extends Property<View, Float> {
        public C3026b() {
            super(Float.class, "height");
        }

        @Override // android.util.Property
        public final Float get(View view) {
            return Float.valueOf(view.getLayoutParams().height);
        }

        @Override // android.util.Property
        public final void set(View view, Float f3) {
            View view2 = view;
            view2.getLayoutParams().height = f3.intValue();
            view2.requestLayout();
        }
    }

    /* JADX INFO: renamed from: com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton$c */
    public class C3027c extends Property<View, Float> {
        public C3027c() {
            super(Float.class, "paddingStart");
        }

        @Override // android.util.Property
        public final Float get(View view) {
            WeakHashMap<View, C10049l0> weakHashMap = C10029b0.f50993a;
            return Float.valueOf(C10029b0.e.m18688f(view));
        }

        @Override // android.util.Property
        public final void set(View view, Float f3) {
            View view2 = view;
            int iIntValue = f3.intValue();
            int paddingTop = view2.getPaddingTop();
            WeakHashMap<View, C10049l0> weakHashMap = C10029b0.f50993a;
            C10029b0.e.m18693k(view2, iIntValue, paddingTop, C10029b0.e.m18687e(view2), view2.getPaddingBottom());
        }
    }

    /* JADX INFO: renamed from: com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton$d */
    public class C3028d extends Property<View, Float> {
        public C3028d() {
            super(Float.class, "paddingEnd");
        }

        @Override // android.util.Property
        public final Float get(View view) {
            WeakHashMap<View, C10049l0> weakHashMap = C10029b0.f50993a;
            return Float.valueOf(C10029b0.e.m18687e(view));
        }

        @Override // android.util.Property
        public final void set(View view, Float f3) {
            View view2 = view;
            WeakHashMap<View, C10049l0> weakHashMap = C10029b0.f50993a;
            C10029b0.e.m18693k(view2, C10029b0.e.m18688f(view2), view2.getPaddingTop(), f3.intValue(), view2.getPaddingBottom());
        }
    }

    static {
        new C3025a();
        new C3026b();
        new C3027c();
        new C3028d();
    }

    /* JADX INFO: renamed from: e */
    public static void m8757e(ExtendedFloatingActionButton extendedFloatingActionButton, int i10) {
        if (i10 != 0 && i10 != 1 && i10 != 2 && i10 != 3) {
            throw new IllegalStateException(C0166e.m761g("Unknown strategy type: ", i10));
        }
        throw null;
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.InterfaceC0767b
    public CoordinatorLayout.AbstractC0768c<ExtendedFloatingActionButton> getBehavior() {
        return null;
    }

    public int getCollapsedPadding() {
        return (getCollapsedSize() - getIconSize()) / 2;
    }

    public int getCollapsedSize() {
        return 0;
    }

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    public C6314g getExtendMotionSpec() {
        throw null;
    }

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    public C6314g getHideMotionSpec() {
        throw null;
    }

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    public C6314g getShowMotionSpec() {
        throw null;
    }

    public C6314g getShrinkMotionSpec() {
        throw null;
    }

    @Override // com.google.android.material.button.MaterialButton, android.widget.TextView, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
    }

    public void setAnimateShowBeforeLayout(boolean z10) {
    }

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    public void setExtendMotionSpec(C6314g c6314g) {
        throw null;
    }

    public void setExtendMotionSpecResource(int i10) {
        setExtendMotionSpec(C6314g.m12939a(i10, getContext()));
    }

    public void setExtended(boolean z10) {
        if (z10) {
            throw null;
        }
    }

    public void setHideMotionSpec(C6314g c6314g) {
        throw null;
    }

    public void setHideMotionSpecResource(int i10) {
        setHideMotionSpec(C6314g.m12939a(i10, getContext()));
    }

    @Override // android.widget.TextView, android.view.View
    public final void setPadding(int i10, int i11, int i12, int i13) {
        super.setPadding(i10, i11, i12, i13);
    }

    @Override // android.widget.TextView, android.view.View
    public final void setPaddingRelative(int i10, int i11, int i12, int i13) {
        super.setPaddingRelative(i10, i11, i12, i13);
    }

    public void setShowMotionSpec(C6314g c6314g) {
        throw null;
    }

    public void setShowMotionSpecResource(int i10) {
        setShowMotionSpec(C6314g.m12939a(i10, getContext()));
    }

    public void setShrinkMotionSpec(C6314g c6314g) {
        throw null;
    }

    public void setShrinkMotionSpecResource(int i10) {
        setShrinkMotionSpec(C6314g.m12939a(i10, getContext()));
    }

    @Override // android.widget.TextView
    public void setTextColor(int i10) {
        super.setTextColor(i10);
        getTextColors();
    }

    @Override // android.widget.TextView
    public void setTextColor(ColorStateList colorStateList) {
        super.setTextColor(colorStateList);
        getTextColors();
    }
}
