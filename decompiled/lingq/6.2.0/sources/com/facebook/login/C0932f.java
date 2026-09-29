package com.facebook.login;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: renamed from: com.facebook.login.f */
/* JADX INFO: loaded from: classes2.dex */
public final class C0932f implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        parcel.getClass();
        return new LoginClient.Request(parcel);
    }

    @Override // android.os.Parcelable.Creator
    public final Object[] newArray(int i) {
        return new LoginClient.Request[i];
    }
}
