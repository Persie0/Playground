package com.google.android.gms.common;

import android.app.PendingIntent;
import android.os.Parcel;
import android.os.Parcelable;
import android.support.v4.media.session.C0166e;
import androidx.datastore.preferences.PreferencesProto$Value;
import androidx.fragment.app.C0987y;
import com.android.installreferrer.api.InstallReferrerClient;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import java.util.Arrays;
import p176ib.C6268g;

/* JADX INFO: loaded from: classes.dex */
public final class ConnectionResult extends AbstractSafeParcelable {

    /* JADX INFO: renamed from: a */
    public final int f13856a;

    /* JADX INFO: renamed from: b */
    public final int f13857b;

    /* JADX INFO: renamed from: c */
    public final PendingIntent f13858c;

    /* JADX INFO: renamed from: d */
    public final String f13859d;

    /* JADX INFO: renamed from: e */
    public static final ConnectionResult f13855e = new ConnectionResult(0);
    public static final Parcelable.Creator<ConnectionResult> CREATOR = new C2554i();

    public ConnectionResult() {
        throw null;
    }

    public ConnectionResult(int i10) {
        this(1, i10, null, null);
    }

    public ConnectionResult(int i10, int i11, PendingIntent pendingIntent, String str) {
        this.f13856a = i10;
        this.f13857b = i11;
        this.f13858c = pendingIntent;
        this.f13859d = str;
    }

    public ConnectionResult(int i10, PendingIntent pendingIntent) {
        this(1, i10, pendingIntent, null);
    }

    /* JADX INFO: renamed from: Q */
    public static String m7528Q(int i10) {
        if (i10 == 99) {
            return "UNFINISHED";
        }
        if (i10 == 1500) {
            return "DRIVE_EXTERNAL_STORAGE_REQUIRED";
        }
        switch (i10) {
            case InstallReferrerClient.InstallReferrerResponse.SERVICE_DISCONNECTED /* -1 */:
                return "UNKNOWN";
            case InstallReferrerClient.InstallReferrerResponse.f10530OK /* 0 */:
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
            case PreferencesProto$Value.STRING_SET_FIELD_NUMBER /* 6 */:
                return "RESOLUTION_REQUIRED";
            case PreferencesProto$Value.DOUBLE_FIELD_NUMBER /* 7 */:
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
                switch (i10) {
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
                    case 23:
                        return "API_DISABLED";
                    case 24:
                        return "API_DISABLED_FOR_CONNECTION";
                    default:
                        return C0166e.m762h("UNKNOWN_ERROR_CODE(", i10, ")");
                }
        }
    }

    /* JADX INFO: renamed from: C */
    public final boolean m7529C() {
        return this.f13857b == 0;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof ConnectionResult)) {
            return false;
        }
        ConnectionResult connectionResult = (ConnectionResult) obj;
        return this.f13857b == connectionResult.f13857b && C6268g.m12905a(this.f13858c, connectionResult.f13858c) && C6268g.m12905a(this.f13859d, connectionResult.f13859d);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.f13857b), this.f13858c, this.f13859d});
    }

    /* JADX INFO: renamed from: q */
    public final boolean m7530q() {
        return (this.f13857b == 0 || this.f13858c == null) ? false : true;
    }

    public final String toString() {
        C6268g.a aVar = new C6268g.a(this);
        aVar.m12906a(m7528Q(this.f13857b), "statusCode");
        aVar.m12906a(this.f13858c, "resolution");
        aVar.m12906a(this.f13859d, "message");
        return aVar.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int iM3836r = C0987y.m3836r(parcel, 20293);
        C0987y.m3829k(parcel, 1, this.f13856a);
        C0987y.m3829k(parcel, 2, this.f13857b);
        C0987y.m3831m(parcel, 3, this.f13858c, i10);
        C0987y.m3832n(parcel, 4, this.f13859d);
        C0987y.m3839u(parcel, iM3836r);
    }
}
