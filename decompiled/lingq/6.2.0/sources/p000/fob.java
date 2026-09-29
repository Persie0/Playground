package p000;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.api.ApiMetadata;
import com.google.android.gms.common.api.ComplianceOptions;

/* JADX INFO: loaded from: classes2.dex */
public abstract class fob implements Parcelable.Creator {
    /* JADX INFO: renamed from: a */
    public static final ApiMetadata m11968a(Parcel parcel) {
        int iM17129k0 = AbstractC3352my.m17129k0(parcel);
        boolean zM17099R = false;
        ComplianceOptions complianceOptions = null;
        while (parcel.dataPosition() < iM17129k0) {
            int i = parcel.readInt();
            char c = (char) i;
            if (c == 1) {
                complianceOptions = (ComplianceOptions) AbstractC3352my.m17137p(parcel, i, ComplianceOptions.CREATOR);
            } else if (c != 2) {
                AbstractC3352my.m17113c0(parcel, i);
            } else {
                zM17099R = AbstractC3352my.m17099R(parcel, i);
            }
        }
        AbstractC3352my.m17145x(parcel, iM17129k0);
        return new ApiMetadata(complianceOptions, zM17099R);
    }
}
