package com.google.android.material.internal;

import android.R;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.StateListDrawable;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.CheckedTextView;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import androidx.appcompat.view.menu.C0226h;
import androidx.appcompat.view.menu.InterfaceC0229k;
import androidx.appcompat.widget.C0309e1;
import androidx.appcompat.widget.C0323j0;
import java.util.WeakHashMap;
import p024b3.C1304k;
import p286o2.C7906f;
import p329q2.C8488a;
import p471x2.C10026a;
import p471x2.C10029b0;
import p471x2.C10049l0;
import p497y2.C10284f;
import p507yc.C10338e;

/* JADX INFO: loaded from: classes.dex */
public class NavigationMenuItemView extends C10338e implements InterfaceC0229k.a {

    /* JADX INFO: renamed from: d0 */
    public static final int[] f15333d0 = {R.attr.state_checked};

    /* JADX INFO: renamed from: Q */
    public int f15334Q;

    /* JADX INFO: renamed from: R */
    public boolean f15335R;

    /* JADX INFO: renamed from: S */
    public boolean f15336S;

    /* JADX INFO: renamed from: T */
    public final CheckedTextView f15337T;

    /* JADX INFO: renamed from: U */
    public FrameLayout f15338U;

    /* JADX INFO: renamed from: V */
    public C0226h f15339V;

    /* JADX INFO: renamed from: W */
    public ColorStateList f15340W;

    /* JADX INFO: renamed from: a0 */
    public boolean f15341a0;

    /* JADX INFO: renamed from: b0 */
    public Drawable f15342b0;

    /* JADX INFO: renamed from: c0 */
    public final C3038a f15343c0;

    /* JADX INFO: renamed from: com.google.android.material.internal.NavigationMenuItemView$a */
    public class C3038a extends C10026a {
        public C3038a() {
        }

        @Override // p471x2.C10026a
        /* JADX INFO: renamed from: d */
        public final void mo2999d(View view, C10284f c10284f) {
            View.AccessibilityDelegate accessibilityDelegate = this.f50989a;
            AccessibilityNodeInfo accessibilityNodeInfo = c10284f.f51739a;
            accessibilityDelegate.onInitializeAccessibilityNodeInfo(view, accessibilityNodeInfo);
            accessibilityNodeInfo.setCheckable(NavigationMenuItemView.this.f15336S);
        }
    }

