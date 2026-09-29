package com.google.android.gms.common.internal;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.fragment.app.C0987y;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import java.util.List;
import p176ib.C6280m;

/* JADX INFO: loaded from: classes.dex */
public class TelemetryData extends AbstractSafeParcelable {
    public static final Parcelable.Creator<TelemetryData> CREATOR = new C6280m();

    /* JADX INFO: renamed from: a */
    public final int f13967a;

    /* JADX INFO: renamed from: b */
    public List<MethodInvocation> f13968b;

    public TelemetryData(int i10, List<MethodInvocation> list) {
        this.f13967a = i10;
        this.f13968b = list;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int iM3836r = C0987y.m3836r(parcel, 20293);
        C0987y.m3829k(parcel, 1, this.f13967a);
        C0987y.m3834p(parcel, 2, this.f13968b);
        C0987y.m3839u(parcel, iM3836r);
    }
}
