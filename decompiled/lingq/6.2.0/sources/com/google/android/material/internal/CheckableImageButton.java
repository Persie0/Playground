package com.google.android.material.internal;

import android.R;
import android.content.Context;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.View;
import android.widget.Checkable;
import androidx.appcompat.R$attr;
import androidx.customview.view.AbsSavedState;
import p000.C3010fq;
import p000.dta;
import p000.f01;
import p000.og0;

/* JADX INFO: loaded from: classes2.dex */
public class CheckableImageButton extends C3010fq implements Checkable {

    /* JADX INFO: renamed from: h */
    public static final int[] f13017h = {R.attr.state_checked};

    /* JADX INFO: renamed from: d */
    public boolean f13018d;

    /* JADX INFO: renamed from: e */
    public boolean f13019e;

    /* JADX INFO: renamed from: f */
    public boolean f13020f;

    /* JADX INFO: renamed from: g */
    public f01 f13021g;

    public static class SavedState extends AbsSavedState {
        public static final Parcelable.Creator<SavedState> CREATOR = new C1063a();

        /* JADX INFO: renamed from: c */
        public boolean f13022c;

        public SavedState(Parcel parcel, ClassLoader classLoader) {
            super(parcel, classLoader);
            this.f13022c = parcel.readInt() == 1;
        }

        @Override // androidx.customview.view.AbsSavedState, android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            super.writeToParcel(parcel, i);
            parcel.writeInt(this.f13022c ? 1 : 0);
        }
    }

    public CheckableImageButton(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f13019e = true;
        this.f13020f = true;
        dta.m10640k(this, new og0(this, 1));
    }

    @Override // android.widget.Checkable
    public final boolean isChecked() {
        return this.f13018d;
    }

    @Override // android.widget.ImageView, android.view.View
    public final int[] onCreateDrawableState(int i) {
        return this.f13018d ? View.mergeDrawableStates(super.onCreateDrawableState(i + 1), f13017h) : super.onCreateDrawableState(i);
    }

    @Override // android.widget.ImageView, android.view.View
    public final void onDetachedFromWindow() {
        this.f13021g = null;
        super.onDetachedFromWindow();
    }

    @Override // android.view.View
    public final void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof SavedState)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        SavedState savedState = (SavedState) parcelable;
        super.onRestoreInstanceState(savedState.f5563a);
        setChecked(savedState.f13022c);
    }

    @Override // android.view.View
    public final Parcelable onSaveInstanceState() {
        SavedState savedState = new SavedState(super.onSaveInstanceState());
        savedState.f13022c = this.f13018d;
        return savedState;
    }

    public void setCheckable(boolean z) {
        if (this.f13019e != z) {
            this.f13019e = z;
            sendAccessibilityEvent(0);
        }
    }

    @Override // android.widget.Checkable
    public void setChecked(boolean z) {
        if (!this.f13019e || this.f13018d == z) {
            return;
        }
        this.f13018d = z;
        refreshDrawableState();
        sendAccessibilityEvent(2048);
    }

    @Override // android.view.View
    public void setFocusable(boolean z) {
        f01 f01Var;
        boolean zIsFocusable = isFocusable();
        super.setFocusable(z);
        if (zIsFocusable == z || (f01Var = this.f13021g) == null) {
            return;
        }
        f01Var.mo10700b();
    }

    public void setOnFocusableChangedListener(f01 f01Var) {
        this.f13021g = f01Var;
    }

    public void setPressable(boolean z) {
        this.f13020f = z;
    }

    @Override // android.view.View
    public void setPressed(boolean z) {
        if (this.f13020f) {
            super.setPressed(z);
        }
    }

    @Override // android.widget.Checkable
    public final void toggle() {
        setChecked(!this.f13018d);
    }

    public CheckableImageButton(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, R$attr.imageButtonStyle);
    }

    public CheckableImageButton(Context context) {
        this(context, null);
    }
}
