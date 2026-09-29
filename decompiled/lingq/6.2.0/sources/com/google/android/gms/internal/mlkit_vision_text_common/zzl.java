package com.google.android.gms.internal.mlkit_vision_text_common;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import p000.l70;
import p000.qmb;

/* JADX INFO: loaded from: classes2.dex */
public final class zzl extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzl> CREATOR = new qmb(23);

    /* JADX INFO: renamed from: a */
    public final zzr[] f12119a;

    /* JADX INFO: renamed from: b */
    public final zzf f12120b;

    /* JADX INFO: renamed from: c */
    public final zzf f12121c;

    /* JADX INFO: renamed from: d */
    public final zzf f12122d;

    /* JADX INFO: renamed from: e */
    public final String f12123e;

    /* JADX INFO: renamed from: f */
    public final float f12124f;

    /* JADX INFO: renamed from: g */
    public final String f12125g;

    /* JADX INFO: renamed from: h */
    public final int f12126h;

    /* JADX INFO: renamed from: i */
    public final boolean f12127i;

    /* JADX INFO: renamed from: j */
    public final int f12128j;

    /* JADX INFO: renamed from: k */
    public final int f12129k;

    public zzl(zzr[] zzrVarArr, zzf zzfVar, zzf zzfVar2, zzf zzfVar3, String str, float f, String str2, int i, boolean z, int i2, int i3) {
        this.f12119a = zzrVarArr;
        this.f12120b = zzfVar;
        this.f12121c = zzfVar2;
        this.f12122d = zzfVar3;
        this.f12123e = str;
        this.f12124f = f;
        this.f12125g = str2;
        this.f12126h = i;
        this.f12127i = z;
        this.f12128j = i2;
        this.f12129k = i3;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iM15937a0 = l70.m15937a0(parcel, 20293);
        l70.m15933X(parcel, 2, this.f12119a, i);
        l70.m15929T(parcel, 3, this.f12120b, i);
        l70.m15929T(parcel, 4, this.f12121c, i);
        l70.m15929T(parcel, 5, this.f12122d, i);
        l70.m15930U(parcel, 6, this.f12123e);
        l70.m15935Z(parcel, 7, 4);
        parcel.writeFloat(this.f12124f);
        l70.m15930U(parcel, 8, this.f12125g);
        l70.m15935Z(parcel, 9, 4);
        parcel.writeInt(this.f12126h);
        l70.m15935Z(parcel, 10, 4);
        parcel.writeInt(this.f12127i ? 1 : 0);
        l70.m15935Z(parcel, 11, 4);
        parcel.writeInt(this.f12128j);
        l70.m15935Z(parcel, 12, 4);
        parcel.writeInt(this.f12129k);
        l70.m15939b0(parcel, iM15937a0);
    }
}
