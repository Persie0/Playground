package com.google.android.gms.internal.vision;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import p000.l70;
import p000.qmb;

/* JADX INFO: loaded from: classes2.dex */
public final class zzao extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzao> CREATOR = new qmb(2);

    /* JADX INFO: renamed from: a */
    public final zzal[] f12286a;

    /* JADX INFO: renamed from: b */
    public final zzab f12287b;

    /* JADX INFO: renamed from: c */
    public final zzab f12288c;

    /* JADX INFO: renamed from: d */
    public final String f12289d;

    /* JADX INFO: renamed from: e */
    public final float f12290e;

    /* JADX INFO: renamed from: f */
    public final String f12291f;

    /* JADX INFO: renamed from: g */
    public final boolean f12292g;

    public zzao(zzal[] zzalVarArr, zzab zzabVar, zzab zzabVar2, String str, float f, String str2, boolean z) {
        this.f12286a = zzalVarArr;
        this.f12287b = zzabVar;
        this.f12288c = zzabVar2;
        this.f12289d = str;
        this.f12290e = f;
        this.f12291f = str2;
        this.f12292g = z;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iM15937a0 = l70.m15937a0(parcel, 20293);
        l70.m15933X(parcel, 2, this.f12286a, i);
        l70.m15929T(parcel, 3, this.f12287b, i);
        l70.m15929T(parcel, 4, this.f12288c, i);
        l70.m15930U(parcel, 5, this.f12289d);
        l70.m15935Z(parcel, 6, 4);
        parcel.writeFloat(this.f12290e);
        l70.m15930U(parcel, 7, this.f12291f);
        l70.m15935Z(parcel, 8, 4);
        parcel.writeInt(this.f12292g ? 1 : 0);
        l70.m15939b0(parcel, iM15937a0);
    }
}
