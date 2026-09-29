package com.google.android.gms.common.api;

import android.app.PendingIntent;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import java.util.Arrays;
import p000.C3670v2;
import p000.l70;
import p000.o8d;
import p000.q88;
import p000.x74;
import p000.y12;

/* JADX INFO: loaded from: classes.dex */
public final class Status extends AbstractSafeParcelable implements q88, ReflectedParcelable {

    /* JADX INFO: renamed from: a */
    public final int f11662a;

    /* JADX INFO: renamed from: b */
    public final String f11663b;

    /* JADX INFO: renamed from: c */
    public final PendingIntent f11664c;

    /* JADX INFO: renamed from: d */
    public final ConnectionResult f11665d;

    /* JADX INFO: renamed from: e */
    public static final Status f11657e = new Status(0, null, null, null);

    /* JADX INFO: renamed from: f */
    public static final Status f11658f = new Status(14, null, null, null);

    /* JADX INFO: renamed from: g */
    public static final Status f11659g = new Status(8, null, null, null);

    /* JADX INFO: renamed from: h */
    public static final Status f11660h = new Status(15, null, null, null);

    /* JADX INFO: renamed from: i */
    public static final Status f11661i = new Status(16, null, null, null);
    public static final Parcelable.Creator<Status> CREATOR = new C3670v2(22);

    public Status(int i, String str, PendingIntent pendingIntent, ConnectionResult connectionResult) {
        this.f11662a = i;
        this.f11663b = str;
        this.f11664c = pendingIntent;
        this.f11665d = connectionResult;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof Status)) {
            return false;
        }
        Status status = (Status) obj;
        return this.f11662a == status.f11662a && x74.m24360q(this.f11663b, status.f11663b) && x74.m24360q(this.f11664c, status.f11664c) && x74.m24360q(this.f11665d, status.f11665d);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.f11662a), this.f11663b, this.f11664c, this.f11665d});
    }

    @Override // p000.q88
    /* JADX INFO: renamed from: n */
    public final Status mo5281n() {
        return this;
    }

    /* JADX INFO: renamed from: r */
    public final boolean m5282r() {
        return this.f11662a <= 0;
    }

    public final String toString() {
        y12 y12Var = new y12(this);
        String strM17860a = this.f11663b;
        if (strM17860a == null) {
            strM17860a = o8d.m17860a(this.f11662a);
        }
        y12Var.m24830a(strM17860a, "statusCode");
        y12Var.m24830a(this.f11664c, "resolution");
        return y12Var.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iM15937a0 = l70.m15937a0(parcel, 20293);
        l70.m15935Z(parcel, 1, 4);
        parcel.writeInt(this.f11662a);
        l70.m15930U(parcel, 2, this.f11663b);
        l70.m15929T(parcel, 3, this.f11664c, i);
        l70.m15929T(parcel, 4, this.f11665d, i);
        l70.m15939b0(parcel, iM15937a0);
    }
}
