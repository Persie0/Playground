package com.google.android.gms.common.moduleinstall.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import p000.l70;
import p000.lda;
import p000.x74;
import p000.y3a;

/* JADX INFO: loaded from: classes2.dex */
public class ApiFeatureRequest extends AbstractSafeParcelable {
    public static final Parcelable.Creator<ApiFeatureRequest> CREATOR = new y3a(11);

    /* JADX INFO: renamed from: a */
    public final List f11752a;

    /* JADX INFO: renamed from: b */
    public final boolean f11753b;

    /* JADX INFO: renamed from: c */
    public final String f11754c;

    /* JADX INFO: renamed from: d */
    public final String f11755d;

    public ApiFeatureRequest(ArrayList arrayList, boolean z, String str, String str2) {
        lda.m16130p(arrayList);
        this.f11752a = arrayList;
        this.f11753b = z;
        this.f11754c = str;
        this.f11755d = str2;
    }

    public final boolean equals(Object obj) {
        if (obj == null || !(obj instanceof ApiFeatureRequest)) {
            return false;
        }
        ApiFeatureRequest apiFeatureRequest = (ApiFeatureRequest) obj;
        return this.f11753b == apiFeatureRequest.f11753b && x74.m24360q(this.f11752a, apiFeatureRequest.f11752a) && x74.m24360q(this.f11754c, apiFeatureRequest.f11754c) && x74.m24360q(this.f11755d, apiFeatureRequest.f11755d);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Boolean.valueOf(this.f11753b), this.f11752a, this.f11754c, this.f11755d});
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iM15937a0 = l70.m15937a0(parcel, 20293);
        l70.m15934Y(parcel, 1, this.f11752a);
        l70.m15935Z(parcel, 2, 4);
        parcel.writeInt(this.f11753b ? 1 : 0);
        l70.m15930U(parcel, 3, this.f11754c);
        l70.m15930U(parcel, 4, this.f11755d);
        l70.m15939b0(parcel, iM15937a0);
    }
}
