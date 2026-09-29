package com.google.android.gms.measurement.internal;

import android.os.Parcel;
import android.os.Parcelable;
import cc.C1873l7;
import cc.C1882m7;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import p176ib.C6272i;

/* JADX INFO: loaded from: classes.dex */
public final class zzli extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzli> CREATOR = new C1873l7();

    /* JADX INFO: renamed from: a */
    public final int f14617a;

    /* JADX INFO: renamed from: b */
    public final String f14618b;

    /* JADX INFO: renamed from: c */
    public final long f14619c;

    /* JADX INFO: renamed from: d */
    public final Long f14620d;

    /* JADX INFO: renamed from: e */
    public final String f14621e;

    /* JADX INFO: renamed from: f */
    public final String f14622f;

    /* JADX INFO: renamed from: g */
    public final Double f14623g;

    public zzli(int i10, String str, long j10, Long l10, Float f3, String str2, String str3, Double d10) {
        this.f14617a = i10;
        this.f14618b = str;
        this.f14619c = j10;
        this.f14620d = l10;
        if (i10 == 1) {
            this.f14623g = f3 != null ? Double.valueOf(f3.doubleValue()) : null;
        } else {
            this.f14623g = d10;
        }
        this.f14621e = str2;
        this.f14622f = str3;
    }

    public zzli(long j10, Object obj, String str, String str2) {
        C6272i.m12912f(str);
        this.f14617a = 2;
        this.f14618b = str;
        this.f14619c = j10;
        this.f14622f = str2;
        if (obj == null) {
            this.f14620d = null;
            this.f14623g = null;
            this.f14621e = null;
            return;
        }
        if (obj instanceof Long) {
            this.f14620d = (Long) obj;
            this.f14623g = null;
            this.f14621e = null;
        } else if (obj instanceof String) {
            this.f14620d = null;
            this.f14623g = null;
            this.f14621e = (String) obj;
        } else {
            if (!(obj instanceof Double)) {
                throw new IllegalArgumentException("User attribute given of un-supported type");
            }
            this.f14620d = null;
            this.f14623g = (Double) obj;
            this.f14621e = null;
        }
    }

    public zzli(C1882m7 c1882m7) {
        this(c1882m7.f10016d, c1882m7.f10017e, c1882m7.f10015c, c1882m7.f10014b);
    }

    /* JADX INFO: renamed from: q */
    public final Object m8536q() {
        Long l10 = this.f14620d;
        if (l10 != null) {
            return l10;
        }
        Double d10 = this.f14623g;
        if (d10 != null) {
            return d10;
        }
        String str = this.f14621e;
        if (str != null) {
            return str;
        }
        return null;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        C1873l7.m5744a(this, parcel);
    }
}
