package com.facebook.login;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: renamed from: com.facebook.login.c */
/* JADX INFO: loaded from: classes2.dex */
public final class C0929c implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        parcel.getClass();
        DeviceAuthDialog.RequestState requestState = new DeviceAuthDialog.RequestState();
        requestState.f11431a = parcel.readString();
        requestState.f11432b = parcel.readString();
        requestState.f11433c = parcel.readString();
        requestState.f11434d = parcel.readLong();
        requestState.f11435e = parcel.readLong();
        return requestState;
    }

    @Override // android.os.Parcelable.Creator
    public final Object[] newArray(int i) {
        return new DeviceAuthDialog.RequestState[i];
    }
}
