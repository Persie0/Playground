package p000;

import android.content.Intent;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.lens.sdk.LensApi;

/* JADX INFO: renamed from: pv */
/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class C0917pv implements Parcelable {
    public static final Parcelable.Creator CREATOR = new ats(1);

    /* JADX INFO: renamed from: a */
    public final int f47455a;

    /* JADX INFO: renamed from: b */
    public final Intent f47456b;

    public C0917pv(int i, Intent intent) {
        this.f47455a = i;
        this.f47456b = intent;
    }

    public C0917pv(Parcel parcel) {
        this.f47455a = parcel.readInt();
        this.f47456b = parcel.readInt() == 0 ? null : (Intent) Intent.CREATOR.createFromParcel(parcel);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final String toString() {
        String strValueOf;
        StringBuilder sb = new StringBuilder();
        sb.append("ActivityResult{resultCode=");
        int i = this.f47455a;
        switch (i) {
            case LensApi.LensAvailabilityStatus.LENS_AVAILABILITY_UNKNOWN /* -1 */:
                strValueOf = "RESULT_OK";
                break;
            case 0:
                strValueOf = "RESULT_CANCELED";
                break;
            default:
                strValueOf = String.valueOf(i);
                break;
        }
        sb.append(strValueOf);
        sb.append(", data=");
        sb.append(this.f47456b);
        sb.append('}');
        return sb.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.f47455a);
        parcel.writeInt(this.f47456b == null ? 0 : 1);
        Intent intent = this.f47456b;
        if (intent != null) {
            intent.writeToParcel(parcel, i);
        }
    }
}
