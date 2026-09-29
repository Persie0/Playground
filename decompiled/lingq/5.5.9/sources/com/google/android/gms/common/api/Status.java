package com.google.android.gms.common.api;

import android.app.PendingIntent;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.fragment.app.C0987y;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import gb.C5737a;
import gb.C5744h;
import gb.InterfaceC5740d;
import java.util.Arrays;
import p176ib.C6268g;

/* JADX INFO: loaded from: classes.dex */
public final class Status extends AbstractSafeParcelable implements InterfaceC5740d, ReflectedParcelable {
    public static final Parcelable.Creator<Status> CREATOR;

    /* JADX INFO: renamed from: f */
    public static final Status f13873f;

    /* JADX INFO: renamed from: g */
    public static final Status f13874g;

    /* JADX INFO: renamed from: h */
    public static final Status f13875h;

    /* JADX INFO: renamed from: i */
    public static final Status f13876i;

    /* JADX INFO: renamed from: j */
    public static final Status f13877j;

    /* JADX INFO: renamed from: a */
    public final int f13878a;

    /* JADX INFO: renamed from: b */
    public final int f13879b;

    /* JADX INFO: renamed from: c */
    public final String f13880c;

    /* JADX INFO: renamed from: d */
    public final PendingIntent f13881d;

    /* JADX INFO: renamed from: e */
    public final ConnectionResult f13882e;

    static {
        new Status(null, -1);
        f13873f = new Status(null, 0);
        f13874g = new Status(null, 14);
        f13875h = new Status(null, 8);
        f13876i = new Status(null, 15);
        f13877j = new Status(null, 16);
        new Status(null, 17);
        new Status(null, 18);
        CREATOR = new C5744h();
    }

    public Status() {
        throw null;
    }

    public Status(int i10, int i11, String str, PendingIntent pendingIntent, ConnectionResult connectionResult) {
        this.f13878a = i10;
        this.f13879b = i11;
        this.f13880c = str;
        this.f13881d = pendingIntent;
        this.f13882e = connectionResult;
    }

    public Status(int i10, PendingIntent pendingIntent, String str) {
        this(1, i10, str, pendingIntent, null);
    }

    public Status(String str, int i10) {
        this(1, i10, str, null, null);
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof Status)) {
            return false;
        }
        Status status = (Status) obj;
        return this.f13878a == status.f13878a && this.f13879b == status.f13879b && C6268g.m12905a(this.f13880c, status.f13880c) && C6268g.m12905a(this.f13881d, status.f13881d) && C6268g.m12905a(this.f13882e, status.f13882e);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.f13878a), Integer.valueOf(this.f13879b), this.f13880c, this.f13881d, this.f13882e});
    }

    @Override // gb.InterfaceC5740d
    /* JADX INFO: renamed from: m */
    public final Status mo5489m() {
        return this;
    }

    /* JADX INFO: renamed from: q */
    public final boolean m7534q() {
        return this.f13879b <= 0;
    }

    public final String toString() {
        C6268g.a aVar = new C6268g.a(this);
        String strM12093a = this.f13880c;
        if (strM12093a == null) {
            strM12093a = C5737a.m12093a(this.f13879b);
        }
        aVar.m12906a(strM12093a, "statusCode");
        aVar.m12906a(this.f13881d, "resolution");
        return aVar.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int iM3836r = C0987y.m3836r(parcel, 20293);
        C0987y.m3829k(parcel, 1, this.f13879b);
        C0987y.m3832n(parcel, 2, this.f13880c);
        C0987y.m3831m(parcel, 3, this.f13881d, i10);
        C0987y.m3831m(parcel, 4, this.f13882e, i10);
        C0987y.m3829k(parcel, 1000, this.f13878a);
        C0987y.m3839u(parcel, iM3836r);
    }
}
