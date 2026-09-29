package com.google.android.gms.measurement.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import p000.C3386nv;
import p000.C3670v2;
import p000.lad;
import p000.lda;

/* JADX INFO: loaded from: classes.dex */
public final class zzpl extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzpl> CREATOR = new C3670v2(23);

    /* JADX INFO: renamed from: a */
    public final int f12406a;

    /* JADX INFO: renamed from: b */
    public final String f12407b;

    /* JADX INFO: renamed from: c */
    public final long f12408c;

    /* JADX INFO: renamed from: d */
    public final Long f12409d;

    /* JADX INFO: renamed from: e */
    public final String f12410e;

    /* JADX INFO: renamed from: f */
    public final String f12411f;

    /* JADX INFO: renamed from: g */
    public final Double f12412g;

    public zzpl(long j, Object obj, String str, String str2) {
        lda.m16127m(str);
        this.f12406a = 2;
        this.f12407b = str;
        this.f12408c = j;
        this.f12411f = str2;
        if (obj == null) {
            this.f12409d = null;
            this.f12412g = null;
            this.f12410e = null;
            return;
        }
        if (obj instanceof Long) {
            this.f12409d = (Long) obj;
            this.f12412g = null;
            this.f12410e = null;
        } else if (obj instanceof String) {
            this.f12409d = null;
            this.f12412g = null;
            this.f12410e = (String) obj;
        } else {
            if (!(obj instanceof Double)) {
                C3386nv.m17626m("User attribute given of un-supported type");
                throw null;
            }
            this.f12409d = null;
            this.f12412g = (Double) obj;
            this.f12410e = null;
        }
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        C3670v2.m23049b(this, parcel);
    }

    public final Object zza() {
        Long l = this.f12409d;
        if (l != null) {
            return l;
        }
        Double d = this.f12412g;
        if (d != null) {
            return d;
        }
        String str = this.f12410e;
        if (str != null) {
            return str;
        }
        return null;
    }

    public zzpl(int i, String str, long j, Long l, Float f, String str2, String str3, Double d) {
        this.f12406a = i;
        this.f12407b = str;
        this.f12408c = j;
        this.f12409d = l;
        this.f12412g = i == 1 ? f != null ? Double.valueOf(f.doubleValue()) : null : d;
        this.f12410e = str2;
        this.f12411f = str3;
    }

    public zzpl(lad ladVar) {
        this(ladVar.f49381d, ladVar.f49382e, ladVar.f49380c, ladVar.f49379b);
    }
}
