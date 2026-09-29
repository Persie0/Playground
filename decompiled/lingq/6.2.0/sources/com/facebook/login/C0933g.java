package com.facebook.login;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: renamed from: com.facebook.login.g */
/* JADX INFO: loaded from: classes2.dex */
public final class C0933g implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        parcel.getClass();
        return new LoginClient.Result(parcel);
    }

    @Override // android.os.Parcelable.Creator
    public final Object[] newArray(int i) {
        return new LoginClient.Result[i];
    }
}
