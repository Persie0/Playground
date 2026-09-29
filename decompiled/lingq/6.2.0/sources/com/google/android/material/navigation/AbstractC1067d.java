package com.google.android.material.navigation;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.util.SparseArray;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.google.android.material.R$dimen;
import com.google.android.material.R$styleable;
import com.google.android.material.bottomnavigation.BottomNavigationView;
import java.lang.ref.WeakReference;
import java.util.concurrent.CopyOnWriteArrayList;
import p000.AbstractC3122is;
import p000.AbstractC3184kh;
import p000.dg0;
import p000.dy9;
import p000.ex5;
import p000.fs5;
import p000.ix5;
import p000.kg6;
import p000.lg6;
import p000.ng6;
import p000.or3;
import p000.pb1;
import p000.qs5;
import p000.r39;
import p000.rg6;
import p000.sg6;
import p000.sq5;
import p000.un9;

/* JADX INFO: renamed from: com.google.android.material.navigation.d */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC1067d extends FrameLayout {

    /* JADX INFO: renamed from: a */
    public final lg6 f13058a;

    /* JADX INFO: renamed from: b */
    public final dg0 f13059b;

    /* JADX INFO: renamed from: c */
    public final C1065b f13060c;

    /* JADX INFO: renamed from: d */
    public un9 f13061d;

    /* JADX INFO: renamed from: e */
    public sg6 f13062e;

    /* JADX INFO: renamed from: f */
    public rg6 f13063f;

    /* JADX WARN: Code duplicated, block: B:56:0x020f  */
    public AbstractC1067d(Context context, AttributeSet attributeSet, int i, int i2) {
        super(qs5.m20141b(context, attributeSet, i, i2), attributeSet, i);
        C1065b c1065b = new C1065b();
        c1065b.f13056b = false;
        this.f13060c = c1065b;
        Context context2 = getContext();
        sq5 sq5VarM10752e = dy9.m10752e(context2, attributeSet, R$styleable.NavigationBarView, i, i2, R$styleable.NavigationBarView_itemTextAppearanceInactive, R$styleable.NavigationBarView_itemTextAppearanceActive);
        lg6 lg6Var = new lg6(context2, getClass(), getMaxItemCount());
        this.f13058a = lg6Var;
        dg0 dg0Var = new dg0(context2);
        this.f13059b = dg0Var;
        dg0Var.setMinimumHeight(getSuggestedMinimumHeight());
        dg0Var.setCollapsedMaxItemCount(getCollapsedMaxItemCount());
        c1065b.f13055a = dg0Var;
        c1065b.f13057c = 1;
        dg0Var.setPresenter(c1065b);
        lg6Var.m13519b(c1065b, lg6Var.f43037a);
        c1065b.mo712l(getContext(), lg6Var);
        int i3 = R$styleable.NavigationBarView_itemIconTint;
        TypedArray typedArray = (TypedArray) sq5VarM10752e.f61249c;
        if (typedArray.hasValue(i3)) {
            dg0Var.setIconTintList(sq5VarM10752e.m21567i(R$styleable.NavigationBarView_itemIconTint));
        } else {
            dg0Var.setIconTintList(dg0Var.m19131c());
        }
        setItemIconSize(typedArray.getDimensionPixelSize(R$styleable.NavigationBarView_itemIconSize, getResources().getDimensionPixelSize(R$dimen.mtrl_navigation_bar_item_default_icon_size)));
        if (typedArray.hasValue(R$styleable.NavigationBarView_itemTextAppearanceInactive)) {
            setItemTextAppearanceInactive(typedArray.getResourceId(R$styleable.NavigationBarView_itemTextAppearanceInactive, 0));
        }
        if (typedArray.hasValue(R$styleable.NavigationBarView_itemTextAppearanceActive)) {
            setItemTextAppearanceActive(typedArray.getResourceId(R$styleable.NavigationBarView_itemTextAppearanceActive, 0));
        }
        if (typedArray.hasValue(R$styleable.NavigationBarView_horizontalItemTextAppearanceInactive)) {
            setHorizontalItemTextAppearanceInactive(typedArray.getResourceId(R$styleable.NavigationBarView_horizontalItemTextAppearanceInactive, 0));
        }
        if (typedArray.hasValue(R$styleable.NavigationBarView_horizontalItemTextAppearanceActive)) {
            setHorizontalItemTextAppearanceActive(typedArray.getResourceId(R$styleable.NavigationBarView_horizontalItemTextAppearanceActive, 0));
        }
        setItemTextAppearanceActiveBoldEnabled(typedArray.getBoolean(R$styleable.NavigationBarView_itemTextAppearanceActiveBoldEnabled, true));
        if (typedArray.hasValue(R$styleable.NavigationBarView_itemTextColor)) {
            setItemTextColor(sq5VarM10752e.m21567i(R$styleable.NavigationBarView_itemTextColor));
        }
        Drawable background = getBackground();
        ColorStateList colorStateListM14107u = AbstractC3122is.m14107u(background);
        if (background == null || colorStateListM14107u != null) {
            fs5 fs5Var = new fs5(r39.m20281h(context2, attributeSet, i, i2).m19627a());
            if (colorStateListM14107u != null) {
                fs5Var.m12076t(colorStateListM14107u);
            }
            fs5Var.m12072p(context2);
            setBackground(fs5Var);
        }
        if (typedArray.hasValue(R$styleable.NavigationBarView_itemPaddingTop)) {
            setItemPaddingTop(typedArray.getDimensionPixelSize(R$styleable.NavigationBarView_itemPaddingTop, 0));
        }
        if (typedArray.hasValue(R$styleable.NavigationBarView_itemPaddingBottom)) {
            setItemPaddingBottom(typedArray.getDimensionPixelSize(R$styleable.NavigationBarView_itemPaddingBottom, 0));
        }
        if (typedArray.hasValue(R$styleable.NavigationBarView_activeIndicatorLabelPadding)) {
            setActiveIndicatorLabelPadding(typedArray.getDimensionPixelSize(R$styleable.NavigationBarView_activeIndicatorLabelPadding, 0));
        }
        if (typedArray.hasValue(R$styleable.NavigationBarView_iconLabelHorizontalSpacing)) {
            setIconLabelHorizontalSpacing(typedArray.getDimensionPixelSize(R$styleable.NavigationBarView_iconLabelHorizontalSpacing, 0));
        }
        if (typedArray.hasValue(R$styleable.NavigationBarView_elevation)) {
            setElevation(typedArray.getDimensionPixelSize(R$styleable.NavigationBarView_elevation, 0));
        }
        getBackground().mutate().setTintList(pb1.m19053w(context2, sq5VarM10752e, R$styleable.NavigationBarView_backgroundTint));
        int dimensionPixelSize = -1;
        setLabelVisibilityMode(typedArray.getInteger(R$styleable.NavigationBarView_labelVisibilityMode, -1));
        setItemIconGravity(typedArray.getInteger(R$styleable.NavigationBarView_itemIconGravity, 0));
        setItemGravity(typedArray.getInteger(R$styleable.NavigationBarView_itemGravity, 49));
        int resourceId = typedArray.getResourceId(R$styleable.NavigationBarView_itemBackground, 0);
        if (resourceId != 0) {
            dg0Var.setItemBackgroundRes(resourceId);
        } else {
            setItemRippleColor(pb1.m19053w(context2, sq5VarM10752e, R$styleable.NavigationBarView_itemRippleColor));
        }
        setMeasureBottomPaddingFromLabelBaseline(typedArray.getBoolean(R$styleable.NavigationBarView_measureBottomPaddingFromLabelBaseline, true));
        setLabelFontScalingEnabled(typedArray.getBoolean(R$styleable.NavigationBarView_labelFontScalingEnabled, false));
        setLabelMaxLines(typedArray.getInteger(R$styleable.NavigationBarView_labelMaxLines, 1));
        int resourceId2 = typedArray.getResourceId(R$styleable.NavigationBarView_itemActiveIndicatorStyle, 0);
        if (resourceId2 != 0) {
            setItemActiveIndicatorEnabled(true);
            TypedArray typedArrayObtainStyledAttributes = context2.obtainStyledAttributes(resourceId2, R$styleable.NavigationBarActiveIndicator);
            int dimensionPixelSize2 = typedArrayObtainStyledAttributes.getDimensionPixelSize(R$styleable.NavigationBarActiveIndicator_android_width, 0);
            setItemActiveIndicatorWidth(dimensionPixelSize2);
            setItemActiveIndicatorHeight(typedArrayObtainStyledAttributes.getDimensionPixelSize(R$styleable.NavigationBarActiveIndicator_android_height, 0));
            int dimensionPixelOffset = typedArrayObtainStyledAttributes.getDimensionPixelOffset(R$styleable.NavigationBarActiveIndicator_marginHorizontal, 0);
            setItemActiveIndicatorMarginHorizontal(dimensionPixelOffset);
            String string = typedArrayObtainStyledAttributes.getString(R$styleable.NavigationBarActiveIndicator_expandedWidth);
            if (string == null) {
                dimensionPixelSize = -2;
            } else if (!String.valueOf(-1).equals(string)) {
                if (String.valueOf(-2).equals(string)) {
                    dimensionPixelSize = -2;
                } else {
                    dimensionPixelSize = typedArrayObtainStyledAttributes.getDimensionPixelSize(R$styleable.NavigationBarActiveIndicator_expandedWidth, -2);
                }
            }
            setItemActiveIndicatorExpandedWidth(dimensionPixelSize);
            setItemActiveIndicatorExpandedHeight(typedArrayObtainStyledAttributes.getDimensionPixelSize(R$styleable.NavigationBarActiveIndicator_expandedHeight, dimensionPixelSize2));
            setItemActiveIndicatorExpandedMarginHorizontal(typedArrayObtainStyledAttributes.getDimensionPixelOffset(R$styleable.NavigationBarActiveIndicator_expandedMarginHorizontal, dimensionPixelOffset));
            int dimensionPixelSize3 = getResources().getDimensionPixelSize(R$dimen.m3_navigation_item_leading_trailing_space);
            int dimensionPixelOffset2 = typedArrayObtainStyledAttributes.getDimensionPixelOffset(R$styleable.NavigationBarActiveIndicator_expandedActiveIndicatorPaddingStart, dimensionPixelSize3);
            int dimensionPixelOffset3 = typedArrayObtainStyledAttributes.getDimensionPixelOffset(R$styleable.NavigationBarActiveIndicator_expandedActiveIndicatorPaddingEnd, dimensionPixelSize3);
            int i4 = getLayoutDirection() == 1 ? dimensionPixelOffset3 : dimensionPixelOffset2;
            int dimensionPixelOffset4 = typedArrayObtainStyledAttributes.getDimensionPixelOffset(R$styleable.NavigationBarActiveIndicator_expandedActiveIndicatorPaddingTop, 0);
            dimensionPixelOffset2 = getLayoutDirection() != 1 ? dimensionPixelOffset3 : dimensionPixelOffset2;
            int dimensionPixelOffset5 = typedArrayObtainStyledAttributes.getDimensionPixelOffset(R$styleable.f12561x19991881, 0);
            Rect rect = dg0Var.f56184t0;
            rect.left = i4;
            rect.top = dimensionPixelOffset4;
            rect.right = dimensionPixelOffset2;
            rect.bottom = dimensionPixelOffset5;
            ng6[] ng6VarArr = dg0Var.f56165g;
            if (ng6VarArr != null) {
                for (ng6 ng6Var : ng6VarArr) {
                    if (ng6Var instanceof kg6) {
                        ((kg6) ng6Var).setActiveIndicatorExpandedPadding(rect);
                    }
                }
            }
            setItemActiveIndicatorColor(pb1.m19054x(context2, typedArrayObtainStyledAttributes, R$styleable.NavigationBarActiveIndicator_android_color));
            setItemActiveIndicatorShapeAppearance(r39.m20280g(context2, typedArrayObtainStyledAttributes.getResourceId(R$styleable.NavigationBarActiveIndicator_shapeAppearance, 0), 0).m19627a());
            typedArrayObtainStyledAttributes.recycle();
        }
        if (typedArray.hasValue(R$styleable.NavigationBarView_menu)) {
            int resourceId3 = typedArray.getResourceId(R$styleable.NavigationBarView_menu, 0);
            C1065b c1065b2 = this.f13060c;
            c1065b2.f13056b = true;
            getMenuInflater().inflate(resourceId3, this.f13058a);
            c1065b2.f13056b = false;
            c1065b2.mo703c(true);
        }
        sq5VarM10752e.m21582y();
        addView(this.f13059b);
        this.f13058a.f43041e = new or3((BottomNavigationView) this);
    }

    private MenuInflater getMenuInflater() {
        if (this.f13061d == null) {
            this.f13061d = new un9(getContext());
        }
        return this.f13061d;
    }

    private void setMeasureBottomPaddingFromLabelBaseline(boolean z) {
        this.f13059b.setMeasurePaddingFromLabelBaseline(z);
    }

    public int getActiveIndicatorLabelPadding() {
        return this.f13059b.getActiveIndicatorLabelPadding();
    }

    public int getCollapsedMaxItemCount() {
        return getMaxItemCount();
    }

    public int getHorizontalItemTextAppearanceActive() {
        return this.f13059b.getHorizontalItemTextAppearanceActive();
    }

    public int getHorizontalItemTextAppearanceInactive() {
        return this.f13059b.getHorizontalItemTextAppearanceInactive();
    }

    public int getIconLabelHorizontalSpacing() {
        return this.f13059b.getIconLabelHorizontalSpacing();
    }

    public ColorStateList getItemActiveIndicatorColor() {
        return this.f13059b.getItemActiveIndicatorColor();
    }

    public int getItemActiveIndicatorExpandedHeight() {
        return this.f13059b.getItemActiveIndicatorExpandedHeight();
    }

    public int getItemActiveIndicatorExpandedMarginHorizontal() {
        return this.f13059b.getItemActiveIndicatorExpandedMarginHorizontal();
    }

    public int getItemActiveIndicatorExpandedWidth() {
        return this.f13059b.getItemActiveIndicatorExpandedWidth();
    }

    public int getItemActiveIndicatorHeight() {
        return this.f13059b.getItemActiveIndicatorHeight();
    }

    public int getItemActiveIndicatorMarginHorizontal() {
        return this.f13059b.getItemActiveIndicatorMarginHorizontal();
    }

    public r39 getItemActiveIndicatorShapeAppearance() {
        return this.f13059b.getItemActiveIndicatorShapeAppearance();
    }

    public int getItemActiveIndicatorWidth() {
        return this.f13059b.getItemActiveIndicatorWidth();
    }

    public Drawable getItemBackground() {
        return this.f13059b.getItemBackground();
    }

    @Deprecated
    public int getItemBackgroundResource() {
        return this.f13059b.getItemBackgroundRes();
    }

    public int getItemGravity() {
        return this.f13059b.getItemGravity();
    }

    public int getItemIconGravity() {
        return this.f13059b.getItemIconGravity();
    }

    public int getItemIconSize() {
        return this.f13059b.getItemIconSize();
    }

    public ColorStateList getItemIconTintList() {
        return this.f13059b.getIconTintList();
    }

    public int getItemPaddingBottom() {
        return this.f13059b.getItemPaddingBottom();
    }

    public int getItemPaddingTop() {
        return this.f13059b.getItemPaddingTop();
    }

    public ColorStateList getItemRippleColor() {
        return this.f13059b.getItemRippleColor();
    }

    public int getItemTextAppearanceActive() {
        return this.f13059b.getItemTextAppearanceActive();
    }

    public int getItemTextAppearanceInactive() {
        return this.f13059b.getItemTextAppearanceInactive();
    }

    public ColorStateList getItemTextColor() {
        return this.f13059b.getItemTextColor();
    }

    public int getLabelVisibilityMode() {
        return this.f13059b.getLabelVisibilityMode();
    }

    public abstract int getMaxItemCount();

    public Menu getMenu() {
        return this.f13058a;
    }

    public ix5 getMenuView() {
        return this.f13059b;
    }

    public ViewGroup getMenuViewGroup() {
        return this.f13059b;
    }

    public C1065b getPresenter() {
        return this.f13060c;
    }

    public boolean getScaleLabelTextWithFont() {
        return this.f13059b.getScaleLabelTextWithFont();
    }

    public int getSelectedItemId() {
        return this.f13059b.getSelectedItemId();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        Drawable background = getBackground();
        if (background instanceof fs5) {
            AbstractC3184kh.m15200G(this, (fs5) background);
        }
    }

    @Override // android.view.View
    public final void onRestoreInstanceState(Parcelable parcelable) {
        Parcelable parcelable2;
        if (!(parcelable instanceof NavigationBarView$SavedState)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        NavigationBarView$SavedState navigationBarView$SavedState = (NavigationBarView$SavedState) parcelable;
        super.onRestoreInstanceState(navigationBarView$SavedState.f5563a);
        Bundle bundle = navigationBarView$SavedState.f13054c;
        CopyOnWriteArrayList<WeakReference> copyOnWriteArrayList = this.f13058a.f43057u;
        SparseArray sparseParcelableArray = bundle.getSparseParcelableArray("android:menu:presenters");
        if (sparseParcelableArray == null || copyOnWriteArrayList.isEmpty()) {
            return;
        }
        for (WeakReference weakReference : copyOnWriteArrayList) {
            ex5 ex5Var = (ex5) weakReference.get();
            if (ex5Var == null) {
                copyOnWriteArrayList.remove(weakReference);
            } else {
                int id = ex5Var.getId();
                if (id > 0 && (parcelable2 = (Parcelable) sparseParcelableArray.get(id)) != null) {
                    ex5Var.mo708h(parcelable2);
                }
            }
        }
    }

    @Override // android.view.View
    public final Parcelable onSaveInstanceState() {
        Parcelable parcelableMo713m;
        NavigationBarView$SavedState navigationBarView$SavedState = new NavigationBarView$SavedState(super.onSaveInstanceState());
        Bundle bundle = new Bundle();
        navigationBarView$SavedState.f13054c = bundle;
        CopyOnWriteArrayList<WeakReference> copyOnWriteArrayList = this.f13058a.f43057u;
        if (copyOnWriteArrayList.isEmpty()) {
            return navigationBarView$SavedState;
        }
        SparseArray<? extends Parcelable> sparseArray = new SparseArray<>();
        for (WeakReference weakReference : copyOnWriteArrayList) {
            ex5 ex5Var = (ex5) weakReference.get();
            if (ex5Var == null) {
                copyOnWriteArrayList.remove(weakReference);
            } else {
                int id = ex5Var.getId();
                if (id > 0 && (parcelableMo713m = ex5Var.mo713m()) != null) {
                    sparseArray.put(id, parcelableMo713m);
                }
            }
        }
        bundle.putSparseParcelableArray("android:menu:presenters", sparseArray);
        return navigationBarView$SavedState;
    }

    public void setActiveIndicatorLabelPadding(int i) {
        this.f13059b.setActiveIndicatorLabelPadding(i);
    }

    @Override // android.view.View
    public void setElevation(float f) {
        super.setElevation(f);
        Drawable background = getBackground();
        if (background instanceof fs5) {
            ((fs5) background).m12075s(f);
        }
    }

    public void setHorizontalItemTextAppearanceActive(int i) {
        this.f13059b.setHorizontalItemTextAppearanceActive(i);
    }

    public void setHorizontalItemTextAppearanceInactive(int i) {
        this.f13059b.setHorizontalItemTextAppearanceInactive(i);
    }

    public void setIconLabelHorizontalSpacing(int i) {
        this.f13059b.setIconLabelHorizontalSpacing(i);
    }

    public void setItemActiveIndicatorColor(ColorStateList colorStateList) {
        this.f13059b.setItemActiveIndicatorColor(colorStateList);
    }

    public void setItemActiveIndicatorEnabled(boolean z) {
        this.f13059b.setItemActiveIndicatorEnabled(z);
    }

    public void setItemActiveIndicatorExpandedHeight(int i) {
        this.f13059b.setItemActiveIndicatorExpandedHeight(i);
    }

    public void setItemActiveIndicatorExpandedMarginHorizontal(int i) {
        this.f13059b.setItemActiveIndicatorExpandedMarginHorizontal(i);
    }

    public void setItemActiveIndicatorExpandedWidth(int i) {
        this.f13059b.setItemActiveIndicatorExpandedWidth(i);
    }

    public void setItemActiveIndicatorHeight(int i) {
        this.f13059b.setItemActiveIndicatorHeight(i);
    }

    public void setItemActiveIndicatorMarginHorizontal(int i) {
        this.f13059b.setItemActiveIndicatorMarginHorizontal(i);
    }

    public void setItemActiveIndicatorShapeAppearance(r39 r39Var) {
        this.f13059b.setItemActiveIndicatorShapeAppearance(r39Var);
    }

    public void setItemActiveIndicatorWidth(int i) {
        this.f13059b.setItemActiveIndicatorWidth(i);
    }

    public void setItemBackground(Drawable drawable) {
        this.f13059b.setItemBackground(drawable);
    }

    public void setItemBackgroundResource(int i) {
        this.f13059b.setItemBackgroundRes(i);
    }

    public void setItemGravity(int i) {
        dg0 dg0Var = this.f13059b;
        if (dg0Var.getItemGravity() != i) {
            dg0Var.setItemGravity(i);
            this.f13060c.mo703c(false);
        }
    }

    public void setItemIconGravity(int i) {
        dg0 dg0Var = this.f13059b;
        if (dg0Var.getItemIconGravity() != i) {
            dg0Var.setItemIconGravity(i);
            this.f13060c.mo703c(false);
        }
    }

    public void setItemIconSize(int i) {
        this.f13059b.setItemIconSize(i);
    }

    public void setItemIconSizeRes(int i) {
        setItemIconSize(getResources().getDimensionPixelSize(i));
    }

    public void setItemIconTintList(ColorStateList colorStateList) {
        this.f13059b.setIconTintList(colorStateList);
    }

    public void setItemPaddingBottom(int i) {
        this.f13059b.setItemPaddingBottom(i);
    }

    public void setItemPaddingTop(int i) {
        this.f13059b.setItemPaddingTop(i);
    }

    public void setItemRippleColor(ColorStateList colorStateList) {
        this.f13059b.setItemRippleColor(colorStateList);
    }

    public void setItemTextAppearanceActive(int i) {
        this.f13059b.setItemTextAppearanceActive(i);
    }

    public void setItemTextAppearanceActiveBoldEnabled(boolean z) {
        this.f13059b.setItemTextAppearanceActiveBoldEnabled(z);
    }

    public void setItemTextAppearanceInactive(int i) {
        this.f13059b.setItemTextAppearanceInactive(i);
    }

    public void setItemTextColor(ColorStateList colorStateList) {
        this.f13059b.setItemTextColor(colorStateList);
    }

    public void setLabelFontScalingEnabled(boolean z) {
        this.f13059b.setLabelFontScalingEnabled(z);
    }

    public void setLabelMaxLines(int i) {
        this.f13059b.setLabelMaxLines(i);
    }

    public void setLabelVisibilityMode(int i) {
        dg0 dg0Var = this.f13059b;
        if (dg0Var.getLabelVisibilityMode() != i) {
            dg0Var.setLabelVisibilityMode(i);
            this.f13060c.mo703c(false);
        }
    }

    public void setOnItemReselectedListener(rg6 rg6Var) {
        this.f13063f = rg6Var;
    }

    public void setOnItemSelectedListener(sg6 sg6Var) {
        this.f13062e = sg6Var;
    }

    public void setSelectedItemId(int i) {
        lg6 lg6Var = this.f13058a;
        MenuItem menuItemFindItem = lg6Var.findItem(i);
        if (menuItemFindItem != null) {
            boolean zM13534q = lg6Var.m13534q(menuItemFindItem, this.f13060c, 0);
            if (menuItemFindItem.isCheckable()) {
                if (!zM13534q || menuItemFindItem.isChecked()) {
                    this.f13059b.setCheckedItem(menuItemFindItem);
                }
            }
        }
    }
}
