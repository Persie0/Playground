package com.google.android.material.slider;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: renamed from: com.google.android.material.slider.c */
/* JADX INFO: loaded from: classes2.dex */
public final class C1072c implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        return new RangeSlider.RangeSliderState(parcel);
    }

    @Override // android.os.Parcelable.Creator
    public final Object[] newArray(int i) {
        return new RangeSlider.RangeSliderState[i];
    }
}
