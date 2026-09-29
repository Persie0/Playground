package com.google.android.gms.common.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import java.util.List;
import p000.C3670v2;
import p000.l70;

/* JADX INFO: loaded from: classes.dex */
public class TelemetryData extends AbstractSafeParcelable {
    public static final Parcelable.Creator<TelemetryData> CREATOR = new C3670v2(12);

    /* JADX INFO: renamed from: a */
    public final int f11726a;

    /* JADX INFO: renamed from: b */
    public List f11727b;

    public TelemetryData(int i, List list) {
        this.f11726a = i;
        this.f11727b = list;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iM15937a0 = l70.m15937a0(parcel, 20293);
        l70.m15935Z(parcel, 1, 4);
        parcel.writeInt(this.f11726a);
        l70.m15934Y(parcel, 2, this.f11727b);
        l70.m15939b0(parcel, iM15937a0);
    }
}
