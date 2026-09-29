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
import android.widget.CheckedTextView;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import androidx.appcompat.R$attr;
import com.google.android.material.R$dimen;
import com.google.android.material.R$drawable;
import com.google.android.material.R$id;
import com.google.android.material.R$layout;
import p000.a6a;
import p000.bd5;
import p000.dta;
import p000.f88;
import p000.hc3;
import p000.hx5;
import p000.mw5;
import p000.og0;

/* JADX INFO: loaded from: classes2.dex */
public class NavigationMenuItemView extends hc3 implements hx5 {

    /* JADX INFO: renamed from: e0 */
    public static final int[] f13024e0 = {R.attr.state_checked};

    /* JADX INFO: renamed from: Q */
    public int f13025Q;

    /* JADX INFO: renamed from: R */
    public boolean f13026R;

    /* JADX INFO: renamed from: S */
    public boolean f13027S;

    /* JADX INFO: renamed from: T */
    public final boolean f13028T;

    /* JADX INFO: renamed from: U */
    public final CheckedTextView f13029U;

    /* JADX INFO: renamed from: V */
    public FrameLayout f13030V;

    /* JADX INFO: renamed from: W */
    public mw5 f13031W;

    /* JADX INFO: renamed from: a0 */
    public ColorStateList f13032a0;

    /* JADX INFO: renamed from: b0 */
    public boolean f13033b0;

    /* JADX INFO: renamed from: c0 */
    public Drawable f13034c0;

    /* JADX INFO: renamed from: d0 */
    public final og0 f13035d0;

