package com.google.android.material.snackbar;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityManager;
import android.widget.FrameLayout;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.linguist.R;

/* JADX INFO: loaded from: classes.dex */
public final class Snackbar extends BaseTransientBottomBar<Snackbar> {

    /* JADX INFO: renamed from: C */
    public static final int[] f15581C = {R.attr.snackbarButtonStyle, R.attr.snackbarTextViewStyle};

    /* JADX INFO: renamed from: A */
    public final AccessibilityManager f15582A;

    /* JADX INFO: renamed from: B */
    public boolean f15583B;

    public static final class SnackbarLayout extends BaseTransientBottomBar.C3061e {
        public SnackbarLayout(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
        }

        @Override // com.google.android.material.snackbar.BaseTransientBottomBar.C3061e, android.widget.FrameLayout, android.view.View
        public final void onMeasure(int i10, int i11) {
            super.onMeasure(i10, i11);
            int childCount = getChildCount();
            int measuredWidth = (getMeasuredWidth() - getPaddingLeft()) - getPaddingRight();
            for (int i12 = 0; i12 < childCount; i12++) {
                View childAt = getChildAt(i12);
                if (childAt.getLayoutParams().width == -1) {
                    childAt.measure(View.MeasureSpec.makeMeasureSpec(measuredWidth, 1073741824), View.MeasureSpec.makeMeasureSpec(childAt.getMeasuredHeight(), 1073741824));
                }
            }
        }

        @Override // com.google.android.material.snackbar.BaseTransientBottomBar.C3061e, android.view.View
        public /* bridge */ /* synthetic */ void setBackground(Drawable drawable) {
            super.setBackground(drawable);
        }

        @Override // com.google.android.material.snackbar.BaseTransientBottomBar.C3061e, android.view.View
        public /* bridge */ /* synthetic */ void setBackgroundDrawable(Drawable drawable) {
            super.setBackgroundDrawable(drawable);
        }

        @Override // com.google.android.material.snackbar.BaseTransientBottomBar.C3061e, android.view.View
        public /* bridge */ /* synthetic */ void setBackgroundTintList(ColorStateList colorStateList) {
            super.setBackgroundTintList(colorStateList);
        }

        @Override // com.google.android.material.snackbar.BaseTransientBottomBar.C3061e, android.view.View
        public /* bridge */ /* synthetic */ void setBackgroundTintMode(PorterDuff.Mode mode) {
            super.setBackgroundTintMode(mode);
        }

        @Override // com.google.android.material.snackbar.BaseTransientBottomBar.C3061e, android.view.View
        public /* bridge */ /* synthetic */ void setLayoutParams(ViewGroup.LayoutParams layoutParams) {
            super.setLayoutParams(layoutParams);
        }

        @Override // com.google.android.material.snackbar.BaseTransientBottomBar.C3061e, android.view.View
        public /* bridge */ /* synthetic */ void setOnClickListener(View.OnClickListener onClickListener) {
            super.setOnClickListener(onClickListener);
        }
    }

    public Snackbar(Context context, ViewGroup viewGroup, SnackbarContentLayout snackbarContentLayout, SnackbarContentLayout snackbarContentLayout2) {
        super(context, viewGroup, snackbarContentLayout, snackbarContentLayout2);
        this.f15582A = (AccessibilityManager) viewGroup.getContext().getSystemService("accessibility");
    }

