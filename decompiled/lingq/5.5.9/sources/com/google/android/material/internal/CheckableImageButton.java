package com.google.android.material.internal;

import android.R;
import android.content.Context;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.View;
import android.widget.Checkable;
import androidx.appcompat.widget.C0326l;
import androidx.customview.view.AbsSavedState;
import p471x2.C10029b0;
import p507yc.C10334a;

/* JADX INFO: loaded from: classes.dex */
public class CheckableImageButton extends C0326l implements Checkable {

    /* JADX INFO: renamed from: g */
    public static final int[] f15328g = {R.attr.state_checked};

    /* JADX INFO: renamed from: d */
    public boolean f15329d;

    /* JADX INFO: renamed from: e */
    public boolean f15330e;

    /* JADX INFO: renamed from: f */
    public boolean f15331f;

    public static class SavedState extends AbsSavedState {
        public static final Parcelable.Creator<SavedState> CREATOR = new C3037a();

        /* JADX INFO: renamed from: c */
        public boolean f15332c;

        /* JADX INFO: renamed from: com.google.android.material.internal.CheckableImageButton$SavedState$a */
        public class C3037a implements Parcelable.ClassLoaderCreator<SavedState> {
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
            this.f15332c = parcel.readInt() != 1 ? false : true;
        }

        public SavedState(Parcelable parcelable) {
            super(parcelable);
        }

        @Override // androidx.customview.view.AbsSavedState, android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i10) {
            parcel.writeParcelable(this.f5635a, i10);
            parcel.writeInt(this.f15332c ? 1 : 0);
        }
    }

    public CheckableImageButton(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, com.linguist.R.attr.imageButtonStyle);
        this.f15330e = true;
        this.f15331f = true;
        C10029b0.m18658n(this, new C10334a(this));
    }

    @Override // android.widget.Checkable
    public final boolean isChecked() {
        return this.f15329d;
    }

    @Override // android.widget.ImageView, android.view.View
    public final int[] onCreateDrawableState(int i10) {
        return this.f15329d ? View.mergeDrawableStates(super.onCreateDrawableState(i10 + 1), f15328g) : super.onCreateDrawableState(i10);
    }

    @Override // android.view.View
    public final void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof SavedState)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        SavedState savedState = (SavedState) parcelable;
        super.onRestoreInstanceState(savedState.f5635a);
        setChecked(savedState.f15332c);
    }

    @Override // android.view.View
    public final Parcelable onSaveInstanceState() {
        SavedState savedState = new SavedState(super.onSaveInstanceState());
        savedState.f15332c = this.f15329d;
        return savedState;
    }

    public void setCheckable(boolean z10) {
        if (this.f15330e != z10) {
            this.f15330e = z10;
            sendAccessibilityEvent(0);
        }
    }

    @Override // android.widget.Checkable
    public void setChecked(boolean z10) {
        if (this.f15330e && this.f15329d != z10) {
            this.f15329d = z10;
            refreshDrawableState();
            sendAccessibilityEvent(2048);
        }
    }

    public void setPressable(boolean z10) {
        this.f15331f = z10;
    }

    @Override // android.view.View
    public void setPressed(boolean z10) {
        if (this.f15331f) {
            super.setPressed(z10);
        }
    }

    @Override // android.widget.Checkable
    public final void toggle() {
        setChecked(!this.f15329d);
    }
}
