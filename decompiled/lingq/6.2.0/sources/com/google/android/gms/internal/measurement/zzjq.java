package com.google.android.gms.internal.measurement;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import p000.ked;
import p000.l70;
import p000.qmb;

/* JADX INFO: loaded from: classes2.dex */
public final class zzjq extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzjq> CREATOR = new qmb(17);

    /* JADX INFO: renamed from: a */
    public final String f11913a;

    /* JADX INFO: renamed from: b */
    public final String f11914b;

    /* JADX INFO: renamed from: c */
    public final zzjo f11915c;

    /* JADX INFO: renamed from: d */
    public final boolean f11916d;

    public zzjq(String str, String str2, zzjo zzjoVar, boolean z) {
        this.f11913a = str;
        this.f11914b = str2;
        this.f11915c = zzjoVar;
        this.f11916d = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zzjq)) {
            return false;
        }
        zzjq zzjqVar = (zzjq) obj;
        return ked.m15166d(this.f11913a, zzjqVar.f11913a) && ked.m15166d(this.f11914b, zzjqVar.f11914b) && ked.m15166d(this.f11915c, zzjqVar.f11915c) && this.f11916d == zzjqVar.f11916d;
    }

    /* JADX INFO: renamed from: r */
    public final void m5445r(StringBuilder sb) {
        sb.append("FlagOverride(");
        sb.append(this.f11913a);
        sb.append(", ");
        sb.append(this.f11914b);
        sb.append(", ");
        this.f11915c.m5444r(sb);
        sb.append(", ");
        sb.append(this.f11916d);
        sb.append(")");
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        m5445r(sb);
        return sb.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iM15937a0 = l70.m15937a0(parcel, 20293);
        l70.m15930U(parcel, 2, this.f11913a);
        l70.m15930U(parcel, 3, this.f11914b);
        l70.m15929T(parcel, 4, this.f11915c, i);
        l70.m15935Z(parcel, 5, 4);
        parcel.writeInt(this.f11916d ? 1 : 0);
        l70.m15939b0(parcel, iM15937a0);
    }
}
