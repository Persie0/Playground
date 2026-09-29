package com.google.android.gms.common;

import android.app.PendingIntent;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.datastore.preferences.protobuf.DescriptorProtos;
import com.android.installreferrer.api.InstallReferrerClient;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import java.util.Arrays;
import p000.C3670v2;
import p000.l70;
import p000.x74;
import p000.y12;

/* JADX INFO: loaded from: classes.dex */
public final class ConnectionResult extends AbstractSafeParcelable {

    /* JADX INFO: renamed from: a */
    public final int f11636a;

    /* JADX INFO: renamed from: b */
    public final int f11637b;

    /* JADX INFO: renamed from: c */
    public final PendingIntent f11638c;

    /* JADX INFO: renamed from: d */
    public final String f11639d;

    /* JADX INFO: renamed from: e */
    public final Integer f11640e;

    /* JADX INFO: renamed from: f */
    public static final ConnectionResult f11635f = new ConnectionResult(0, null, null);
    public static final Parcelable.Creator<ConnectionResult> CREATOR = new C3670v2(15);

    public ConnectionResult(int i, int i2, PendingIntent pendingIntent, String str, Integer num) {
        this.f11636a = i;
        this.f11637b = i2;
        this.f11638c = pendingIntent;
        this.f11639d = str;
        this.f11640e = num;
    }

    /* JADX INFO: renamed from: r */
    public static String m5278r(int i) {
        if (i == 99) {
            return "UNFINISHED";
        }
        if (i == 1500) {
            return "DRIVE_EXTERNAL_STORAGE_REQUIRED";
        }
        switch (i) {
            case InstallReferrerClient.InstallReferrerResponse.SERVICE_DISCONNECTED /* -1 */:
                return "UNKNOWN";
            case 0:
                return "SUCCESS";
            case 1:
                return "SERVICE_MISSING";
            case 2:
                return "SERVICE_VERSION_UPDATE_REQUIRED";
            case 3:
                return "SERVICE_DISABLED";
            case 4:
                return "SIGN_IN_REQUIRED";
            case 5:
                return "INVALID_ACCOUNT";
            case 6:
                return "RESOLUTION_REQUIRED";
            case 7:
                return "NETWORK_ERROR";
            case 8:
                return "INTERNAL_ERROR";
            case 9:
                return "SERVICE_INVALID";
            case 10:
                return "DEVELOPER_ERROR";
            case 11:
                return "LICENSE_CHECK_FAILED";
            default:
                switch (i) {
                    case 13:
                        return "CANCELED";
                    case 14:
                        return "TIMEOUT";
                    case 15:
                        return "INTERRUPTED";
                    case 16:
                        return "API_UNAVAILABLE";
                    case 17:
                        return "SIGN_IN_FAILED";
                    case 18:
                        return "SERVICE_UPDATING";
                    case 19:
                        return "SERVICE_MISSING_PERMISSION";
                    case 20:
                        return "RESTRICTED_PROFILE";
                    case 21:
                        return "API_VERSION_UPDATE_REQUIRED";
                    case 22:
                        return "RESOLUTION_ACTIVITY_NOT_FOUND";
                    case DescriptorProtos.FileOptions.DEPRECATED_FIELD_NUMBER /* 23 */:
                        return "API_DISABLED";
                    case 24:
                        return "API_DISABLED_FOR_CONNECTION";
                    case 25:
                        return "API_INSTALL_REQUIRED";
                    default:
                        StringBuilder sb = new StringBuilder(String.valueOf(i).length() + 20);
                        sb.append("UNKNOWN_ERROR_CODE(");
                        sb.append(i);
                        sb.append(")");
                        return sb.toString();
                }
        }
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof ConnectionResult)) {
            return false;
        }
        ConnectionResult connectionResult = (ConnectionResult) obj;
        return this.f11637b == connectionResult.f11637b && x74.m24360q(this.f11638c, connectionResult.f11638c) && x74.m24360q(this.f11639d, connectionResult.f11639d) && x74.m24360q(this.f11640e, connectionResult.f11640e);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.f11637b), this.f11638c, this.f11639d, this.f11640e});
    }

    public final String toString() {
        y12 y12Var = new y12(this);
        y12Var.m24830a(m5278r(this.f11637b), "statusCode");
        y12Var.m24830a(this.f11638c, "resolution");
        y12Var.m24830a(this.f11639d, "message");
        y12Var.m24830a(this.f11640e, "clientMethodKey");
        return y12Var.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iM15937a0 = l70.m15937a0(parcel, 20293);
        l70.m15935Z(parcel, 1, 4);
        parcel.writeInt(this.f11636a);
        l70.m15935Z(parcel, 2, 4);
        parcel.writeInt(this.f11637b);
        l70.m15929T(parcel, 3, this.f11638c, i);
        l70.m15930U(parcel, 4, this.f11639d);
        Integer num = this.f11640e;
        if (num != null) {
            l70.m15935Z(parcel, 5, 4);
            parcel.writeInt(num.intValue());
        }
        l70.m15939b0(parcel, iM15937a0);
    }

    public ConnectionResult(int i, PendingIntent pendingIntent, String str) {
        this(1, i, pendingIntent, str, null);
    }
}
