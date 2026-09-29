package com.google.android.material.search;

import ae.C0062b;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.drawable.Drawable;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.TextView;
import androidx.appcompat.widget.Toolbar;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.customview.view.AbsSavedState;
import com.google.android.material.appbar.AppBarLayout;
import java.util.WeakHashMap;
import p471x2.C10029b0;
import p471x2.C10049l0;
import p507yc.C10345l;

/* JADX INFO: loaded from: classes.dex */
public final class SearchBar extends Toolbar {

    /* JADX INFO: renamed from: s0 */
    public Drawable f15431s0;

    /* JADX INFO: renamed from: t0 */
    public int f15432t0;

    /* JADX INFO: renamed from: u0 */
    public boolean f15433u0;

    public static class SavedState extends AbsSavedState {
        public static final Parcelable.Creator<SavedState> CREATOR = new C3046a();

        /* JADX INFO: renamed from: c */
        public String f15434c;

        /* JADX INFO: renamed from: com.google.android.material.search.SearchBar$SavedState$a */
        public class C3046a implements Parcelable.ClassLoaderCreator<SavedState> {
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
            this.f15434c = parcel.readString();
        }

        public SavedState(Toolbar.SavedState savedState) {
            super(savedState);
        }

        @Override // androidx.customview.view.AbsSavedState, android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i10) {
            parcel.writeParcelable(this.f5635a, i10);
            parcel.writeString(this.f15434c);
        }
    }

    public static class ScrollingViewBehavior extends AppBarLayout.ScrollingViewBehavior {

        /* JADX INFO: renamed from: g */
        public boolean f15435g;

        public ScrollingViewBehavior() {
            this.f15435g = false;
        }

        public ScrollingViewBehavior(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            this.f15435g = false;
        }

        @Override // com.google.android.material.appbar.AppBarLayout.ScrollingViewBehavior, androidx.coordinatorlayout.widget.CoordinatorLayout.AbstractC0768c
        /* JADX INFO: renamed from: d */
        public final boolean mo2938d(CoordinatorLayout coordinatorLayout, View view, View view2) {
            super.mo2938d(coordinatorLayout, view, view2);
            if (!this.f15435g && (view2 instanceof AppBarLayout)) {
                this.f15435g = true;
                AppBarLayout appBarLayout = (AppBarLayout) view2;
                appBarLayout.setBackgroundColor(0);
                appBarLayout.setTargetElevation(0.0f);
            }
            return false;
        }
    }

    private void setNavigationIconDecorative(boolean z10) {
        ImageButton imageButtonM19359a = C10345l.m19359a(this);
        if (imageButtonM19359a == null) {
            return;
        }
        imageButtonM19359a.setClickable(!z10);
        imageButtonM19359a.setFocusable(!z10);
        Drawable background = imageButtonM19359a.getBackground();
        if (background != null) {
            this.f15431s0 = background;
        }
        imageButtonM19359a.setBackgroundDrawable(z10 ? null : this.f15431s0);
    }

    @Override // android.view.ViewGroup
    public final void addView(View view, int i10, ViewGroup.LayoutParams layoutParams) {
        super.addView(view, i10, layoutParams);
    }

    public View getCenterView() {
        return null;
    }

    public float getCompatElevation() {
        WeakHashMap<View, C10049l0> weakHashMap = C10029b0.f50993a;
        return C10029b0.i.m18715i(this);
    }

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    public float getCornerSize() {
        throw null;
    }

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    public CharSequence getHint() {
        throw null;
    }

    public int getMenuResId() {
        return this.f15432t0;
    }

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    public int getStrokeColor() {
        throw null;
    }

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    public float getStrokeWidth() {
        throw null;
    }

    public CharSequence getText() {
        throw null;
    }

    public TextView getTextView() {
        return null;
    }

    @Override // androidx.appcompat.widget.Toolbar
    /* JADX INFO: renamed from: k */
    public final void mo1059k(int i10) {
        super.mo1059k(i10);
        this.f15432t0 = i10;
    }

    @Override // androidx.appcompat.widget.Toolbar, android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        C0062b.m338c2(this, null);
        throw null;
    }

    @Override // android.view.View
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setClassName(EditText.class.getCanonicalName());
        CharSequence text = getText();
        boolean zIsEmpty = TextUtils.isEmpty(text);
        accessibilityNodeInfo.setHintText(getHint());
        accessibilityNodeInfo.setShowingHintText(zIsEmpty);
        if (zIsEmpty) {
            text = getHint();
        }
        accessibilityNodeInfo.setText(text);
    }

    @Override // androidx.appcompat.widget.Toolbar, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        super.onLayout(z10, i10, i11, i12, i13);
    }

    @Override // androidx.appcompat.widget.Toolbar, android.view.View
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(i10, i11);
    }

    @Override // androidx.appcompat.widget.Toolbar, android.view.View
    public final void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof SavedState)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        SavedState savedState = (SavedState) parcelable;
        super.onRestoreInstanceState(savedState.f5635a);
        setText(savedState.f15434c);
    }

    @Override // androidx.appcompat.widget.Toolbar, android.view.View
    public final Parcelable onSaveInstanceState() {
        SavedState savedState = new SavedState((Toolbar.SavedState) super.onSaveInstanceState());
        CharSequence text = getText();
        savedState.f15434c = text == null ? null : text.toString();
        return savedState;
    }

    public void setCenterView(View view) {
        if (view != null) {
            addView(view);
        }
    }

    public void setDefaultScrollFlagsEnabled(boolean z10) {
        this.f15433u0 = z10;
        if (getLayoutParams() instanceof AppBarLayout.C2941d) {
            AppBarLayout.C2941d c2941d = (AppBarLayout.C2941d) getLayoutParams();
            if (this.f15433u0) {
                if (c2941d.f14701a == 0) {
                    c2941d.f14701a = 53;
                }
            } else if (c2941d.f14701a == 53) {
                c2941d.f14701a = 0;
            }
        }
    }

    @Override // android.view.View
    public void setElevation(float f3) {
        super.setElevation(f3);
    }

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    public void setHint(int i10) {
        throw null;
    }

    public void setHint(CharSequence charSequence) {
        throw null;
    }

    @Override // androidx.appcompat.widget.Toolbar
    public void setNavigationIcon(Drawable drawable) {
        super.setNavigationIcon(drawable);
    }

    @Override // androidx.appcompat.widget.Toolbar
    public void setNavigationOnClickListener(View.OnClickListener onClickListener) {
        super.setNavigationOnClickListener(onClickListener);
        setNavigationIconDecorative(onClickListener == null);
    }

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    public void setOnLoadAnimationFadeInEnabled(boolean z10) {
        throw null;
    }

    public void setStrokeColor(int i10) {
        if (getStrokeColor() == i10) {
            return;
        }
        ColorStateList.valueOf(i10);
        throw null;
    }

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    public void setStrokeWidth(float f3) {
        if (getStrokeWidth() != f3) {
            throw null;
        }
    }

    @Override // androidx.appcompat.widget.Toolbar
    public void setSubtitle(CharSequence charSequence) {
    }

    public void setText(int i10) {
        throw null;
    }

    public void setText(CharSequence charSequence) {
        throw null;
    }

    @Override // androidx.appcompat.widget.Toolbar
    public void setTitle(CharSequence charSequence) {
    }
}
