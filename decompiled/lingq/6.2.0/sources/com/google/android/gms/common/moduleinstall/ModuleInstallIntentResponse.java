package com.google.android.gms.common.moduleinstall;

import android.app.PendingIntent;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import p000.l70;
import p000.y3a;

/* JADX INFO: loaded from: classes2.dex */
public class ModuleInstallIntentResponse extends AbstractSafeParcelable {
    public static final Parcelable.Creator<ModuleInstallIntentResponse> CREATOR = new y3a(6);

    /* JADX INFO: renamed from: a */
    public final PendingIntent f11749a;

    public ModuleInstallIntentResponse(PendingIntent pendingIntent) {
        this.f11749a = pendingIntent;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iM15937a0 = l70.m15937a0(parcel, 20293);
        l70.m15929T(parcel, 1, this.f11749a, i);
        l70.m15939b0(parcel, iM15937a0);
    }
}
