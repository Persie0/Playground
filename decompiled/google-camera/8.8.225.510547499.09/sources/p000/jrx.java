package p000;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.lens.sdk.LensApi;
import p021j$.util.Objects;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class jrx extends jij {
    public static final Parcelable.Creator CREATOR = new jri(11);

    /* JADX INFO: renamed from: a */
    public final int f34693a;

    /* JADX INFO: renamed from: b */
    public final String f34694b;

    public jrx(int i, String str) {
        this.f34693a = i;
        this.f34694b = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof jrx)) {
            return false;
        }
        jrx jrxVar = (jrx) obj;
        return this.f34693a == jrxVar.f34693a && Objects.equals(this.f34694b, jrxVar.f34694b);
    }

    public final int hashCode() {
        return Objects.hash(Integer.valueOf(this.f34693a), this.f34694b);
    }

    public final String toString() {
        String str;
        int i = this.f34693a;
        switch (i) {
            case -9:
                str = "Migration was cancelled";
                break;
            case -8:
                str = "Another migration is already in progress";
                break;
            case -7:
                str = "Connect message malformed";
                break;
            case -6:
                str = "Migration status mismatch between watch and phone";
                break;
            case -5:
                str = "Phone switching feature disabled";
                break;
            case -4:
                str = "Did not receive connect msg";
                break;
            case -3:
                str = "No bluetooth connection";
                break;
            case -2:
                str = "Accounts mismatch";
                break;
            case LensApi.LensAvailabilityStatus.LENS_AVAILABILITY_UNKNOWN /* -1 */:
                str = "Unknown failure";
                break;
            case 0:
                str = "Connected";
                break;
            case 1:
                str = "Connection handshake in progress";
                break;
            case 2:
                str = "Connection handshake complete";
                break;
            case 3:
                str = "Sync with old node suspended";
                break;
            case 4:
                str = "Control plane transport connected";
                break;
            case 5:
                str = "Accounts Matched";
                break;
            case 6:
                str = "Association to watch terminated";
                break;
            default:
                str = "Unrecognized state value: " + i;
                break;
        }
        return String.format("ConnectionStateEvent: address: %s, state: %s", this.f34694b, str);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iM13281h = jiy.m13281h(parcel);
        jiy.m13287n(parcel, 1, this.f34693a);
        jiy.m13296w(parcel, 2, this.f34694b);
        jiy.m13283j(parcel, iM13281h);
    }
}
