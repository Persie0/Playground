package com.google.mlkit.vision.documentscanner;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes2.dex */
final class zzi extends zzc {
    public static final Parcelable.Creator<zzi> CREATOR = new C1175c();

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeParcelable(this.f13919a, i);
        parcel.writeInt(this.f13920b);
    }
}
