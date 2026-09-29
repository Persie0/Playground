package com.google.android.material.search;

import ae.C0062b;
import android.annotation.SuppressLint;
import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.Editable;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.TextView;
import androidx.appcompat.widget.Toolbar;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.customview.view.AbsSavedState;
import com.linguist.R;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashSet;

/* JADX INFO: loaded from: classes.dex */
public final class SearchView extends FrameLayout implements CoordinatorLayout.InterfaceC0767b {

    /* JADX INFO: renamed from: a */
    public SearchBar f15436a;

    /* JADX INFO: renamed from: b */
    public int f15437b;

    /* JADX INFO: renamed from: c */
    public TransitionState f15438c;

    public static class Behavior extends CoordinatorLayout.AbstractC0768c<SearchView> {
        public Behavior() {
        }

        public Behavior(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
        }

        @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.AbstractC0768c
        /* JADX INFO: renamed from: d */
        public final boolean mo2938d(CoordinatorLayout coordinatorLayout, View view, View view2) {
            SearchView searchView = (SearchView) view;
            if (!(searchView.f15436a != null) && (view2 instanceof SearchBar)) {
                searchView.setupWithSearchBar((SearchBar) view2);
            }
            return false;
        }
    }

    public static class SavedState extends AbsSavedState {
        public static final Parcelable.Creator<SavedState> CREATOR = new C3047a();

        /* JADX INFO: renamed from: c */
        public String f15439c;

        /* JADX INFO: renamed from: d */
        public int f15440d;

        /* JADX INFO: renamed from: com.google.android.material.search.SearchView$SavedState$a */
        public class C3047a implements Parcelable.ClassLoaderCreator<SavedState> {
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
            this.f15439c = parcel.readString();
            this.f15440d = parcel.readInt();
        }

        public SavedState(Parcelable parcelable) {
            super(parcelable);
        }

        @Override // androidx.customview.view.AbsSavedState, android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i10) {
            parcel.writeParcelable(this.f5635a, i10);
            parcel.writeString(this.f15439c);
            parcel.writeInt(this.f15440d);
        }
    }

    public enum TransitionState {
        HIDING,
        HIDDEN,
        SHOWING,
        SHOWN
    }

    /* JADX INFO: renamed from: com.google.android.material.search.SearchView$a */
    public interface InterfaceC3048a {
        /* JADX INFO: renamed from: a */
        void m8808a();
    }

    /* JADX WARN: Code duplicated, block: B:11:0x0021  */
    /* JADX WARN: Code duplicated, block: B:12:0x0023  */
    private Window getActivityWindow() {
        Activity activity;
        for (Context context = getContext(); context instanceof ContextWrapper; context = ((ContextWrapper) context).getBaseContext()) {
            if (context instanceof Activity) {
                activity = (Activity) context;
                if (activity == null) {
                    return null;
                }
                return activity.getWindow();
            }
        }
        activity = null;
        if (activity == null) {
            return null;
        }
        return activity.getWindow();
    }

    private float getOverlayElevation() {
        SearchBar searchBar = this.f15436a;
        return searchBar != null ? searchBar.getCompatElevation() : getResources().getDimension(R.dimen.m3_searchview_elevation);
    }

    private int getStatusBarHeight() {
        int identifier = getResources().getIdentifier("status_bar_height", "dimen", "android");
        if (identifier > 0) {
            return getResources().getDimensionPixelSize(identifier);
        }
        return 0;
    }

    private void setStatusBarSpacerEnabledInternal(boolean z10) {
        throw null;
    }

    private void setUpBackgroundViewElevationOverlay(float f3) {
    }

    private void setUpHeaderLayout(int i10) {
        if (i10 == -1) {
            return;
        }
        LayoutInflater.from(getContext()).inflate(i10, (ViewGroup) null, false);
        throw null;
    }

    private void setUpStatusBarSpacer(int i10) {
        throw null;
    }

    @Override // android.view.ViewGroup
    public final void addView(View view, int i10, ViewGroup.LayoutParams layoutParams) {
        super.addView(view, i10, layoutParams);
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.InterfaceC0767b
    public CoordinatorLayout.AbstractC0768c<SearchView> getBehavior() {
        return new Behavior();
    }

    public TransitionState getCurrentTransitionState() {
        return this.f15438c;
    }

    public EditText getEditText() {
        return null;
    }

    public CharSequence getHint() {
        throw null;
    }

    public TextView getSearchPrefix() {
        return null;
    }

    public CharSequence getSearchPrefixText() {
        throw null;
    }

    @SuppressLint({"KotlinPropertyAccess"})
    public int getSoftInputMode() {
        return this.f15437b;
    }

    @SuppressLint({"KotlinPropertyAccess"})
    public Editable getText() {
        throw null;
    }

    public Toolbar getToolbar() {
        return null;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        C0062b.m335b2(this);
    }

    @Override // android.view.View
    public final void onFinishInflate() {
        super.onFinishInflate();
        Window activityWindow = getActivityWindow();
        if (activityWindow != null) {
            this.f15437b = activityWindow.getAttributes().softInputMode;
        }
    }

    @Override // android.view.View
    public final void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof SavedState)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        SavedState savedState = (SavedState) parcelable;
        super.onRestoreInstanceState(savedState.f5635a);
        setText(savedState.f15439c);
        setVisible(savedState.f15440d == 0);
    }

    @Override // android.view.View
    public final Parcelable onSaveInstanceState() {
        SavedState savedState = new SavedState(super.onSaveInstanceState());
        Editable text = getText();
        savedState.f15439c = text == null ? null : text.toString();
        throw null;
    }

    public void setAnimatedNavigationIcon(boolean z10) {
    }

    public void setAutoShowKeyboard(boolean z10) {
    }

    @Override // android.view.View
    public void setElevation(float f3) {
        super.setElevation(f3);
        setUpBackgroundViewElevationOverlay(f3);
    }

    public void setHint(int i10) {
        throw null;
    }

    public void setHint(CharSequence charSequence) {
        throw null;
    }

    public void setMenuItemsAnimated(boolean z10) {
    }

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    public void setModalForAccessibility(boolean z10) {
        ViewGroup viewGroup = (ViewGroup) getRootView();
        if (z10) {
            new HashMap(viewGroup.getChildCount());
        }
        for (int i10 = 0; i10 < viewGroup.getChildCount(); i10++) {
            if (viewGroup.getChildAt(i10) != this) {
                throw null;
            }
        }
    }

    public void setOnMenuItemClickListener(Toolbar.InterfaceC0293h interfaceC0293h) {
        throw null;
    }

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    public void setSearchPrefixText(CharSequence charSequence) {
        throw null;
    }

    public void setStatusBarSpacerEnabled(boolean z10) {
        setStatusBarSpacerEnabledInternal(z10);
    }

    public void setText(int i10) {
        throw null;
    }

    @SuppressLint({"KotlinPropertyAccess"})
    public void setText(CharSequence charSequence) {
        throw null;
    }

    public void setToolbarTouchscreenBlocksFocus(boolean z10) {
        throw null;
    }

    public void setTransitionState(TransitionState transitionState) {
        if (this.f15438c.equals(transitionState)) {
            return;
        }
        this.f15438c = transitionState;
        Iterator it = new LinkedHashSet((Collection) null).iterator();
        while (it.hasNext()) {
            ((InterfaceC3048a) it.next()).m8808a();
        }
    }

    public void setUseWindowInsetsController(boolean z10) {
    }

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    public void setVisible(boolean z10) {
        throw null;
    }

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    public void setupWithSearchBar(SearchBar searchBar) {
        this.f15436a = searchBar;
        throw null;
    }
}
