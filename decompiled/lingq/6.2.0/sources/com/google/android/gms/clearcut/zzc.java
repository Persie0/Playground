package com.google.android.gms.clearcut;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import java.util.Arrays;
import p000.l70;
import p000.qmb;
import p000.wq1;

/* JADX INFO: loaded from: classes2.dex */
public final class zzc extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzc> CREATOR = new qmb(7);

    /* JADX INFO: renamed from: a */
    public final boolean f11621a;

    /* JADX INFO: renamed from: b */
    public final long f11622b;

    /* JADX INFO: renamed from: c */
    public final long f11623c;

    public zzc(long j, long j2, boolean z) {
        this.f11621a = z;
        this.f11622b = j;
        this.f11623c = j2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof zzc) {
            zzc zzcVar = (zzc) obj;
            if (this.f11621a == zzcVar.f11621a && this.f11622b == zzcVar.f11622b && this.f11623c == zzcVar.f11623c) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Boolean.valueOf(this.f11621a), Long.valueOf(this.f11622b), Long.valueOf(this.f11623c)});
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("CollectForDebugParcelable[skipPersistentStorage: ");
        sb.append(this.f11621a);
        sb.append(",collectForDebugStartTimeMillis: ");
        sb.append(this.f11622b);
        sb.append(",collectForDebugExpiryTimeMillis: ");
        return wq1.m24113i(this.f11623c, "]", sb);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iM15937a0 = l70.m15937a0(parcel, 20293);
        l70.m15935Z(parcel, 1, 4);
        parcel.writeInt(this.f11621a ? 1 : 0);
        l70.m15935Z(parcel, 2, 8);
        parcel.writeLong(this.f11623c);
        l70.m15935Z(parcel, 3, 8);
        parcel.writeLong(this.f11622b);
        l70.m15939b0(parcel, iM15937a0);
    }
}
