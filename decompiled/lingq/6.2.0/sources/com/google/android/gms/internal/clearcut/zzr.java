package com.google.android.gms.internal.clearcut;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import java.util.Arrays;
import p000.l70;
import p000.lda;
import p000.nbd;
import p000.wq1;
import p000.x74;

/* JADX INFO: loaded from: classes2.dex */
public final class zzr extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzr> CREATOR = new nbd(3);

    /* JADX INFO: renamed from: a */
    public final String f11808a;

    /* JADX INFO: renamed from: b */
    public final int f11809b;

    /* JADX INFO: renamed from: c */
    public final int f11810c;

    /* JADX INFO: renamed from: d */
    public final String f11811d;

    /* JADX INFO: renamed from: e */
    public final String f11812e;

    /* JADX INFO: renamed from: f */
    public final boolean f11813f;

    /* JADX INFO: renamed from: g */
    public final String f11814g;

    /* JADX INFO: renamed from: h */
    public final boolean f11815h;

    /* JADX INFO: renamed from: i */
    public final int f11816i;

    public zzr(String str, int i, int i2, String str2, zzge$zzv$zzb zzge_zzv_zzb) {
        lda.m16130p(str);
        this.f11808a = str;
        this.f11809b = i;
        this.f11810c = i2;
        this.f11814g = str2;
        this.f11811d = null;
        this.f11812e = null;
        this.f11813f = true;
        this.f11815h = false;
        this.f11816i = zzge_zzv_zzb.zzc();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof zzr) {
            zzr zzrVar = (zzr) obj;
            if (x74.m24360q(this.f11808a, zzrVar.f11808a) && this.f11809b == zzrVar.f11809b && this.f11810c == zzrVar.f11810c && x74.m24360q(this.f11814g, zzrVar.f11814g) && x74.m24360q(this.f11811d, zzrVar.f11811d) && x74.m24360q(this.f11812e, zzrVar.f11812e) && this.f11813f == zzrVar.f11813f && this.f11815h == zzrVar.f11815h && this.f11816i == zzrVar.f11816i) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f11808a, Integer.valueOf(this.f11809b), Integer.valueOf(this.f11810c), this.f11814g, this.f11811d, this.f11812e, Boolean.valueOf(this.f11813f), Boolean.valueOf(this.f11815h), Integer.valueOf(this.f11816i)});
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("PlayLoggerContext[package=");
        sb.append(this.f11808a);
        sb.append(",packageVersionCode=");
        sb.append(this.f11809b);
        sb.append(",logSource=");
        sb.append(this.f11810c);
        sb.append(",logSourceName=");
        sb.append(this.f11814g);
        sb.append(",uploadAccount=");
        sb.append(this.f11811d);
        sb.append(",loggingId=");
        sb.append(this.f11812e);
        sb.append(",logAndroidId=");
        sb.append(this.f11813f);
        sb.append(",isAnonymous=");
        sb.append(this.f11815h);
        sb.append(",qosTier=");
        return wq1.m24123s(sb, this.f11816i, "]");
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iM15937a0 = l70.m15937a0(parcel, 20293);
        l70.m15930U(parcel, 2, this.f11808a);
        l70.m15935Z(parcel, 3, 4);
        parcel.writeInt(this.f11809b);
        l70.m15935Z(parcel, 4, 4);
        parcel.writeInt(this.f11810c);
        l70.m15930U(parcel, 5, this.f11811d);
        l70.m15930U(parcel, 6, this.f11812e);
        l70.m15935Z(parcel, 7, 4);
        parcel.writeInt(this.f11813f ? 1 : 0);
        l70.m15930U(parcel, 8, this.f11814g);
        l70.m15935Z(parcel, 9, 4);
        parcel.writeInt(this.f11815h ? 1 : 0);
        l70.m15935Z(parcel, 10, 4);
        parcel.writeInt(this.f11816i);
        l70.m15939b0(parcel, iM15937a0);
    }

    public zzr(int i, int i2, int i3, String str, String str2, String str3, String str4, boolean z, boolean z2) {
        this.f11808a = str;
        this.f11809b = i;
        this.f11810c = i2;
        this.f11811d = str2;
        this.f11812e = str3;
        this.f11813f = z;
        this.f11814g = str4;
        this.f11815h = z2;
        this.f11816i = i3;
    }
}
