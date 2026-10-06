package com.google.android.material.internal;

import android.R;
import android.content.Context;
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
import com.google.android.apps.camera.bottombar.C0100R;
import p000.C0227gy;
import p000.C0783kw;
import p000.C0861nt;
import p000.InterfaceC0240hk;
import p000.abm;
import p000.aei;
import p000.afb;
import p000.afq;
import p000.miw;
import p000.mix;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public class NavigationMenuItemView extends miw implements InterfaceC0240hk {

    /* JADX INFO: renamed from: d */
    private static final int[] f8169d = {R.attr.state_checked};

    /* JADX INFO: renamed from: c */
    public boolean f8170c;

    /* JADX INFO: renamed from: e */
    private int f8171e;

    /* JADX INFO: renamed from: i */
    private final CheckedTextView f8172i;

    /* JADX INFO: renamed from: j */
    private FrameLayout f8173j;

    /* JADX INFO: renamed from: k */
    private C0227gy f8174k;

    /* JADX INFO: renamed from: l */
    private final aei f8175l;

    public NavigationMenuItemView(Context context) {
        this(context, null);
    }

    @Override // p000.InterfaceC0240hk
    /* JADX INFO: renamed from: a */
    public final C0227gy mo1030a() {
        return this.f8174k;
    }

    @Override // p000.InterfaceC0240hk
    /* JADX INFO: renamed from: e */
    public final boolean mo1034e() {
        return false;
    }

    @Override // p000.InterfaceC0240hk
    /* JADX INFO: renamed from: f */
    public final void mo1035f(C0227gy c0227gy) {
        StateListDrawable stateListDrawable;
        this.f8174k = c0227gy;
        int i = c0227gy.f26787a;
        if (i > 0) {
            setId(i);
        }
        setVisibility(true != c0227gy.isVisible() ? 8 : 0);
        if (getBackground() == null) {
            TypedValue typedValue = new TypedValue();
            if (getContext().getTheme().resolveAttribute(C0100R.attr.colorControlHighlight, typedValue, true)) {
                stateListDrawable = new StateListDrawable();
                stateListDrawable.addState(f8169d, new ColorDrawable(typedValue.data));
                stateListDrawable.addState(EMPTY_STATE_SET, new ColorDrawable(0));
            } else {
                stateListDrawable = null;
            }
            afb.m432m(this, stateListDrawable);
        }
        boolean zIsCheckable = c0227gy.isCheckable();
        refreshDrawableState();
        if (this.f8170c != zIsCheckable) {
            this.f8170c = zIsCheckable;
            this.f8175l.mo328d(this.f8172i, 2048);
        }
        boolean zIsChecked = c0227gy.isChecked();
        refreshDrawableState();
        this.f8172i.setChecked(zIsChecked);
        CheckedTextView checkedTextView = this.f8172i;
        checkedTextView.setTypeface(checkedTextView.getTypeface(), zIsChecked ? 1 : 0);
        setEnabled(c0227gy.isEnabled());
        this.f8172i.setText(c0227gy.f26790d);
        Drawable icon = c0227gy.getIcon();
        if (icon != null) {
            int i2 = this.f8171e;
            icon.setBounds(0, 0, i2, i2);
        }
        abm.m139f(this.f8172i, icon, null, null);
        View actionView = c0227gy.getActionView();
        if (actionView != null) {
            if (this.f8173j == null) {
                this.f8173j = (FrameLayout) ((ViewStub) findViewById(C0100R.id.design_menu_item_action_area_stub)).inflate();
            }
            this.f8173j.removeAllViews();
            this.f8173j.addView(actionView);
        }
        setContentDescription(c0227gy.f26798l);
        C0861nt.m17652a(this, c0227gy.f26799m);
        C0227gy c0227gy2 = this.f8174k;
        if (c0227gy2.f26790d == null && c0227gy2.getIcon() == null && this.f8174k.getActionView() != null) {
            this.f8172i.setVisibility(8);
            FrameLayout frameLayout = this.f8173j;
            if (frameLayout != null) {
                C0783kw c0783kw = (C0783kw) frameLayout.getLayoutParams();
                c0783kw.width = -1;
                this.f8173j.setLayoutParams(c0783kw);
                return;
            }
            return;
        }
        this.f8172i.setVisibility(0);
        FrameLayout frameLayout2 = this.f8173j;
        if (frameLayout2 != null) {
            C0783kw c0783kw2 = (C0783kw) frameLayout2.getLayoutParams();
            c0783kw2.width = -2;
            this.f8173j.setLayoutParams(c0783kw2);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    protected final int[] onCreateDrawableState(int i) {
        int[] iArrOnCreateDrawableState = super.onCreateDrawableState(i + 1);
        C0227gy c0227gy = this.f8174k;
        if (c0227gy != null && c0227gy.isCheckable() && c0227gy.isChecked()) {
            mergeDrawableStates(iArrOnCreateDrawableState, f8169d);
        }
        return iArrOnCreateDrawableState;
    }

    public NavigationMenuItemView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public NavigationMenuItemView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        mix mixVar = new mix(this);
        this.f8175l = mixVar;
        m1121r(0);
        LayoutInflater.from(context).inflate(C0100R.layout.design_navigation_menu_item, (ViewGroup) this, true);
        this.f8171e = context.getResources().getDimensionPixelSize(C0100R.dimen.design_navigation_icon_size);
        CheckedTextView checkedTextView = (CheckedTextView) findViewById(C0100R.id.design_menu_item_text);
        this.f8172i = checkedTextView;
        checkedTextView.setDuplicateParentStateEnabled(true);
        afq.m547g(checkedTextView, mixVar);
    }
}
