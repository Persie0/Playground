package com.google.firebase.messaging;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;

/* JADX INFO: renamed from: com.google.firebase.messaging.s */
/* JADX INFO: loaded from: classes.dex */
public final class C3256s implements Parcelable.Creator<RemoteMessage> {
    @Override // android.os.Parcelable.Creator
    public final RemoteMessage createFromParcel(Parcel parcel) {
        int iM7609m = SafeParcelReader.m7609m(parcel);
        Bundle bundleM7597a = null;
        while (parcel.dataPosition() < iM7609m) {
            int i10 = parcel.readInt();
            if (((char) i10) != 2) {
                SafeParcelReader.m7608l(parcel, i10);
            } else {
                bundleM7597a = SafeParcelReader.m7597a(parcel, i10);
            }
        }
        SafeParcelReader.m7602f(parcel, iM7609m);
        return new RemoteMessage(bundleM7597a);
    }

    @Override // android.os.Parcelable.Creator
    public final RemoteMessage[] newArray(int i10) {
        return new RemoteMessage[i10];
    }
}
