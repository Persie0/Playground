package com.google.android.material.checkbox;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: renamed from: com.google.android.material.checkbox.a */
/* JADX INFO: loaded from: classes2.dex */
public final class C1052a implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        MaterialCheckBox.SavedState savedState = new MaterialCheckBox.SavedState(parcel);
        savedState.f12851a = ((Integer) parcel.readValue(MaterialCheckBox.SavedState.class.getClassLoader())).intValue();
        return savedState;
    }

    @Override // android.os.Parcelable.Creator
    public final Object[] newArray(int i) {
        return new MaterialCheckBox.SavedState[i];
    }
}
