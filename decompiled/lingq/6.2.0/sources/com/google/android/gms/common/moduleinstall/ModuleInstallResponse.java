package com.google.android.gms.common.moduleinstall;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import p000.l70;
import p000.y3a;

/* JADX INFO: loaded from: classes2.dex */
public class ModuleInstallResponse extends AbstractSafeParcelable {
    public static final Parcelable.Creator<ModuleInstallResponse> CREATOR = new y3a(10);

    /* JADX INFO: renamed from: a */
    public final int f11750a;

    /* JADX INFO: renamed from: b */
    public final boolean f11751b;

    public ModuleInstallResponse(int i, boolean z) {
        this.f11750a = i;
        this.f11751b = z;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iM15937a0 = l70.m15937a0(parcel, 20293);
        l70.m15935Z(parcel, 1, 4);
        parcel.writeInt(this.f11750a);
        l70.m15935Z(parcel, 2, 4);
        parcel.writeInt(this.f11751b ? 1 : 0);
        l70.m15939b0(parcel, iM15937a0);
    }
}