    /* JADX WARN: Code duplicated, block: B:13:0x0029  */
    /* JADX WARN: Code duplicated, block: B:15:0x0032  */
    /* JADX WARN: Code duplicated, block: B:16:0x0036  */
    /* JADX WARN: Code duplicated, block: B:36:0x003a A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:38:0x0038 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:40:? A[LOOP:0: B:3:0x0004->B:40:?, LOOP_END, SYNTHETIC] */
    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    /* JADX INFO: renamed from: h */
    public static Snackbar m8842h(View view, String str, int i10) {
        ViewGroup viewGroup;
        Object parent;
        View view2 = view;
        ViewGroup viewGroup2 = null;
        while (true) {
            if (view2 instanceof CoordinatorLayout) {
                viewGroup = (ViewGroup) view2;
                break;
            }
            if (!(view2 instanceof FrameLayout)) {
                if (view2 != null) {
                    parent = view2.getParent();
                    if (parent instanceof View) {
                        view2 = (View) parent;
                    } else {
                        view2 = null;
                    }
                }
                if (view2 == null) {
                    viewGroup = viewGroup2;
                    break;
                }
            } else {
                if (view2.getId() == 16908290) {
                    viewGroup = (ViewGroup) view2;
                    break;
                }
                viewGroup2 = (ViewGroup) view2;
                if (view2 != null) {
                    parent = view2.getParent();
                    if (parent instanceof View) {
                        view2 = (View) parent;
                    } else {
                        view2 = null;
                    }
                }
                if (view2 == null) {
                    viewGroup = viewGroup2;
                    break;
                }
            }
        }
        if (viewGroup == null) {
            throw new IllegalArgumentException("No suitable parent found from the given view. Please provide a valid view.");
        }
        Context context = viewGroup.getContext();
        LayoutInflater layoutInflaterFrom = LayoutInflater.from(context);
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(f15581C);
        int resourceId = typedArrayObtainStyledAttributes.getResourceId(0, -1);
        int resourceId2 = typedArrayObtainStyledAttributes.getResourceId(1, -1);
        typedArrayObtainStyledAttributes.recycle();
        SnackbarContentLayout snackbarContentLayout = (SnackbarContentLayout) layoutInflaterFrom.inflate((resourceId == -1 || resourceId2 == -1) ? false : true ? R.layout.mtrl_layout_snackbar_include : R.layout.design_layout_snackbar_include, viewGroup, false);
        Snackbar snackbar = new Snackbar(context, viewGroup, snackbarContentLayout, snackbarContentLayout);
        ((SnackbarContentLayout) snackbar.f15553i.getChildAt(0)).getMessageView().setText(str);
        snackbar.f15555k = i10;
        return snackbar;
    }

    @Override // com.google.android.material.snackbar.BaseTransientBottomBar
    /* JADX INFO: renamed from: a */
    public final void mo8833a() {
        m8834b(3);
    }

    /* JADX INFO: renamed from: g */
    public final int m8843g() {
        int i10 = this.f15555k;
        if (i10 == -2) {
            return -2;
        }
        int i11 = Build.VERSION.SDK_INT;
        AccessibilityManager accessibilityManager = this.f15582A;
        if (i11 >= 29) {
            return accessibilityManager.getRecommendedTimeoutMillis(i10, (this.f15583B ? 4 : 0) | 1 | 2);
        }
        if (this.f15583B && accessibilityManager.isTouchExplorationEnabled()) {
            return -2;
        }
        return i10;
    }

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    /* JADX INFO: renamed from: i */
    public final void m8844i() {
        C3068g c3068gM8847b = C3068g.m8847b();
        int iM8843g = m8843g();
        BaseTransientBottomBar.C3059c c3059c = this.f15564t;
        synchronized (c3068gM8847b.f15595a) {
            if (c3068gM8847b.m8849c(c3059c)) {
                C3068g.c cVar = c3068gM8847b.f15597c;
                cVar.f15601b = iM8843g;
                c3068gM8847b.f15596b.removeCallbacksAndMessages(cVar);
                c3068gM8847b.m8850d(c3068gM8847b.f15597c);
                return;
            }
            C3068g.c cVar2 = c3068gM8847b.f15598d;
            boolean z10 = false;
            if (cVar2 != null) {
                if (c3059c != null && cVar2.f15600a.get() == c3059c) {
                    z10 = true;
                }
            }
            if (z10) {
                c3068gM8847b.f15598d.f15601b = iM8843g;
            } else {
                c3068gM8847b.f15598d = new C3068g.c(iM8843g, c3059c);
            }
            C3068g.c cVar3 = c3068gM8847b.f15597c;
            if (cVar3 == null || !c3068gM8847b.m8848a(cVar3, 4)) {
                c3068gM8847b.f15597c = null;
                C3068g.c cVar4 = c3068gM8847b.f15598d;
                if (cVar4 != null) {
                    c3068gM8847b.f15597c = cVar4;
                    c3068gM8847b.f15598d = null;
                    C3068g.b bVar = cVar4.f15600a.get();
                    if (bVar != null) {
                        bVar.mo8839b();
                    } else {
                        c3068gM8847b.f15597c = null;
                    }
                }
            }
        }
    }
}
