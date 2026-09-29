package com.facebook;

import android.os.Parcel;
import android.os.Parcelable;
import p000.hfb;
import p000.sy2;

/* JADX INFO: loaded from: classes.dex */
public final class GraphRequest$ParcelableResourceWithMimeType<RESOURCE extends Parcelable> implements Parcelable {
    public static final Parcelable.Creator<GraphRequest$ParcelableResourceWithMimeType<?>> CREATOR = new hfb(12);

    /* JADX INFO: renamed from: a */
    public final String f11367a;

    /* JADX INFO: renamed from: b */
    public final Parcelable f11368b;

    public GraphRequest$ParcelableResourceWithMimeType(Parcel parcel) {
        this.f11367a = parcel.readString();
        this.f11368b = parcel.readParcelable(sy2.m21766a().getClassLoader());
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 1;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.getClass();
        parcel.writeString(this.f11367a);
        parcel.writeParcelable(this.f11368b, i);
    }

    public GraphRequest$ParcelableResourceWithMimeType(Parcelable parcelable) {
        this.f11367a = "image/png";
        this.f11368b = parcelable;
    }
}
