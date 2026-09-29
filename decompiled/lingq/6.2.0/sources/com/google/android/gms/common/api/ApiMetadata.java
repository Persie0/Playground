package com.google.android.gms.common.api;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import java.util.Arrays;
import p000.AbstractC3393o1;
import p000.hfb;
import p000.l70;
import p000.x74;

/* JADX INFO: loaded from: classes2.dex */
public final class ApiMetadata extends AbstractSafeParcelable {
    public static final Parcelable.Creator<ApiMetadata> CREATOR = hfb.f42311b;

    /* JADX INFO: renamed from: d */
    public static final ApiMetadata f11646d;

    /* JADX INFO: renamed from: a */
    public final ComplianceOptions f11647a;

    /* JADX INFO: renamed from: b */
    public final boolean f11648b;

    /* JADX INFO: renamed from: c */
    public boolean f11649c;

    static {
        ApiMetadata apiMetadata = new ApiMetadata(null, false);
        apiMetadata.f11649c = false;
        f11646d = apiMetadata;
    }

    public ApiMetadata(ComplianceOptions complianceOptions, boolean z) {
        this.f11647a = complianceOptions;
        this.f11648b = z;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof ApiMetadata)) {
            return false;
        }
        ApiMetadata apiMetadata = (ApiMetadata) obj;
        return x74.m24360q(this.f11647a, apiMetadata.f11647a) && this.f11649c == apiMetadata.f11649c && this.f11648b == apiMetadata.f11648b;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f11647a, Boolean.valueOf(this.f11649c), Boolean.valueOf(this.f11648b)});
    }

    public final String toString() {
        String strValueOf = String.valueOf(this.f11647a);
        return AbstractC3393o1.m17739n(new StringBuilder(strValueOf.length() + 31), "ApiMetadata(complianceOptions=", strValueOf, ")");
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        if (this.f11649c) {
            parcel.setDataPosition(parcel.dataPosition() - 4);
            parcel.setDataSize(parcel.dataSize() - 4);
            return;
        }
        parcel.writeInt(-204102970);
        int iM15937a0 = l70.m15937a0(parcel, 20293);
        l70.m15929T(parcel, 1, this.f11647a, i);
        l70.m15935Z(parcel, 2, 4);
        parcel.writeInt(this.f11648b ? 1 : 0);
        l70.m15939b0(parcel, iM15937a0);
    }
}
