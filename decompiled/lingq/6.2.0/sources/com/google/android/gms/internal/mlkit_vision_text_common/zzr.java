package com.google.android.gms.internal.mlkit_vision_text_common;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import p000.l70;
import p000.nbd;

/* JADX INFO: loaded from: classes2.dex */
public final class zzr extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzr> CREATOR = new nbd(4);

    /* JADX INFO: renamed from: a */
    public final zzn[] f12131a;

    /* JADX INFO: renamed from: b */
    public final zzf f12132b;

    /* JADX INFO: renamed from: c */
    public final zzf f12133c;

    /* JADX INFO: renamed from: d */
    public final String f12134d;

    /* JADX INFO: renamed from: e */
    public final float f12135e;

    /* JADX INFO: renamed from: f */
    public final String f12136f;

    /* JADX INFO: renamed from: g */
    public final boolean f12137g;

    public zzr(zzn[] zznVarArr, zzf zzfVar, zzf zzfVar2, String str, float f, String str2, boolean z) {
        this.f12131a = zznVarArr;
        this.f12132b = zzfVar;
        this.f12133c = zzfVar2;
        this.f12134d = str;
        this.f12135e = f;
        this.f12136f = str2;
        this.f12137g = z;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iM15937a0 = l70.m15937a0(parcel, 20293);
        l70.m15933X(parcel, 2, this.f12131a, i);
        l70.m15929T(parcel, 3, this.f12132b, i);
        l70.m15929T(parcel, 4, this.f12133c, i);
        l70.m15930U(parcel, 5, this.f12134d);
        l70.m15935Z(parcel, 6, 4);
        parcel.writeFloat(this.f12135e);
        l70.m15930U(parcel, 7, this.f12136f);
        l70.m15935Z(parcel, 8, 4);
        parcel.writeInt(this.f12137g ? 1 : 0);
        l70.m15939b0(parcel, iM15937a0);
    }
}
