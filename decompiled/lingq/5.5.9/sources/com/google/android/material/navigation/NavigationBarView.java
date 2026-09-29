package com.google.android.material.navigation;

import ad.AbstractC0060d;
import ad.C0059c;
import ae.C0062b;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.util.SparseArray;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.FrameLayout;
import androidx.appcompat.view.menu.InterfaceC0228j;
import androidx.appcompat.view.menu.InterfaceC0229k;
import androidx.appcompat.widget.C0300b1;
import androidx.customview.view.AbsSavedState;
import com.google.android.material.bottomnavigation.BottomNavigationView;
import com.linguist.R;
import gd.C5762a;
import gd.C5768g;
import gd.C5772k;
import java.lang.ref.WeakReference;
import java.util.WeakHashMap;
import java.util.concurrent.CopyOnWriteArrayList;
import lc.C7299b;
import md.C7542a;
import p072dd.C5150c;
import p153hc.C6031a;
import p164i.C6105f;
import p329q2.C8488a;
import p471x2.C10029b0;
import p471x2.C10049l0;
import p507yc.C10344k;

/* JADX INFO: loaded from: classes.dex */
public abstract class NavigationBarView extends FrameLayout {

    /* JADX INFO: renamed from: a */
    public final C0059c f15421a;

    /* JADX INFO: renamed from: b */
    public final AbstractC0060d f15422b;

    /* JADX INFO: renamed from: c */
    public final NavigationBarPresenter f15423c;

    /* JADX INFO: renamed from: d */
    public C6105f f15424d;

    /* JADX INFO: renamed from: e */
    public InterfaceC3044b f15425e;

    /* JADX INFO: renamed from: f */
    public InterfaceC3043a f15426f;

    public static class SavedState extends AbsSavedState {
        public static final Parcelable.Creator<SavedState> CREATOR = new C3042a();

        /* JADX INFO: renamed from: c */
        public Bundle f15427c;

        /* JADX INFO: renamed from: com.google.android.material.navigation.NavigationBarView$SavedState$a */
        public class C3042a implements Parcelable.ClassLoaderCreator<SavedState> {
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
            this.f15427c = parcel.readBundle(classLoader == null ? getClass().getClassLoader() : classLoader);
        }

        public SavedState(Parcelable parcelable) {
            super(parcelable);
        }

