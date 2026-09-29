package com.google.android.gms.signin.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import java.util.ArrayList;
import java.util.List;
import p000.l70;
import p000.q88;
import p000.y3a;

/* JADX INFO: loaded from: classes2.dex */
public final class zag extends AbstractSafeParcelable implements q88 {
    public static final Parcelable.Creator<zag> CREATOR = new y3a(14);

    /* JADX INFO: renamed from: a */
    public final List f12456a;

    /* JADX INFO: renamed from: b */
    public final String f12457b;

    public zag(String str, ArrayList arrayList) {
        this.f12456a = arrayList;
        this.f12457b = str;
    }

    @Override // p000.q88
    /* JADX INFO: renamed from: n */
    public final Status mo5281n() {
        return this.f12457b != null ? Status.f11657e : Status.f11661i;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iM15937a0 = l70.m15937a0(parcel, 20293);
        l70.m15932W(parcel, 1, this.f12456a);
        l70.m15930U(parcel, 2, this.f12457b);
        l70.m15939b0(parcel, iM15937a0);
    }
}
