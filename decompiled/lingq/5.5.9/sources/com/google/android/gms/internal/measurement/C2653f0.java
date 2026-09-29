package com.google.android.gms.internal.measurement;

import android.os.BadParcelableException;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
import android.support.v4.media.session.C0166e;

/* JADX INFO: renamed from: com.google.android.gms.internal.measurement.f0 */
/* JADX INFO: loaded from: classes.dex */
public final class C2653f0 {

    /* JADX INFO: renamed from: a */
    public static final ClassLoader f14186a = C2653f0.class.getClassLoader();

    /* JADX INFO: renamed from: a */
    public static Parcelable m7797a(Parcel parcel, Parcelable.Creator creator) {
        if (parcel.readInt() == 0) {
            return null;
        }
        return (Parcelable) creator.createFromParcel(parcel);
    }

    /* JADX INFO: renamed from: b */
    public static void m7798b(Parcel parcel) {
        int iDataAvail = parcel.dataAvail();
        if (iDataAvail > 0) {
            throw new BadParcelableException(C0166e.m761g("Parcel data not fully consumed, unread size: ", iDataAvail));
        }
    }

    /* JADX INFO: renamed from: c */
    public static void m7799c(Parcel parcel, Parcelable parcelable) {
        if (parcelable == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcelable.writeToParcel(parcel, 0);
        }
    }

    /* JADX INFO: renamed from: d */
    public static void m7800d(Parcel parcel, IInterface iInterface) {
        if (iInterface == null) {
            parcel.writeStrongBinder(null);
        } else {
            parcel.writeStrongBinder(iInterface.asBinder());
        }
    }
}
