package com.google.android.gms.internal.measurement;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import p000.C3670v2;
import p000.l70;

/* JADX INFO: loaded from: classes.dex */
public final class zzdb extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzdb> CREATOR = new C3670v2(20);

    /* JADX INFO: renamed from: a */
    public final long f11874a;

    /* JADX INFO: renamed from: b */
    public final long f11875b;

    /* JADX INFO: renamed from: c */
    public final boolean f11876c;

    /* JADX INFO: renamed from: d */
    public final Bundle f11877d;

    /* JADX INFO: renamed from: e */
    public final String f11878e;

    public zzdb(long j, long j2, boolean z, Bundle bundle, String str) {
        this.f11874a = j;
        this.f11875b = j2;
        this.f11876c = z;
        this.f11877d = bundle;
        this.f11878e = str;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iM15937a0 = l70.m15937a0(parcel, 20293);
        l70.m15935Z(parcel, 1, 8);
        parcel.writeLong(this.f11874a);
        l70.m15935Z(parcel, 2, 8);
        parcel.writeLong(this.f11875b);
        l70.m15935Z(parcel, 3, 4);
        parcel.writeInt(this.f11876c ? 1 : 0);
        l70.m15924O(parcel, 7, this.f11877d);
        l70.m15930U(parcel, 8, this.f11878e);
        l70.m15939b0(parcel, iM15937a0);
    }
}
