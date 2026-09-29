package com.google.android.material.navigation;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.material.internal.ParcelableSparseArray;

/* JADX INFO: renamed from: com.google.android.material.navigation.a */
/* JADX INFO: loaded from: classes2.dex */
public final class C1064a implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        NavigationBarPresenter$SavedState navigationBarPresenter$SavedState = new NavigationBarPresenter$SavedState();
        navigationBarPresenter$SavedState.f13052a = parcel.readInt();
        navigationBarPresenter$SavedState.f13053b = (ParcelableSparseArray) parcel.readParcelable(NavigationBarPresenter$SavedState.class.getClassLoader());
        return navigationBarPresenter$SavedState;
    }

    @Override // android.os.Parcelable.Creator
    public final Object[] newArray(int i) {
        return new NavigationBarPresenter$SavedState[i];
    }
}
