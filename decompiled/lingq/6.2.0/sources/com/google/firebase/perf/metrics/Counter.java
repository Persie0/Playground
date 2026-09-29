package com.google.firebase.perf.metrics;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.concurrent.atomic.AtomicLong;
import p000.hfb;

/* JADX INFO: loaded from: classes.dex */
public class Counter implements Parcelable {
    public static final Parcelable.Creator<Counter> CREATOR = new hfb(6);

    /* JADX INFO: renamed from: a */
    public final String f13769a;

    /* JADX INFO: renamed from: b */
    public final AtomicLong f13770b;

    public Counter(Parcel parcel) {
        this.f13769a = parcel.readString();
        this.f13770b = new AtomicLong(parcel.readLong());
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f13769a);
        parcel.writeLong(this.f13770b.get());
    }

    public Counter(String str) {
        this.f13769a = str;
        this.f13770b = new AtomicLong(0L);
    }
}