    public NavigationMenuItemView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public NavigationMenuItemView(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, 0);
        C3038a c3038a = new C3038a();
        this.f15343c0 = c3038a;
        setOrientation(0);
        LayoutInflater.from(context).inflate(com.linguist.R.layout.design_navigation_menu_item, (ViewGroup) this, true);
        setIconSize(context.getResources().getDimensionPixelSize(com.linguist.R.dimen.design_navigation_icon_size));
        CheckedTextView checkedTextView = (CheckedTextView) findViewById(com.linguist.R.id.design_menu_item_text);
        this.f15337T = checkedTextView;
        checkedTextView.setDuplicateParentStateEnabled(true);
        C10029b0.m18658n(checkedTextView, c3038a);
    }

    private void setActionView(View view) {
        if (view != null) {
            if (this.f15338U == null) {
                this.f15338U = (FrameLayout) ((ViewStub) findViewById(com.linguist.R.id.design_menu_item_action_area_stub)).inflate();
            }
            this.f15338U.removeAllViews();
            this.f15338U.addView(view);
        }
    }

    @Override // androidx.appcompat.view.menu.InterfaceC0229k.a
    /* JADX INFO: renamed from: d */
    public final void mo232d(C0226h c0226h) {
        StateListDrawable stateListDrawable;
        this.f15339V = c0226h;
        int i10 = c0226h.f723a;
        if (i10 > 0) {
            setId(i10);
        }
        setVisibility(c0226h.isVisible() ? 0 : 8);
        if (getBackground() == null) {
            TypedValue typedValue = new TypedValue();
            if (getContext().getTheme().resolveAttribute(com.linguist.R.attr.colorControlHighlight, typedValue, true)) {
                stateListDrawable = new StateListDrawable();
                stateListDrawable.addState(f15333d0, new ColorDrawable(typedValue.data));
                stateListDrawable.addState(ViewGroup.EMPTY_STATE_SET, new ColorDrawable(0));
            } else {
                stateListDrawable = null;
            }
            WeakHashMap<View, C10049l0> weakHashMap = C10029b0.f50993a;
            C10029b0.d.m18680q(this, stateListDrawable);
        }
        setCheckable(c0226h.isCheckable());
        setChecked(c0226h.isChecked());
        setEnabled(c0226h.isEnabled());
        setTitle(c0226h.f727e);
        setIcon(c0226h.getIcon());
        setActionView(c0226h.getActionView());
        setContentDescription(c0226h.f739q);
        C0309e1.m1185a(this, c0226h.f740r);
        C0226h c0226h2 = this.f15339V;
        boolean z10 = c0226h2.f727e == null && c0226h2.getIcon() == null && this.f15339V.getActionView() != null;
        CheckedTextView checkedTextView = this.f15337T;
        if (z10) {
            checkedTextView.setVisibility(8);
            FrameLayout frameLayout = this.f15338U;
            if (frameLayout != null) {
                C0323j0.a aVar = (C0323j0.a) frameLayout.getLayoutParams();
                ((LinearLayout.LayoutParams) aVar).width = -1;
                this.f15338U.setLayoutParams(aVar);
            }
        } else {
            checkedTextView.setVisibility(0);
            FrameLayout frameLayout2 = this.f15338U;
            if (frameLayout2 != null) {
                C0323j0.a aVar2 = (C0323j0.a) frameLayout2.getLayoutParams();
                ((LinearLayout.LayoutParams) aVar2).width = -2;
                this.f15338U.setLayoutParams(aVar2);
            }
        }
    }

    @Override // androidx.appcompat.view.menu.InterfaceC0229k.a
    public C0226h getItemData() {
        return this.f15339V;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final int[] onCreateDrawableState(int i10) {
        int[] iArrOnCreateDrawableState = super.onCreateDrawableState(i10 + 1);
        C0226h c0226h = this.f15339V;
        if (c0226h != null && c0226h.isCheckable() && this.f15339V.isChecked()) {
            View.mergeDrawableStates(iArrOnCreateDrawableState, f15333d0);
        }
        return iArrOnCreateDrawableState;
    }

    public void setCheckable(boolean z10) {
        refreshDrawableState();
        if (this.f15336S != z10) {
            this.f15336S = z10;
            this.f15343c0.mo4453h(this.f15337T, 2048);
        }
    }

    public void setChecked(boolean z10) {
        refreshDrawableState();
        CheckedTextView checkedTextView = this.f15337T;
        checkedTextView.setChecked(z10);
        checkedTextView.setTypeface(checkedTextView.getTypeface(), z10 ? 1 : 0);
    }

    public void setHorizontalPadding(int i10) {
        setPadding(i10, getPaddingTop(), i10, getPaddingBottom());
    }

    public void setIcon(Drawable drawable) {
        if (drawable != null) {
            if (this.f15341a0) {
                Drawable.ConstantState constantState = drawable.getConstantState();
                if (constantState != null) {
                    drawable = constantState.newDrawable();
                }
                drawable = drawable.mutate();
                C8488a.b.m16570h(drawable, this.f15340W);
            }
            int i10 = this.f15334Q;
            drawable.setBounds(0, 0, i10, i10);
        } else if (this.f15335R) {
            if (this.f15342b0 == null) {
                Resources resources = getResources();
                Resources.Theme theme = getContext().getTheme();
                ThreadLocal<TypedValue> threadLocal = C7906f.f43056a;
                Drawable drawableM15676a = C7906f.a.m15676a(resources, com.linguist.R.drawable.navigation_empty_icon, theme);
                this.f15342b0 = drawableM15676a;
                if (drawableM15676a != null) {
                    int i11 = this.f15334Q;
                    drawableM15676a.setBounds(0, 0, i11, i11);
                }
            }
            drawable = this.f15342b0;
        }
        C1304k.b.m4840e(this.f15337T, drawable, null, null, null);
    }

    public void setIconPadding(int i10) {
        this.f15337T.setCompoundDrawablePadding(i10);
    }

    public void setIconSize(int i10) {
        this.f15334Q = i10;
    }

    public void setIconTintList(ColorStateList colorStateList) {
        this.f15340W = colorStateList;
        this.f15341a0 = colorStateList != null;
        C0226h c0226h = this.f15339V;
        if (c0226h != null) {
            setIcon(c0226h.getIcon());
        }
    }

    public void setMaxLines(int i10) {
        this.f15337T.setMaxLines(i10);
    }

    public void setNeedsEmptyIcon(boolean z10) {
        this.f15335R = z10;
    }

    public void setTextAppearance(int i10) {
        this.f15337T.setTextAppearance(i10);
    }

    public void setTextColor(ColorStateList colorStateList) {
        this.f15337T.setTextColor(colorStateList);
    }

    public void setTitle(CharSequence charSequence) {
        this.f15337T.setText(charSequence);
    }
}
