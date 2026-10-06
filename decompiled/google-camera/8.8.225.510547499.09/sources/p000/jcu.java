package p000;

import android.app.PendingIntent;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.wear.widget.iZcI.hiCTUJiAxf;
import com.google.android.libraries.lens.lenslite.dynamicloading.QSK.hIAHJKEnGsNbz;
import com.google.lens.sdk.LensApi;
import java.util.ArrayList;
import java.util.Arrays;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class jcu extends jij {

    /* JADX INFO: renamed from: b */
    final int f33754b;

    /* JADX INFO: renamed from: c */
    public final int f33755c;

    /* JADX INFO: renamed from: d */
    public final PendingIntent f33756d;

    /* JADX INFO: renamed from: e */
    public final String f33757e;

    /* JADX INFO: renamed from: a */
    public static final jcu f33753a = new jcu(0);
    public static final Parcelable.Creator CREATOR = new jbt(7);

    public jcu(int i) {
        this(i, null, null);
    }

    public jcu(int i, int i2, PendingIntent pendingIntent, String str) {
        this.f33754b = i;
        this.f33755c = i2;
        this.f33756d = pendingIntent;
        this.f33757e = str;
    }

    public jcu(int i, PendingIntent pendingIntent) {
        this(i, pendingIntent, null);
    }

    /* JADX INFO: renamed from: a */
    public final boolean m12894a() {
        return (this.f33755c == 0 || this.f33756d == null) ? false : true;
    }

    /* JADX INFO: renamed from: b */
    public final boolean m12895b() {
        return this.f33755c == 0;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof jcu)) {
            return false;
        }
        jcu jcuVar = (jcu) obj;
        return this.f33755c == jcuVar.f33755c && jib.m13209n(this.f33756d, jcuVar.f33756d) && jib.m13209n(this.f33757e, jcuVar.f33757e);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.f33755c), this.f33756d, this.f33757e});
    }

    public final String toString() {
        String str;
        ArrayList arrayList = new ArrayList();
        int i = this.f33755c;
        switch (i) {
            case LensApi.LensAvailabilityStatus.LENS_AVAILABILITY_UNKNOWN /* -1 */:
                str = "UNKNOWN";
                break;
            case 0:
                str = "SUCCESS";
                break;
            case 1:
                str = hIAHJKEnGsNbz.lFJIBik;
                break;
            case 2:
                str = "SERVICE_VERSION_UPDATE_REQUIRED";
                break;
            case 3:
                str = "SERVICE_DISABLED";
                break;
            case 4:
                str = "SIGN_IN_REQUIRED";
                break;
            case 5:
                str = "INVALID_ACCOUNT";
                break;
            case 6:
                str = "RESOLUTION_REQUIRED";
                break;
            case 7:
                str = "NETWORK_ERROR";
                break;
            case 8:
                str = "INTERNAL_ERROR";
                break;
            case 9:
                str = "SERVICE_INVALID";
                break;
            case 10:
                str = "DEVELOPER_ERROR";
                break;
            case 11:
                str = "LICENSE_CHECK_FAILED";
                break;
            case 13:
                str = "CANCELED";
                break;
            case 14:
                str = "TIMEOUT";
                break;
            case 15:
                str = hiCTUJiAxf.PdFWz;
                break;
            case 16:
                str = "API_UNAVAILABLE";
                break;
            case 17:
                str = "SIGN_IN_FAILED";
                break;
            case 18:
                str = "SERVICE_UPDATING";
                break;
            case 19:
                str = "SERVICE_MISSING_PERMISSION";
                break;
            case 20:
                str = "RESTRICTED_PROFILE";
                break;
            case 21:
                str = "API_VERSION_UPDATE_REQUIRED";
                break;
            case 22:
                str = "RESOLUTION_ACTIVITY_NOT_FOUND";
                break;
            case 23:
                str = "API_DISABLED";
                break;
            case 24:
                str = "API_DISABLED_FOR_CONNECTION";
                break;
            case 99:
                str = "UNFINISHED";
                break;
            case 1500:
                str = "DRIVE_EXTERNAL_STORAGE_REQUIRED";
                break;
            default:
                str = "UNKNOWN_ERROR_CODE(" + i + ")";
                break;
        }
        jib.m13211p("statusCode", str, arrayList);
        jib.m13211p("resolution", this.f33756d, arrayList);
        jib.m13211p("message", this.f33757e, arrayList);
        return jib.m13210o(arrayList, this);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iM13281h = jiy.m13281h(parcel);
        jiy.m13287n(parcel, 1, this.f33754b);
        jiy.m13287n(parcel, 2, this.f33755c);
        jiy.m13295v(parcel, 3, this.f33756d, i);
        jiy.m13296w(parcel, 4, this.f33757e);
        jiy.m13283j(parcel, iM13281h);
    }

    public jcu(int i, PendingIntent pendingIntent, String str) {
        this(1, i, pendingIntent, str);
    }
}
