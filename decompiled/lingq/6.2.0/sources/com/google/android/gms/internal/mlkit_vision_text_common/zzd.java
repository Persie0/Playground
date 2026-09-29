package com.google.android.gms.internal.mlkit_vision_text_common;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import p000.l70;
import p000.qmb;

/* JADX INFO: loaded from: classes2.dex */
public final class zzd extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzd> CREATOR = new qmb(8);

    /* JADX INFO: renamed from: a */
    public final int f12109a;

    /* JADX INFO: renamed from: b */
    public final int f12110b;

    /* JADX INFO: renamed from: c */
    public final int f12111c;

    /* JADX INFO: renamed from: d */
    public final long f12112d;

    /* JADX INFO: renamed from: e */
    public final int f12113e;

    public zzd(int i, int i2, int i3, int i4, long j) {
        this.f12109a = i;
        this.f12110b = i2;
        this.f12111c = i3;
        this.f12112d = j;
        this.f12113e = i4;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iM15937a0 = l70.m15937a0(parcel, 20293);
        l70.m15935Z(parcel, 2, 4);
        parcel.writeInt(this.f12109a);
        l70.m15935Z(parcel, 3, 4);
        parcel.writeInt(this.f12110b);
        l70.m15935Z(parcel, 4, 4);
        parcel.writeInt(this.f12111c);
        l70.m15935Z(parcel, 5, 8);
        parcel.writeLong(this.f12112d);
        l70.m15935Z(parcel, 6, 4);
        parcel.writeInt(this.f12113e);
        l70.m15939b0(parcel, iM15937a0);
    }
}