        @Override // androidx.customview.view.AbsSavedState, android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i10) {
            parcel.writeParcelable(this.f5635a, i10);
            parcel.writeBundle(this.f15427c);
        }
    }

    /* JADX INFO: renamed from: com.google.android.material.navigation.NavigationBarView$a */
    public interface InterfaceC3043a {
    }

    /* JADX INFO: renamed from: com.google.android.material.navigation.NavigationBarView$b */
    public interface InterfaceC3044b {
    }

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    public NavigationBarView(Context context, AttributeSet attributeSet) {
        super(C7542a.m15048a(context, attributeSet, R.attr.bottomNavigationStyle, R.style.Widget_Design_BottomNavigationView), attributeSet, R.attr.bottomNavigationStyle);
        NavigationBarPresenter navigationBarPresenter = new NavigationBarPresenter();
        this.f15423c = navigationBarPresenter;
        Context context2 = getContext();
        C0300b1 c0300b1M19358e = C10344k.m19358e(context2, attributeSet, C6031a.f35635D, R.attr.bottomNavigationStyle, R.style.Widget_Design_BottomNavigationView, 10, 9);
        C0059c c0059c = new C0059c(context2, getClass(), getMaxItemCount());
        this.f15421a = c0059c;
        C7299b c7299b = new C7299b(context2);
        this.f15422b = c7299b;
        navigationBarPresenter.f15416a = c7299b;
        navigationBarPresenter.f15418c = 1;
        c7299b.setPresenter(navigationBarPresenter);
        c0059c.m918b(navigationBarPresenter, c0059c.f693a);
        getContext();
        navigationBarPresenter.f15416a.f130a0 = c0059c;
        if (c0300b1M19358e.m1123l(5)) {
            c7299b.setIconTintList(c0300b1M19358e.m1113b(5));
        } else {
            c7299b.setIconTintList(c7299b.m238c());
        }
        setItemIconSize(c0300b1M19358e.m1115d(4, getResources().getDimensionPixelSize(R.dimen.mtrl_navigation_bar_item_default_icon_size)));
        if (c0300b1M19358e.m1123l(10)) {
            setItemTextAppearanceInactive(c0300b1M19358e.m1120i(10, 0));
        }
        if (c0300b1M19358e.m1123l(9)) {
            setItemTextAppearanceActive(c0300b1M19358e.m1120i(9, 0));
        }
        if (c0300b1M19358e.m1123l(11)) {
            setItemTextColor(c0300b1M19358e.m1113b(11));
        }
        if (getBackground() == null || (getBackground() instanceof ColorDrawable)) {
            C5768g c5768g = new C5768g();
            Drawable background = getBackground();
            if (background instanceof ColorDrawable) {
                c5768g.m12141m(ColorStateList.valueOf(((ColorDrawable) background).getColor()));
            }
            c5768g.m12138j(context2);
            WeakHashMap<View, C10049l0> weakHashMap = C10029b0.f50993a;
            C10029b0.d.m18680q(this, c5768g);
        }
        if (c0300b1M19358e.m1123l(7)) {
            setItemPaddingTop(c0300b1M19358e.m1115d(7, 0));
        }
        if (c0300b1M19358e.m1123l(6)) {
            setItemPaddingBottom(c0300b1M19358e.m1115d(6, 0));
        }
        if (c0300b1M19358e.m1123l(1)) {
            setElevation(c0300b1M19358e.m1115d(1, 0));
        }
        C8488a.b.m16570h(getBackground().mutate(), C5150c.m10926b(context2, c0300b1M19358e, 0));
        setLabelVisibilityMode(c0300b1M19358e.f1134b.getInteger(12, -1));
        int iM1120i = c0300b1M19358e.m1120i(3, 0);
        if (iM1120i != 0) {
            c7299b.setItemBackgroundRes(iM1120i);
        } else {
            setItemRippleColor(C5150c.m10926b(context2, c0300b1M19358e, 8));
        }
        int iM1120i2 = c0300b1M19358e.m1120i(2, 0);
        if (iM1120i2 != 0) {
            setItemActiveIndicatorEnabled(true);
            TypedArray typedArrayObtainStyledAttributes = context2.obtainStyledAttributes(iM1120i2, C6031a.f35634C);
            setItemActiveIndicatorWidth(typedArrayObtainStyledAttributes.getDimensionPixelSize(1, 0));
            setItemActiveIndicatorHeight(typedArrayObtainStyledAttributes.getDimensionPixelSize(0, 0));
            setItemActiveIndicatorMarginHorizontal(typedArrayObtainStyledAttributes.getDimensionPixelOffset(3, 0));
            setItemActiveIndicatorColor(C5150c.m10925a(context2, typedArrayObtainStyledAttributes, 2));
            setItemActiveIndicatorShapeAppearance(new C5772k(C5772k.m12149a(context2, typedArrayObtainStyledAttributes.getResourceId(4, 0), 0, new C5762a(0))));
            typedArrayObtainStyledAttributes.recycle();
        }
        if (c0300b1M19358e.m1123l(13)) {
            int iM1120i3 = c0300b1M19358e.m1120i(13, 0);
            navigationBarPresenter.f15417b = true;
            getMenuInflater().inflate(iM1120i3, c0059c);
            navigationBarPresenter.f15417b = false;
            navigationBarPresenter.mo896d(true);
        }
        c0300b1M19358e.m1124n();
        addView(c7299b);
        c0059c.f697e = new C3045a((BottomNavigationView) this);
    }

    private MenuInflater getMenuInflater() {
        if (this.f15424d == null) {
            this.f15424d = new C6105f(getContext());
        }
        return this.f15424d;
    }

    public ColorStateList getItemActiveIndicatorColor() {
        return this.f15422b.getItemActiveIndicatorColor();
    }

    public int getItemActiveIndicatorHeight() {
        return this.f15422b.getItemActiveIndicatorHeight();
    }

    public int getItemActiveIndicatorMarginHorizontal() {
        return this.f15422b.getItemActiveIndicatorMarginHorizontal();
    }

    public C5772k getItemActiveIndicatorShapeAppearance() {
        return this.f15422b.getItemActiveIndicatorShapeAppearance();
    }

    public int getItemActiveIndicatorWidth() {
        return this.f15422b.getItemActiveIndicatorWidth();
    }

    public Drawable getItemBackground() {
        return this.f15422b.getItemBackground();
    }

    @Deprecated
    public int getItemBackgroundResource() {
        return this.f15422b.getItemBackgroundRes();
    }

    public int getItemIconSize() {
        return this.f15422b.getItemIconSize();
    }

    public ColorStateList getItemIconTintList() {
        return this.f15422b.getIconTintList();
    }

    public int getItemPaddingBottom() {
        return this.f15422b.getItemPaddingBottom();
    }

    public int getItemPaddingTop() {
        return this.f15422b.getItemPaddingTop();
    }

    public ColorStateList getItemRippleColor() {
        return this.f15422b.getItemRippleColor();
    }

    public int getItemTextAppearanceActive() {
        return this.f15422b.getItemTextAppearanceActive();
    }

    public int getItemTextAppearanceInactive() {
        return this.f15422b.getItemTextAppearanceInactive();
    }

    public ColorStateList getItemTextColor() {
        return this.f15422b.getItemTextColor();
    }

    public int getLabelVisibilityMode() {
        return this.f15422b.getLabelVisibilityMode();
    }

    public abstract int getMaxItemCount();

    public Menu getMenu() {
        return this.f15421a;
    }

    public InterfaceC0229k getMenuView() {
        return this.f15422b;
    }

    public NavigationBarPresenter getPresenter() {
        return this.f15423c;
    }

    public int getSelectedItemId() {
        return this.f15422b.getSelectedItemId();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        C0062b.m335b2(this);
    }

    @Override // android.view.View
    public final void onRestoreInstanceState(Parcelable parcelable) {
        Parcelable parcelable2;
        if (!(parcelable instanceof SavedState)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        SavedState savedState = (SavedState) parcelable;
        super.onRestoreInstanceState(savedState.f5635a);
        Bundle bundle = savedState.f15427c;
        C0059c c0059c = this.f15421a;
        c0059c.getClass();
        SparseArray sparseParcelableArray = bundle.getSparseParcelableArray("android:menu:presenters");
        if (sparseParcelableArray != null) {
            CopyOnWriteArrayList<WeakReference<InterfaceC0228j>> copyOnWriteArrayList = c0059c.f713u;
            if (copyOnWriteArrayList.isEmpty()) {
                return;
            }
            for (WeakReference<InterfaceC0228j> weakReference : copyOnWriteArrayList) {
                InterfaceC0228j interfaceC0228j = weakReference.get();
                if (interfaceC0228j == null) {
                    copyOnWriteArrayList.remove(weakReference);
                } else {
                    int id2 = interfaceC0228j.getId();
                    if (id2 > 0 && (parcelable2 = (Parcelable) sparseParcelableArray.get(id2)) != null) {
                        interfaceC0228j.mo898i(parcelable2);
                    }
                }
            }
        }
    }

    @Override // android.view.View
    public final Parcelable onSaveInstanceState() {
        Parcelable parcelableMo901l;
        SavedState savedState = new SavedState(super.onSaveInstanceState());
        Bundle bundle = new Bundle();
        savedState.f15427c = bundle;
        CopyOnWriteArrayList<WeakReference<InterfaceC0228j>> copyOnWriteArrayList = this.f15421a.f713u;
        if (!copyOnWriteArrayList.isEmpty()) {
            SparseArray<? extends Parcelable> sparseArray = new SparseArray<>();
            loop0: while (true) {
                for (WeakReference<InterfaceC0228j> weakReference : copyOnWriteArrayList) {
                    InterfaceC0228j interfaceC0228j = weakReference.get();
                    if (interfaceC0228j == null) {
                        copyOnWriteArrayList.remove(weakReference);
                    } else {
                        int id2 = interfaceC0228j.getId();
                        if (id2 > 0 && (parcelableMo901l = interfaceC0228j.mo901l()) != null) {
                            sparseArray.put(id2, parcelableMo901l);
                        }
                    }
                }
                break loop0;
            }
            bundle.putSparseParcelableArray("android:menu:presenters", sparseArray);
        }
        return savedState;
    }

    @Override // android.view.View
    public void setElevation(float f3) {
        super.setElevation(f3);
        C0062b.m332a2(this, f3);
    }

    public void setItemActiveIndicatorColor(ColorStateList colorStateList) {
        this.f15422b.setItemActiveIndicatorColor(colorStateList);
    }

    public void setItemActiveIndicatorEnabled(boolean z10) {
        this.f15422b.setItemActiveIndicatorEnabled(z10);
    }

    public void setItemActiveIndicatorHeight(int i10) {
        this.f15422b.setItemActiveIndicatorHeight(i10);
    }

    public void setItemActiveIndicatorMarginHorizontal(int i10) {
        this.f15422b.setItemActiveIndicatorMarginHorizontal(i10);
    }

    public void setItemActiveIndicatorShapeAppearance(C5772k c5772k) {
        this.f15422b.setItemActiveIndicatorShapeAppearance(c5772k);
    }

    public void setItemActiveIndicatorWidth(int i10) {
        this.f15422b.setItemActiveIndicatorWidth(i10);
    }

    public void setItemBackground(Drawable drawable) {
        this.f15422b.setItemBackground(drawable);
    }

    public void setItemBackgroundResource(int i10) {
        this.f15422b.setItemBackgroundRes(i10);
    }

    public void setItemIconSize(int i10) {
        this.f15422b.setItemIconSize(i10);
    }

    public void setItemIconSizeRes(int i10) {
        setItemIconSize(getResources().getDimensionPixelSize(i10));
    }

    public void setItemIconTintList(ColorStateList colorStateList) {
        this.f15422b.setIconTintList(colorStateList);
    }

    public void setItemPaddingBottom(int i10) {
        this.f15422b.setItemPaddingBottom(i10);
    }

    public void setItemPaddingTop(int i10) {
        this.f15422b.setItemPaddingTop(i10);
    }

    public void setItemRippleColor(ColorStateList colorStateList) {
        this.f15422b.setItemRippleColor(colorStateList);
    }

    public void setItemTextAppearanceActive(int i10) {
        this.f15422b.setItemTextAppearanceActive(i10);
    }

    public void setItemTextAppearanceInactive(int i10) {
        this.f15422b.setItemTextAppearanceInactive(i10);
    }

    public void setItemTextColor(ColorStateList colorStateList) {
        this.f15422b.setItemTextColor(colorStateList);
    }

    public void setLabelVisibilityMode(int i10) {
        AbstractC0060d abstractC0060d = this.f15422b;
        if (abstractC0060d.getLabelVisibilityMode() != i10) {
            abstractC0060d.setLabelVisibilityMode(i10);
            this.f15423c.mo896d(false);
        }
    }

    public void setOnItemReselectedListener(InterfaceC3043a interfaceC3043a) {
        this.f15426f = interfaceC3043a;
    }

    public void setOnItemSelectedListener(InterfaceC3044b interfaceC3044b) {
        this.f15425e = interfaceC3044b;
    }

    public void setSelectedItemId(int i10) {
        C0059c c0059c = this.f15421a;
        MenuItem menuItemFindItem = c0059c.findItem(i10);
        if (menuItemFindItem == null || c0059c.m933q(menuItemFindItem, this.f15423c, 0)) {
            return;
        }
        menuItemFindItem.setChecked(true);
    }
}