    public NavigationMenuItemView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f13028T = true;
        og0 og0Var = new og0(this, 6);
        this.f13035d0 = og0Var;
        setOrientation(0);
        LayoutInflater.from(context).inflate(R$layout.design_navigation_menu_item, (ViewGroup) this, true);
        setIconSize(context.getResources().getDimensionPixelSize(R$dimen.design_navigation_icon_size));
        CheckedTextView checkedTextView = (CheckedTextView) findViewById(R$id.design_menu_item_text);
        this.f13029U = checkedTextView;
        dta.m10640k(checkedTextView, og0Var);
    }

    private void setActionView(View view) {
        if (view != null) {
            if (this.f13030V == null) {
                this.f13030V = (FrameLayout) ((ViewStub) findViewById(R$id.design_menu_item_action_area_stub)).inflate();
            }
            if (view.getParent() != null) {
                ((ViewGroup) view.getParent()).removeView(view);
            }
            this.f13030V.removeAllViews();
            this.f13030V.addView(view);
        }
    }

    @Override // p000.hx5
    /* JADX INFO: renamed from: c */
    public final void mo643c(mw5 mw5Var) {
        StateListDrawable stateListDrawable;
        this.f13031W = mw5Var;
        int i = mw5Var.f51942a;
        if (i > 0) {
            setId(i);
        }
        setVisibility(mw5Var.isVisible() ? 0 : 8);
        if (getBackground() == null) {
            TypedValue typedValue = new TypedValue();
            if (getContext().getTheme().resolveAttribute(R$attr.colorControlHighlight, typedValue, true)) {
                stateListDrawable = new StateListDrawable();
                stateListDrawable.addState(f13024e0, new ColorDrawable(typedValue.data));
                stateListDrawable.addState(ViewGroup.EMPTY_STATE_SET, new ColorDrawable(0));
            } else {
                stateListDrawable = null;
            }
            setBackground(stateListDrawable);
        }
        setCheckable(mw5Var.isCheckable());
        setChecked(mw5Var.isChecked());
        setEnabled(mw5Var.isEnabled());
        setTitle(mw5Var.f51946e);
        setIcon(mw5Var.getIcon());
        setActionView(mw5Var.getActionView());
        setContentDescription(mw5Var.f51958q);
        a6a.m135a(this, mw5Var.f51959r);
        mw5 mw5Var2 = this.f13031W;
        CharSequence charSequence = mw5Var2.f51946e;
        CheckedTextView checkedTextView = this.f13029U;
        if (charSequence == null && mw5Var2.getIcon() == null && this.f13031W.getActionView() != null) {
            checkedTextView.setVisibility(8);
            FrameLayout frameLayout = this.f13030V;
            if (frameLayout != null) {
                bd5 bd5Var = (bd5) frameLayout.getLayoutParams();
                ((LinearLayout.LayoutParams) bd5Var).width = -1;
                this.f13030V.setLayoutParams(bd5Var);
                return;
            }
            return;
        }
        checkedTextView.setVisibility(0);
        FrameLayout frameLayout2 = this.f13030V;
        if (frameLayout2 != null) {
            bd5 bd5Var2 = (bd5) frameLayout2.getLayoutParams();
            ((LinearLayout.LayoutParams) bd5Var2).width = -2;
            this.f13030V.setLayoutParams(bd5Var2);
        }
    }

    @Override // p000.hx5
    public mw5 getItemData() {
        return this.f13031W;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final int[] onCreateDrawableState(int i) {
        int[] iArrOnCreateDrawableState = super.onCreateDrawableState(i + 1);
        mw5 mw5Var = this.f13031W;
        if (mw5Var != null && mw5Var.isCheckable() && this.f13031W.isChecked()) {
            View.mergeDrawableStates(iArrOnCreateDrawableState, f13024e0);
        }
        return iArrOnCreateDrawableState;
    }

    public void setCheckable(boolean z) {
        refreshDrawableState();
        if (this.f13027S != z) {
            this.f13027S = z;
            this.f13035d0.mo14278h(this.f13029U, 2048);
        }
    }

    public void setChecked(boolean z) {
        refreshDrawableState();
        CheckedTextView checkedTextView = this.f13029U;
        checkedTextView.setChecked(z);
        checkedTextView.setTypeface(checkedTextView.getTypeface(), (z && this.f13028T) ? 1 : 0);
    }

    public void setHorizontalPadding(int i) {
        setPadding(i, getPaddingTop(), i, getPaddingBottom());
    }

    public void setIcon(Drawable drawable) {
        if (drawable != null) {
            if (this.f13033b0) {
                Drawable.ConstantState constantState = drawable.getConstantState();
                if (constantState != null) {
                    drawable = constantState.newDrawable();
                }
                drawable = drawable.mutate();
                drawable.setTintList(this.f13032a0);
            }
            int i = this.f13025Q;
            drawable.setBounds(0, 0, i, i);
        } else if (this.f13026R) {
            if (this.f13034c0 == null) {
                Resources resources = getResources();
                int i2 = R$drawable.navigation_empty_icon;
                Resources.Theme theme = getContext().getTheme();
                ThreadLocal threadLocal = f88.f38630a;
                Drawable drawable2 = resources.getDrawable(i2, theme);
                this.f13034c0 = drawable2;
                if (drawable2 != null) {
                    int i3 = this.f13025Q;
                    drawable2.setBounds(0, 0, i3, i3);
                }
            }
            drawable = this.f13034c0;
        }
        this.f13029U.setCompoundDrawablesRelative(drawable, null, null, null);
    }

    public void setIconPadding(int i) {
        this.f13029U.setCompoundDrawablePadding(i);
    }

    public void setIconSize(int i) {
        this.f13025Q = i;
    }

    public void setIconTintList(ColorStateList colorStateList) {
        this.f13032a0 = colorStateList;
        this.f13033b0 = colorStateList != null;
        mw5 mw5Var = this.f13031W;
        if (mw5Var != null) {
            setIcon(mw5Var.getIcon());
        }
    }

    public void setMaxLines(int i) {
        this.f13029U.setMaxLines(i);
    }

    public void setNeedsEmptyIcon(boolean z) {
        this.f13026R = z;
    }

    public void setTextAppearance(int i) {
        this.f13029U.setTextAppearance(i);
    }

    public void setTextColor(ColorStateList colorStateList) {
        this.f13029U.setTextColor(colorStateList);
    }

    public void setTitle(CharSequence charSequence) {
        this.f13029U.setText(charSequence);
    }

    public NavigationMenuItemView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public NavigationMenuItemView(Context context) {
        this(context, null);
    }
}
