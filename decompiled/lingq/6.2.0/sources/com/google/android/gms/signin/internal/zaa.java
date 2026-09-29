package com.google.android.gms.signin.internal;

import android.content.Intent;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import p000.l70;
import p000.q88;
import p000.y3a;

/* JADX INFO: loaded from: classes2.dex */
public final class zaa extends AbstractSafeParcelable implements q88 {
    public static final Parcelable.Creator<zaa> CREATOR = new y3a(7);

    /* JADX INFO: renamed from: a */
    public final int f12453a;

    /* JADX INFO: renamed from: b */
    public final int f12454b;

    /* JADX INFO: renamed from: c */
    public final Intent f12455c;

    public zaa(int i, int i2, Intent intent) {
        this.f12453a = i;
        this.f12454b = i2;
        this.f12455c = intent;
    }

    @Override // p000.q88
    /* JADX INFO: renamed from: n */
    public final Status mo5281n() {
        return this.f12454b == 0 ? Status.f11657e : Status.f11661i;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iM15937a0 = l70.m15937a0(parcel, 20293);
        l70.m15935Z(parcel, 1, 4);
        parcel.writeInt(this.f12453a);
        l70.m15935Z(parcel, 2, 4);
        parcel.writeInt(this.f12454b);
        l70.m15929T(parcel, 3, this.f12455c, i);
        l70.m15939b0(parcel, iM15937a0);
    }
}
