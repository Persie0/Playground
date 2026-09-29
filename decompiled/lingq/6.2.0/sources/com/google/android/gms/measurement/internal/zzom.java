package com.google.android.gms.measurement.internal;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import p000.l70;
import p000.qmb;

/* JADX INFO: loaded from: classes2.dex */
public final class zzom extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzom> CREATOR = new qmb(27);

    /* JADX INFO: renamed from: a */
    public final long f12397a;

    /* JADX INFO: renamed from: b */
    public byte[] f12398b;

    /* JADX INFO: renamed from: c */
    public final String f12399c;

    /* JADX INFO: renamed from: d */
    public final Bundle f12400d;

    /* JADX INFO: renamed from: e */
    public final int f12401e;

    /* JADX INFO: renamed from: f */
    public final long f12402f;

    /* JADX INFO: renamed from: g */
    public String f12403g;

    public zzom(long j, byte[] bArr, String str, Bundle bundle, int i, long j2, String str2) {
        this.f12397a = j;
        this.f12398b = bArr;
        this.f12399c = str;
        this.f12400d = bundle;
        this.f12401e = i;
        this.f12402f = j2;
        this.f12403g = str2;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iM15937a0 = l70.m15937a0(parcel, 20293);
        l70.m15935Z(parcel, 1, 8);
        parcel.writeLong(this.f12397a);
        l70.m15925P(parcel, 2, this.f12398b);
        l70.m15930U(parcel, 3, this.f12399c);
        l70.m15924O(parcel, 4, this.f12400d);
        l70.m15935Z(parcel, 5, 4);
        parcel.writeInt(this.f12401e);
        l70.m15935Z(parcel, 6, 8);
        parcel.writeLong(this.f12402f);
        l70.m15930U(parcel, 7, this.f12403g);
        l70.m15939b0(parcel, iM15937a0);
    }
}
