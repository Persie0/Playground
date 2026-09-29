package com.google.android.gms.internal.mlkit_vision_text_common;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import p000.l70;
import p000.nbd;

/* JADX INFO: loaded from: classes2.dex */
public final class zzvh extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzvh> CREATOR = new nbd(14);

    /* JADX INFO: renamed from: a */
    public final String f12164a;

    /* JADX INFO: renamed from: b */
    public final String f12165b;

    /* JADX INFO: renamed from: c */
    public final String f12166c;

    /* JADX INFO: renamed from: d */
    public final boolean f12167d;

    /* JADX INFO: renamed from: e */
    public final int f12168e;

    /* JADX INFO: renamed from: f */
    public final String f12169f;

    /* JADX INFO: renamed from: g */
    public final boolean f12170g;

    public zzvh(int i, String str, String str2, String str3, String str4, boolean z, boolean z2) {
        this.f12164a = str;
        this.f12165b = str2;
        this.f12166c = str3;
        this.f12169f = str4;
        this.f12168e = i;
        this.f12167d = z;
        this.f12170g = z2;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iM15937a0 = l70.m15937a0(parcel, 20293);
        l70.m15930U(parcel, 1, this.f12164a);
        l70.m15930U(parcel, 2, this.f12165b);
        l70.m15930U(parcel, 3, this.f12166c);
        l70.m15935Z(parcel, 4, 4);
        parcel.writeInt(this.f12167d ? 1 : 0);
        l70.m15935Z(parcel, 5, 4);
        parcel.writeInt(this.f12168e);
        l70.m15930U(parcel, 6, this.f12169f);
        l70.m15935Z(parcel, 7, 4);
        parcel.writeInt(this.f12170g ? 1 : 0);
        l70.m15939b0(parcel, iM15937a0);
    }
}
