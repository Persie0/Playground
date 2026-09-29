package com.airbnb.lottie;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: renamed from: com.airbnb.lottie.a */
/* JADX INFO: loaded from: classes2.dex */
public final class C0867a implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        LottieAnimationView.SavedState savedState = new LottieAnimationView.SavedState(parcel);
        savedState.f10592a = parcel.readString();
        savedState.f10594c = parcel.readFloat();
        savedState.f10595d = parcel.readInt() == 1;
        savedState.f10596e = parcel.readString();
        savedState.f10597f = parcel.readInt();
        savedState.f10598g = parcel.readInt();
        return savedState;
    }

    @Override // android.os.Parcelable.Creator
    public final Object[] newArray(int i) {
        return new LottieAnimationView.SavedState[i];
    }
}
