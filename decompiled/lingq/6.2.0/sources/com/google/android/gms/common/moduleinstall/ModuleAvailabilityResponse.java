package com.google.android.gms.common.moduleinstall;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import p000.l70;
import p000.y3a;

/* JADX INFO: loaded from: classes2.dex */
public class ModuleAvailabilityResponse extends AbstractSafeParcelable {
    public static final Parcelable.Creator<ModuleAvailabilityResponse> CREATOR = new y3a(5);

    /* JADX INFO: renamed from: a */
    public final boolean f11747a;

    /* JADX INFO: renamed from: b */
    public final int f11748b;

    public ModuleAvailabilityResponse(int i, boolean z) {
        this.f11747a = z;
        this.f11748b = i;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iM15937a0 = l70.m15937a0(parcel, 20293);
        l70.m15935Z(parcel, 1, 4);
        parcel.writeInt(this.f11747a ? 1 : 0);
        l70.m15935Z(parcel, 2, 4);
        parcel.writeInt(this.f11748b);
        l70.m15939b0(parcel, iM15937a0);
    }
}
